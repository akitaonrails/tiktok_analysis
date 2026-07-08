package com.ss.android.ugc.aweme.minis.payment.qcpx;

import X.AbstractC23140094w;
import X.C095D;
import X.C09IC;
import X.C1233160iCA;
import X.C2245081Cu2;
import X.C2501109r7;
import X.C320201Ma;
import X.C321401Mm;
import X.C321501Mn;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisCouponViewModel extends AssemViewModel<C2245081Cu2> {
    public C1233160iCA LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2245081Cu2(null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0CWV
            if (r0 == 0) goto L4a
            r5 = r7
            X.0CWV r5 = (X.C0CWV) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L32
            if (r0 != r1) goto L51
            X.C155000ia.LIZIZ(r2)
        L23:
            com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse r2 = (com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse) r2
            if (r2 == 0) goto L50
            kotlin.jvm.internal.AwS613S0100000_34 r1 = new kotlin.jvm.internal.AwS613S0100000_34
            r0 = 34
            r1.<init>(r2, r0)
            r6.setStateImmediate(r1)
            return r2
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0iCA r0 = r6.LL
            if (r0 != 0) goto L3a
            return r3
        L3a:
            X.0iC8 r2 = new X.0iC8
            r2.<init>(r0, r3)
            r5.LLILLL = r1
            r0 = 2
            java.lang.Object r2 = xQ2(r0, r2, r5)
            if (r2 != r4) goto L23
            return r4
        L4a:
            X.0CWV r5 = new X.0CWV
            r5.<init>(r6, r7)
            goto L12
        L50:
            return r3
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C0CWW
            if (r0 == 0) goto L6d
            r8 = r10
            X.0CWW r8 = (X.C0CWW) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r7 = r8.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r5 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L4a
            if (r0 != r5) goto L95
            X.0iCA r3 = r8.LL
            X.C155000ia.LIZIZ(r7)
        L28:
            com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse r7 = (com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse) r7
            if (r7 != 0) goto L73
            return r4
        L2d:
            X.C155000ia.LIZIZ(r7)
            X.0iCA r3 = r9.LL
            if (r3 != 0) goto L35
            return r4
        L35:
            X.002o r0 = r9.getState()
            X.1Cu2 r0 = (X.C2245081Cu2) r0
            com.ss.android.ugc.aweme.minis.model.payment.coupon.QCPXConfig r0 = r0.LL
            if (r0 != 0) goto L57
            r8.LL = r3
            r8.LLILZ = r1
            java.lang.Object r7 = r9.vQ2(r8)
            if (r7 != r6) goto L4f
            return r6
        L4a:
            X.0iCA r3 = r8.LL
            X.C155000ia.LIZIZ(r7)
        L4f:
            com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse r7 = (com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse) r7
            if (r7 == 0) goto L9d
            com.ss.android.ugc.aweme.minis.model.payment.coupon.QCPXConfig r0 = r7.qcpxConfig
            if (r0 == 0) goto L9d
        L57:
            boolean r0 = r0.enabled
            if (r0 != r1) goto L9d
            X.0iC9 r2 = new X.0iC9
            r2.<init>(r3, r4)
            r8.LL = r3
            r8.LLILZ = r5
            r0 = 0
            java.lang.Object r7 = xQ2(r0, r2, r8)
            if (r7 != r6) goto L28
            return r6
        L6d:
            X.0CWW r8 = new X.0CWW
            r8.<init>(r9, r10)
            goto L12
        L73:
            kotlin.jvm.internal.AwS613S0100000_34 r1 = new kotlin.jvm.internal.AwS613S0100000_34
            r0 = 35
            r1.<init>(r7, r0)
            r9.setState(r1)
            X.1B08 r5 = new X.1B08
            java.lang.String r4 = r3.LIZIZ
            java.lang.String r3 = r3.LIZJ
            java.lang.String r2 = r7.discountRate
            java.lang.String r1 = ""
            if (r2 != 0) goto L8a
            r2 = r1
        L8a:
            java.lang.String r0 = r7.couponQuoteToken
            if (r0 == 0) goto L8f
            r1 = r0
        L8f:
            r5.<init>(r4, r3, r2, r1)
            X.C2195221Avo.LJIIJJI = r5
            return r7
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel.wQ2(X.05Vn):java.lang.Object");
    }

    public static Object xQ2(long j, Function1 function1, AbstractC23140094w abstractC23140094w) {
        C095D c095d = new C095D(new C321401Mm(function1, null));
        if (j > 0) {
            C09IC.LJJIIJZLJL(c095d, j, new C320201Ma(null));
        }
        return C09IC.LJIJI(new C2501109r7(new C321501Mn(null), c095d, 0), abstractC23140094w);
    }
}
