package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class MultiGuestLiveShowConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("animation_downgrade_enabled")
    public int animationDowngradeEnabled;

    @C09CT("audience_main_switch")
    public int audienceMainSwitch;

    @C09CT("banner_refresh_shuffle_time")
    public int bannerRefreshShuffleTime;

    @C09CT("calibrate_content_time")
    public int calibrateContentTime;

    @C09CT("enable_calibrate_content")
    public int enableCalibrateContent;

    @C09CT("initial_allow_open_mic")
    public int initialAllowOpenMic;

    @C09CT("mute_audio_im_back_up")
    public int muteAudioImBackUp;

    @C09CT("new_version")
    public int newVersion;

    @C09CT("start_animation_duration")
    public int startAnimationDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestLiveShowConfig_OptTypeAdapter();
    }

    public MultiGuestLiveShowConfig() {
        this(1, 0, 2870, 4, 5, 0, 4, 0, -1);
    }

    public MultiGuestLiveShowConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.audienceMainSwitch = i;
        this.initialAllowOpenMic = i2;
        this.newVersion = i3;
        this.bannerRefreshShuffleTime = i4;
        this.calibrateContentTime = i5;
        this.animationDowngradeEnabled = i6;
        this.startAnimationDuration = i7;
        this.enableCalibrateContent = i8;
        this.muteAudioImBackUp = i9;
    }
}
