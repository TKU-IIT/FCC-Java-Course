package hwk3;

import java.util.*;
public class HWK_EX5 {
	public static void main(String[] args){
            int[] data = {15, -9, 18, -1, 32, 7, -18, 32, -18, -1, 44} ;
            int[] pos = getPosArr(data) ;  // 將data[]中的正數儲存於一陣列後傳回
            Tools.printArr("Pos Number in data[]=", pos) ;
	}
	// DIY here, 實作getPosArr
	public static int[] getPosArr(int[] data) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int x:data) {
			if(x>0) {
				input.add(x);
			}
		}
		int[] output = new int[input.size()];
		for(int i = 0; i <output.length;i++) {
			output[i] = input.get(i);
		}
		return output;
	}
}
