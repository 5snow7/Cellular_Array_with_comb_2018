int r=250;int c=160;
int[][] list_of=new int[256][8];
void setup(){
 size(1200,600);//list_of=cells();
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
