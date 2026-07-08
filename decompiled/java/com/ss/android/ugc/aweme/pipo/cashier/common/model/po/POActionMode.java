package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class POActionMode {

    @C09CT("6")
    public static final POActionMode JUMP_TO_ATMCARD_PAGE;

    @C09CT("3")
    public static final POActionMode JUMP_TO_BIND_EWALLET;

    @C09CT("4")
    public static final POActionMode JUMP_TO_CCDC_PAGE;

    @C09CT("5")
    public static final POActionMode JUMP_TO_CCI_PAGE;

    @C09CT("2")
    public static final POActionMode JUMP_TO_SUB_PAYMENT_OPTIONS_PAGE;
    public static final /* synthetic */ POActionMode[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("-1")
    public static final POActionMode NONE;

    @C09CT("1")
    public static final POActionMode SELECT;

    public static InterfaceC2044707zh<POActionMode> getEntries() {
        return LLILLJJLI;
    }

    static {
        POActionMode pOActionMode = new POActionMode("NONE", 0);
        NONE = pOActionMode;
        POActionMode pOActionMode2 = new POActionMode("SELECT", 1);
        SELECT = pOActionMode2;
        POActionMode pOActionMode3 = new POActionMode("JUMP_TO_SUB_PAYMENT_OPTIONS_PAGE", 2);
        JUMP_TO_SUB_PAYMENT_OPTIONS_PAGE = pOActionMode3;
        POActionMode pOActionMode4 = new POActionMode("JUMP_TO_BIND_EWALLET", 3);
        JUMP_TO_BIND_EWALLET = pOActionMode4;
        POActionMode pOActionMode5 = new POActionMode("JUMP_TO_CCDC_PAGE", 4);
        JUMP_TO_CCDC_PAGE = pOActionMode5;
        POActionMode pOActionMode6 = new POActionMode("JUMP_TO_CCI_PAGE", 5);
        JUMP_TO_CCI_PAGE = pOActionMode6;
        POActionMode pOActionMode7 = new POActionMode("JUMP_TO_ATMCARD_PAGE", 6);
        JUMP_TO_ATMCARD_PAGE = pOActionMode7;
        POActionMode[] pOActionModeArr = {pOActionMode, pOActionMode2, pOActionMode3, pOActionMode4, pOActionMode5, pOActionMode6, pOActionMode7};
        LL = pOActionModeArr;
        LLILLJJLI = new C2254308sP(pOActionModeArr);
    }

    public static POActionMode[] values() {
        return (POActionMode[]) LL.clone();
    }

    public static POActionMode valueOf(String str) {
        return (POActionMode) C08FF.LIZ(POActionMode.class, str);
    }

    public POActionMode(String str, int i) {
    }
}
