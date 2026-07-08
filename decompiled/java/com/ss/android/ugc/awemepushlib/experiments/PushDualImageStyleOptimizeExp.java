package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class PushDualImageStyleOptimizeExp {
    public static final Config LIZ = new Config(false, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(186));

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("push_label_list")
        public final List<String> pushLabelList;

        public Config() {
            this(false, null, 3, null);
        }

        public Config(boolean z, List<String> list) {
            this.enable = z;
            this.pushLabelList = list;
        }

        public Config(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
