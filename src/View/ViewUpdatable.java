package View;

/**
 * Created by archimekai on 16/4/1.
 * 此接口说明了更新界面时提供的函数
 * 这些函数应该由controller调用
 */
public interface ViewUpdatable {

    /**
     * 当两个方块被消去时调用,需要被消去的两个方块的横纵坐标,用于绘制消去成功时的有关动画和声音
     *
     * @param rowBlock1
     * @param columnBlock1
     * @param rowBlock2
     * @param columnBlock2
     */
    public void didClearTwoBlocksSuccessful(int rowBlock1, int columnBlock1, int rowBlock2, int columnBlock2);


    /**
     * 用户消去两个方块,消去不成功时调用,需要被消去的两个方块的横纵坐标,用于绘制消去失败时的有关动画和声音
     *
     * @param rowBlock1
     * @param columnBlock1
     * @param rowBlock2
     * @param columnBlock2
     */
    public void didClearTwoBlocksUnsuccessful(int rowBlock1, int columnBlock1, int rowBlock2, int columnBlock2);
}
