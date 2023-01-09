package com.gl.main;

import java.util.Scanner;
import com.gl.driver.MergeSort;
import com.gl.driver.NotesCount;


public class Main {

	public static void main(String args[]) {
		
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Enter the size of currency denominations: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		
		System.out.println("Enter the denominations");
		
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		mergeSort.sort(notes,  0, notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
	}

}
