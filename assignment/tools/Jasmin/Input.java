import java.io.*;
class Input
{
	static final int f = 5;
	static int i;
	static final int a[] = new int[5];
	static class _A{
		static int g;
		static class _B{
			static void B(){
				g = 1;
				System.out.print(g);
			}
		}
		static int A(int x){
			System.out.print(i);
			return x;
		}
	}
        public static void main(String args[])
        {
		_A.A(5);

	}

}
