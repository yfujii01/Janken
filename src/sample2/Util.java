package sample2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {

	/**
	 * ����񂯂�̎����͂��郁�\�b�h
	 * @return ���͂��ꂽ�l
	 */
	public static int input(){
		int x;
		System.out.print("�O�[�A1�@�p�[�A2�@�`���L�A3");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
                String buf = br.readLine();
                x = Integer.parseInt(buf);
        }catch(Exception e){
                x = 0;
        }
        return x;
	}



}
