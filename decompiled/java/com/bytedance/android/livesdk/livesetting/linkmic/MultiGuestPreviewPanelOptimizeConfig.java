package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPreviewPanelOptimizeConfig {
    public static final TypeAdapter ADAPTER = new MultiGuestPreviewPanelOptimizeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_shake")
    public boolean enableShake;

    @C09CT("enable_video_audio_memory")
    public boolean enableVideoAudioMemory;

    @C09CT("remove_count_down_preview")
    public boolean removeCountDownPreview;

    public MultiGuestPreviewPanelOptimizeConfig() {
        this(false, false, false);
    }

    public MultiGuestPreviewPanelOptimizeConfig(boolean z, boolean z2, boolean z3) {
        this.removeCountDownPreview = z;
        this.enableVideoAudioMemory = z2;
        this.enableShake = z3;
    }
}
