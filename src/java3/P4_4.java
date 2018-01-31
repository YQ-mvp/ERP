package java3;
public class P4_4 
{
	static final int SIZE=10;
	static void shellSort(int[] a)  //Shell排序(希尔排序)
	{
	    int i,j,h;
	    int r,temp;
		int x=0;

	    for(r=a.length/2;r>=1;r/= 2)						//划组排序
		{
	    	for(i=r;i<a.length;i++){
	    		temp=a[i];
	    		j=i-r;
	    		while(j>=0&&temp<a[j]){
	    			a[j+r]=a[j];
	    			j-=r;
	    		}
	    		a[j+r]=temp;
	    	}

			x++;
			System.out.print("第"+x+"步排序结果:");			//输出每步排序结果
			for(h=0;h<a.length;h++)
			{
				System.out.print(" "+a[h]);				
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args)
	{
		int[] shuzu=new int[SIZE];
		int i;
		for(i=0;i<SIZE;i++)
		{
			shuzu[i]=(int)(100+Math.random()*(100+1));			
		}
		System.out.print("排序前的数组：\n");				
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");
		}
		System.out.print("\n");
		
		shellSort(shuzu);					
		
		System.out.print("排序后的数组：\n");
		for(i=0;i<SIZE;i++)
		{
			System.out.print(shuzu[i]+" ");
		}
		System.out.print("\n");

	}

}
