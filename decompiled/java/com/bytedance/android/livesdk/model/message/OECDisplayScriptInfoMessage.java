package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OECDisplayScriptInfoMessage extends AbstractC1136060ffY {

    @C09CT("collapsable")
    public boolean collapsable;

    @C09CT("da_info_map")
    public Map<String, String> daInfoMap;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("product_id")
    public String productId;

    @C09CT("script")
    public String script;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("title")
    public String title;

    public OECDisplayScriptInfoMessage() {
        this.type = C001A.O_E_C_DISPLAY_SCRIPT_INFO_MESSAGE;
        this.productId = "";
        this.title = "";
        this.script = "";
        this.daInfoMap = new LinkedHashMap();
    }
}
