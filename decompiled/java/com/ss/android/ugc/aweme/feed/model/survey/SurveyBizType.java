package com.ss.android.ugc.aweme.feed.model.survey;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SurveyBizType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SurveyBizType[] $VALUES;
    public static final SurveyBizType CLA = new SurveyBizType("CLA", 0, 1);
    public static final SurveyBizType PROMPT_LYNX = new SurveyBizType("PROMPT_LYNX", 1, 2);
    public int value;

    public static final /* synthetic */ SurveyBizType[] $values() {
        return new SurveyBizType[]{CLA, PROMPT_LYNX};
    }

    public static InterfaceC2044707zh<SurveyBizType> getEntries() {
        return $ENTRIES;
    }

    static {
        SurveyBizType[] surveyBizTypeArr$values = $values();
        $VALUES = surveyBizTypeArr$values;
        $ENTRIES = new C2254308sP(surveyBizTypeArr$values);
    }

    public static SurveyBizType[] values() {
        return (SurveyBizType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static SurveyBizType valueOf(String str) {
        return (SurveyBizType) C08FF.LIZ(SurveyBizType.class, str);
    }

    public final void setValue(int i) {
        this.value = i;
    }

    public SurveyBizType(String str, int i, int i2) {
        this.value = i2;
    }
}
