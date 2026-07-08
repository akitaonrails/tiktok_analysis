package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model;

import X.C08FF;
import X.C09CT;
import X.C12991056n;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ImFrequencyTypeEnum {
    public static final C12991056n Companion;
    public static final /* synthetic */ ImFrequencyTypeEnum[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;

    @C09CT("UID")
    public static final ImFrequencyTypeEnum UID;

    @C09CT("UIDConversation")
    public static final ImFrequencyTypeEnum UID_CONVERSATION;

    @C09CT("")
    public static final ImFrequencyTypeEnum UNKNOWN;
    public final String LL;
    public final int LLILLJJLI;

    public static final ImFrequencyTypeEnum fromValue(Integer num) {
        Companion.getClass();
        return C12991056n.LIZ(num);
    }

    public static InterfaceC2044707zh<ImFrequencyTypeEnum> getEntries() {
        return LLILZ;
    }

    static {
        ImFrequencyTypeEnum imFrequencyTypeEnum = new ImFrequencyTypeEnum("UNKNOWN", 0, "", 0);
        UNKNOWN = imFrequencyTypeEnum;
        ImFrequencyTypeEnum imFrequencyTypeEnum2 = new ImFrequencyTypeEnum("UID", 1, "UID", 1);
        UID = imFrequencyTypeEnum2;
        ImFrequencyTypeEnum imFrequencyTypeEnum3 = new ImFrequencyTypeEnum("UID_CONVERSATION", 2, "UIDConversation", 2);
        UID_CONVERSATION = imFrequencyTypeEnum3;
        ImFrequencyTypeEnum[] imFrequencyTypeEnumArr = {imFrequencyTypeEnum, imFrequencyTypeEnum2, imFrequencyTypeEnum3};
        LLILLL = imFrequencyTypeEnumArr;
        LLILZ = new C2254308sP(imFrequencyTypeEnumArr);
        Companion = new C12991056n();
    }

    public static ImFrequencyTypeEnum[] values() {
        return (ImFrequencyTypeEnum[]) LLILLL.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static ImFrequencyTypeEnum valueOf(String str) {
        return (ImFrequencyTypeEnum) C08FF.LIZ(ImFrequencyTypeEnum.class, str);
    }

    public ImFrequencyTypeEnum(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
