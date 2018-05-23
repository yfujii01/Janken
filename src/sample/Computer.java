package sample;

import java.util.ArrayList;

public class Computer{

	//�R���s���[�^�[�̃O�[
	private int rock_cp;

	//�R���s���[�^�[�̃p�[
	private int paper_cp;

	//�R���s���[�^�[�̃`���L
	private int scissors_cp;

	//�v���C���[�̃O�[�𐔂���ϐ�
    private double rock_count;

    //�v���C���[�̃p�[�𐔂���ϐ�
	private double paper_count;

	//�v���C���[�̃`���L�𐔂���ϐ�
	private double scissors_count;

	//�z��̗v�f��
	private int count;

	//�l�Ԃ̏o�������ۑ����Ă����z��
	//private int[] data = new int[1000];

	//�l�Ԃ̏o�������ۑ����Ă������X�g
	private ArrayList<Integer> list = new ArrayList<Integer>();


	/**
	 * �R���X�g���N�^
	 * @param rock_cp
	 * @param paper_cp
	 * @param scissors_cp
	 */
	public Computer(int rock_cp, int paper_cp, int scissors_cp){
		this.rock_cp = rock_cp;
		this.paper_cp = paper_cp;
		this.scissors_cp = scissors_cp;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return cp�̃O�[�̒l
	 */
	public int getRock_cp() {
		return rock_cp;
	}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param rock_cp
	 */
	public void setRock_cp(int rock_cp) {
		this.rock_cp = rock_cp;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return cp�̃p�[�̒l
	 */
	public int getPaper_cp() {
		return paper_cp;
	}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param paper_cp
	 */
	public void setPaper_cp(int paper_cp) {
		this.paper_cp = paper_cp;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return cp�̃`���L�̒l
	 */
	public int getScissors_cp() {
		return scissors_cp;
	}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param scissors_cp
	 */
	public void setScissors_cp(int scissors_cp) {
		this.scissors_cp = scissors_cp;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return int�^�z�� data
	 */
	//public int[] getData() {
	//	return data;
	//}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param data
	 */
	//public void setData(int[] data) {
	//	this.data = data;
	//}


	/**
	 * �Q�b�^�[���\�b�h
	 * @return Integer�^�̃��X�g
	 */
	public ArrayList<Integer> getList() {
		return list;
	}

	/**
	 * cp���o������񂯂�̎�
	 * @return cp�̎�
	 */
	public int pc_turn(){

		//������������ϐ�
		int rock, paper, scissors, random;

		//�z��̒��g�𒲂ׂ�
		for(int i = 0; i < list.size(); i++){

			if(list.get(i) == 1){
				rock_count++;
				count++;
			}else if(list.get(i) == 2){
				paper_count++;
				count++;
			}else if(list.get(i) == 3){
				scissors_count++;
				count++;
			}else{
				break;
			}

		}

		//�O�[�̊���
		rock = (int)Math.round((rock_count / count) * 100);

		//�p�[�̊���
		paper = (int)Math.round((paper_count / count) * 100);

		//�`���L�̊���
		scissors = (int)Math.round((scissors_count / count) * 100);

		//��ԑ��������̎��Ԃ�
		if((rock < paper) && (scissors < paper)){
			rock_count = 0;
			paper_count = 0;
			scissors_count = 0;
			return 3;
		}else if((paper < rock) && (scissors < rock)){
			rock_count = 0;
			paper_count = 0;
			scissors_count = 0;
			return 2;
		}else if((paper < scissors) && (rock < scissors)){
			rock_count = 0;
			paper_count = 0;
			scissors_count = 0;
			return 1;
		}else{
			random = (int)(Math.random() * 3) + 1;
		}

		rock_count = 0;
		paper_count = 0;
		scissors_count = 0;
		return random;





	}



}
