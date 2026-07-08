package com.ss.android.ugc.aweme.feed.spi;

import X.C0K77;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TikTokSovPlaylistBannerServiceImpl implements ISovPlaylistBannerService {
    public static final int $stable = 0;

    private final C0K77 getSubscriptionService() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            return iLiveOuterService.C3();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.spi.ISovPlaylistBannerService
    public boolean shouldShowSovPlaylistBanner(Aweme aweme, String str) {
        C0K77 subscriptionService;
        if (aweme == null || !Intrinsics.LJFF(str, "homepage_hot") || aweme.getPlaylist_info() == null || (subscriptionService = getSubscriptionService()) == null) {
            return false;
        }
        if (!subscriptionService.LJIILL(aweme) && !subscriptionService.LJJJJLI(aweme)) {
            return false;
        }
        return true;
    }
}
