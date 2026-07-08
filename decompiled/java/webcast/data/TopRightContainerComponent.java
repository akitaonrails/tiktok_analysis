package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class TopRightContainerComponent {

    @C09CT("type")
    public int type;

    @C09CT("schema")
    public String schema = "";

    @C09CT("tux_url")
    public String tuxUrl = "";

    @C09CT("gecko_key")
    public String geckoKey = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("text")
    public String text = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();

    @C09CT("track_extra")
    public Map<String, String> trackExtra = new LinkedHashMap();
}
