package webcast.api.sub;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class PaymentTipsInfo {

    @C09CT("description")
    public String description = "";

    @C09CT("cta_text")
    public String ctaText = "";

    @C09CT("cta_schema")
    public String ctaSchema = "";

    @C09CT("et_params")
    public Map<String, String> etParams = new LinkedHashMap();
}
