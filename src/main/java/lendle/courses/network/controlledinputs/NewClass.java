/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.controlledinputs;
public class NewClass
{
	public static void main(String[] args)
        {
		int[] a = {1,4,6,8,9,2,5,7,0,3,21,63,87,45,34,26,90};
		
		sort(a);
		for(int c : a)
			System.out.print(c+" ");
		System.out.println();
	}
	
	public static void sort(int[] a)
        {
            int count1 = 0;
            int count2 = 0;
		for(int i = 0;i<a.length-1;i++)
                {
                    for(int j = i+1;j>0;j--)
                    {
                        if(a[j]<a[j-1])
                        {
                            int s;
                            s = a[j]; 
                            a[j] = a[j-1];
                            a[j-1] = s;
                            
                        }
                        count2++;
                    }
                    count1++;
                }
            System.out.printf("%d\n",count1);
            System.out.printf("%d\n",count2);
	}
}
