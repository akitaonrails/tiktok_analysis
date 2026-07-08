package com.ss.android.ugc.aweme.slash.cell.card;

import X.C09CT;
import X.C1179100gmy;
import X.C12ES;
import X.C2327809Ae;
import X.C418440Gaw;
import X.C814420VxA;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class SizeConfig {

    @C09CT("display_items")
    public final double displayItems;

    @C09CT("full_display_items")
    public final int fullDisplayItems;

    @C09CT("height")
    public final int height;

    @C09CT("min_width")
    public final int minWidth;

    @C09CT("reserve_space")
    public final int reserveSpace;

    @C09CT("size_type")
    public final String sizeType;

    @C09CT("width")
    public final int width;

    @C09CT("width_height_ratio")
    public final String widthHeightRatio;

    public SizeConfig() {
        this(null, null, 0, 0.0d, 0, 0, 0, 0);
    }

    public static double LIZIZ(String str) {
        if (str == null || !a0.LJJIIZI(str, ":", false)) {
            return 1.0d;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2) {
            return 1.0d;
        }
        Double dLJII = C2327809Ae.LJII((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        Double dLJII2 = C2327809Ae.LJII((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        if (dLJII == null || dLJII2 == null || Intrinsics.LIZIZ(dLJII2, 0.0d)) {
            return 1.0d;
        }
        double dDoubleValue = dLJII.doubleValue() / dLJII2.doubleValue();
        if (dDoubleValue <= 0.0d) {
            return 1.0d;
        }
        return dDoubleValue;
    }

    public final int LIZ(Context context) {
        int i;
        if (Intrinsics.LJFF(this.sizeType, "responsive") && this.displayItems > 0.0d) {
            if (C1179100gmy.LIZ == -1) {
                C1179100gmy.LIZ = C12ES.LJIIJ(context);
            }
            double dLIZIZ = ((double) (C1179100gmy.LIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.reserveSpace))))) / this.displayItems;
            double dLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.minWidth)));
            if (dLIZIZ < dLIZIZ2) {
                dLIZIZ = dLIZIZ2;
            }
            return (int) dLIZIZ;
        }
        if (Intrinsics.LJFF(this.sizeType, "absolute") && (i = this.width) > 0) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
        if (Intrinsics.LJFF(this.sizeType, "responsive") && this.fullDisplayItems > 0) {
            if (C1179100gmy.LIZ == -1) {
                C1179100gmy.LIZ = C12ES.LJIIJ(context);
            }
            int iLIZIZ = (C1179100gmy.LIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.reserveSpace)))) / this.fullDisplayItems;
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.minWidth)));
            if (iLIZIZ >= iLIZIZ2) {
                return iLIZIZ;
            }
            return iLIZIZ2;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.width)));
    }

    public SizeConfig(String str, String str2, int i, double d, int i2, int i3, int i4, int i5) {
        this.sizeType = str;
        this.widthHeightRatio = str2;
        this.fullDisplayItems = i;
        this.displayItems = d;
        this.reserveSpace = i2;
        this.minWidth = i3;
        this.width = i4;
        this.height = i5;
    }
}
