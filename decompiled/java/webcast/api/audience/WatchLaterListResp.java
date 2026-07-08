package webcast.api.audience;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchLaterListResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("version_code")
        public long versionCode;

        @C09CT("watch_later_list")
        public List<Item> watchLaterList = new ArrayList();
    }

    public static final class Item {

        @C09CT("anchor_id")
        public long anchorId;

        @C09CT("room_id")
        public long roomId;
    }
}
