package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_opt_preview_card_view_exp")
public final class LiveOptPreviewCardViewExp {
    public static final boolean DEFAULT = false;
    public static final LiveOptPreviewCardViewExp INSTANCE = new LiveOptPreviewCardViewExp();
    public static final C01GW isEnable$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(63));

    public static /* synthetic */ void isEnable$annotations() {
    }

    public static final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }
}
