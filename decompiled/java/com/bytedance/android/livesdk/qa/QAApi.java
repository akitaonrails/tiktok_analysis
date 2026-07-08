package com.bytedance.android.livesdk.qa;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes13.dex */
public interface QAApi {
    @InterfaceC1501170pAR("/webcast/interaction/question/answer/end/")
    C11NZ<C470590Icr> endAnswer(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("question_id") long j2);

    @InterfaceC1501170pAR("/webcast/interaction/question/recommend/")
    C11NZ<C470590Icr<QuestionList>> getRecommendQuestion(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("page_num") int i, @InterfaceC1501070pAH("from") int i2);

    @InterfaceC1501170pAR("/webcast/interaction/question/recommend/")
    C11NZ<C470590Icr<QuestionList>> getTryModeRecommendQuestion(@InterfaceC1501070pAH("mock_room_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("page_num") int i, @InterfaceC1501070pAH("from") int i2);

    @InterfaceC1501170pAR("/webcast/interaction/question/current/")
    C11NZ<C470590Icr<CurrentQuestionResponse>> queryCurrentQuestion(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/webcast/interaction/question/answer/start/")
    C11NZ<C470590Icr<StartAnswerResponse>> startAnswer(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("question_id") long j2, @InterfaceC1501070pAH("from") int i);
}
