package com.bytedance.android.livesdk.comp.api.linkcore.model;

import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LinkMicStatusKt {
    public static final Pair<Boolean, Boolean> audioStateDiffWith(int i, boolean z, boolean z2) {
        boolean z3;
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(36);
        AFwS276S0000000_31 aFwS276S0000000_312 = AFwS276S0000000_31.get$arr$(37);
        boolean zBooleanValue = ((Boolean) aFwS276S0000000_31.invoke(Integer.valueOf(i))).booleanValue();
        boolean z4 = true;
        if (zBooleanValue != z) {
            z3 = true;
        } else {
            z3 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z3);
        if (((Boolean) aFwS276S0000000_312.invoke(Integer.valueOf(i))).booleanValue() == z2) {
            z4 = false;
        }
        return new Pair<>(boolValueOf, Boolean.valueOf(z4));
    }
}
