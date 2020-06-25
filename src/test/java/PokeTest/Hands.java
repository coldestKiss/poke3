package PokeTest;

import java.util.Scanner;

public class Hands {
    char HuaSe[] = new char[5];
    int ShuZi[] = new int[5];

    void initShuZi(){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        char a[] = new char[5];
        for(int i=0;i<5;i++) {
            s = sc.next();

            a[i] = s.charAt(0);
            HuaSe[i] = s.charAt(1);

            if(a[i]=='T')
                ShuZi[i]=10;
            else if(a[i]=='J')
                ShuZi[i]=11;
            else if(a[i]=='Q')
                ShuZi[i]=12;
            else if(a[i]=='K')
                ShuZi[i]=13;
            else if(a[i]=='A')
                ShuZi[i]=14;
            else
                ShuZi[i]=a[i];
            }
    }

    int ifTongHua() {
        if(HuaSe[1]==HuaSe[2]&&HuaSe[1]==HuaSe[3]&&HuaSe[1]==HuaSe[4]&&HuaSe[1]==HuaSe[5])
            return 1;
        return 0;
    }

    int ifShunZi() {
        if(ShuZi==HuaSe2&&HuaSe==HuaSe3&&HuaSe==HuaSe4&&HuaSe==HuaSe5)
            return 1;
        return 0;
    }

    int ifSanTiao() {

        return 1;
    }

    int ifLiangDui() {

        return 1;
    }

    int ifDuiZi() {

        return 1;
    }
}
