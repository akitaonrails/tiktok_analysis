package com.ss.android.ugc.aweme.feed.flexible;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedPageChangeToPanelConfig {

    @C09CT("effect_page_enable")
    public final boolean effectPageEnable;

    @C09CT("music_page_enable")
    public final boolean musicPageEnable;

    @C09CT("panel_show_animation_duration")
    public final int panelShowAnimationDuration;

    @C09CT("panel_show_share_button")
    public final boolean panelShowShareButton;

    public FeedPageChangeToPanelConfig() {
        this(false, false, false, 250);
    }

    public FeedPageChangeToPanelConfig(boolean z, boolean z2, boolean z3, int i) {
        this.musicPageEnable = z;
        this.effectPageEnable = z2;
        this.panelShowShareButton = z3;
        this.panelShowAnimationDuration = i;
    }
}
