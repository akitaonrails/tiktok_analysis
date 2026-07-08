package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailYmalV2Exp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(359));

    public static final class Config {

        @C09CT("max_post_count")
        public final Integer postMaxCount;

        @C09CT("max_ymal_count")
        public final Integer ymalCount;

        @C09CT("ymal_load_more_count")
        public final Integer ymalLoadMoreCount;

        @C09CT("ymal_style")
        public final String ymalStyle;

        public Config() {
            this(null, null, null, null);
        }

        public Config(String str, Integer num, Integer num2, Integer num3) {
            this.ymalStyle = str;
            this.ymalCount = num;
            this.postMaxCount = num2;
            this.ymalLoadMoreCount = num3;
        }
    }
}
