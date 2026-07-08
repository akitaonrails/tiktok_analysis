package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes.dex */
public final class PollBasicInfo {

    @C09CT("gift")
    public Gift gift;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("is_suggested_question")
    public boolean isSuggestedQuestion;

    @C09CT("poll_duration")
    public long pollDuration;

    @C09CT("poll_index")
    public long pollIndex;

    @C09CT("template_id")
    public long templateId;

    @C09CT("time_remain")
    public long timeRemain;

    @C09CT("user_cnt")
    public long userCnt;

    @C09CT("poll_sponsor")
    public String pollSponsor = "";

    @C09CT("title")
    public String title = "";

    @C09CT("poll_id_str")
    public String pollIdStr = "";

    @C09CT("suggested_question_key")
    public String suggestedQuestionKey = "";
}
