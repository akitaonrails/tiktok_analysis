package com.ss.android.ugc.aweme.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class IMStickerFavPageSizeConfig {
    public static final Config LIZ = new Config(100, 20);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(994));

    public static final class Config {

        @C09CT("load_more_count")
        public final long loadMoreCount;

        @C09CT("refresh_count")
        public final long refreshCount;

        public Config() {
            this(100L, 20L);
        }

        public Config(long j, long j2) {
            this.refreshCount = j;
            this.loadMoreCount = j2;
        }
    }
}
