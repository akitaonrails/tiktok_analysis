package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes24.dex */
public final class CommentNetTimeOutExperiment {
    public static final CommentNetTimeOutExperiment LIZ = new CommentNetTimeOutExperiment();
    public static final NetTimeOutConfig LIZIZ;

    static {
        NetTimeOutConfig netTimeOutConfig = new NetTimeOutConfig(false, 30000L, 15000L, 15000L, 60000L);
        NetTimeOutConfig netTimeOutConfig2 = (NetTimeOutConfig) C0C64.LJIILLIIL().LJJII(NetTimeOutConfig.class, netTimeOutConfig, "comment_net_time_out", true);
        if (netTimeOutConfig2 != null) {
            netTimeOutConfig = netTimeOutConfig2;
        }
        LIZIZ = netTimeOutConfig;
    }

    public static final class NetTimeOutConfig {

        @C09CT("socket_connect_timeout")
        public final long connectLimit;

        @C09CT("enable_opt")
        public final boolean enable;

        @C09CT("protect_timeout")
        public final long protectLimit;

        @C09CT("socket_read_timeout")
        public final long readLimit;

        @C09CT("socket_write_timeout")
        public final long writeLimit;

        public NetTimeOutConfig() {
            this(false, 15000L, 15000L, 15000L, 45000L);
        }

        public NetTimeOutConfig(boolean z, long j, long j2, long j3, long j4) {
            this.enable = z;
            this.connectLimit = j;
            this.readLimit = j2;
            this.writeLimit = j3;
            this.protectLimit = j4;
        }
    }
}
