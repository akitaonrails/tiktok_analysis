package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class GlobalDoodleConfig implements Serializable {

    @C09CT("display_filter_bar")
    public int displayFilterBar = 1;

    public final int getDisplayFilterBar() {
        return this.displayFilterBar;
    }

    public final void setDisplayFilterBar(int i) {
        this.displayFilterBar = i;
    }
}
