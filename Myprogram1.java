class Myprogram1{
public static void main(String[] args){
int[][] room=new int[2][3];
room[0][0]=101;
room[0][1]=102;
room[0][2]=103;
room[1][0]=104;
room[1][1]=105;
room[1][2]=106;
for(int i=0;i<room.length;i++)
for(int j=0;j<room[0].length;j++)
{
System.out.print(room[i][j]);
System.out.print(" ");
}
}
}