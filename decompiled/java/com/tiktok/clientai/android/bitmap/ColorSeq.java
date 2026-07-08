package com.tiktok.clientai.android.bitmap;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ColorSeq {
    public static final ColorSeq BGR;
    public static final /* synthetic */ ColorSeq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final ColorSeq RGB;

    @C09CT("value")
    public final String value;

    public static InterfaceC2044707zh<ColorSeq> getEntries() {
        return LLILLJJLI;
    }

    static {
        ColorSeq colorSeq = new ColorSeq("BGR", 0, "bgr");
        BGR = colorSeq;
        ColorSeq colorSeq2 = new ColorSeq("RGB", 1, "rgb");
        RGB = colorSeq2;
        ColorSeq[] colorSeqArr = {colorSeq, colorSeq2};
        LL = colorSeqArr;
        LLILLJJLI = new C2254308sP(colorSeqArr);
    }

    public static ColorSeq[] values() {
        return (ColorSeq[]) LL.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static ColorSeq valueOf(String str) {
        return (ColorSeq) C08FF.LIZ(ColorSeq.class, str);
    }

    public ColorSeq(String str, int i, String str2) {
        this.value = str2;
    }
}
