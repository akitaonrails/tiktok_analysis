package xem;

import X.C426320Gne;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class h {
    public static void LIZ(String str, a.b bVar, C426320Gne c426320Gne) {
        if (Intrinsics.LJFF(str, "app:tux_circularProgress_aboveColor")) {
            c426320Gne.setAboveColor(ec.a.LIZIZ(c426320Gne.getContext(), bVar));
        } else {
            if (!Intrinsics.LJFF(str, "app:tux_circularProgress_underColor")) {
                return;
            }
            c426320Gne.setUnderColor(ec.a.LIZIZ(c426320Gne.getContext(), bVar));
        }
    }
}
