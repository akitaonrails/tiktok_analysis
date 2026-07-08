package com.tiktok.clientai.android.bitmap;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class OutputFormat {
    public static final OutputFormat CHW;
    public static final OutputFormat HWC;
    public static final /* synthetic */ OutputFormat[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("value")
    public final String value;

    public static InterfaceC2044707zh<OutputFormat> getEntries() {
        return LLILLJJLI;
    }

    static {
        OutputFormat outputFormat = new OutputFormat("HWC", 0, "hwc");
        HWC = outputFormat;
        OutputFormat outputFormat2 = new OutputFormat("CHW", 1, "chw");
        CHW = outputFormat2;
        OutputFormat[] outputFormatArr = {outputFormat, outputFormat2};
        LL = outputFormatArr;
        LLILLJJLI = new C2254308sP(outputFormatArr);
    }

    public static OutputFormat[] values() {
        return (OutputFormat[]) LL.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static OutputFormat valueOf(String str) {
        return (OutputFormat) C08FF.LIZ(OutputFormat.class, str);
    }

    public OutputFormat(String str, int i, String str2) {
        this.value = str2;
    }
}
