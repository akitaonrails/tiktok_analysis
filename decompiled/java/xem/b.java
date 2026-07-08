package xem;

import X.C16FB;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import dc.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class b {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, a.c cVar, C16FB c16fb) {
        String str2;
        int iHashCode = str.hashCode();
        if (iHashCode != 194283441) {
            if (iHashCode != 491210763) {
                if (iHashCode != 549973797 || !str.equals("app:tux_overScrollMode") || (str2 = cVar.LIZ) == null) {
                    return;
                }
                switch (str2.hashCode()) {
                    case -2068751806:
                        if (str2.equals("only_top")) {
                            c16fb.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                        }
                        break;
                    case -1414557169:
                        if (str2.equals("always")) {
                            c16fb.setOverScrollMode(EnumC19356710o9.ALWAYS);
                        }
                        break;
                    case 3387192:
                        if (str2.equals("none")) {
                            c16fb.setOverScrollMode(EnumC19356710o9.NONE);
                        }
                        break;
                    case 2080554526:
                        if (str2.equals("only_bottom")) {
                            c16fb.setOverScrollMode(EnumC19356710o9.ONLY_BOTTOM);
                        }
                        break;
                }
                return;
            }
            if (str.equals("app:tux_forceHandleEventMode")) {
                c16fb.LLJJIJI = ec.a.LIZ(cVar);
                return;
            }
            return;
        }
        if (str.equals("app:tux_scrollMode")) {
            String str3 = cVar.LIZ;
            if (Intrinsics.LJFF(str3, "none")) {
                c16fb.setScrollMode(EnumC481060Itk.NONE);
            } else {
                if (!Intrinsics.LJFF(str3, "refresh")) {
                    return;
                }
                c16fb.setScrollMode(EnumC481060Itk.REFRESH);
            }
        }
    }
}
