package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCTipsInfo {

    @C09CT("description")
    public String description = "";

    @C09CT("cta_text")
    public String ctaText = "";

    @C09CT("cta_schema")
    public String ctaSchema = "";

    @C09CT("et_params")
    public Map<String, String> etParams = new LinkedHashMap();

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";
}
