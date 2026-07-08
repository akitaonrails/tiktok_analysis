package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra;

import X.C01GW;
import X.C09CT;
import X.C1055890daF;
import X.C452501pT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedEcCardEnhancedPreloadConfig {
    public static final EnhancedPreloadConfig LIZ = new EnhancedPreloadConfig(Boolean.FALSE, Boolean.FALSE, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1055890daF());

    public static final class EnhancedPreloadConfig {

        @C09CT("delay_time")
        public final Long delayTime;

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("ignore_check_insert")
        public final Boolean ignoreCheckInsert;

        @C09CT("max_count")
        public final Integer maxCount;

        @C09CT("preload_channel_list")
        public final List<String> preloadList;

        public EnhancedPreloadConfig() {
            this(Boolean.FALSE, Boolean.FALSE, null, null, null);
        }

        public EnhancedPreloadConfig(Boolean bool, Boolean bool2, List<String> list, Integer num, Long l) {
            this.enable = bool;
            this.ignoreCheckInsert = bool2;
            this.preloadList = list;
            this.maxCount = num;
            this.delayTime = l;
        }
    }
}
