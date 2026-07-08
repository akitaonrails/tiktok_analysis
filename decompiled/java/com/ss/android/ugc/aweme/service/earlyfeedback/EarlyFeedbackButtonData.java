package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class EarlyFeedbackButtonData {

    @C09CT("ab_group")
    public final int abGroup;

    @C09CT("block_duration_sec")
    public final long blockDurationSec;

    @C09CT("block_skip_duration_sec")
    public final long blockSkipDurationSec;

    @C09CT("questionnaires")
    public final List<QuestionnaireData> correctedQuestionnaires;

    @C09CT("design")
    public final int design;

    @C09CT("display_delay_sec")
    public final long displayDelaySec;

    @C09CT("expiration_offset_hours_end")
    public final long expirationOffsetHoursEnd;

    @C09CT("expiration_offset_hours_start")
    public final long expirationOffsetHoursStart;

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("max_skip_count")
    public final int maxSkipCount;

    @C09CT("min_vv_interval")
    public final int minVvInterval;

    @C09CT("questionnairs")
    public final List<QuestionnaireData> questionnaires;

    @C09CT("ratio")
    public final double ratio;

    @C09CT("start_vv_index")
    public final int startVvIndex;

    @C09CT("vv_threshold")
    public final int vvThreshold;

    public EarlyFeedbackButtonData() {
        this(0, false, 0.0d, -1, -1L, -1L, -1, 0, Integer.MAX_VALUE, -1, null, null, -1L, -1L, 0L);
    }

    public EarlyFeedbackButtonData(int i, boolean z, double d, int i2, long j, long j2, int i3, int i4, int i5, int i6, List<QuestionnaireData> list, List<QuestionnaireData> list2, long j3, long j4, long j5) {
        this.abGroup = i;
        this.isEnable = z;
        this.ratio = d;
        this.vvThreshold = i2;
        this.expirationOffsetHoursStart = j;
        this.expirationOffsetHoursEnd = j2;
        this.design = i3;
        this.minVvInterval = i4;
        this.maxSkipCount = i5;
        this.startVvIndex = i6;
        this.questionnaires = list;
        this.correctedQuestionnaires = list2;
        this.blockSkipDurationSec = j3;
        this.blockDurationSec = j4;
        this.displayDelaySec = j5;
    }
}
