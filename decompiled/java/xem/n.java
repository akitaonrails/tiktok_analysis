package xem;

import X.C1749280vcc;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class n {
    public static void LIZ(a.c cVar, C1749280vcc c1749280vcc) {
        if (Intrinsics.LJFF("app:tux_layoutVariant", "app:tux_layoutVariant")) {
            String str = cVar.LIZ;
            if (Intrinsics.LJFF(str, "fixed_height")) {
                c1749280vcc.setLayoutVariant(0);
            } else {
                if (!Intrinsics.LJFF(str, "hug_content")) {
                    return;
                }
                c1749280vcc.setLayoutVariant(1);
            }
        }
    }
}
