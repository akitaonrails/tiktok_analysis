package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class POSelectStyle {

    @C09CT("arrow")
    public static final POSelectStyle ARROW;
    public static final /* synthetic */ POSelectStyle[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("none")
    public static final POSelectStyle NONE;

    @C09CT("outline")
    public static final POSelectStyle OUTLINE;

    @C09CT("radio")
    public static final POSelectStyle RADIO;

    @C09CT("switch")
    public static final POSelectStyle SWITCH;

    public static InterfaceC2044707zh<POSelectStyle> getEntries() {
        return LLILLJJLI;
    }

    static {
        POSelectStyle pOSelectStyle = new POSelectStyle("NONE", 0);
        NONE = pOSelectStyle;
        POSelectStyle pOSelectStyle2 = new POSelectStyle("RADIO", 1);
        RADIO = pOSelectStyle2;
        POSelectStyle pOSelectStyle3 = new POSelectStyle("SWITCH", 2);
        SWITCH = pOSelectStyle3;
        POSelectStyle pOSelectStyle4 = new POSelectStyle("OUTLINE", 3);
        OUTLINE = pOSelectStyle4;
        POSelectStyle pOSelectStyle5 = new POSelectStyle("ARROW", 4);
        ARROW = pOSelectStyle5;
        POSelectStyle[] pOSelectStyleArr = {pOSelectStyle, pOSelectStyle2, pOSelectStyle3, pOSelectStyle4, pOSelectStyle5};
        LL = pOSelectStyleArr;
        LLILLJJLI = new C2254308sP(pOSelectStyleArr);
    }

    public static POSelectStyle[] values() {
        return (POSelectStyle[]) LL.clone();
    }

    public static POSelectStyle valueOf(String str) {
        return (POSelectStyle) C08FF.LIZ(POSelectStyle.class, str);
    }

    public POSelectStyle(String str, int i) {
    }
}
