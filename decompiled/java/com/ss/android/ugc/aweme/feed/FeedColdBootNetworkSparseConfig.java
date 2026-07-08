package com.ss.android.ugc.aweme.feed;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C0CC3;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedColdBootNetworkSparseConfig {
    public static final FeedColdBootNetworkSparseConfig LIZ = new FeedColdBootNetworkSparseConfig();
    public static final Config LIZIZ = new Config(0, 0, null, 0, 14, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0CC3());

    public static final class Config {

        @C09CT("black_list")
        public final Set<String> blackList;

        @C09CT("enable")
        public final int enable;

        @C09CT("sparse_duration")
        public final int sparseDuration;

        @C09CT("sparse_send_interval_ms")
        public final int sparseSendIntervalMs;

        public Config() {
            this(0, 0, null, 0, 15, null);
        }

        public Config(int i, int i2, Set<String> set, int i3) {
            this.enable = i;
            this.sparseDuration = i2;
            this.blackList = set;
            this.sparseSendIntervalMs = i3;
        }

        public Config(int i, int i2, Set set, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 10000 : i2, (i4 & 4) != 0 ? C08CX.INSTANCE : set, (i4 & 8) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i3);
        }
    }
}
