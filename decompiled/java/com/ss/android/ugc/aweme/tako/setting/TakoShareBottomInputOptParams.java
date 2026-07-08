package com.ss.android.ugc.aweme.tako.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoShareBottomInputOptParams {

    @C09CT("hide_input_container")
    public final boolean hideInputContainer;

    @C09CT("hide_submode_bar")
    public final boolean hideSubmodeBar;

    public TakoShareBottomInputOptParams() {
        this(true, true);
    }

    public TakoShareBottomInputOptParams(boolean z, boolean z2) {
        this.hideSubmodeBar = z;
        this.hideInputContainer = z2;
    }
}
