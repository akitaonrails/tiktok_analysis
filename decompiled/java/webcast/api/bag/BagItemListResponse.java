package webcast.api.bag;

import X.C09CT;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import java.util.List;
import webcast.data.BagItem;
import webcast.data.Group;

/* JADX INFO: loaded from: classes18.dex */
public final class BagItemListResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("groups")
        public List<Group> groups;

        @C09CT("items")
        public List<BagItem> items;

        @C09CT("page_instruction")
        public GiftPanelBanner pageInstruction;

        @C09CT("show_entrance")
        public boolean showEntrance;
    }

    public static final class Extra {
    }
}
