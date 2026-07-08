package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.C09CT;
import X.C1948507kB;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class HintPageMsg {

    @C09CT("children")
    public final List<HintPageChildren> children;

    @C09CT("desc")
    public final String desc;

    @C09CT("title")
    public final String title;

    @C09CT("tracking_id")
    public final String trackingId;

    public HintPageMsg() {
        this(null, null, null, null);
    }

    public final boolean LIZ() {
        return C1948507kB.LIZ(this.title) && C1948507kB.LIZ(this.desc);
    }

    public HintPageMsg(String str, String str2, List<HintPageChildren> list, String str3) {
        this.title = str;
        this.desc = str2;
        this.children = list;
        this.trackingId = str3;
    }
}
