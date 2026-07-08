package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class Question {

    @C09CT("answer_from")
    public int answerFrom;

    @C09CT("answer_status")
    public int answerStatus;

    @C09CT("content")
    public String content;

    @C09CT("create_from")
    public int createFrom;

    @C09CT("create_time")
    public long createTime;

    @C09CT("question_id")
    public long questionId;

    @C09CT("rec_req_id")
    public String recReqId;

    @C09CT("user")
    public User user;

    public Question() {
        this.content = "";
        this.recReqId = "";
    }

    public Question(long j, String str, int i, long j2, User user) {
        this.recReqId = "";
        this.questionId = j;
        this.content = str;
        this.answerStatus = i;
        this.createTime = j2;
        this.user = user;
    }
}
