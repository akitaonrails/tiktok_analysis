package com.ss.android.ugc.aweme.ad.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class UploadAdWebPreloadInfoConfig {
    public static final UAWPIConfig LIZ = new UAWPIConfig(50, 3, 4);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(102));

    public static final class UAWPIConfig {

        @C09CT("max_upload_fail_url")
        public final int maxUploadFailUrl;

        @C09CT("perf_rate")
        public final int perfRate;

        @C09CT("sampling_rate")
        public final int samplingRate;

        public UAWPIConfig() {
            this(50, 3, 4);
        }

        public UAWPIConfig(int i, int i2, int i3) {
            this.maxUploadFailUrl = i;
            this.samplingRate = i2;
            this.perfRate = i3;
        }
    }
}
