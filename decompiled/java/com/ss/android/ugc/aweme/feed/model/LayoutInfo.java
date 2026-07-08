package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutInfo implements Serializable {

    @C09CT("layout_apply_from")
    public String layoutApplyFrom;

    @C09CT("layout_mode")
    public String layoutMode;

    public LayoutInfo() {
        this(null, null);
    }

    public LayoutInfo(String str, String str2) {
        this.layoutMode = str;
        this.layoutApplyFrom = str2;
    }
}
