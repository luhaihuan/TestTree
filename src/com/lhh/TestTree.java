package com.lhh;

import java.io.IOException;
import java.math.BigDecimal;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;

public class TestTree {
	public static void main(String[] args) {
		System.out.println(0.01+0.04);
		try {
		    UIManager
		      .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		   // SwingUtilities.updateComponentTreeUI(this); //зЂвт
		   } catch (Exception ex) {
			   ex.printStackTrace();
		   }
		JFrame jframe = new JFrame();
		jframe.setSize(200, 200);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("node1");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("node2");
		root.add(node1);
		node1.add(node2);
		JTree tree = new JTree(root);
		tree.setRootVisible(true);
		jframe.getContentPane().add(new JScrollPane(tree));
		jframe.setVisible(true);
		
	}

}
