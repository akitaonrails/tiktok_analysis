package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class VolumeMixStreamConfig {
    public static final TypeAdapter ADAPTER = new VolumeMixStreamConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("isAddVolumeValue")
    public boolean addVolume;

    @C09CT("enableVolumeIndication")
    public boolean enableVolumeIndication;

    @C09CT("seiContentMode")
    public int seiContentMode;

    @C09CT("talkVolume")
    public int talkVolumeThreshold;

    @C09CT("volumeIndicationInterval")
    public float volumeIndicationInterval;

    public VolumeMixStreamConfig() {
        this(0.5f, true, 25, true, 1);
    }

    public VolumeMixStreamConfig(float f, boolean z, int i, boolean z2, int i2) {
        this.volumeIndicationInterval = f;
        this.enableVolumeIndication = z;
        this.talkVolumeThreshold = i;
        this.addVolume = z2;
        this.seiContentMode = i2;
    }
}
