package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcAnchorLiveStartApiRequestConfigSettings {
    public static final LiveStartSettings LIZ = new LiveStartSettings(false, 0);

    public static final class LiveStartSettings {

        @C09CT("enable_api_calling")
        public final boolean enableApiCalling;

        @C09CT("max_retry_count")
        public final int maxRetryCount;

        public LiveStartSettings(boolean z, int i) {
            this.enableApiCalling = z;
            this.maxRetryCount = i;
        }
    }
}
