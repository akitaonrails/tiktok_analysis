package com.ss.android.ugc.aweme.checkout;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class CheckoutBtnState {

    @C09CT("disabled")
    public static final CheckoutBtnState DISABLED;

    @C09CT("enabled")
    public static final CheckoutBtnState ENABLED;
    public static final /* synthetic */ CheckoutBtnState[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("loading")
    public static final CheckoutBtnState LOADING;
    public final String LL;

    public static InterfaceC2044707zh<CheckoutBtnState> getEntries() {
        return LLILLL;
    }

    static {
        CheckoutBtnState checkoutBtnState = new CheckoutBtnState("LOADING", 0, "loading");
        LOADING = checkoutBtnState;
        CheckoutBtnState checkoutBtnState2 = new CheckoutBtnState("DISABLED", 1, "disabled");
        DISABLED = checkoutBtnState2;
        CheckoutBtnState checkoutBtnState3 = new CheckoutBtnState("ENABLED", 2, "enabled");
        ENABLED = checkoutBtnState3;
        CheckoutBtnState[] checkoutBtnStateArr = {checkoutBtnState, checkoutBtnState2, checkoutBtnState3};
        LLILLJJLI = checkoutBtnStateArr;
        LLILLL = new C2254308sP(checkoutBtnStateArr);
    }

    public static CheckoutBtnState[] values() {
        return (CheckoutBtnState[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static CheckoutBtnState valueOf(String str) {
        return (CheckoutBtnState) C08FF.LIZ(CheckoutBtnState.class, str);
    }

    public CheckoutBtnState(String str, int i, String str2) {
        this.LL = str2;
    }
}
