package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C709802ps;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ButtonStyle {
    public static final C709802ps Companion;

    @C09CT("3")
    public static final ButtonStyle GHOST;
    public static final /* synthetic */ ButtonStyle[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final ButtonStyle PRIMARY;

    @C09CT("2")
    public static final ButtonStyle SECONDARY;

    @C09CT("5")
    public static final ButtonStyle TOKO_STYLE;
    public final int LL;

    public static InterfaceC2044707zh<ButtonStyle> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.02ps] */
    static {
        ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0, 1);
        PRIMARY = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1, 2);
        SECONDARY = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("GHOST", 2, 3);
        GHOST = buttonStyle3;
        ButtonStyle buttonStyle4 = new ButtonStyle("TOKO_STYLE", 3, 5);
        TOKO_STYLE = buttonStyle4;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4};
        LLILLJJLI = buttonStyleArr;
        LLILLL = new C2254308sP(buttonStyleArr);
        Companion = new Object() { // from class: X.02ps
        };
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) C08FF.LIZ(ButtonStyle.class, str);
    }

    public ButtonStyle(String str, int i, int i2) {
        this.LL = i2;
    }
}
