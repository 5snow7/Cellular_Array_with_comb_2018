import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Cellular_Array_with_comb_2018 extends PApplet {

int r=250;int c=160;
int[][] list_of=new int[256][8];
public void setup(){
 //list_of=cells();
 rectMode(CENTER);
 //rotate(-PI/2);
 translate(10,10);
 //rotate(-PI/2);
 //for(int j=0;j<256;j++){

//for(int k=0;k<7;k++){
cell_A(arr_B(list,0));delay(5000);
cell_A(arr_B(list,1));
//delay(2000);}
 //text(list_of[j][k]+" ",5+5*j,10+10*k);
 //delay(2000);
 //background(0);
 //}}

}
/*
int[][] cells(){
 int[][] b=new int[256][8];int total=0;
 for(int j0=0;j0<2;j0++){
  for(int j1=0;j1<2;j1++){
  for(int j2=0;j2<2;j2++){
  for(int j3=0;j3<2;j3++){
  for(int j4=0;j4<2;j4++){
  for(int j5=0;j5<2;j5++){
  for(int j6=0;j6<2;j6++){
  //for(int j7=0;j7<256;j7++){
  for(int k=0;k<8;k++){
    b[j0+j1+j2+j3+j4+j5+j6][k]=(j0+j1+j2+j3+j4+j5+j6) % 2;
    //total++;
    }}}}}}}}//}


  return b;
}*/


public int[][] arr_B(int[][] list_of,int who){
 int[][] arr=new int[r][c];
 for(int j=0;j<c;j++){
   for(int k=0;k<r;k++){
  if((j==0||k==0)||(j==c-1||k==r-1)){
    arr[k][j]=0;if(k==r/2&&j==0){arr[k][j]=1;}}
    else{arr[k][j]=rulestate(k,j,arr,list_of,who);}//here is where will build rule function
  }
 }
 return arr;
}

public void cell_A(int[][] a){
 for(int j=0;j<c;j++){
   for(int k=0;k<r;k++){
 if(a[k][j]==1){fill(250,0,0);}else
 {fill(0,250,0);}
 rect(5*k,5*j,5,5);

   }
 }
}

public int rulestate(int k,int j,int[][] a,int[][] list_of,int who){
  int left=a[k-1][j-1];
  int mid=a[k][j-1];
  int right=a[k+1][j-1];
  return rules(left,mid,right,list_of,who);
}

public int rules(int a, int b,int c,int[][] list_of,int who){

       if(a==1&&b==1&&c==1){return list_of[who][0];}
 else if(a==1&&b==1&&c==0){return list_of[who][1];}
  else if(a==1&&b==0&&c==1){return list_of[who][2];}
  else if(a==1&&b==0&&c==0){return list_of[who][3];}
  else if(a==0&&b==1&&c==1){return list_of[who][4];}
  else if(a==0&&b==1&&c==0){return list_of[who][5];}
  else if(a==0&&b==0&&c==1){return list_of[who][6];}
  else if(a==0&&b==0&&c==0){return list_of[who][7];}

return 0;
}



int [][] list={{1,1,0,0,1,1,1,0},{1,0,1,0,1,1,0,1},{1,0,0,1,1,0,1,0},{1,0,0,1,1,0,1,1},
{0,0,1,1,0,1,0,1},{0,1,0,1,1,0,1,0},{1,0,0,1,0,0,1,1}};
  public void settings() {  size(1200,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Cellular_Array_with_comb_2018" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
