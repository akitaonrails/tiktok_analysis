package com.ss.android.ugc.aweme.net.experiment;

import X.C08CX;
import X.C09CT;
import X.C0C64;
import X.C13LQ;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class NetTimeOutExperiment {
    public static final NetTimeOutConfig LIZ;

    static {
        NetTimeOutConfig netTimeOutConfig = new NetTimeOutConfig(C13LQ.LJLIIL(new String[]{"/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v1/follow/feed/", "/aweme/v2/follow/feed/", "/aweme/v1/aweme/post/", "/aweme/v2/aweme/post/", "/aweme/v1/user/", "/aweme/v1/user/profile/self", "/aweme/v1/user/profile/other", "/aweme/v1/nearby/feed/", "/aweme/v1/create/aweme/", "/aweme/v1/create/photo/", "/aweme/v2/comment/list/", "/aweme/v1/comment/publish/"}), 30000L, 15000L, 15000L, 60000L);
        new NetTimeOutConfig(null, 0L, 0L, 0L, 0L, 31, null);
        NetTimeOutConfig netTimeOutConfig2 = (NetTimeOutConfig) C0C64.LJIILLIIL().LJJII(NetTimeOutConfig.class, netTimeOutConfig, "net_common_time_out", true);
        if (netTimeOutConfig2 != null) {
            netTimeOutConfig = netTimeOutConfig2;
        }
        LIZ = netTimeOutConfig;
    }

    public static final class NetTimeOutConfig {

        @C09CT("socket_connect_timeout")
        public final long connectLimit;

        @C09CT("path")
        public final Set<String> pathList;

        @C09CT("protect_timeout")
        public final long protectLimit;

        @C09CT("socket_read_timeout")
        public final long readLimit;

        @C09CT("socket_write_timeout")
        public final long writeLimit;

        public NetTimeOutConfig() {
            this(null, 0L, 0L, 0L, 0L, 31, null);
        }

        public NetTimeOutConfig(Set<String> set, long j, long j2, long j3, long j4) {
            this.pathList = set;
            this.connectLimit = j;
            this.readLimit = j2;
            this.writeLimit = j3;
            this.protectLimit = j4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public NetTimeOutConfig(Set set, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            long j5 = j4;
            long j6 = j2;
            long j7 = j;
            Set set2 = (i & 1) != 0 ? C08CX.INSTANCE : set;
            j7 = (i & 2) != 0 ? 15000L : j7;
            j6 = (i & 4) != 0 ? 15000L : j6;
            long j8 = (i & 8) == 0 ? j3 : 15000L;
            this(set2, j7, j6, j8, (i & 16) != 0 ? j7 + j6 + j8 : j5);
        }
    }
}
