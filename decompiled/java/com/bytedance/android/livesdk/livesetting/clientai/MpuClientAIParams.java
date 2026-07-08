package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class MpuClientAIParams {
    public static final TypeAdapter ADAPTER = new MpuClientAIParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("match_time_left_special_moment")
    public List<Long> matchTimeLiftSpecialMoment;

    @C09CT("match_score_change_frequency_control")
    public long scoreChangeFrequencyControl;

    @C09CT("match_score_report_end")
    public long scoreReportEnd;

    @C09CT("match_score_report_start")
    public long scoreReportStart;

    public MpuClientAIParams() {
        this(null, 0L, 0L, 0L, 15, null);
    }

    public MpuClientAIParams(List<Long> list, long j, long j2, long j3) {
        this.matchTimeLiftSpecialMoment = list;
        this.scoreChangeFrequencyControl = j;
        this.scoreReportStart = j2;
        this.scoreReportEnd = j3;
    }

    public MpuClientAIParams(List list, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList(12L) : list, (i & 2) != 0 ? 2L : j, (i & 4) == 0 ? j2 : 12L, (i & 8) != 0 ? 3L : j3);
    }
}
