package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C20549715b5;
import X.C452501pT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class LSFeedCardInsetConfig {
    public static final Config LIZ = new Config(null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20549715b5());

    public static final class Config {

        @C09CT("card_config")
        public final List<LSCardConfig> cardConfig;

        public Config() {
            this(null);
        }

        public Config(List<LSCardConfig> list) {
            this.cardConfig = list;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class LSCardConfig {

        @C09CT("card_type")
        public final Integer cardType;

        @C09CT("sub_card_type")
        public final List<String> subCardType;

        public LSCardConfig() {
            this(null, null);
        }

        public LSCardConfig(Integer num, List<String> list) {
            this.cardType = num;
            this.subCardType = list;
        }
    }
}
