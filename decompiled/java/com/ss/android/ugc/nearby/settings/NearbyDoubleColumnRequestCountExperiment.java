package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C1204020hRA;
import X.C452501pT;
import X.EnumC1204030hRB;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyDoubleColumnRequestCountExperiment {
    public static final NearbyFeedRequestCountConfig LIZ = new NearbyFeedRequestCountConfig(12, 12, 12, 12, 12, 12, 12, 12, 12, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(640));

    public static NearbyFeedRequestCountConfig LIZIZ() {
        return (NearbyFeedRequestCountConfig) LIZIZ.getValue();
    }

    public static Integer LIZ(EnumC1204030hRB enumC1204030hRB) {
        switch (C1204020hRA.LIZ[enumC1204030hRB.ordinal()]) {
            case 1:
                return Integer.valueOf(LIZIZ().firstEnterRequestCount);
            case 2:
                return Integer.valueOf(LIZIZ().secondRefreshRequestCount);
            case 3:
                return Integer.valueOf(LIZIZ().switchCityRequestCount);
            case 4:
                return Integer.valueOf(LIZIZ().clickHomeRequestCount);
            case 5:
                return Integer.valueOf(LIZIZ().pullDownRequestCount);
            case 6:
                return Integer.valueOf(LIZIZ().loadMoreRequestCount);
            case 7:
                return Integer.valueOf(LIZIZ().turnOnGpsRequestCount);
            case 8:
                return Integer.valueOf(LIZIZ().failedRetryRequestCount);
            case BdTuring.TYPE_ECAF /* 9 */:
                return Integer.valueOf(LIZIZ().innerLoadMore);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZIZ().innerPreload;
            default:
                return null;
        }
    }

    public static final class NearbyFeedRequestCountConfig {

        @C09CT("click_home")
        public final int clickHomeRequestCount;

        @C09CT("failed_retry")
        public final int failedRetryRequestCount;

        @C09CT("first_enter")
        public final int firstEnterRequestCount;

        @C09CT("inner_load_more")
        public final int innerLoadMore;

        @C09CT("inner_preload")
        public final Integer innerPreload;

        @C09CT("load_more")
        public final int loadMoreRequestCount;

        @C09CT("pull_down")
        public final int pullDownRequestCount;

        @C09CT("second_refresh")
        public final int secondRefreshRequestCount;

        @C09CT("switch_city")
        public final int switchCityRequestCount;

        @C09CT("turn_on_gps")
        public final int turnOnGpsRequestCount;

        public NearbyFeedRequestCountConfig() {
            this(12, 12, 12, 12, 12, 12, 12, 12, 12, null);
        }

        public NearbyFeedRequestCountConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Integer num) {
            this.firstEnterRequestCount = i;
            this.secondRefreshRequestCount = i2;
            this.switchCityRequestCount = i3;
            this.clickHomeRequestCount = i4;
            this.pullDownRequestCount = i5;
            this.loadMoreRequestCount = i6;
            this.turnOnGpsRequestCount = i7;
            this.failedRetryRequestCount = i8;
            this.innerLoadMore = i9;
            this.innerPreload = num;
        }
    }
}
