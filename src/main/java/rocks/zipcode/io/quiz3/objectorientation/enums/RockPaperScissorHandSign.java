package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    SCISSOR,
    PAPER,
    ROCK;




    public RockPaperScissorHandSign getWinner() {
//        System.out.println( RockPaperScissorHandSign.PAPER );

        if (RockPaperScissorHandSign.PAPER == SCISSOR){
            System.out.println("ssss");
            return PAPER;
        }

        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        if(SCISSOR.equals(this)){
            return PAPER;
        }

        return null;
    }
}
