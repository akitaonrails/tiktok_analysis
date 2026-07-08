package com.ss.android.ugc.aweme.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class IMStickerPanelRedesignConfig {
    public static final Config LIZ = new Config(24, 24);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(995));

    public static final class Config {

        @C09CT("tenor_popular_sticker_cache_exp_hours")
        public final int popularStickerCacheExpHours;

        @C09CT("recent_sent_sticker_image_exp_hours")
        public final int recentStickerExpHours;

        public Config() {
            this(24, 24);
        }

        public Config(int i, int i2) {
            this.recentStickerExpHours = i;
            this.popularStickerCacheExpHours = i2;
        }
    }
}
