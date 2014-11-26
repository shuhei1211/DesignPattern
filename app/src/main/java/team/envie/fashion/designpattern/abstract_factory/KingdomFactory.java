package team.envie.fashion.designpattern.abstract_factory;

/**
 * Created by shuhe_000 on 2014/10/29.
 */
public interface KingdomFactory {

    /**
     *
     * @return
     */
    Castle createCastle();

    /**
     *
     * @return
     */
    King createKing();

    /**
     *
     * @return
     */
    Army createArmy();
}
