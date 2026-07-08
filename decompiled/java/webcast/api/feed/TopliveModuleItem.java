package webcast.api.feed;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TopliveModuleItem {

    @C09CT("match_degree")
    public int matchDegree;

    @C09CT("related_live_num")
    public long relatedLiveNum;

    @C09CT("room")
    public Room room;

    @C09CT("item_id")
    public String itemId = "";

    @C09CT("item_name")
    public String itemName = "";

    @C09CT("sub_items")
    public List<TopliveModuleItem> subItems = new ArrayList();

    @C09CT("enter_method")
    public String enterMethod = "";

    @C09CT("light_bg_color")
    public String lightBgColor = "";

    @C09CT("dark_bg_color")
    public String darkBgColor = "";
}
