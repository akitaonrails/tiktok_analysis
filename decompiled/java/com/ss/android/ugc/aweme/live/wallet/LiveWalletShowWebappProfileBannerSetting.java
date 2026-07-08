package com.ss.android.ugc.aweme.live.wallet;

import X.C01GW;
import X.C09CT;
import X.C292401Bi;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveWalletShowWebappProfileBannerSetting {
    public static final LiveWalletShowWebappProfileBannerSetting INSTANCE = new LiveWalletShowWebappProfileBannerSetting();
    public static final LiveWalletWebappProfileBannerData DEFAULT = new LiveWalletWebappProfileBannerData(false, 25, 3, "", 604800);
    public static final C01GW config$delegate = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(196));
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes32.dex */
    public static final class LiveWalletWebappProfileBannerData {

        @C09CT("amount_percent")
        public final int amountPercent;

        @C09CT("max_auto_dismiss_count")
        public final int maxAutoDismissCount;

        @C09CT("schema_url")
        public final String schemaUrl;

        @C09CT("should_show")
        public final boolean shouldShow;

        @C09CT("show_interval")
        public final long showInterval;

        public LiveWalletWebappProfileBannerData() {
            this(false, 25, 3, "", 604800L);
        }

        public LiveWalletWebappProfileBannerData(boolean z, int i, int i2, String str, long j) {
            this.shouldShow = z;
            this.amountPercent = i;
            this.maxAutoDismissCount = i2;
            this.schemaUrl = str;
            this.showInterval = j;
        }
    }

    public final LiveWalletWebappProfileBannerData getConfig() {
        return (LiveWalletWebappProfileBannerData) config$delegate.getValue();
    }

    public final LiveWalletWebappProfileBannerData getDEFAULT() {
        return DEFAULT;
    }
}
