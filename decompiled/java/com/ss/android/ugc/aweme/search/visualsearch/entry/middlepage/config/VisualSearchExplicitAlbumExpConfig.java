package com.ss.android.ugc.aweme.search.visualsearch.entry.middlepage.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class VisualSearchExplicitAlbumExpConfig {

    @C09CT("enable")
    public final int enable;

    @C09CT("showing_pic_rows")
    public final double showingPicRows;

    public VisualSearchExplicitAlbumExpConfig() {
        this(0, 1.5d);
    }

    public VisualSearchExplicitAlbumExpConfig(int i, double d) {
        this.enable = i;
        this.showingPicRows = d;
    }
}
