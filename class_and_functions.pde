

int[][] arr_B(int[][] list_of,int who){
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

void cell_A(int[][] a){
 for(int j=0;j<c;j++){
   for(int k=0;k<r;k++){
 if(a[k][j]==1){fill(250,0,0);}else
 {fill(0,250,0);}
 rect(5*k,5*j,5,5);

   }
 }
}

int rulestate(int k,int j,int[][] a,int[][] list_of,int who){
  int left=a[k-1][j-1];
  int mid=a[k][j-1];
  int right=a[k+1][j-1];
  return rules(left,mid,right,list_of,who);
}

int rules(int a, int b,int c,int[][] list_of,int who){

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



int [][] list={{1,1,0,0,1,1,1,0},{1,0,1,0,1,1,0,1},{1,0,0,1,1,0,1,0},{1,0,0,1,1,0,1,1}};
