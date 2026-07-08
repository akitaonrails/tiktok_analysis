package com.bytedance.android.livesdk.activity.quiz.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuizFinalResult {

    @C09CT("anchor_list")
    public List<QuizAnchorInfo> anchorList;

    @C09CT("display_duration_ms")
    public int displayDurationMs;

    @C09CT("extra1")
    public String extra1;

    @C09CT("extra2")
    public String extra2;

    @C09CT("extra3")
    public String extra3;

    @C09CT("extra4")
    public String extra4;

    @C09CT("extra5")
    public String extra5;

    @C09CT("message_type")
    public int messageType;

    @C09CT("next_quiz")
    public List<QuizNextQuiz> nextQuiz;

    @C09CT("question_count")
    public int questionCount;

    @C09CT("quiz_type")
    public int quizType;

    @C09CT("reward_amount")
    public String rewardAmount;

    @C09CT("settled_reward")
    public List<QuizRewardRule> settledReward;

    @C09CT("sponsor_code")
    public String sponsorCode;

    @C09CT("quiz_id")
    public String quizId = "";

    @C09CT("extra")
    public String extra = "";

    public QuizFinalResult() {
        C13BV c13bv = C13BV.INSTANCE;
        this.settledReward = c13bv;
        this.nextQuiz = c13bv;
        this.rewardAmount = "";
        this.extra1 = "";
        this.extra2 = "";
        this.extra3 = "";
        this.extra4 = "";
        this.extra5 = "";
        this.anchorList = c13bv;
        this.sponsorCode = "";
    }
}
