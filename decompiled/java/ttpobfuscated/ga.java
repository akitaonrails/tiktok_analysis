package ttpobfuscated;

import X.C0XLQ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ga {
    public static final boolean a(C0XLQ c0xlq) {
        String str = c0xlq.LIZ;
        if (Intrinsics.LJFF(str, "http")) {
            if (c0xlq.LJ != 80) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(str, "https") && c0xlq.LJ != 443) {
            return true;
        }
        return false;
    }
}
