package com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier;

import X.C01GW;
import X.C09YA;
import X.C123100dR;
import X.C1389880mGw;
import X.C1697810uHb;
import X.C1708610uZ1;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1708990uZd;
import X.C1709040uZi;
import X.C1709070uZl;
import X.C1709220ua0;
import X.C1709300ua8;
import X.C1709330uaB;
import X.C1709460uaO;
import X.C1709570uaZ;
import X.C1710290ubj;
import X.C1710390ubt;
import X.C1954807lC;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C335850DEp;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1709020uZg;
import X.EnumC1709200uZy;
import X.EnumC1709470uaP;
import X.InterfaceC0148002o;
import X.InterfaceC1709310ua9;
import X.InterfaceC1709390uaH;
import Y.ARunnableS37S0101000_26;
import android.content.Context;
import android.os.Looper;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierViewModel extends AssemViewModel<C1710290ubj> implements InterfaceC1709390uaH {
    public CashierEnterParams LL;
    public C1709570uaZ LLILLJJLI;
    public CashierFragment LLILLL;
    public C1710390ubt LLILZ;
    public volatile boolean LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public final Map<String, String> LLILZIL = new LinkedHashMap();
    public final C09YA LLJI = new C09YA(this, AFwS215S0000000_26.get$arr$(238));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1089));

    public final void BQ2() {
        String str;
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOptionLJFF;
        if (this.LLJ || (str = this.LLIZ) == null || !(!a0.LJJJIL(str)) || (c1709570uaZ = this.LLILLJJLI) == null || (paymentOptionLJFF = c1709570uaZ.LJIILIIL.LJFF(str, this.LLIZLLLIL)) == null) {
            return;
        }
        if (((ArrayList) c1709570uaZ.LJJJJZ()).contains(paymentOptionLJFF.LIZ)) {
            this.LLJ = true;
        } else if (paymentOptionLJFF.statusAttr.available && c1709570uaZ.LJIILJJIL(paymentOptionLJFF.LIZ, true, false)) {
            this.LLJ = true;
        }
    }

    @Override // X.InterfaceC1709390uaH
    public final void XX1() {
        C1709570uaZ c1709570uaZ = this.LLILLJJLI;
        if (c1709570uaZ != null) {
            setStateImmediate(new AwS392S0200000_26(this, c1709570uaZ, 62));
        }
        BQ2();
    }

    @Override // X.InterfaceC1709390uaH
    public final void c3() {
        if (this.LLILLJJLI != null) {
            setStateImmediate(AFwS268S0000000_26.get$arr$(423));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1710290ubj(null, false, null, 1023);
    }

    @Override // X.InterfaceC1709390uaH
    public final void pP1() {
        C19EG activity;
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOptionLJJIJIIJI;
        PODaInfo pODaInfo;
        String str;
        C1709070uZl c1709070uZl;
        EnumC1709020uZg enumC1709020uZg;
        C1709070uZl c1709070uZl2;
        CashierEnterParams cashierEnterParams = this.LL;
        if (((cashierEnterParams == null || (c1709070uZl2 = cashierEnterParams.LIZIZ) == null) ? null : c1709070uZl2.LIZIZ) == EnumC1709200uZy.PAY_NOW) {
            C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS37S0101000_26(this, 5));
        } else {
            CashierFragment cashierFragment = this.LLILLL;
            if (cashierFragment != null && (activity = cashierFragment.getActivity()) != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(activity);
                c1389880mGw.LJIIIIZZ(2131840171);
                c1389880mGw.LJIIJ();
            }
        }
        CashierEnterParams cashierEnterParams2 = this.LL;
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(cashierEnterParams2 != null ? cashierEnterParams2.payRequestId : null);
        CashierEnterParams cashierEnterParams3 = this.LL;
        String strLIZ = (cashierEnterParams3 == null || (c1709070uZl = cashierEnterParams3.LIZIZ) == null || (enumC1709020uZg = c1709070uZl.LIZJ) == null) ? "" : C1709040uZi.LIZ(enumC1709020uZg);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("option_type", "payment_type"));
        CashierEnterParams cashierEnterParams4 = this.LL;
        if (cashierEnterParams4 != null && (c1709570uaZ = cashierEnterParams4.paymentData) != null && (paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI()) != null && (pODaInfo = paymentOptionLJJIJIIJI.trackInfo) != null && (str = pODaInfo.optionName) != null) {
            mapLJIIJ.put("option_name", str);
        }
        interfaceC1709310ua9LIZIZ.LJIIJJI(strLIZ, "total_price_change", mapLJIIJ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1709570uaZ c1709570uaZ = this.LLILLJJLI;
        if (c1709570uaZ != null) {
            c1709570uaZ.LJIILJJIL.remove(this);
        }
    }

    public static List vQ2(C1709570uaZ c1709570uaZ) {
        ArrayList arrayList = new ArrayList();
        for (PIPOPaymentOptionArea pIPOPaymentOptionArea : c1709570uaZ.LJIILIIL.allPOAreas) {
            String str = pIPOPaymentOptionArea.title;
            if (C123100dR.LIZ(str) && str != null) {
                arrayList.add(new C1709300ua8(str, pIPOPaymentOptionArea.displayAmount));
            }
            int i = 0;
            for (PaymentOption paymentOption : pIPOPaymentOptionArea.paymentOptions) {
                int i2 = i + 1;
                if (i >= 0) {
                    PaymentOption paymentOption2 = paymentOption;
                    arrayList.add(new C1709330uaB(c1709570uaZ, paymentOption2, c1709570uaZ.LJJIZ(paymentOption2), i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public final void AQ2(String str) {
        if (str != null && str.length() != 0) {
            setState(new AwS76S1000000_26(str, 10));
        }
    }

    public final void xQ2(Context context) {
        C335850DEp c335850DEpLJIILLIIL;
        EnumC1709470uaP enumC1709470uaP;
        String str;
        EnumC1709470uaP enumC1709470uaP2;
        C1708990uZd c1708990uZd;
        EnumC1709470uaP enumC1709470uaP3;
        C1709070uZl c1709070uZl;
        C1709570uaZ c1709570uaZ = this.LLILLJJLI;
        String str2 = null;
        enumC1709200uZy = null;
        EnumC1709200uZy enumC1709200uZy = null;
        str2 = null;
        if (c1709570uaZ != null) {
            c335850DEpLJIILLIIL = c1709570uaZ.LJIILLIIL(context, this.LLILZ);
        } else {
            c335850DEpLJIILLIIL = null;
        }
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("confirmCommitData ret status: ");
        if (c335850DEpLJIILLIIL != null) {
            enumC1709470uaP = c335850DEpLJIILLIIL.LIZ;
        } else {
            enumC1709470uaP = null;
        }
        sbLIZ.append(enumC1709470uaP);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        if (c335850DEpLJIILLIIL != null && (enumC1709470uaP3 = c335850DEpLJIILLIIL.LIZ) != null) {
            switch (C1709460uaO.LIZ[enumC1709470uaP3.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    setStateImmediate(AFwS268S0000000_26.get$arr$(419));
                    return;
                case 2:
                    setStateImmediate(AFwS268S0000000_26.get$arr$(420));
                    return;
                case 3:
                    CashierEnterParams cashierEnterParams = this.LL;
                    if (cashierEnterParams != null && (c1709070uZl = cashierEnterParams.LIZIZ) != null) {
                        enumC1709200uZy = c1709070uZl.LIZIZ;
                    }
                    if (enumC1709200uZy == EnumC1709200uZy.CONTINUE) {
                        zQ2(context);
                        return;
                    } else {
                        setStateImmediate(AFwS268S0000000_26.get$arr$(421));
                        return;
                    }
                case 4:
                    AQ2(c335850DEpLJIILLIIL.LIZIZ);
                    return;
                case 5:
                    zQ2(context);
                    return;
                case 6:
                case 7:
                    return;
            }
        }
        CashierEnterParams cashierEnterParams2 = this.LL;
        if (cashierEnterParams2 != null) {
            str = cashierEnterParams2.payRequestId;
        } else {
            str = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("error_code", "ERR_CONTINUE_ACTION");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("status: ");
        if (c335850DEpLJIILLIIL != null) {
            enumC1709470uaP2 = c335850DEpLJIILLIIL.LIZ;
        } else {
            enumC1709470uaP2 = null;
        }
        sbLIZ2.append(enumC1709470uaP2);
        sbLIZ2.append(", ");
        CashierEnterParams cashierEnterParams3 = this.LL;
        if (cashierEnterParams3 != null && (c1708990uZd = cashierEnterParams3.LIZJ) != null) {
            str2 = c1708990uZd.LIZ;
        }
        sbLIZ2.append(str2);
        pairArr[1] = new Pair("error_msg", C2188811AlT.LIZIZ(sbLIZ2));
        interfaceC1709310ua9LIZIZ.LJIIIIZZ(C2097608Jq.LJIIIIZZ(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1710290ubj yQ2(X.C1709570uaZ r6) {
        /*
            r5 = this;
            X.0uaZ r0 = r5.LLILLJJLI
            if (r0 == 0) goto L2e
            java.util.List r0 = r0.LJJJJZ()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r4 = 1
            r0 = r0 ^ 1
            if (r0 != r4) goto L2e
        L13:
            X.01Au r3 = new X.01Au
            java.util.List r0 = vQ2(r6)
            r3.<init>(r0)
            X.01Au r2 = new X.01Au
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.<init>(r0)
            X.0ubj r1 = new X.0ubj
            r0 = 508(0x1fc, float:7.12E-43)
            r1.<init>(r3, r4, r2, r0)
            return r1
        L2e:
            r4 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel.yQ2(X.0uaZ):X.0ubj");
    }

    public final void zQ2(Context context) {
        C1709220ua0 c1709220ua0;
        Function1<C1709570uaZ, Unit> function1;
        AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this, context, 54);
        CashierEnterParams cashierEnterParams = this.LL;
        if (cashierEnterParams != null && (c1709220ua0 = cashierEnterParams.LJ) != null && (function1 = c1709220ua0.LIZLLL) != null) {
            function1.invoke(this.LLILLJJLI);
            setState(AFwS268S0000000_26.get$arr$(422));
        } else {
            awS427S0200000_26.invoke();
        }
    }

    public final void wQ2(String str, boolean z) {
        C1709070uZl c1709070uZl;
        String str2;
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOptionLJFF;
        EnumC1709200uZy enumC1709200uZy = null;
        boolean z2 = true;
        if (!this.LLJ && (str2 = this.LLIZ) != null && (!a0.LJJJIL(str2)) && (c1709570uaZ = this.LLILLJJLI) != null && (paymentOptionLJFF = c1709570uaZ.LJIILIIL.LJFF(str2, this.LLIZLLLIL)) != null && !Intrinsics.LJFF(str, paymentOptionLJFF.LIZ)) {
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            this.LLJ = true;
        }
        if (!z) {
            CashierEnterParams cashierEnterParams = this.LL;
            if (cashierEnterParams != null && (c1709070uZl = cashierEnterParams.LIZIZ) != null) {
                enumC1709200uZy = c1709070uZl.LIZIZ;
            }
            if (enumC1709200uZy != EnumC1709200uZy.PAY_NOW) {
                z2 = false;
            }
        }
        C1709570uaZ c1709570uaZ2 = this.LLILLJJLI;
        if (c1709570uaZ2 != null) {
            c1709570uaZ2.LJIILJJIL(str, z2, z2);
        }
    }
}
