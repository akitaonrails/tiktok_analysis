package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class MusicDspExpConfig {

    @C09CT("dsp_enable_background_play")
    public final boolean dspEnableBgPlay;

    @C09CT("dsp_enable_feed_card")
    public final boolean dspEnableFeedCard;

    @C09CT("dsp_entrance")
    public final int dspEntrance;

    @C09CT("dsp_ugc_entrance")
    public final int dspUgcEntrance;

    @C09CT("dsp_ui_style")
    public final int dspUiStyle;

    public MusicDspExpConfig() {
        this(0, 0, false, false, 0);
    }

    public MusicDspExpConfig(int i, int i2, boolean z, boolean z2, int i3) {
        this.dspEntrance = i;
        this.dspUiStyle = i2;
        this.dspEnableBgPlay = z;
        this.dspEnableFeedCard = z2;
        this.dspUgcEntrance = i3;
    }
}
