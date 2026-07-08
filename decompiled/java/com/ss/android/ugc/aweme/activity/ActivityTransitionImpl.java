package com.ss.android.ugc.aweme.activity;

import X.C054J;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.activity.IActivityTransition;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTransitionImpl implements IActivityTransition {
    public static boolean LIZIZ() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static Pair LIZJ(boolean z) {
        int iLIZ = C054J.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (iLIZ != 3) {
                    if (z) {
                        return new Pair(Integer.valueOf(R.anim.ft), Integer.valueOf(R.anim.g2));
                    }
                    return new Pair(Integer.valueOf(R.anim.fv), Integer.valueOf(R.anim.g0));
                }
                if (z) {
                    return new Pair(Integer.valueOf(R.anim.l8), Integer.valueOf(R.anim.lg));
                }
                return new Pair(Integer.valueOf(R.anim.la), Integer.valueOf(R.anim.ld));
            }
            if (z) {
                return new Pair(Integer.valueOf(R.anim.l7), Integer.valueOf(R.anim.lf));
            }
            return new Pair(Integer.valueOf(R.anim.l_), Integer.valueOf(R.anim.lc));
        }
        if (z) {
            return new Pair(Integer.valueOf(R.anim.l6), Integer.valueOf(R.anim.le));
        }
        return new Pair(Integer.valueOf(R.anim.l9), Integer.valueOf(R.anim.lb));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    @Override // com.ss.android.ugc.aweme.base.activity.IActivityTransition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> LIZ(int r4, boolean r5) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.activity.ActivityTransitionImpl.LIZ(int, boolean):kotlin.Pair");
    }
}
