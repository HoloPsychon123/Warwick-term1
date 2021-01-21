public class ScoreBoard {
    private String boardname;
    private int size;  //(A,100) (B,88) * * * size=5,numOfStudents=2
    private int numOfStudents;
    private Student[] board; //array [] a series of students
    //board: |(A,100) (B,88) (D,60) (E,30) * *| board[0]:(A,100), board[1]:(B,88)

    //constructor
    ScoreBoard(String name, int size) {
        this.boardname = name;
        this.size = size;
        this.numOfStudents = 0;
        this.board = new Student[size];
        //int a = 3;
        //int[] b = new int[3];
    }

    //get function
    public String getBoardName() {
        return this.boardname;
    }

    //addStudents |(C,70)|
    //board: |(A,100) (B,88) (D,60) (E,30) * *| board[0]:(A,100), board[1]:(B,88)
    public boolean addStudents(Student a) {
        if(this.numOfStudents >= this.size) {
            return false;
        }

        // find position to insert
        int position = 0;
        for(int i = 0; i < this.numOfStudents; i++) {
            if(a.score < this.board[i].score) {
                position++;
            }
            else {
                break;
            }
        }

        // move to give spare space
        // 4 3 2
        for(int i = numOfStudents - 1 + 1; i > position; i--) {
            this.board[i] = this.board[i-1];
        }
        //System.out.println("begin to insert "+ position + " with " + a.name + " " + a.score);
        // add student a to position
        this.board[position] = a;
        this.numOfStudents++;
        return true;
    }

    // board: |(A,100) (B,88) (C,70) (D,60) (E,30) *| board[0]:(A,100), board[1]:(B,88)
    // remove (B,88) <<<<---- Sboard.removeStudent(1)
    public Student removeStudent(int index) {
        if(index >= numOfStudents) {
            return null;
        }
        Student temp = this.board[index];
        int position = index + 1;
        while(position < numOfStudents) {
            this.board[position - 1] = this.board[position];
            position++;
        }
        numOfStudents--;
        return temp;
    }

    public void printBoard() {
        System.out.println(this.boardname);
        for(int i = 0; i < numOfStudents; i++) {
            System.out.println(this.board[i].name + " : " + this.board[i].score);
        }
    }

    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard("grade1",6);
        Student s1 = new Student("A",100);

        board.addStudents(s1);

        Student s2 = new Student("E",30);
        board.addStudents(s2);

        Student s3 = new Student("D",60);
        board.addStudents(s3);

        board.printBoard();

        Student a = board.removeStudent(0);

        System.out.println("After removing " + a.name);
        board.printBoard();
    }
}
