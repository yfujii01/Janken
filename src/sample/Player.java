package sample;

public class Player {

	//�O�[
	private int rock;

	//�`���L
	private int paper;

	//�p�[
	private int scissors;

	/**
	 * �R���X�g���N�^
	 * @param rock �O�[�̒l
	 * @param paper �p�[�̒l
	 * @param scissors �`���L�̒l
	 */
	public Player(int rock, int paper, int scissors){
		this.rock = rock;
		this.paper = paper;
		this.scissors = scissors;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return �O�[�̒l
	 */
	public int getRock() {
		return rock;
	}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param rock
	 */
	public void setRock(int rock) {
		this.rock = rock;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return �p�[�̒l
	 */
	public int getPaper() {
		return paper;
	}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param paper
	 */
	public void setPaper(int paper) {
		this.paper = paper;
	}

	/**
	 * �Q�b�^�[���\�b�h
	 * @return �`���L�̒l
	 */
	public int getScissors() {
		return scissors;
	}

	/**
	 * �Z�b�^�[���\�b�h
	 * @param scissors
	 */
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}






}
