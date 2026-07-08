package tikcast.api.wallet;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RedirectDetails {

    @C09CT("body")
    public Map<String, String> body = new LinkedHashMap();

    @C09CT("header")
    public Map<String, String> header = new LinkedHashMap();

    @C09CT("method")
    public String method = "";

    @C09CT("url")
    public String url = "";
}
