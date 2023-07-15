
public class TheCubeMystery {
	public static int cubeNumber(int num)
	{
		int cube = 1;
		for(int i=0;i<num;i++)
		{
			cube = cube*num;
		}
		return cube;
	}
}
