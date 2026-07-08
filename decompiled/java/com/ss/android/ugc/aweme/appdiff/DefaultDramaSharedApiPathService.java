package com.ss.android.ugc.aweme.appdiff;

import X.C1578450rB5;
import X.C1954807lC;
import X.EnumC1578460rB6;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes25.dex */
public final class DefaultDramaSharedApiPathService implements IDramaSharedApiPathService {
    @Override // com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService
    public final String LIZ(EnumC1578460rB6 enumC1578460rB6) {
        switch (C1578450rB5.LIZ[enumC1578460rB6.ordinal()]) {
            case 1:
                return "/tiktok/v1/paid_content/mini_drama/skylight";
            case 2:
                return "/tiktok/v1/paid_content/mini_drama/my_list";
            case 3:
                return "/tiktok/v1/paid_content/mini_drama_center";
            case 4:
                return "/tiktok/v1/paid_content/mini_drama_center/preload";
            case 5:
                return "/tiktok/v1/paid_content/video_progress";
            case 6:
                return "/tiktok/v1/paid_content/collection/episode_panel";
            case 7:
                return "/tiktok/v1/paid_content/collection/recommend";
            case 8:
                return "/tiktok/v1/paid_content/collection/favorite";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "/tiktok/v1/paid_content/collection/mini_drama_list";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "/tiktok/v1/paid_content/collection/list";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "/tiktok/v1/paid_content/mini_drama/video";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "/tiktok/v1/paid_content/mini_drama/video_by_ids";
            default:
                throw new C1954807lC();
        }
    }
}
