package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractionLayoutNewEventConfig {
    public static final TypeAdapter ADAPTER = new InteractionLayoutNewEventConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("draw_result_frame_times")
    public int drawResultFrameTimes;

    @C09CT("enable")
    public boolean isEnabled;

    @C09CT("layout_pipeline_stage_timeout")
    public long layoutPipelineStageTimeout;

    @C09CT("monitor_tags")
    public List<String> monitorTags;

    public InteractionLayoutNewEventConfig() {
        this(true, C1697810uHb.LJ("biz_link_mic_view_p", "biz_gameplay_view_p", "biz_gameplay_view_p", "biz_score_bar", "biz_contributor"), 3, 3000L);
    }

    public InteractionLayoutNewEventConfig(boolean z, List<String> list, int i, long j) {
        this.isEnabled = z;
        this.monitorTags = list;
        this.drawResultFrameTimes = i;
        this.layoutPipelineStageTimeout = j;
    }
}
