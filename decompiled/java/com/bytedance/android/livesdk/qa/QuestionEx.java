package com.bytedance.android.livesdk.qa;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.Question;

/* JADX INFO: loaded from: classes13.dex */
public final class QuestionEx {
    public boolean LIZ;
    public final boolean LIZIZ;

    @C09CT("like_cnt")
    public long likeCount;

    @C09CT("question")
    public Question question;

    @C09CT("self_like_status")
    public int selfLikeStatus;

    public QuestionEx() {
        this(new Question(), 0L, 0, false, false, false, 0L, 0, 0);
    }

    public QuestionEx(Question question, long j, int i, boolean z, boolean z2, boolean z3, long j2, int i2, int i3) {
        this.question = question;
        this.likeCount = j;
        this.selfLikeStatus = i;
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
