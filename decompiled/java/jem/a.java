package jem;

import X.C2095008Iq;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class a {
    public static void LIZ(String str, dc.a aVar, TuxSkeletonLayout tuxSkeletonLayout) {
        int iIntValue;
        if (Intrinsics.LJFF(str, "app:tux_skeletonRepeat")) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(aVar.LIZ);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            tuxSkeletonLayout.setRepeat(iIntValue);
        }
    }
}
