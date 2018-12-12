package edu.agh.cs.jtplab.lab3.interfejs_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public void compare()
    {
        List<Integer> x = new LinkedList<Integer>();
		List<Integer> x2 = new ArrayList<Integer>();
		List<Integer> x3 = new ArrayList<Integer>(10000000);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			x.add(0);
		}
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println((double) estimatedTime * 0.001 + " => LinkedList");
		startTime = System.currentTimeMillis();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			x2.add(0);
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println((double) estimatedTime * 0.001 + " => ArrayList");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			x3.add(0);
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println((double) estimatedTime * 0.001 + " =>ArrayList(10000000)");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			x3.remove(i);
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println((double) estimatedTime * 0.001 + " => ArrayList(10000000)");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			x2.remove(i);
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println((double) estimatedTime * 0.001 + " => ArrayList");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			x.remove(i);
		}
		estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println((double) estimatedTime * 0.001 + " => LinkedList");

    }
}
