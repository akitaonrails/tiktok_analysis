package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model;

import X.C08FF;
import X.C09CT;
import X.C12989056l;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ImFrequencyExitTypeEnum {
    public static final C12989056l Companion;

    @C09CT("ExitForever")
    public static final ImFrequencyExitTypeEnum FOREVER;
    public static final /* synthetic */ ImFrequencyExitTypeEnum[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;

    @C09CT("None")
    public static final ImFrequencyExitTypeEnum NONE;

    @C09CT("ExitTemporary")
    public static final ImFrequencyExitTypeEnum TEMPORARY;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<ImFrequencyExitTypeEnum> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.056l] */
    static {
        ImFrequencyExitTypeEnum imFrequencyExitTypeEnum = new ImFrequencyExitTypeEnum("NONE", 0, "None", 0);
        NONE = imFrequencyExitTypeEnum;
        ImFrequencyExitTypeEnum imFrequencyExitTypeEnum2 = new ImFrequencyExitTypeEnum("FOREVER", 1, "ExitForever", 1);
        FOREVER = imFrequencyExitTypeEnum2;
        ImFrequencyExitTypeEnum imFrequencyExitTypeEnum3 = new ImFrequencyExitTypeEnum("TEMPORARY", 2, "ExitTemporary", 2);
        TEMPORARY = imFrequencyExitTypeEnum3;
        ImFrequencyExitTypeEnum[] imFrequencyExitTypeEnumArr = {imFrequencyExitTypeEnum, imFrequencyExitTypeEnum2, imFrequencyExitTypeEnum3};
        LLILLL = imFrequencyExitTypeEnumArr;
        LLILZ = new C2254308sP(imFrequencyExitTypeEnumArr);
        Companion = new Object() { // from class: X.056l
        };
    }

    public static ImFrequencyExitTypeEnum[] values() {
        return (ImFrequencyExitTypeEnum[]) LLILLL.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static final ImFrequencyExitTypeEnum fromValue(Integer num) {
        Companion.getClass();
        for (ImFrequencyExitTypeEnum imFrequencyExitTypeEnum : values()) {
            int value = imFrequencyExitTypeEnum.getValue();
            if (num != null && value == num.intValue()) {
                return imFrequencyExitTypeEnum;
            }
        }
        return NONE;
    }

    public static ImFrequencyExitTypeEnum valueOf(String str) {
        return (ImFrequencyExitTypeEnum) C08FF.LIZ(ImFrequencyExitTypeEnum.class, str);
    }

    public ImFrequencyExitTypeEnum(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
