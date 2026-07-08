package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
public final class CoHostSeiTalkSettingConfig {
    public static final TypeAdapter ADAPTER = new CoHostSeiTalkSettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("min_audio_volume")
    public int minAudioVolume;

    @C09CT("talk_sei_interval")
    public int seiInterval;

    @C09CT("talk_sei_enable")
    public boolean seiTalkEnable;

    public CoHostSeiTalkSettingConfig() {
        this(false, LSPassThroughRecordSizeConfig.DEFAULT, 20);
    }

    public CoHostSeiTalkSettingConfig(boolean z, int i, int i2) {
        this.seiTalkEnable = z;
        this.seiInterval = i;
        this.minAudioVolume = i2;
    }
}
