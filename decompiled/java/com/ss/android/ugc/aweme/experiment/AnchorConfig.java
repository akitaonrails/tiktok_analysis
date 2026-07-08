package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.utils.AnchorIcons;

/* JADX INFO: loaded from: classes5.dex */
public final class AnchorConfig {

    @C09CT("icons")
    public final AnchorIcons icons;

    public AnchorConfig() {
        this(new AnchorIcons("https://sf16-ies-music-sg.tiktokcdn.com/obj/tiktok-obj/layout_anchor.png", "https://sf16-ies-music-sg.tiktokcdn.com/obj/tiktok-obj/layout_anchor_on_the_panel.png", "https://sf16-ies-music-sg.tiktokcdn.com/obj/tiktok-obj/layout_anchor_with_bg.png"));
    }

    public AnchorConfig(AnchorIcons anchorIcons) {
        this.icons = anchorIcons;
    }
}
