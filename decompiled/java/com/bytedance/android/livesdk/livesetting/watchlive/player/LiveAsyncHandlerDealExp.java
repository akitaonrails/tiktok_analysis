package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_async_handler_deal_exp")
public final class LiveAsyncHandlerDealExp {
    public static final int DEFAULT = 0;
    public static final LiveAsyncHandlerDealExp INSTANCE = new LiveAsyncHandlerDealExp();
    public static final int ENABLE = 1;
    public static final int ENABLE_FIRST_OPT = 2;
    public static final int ENABLE_BOTH = 3;
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(64));

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean isEnable() {
        int value = getValue();
        int i = ENABLE;
        return (value & i) == i;
    }

    public final boolean isFirstFrameShowOptEnable() {
        int value = getValue();
        int i = ENABLE_FIRST_OPT;
        return (value & i) == i;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }

    public final int getENABLE_BOTH() {
        return ENABLE_BOTH;
    }

    public final int getENABLE_FIRST_OPT() {
        return ENABLE_FIRST_OPT;
    }
}
