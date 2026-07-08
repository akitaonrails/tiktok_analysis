package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class CommentSampleRateSetting {
    public static final Config LIZ = new Config(true, new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(154));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(155));

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("rate_map")
        public final List<RateEntry> rateMap;

        public Config() {
            this(true, new ArrayList());
        }

        public Config(boolean z, List<RateEntry> list) {
            this.enable = z;
            this.rateMap = list;
        }
    }

    public static final class RateEntry {

        @C09CT("key")
        public final String key;

        @C09CT("value")
        public final Float value;

        public RateEntry(String str, Float f) {
            this.key = str;
            this.value = f;
        }
    }

    public static boolean LIZ(float f, String str) {
        if (!((Config) LIZIZ.getValue()).enable || str == null || str.length() == 0) {
            return false;
        }
        Float fValueOf = (Float) ((Map) LIZJ.getValue()).get(str);
        if (fValueOf == null) {
            fValueOf = Float.valueOf(f);
        }
        if (fValueOf.floatValue() < 1.0d && Math.random() >= fValueOf.floatValue()) {
            return false;
        }
        return true;
    }
}
