package webcast.api.ranklist_class;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TileRedeemConfig {

    @C09CT("creator_class")
    public List<Integer> creatorClass = new ArrayList();

    @C09CT("redeem_level")
    public List<RedeemLevel> redeemLevel = new ArrayList();

    public static final class RedeemLevel {

        @C09CT("end_index")
        public long endIndex;

        @C09CT("reward_tiles")
        public long rewardTiles;

        @C09CT("start_index")
        public long startIndex;
    }
}
