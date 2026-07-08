package com.ss.android.ugc.aweme.poi.detail.videolist.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailSlashExpConfig {

    @C09CT("double_column")
    public final int doubleColumn;

    @C09CT("enable")
    public final int enable;

    @C09CT("triple_column")
    public final int tripleColumn;

    public PoiDetailSlashExpConfig() {
        this(0, 0, 0);
    }

    public PoiDetailSlashExpConfig(int i, int i2, int i3) {
        this.enable = i;
        this.doubleColumn = i2;
        this.tripleColumn = i3;
    }
}
