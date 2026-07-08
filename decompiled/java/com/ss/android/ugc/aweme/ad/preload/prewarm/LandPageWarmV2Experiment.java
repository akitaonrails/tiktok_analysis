package com.ss.android.ugc.aweme.ad.preload.prewarm;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class LandPageWarmV2Experiment {
    public static final LandPageWarmV2Config LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;

    static {
        new LandPageWarmV2Config(true, CardStruct.IStatusCode.DEFAULT, true, false, null, 0L, 0L, 0);
        LIZ = new LandPageWarmV2Config(false, null, false, false, null, 0L, 0L, 0);
        LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(99));
        LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(97));
        LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(96));
        LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(98));
    }

    public static final LandPageWarmV2Config LIZ() {
        return (LandPageWarmV2Config) LIZIZ.getValue();
    }

    public static final class LandPageWarmV2Config {

        @C09CT("aweme_change_wait_time")
        public final long awemeChangeWaitTime;

        @C09CT("enable_prewarm_class")
        public final boolean enablePreWarmClass;

        @C09CT("enable_prewarm_container")
        public final boolean enablePreWarmContainer;

        @C09CT("enable_prewarm_load_url_device_level")
        public final String enablePreWarmLoadUrlDeviceLevel;

        @C09CT("enable_spark_warmup")
        public final boolean enableSparkWarmup;

        @C09CT("enable_webview_precreate_device_level")
        public final String enableWebviewPrecreateDeviceLevel;

        @C09CT("min_aweme_count_before_ad")
        public final int minAwemeCountBeforeAd;

        @C09CT("task_interval")
        public final long taskInterval;

        public LandPageWarmV2Config() {
            this(false, null, false, false, null, 0L, 0L, 0);
        }

        public LandPageWarmV2Config(boolean z, String str, boolean z2, boolean z3, String str2, long j, long j2, int i) {
            this.enablePreWarmContainer = z;
            this.enablePreWarmLoadUrlDeviceLevel = str;
            this.enablePreWarmClass = z2;
            this.enableSparkWarmup = z3;
            this.enableWebviewPrecreateDeviceLevel = str2;
            this.taskInterval = j;
            this.awemeChangeWaitTime = j2;
            this.minAwemeCountBeforeAd = i;
        }
    }
}
