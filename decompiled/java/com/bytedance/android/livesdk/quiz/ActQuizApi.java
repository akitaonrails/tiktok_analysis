package com.bytedance.android.livesdk.quiz;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.activity_quiz.QueryUserIdentityResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ActQuizApi {
    @InterfaceC1501160pAQ("/webcast/activity/trivia/answer/query_user_identity")
    C11NZ<C470590Icr<QueryUserIdentityResponse>> queryUserIdentity(@InterfaceC1501070pAH("room_id") String str);
}
