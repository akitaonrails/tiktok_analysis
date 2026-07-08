package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C09R9;
import X.C0ONX;
import X.C0OZ3;
import X.C0OZB;
import X.C13LE;
import X.C1559260qg8;
import X.C621400OYw;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollVoteDetailViewModel extends AssemViewModel<C0OZ3> implements C0OZB {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C621400OYw.class, "BulletinPollVoteDetailCommonHierarchyData"), true);
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C0ONX.class));
    public BulletinPollVoteDetailResponse LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OZ3(0);
    }

    @Override // X.C0OZB
    public final BulletinPollVoteDetailResponse mG() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            r18 = this;
            r5 = r19
            boolean r0 = r5 instanceof X.C468840Ia2
            r4 = r18
            if (r0 == 0) goto Laf
            r3 = r5
            X.0Ia2 r3 = (X.C468840Ia2) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r3.LLILLL = r2
        L16:
            java.lang.Object r5 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L7c
            if (r0 != r1) goto Lb6
            X.C155000ia.LIZIZ(r5)
        L26:
            X.0OZ9 r5 = (X.C0OZ9) r5
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse r0 = r5.LIZIZ
            r4.LLILLL = r0
            X.0OZ5 r0 = r5.LIZ
            int[] r2 = X.C0OZ4.LIZ
            int r0 = r0.ordinal()
            r2 = r2[r0]
            if (r2 == r1) goto L47
            r0 = 2
            if (r2 != r0) goto L44
            r0 = 350(0x15e, float:4.9E-43)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r4.setState(r0)
        L44:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L47:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse r3 = r5.LIZIZ
            if (r3 == 0) goto L44
            long r5 = r3.totalVoteCount
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L5d
            r0 = 348(0x15c, float:4.88E-43)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r4.setState(r0)
            goto L44
        L5d:
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption> r0 = r3.options
            if (r0 == 0) goto L72
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L72
            kotlin.jvm.internal.AwS588S0100000_9 r1 = new kotlin.jvm.internal.AwS588S0100000_9
            r0 = 214(0xd6, float:3.0E-43)
            r1.<init>(r3, r0)
            r4.setState(r1)
            goto L44
        L72:
            r0 = 349(0x15d, float:4.89E-43)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r4.setState(r0)
            goto L44
        L7c:
            X.C155000ia.LIZIZ(r5)
            X.0qg8 r0 = r4.LL
            java.lang.Object r5 = r0.getValue()
            X.0OYw r5 = (X.C621400OYw) r5
            if (r5 == 0) goto L44
            X.09R9 r0 = r4.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r6 = r0.getOperator()
            X.0OKS r6 = (X.C0OKS) r6
            int r7 = r5.LL
            long r8 = r5.LLILLJJLI
            long r10 = r5.LLILLL
            long r12 = r5.LLILZ
            r14 = 0
            r3.LLILLL = r1
            r15 = 20
            r16 = r14
            r17 = r3
            java.lang.Object r5 = r6.LJIILJJIL(r7, r8, r10, r12, r14, r15, r16, r17)
            if (r5 != r2) goto L26
            return r2
        Laf:
            X.0Ia2 r3 = new X.0Ia2
            r3.<init>(r4, r5)
            goto L16
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel.onRefresh(X.05Vn):java.lang.Object");
    }
}
