package com.ss.android.ugc.aweme.innerpush.settings;

import X.C01GW;
import X.C09CT;
import X.C20643715qF;
import X.C452501pT;

/* JADX INFO: loaded from: classes32.dex */
public final class PullSettings {
    public static final MetaData LIZ = new MetaData(45, 45, 45, 45, 900, 10, true, true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20643715qF());

    public static final class MetaData {

        @C09CT("account_switch_delay")
        public final long accountSwitchDelaySeconds;

        @C09CT("cold_start_delay")
        public final long coldStartDelaySeconds;

        @C09CT("enable_account_switch")
        public final boolean enabledAccountSwitch;

        @C09CT("enable_cold_start")
        public final boolean enabledColdStart;

        @C09CT("enable_hot_start")
        public final boolean enabledHotStart;

        @C09CT("enable_warm_start")
        public final boolean enabledWarmStart;

        @C09CT("hot_start_delay")
        public final long hotStartDelaySeconds;

        @C09CT("min_req_duration")
        public final long minReqDurationSeconds;

        @C09CT("warm_start_delay")
        public final long warmStartDelaySeconds;

        @C09CT("ws_disconnect_poll_duration")
        public final long wsDisconnectPollDurationSeconds;

        public MetaData() {
            this(45L, 45L, 45L, 45L, 900L, 10L, true, true, true, true);
        }

        public MetaData(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, boolean z4) {
            this.coldStartDelaySeconds = j;
            this.warmStartDelaySeconds = j2;
            this.hotStartDelaySeconds = j3;
            this.accountSwitchDelaySeconds = j4;
            this.wsDisconnectPollDurationSeconds = j5;
            this.minReqDurationSeconds = j6;
            this.enabledColdStart = z;
            this.enabledWarmStart = z2;
            this.enabledHotStart = z3;
            this.enabledAccountSwitch = z4;
        }
    }

    public static MetaData LIZ() {
        return (MetaData) LIZIZ.getValue();
    }
}
