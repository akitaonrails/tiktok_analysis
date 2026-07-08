package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class EntranceGuidanceContainer {

    @C09CT("text")
    public Text text;

    @C09CT("guidance_key")
    public String guidanceKey = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
