package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class SeaLiveBagIconEducationBubbleSetting {
    public static final SeaLiveBagIconEducationBubbleSetting LIZ = new SeaLiveBagIconEducationBubbleSetting();
    public static final SeaLiveBagIconEducationBubbleConfig LIZIZ = new SeaLiveBagIconEducationBubbleConfig(false, 3000, 1);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(64));

    public static final class SeaLiveBagIconEducationBubbleConfig {

        @C09CT("enable")
        public boolean enable;

        @C09CT("max_total_show_times")
        public int maxTotalShowTimes;

        @C09CT("show_duration")
        public long showDuration;

        public SeaLiveBagIconEducationBubbleConfig() {
            this(false, 3000L, 1);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SeaLiveBagIconEducationBubbleConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", showDuration=");
            sbLIZ.append(this.showDuration);
            sbLIZ.append(", maxTotalShowTimes=");
            sbLIZ.append(this.maxTotalShowTimes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SeaLiveBagIconEducationBubbleConfig(boolean z, long j, int i) {
            this.enable = z;
            this.showDuration = j;
            this.maxTotalShowTimes = i;
        }
    }
}
