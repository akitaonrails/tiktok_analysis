package com.ss.android.ugc.aweme.pns.gatekeeper.api.tools;

import X.C593830NQv;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class PNSGKToolItem {
    public static final C593830NQv Companion = new C593830NQv();
    public final Map<String, Object> raw;
    public final String signal;
    public final String toolType;

    public static final PNSGKToolItem fromJson(Map<String, ? extends Object> map) {
        Companion.getClass();
        return C593830NQv.LIZ(map);
    }

    public final Map<String, Object> getRaw() {
        return this.raw;
    }

    public final String getSignal() {
        return this.signal;
    }

    public final String getToolType() {
        return this.toolType;
    }

    public PNSGKToolItem(String str, String str2, Map<String, ? extends Object> map) {
        this.toolType = str;
        this.signal = str2;
        this.raw = map;
    }
}
