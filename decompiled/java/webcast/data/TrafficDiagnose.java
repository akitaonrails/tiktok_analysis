package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TrafficDiagnose {

    @C09CT("type")
    public int type;

    @C09CT("viewer_added")
    public long viewerAdded;

    @C09CT("title")
    public String title = "";

    @C09CT("body")
    public String body = "";

    @C09CT("diagnose_params")
    public Map<String, String> diagnoseParams = new LinkedHashMap();
}
