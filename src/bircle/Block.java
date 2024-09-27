

public class Block {
    enum BlockType{
        EMPTY,
        EDGE,
        SELECTED,
        BEACON,
        CENTER
    }
    public int x;
    public int y;
    public BlockType type;

    public Block(int x, int y, BlockType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public double getYaw(){
        return (y - /*player y*/)/(x - /*player x*/);
    }
}