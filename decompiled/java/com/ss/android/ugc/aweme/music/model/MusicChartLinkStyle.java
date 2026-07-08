package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicChartLinkStyle implements Serializable {

    @C09CT("bg_end_color")
    public int bgEndColor;

    @C09CT("bg_start_color")
    public int bgStartColor;

    public final int getBgEndColor() {
        return this.bgEndColor;
    }

    public final int getBgStartColor() {
        return this.bgStartColor;
    }

    public final void setBgEndColor(int i) {
        this.bgEndColor = i;
    }

    public final void setBgStartColor(int i) {
        this.bgStartColor = i;
    }
}
