package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchBeansConfigData {
    public static final TypeAdapter ADAPTER = new LiveMatchBeansConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean anchor_enabled;

    @C09CT("audience_enable")
    public boolean audience_enabled;

    @C09CT("resource_id")
    public String catch_beans_resource_id;

    @C09CT("final_score_message_waiting_max_duration")
    public long final_score_message_waiting_max_duration;

    @C09CT("final_score_send_interval")
    public int final_score_send_interval;

    @C09CT("final_score_send_max_counts")
    public int final_score_send_max_counts;

    @C09CT("game_duration")
    public long game_duration;

    @C09CT("score_message_repeat_times")
    public int score_message_repeat_times;

    @C09CT("score_sync_period")
    public int score_sync_period;

    @C09CT("sei_result_waiting_max_duration")
    public long sei_result_waiting_max_duration;

    @C09CT("settlement_duration")
    public int settlement_duration;

    @C09CT("volume")
    public float volume;

    public LiveMatchBeansConfigData() {
        this(false, true, 2, 3, 3, 5, 1, 3L, 10L, 180L, 0.2f, "7401143682998473217");
    }

    public LiveMatchBeansConfigData(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, float f, String str) {
        this.anchor_enabled = z;
        this.audience_enabled = z2;
        this.score_sync_period = i;
        this.score_message_repeat_times = i2;
        this.final_score_send_max_counts = i3;
        this.settlement_duration = i4;
        this.final_score_send_interval = i5;
        this.final_score_message_waiting_max_duration = j;
        this.sei_result_waiting_max_duration = j2;
        this.game_duration = j3;
        this.volume = f;
        this.catch_beans_resource_id = str;
    }
}
