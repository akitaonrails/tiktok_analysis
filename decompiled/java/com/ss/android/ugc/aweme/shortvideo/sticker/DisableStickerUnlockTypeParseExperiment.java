package com.ss.android.ugc.aweme.shortvideo.sticker;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class DisableStickerUnlockTypeParseExperiment {
    public static final boolean CONTROL = false;
    public static final boolean ENABLE = true;
    public static final DisableStickerUnlockTypeParseExperiment INSTANCE = new DisableStickerUnlockTypeParseExperiment();
    public static final C01GW enabled$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1962));

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getEnabled();
    }
}
