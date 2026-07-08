package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class PushImageLoadOptimizeExp {
    public static final Config LIZ = new Config(0, null, 3, null);
    public static final int LIZIZ = 1;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(187));

    public static final class Config {

        @C09CT("exclude_label")
        public final List<String> excludeLabel;

        @C09CT("value")
        public final int value;

        public Config() {
            this(0, null, 3, null);
        }

        public Config(int i, List<String> list) {
            this.value = i;
            this.excludeLabel = list;
        }

        public Config(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
