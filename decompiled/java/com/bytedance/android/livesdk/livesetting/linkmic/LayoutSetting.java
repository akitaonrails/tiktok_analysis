package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LayoutSetting {
    public static final TypeAdapter ADAPTER = new LayoutSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("user_follow_v2")
    public boolean followV2;

    @C09CT("opt_ab_params")
    public boolean optAbParams;

    @C09CT("opt_bg")
    public boolean optBg;

    @C09CT("opt_feed_leak")
    public boolean optFeedLeak;

    @C09CT("opt_feed_wava")
    public boolean optFeedWave;

    @C09CT("opt_not_match_anchor")
    public boolean optNotMatchAnchor;

    @C09CT("opt_not_match_guest")
    public boolean optNotMatchGuest;

    @C09CT("opt_preview_widget")
    public boolean optPreviewWidget;

    @C09CT("use_avatar_cache")
    public boolean useAvatarCache;

    @C09CT("use_mask_cache")
    public boolean useMaskCache;

    @C09CT("use_rust_mix_stream")
    public boolean useRustMixStream;

    @C09CT("use_voice_wave_layer")
    public boolean useVoiceWaveLayer;

    public LayoutSetting() {
        this(false, false, true, false, true, true, true, true, true, true, true, false);
    }

    public LayoutSetting(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.useVoiceWaveLayer = z;
        this.useMaskCache = z2;
        this.useAvatarCache = z3;
        this.optBg = z4;
        this.followV2 = z5;
        this.optPreviewWidget = z6;
        this.optAbParams = z7;
        this.optFeedLeak = z8;
        this.optFeedWave = z9;
        this.optNotMatchAnchor = z10;
        this.optNotMatchGuest = z11;
        this.useRustMixStream = z12;
    }
}
