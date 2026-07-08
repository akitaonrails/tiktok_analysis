package com.bytedance.effectcreatormobile.ckeapi.api.text;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TextStyle {
    public static final /* synthetic */ TextStyle[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("text")
    public static final TextStyle None;

    @C09CT("alpha_bg")
    public static final TextStyle TextAlphaBgColor;

    @C09CT("bg")
    public static final TextStyle TextBgColor;

    @C09CT("text")
    public static final TextStyle TextColor;

    @C09CT("stroke")
    public static final TextStyle TextStrokeColor;

    public static InterfaceC2044707zh<TextStyle> getEntries() {
        return LLILLJJLI;
    }

    static {
        TextStyle textStyle = new TextStyle("None", 0);
        None = textStyle;
        TextStyle textStyle2 = new TextStyle("TextColor", 1);
        TextColor = textStyle2;
        TextStyle textStyle3 = new TextStyle("TextBgColor", 2);
        TextBgColor = textStyle3;
        TextStyle textStyle4 = new TextStyle("TextAlphaBgColor", 3);
        TextAlphaBgColor = textStyle4;
        TextStyle textStyle5 = new TextStyle("TextStrokeColor", 4);
        TextStrokeColor = textStyle5;
        TextStyle[] textStyleArr = {textStyle, textStyle2, textStyle3, textStyle4, textStyle5};
        LL = textStyleArr;
        LLILLJJLI = new C2254308sP(textStyleArr);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) LL.clone();
    }

    public static TextStyle valueOf(String str) {
        return (TextStyle) C08FF.LIZ(TextStyle.class, str);
    }

    public TextStyle(String str, int i) {
    }
}
