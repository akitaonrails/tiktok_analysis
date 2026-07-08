package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class StickPointRecommendMusicTimeOutOpt {
    public static final StickPointRecommendMusicTimeOutOptConfig LIZ = new StickPointRecommendMusicTimeOutOptConfig(false, 700, 500);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(326));

    public static final class StickPointRecommendMusicTimeOutOptConfig {

        @C09CT("is_enable")
        public final boolean isEnable;

        @C09CT("request_timeout_ms")
        public final long requestTimeoutMs;

        @C09CT("upload_frame_timeout_ms")
        public final long uploadFrameTimeoutMs;

        public StickPointRecommendMusicTimeOutOptConfig() {
            this(false, 700L, 500L);
        }

        public StickPointRecommendMusicTimeOutOptConfig(boolean z, long j, long j2) {
            this.isEnable = z;
            this.uploadFrameTimeoutMs = j;
            this.requestTimeoutMs = j2;
        }
    }
}
