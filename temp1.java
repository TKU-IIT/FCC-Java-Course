
public class temp1{
	public static void main(String args[]){
		double temp[][] = {
			{18.2, 17.3, 15.0, 13.4},
			{23.8, 25.1, 20.6, 17.8},
			{20.6, 21.5, 18.4, 15.7}};

		for(int a = 0; a < 3; a++){
			for(int b = 0; b < 4; b++){
				System.out.print(temp[a][b]+"\t");
			}
			System.out.println();
		}

		double avr[]={0,0,0,0};
        for(int a = 0; a < 4; a++){
			for(int b = 0; b < 3; b++){
				avr[a]+=temp[b][a];
            }
                System.out.print(avr[a]/3+"\t");
		}
		System.out.println();
		double avr2[]={0,0,0};
        for(int a = 0; a < 3; a++){
			for(int b = 0; b < 4; b++){
				avr2[a]+=temp[a][b];
            }
            System.out.print(avr2[a]/4+"\t");
		}
		System.out.println();
		double max=temp[0][0], min=temp[0][0];
		for(int a = 0; a < 3; a++){
			for(int b = 0; b < 4; b++){
				if(temp[a][b]>max){
					max=temp[a][b];
				}
			}
		}
		for(int a = 0;a<3;a++){
			for(int b =0;b<4;b++){
				if(temp[a][b]<min){
					min=temp[a][b];
				}
			}
		}
			System.out.println(max);
			System.out.println(min);
		}
	

}
