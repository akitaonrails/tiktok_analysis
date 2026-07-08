package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LetsDanceConfig {
    public static final TypeAdapter ADAPTER = new LetsDanceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("bubble_switch")
    public boolean bubbleSwitch;

    @C09CT("effect_sdk_init_judge")
    public boolean effectSdkInitJudge;

    @C09CT("main_spot_water_mask_url")
    public String mainSpotWaterMaskUrl;

    @C09CT("mock_switch")
    public boolean mockSwitch;

    @C09CT("participant_lets_dance_enabled")
    public boolean participantLetsDanceEnabled;

    @C09CT("particle_animation_tolerance_time")
    public int particleAnimationToleranceTime;

    @C09CT("particle_animation_type")
    public int particleAnimationType;

    @C09CT("replace_moderator_play_mutex_toast")
    public boolean replaceModeratorPlayMutexToast;

    @C09CT("score_effect_resource_id")
    public String scoreEffectResourceId;

    @C09CT("shared_background_resource_id")
    public String sharedBackgroundResourceId;

    @C09CT("shared_bg_surface_view_enabled")
    public boolean sharedBgSurfaceViewEnabled;

    @C09CT("show_preview_panel")
    public boolean showPreviewPanel;

    public LetsDanceConfig() {
        this("7599509308841136641", 2, 2, "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/just_dance_v1_x1.png~tplv-0gv1ynv35u-image.image", true, true, "7603370640413823489", false, true, true, true, true);
    }

    public LetsDanceConfig(String str, int i, int i2, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.sharedBackgroundResourceId = str;
        this.particleAnimationType = i;
        this.particleAnimationToleranceTime = i2;
        this.mainSpotWaterMaskUrl = str2;
        this.replaceModeratorPlayMutexToast = z;
        this.participantLetsDanceEnabled = z2;
        this.scoreEffectResourceId = str3;
        this.bubbleSwitch = z3;
        this.sharedBgSurfaceViewEnabled = z4;
        this.mockSwitch = z5;
        this.showPreviewPanel = z6;
        this.effectSdkInitJudge = z7;
    }
}
