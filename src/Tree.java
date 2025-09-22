import java.util.ArrayList;
import java.util.List;

public class Tree {
    // We recommend attempting this class last, as it hasn't been scaffolded for your team.
    // Even if your team doesn't have time to implement this class, it is a useful exercise
    // to think about how you might split up the work to get the Tree and TreeMultiSet
    // implemented.
    private Integer root;
    private List<Tree> subtrees;

    public Tree(Integer root, List<Tree> subtrees) {
    //standard constructor
        this.root = root;
        this.subtrees = subtrees;
    }
    public Tree(Integer root) {
    // overloaded method for a tree with no subtrees
        this.root = root;
        this.subtrees = new ArrayList<>();
    }
    public Tree() {
    //overloaded method for a tree with no root. as stated in the preconditions, subtrees will also be empty.
        this.root = null;
        this.subtrees = new ArrayList<>();
    }
    public Boolean isEmpty() {
        return root == null;
    }

}
