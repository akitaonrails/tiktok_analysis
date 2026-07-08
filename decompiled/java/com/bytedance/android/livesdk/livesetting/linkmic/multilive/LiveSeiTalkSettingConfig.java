package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSeiTalkSettingConfig {
    public static final TypeAdapter ADAPTER = new LiveSeiTalkSettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("talk_sei_interval")
    public int seiInterval;

    @C09CT("talk_sei_enable")
    public boolean seiTalkEnable;

    @C09CT("talk_wave_enable")
    public boolean talkWaveEnable;

    @C09CT("min_audio_volume")
    public int volumeThreshold;

    public LiveSeiTalkSettingConfig() {
        this(false, LSPassThroughRecordSizeConfig.DEFAULT, false, 20);
    }

    public LiveSeiTalkSettingConfig(boolean z, int i, boolean z2, int i2) {
        this.seiTalkEnable = z;
        this.seiInterval = i;
        this.talkWaveEnable = z2;
        this.volumeThreshold = i2;
    }
}
