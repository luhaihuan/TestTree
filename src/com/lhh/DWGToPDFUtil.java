package com.lhh;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class DWGToPDFUtil {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser("d:/");
		//chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );  
		chooser.setSelectedFile(new File("d:/123.xls"));
		int result = chooser.showSaveDialog(new JFrame());
		if(result == JFileChooser.APPROVE_OPTION) {
			System.out.println(chooser.getSelectedFile());
		}
	}

}
