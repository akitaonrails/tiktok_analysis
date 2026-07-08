package com.ss.android.ugc.aweme.websocket.experiment;

import X.C09CT;
import X.C0C64;
import X.C2097908Jt;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class WsConnectionExtrasConfig {
    public static final FrontierConnectionExtra LIZ;

    static {
        FrontierConnectionExtra frontierConnectionExtra = new FrontierConnectionExtra(false, false, null, 0, 0L, null, 63, null);
        FrontierConnectionExtra frontierConnectionExtra2 = (FrontierConnectionExtra) C0C64.LJIILLIIL().LJJIIJ(true, "ws_connection_extras_config", 31744, FrontierConnectionExtra.class, frontierConnectionExtra, 2);
        if (frontierConnectionExtra2 != null) {
            frontierConnectionExtra = frontierConnectionExtra2;
        }
        LIZ = frontierConnectionExtra;
    }

    public static final class FrontierConnectionExtra {

        @C09CT("enable_domain_change")
        public final boolean enableDomainChange;

        @C09CT("enable_private_protocol")
        public final boolean enablePrivateProtocol;

        @C09CT("extras")
        public final Map<String, String> extras;

        @C09CT("private_protocol_domain")
        public final String privateProtocolDomain;

        @C09CT("transport_mode")
        public final int transportMode;

        @C09CT("ws_fallback_timeout_millis")
        public final long wsFallbackTimeoutMillis;

        public FrontierConnectionExtra() {
            this(false, false, null, 0, 0L, null, 63, null);
        }

        public FrontierConnectionExtra(boolean z, boolean z2, String str, int i, long j, Map<String, String> map) {
            this.enablePrivateProtocol = z;
            this.enableDomainChange = z2;
            this.privateProtocolDomain = str;
            this.transportMode = i;
            this.wsFallbackTimeoutMillis = j;
            this.extras = map;
        }

        public FrontierConnectionExtra(boolean z, boolean z2, String str, int i, long j, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "wss://frontier100-normal.tiktokv.com/ws/v2" : str, (i2 & 8) == 0 ? i : 0, (i2 & 16) != 0 ? 10000L : j, (i2 & 32) != 0 ? C2097908Jt.LIZJ(new Pair("ttnet_timeout_millis", "60000")) : map);
        }
    }
}
