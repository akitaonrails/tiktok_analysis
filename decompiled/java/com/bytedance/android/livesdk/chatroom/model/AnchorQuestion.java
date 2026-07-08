package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorQuestion {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("question_type")
    public int questionType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("question")
    public String question = "";

    @C09CT("answer_options")
    public String answerOptions = "";
}
