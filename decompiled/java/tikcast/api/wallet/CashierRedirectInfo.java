package tikcast.api.wallet;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CashierRedirectInfo {

    @C09CT("commute_type")
    public int commuteType;

    @C09CT("body")
    public Map<String, String> body = new LinkedHashMap();

    @C09CT("header")
    public Map<String, String> header = new LinkedHashMap();

    @C09CT("method")
    public String method = "";

    @C09CT("url")
    public String url = "";

    @C09CT("h5_redirect_url")
    public String h5RedirectUrl = "";

    @C09CT("deeplink")
    public String deeplink = "";
}
