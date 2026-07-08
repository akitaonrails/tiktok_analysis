package xem;

import X.C0HZQ;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class g {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, a.c cVar, C0HZQ c0hzq) {
        switch (str.hashCode()) {
            case -1345082459:
                if (str.equals("app:tux_checkBoxSize")) {
                    String str2 = cVar.LIZ;
                    if (Intrinsics.LJFF(str2, "small")) {
                        c0hzq.setSize(0);
                    } else if (Intrinsics.LJFF(str2, "medium")) {
                        c0hzq.setSize(1);
                    }
                }
                break;
            case 684761017:
                if (str.equals("app:tux_checkBoxUncheckedColor")) {
                    c0hzq.setCheckBoxUncheckedColor(ec.a.LIZIZ(c0hzq.getContext(), cVar));
                }
                break;
            case 687998880:
                if (str.equals("app:tux_checkBoxCheckedColor")) {
                    c0hzq.setCheckBoxCheckedColor(ec.a.LIZIZ(c0hzq.getContext(), cVar));
                }
                break;
            case 1252063357:
                if (str.equals("app:tux_checkBoxShape")) {
                    String str3 = cVar.LIZ;
                    if (Intrinsics.LJFF(str3, "circle")) {
                        c0hzq.setShape(0);
                    } else if (Intrinsics.LJFF(str3, "square")) {
                        c0hzq.setShape(1);
                    }
                }
                break;
        }
    }
}
