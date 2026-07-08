package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class TUCEventData implements Serializable {

    @C09CT("event_name")
    public String eventName;

    @C09CT("params")
    public Map<String, String> extra;

    @C09CT("inject_extra")
    public Map<String, String> injectExtra;

    @C09CT("type")
    public String type;

    public TUCEventData() {
        this(null, null, new LinkedHashMap(), new LinkedHashMap());
    }

    public final void setExtra(Map<String, String> map) {
        this.extra = map;
    }

    public final void setInjectExtra(Map<String, String> map) {
        this.injectExtra = map;
    }

    public TUCEventData(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this.type = str;
        this.eventName = str2;
        this.extra = map;
        this.injectExtra = map2;
    }
}
