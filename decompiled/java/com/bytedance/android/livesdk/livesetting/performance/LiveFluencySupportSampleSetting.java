package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_fluency_support_sample_v1")
public final class LiveFluencySupportSampleSetting {
    public static final LiveFluencySupportSample DEFAULT;
    public static final LiveFluencySupportSampleSetting INSTANCE = new LiveFluencySupportSampleSetting();
    public static LiveFluencySupportSample liveFluencySupportSample;

    static {
        LiveFluencySupportSample liveFluencySupportSample2 = new LiveFluencySupportSample(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1, 10, 10, 10, 10, 10, 10, 10, 10, 1, 1);
        DEFAULT = liveFluencySupportSample2;
        LiveFluencySupportSample liveFluencySupportSample3 = (LiveFluencySupportSample) SettingsManager.INSTANCE.getValueSafely("live_fluency_support_sample_v1", liveFluencySupportSample2);
        if (liveFluencySupportSample3 != null) {
            liveFluencySupportSample2 = liveFluencySupportSample3;
        }
        liveFluencySupportSample = liveFluencySupportSample2;
    }

    public final int getAnchorPanelGiftSlideComposeSamplingRate() {
        return liveFluencySupportSample.anchorPanelGiftSlideCompose;
    }

    public final int getAnchorPanelGiftSlideSamplingRate() {
        return liveFluencySupportSample.anchorPanelGiftSlide;
    }

    public final int getBoardMetricSampling() {
        return liveFluencySupportSample.boardMetrics;
    }

    public final int getBroadcastEnterSamplingRate() {
        return liveFluencySupportSample.broadcastEnter;
    }

    public final int getBroadcastLinkPeriodSamplingRate() {
        return liveFluencySupportSample.broadcastLinkPeriod;
    }

    public final int getBroadcastPeriodAllSamplingRate() {
        return liveFluencySupportSample.broadcastPeriodAll;
    }

    public final int getBroadcastPeriodSamplingRate() {
        return liveFluencySupportSample.broadcastLinkPeriod;
    }

    public final int getCommentPanelCloseSampling() {
        return liveFluencySupportSample.panelCommentClose;
    }

    public final int getCommentPanelOpenSampling() {
        return liveFluencySupportSample.panelCommentOpen;
    }

    public final int getCommentPanelPeriodSampling() {
        return liveFluencySupportSample.panelCommentPeriod;
    }

    public final int getDrawerOpenSamplingRate() {
        return liveFluencySupportSample.drawerOpenPeriod;
    }

    public final int getEffectPanelSlideSamplingRate() {
        return liveFluencySupportSample.panelEffectSlide;
    }

    public final int getGiftPlaySamplingRate() {
        return liveFluencySupportSample.giftPlay;
    }

    public final int getLinkMicRolePeriodSamplingRate() {
        return liveFluencySupportSample.linkMicRolePeriod;
    }

    public final int getMultiGuestLayoutSamplingRate() {
        return liveFluencySupportSample.multiGuestLayout;
    }

    public final int getPanelBeautySlideSamplingRate() {
        return liveFluencySupportSample.panelBeautySlide;
    }

    public final int getPanelBroadcastLinkSlideSamplingRate() {
        return liveFluencySupportSample.panelBroadcastLinkSlide;
    }

    public final int getPanelExtendedPublicScreenAutoSlideSamplingRate() {
        return liveFluencySupportSample.panelExtendedPublicScreenAutoSlide;
    }

    public final int getPanelExtendedPublicScreenSlideSamplingRate() {
        return liveFluencySupportSample.panelExtendedPublicScreenSlide;
    }

    public final int getPanelFilterSlideSamplingRate() {
        return liveFluencySupportSample.panelFilterSlide;
    }

    public final int getPanelGiftSlideSamplingRate() {
        return liveFluencySupportSample.panelGiftSlide;
    }

    public final int getPanelHourlyRankSlideSamplingRate() {
        return liveFluencySupportSample.panelHourlyRankSlide;
    }

    public final int getPanelPublicScreenAutoSlideSamplingRate() {
        return liveFluencySupportSample.panelPublicScreenAutoSlide;
    }

    public final int getPanelPublicScreenSlideSamplingRate() {
        return liveFluencySupportSample.panelPublicScreenSlide;
    }

    public final int getPanelRechargeSlideSamplingRate() {
        return liveFluencySupportSample.panelRechargeSlide;
    }

    public final int getPanelSoundSlideSamplingRate() {
        return liveFluencySupportSample.panelSoundSlide;
    }

    public final int getPanelStickerSlideSamplingRate() {
        return liveFluencySupportSample.panelStickerSlide;
    }

    public final int getPannelMultiGuestSamplingRate() {
        return liveFluencySupportSample.panelMultiGuest;
    }

    public final int getPkPeriodSamplingRate() {
        return liveFluencySupportSample.pkPeriod;
    }

    public final int getPreviewEnterSamplingRate() {
        return liveFluencySupportSample.previewEnter;
    }

    public final int getPreviewPeriodSamplingRate() {
        return liveFluencySupportSample.previewPeriod;
    }

    public final int getRankShowSamplingRate() {
        return liveFluencySupportSample.rankShow;
    }

    public final int getSearchStickerPanelSlideSamplingRate() {
        return liveFluencySupportSample.panelSearchStickerSlide;
    }

    public final int getTopLiveHangoutSamplingRate() {
        return liveFluencySupportSample.topLiveHangout;
    }

    public final int getWatchEnterSamplingRate() {
        return liveFluencySupportSample.watchEnter;
    }

    public final int getWatchPeriodAllSamplingRate() {
        return liveFluencySupportSample.watchPeriodAll;
    }

    public final int getWatchPeriodSamplingRate() {
        return liveFluencySupportSample.watchPeriod;
    }

    public final int getWatchSlideSamplingRate() {
        return liveFluencySupportSample.watchSlide;
    }
}
