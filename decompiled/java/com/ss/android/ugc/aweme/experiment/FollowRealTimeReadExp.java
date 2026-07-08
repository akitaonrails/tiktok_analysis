package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C1EM3;
import X.C1EM4;
import X.C1EM5;
import X.C1EM6;
import X.C1EM7;
import X.C1EM8;
import X.C1EM9;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowRealTimeReadExp {
    public static final Config LIZ = new Config(false, false, false, false, 240, 240, 500, 86400, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1EM3());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1EM7());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(144));
    public static final C01GW LJ = C452501pT.LIZIZ(new C1EM6());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1EM8());
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(143));
    public static final C01GW LJII = C452501pT.LIZIZ(new C1EM9());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1EM5());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1EM4());

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static Config LIZIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static final class Config {

        @C09CT("auto_locate_unread_video_interval")
        public final int autoLocateUnreadVideoInterval;

        @C09CT("auto_locate_unread_video_latency")
        public final long autoLocateUnreadVideoLatency;

        @C09CT("data_valid_duration")
        public final long dataValidDuration;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_auto_locate_unread_video")
        public final boolean enableAutoLocateUnreadVideo;

        @C09CT("enable_fake_refresh")
        public final boolean enableFakeRefresh;

        @C09CT("enable_real_time_read")
        public final boolean enableRealTimeRead;

        @C09CT("fake_refresh_interval")
        public final int fakeRefreshInterval;

        @C09CT("read_records_limit")
        public final int readRecordLimit;

        public Config() {
            this(false, false, false, false, 240, 240, 500, 86400L, 0L);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, long j, long j2) {
            this.enable = z;
            this.enableRealTimeRead = z2;
            this.enableFakeRefresh = z3;
            this.enableAutoLocateUnreadVideo = z4;
            this.fakeRefreshInterval = i;
            this.autoLocateUnreadVideoInterval = i2;
            this.readRecordLimit = i3;
            this.dataValidDuration = j;
            this.autoLocateUnreadVideoLatency = j2;
        }
    }
}
