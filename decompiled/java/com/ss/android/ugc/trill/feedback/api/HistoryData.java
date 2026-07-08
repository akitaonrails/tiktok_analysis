package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class HistoryData implements Serializable {
    public static final int $stable = 0;

    @C09CT("feedback_id")
    public final Integer feedbackId;

    @C09CT("has_reply")
    public final Boolean hasReply;

    public HistoryData() {
        this(0, Boolean.FALSE);
    }

    public HistoryData(Integer num, Boolean bool) {
        this.feedbackId = num;
        this.hasReply = bool;
    }
}
