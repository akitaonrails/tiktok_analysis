package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BannerEvent {

    @C09CT("type")
    public int type;

    @C09CT("name")
    public String name = "";

    @C09CT("event_params")
    public Map<String, String> eventParams = new LinkedHashMap();
}
