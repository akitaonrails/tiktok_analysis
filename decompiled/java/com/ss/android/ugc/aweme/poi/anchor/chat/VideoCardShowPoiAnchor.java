package com.ss.android.ugc.aweme.poi.anchor.chat;

import X.C09CT;
import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoCardShowPoiAnchor {
    public static final Config LIZ = new Config(0, 0);

    public static Config LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            Config config = LIZ;
            Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "video_card_show_poi_anchor_exp", false);
            return config2 != null ? config2 : config;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class Config {

        @C09CT("fav_cnt")
        public final Integer favCnt;

        @C09CT("video_card_show_poi_anchor")
        public final Integer videoCardShowPoiAnchor;

        public Config() {
            this(null, null);
        }

        public Config(Integer num, Integer num2) {
            this.videoCardShowPoiAnchor = num;
            this.favCnt = num2;
        }
    }
}
