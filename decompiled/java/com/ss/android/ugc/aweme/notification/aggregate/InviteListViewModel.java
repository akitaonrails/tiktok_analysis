package com.ss.android.ugc.aweme.notification.aggregate;

import X.C09R9;
import X.C13LE;
import X.C1840880y0M;
import X.C1840980y0W;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1816030xMH;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class InviteListViewModel extends AssemListViewModel<C1840880y0M, BulletinAggregateNotice, String> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1840980y0W.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1840880y0M(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<BulletinAggregateNotice> c627660Ojc) {
        setState(new AwS606S0100000_27(c627660Ojc, (C627660Ojc<InterfaceC1816030xMH>) 167));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1840920y0Q
            if (r0 == 0) goto L57
            r3 = r7
            X.0y0Q r3 = (X.C1840920y0Q) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 != r4) goto Lab
            X.C155000ia.LIZIZ(r5)
        L22:
            X.0y0T r5 = (X.C1840950y0T) r5
            X.0y0O r0 = r5.LIZ
            int[] r1 = X.C1840910y0P.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r4) goto L92
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r0 = r5.LIZIZ
            if (r0 != 0) goto L5d
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r0 = X.C317290CcB.LIZIZ(r0)
            return r0
        L3b:
            X.C155000ia.LIZIZ(r5)
            X.09R9 r0 = r6.LL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r1 = r0.getOperator()
            X.0y0S r1 = (X.InterfaceC1840940y0S) r1
            r3.LLILLL = r4
            java.lang.String r0 = ""
            java.lang.Object r5 = r1.p0(r0, r3)
            if (r5 != r2) goto L22
            return r2
        L57:
            X.0y0Q r3 = new X.0y0Q
            r3.<init>(r6, r7)
            goto L12
        L5d:
            java.util.List<com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice> r3 = r0.bulletinInviteItemList
            if (r3 != 0) goto L63
            X.13BV r3 = X.C13BV.INSTANCE
        L63:
            kotlin.jvm.internal.AwS393S0200000_27 r1 = new kotlin.jvm.internal.AwS393S0200000_27
            r0 = 42
            r1.<init>(r3, r5, r0)
            r6.setState(r1)
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r0 = r5.LIZIZ
            java.lang.Boolean r1 = r0.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L87
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r0 = r5.LIZIZ
            java.lang.String r1 = r0.cursor
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r3, r4)
            return r0
        L87:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r3)
            return r0
        L92:
            r0 = 134(0x86, float:1.88E-43)
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r6.setState(r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1840930y0R
            if (r0 == 0) goto L5e
            r3 = r8
            X.0y0R r3 = (X.C1840930y0R) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto Lb5
            X.C155000ia.LIZIZ(r5)
        L22:
            X.0y0T r5 = (X.C1840950y0T) r5
            X.0y0O r0 = r5.LIZ
            int[] r1 = X.C1840910y0P.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r4) goto La5
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r0 = r5.LIZIZ
            if (r0 != 0) goto L64
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L44:
            X.C155000ia.LIZIZ(r5)
            X.09R9 r0 = r6.LL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0y0S r0 = (X.InterfaceC1840940y0S) r0
            r3.LLILLL = r4
            java.lang.Object r5 = r0.p0(r7, r3)
            if (r5 != r1) goto L22
            return r1
        L5e:
            X.0y0R r3 = new X.0y0R
            r3.<init>(r6, r8)
            goto L12
        L64:
            java.util.List<com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice> r3 = r0.bulletinInviteItemList
            if (r3 != 0) goto L6a
            X.13BV r3 = X.C13BV.INSTANCE
        L6a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L80
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L80:
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r0 = r5.LIZIZ
            java.lang.Boolean r1 = r0.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9a
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r0 = r5.LIZIZ
            java.lang.String r1 = r0.cursor
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r3, r4)
            return r0
        L9a:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r3)
            return r0
        La5:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }
}
