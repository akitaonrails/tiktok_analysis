package com.ss.android.ugc.aweme.challenge.ui;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import dc.a;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class q0 {
    public static void LIZ(String str, a.c cVar, FixedRatioFrameLayout fixedRatioFrameLayout) {
        String strLJ = ec.a.LJ(str);
        if (Intrinsics.LJFF(strLJ, "frMode")) {
            fixedRatioFrameLayout.setMode(!Intrinsics.LJFF(cVar.LIZ.toLowerCase(Locale.ROOT), "fixed_height") ? 1 : 0);
        } else if (Intrinsics.LJFF(strLJ, "whRatio")) {
            fixedRatioFrameLayout.setWhRatio(CastFloatProtector.parseFloat(cVar.LIZ));
        } else {
            ec.a.LJFF(fixedRatioFrameLayout.getContext(), q0.class.getSimpleName(), str);
            throw null;
        }
    }
}
