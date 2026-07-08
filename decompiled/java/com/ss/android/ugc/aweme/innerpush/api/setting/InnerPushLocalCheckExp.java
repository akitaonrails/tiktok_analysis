package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushLocalCheckExp {
    public static final Meta LIZ = new Meta(0, new int[0]);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final int[] LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(228));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((Meta) c01gwLIZIZ.getValue()).checkEnabled == 1;
        LIZLLL = ((Meta) c01gwLIZIZ.getValue()).disableCheckType;
    }

    public static final class Meta {

        @C09CT("check_enabled")
        public final int checkEnabled;

        @C09CT("disable_check_type")
        public final int[] disableCheckType;

        public Meta() {
            this(0, new int[0]);
        }

        public Meta(int i, int[] iArr) {
            this.checkEnabled = i;
            this.disableCheckType = iArr;
        }
    }
}
