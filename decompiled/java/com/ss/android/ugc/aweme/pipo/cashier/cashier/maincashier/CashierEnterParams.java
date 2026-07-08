package com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier;

import X.C09CT;
import X.C1707820uXk;
import X.C1708990uZd;
import X.C1709070uZl;
import X.C1709220ua0;
import X.C1709570uaZ;
import X.EnumC1708880uZS;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierEnterParams {
    public final CashierKey LIZ;
    public final C1709070uZl LIZIZ;
    public final C1708990uZd LIZJ;
    public final EnumC1708880uZS LIZLLL;
    public final C1709220ua0 LJ;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("pay_start_params")
    public final C1707820uXk payStartParams;

    @C09CT("payment_data")
    public final C1709570uaZ paymentData;

    public static CashierEnterParams LIZ(CashierEnterParams cashierEnterParams, C1709570uaZ c1709570uaZ, C1709220ua0 c1709220ua0, int i) {
        String str;
        CashierKey cashierKey;
        C1707820uXk c1707820uXk;
        C1709070uZl c1709070uZl;
        C1708990uZd c1708990uZd;
        C1709220ua0 c1709220ua02 = c1709220ua0;
        C1709570uaZ c1709570uaZ2 = c1709570uaZ;
        EnumC1708880uZS enumC1708880uZS = null;
        if ((i & 1) != 0) {
            str = cashierEnterParams.payRequestId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            cashierKey = cashierEnterParams.LIZ;
        } else {
            cashierKey = null;
        }
        if ((i & 4) != 0) {
            c1709570uaZ2 = cashierEnterParams.paymentData;
        }
        if ((i & 8) != 0) {
            c1707820uXk = cashierEnterParams.payStartParams;
        } else {
            c1707820uXk = null;
        }
        if ((i & 16) != 0) {
            c1709070uZl = cashierEnterParams.LIZIZ;
        } else {
            c1709070uZl = null;
        }
        if ((i & 32) != 0) {
            c1708990uZd = cashierEnterParams.LIZJ;
        } else {
            c1708990uZd = null;
        }
        if ((i & 64) != 0) {
            enumC1708880uZS = cashierEnterParams.LIZLLL;
        }
        if ((i & 128) != 0) {
            c1709220ua02 = cashierEnterParams.LJ;
        }
        return new CashierEnterParams(str, cashierKey, c1709570uaZ2, c1707820uXk, c1709070uZl, c1708990uZd, enumC1708880uZS, c1709220ua02);
    }

    public CashierEnterParams(String str, CashierKey cashierKey, C1709570uaZ c1709570uaZ, C1707820uXk c1707820uXk, C1709070uZl c1709070uZl, C1708990uZd c1708990uZd, EnumC1708880uZS enumC1708880uZS, C1709220ua0 c1709220ua0) {
        this.payRequestId = str;
        this.LIZ = cashierKey;
        this.paymentData = c1709570uaZ;
        this.payStartParams = c1707820uXk;
        this.LIZIZ = c1709070uZl;
        this.LIZJ = c1708990uZd;
        this.LIZLLL = enumC1708880uZS;
        this.LJ = c1709220ua0;
    }
}
