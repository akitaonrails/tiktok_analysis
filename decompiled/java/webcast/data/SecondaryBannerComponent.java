package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SecondaryBannerComponent {

    @C09CT("has_close_button")
    public boolean hasCloseButton;

    @C09CT("target_bottom_item_type")
    public int targetBottomItemType;

    @C09CT("type")
    public int type;

    @C09CT("schema")
    public String schema = "";

    @C09CT("title_text")
    public String titleText = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("tux")
    public String tux = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();

    @C09CT("track_extra")
    public Map<String, String> trackExtra = new LinkedHashMap();
}
