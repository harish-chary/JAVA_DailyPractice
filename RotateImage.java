class Solution {
    public void rotate(int[][] matrix) {
        swap(matrix,matrix.length);
        transverse(matrix,matrix.length);
    }
    public void swap(int[][] m,int len) {
        for(int i=0;i<len/2;i++) {
            for(int j=0;j<len;j++) {
                int temp = m[i][j];
                m[i][j]=m[len-i-1][j];
                m[len-i-1][j]=temp;
            }
        }
    }
    public void transverse(int[][] arr, int len){
        for(int i=0;i<len;i++) {
            for(int j=i;j<len;j++) {
                if(i==j) continue;
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
 
