package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model;

import X.C08FF;
import X.C09CT;
import X.C12987056j;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ImFrequencyTriggerEnum {

    @C09CT("Click")
    public static final ImFrequencyTriggerEnum CLICK;
    public static final C12987056j Companion;

    @C09CT("DisMiss")
    public static final ImFrequencyTriggerEnum DISMISS;
    public static final /* synthetic */ ImFrequencyTriggerEnum[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;

    @C09CT("Show")
    public static final ImFrequencyTriggerEnum SHOW;

    @C09CT("")
    public static final ImFrequencyTriggerEnum UNKNOWN;
    public final String LL;
    public final int LLILLJJLI;

    public static final ImFrequencyTriggerEnum fromValue(Integer num) {
        Companion.getClass();
        return C12987056j.LIZ(num);
    }

    public static InterfaceC2044707zh<ImFrequencyTriggerEnum> getEntries() {
        return LLILZ;
    }

    static {
        ImFrequencyTriggerEnum imFrequencyTriggerEnum = new ImFrequencyTriggerEnum("UNKNOWN", 0, "", 0);
        UNKNOWN = imFrequencyTriggerEnum;
        ImFrequencyTriggerEnum imFrequencyTriggerEnum2 = new ImFrequencyTriggerEnum("SHOW", 1, "Show", 1);
        SHOW = imFrequencyTriggerEnum2;
        ImFrequencyTriggerEnum imFrequencyTriggerEnum3 = new ImFrequencyTriggerEnum("CLICK", 2, "Click", 2);
        CLICK = imFrequencyTriggerEnum3;
        ImFrequencyTriggerEnum imFrequencyTriggerEnum4 = new ImFrequencyTriggerEnum("DISMISS", 3, "DisMiss", 3);
        DISMISS = imFrequencyTriggerEnum4;
        ImFrequencyTriggerEnum[] imFrequencyTriggerEnumArr = {imFrequencyTriggerEnum, imFrequencyTriggerEnum2, imFrequencyTriggerEnum3, imFrequencyTriggerEnum4};
        LLILLL = imFrequencyTriggerEnumArr;
        LLILZ = new C2254308sP(imFrequencyTriggerEnumArr);
        Companion = new C12987056j();
    }

    public static ImFrequencyTriggerEnum[] values() {
        return (ImFrequencyTriggerEnum[]) LLILLL.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static ImFrequencyTriggerEnum valueOf(String str) {
        return (ImFrequencyTriggerEnum) C08FF.LIZ(ImFrequencyTriggerEnum.class, str);
    }

    public ImFrequencyTriggerEnum(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
