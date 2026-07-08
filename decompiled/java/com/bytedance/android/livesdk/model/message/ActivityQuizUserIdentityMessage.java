package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityQuizUserIdentityMessage extends AbstractC1136060ffY {

    @C09CT("body")
    public QuizUserIdentityInfo body;

    @C09CT("primary_id")
    public String primaryId;

    @C09CT("retain_device_id")
    public String retainDeviceId;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("version")
    public long version;

    public ActivityQuizUserIdentityMessage() {
        this.type = C001A.ACTIVITY_QUIZ_USER_IDENTITY_MESSAGE;
        this.primaryId = "";
        this.retainDeviceId = "";
    }
}
