package com.ss.android.ugc.feed.platform.cell.interact.mob;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class ComponentSizeParams {
    public static final int $stable = 8;

    @C09CT("component_key")
    public final String componentKey;

    @C09CT("height")
    public final int height;

    @C09CT("width")
    public int width;

    public final void setWidth(int i) {
        this.width = i;
    }

    public ComponentSizeParams(String str, int i, int i2) {
        this.componentKey = str;
        this.width = i;
        this.height = i2;
    }
}
