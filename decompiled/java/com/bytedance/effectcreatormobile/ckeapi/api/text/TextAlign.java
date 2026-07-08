package com.bytedance.effectcreatormobile.ckeapi.api.text;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes26.dex */
public final class TextAlign {

    @C09CT("center")
    public static final TextAlign Center;
    public static final /* synthetic */ TextAlign[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("left")
    public static final TextAlign Left;

    @C09CT("right")
    public static final TextAlign Right;

    public static InterfaceC2044707zh<TextAlign> getEntries() {
        return LLILLJJLI;
    }

    static {
        TextAlign textAlign = new TextAlign("Left", 0);
        Left = textAlign;
        TextAlign textAlign2 = new TextAlign("Center", 1);
        Center = textAlign2;
        TextAlign textAlign3 = new TextAlign("Right", 2);
        Right = textAlign3;
        TextAlign[] textAlignArr = {textAlign, textAlign2, textAlign3};
        LL = textAlignArr;
        LLILLJJLI = new C2254308sP(textAlignArr);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) LL.clone();
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) C08FF.LIZ(TextAlign.class, str);
    }

    public TextAlign(String str, int i) {
    }
}
