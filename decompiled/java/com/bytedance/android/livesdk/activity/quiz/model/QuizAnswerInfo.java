package com.bytedance.android.livesdk.activity.quiz.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuizAnswerInfo {

    @C09CT("correct_answer")
    public String correctAnswer;

    @C09CT("correct_answer_image")
    public List<QuizImage> correctAnswerImage;

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

    @C09CT("image")
    public List<QuizImage> image;

    @C09CT("message_type")
    public int messageType;

    @C09CT("next_quiz")
    public List<QuizNextQuiz> nextQuiz;

    @C09CT("options")
    public List<QuizQuestionOption> options;

    @C09CT("participants_count")
    public long participantsCount;

    @C09CT("question_count")
    public int questionCount;

    @C09CT("question_no")
    public int questionNo;

    @C09CT("question_type")
    public int questionType;

    @C09CT("quiz_type")
    public int quizType;

    @C09CT("reward_amount")
    public String rewardAmount;

    @C09CT("sponsor_code")
    public String sponsorCode;

    @C09CT("statistics")
    public QuizStatistics statistics;

    @C09CT("quiz_id")
    public String quizId = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("question_id")
    public String questionId = "";

    @C09CT("title")
    public String title = "";

    public QuizAnswerInfo() {
        C13BV c13bv = C13BV.INSTANCE;
        this.image = c13bv;
        this.options = c13bv;
        this.correctAnswer = "";
        this.nextQuiz = c13bv;
        this.rewardAmount = "";
        this.correctAnswerImage = c13bv;
        this.extra1 = "";
        this.extra2 = "";
        this.extra3 = "";
        this.extra4 = "";
        this.extra5 = "";
        this.sponsorCode = "";
    }
}
