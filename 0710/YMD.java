import java.util.Scanner;

class YMD {
   int y;
   int m;
   int d;

   static int[][] mdays = {
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
   };

   static int isLeap(int year) {
      return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
   }

   YMD(int y, int m, int d) {
      this.y = y;
      this.m = m;
      this.d = d;
   }

   YMD after(int n) {
      YMD temp = new YMD(this.y, this.m, this.d);
      if (n < 0)
         return (before(-n));

      temp.d += n;

      while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
         temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
         if (++temp.m > 12) {
            temp.y++;
            temp.m = 1;
         }
      }
      return temp;
   }

   YMD before(int n) {
      YMD temp = new YMD(this.y, this.m, this.d);
      if (n < 0)
         return (after(-n));

      temp.d -= n;

      while (temp.d < 1) {
         if (--temp.m < 1) {
            temp.y--;
            temp.m = 12;
         }
         temp.d += mdays[isLeap(temp.y)][temp.m - 1];
      }
      return temp;
   }


