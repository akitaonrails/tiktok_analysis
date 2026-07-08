package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class EcSearchBarAnimationConfig {
    public static final Config LIZ = new Config(1, C13BV.INSTANCE);
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        new Config(1, C1697810uHb.LJIIJJI(170, 172));
        LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(31));
        LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(32));
    }

    public static boolean LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            C01GW c01gw = LIZIZ;
            if (((Config) c01gw.getValue()).enableList.contains(num) || ((Config) c01gw.getValue()).enableList.contains(-1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final class Config {

        @C09CT("enable_list")
        public final List<Integer> enableList;

        @C09CT("style")
        public final int style;

        public Config(int i, List<Integer> list) {
            this.style = i;
            this.enableList = list;
        }
    }
}
