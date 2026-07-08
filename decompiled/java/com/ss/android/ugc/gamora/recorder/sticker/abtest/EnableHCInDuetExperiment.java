package com.ss.android.ugc.gamora.recorder.sticker.abtest;

import X.C0C64;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class EnableHCInDuetExperiment {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final EnableHCInDuetExperiment INSTANCE = new EnableHCInDuetExperiment();

    private final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_fwhc_in_duet", true, false) && EffectFullWidthHorizontalCarouselAB.isEnabled();
    }

    public static final boolean isDuetInFWHC(ShortVideoContext shortVideoContext) {
        if (INSTANCE.isEnabled() && shortVideoContext.LJJLL() && Intrinsics.LJFF(shortVideoContext.shootWay, "duet")) {
            return true;
        }
        return false;
    }
}
