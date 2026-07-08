package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class SearchDynamicImageDiskCacheExperiment {
    public static final Config LIZ = new Config(0, "", 20, 100, Double.valueOf(0.005d));
    public static final C01GW LIZIZ;

    static {
        new Config(1, "2,20,8,50,-1,100", 20, 100, Double.valueOf(0.005d));
        new Config(2, "", 20, 100, Double.valueOf(0.005d));
        LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(117));
    }

    public static final class Config {

        @C09CT("bucket_data")
        public final String bucketData;

        @C09CT("percent_of_free_space")
        public final Double percentOfFreeSpace;

        @C09CT("size_mb_max")
        public final Integer sizeMbMax;

        @C09CT("size_mb_min")
        public final Integer sizeMbMin;

        @C09CT("type")
        public final Integer type;

        public Config() {
            this(0, "", 20, 100, Double.valueOf(0.005d));
        }

        public Config(Integer num, String str, Integer num2, Integer num3, Double d) {
            this.type = num;
            this.bucketData = str;
            this.sizeMbMin = num2;
            this.sizeMbMax = num3;
            this.percentOfFreeSpace = d;
        }
    }
}
