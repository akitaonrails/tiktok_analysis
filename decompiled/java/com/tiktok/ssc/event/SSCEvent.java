package com.tiktok.ssc.event;

import X.EnumC993910byH;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class SSCEvent {
    public final String eventName;
    public Map<String, ? extends Object> params;
    public final Function0<Map<String, Object>> paramsGetter;
    public final EnumC993910byH type;

    public final void setParams(Map<String, ? extends Object> map) {
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SSCEvent(String str, Map<String, ? extends Object> map, Function0<? extends Map<String, ? extends Object>> function0, EnumC993910byH enumC993910byH) {
        this.eventName = str;
        this.params = map;
        this.paramsGetter = function0;
        this.type = enumC993910byH;
    }
}
