public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to my minimax algorithm");
        boolean end = false;
        int val = 25;
        boolean first = true;
        while(!end) {
            System.out.println("Current position = "+ val +", Player one: " + first);
            Minimax.State s = new Minimax.State(val, true);
            Minimax.State decision = Minimax.minimaxDecision(s);
            val = decision.state;
            if(decision.isTerminal()){
                end = true;
                System.out.println("Current position = "+ val +", Player one won: " + first);
                System.out.println("Game over");
            }
            first =! first;
        }
    }
}