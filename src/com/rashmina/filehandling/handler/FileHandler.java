/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rashmina.filehandling.handler;

import com.rashmina.filehandling.handler.operations.FileOperations;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.net.URLConnection;

/**
 *
 * @author Rashu
 */
public class FileHandler {

    private Scanner input;
    FileOperations fo = new FileOperations();
   

    public FileHandler(Scanner input) {
        this.input = input;
    }

    private void menu() {

        System.out.println("1.File Writer:");
        System.out.println("2.File Reader:");
        System.out.println("3.Buffered Reader:");
        System.out.println("4.Read content from URL:");
        System.out.println("5.Read URL from file, convert into html to access it::");
        System.out.println("6.Extract image:");
        System.out.println("7.Exit:");
        System.out.println("Enter your choice[1-7]:");
    }

    public void process() {
        while (true) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    fo.fileWrite();
                    break;
                    
                case 2:
                    fo.fileRead();
                    break;

                case 3:
                    fo.bufferedReader();
                    break;

                case 4:
                    fo.readUrlContent();
                    break;

                case 5:
                    fo.readUrl_file_html();
                    break;
                    
                case 6:
                    fo.extractImage();
                    break;

                case 7:
                    System.out.println("Do you really wanna exit?[y/n]");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }
                    break;

            }
            System.out.println("");
            System.out.println("=================================");
        }

    }
}
