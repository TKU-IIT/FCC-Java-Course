package hw1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cc = findCrowdedGrids(new File("/home/min20120907/eclipse-workspace/hw1/src/hw1/Test.txt"));
		for(int i[] : cc) {
			System.out.print("Coord: ");
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static @SuppressWarnings("unchecked")
public static int[][] findCrowdedGrid(File coordinates_file) {
	    ArrayList<ArrayList<Integer>> tmp_coords = new ArrayList<ArrayList<Integer>>();
	    int lines =0;
	    try {
	        Scanner s = new Scanner(coordinates_file);
	        while(s.hasNextLine()){
	           lines++;
		       s.nextLine();
	        }
	          s.close();
	          Scanner s1 = new Scanner(coordinates_file);
	          for(int i = 0;i<lines;i++) {
	              tmp_coords.add(new ArrayList<Integer>());
	               for(int j = 0;j<2;j++) {
		               tmp_coords.get(i).add(s1.nextInt());
	               }
	          }
	            
	            
	            int[][] array = new int[tmp_coords.size()][];
	    		for (int i = 0; i < tmp_coords.size(); i++) {
	    		    List<Integer> row = tmp_coords.get(i);
	    		    array[i] = toIntArray(row);
	    		}
	    		
	    		Set hs = new HashSet(tmp_coords);
	    		if(hs.size()==tmp_coords.size())
	    		    return null;
	    		ArrayList<ArrayList<Integer>> clist = new ArrayList<ArrayList<Integer>>(hs);
	    		ArrayList<ArrayList<Integer>> crowded = new ArrayList<ArrayList<Integer>>()
;	    		for(ArrayList<Integer> i : clist) {
	    			int cnt = 0;
	    			int step = 0;
	    			for(ArrayList<Integer> j : tmp_coords) {
	    				step++;
	    				if(i.equals(j)) {
	    					cnt++;
	    					
	    				}
	    			}
	    			if(cnt>=3) {
	    				crowded.add(i);
	    			}
	    		}
	    		int[][] array2 = new int[crowded.size()][];
	    		for (int i = 0; i < crowded.size(); i++) {
	    		    List<Integer> row = crowded.get(i);
	    		    array2[i] = toIntArray(row);
	    		}
	            return array2;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	 public static int[] toIntArray(List<Integer> list)  {
	    int[] ret = new int[list.size()];
	    int i = 0;
	    for (Integer e : list)  
	        ret[i++] = e;
	    return ret;
	}

	
	}

