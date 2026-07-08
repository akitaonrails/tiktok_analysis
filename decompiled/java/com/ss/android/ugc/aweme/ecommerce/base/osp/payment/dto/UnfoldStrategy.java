package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C02RQ;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class UnfoldStrategy {
    public static final C02RQ Companion;
    public static final /* synthetic */ UnfoldStrategy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final UnfoldStrategy NOT_SUB_PAYMENT;

    @C09CT("1")
    public static final UnfoldStrategy SUB_PAYMENT_FOLD_BELOW;

    @C09CT("2")
    public static final UnfoldStrategy SUB_PAYMENT_FOLD_SEPARATE;
    public final String LL;

    public static InterfaceC2044707zh<UnfoldStrategy> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.02RQ] */
    static {
        UnfoldStrategy unfoldStrategy = new UnfoldStrategy("NOT_SUB_PAYMENT", 0, CardStruct.IStatusCode.DEFAULT);
        NOT_SUB_PAYMENT = unfoldStrategy;
        UnfoldStrategy unfoldStrategy2 = new UnfoldStrategy("SUB_PAYMENT_FOLD_BELOW", 1, "1");
        SUB_PAYMENT_FOLD_BELOW = unfoldStrategy2;
        UnfoldStrategy unfoldStrategy3 = new UnfoldStrategy("SUB_PAYMENT_FOLD_SEPARATE", 2, "2");
        SUB_PAYMENT_FOLD_SEPARATE = unfoldStrategy3;
        UnfoldStrategy[] unfoldStrategyArr = {unfoldStrategy, unfoldStrategy2, unfoldStrategy3};
        LLILLJJLI = unfoldStrategyArr;
        LLILLL = new C2254308sP(unfoldStrategyArr);
        Companion = new Object() { // from class: X.02RQ
        };
    }

    public static UnfoldStrategy[] values() {
        return (UnfoldStrategy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static UnfoldStrategy valueOf(String str) {
        return (UnfoldStrategy) C08FF.LIZ(UnfoldStrategy.class, str);
    }

    public UnfoldStrategy(String str, int i, String str2) {
        this.LL = str2;
    }
}
