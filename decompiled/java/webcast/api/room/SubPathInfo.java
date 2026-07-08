package webcast.api.room;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SubPathInfo {

    @C09CT("delay_time")
    public long delayTime;

    @C09CT("query_params")
    public Map<String, String> queryParams = new LinkedHashMap();

    @C09CT("body_params")
    public String bodyParams = "";

    @C09CT("method")
    public String method = "";

    @C09CT("content_type")
    public String contentType = "";
}
