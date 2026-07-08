package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashPopupConfig {

    @C09CT("popup_level")
    public final int popupLevel;

    @C09CT("popup_timing")
    public final int popupTiming;

    public SlashPopupConfig() {
        this(0, 0);
    }

    public SlashPopupConfig(int i, int i2) {
        this.popupTiming = i;
        this.popupLevel = i2;
    }
}
