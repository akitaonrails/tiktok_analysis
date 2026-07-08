package com.bytedance.android.livesdk.livesetting.strategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class GiftGuideASRConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("sei_min_interval_sec")
    public int seiMinIntervalSec;

    @C09CT("threshold")
    public Float threshold;

    @C09CT("task_delay_min")
    public int taskDelayMin = 2;

    @C09CT("duration_after_success_inference_sec")
    public int durationAfterSuccessSec = 120;

    @C09CT("sei_sending_count")
    public int seiSendingCount = 5;

    @C09CT("audio_process_interval")
    public int audioProcessInterval = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("sei_version")
    public int seiVersion = 1;

    static {
        NormalGson.singleton();
        ADAPTER = new GiftGuideASRConfig_OptTypeAdapter();
    }
}
