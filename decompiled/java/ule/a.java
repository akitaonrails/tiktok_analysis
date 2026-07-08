package ule;

import X.C19MW;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(a.c cVar, C19MW c19mw) {
        String str;
        c19mw.getContext();
        if (!Intrinsics.LJFF(ec.a.LJ("app:barrierDirection"), "barrierDirection") || (str = cVar.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c19mw.setType(3);
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c19mw.setType(6);
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c19mw.setType(2);
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c19mw.setType(0);
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c19mw.setType(1);
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c19mw.setType(5);
                }
                break;
        }
    }
}
