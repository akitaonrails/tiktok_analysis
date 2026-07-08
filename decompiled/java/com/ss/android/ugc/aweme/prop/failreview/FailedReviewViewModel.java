package com.ss.android.ugc.aweme.prop.failreview;

import X.C01GW;
import X.C09IR;
import X.C0CYW;
import X.C13BV;
import X.C1683930tvD;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C315760CZi;
import X.C315860CZs;
import X.C315990Ca5;
import X.C316000Ca6;
import X.C316010Ca7;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class FailedReviewViewModel extends ViewModel {
    public final FailedReviewPageInitData LL;
    public final C315860CZs LLILLJJLI;
    public final C2252321DDq LLILZ;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C2252321DDq LLJI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1756));
    public final C2252321DDq LLILZIL = C1BNE.LIZ(new C316010Ca7(0));
    public final C2252331DDr LLIZLLLIL = C09IR.LIZIZ(0, 0, null, 7);
    public final C2252321DDq LLJ = C1BNE.LIZ(C13BV.INSTANCE);
    public final C2252321DDq LLJIJIL = C1BNE.LIZ(new C315760CZi(false));
    public final C2252321DDq LLJILJIL = C1BNE.LIZ(null);
    public final C2252331DDr LLJILJILJ = C09IR.LIZIZ(0, 0, null, 7);
    public final C2252331DDr LLJILLL = C09IR.LIZIZ(0, 0, null, 7);
    public final C2252331DDr LLJJ = C09IR.LIZIZ(0, 0, null, 7);
    public final C2252331DDr LLJJI = C09IR.LIZIZ(0, 0, null, 7);

    public FailedReviewViewModel(FailedReviewPageInitData failedReviewPageInitData) {
        this.LL = failedReviewPageInitData;
        this.LLILLJJLI = new C315860CZs(failedReviewPageInitData);
        int i = 0;
        this.LLILZ = C1BNE.LIZ(new C316000Ca6(i));
        this.LLILZLL = C1BNE.LIZ(new C315990Ca5(i));
        this.LLIZ = C1BNE.LIZ(new C315990Ca5(i));
        this.LLJI = C1BNE.LIZ(new C1683930tvD(i));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0CYW(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0CYX
            if (r0 == 0) goto L58
            r5 = r7
            X.0CYX r5 = (X.C0CYX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L36
            if (r0 != r3) goto L5e
            X.C155000ia.LIZIZ(r2)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r2)
            X.0CZs r0 = r6.LLILLJJLI
            r5.LLILLL = r1
            java.lang.Object r2 = r0.LIZJ(r5)
            if (r2 != r4) goto L3f
            return r4
        L36:
            X.C155000ia.LIZIZ(r2)
            X.00o6 r2 = (X.C189200o6) r2
            java.lang.Object r2 = r2.m10unboximpl()
        L3f:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r2)
            if (r0 == 0) goto L66
            X.1DDq r1 = r6.LLJILJIL
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L4e
            r2 = 0
        L4e:
            r5.LLILLL = r3
            r1.setValue(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r4) goto L25
            return r4
        L58:
            X.0CYX r5 = new X.0CYX
            r5.<init>(r6, r7)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel.wQ2(X.05Vn):java.lang.Object");
    }
}
