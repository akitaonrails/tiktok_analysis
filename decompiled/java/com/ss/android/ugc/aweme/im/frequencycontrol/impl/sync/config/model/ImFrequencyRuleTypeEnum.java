package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model;

import X.C08FF;
import X.C09CT;
import X.C12972055u;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ImFrequencyRuleTypeEnum {
    public static final C12972055u Companion;

    @C09CT("ExecuteLoopRule")
    public static final ImFrequencyRuleTypeEnum EXECUTE_LOOP;
    public static final /* synthetic */ ImFrequencyRuleTypeEnum[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;

    @C09CT("MaxCountAndMaxDurationRule")
    public static final ImFrequencyRuleTypeEnum MAX_COUNT_AND_MAX_DURATION;

    @C09CT("MaxTimesRule")
    public static final ImFrequencyRuleTypeEnum MAX_TIMES;

    @C09CT("")
    public static final ImFrequencyRuleTypeEnum UNKNOWN;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<ImFrequencyRuleTypeEnum> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.055u] */
    static {
        ImFrequencyRuleTypeEnum imFrequencyRuleTypeEnum = new ImFrequencyRuleTypeEnum("UNKNOWN", 0, "", 0);
        UNKNOWN = imFrequencyRuleTypeEnum;
        ImFrequencyRuleTypeEnum imFrequencyRuleTypeEnum2 = new ImFrequencyRuleTypeEnum("MAX_TIMES", 1, "MaxTimesRule", 1);
        MAX_TIMES = imFrequencyRuleTypeEnum2;
        ImFrequencyRuleTypeEnum imFrequencyRuleTypeEnum3 = new ImFrequencyRuleTypeEnum("MAX_COUNT_AND_MAX_DURATION", 2, "MaxCountAndMaxDurationRule", 2);
        MAX_COUNT_AND_MAX_DURATION = imFrequencyRuleTypeEnum3;
        ImFrequencyRuleTypeEnum imFrequencyRuleTypeEnum4 = new ImFrequencyRuleTypeEnum("EXECUTE_LOOP", 3, "ExecuteLoopRule", 3);
        EXECUTE_LOOP = imFrequencyRuleTypeEnum4;
        ImFrequencyRuleTypeEnum[] imFrequencyRuleTypeEnumArr = {imFrequencyRuleTypeEnum, imFrequencyRuleTypeEnum2, imFrequencyRuleTypeEnum3, imFrequencyRuleTypeEnum4};
        LLILLL = imFrequencyRuleTypeEnumArr;
        LLILZ = new C2254308sP(imFrequencyRuleTypeEnumArr);
        Companion = new Object() { // from class: X.055u
        };
    }

    public static ImFrequencyRuleTypeEnum[] values() {
        return (ImFrequencyRuleTypeEnum[]) LLILLL.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static final ImFrequencyRuleTypeEnum fromValue(Integer num) {
        Companion.getClass();
        for (ImFrequencyRuleTypeEnum imFrequencyRuleTypeEnum : values()) {
            int value = imFrequencyRuleTypeEnum.getValue();
            if (num != null && value == num.intValue()) {
                return imFrequencyRuleTypeEnum;
            }
        }
        return UNKNOWN;
    }

    public static ImFrequencyRuleTypeEnum valueOf(String str) {
        return (ImFrequencyRuleTypeEnum) C08FF.LIZ(ImFrequencyRuleTypeEnum.class, str);
    }

    public ImFrequencyRuleTypeEnum(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
