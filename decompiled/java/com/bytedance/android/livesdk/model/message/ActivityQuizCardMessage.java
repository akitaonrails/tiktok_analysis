package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.activity.quiz.model.QuizAnswerInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizCallUpWebview;
import com.bytedance.android.livesdk.activity.quiz.model.QuizFinalResult;
import com.bytedance.android.livesdk.activity.quiz.model.QuizQuestionInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRulesIntroduction;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityQuizCardMessage extends AbstractC1136060ffY {

    @C09CT("answer")
    public QuizAnswerInfo answer;

    @C09CT("call_up_webview")
    public QuizCallUpWebview callUpWebview;

    @C09CT("expired_time")
    public long expiredTime;

    @C09CT("final_result")
    public QuizFinalResult finalResult;

    @C09CT("primary_id")
    public String primaryId;

    @C09CT("question")
    public QuizQuestionInfo question;

    @C09CT("rules_introduction")
    public QuizRulesIntroduction rulesIntroduction;

    @C09CT("schema")
    public String schema;

    @C09CT("sei_delay_bias")
    public long seiDelayBias;

    @C09CT("sei_delay_multiple")
    public float seiDelayMultiple;

    @C09CT("timestamp")
    public long timestamp;

    public ActivityQuizCardMessage() {
        this.type = C001A.ACTIVITY_QUIZ_CARD_MESSAGE;
        this.schema = "";
        this.primaryId = "";
        System.currentTimeMillis();
    }
}
