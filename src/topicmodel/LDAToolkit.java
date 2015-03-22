package topicmodel;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LDAToolkit {
	
	private static String getWorkingDir(String filename){
		int place = filename.lastIndexOf("/");
		System.out.println(place);
		if(place != -1)
			return filename.substring(0, place);
		else
			return "";
	}
	
	public static ArrayList<String> getTopicWords(LDAKernel ldak, int which){
		int s = ldak.getSaveStep();
		int i = ldak.getNIters();
		int times = i / s;
		if(which > times){
			System.out.println("Only saved for " + Integer.toString(times) + " times");
			return null;
		}
		/*
		int iters =  which * s;
		String name = "";
		if(iters / 100 == 0)
			name = "000" + Integer.toString(iters);
		else if(iters / 1000 == 0)
			name = "00" + Integer.toString(iters);
		else if(iters / 10000 == 0)
			name = "0" + Integer.toString(iters);
		else
			name = Integer.toString(iters);
		String inputFile = ldak.getDfile();
		String dir = getWorkingDir(inputFile);
		String filename = dir + "/model-" + name + ".twords";
		
		File infile = null;
		Scanner sc = null;
		ArrayList<> array = null;
		try{
			infile = new File(filename);
			sc = new Scanner(infile);
			String content1, content2;
			while(true){
				content1 = sc.next();
				if(content1 == null)
					break;
				if(content1.equals("Topic")){
					content2 = sc.next();
					continue;
				}
				content2 = sc.next();
				
			}
		}catch(IOException e){
			System.out.println(e);
		}finally{
			sc.close();
			return array;
		}
        */
	}
	
	public static void main(String[] args){
		String filename = "bin/data.txt";
	}
}
