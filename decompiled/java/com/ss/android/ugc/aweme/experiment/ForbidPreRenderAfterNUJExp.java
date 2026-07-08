package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C0C64;
import X.C452501pT;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ForbidPreRenderAfterNUJExp {
    public static final boolean DEFAULT = false;
    public static final ForbidPreRenderAfterNUJExp INSTANCE = new ForbidPreRenderAfterNUJExp();
    public static final boolean FORBID = true;
    public static final C01GW isForbid$delegate = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(87));

    public final boolean isForbid() {
        return ((Boolean) isForbid$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "forbid_pre_render_after_nuj", true, false);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getFORBID() {
        return FORBID;
    }
}
