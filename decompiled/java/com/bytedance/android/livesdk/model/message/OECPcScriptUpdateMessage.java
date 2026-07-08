package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OECPcScriptUpdateMessage extends AbstractC1136060ffY {

    @C09CT("narrative_script")
    public String narrativeScript;

    @C09CT("product_id")
    public List<String> productId;

    @C09CT("script")
    public Map<String, String> script;

    @C09CT("timestamp")
    public long timestamp;

    public OECPcScriptUpdateMessage() {
        this.type = C001A.O_E_C_PC_SCRIPT_UPDATE_MESSAGE;
        this.productId = new ArrayList();
        this.script = new LinkedHashMap();
        this.narrativeScript = "";
    }
}
