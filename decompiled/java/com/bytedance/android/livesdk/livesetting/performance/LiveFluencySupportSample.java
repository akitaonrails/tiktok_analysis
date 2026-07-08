package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveFluencySupportSample {
    public static final TypeAdapter ADAPTER;

    @C09CT("anchor_panel_gift_slide")
    public int anchorPanelGiftSlide;

    @C09CT("anchor_panel_gift_slide_compose")
    public int anchorPanelGiftSlideCompose;

    @C09CT("board_metrics")
    public int boardMetrics;

    @C09CT("broadcast_enter")
    public int broadcastEnter;

    @C09CT("broadcast_link_period")
    public int broadcastLinkPeriod;

    @C09CT("broadcast_period")
    public int broadcastPeriod;

    @C09CT("broadcast_period_all")
    public int broadcastPeriodAll;

    @C09CT("drawer")
    public int drawerOpenPeriod;

    @C09CT("gift_play")
    public int giftPlay;

    @C09CT("link_mic_role_period")
    public int linkMicRolePeriod;

    @C09CT("multi_guest_layout")
    public int multiGuestLayout;

    @C09CT("panel_beauty_slide")
    public int panelBeautySlide;

    @C09CT("panel_broadcast_link_slide")
    public int panelBroadcastLinkSlide;

    @C09CT("panel_comment_close")
    public int panelCommentClose;

    @C09CT("panel_comment_open")
    public int panelCommentOpen;

    @C09CT("panel_comment_period")
    public int panelCommentPeriod;

    @C09CT("panel_effect_slide")
    public int panelEffectSlide;

    @C09CT("panel_extended_public_screen_auto_slide")
    public int panelExtendedPublicScreenAutoSlide;

    @C09CT("panel_extended_public_screen_slide")
    public int panelExtendedPublicScreenSlide;

    @C09CT("panel_filter_slide")
    public int panelFilterSlide;

    @C09CT("panel_gift_slide")
    public int panelGiftSlide;

    @C09CT("panel_hourly_rank_slide")
    public int panelHourlyRankSlide;

    @C09CT("panel_multi_guest")
    public int panelMultiGuest;

    @C09CT("panel_public_screen_auto_slide")
    public int panelPublicScreenAutoSlide;

    @C09CT("panel_public_screen_slide")
    public int panelPublicScreenSlide;

    @C09CT("panel_recharge_slide")
    public int panelRechargeSlide;

    @C09CT("panel_search_sticker_slide")
    public int panelSearchStickerSlide;

    @C09CT("panel_sound_slide")
    public int panelSoundSlide;

    @C09CT("panel_sticker_slide")
    public int panelStickerSlide;

    @C09CT("pk_period")
    public int pkPeriod;

    @C09CT("preview_enter")
    public int previewEnter;

    @C09CT("preview_period")
    public int previewPeriod;

    @C09CT("rank_show")
    public int rankShow;

    @C09CT("top_live_hangout")
    public int topLiveHangout;

    @C09CT("watch_enter")
    public int watchEnter;

    @C09CT("watch_period")
    public int watchPeriod;

    @C09CT("watch_period_all")
    public int watchPeriodAll;

    @C09CT("watch_slide")
    public int watchSlide;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveFluencySupportSample_OptTypeAdapter();
    }

    public LiveFluencySupportSample() {
        this(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1, 10, 10, 10, 10, 10, 10, 10, 10, 1, 1);
    }

    public LiveFluencySupportSample(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
        this.watchEnter = i;
        this.watchSlide = i2;
        this.watchPeriod = i3;
        this.watchPeriodAll = i4;
        this.broadcastEnter = i5;
        this.broadcastPeriod = i6;
        this.broadcastPeriodAll = i7;
        this.previewEnter = i8;
        this.previewPeriod = i9;
        this.broadcastLinkPeriod = i10;
        this.pkPeriod = i11;
        this.giftPlay = i12;
        this.panelGiftSlide = i13;
        this.anchorPanelGiftSlide = i14;
        this.anchorPanelGiftSlideCompose = i15;
        this.panelRechargeSlide = i16;
        this.panelHourlyRankSlide = i17;
        this.panelBroadcastLinkSlide = i18;
        this.panelPublicScreenSlide = i19;
        this.panelPublicScreenAutoSlide = i20;
        this.panelExtendedPublicScreenSlide = i21;
        this.panelExtendedPublicScreenAutoSlide = i22;
        this.panelBeautySlide = i23;
        this.panelFilterSlide = i24;
        this.panelStickerSlide = i25;
        this.panelSoundSlide = i26;
        this.panelMultiGuest = i27;
        this.topLiveHangout = i28;
        this.linkMicRolePeriod = i29;
        this.rankShow = i30;
        this.panelEffectSlide = i31;
        this.panelSearchStickerSlide = i32;
        this.drawerOpenPeriod = i33;
        this.panelCommentOpen = i34;
        this.panelCommentPeriod = i35;
        this.panelCommentClose = i36;
        this.multiGuestLayout = i37;
        this.boardMetrics = i38;
    }
}
