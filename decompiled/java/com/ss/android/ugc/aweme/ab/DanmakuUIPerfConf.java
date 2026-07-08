package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuUIPerfConf {
    public static final Config LIZ = new Config(true, Mp4ScreenVideoLoadTimeout.CONTROL, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(80));

    public static final class Config {
        public final boolean enable;

        @C09CT("frame_size")
        public final int frameSize;

        @C09CT("frame_start")
        public final long frameStart;

        public Config() {
            this(true, Mp4ScreenVideoLoadTimeout.CONTROL, 10);
        }

        public Config(boolean z, long j, int i) {
            this.enable = z;
            this.frameStart = j;
            this.frameSize = i;
        }
    }
}
