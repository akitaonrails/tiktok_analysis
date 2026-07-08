package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class CSSProperties {

    @C09CT("color")
    public final String color;

    @C09CT("fontStyle")
    public final String fontStyle;

    @C09CT("fontWeight")
    public final String fontWeight;

    @C09CT("textAlign")
    public final String textAlign;

    public CSSProperties() {
        this(null, null, null, null);
    }

    public CSSProperties(String str, String str2, String str3, String str4) {
        this.textAlign = str;
        this.color = str2;
        this.fontWeight = str3;
        this.fontStyle = str4;
    }
}
