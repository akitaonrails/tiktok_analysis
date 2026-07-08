package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBroadcastPicMemOpt {
    public static final TypeAdapter ADAPTER = new LiveBroadcastPicMemOpt_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_time")
    public long delayTime = 10000;

    @C09CT("enable")
    public boolean enable;

    @C09CT("fit_effect_panel_icon_size")
    public boolean fitEffectPanelIconSize;

    @C09CT("fit_sticker_panel_image_size")
    public boolean fitStickerPanelImageSize;

    @C09CT("forbid_preload_invalid_gecko")
    public boolean forbidPreloadInvalidGecko;

    @C09CT("fresco_load_pic_enable_insample")
    public boolean frescoLoadPicEnableInSample;

    @C09CT("opt_gecko_webp_animation_cache")
    public boolean optGeckoWebPAnimationCache;
}
