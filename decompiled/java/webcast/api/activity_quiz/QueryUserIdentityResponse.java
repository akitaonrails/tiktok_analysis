package webcast.api.activity_quiz;

import X.C09CT;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;

/* JADX INFO: loaded from: classes.dex */
public final class QueryUserIdentityResponse {

    @C09CT("body")
    public QuizUserIdentityInfo body;

    @C09CT("primary_id")
    public String primaryId = "";

    @C09CT("retain_device_id")
    public String retainDeviceId = "";

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("version")
    public long version;
}
