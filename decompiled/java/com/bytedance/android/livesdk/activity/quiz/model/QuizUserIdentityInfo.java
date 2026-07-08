package com.bytedance.android.livesdk.activity.quiz.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuizUserIdentityInfo {

    @C09CT("available_double_bonus_balance")
    public int availableDoubleBonusBalance;

    @C09CT("available_respawn_balance")
    public int availableRespawnBalance;

    @C09CT("double_bonus_balance")
    public int doubleBonusBalance;

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

    @C09CT("is_question_encrypt")
    public boolean isQuestionEncrypt;

    @C09CT("is_retain_if_wrong")
    public boolean isRetainIfWrong;

    @C09CT("message_type")
    public int messageType;

    @C09CT("quiz_type")
    public int quizType;

    @C09CT("respawn_balance")
    public int respawnBalance;

    @C09CT("spectator_type")
    public int spectatorType;

    @C09CT("user_data_version")
    public int userDataVersion;

    @C09CT("user_identity_infos")
    public List<QuizUserIdentityInfo> userIdentityInfos;

    @C09CT("user_live_event_infos")
    public List<UserLiveEventInfo> userLiveEventInfos;

    @C09CT("user_question_result")
    public List<QuizUserQuestionResult> userQuestionResult;

    @C09CT("user_status")
    public int userStatus;

    @C09CT("quiz_id")
    public String quizId = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("device_id")
    public String deviceId = "";

    @C09CT("question_encrypt_key")
    public String questionEncryptKey = "";

    public QuizUserIdentityInfo() {
        C13BV c13bv = C13BV.INSTANCE;
        this.userQuestionResult = c13bv;
        this.userLiveEventInfos = c13bv;
        this.extra1 = "";
        this.extra2 = "";
        this.extra3 = "";
        this.extra4 = "";
        this.extra5 = "";
        this.userIdentityInfos = c13bv;
    }
}
