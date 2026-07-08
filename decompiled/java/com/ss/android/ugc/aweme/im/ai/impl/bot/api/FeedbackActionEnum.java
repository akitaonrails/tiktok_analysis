package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackActionEnum {

    @C09CT("2")
    public static final FeedbackActionEnum FEEDBACK_ACTION_ENUM_DISLIKE;

    @C09CT("1")
    public static final FeedbackActionEnum FEEDBACK_ACTION_ENUM_LIKE;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final FeedbackActionEnum FEEDBACK_ACTION_ENUM_UNKNOWN;
    public static final /* synthetic */ FeedbackActionEnum[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<FeedbackActionEnum> getEntries() {
        return LLILLL;
    }

    static {
        FeedbackActionEnum feedbackActionEnum = new FeedbackActionEnum("FEEDBACK_ACTION_ENUM_UNKNOWN", 0, 0);
        FEEDBACK_ACTION_ENUM_UNKNOWN = feedbackActionEnum;
        FeedbackActionEnum feedbackActionEnum2 = new FeedbackActionEnum("FEEDBACK_ACTION_ENUM_LIKE", 1, 1);
        FEEDBACK_ACTION_ENUM_LIKE = feedbackActionEnum2;
        FeedbackActionEnum feedbackActionEnum3 = new FeedbackActionEnum("FEEDBACK_ACTION_ENUM_DISLIKE", 2, 2);
        FEEDBACK_ACTION_ENUM_DISLIKE = feedbackActionEnum3;
        FeedbackActionEnum[] feedbackActionEnumArr = {feedbackActionEnum, feedbackActionEnum2, feedbackActionEnum3};
        LLILLJJLI = feedbackActionEnumArr;
        LLILLL = new C2254308sP(feedbackActionEnumArr);
    }

    public static FeedbackActionEnum[] values() {
        return (FeedbackActionEnum[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static FeedbackActionEnum valueOf(String str) {
        return (FeedbackActionEnum) C08FF.LIZ(FeedbackActionEnum.class, str);
    }

    public FeedbackActionEnum(String str, int i, int i2) {
        this.LL = i2;
    }
}
