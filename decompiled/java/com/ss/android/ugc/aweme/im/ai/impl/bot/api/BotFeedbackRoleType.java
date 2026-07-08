package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BotFeedbackRoleType {

    @C09CT("1")
    public static final BotFeedbackRoleType BOT_FEEDBACK_ROLE_TYPE_CREATOR;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final BotFeedbackRoleType BOT_FEEDBACK_ROLE_TYPE_UNKNOWN;

    @C09CT("2")
    public static final BotFeedbackRoleType BOT_FEEDBACK_ROLE_TYPE_USER;
    public static final /* synthetic */ BotFeedbackRoleType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<BotFeedbackRoleType> getEntries() {
        return LLILLL;
    }

    static {
        BotFeedbackRoleType botFeedbackRoleType = new BotFeedbackRoleType("BOT_FEEDBACK_ROLE_TYPE_UNKNOWN", 0, 0);
        BOT_FEEDBACK_ROLE_TYPE_UNKNOWN = botFeedbackRoleType;
        BotFeedbackRoleType botFeedbackRoleType2 = new BotFeedbackRoleType("BOT_FEEDBACK_ROLE_TYPE_CREATOR", 1, 1);
        BOT_FEEDBACK_ROLE_TYPE_CREATOR = botFeedbackRoleType2;
        BotFeedbackRoleType botFeedbackRoleType3 = new BotFeedbackRoleType("BOT_FEEDBACK_ROLE_TYPE_USER", 2, 2);
        BOT_FEEDBACK_ROLE_TYPE_USER = botFeedbackRoleType3;
        BotFeedbackRoleType[] botFeedbackRoleTypeArr = {botFeedbackRoleType, botFeedbackRoleType2, botFeedbackRoleType3};
        LLILLJJLI = botFeedbackRoleTypeArr;
        LLILLL = new C2254308sP(botFeedbackRoleTypeArr);
    }

    public static BotFeedbackRoleType[] values() {
        return (BotFeedbackRoleType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static BotFeedbackRoleType valueOf(String str) {
        return (BotFeedbackRoleType) C08FF.LIZ(BotFeedbackRoleType.class, str);
    }

    public BotFeedbackRoleType(String str, int i, int i2) {
        this.LL = i2;
    }
}
