package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TouchPointData {

    @C09CT("style_id")
    public long styleId;

    @C09CT("tp_id")
    public long tpId;

    @C09CT("min_version")
    public String minVersion = "";

    @C09CT("max_version")
    public String maxVersion = "";

    @C09CT("log_extra")
    public Map<String, String> logExtra = new LinkedHashMap();

    @C09CT("tp_name")
    public String tpName = "";

    @C09CT("meta_data")
    public String metaData = "";

    @C09CT("style_name")
    public String styleName = "";

    @C09CT("entry_data")
    public String entryData = "";
}
