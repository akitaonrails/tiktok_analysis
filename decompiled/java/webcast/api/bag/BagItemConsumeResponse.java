package webcast.api.bag;

import X.C09CT;
import webcast.data.BagItemPreUpdateInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BagItemConsumeResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("available")
        public boolean available;

        @C09CT("battle_id")
        public long battleId;

        @C09CT("count")
        public long count;

        @C09CT("item_id")
        public long itemId;

        @C09CT("item_type")
        public int itemType;

        @C09CT("min_expire_at")
        public long minExpireAt;

        @C09CT("pre_update_info")
        public BagItemPreUpdateInfo preUpdateInfo;
    }

    public static final class Extra {
    }
}
