package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageConfig {

    @C09CT("enable_text_image_mode")
    public final boolean enable;

    @C09CT("show_album_page_text_entrance")
    public final boolean showAlbumEntrance;

    @C09CT("use_new_text_entrance")
    public final boolean showNewEntrance;

    public Text2ImageConfig() {
        this(false, false, false);
    }

    public Text2ImageConfig(boolean z, boolean z2, boolean z3) {
        this.enable = z;
        this.showNewEntrance = z2;
        this.showAlbumEntrance = z3;
    }
}
