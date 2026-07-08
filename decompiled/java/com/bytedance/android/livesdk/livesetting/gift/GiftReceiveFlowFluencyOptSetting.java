package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_receive_flow_fluency_opt_setting")
public final class GiftReceiveFlowFluencyOptSetting {
    public static final GiftReceiveFlowFluencyOptParams DEFAULT;
    public static final GiftReceiveFlowFluencyOptSetting INSTANCE = new GiftReceiveFlowFluencyOptSetting();
    public static final GiftReceiveFlowFluencyOptParams OPT;
    public static final boolean assetsModelCacheOpt;
    public static final boolean asyncReportEvent;
    public static final boolean asyncReportEventV2;
    public static final GiftReceiveFlowFluencyOptParams config;
    public static final boolean enabled;
    public static final boolean guestCacheAssetsModelWhenLinkmic;
    public static final boolean lazyInitRenderSDK;
    public static final boolean preloadAssetsModel;
    public static final boolean preloadEffectForSender;
    public static final long skipGiftMsgDelayInMs;
    public static final boolean skipGiftMsgInBackground;

    static {
        GiftReceiveFlowFluencyOptParams giftReceiveFlowFluencyOptParams = new GiftReceiveFlowFluencyOptParams(false, false, false, false, false, false, false, false, false, 80L);
        DEFAULT = giftReceiveFlowFluencyOptParams;
        GiftReceiveFlowFluencyOptParams giftReceiveFlowFluencyOptParams2 = new GiftReceiveFlowFluencyOptParams(false, false, false, false, false, false, false, false, false, 80L);
        giftReceiveFlowFluencyOptParams2.isEnable = true;
        giftReceiveFlowFluencyOptParams2.preloadEffectForSender = true;
        giftReceiveFlowFluencyOptParams2.preloadAssetsModel = true;
        giftReceiveFlowFluencyOptParams2.lazyInitRenderSDK = true;
        giftReceiveFlowFluencyOptParams2.assetsModelCacheOpt = true;
        giftReceiveFlowFluencyOptParams2.guestCacheAssetsModeLWhenLinkmic = true;
        giftReceiveFlowFluencyOptParams2.asyncReportEvent = true;
        giftReceiveFlowFluencyOptParams2.asyncReportEventV2 = true;
        giftReceiveFlowFluencyOptParams2.skipGiftMsgInBackground = true;
        OPT = giftReceiveFlowFluencyOptParams2;
        GiftReceiveFlowFluencyOptParams giftReceiveFlowFluencyOptParams3 = (GiftReceiveFlowFluencyOptParams) SettingsManager.INSTANCE.getValueSafely("gift_receive_flow_fluency_opt_setting", giftReceiveFlowFluencyOptParams);
        if (giftReceiveFlowFluencyOptParams3 != null) {
            giftReceiveFlowFluencyOptParams = giftReceiveFlowFluencyOptParams3;
        }
        config = giftReceiveFlowFluencyOptParams;
        enabled = giftReceiveFlowFluencyOptParams.isEnable;
        preloadEffectForSender = giftReceiveFlowFluencyOptParams.preloadEffectForSender;
        preloadAssetsModel = giftReceiveFlowFluencyOptParams.preloadAssetsModel;
        lazyInitRenderSDK = giftReceiveFlowFluencyOptParams.lazyInitRenderSDK;
        assetsModelCacheOpt = giftReceiveFlowFluencyOptParams.assetsModelCacheOpt;
        guestCacheAssetsModelWhenLinkmic = giftReceiveFlowFluencyOptParams.guestCacheAssetsModeLWhenLinkmic;
        asyncReportEvent = giftReceiveFlowFluencyOptParams.asyncReportEvent;
        asyncReportEventV2 = giftReceiveFlowFluencyOptParams.asyncReportEventV2;
        skipGiftMsgInBackground = giftReceiveFlowFluencyOptParams.skipGiftMsgInBackground;
        skipGiftMsgDelayInMs = giftReceiveFlowFluencyOptParams.skipGiftMsgDelayInMs;
    }

    public final boolean getAssetsModelCacheOpt() {
        return assetsModelCacheOpt;
    }

    public final boolean getAsyncReportEvent() {
        return asyncReportEvent;
    }

    public final boolean getAsyncReportEventV2() {
        return asyncReportEventV2;
    }

    public final GiftReceiveFlowFluencyOptParams getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final boolean getGuestCacheAssetsModelWhenLinkmic() {
        return guestCacheAssetsModelWhenLinkmic;
    }

    public final boolean getLazyInitRenderSDK() {
        return lazyInitRenderSDK;
    }

    public final GiftReceiveFlowFluencyOptParams getOPT() {
        return OPT;
    }

    public final boolean getPreloadAssetsModel() {
        return preloadAssetsModel;
    }

    public final boolean getPreloadEffectForSender() {
        return preloadEffectForSender;
    }

    public final long getSkipGiftMsgDelayInMs() {
        return skipGiftMsgDelayInMs;
    }

    public final boolean getSkipGiftMsgInBackground() {
        return skipGiftMsgInBackground;
    }

    public static final class GiftReceiveFlowFluencyOptParams {
        public static final TypeAdapter ADAPTER = new GiftReceiveFlowFluencyOptSetting_GiftReceiveFlowFluencyOptParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("assets_model_cache_opt")
        public boolean assetsModelCacheOpt;

        @C09CT("async_report_event")
        public boolean asyncReportEvent;

        @C09CT("async_report_event_v2")
        public boolean asyncReportEventV2;

        @C09CT("guest_cache_assets_model_when_linkmic")
        public boolean guestCacheAssetsModeLWhenLinkmic;

        @C09CT("enable")
        public boolean isEnable;

        @C09CT("lazy_init_render_sdk")
        public boolean lazyInitRenderSDK;

        @C09CT("preload_assets_model")
        public boolean preloadAssetsModel;

        @C09CT("preload_effect_for_sender")
        public boolean preloadEffectForSender;

        @C09CT("skip_gift_msg_delay_in_ms")
        public long skipGiftMsgDelayInMs;

        @C09CT("skip_gift_msg_in_background")
        public boolean skipGiftMsgInBackground;

        public GiftReceiveFlowFluencyOptParams() {
            this(false, false, false, false, false, false, false, false, false, 80L);
        }

        public GiftReceiveFlowFluencyOptParams(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j) {
            this.isEnable = z;
            this.preloadEffectForSender = z2;
            this.preloadAssetsModel = z3;
            this.lazyInitRenderSDK = z4;
            this.assetsModelCacheOpt = z5;
            this.guestCacheAssetsModeLWhenLinkmic = z6;
            this.asyncReportEvent = z7;
            this.asyncReportEventV2 = z8;
            this.skipGiftMsgInBackground = z9;
            this.skipGiftMsgDelayInMs = j;
        }
    }
}
