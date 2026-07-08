package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSuperFansTreasureBoxDataResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("extra")
        public Extra extra;

        @C09CT("max_limit_stock")
        public long maxLimitStock;

        @C09CT("special_account")
        public int specialAccount;

        @C09CT("special_room_type")
        public int specialRoomType;

        @C09CT("stock")
        public long stock;

        @C09CT("treasure_box_pkg_info")
        public List<SuperFanPackage> treasureBoxPkgInfo = new ArrayList();

        @C09CT("treasure_box_recommend_list")
        public List<Long> treasureBoxRecommendList = new ArrayList();
    }

    public static final class Extra {

        @C09CT("is_sandbox")
        public boolean isSandbox;
    }
}
