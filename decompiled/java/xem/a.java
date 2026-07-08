package xem;

import X.C426160GnO;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class a {
    public static void LIZ(a.c cVar, C426160GnO c426160GnO) {
        int i;
        String str = cVar.LIZ;
        if (Intrinsics.LJFF(str, "left")) {
            i = -1;
        } else if (Intrinsics.LJFF(str, "right")) {
            i = 1;
        } else {
            i = 0;
        }
        c426160GnO.setGravity(i);
    }
}
