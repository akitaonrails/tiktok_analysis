package com.ss.android.ugc.aweme.sticker.repository.internals.ab;

import X.C01GW;
import X.C0C64;
import X.C452501pT;
import java.util.Locale;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RecordFavoriteEffectDelayLoadAB {
    public static final int DEFAULT = 0;
    public static final int FIRST_CAMERA_FRAME = 1;
    public static final int NOT_LOAD_AT_ALL = 2;
    public static final RecordFavoriteEffectDelayLoadAB INSTANCE = new RecordFavoriteEffectDelayLoadAB();
    public static final C01GW mode$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1972));
    public static final int $stable = 8;

    private final int getMode() {
        return ((Number) mode$delegate.getValue()).intValue();
    }

    public static final boolean isLazyLoadEnabled() {
        return INSTANCE.getMode() != 0;
    }

    public static final boolean loadAfterFirstCameraFrame() {
        return INSTANCE.getMode() == 1;
    }

    public static final boolean notLoadAtAll() {
        return INSTANCE.getMode() == 2;
    }

    public static final boolean shouldOptout(String str) {
        String lowerCase;
        if (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) {
            return false;
        }
        if ((!Intrinsics.LJFF(lowerCase, "prop_page") || !C0C64.LJIILLIIL().LJIIIZ(31744, "record_favorite_effect_delay_load_optout_edp_enable", true, false)) && (!Intrinsics.LJFF(lowerCase, "single_song") || !C0C64.LJIILLIIL().LJIIIZ(31744, "record_favorite_effect_delay_load_optout_mdp_enable", true, false))) {
            return false;
        }
        return true;
    }
}
