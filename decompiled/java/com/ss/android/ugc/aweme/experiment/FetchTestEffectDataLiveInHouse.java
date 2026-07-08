package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes14.dex */
public final class FetchTestEffectDataLiveInHouse {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static boolean enable;
    public static final FetchTestEffectDataLiveInHouse INSTANCE = new FetchTestEffectDataLiveInHouse();
    public static final int $stable = 8;

    public final void markEnable() {
        enable = true;
    }

    public final boolean enable() {
        return enable || C0C64.LJIILLIIL().LJIIIZ(31744, "fetch_test_effect_data_live_in_house", true, false);
    }

    public final boolean getEnable() {
        return enable;
    }

    public final void setEnable(boolean z) {
        enable = z;
    }
}
