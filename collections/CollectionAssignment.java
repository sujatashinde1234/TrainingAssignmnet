package com.sujata.assignment.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CollectionAssignment 
{
	public static void CollectionsInAscending()
	{
		List<Integer> arr=new ArrayList<Integer>();
		arr.add((23));
		arr.add(56);
		arr.add((67));
		arr.add((89));
		arr.add((54));
		arr.add(9);
		arr.add(77);
		
		System.out.println(" Array elements is::"+arr);
		Collections.sort(arr);
		Iterator i=arr.iterator();
		System.out.println("Sorted Collections elements In Ascending Order::");
		while(i.hasNext())
		{
			System.out.print(" "+i.next());
		}
		System.out.println(" ");
		
		
		
	}
	public static void BinarySearch()
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(23);
		arr.add(45);
		arr.add(67);
		arr.add(78);
		arr.add(89);
		arr.add(54);
		System.out.println("Array element is::"+arr);
		int index=Collections.binarySearch(arr,45);
		System.out.println(index);
	}

	public static void RemoveDuplicates()
	{
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(23);
		arr.add(45);
		arr.add(67);
		arr.add(89);
		arr.add(90);
		arr.add(55);
		arr.add(55);
		System.out.println(arr);
		Set<Integer> I=new LinkedHashSet<Integer>(arr);
		System.out.println(I);
		
		
	}
	public static void DescendingOrder()
	{
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(23);
		arr.add(45);
		arr.add(67);
		arr.add(89);
		arr.add(90);
		arr.add(55);
		arr.add(55);
		System.out.println("Array elements::"+arr);
		Collections.sort(arr);
		Collections.reverse(arr);
		System.out.println("Reverse Order Array is::"+arr);
		Set<Integer> I=new LinkedHashSet<Integer>(arr);
		System.out.println("Remove Duplicates From Array::"+I);
	}
	public static void main(String[] args) 
	{
		CollectionAssignment.CollectionsInAscending();
		CollectionAssignment.BinarySearch();
		CollectionAssignment.RemoveDuplicates();
		CollectionAssignment.DescendingOrder();

	}

}
