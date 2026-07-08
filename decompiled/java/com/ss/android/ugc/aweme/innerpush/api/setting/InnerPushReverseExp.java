package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C01GW;
import X.C09CT;
import X.C13LQ;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushReverseExp {
    public static final MetaData LIZ = new MetaData(false, new int[0], new int[0]);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(223));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(224));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(222));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(221));

    public static boolean LIZ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static boolean LIZIZ(int i) {
        return C13LQ.LJIILJJIL(i, (int[]) LIZJ.getValue());
    }

    public static final class MetaData {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("exclude_types")
        public final int[] excludeTypes;

        @C09CT("filter_types")
        public final int[] filterTypes;

        public MetaData() {
            this(false, new int[0], new int[0]);
        }

        public MetaData(boolean z, int[] iArr, int[] iArr2) {
            this.enable = z;
            this.filterTypes = iArr;
            this.excludeTypes = iArr2;
        }
    }
}
