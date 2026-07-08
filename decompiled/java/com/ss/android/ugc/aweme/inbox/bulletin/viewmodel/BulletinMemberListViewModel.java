package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C09R9;
import X.C0DTG;
import X.C0OLV;
import X.C0ONX;
import X.C13LE;
import X.C1559260qg8;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinMemberListViewModel extends AssemListViewModel<C0DTG, InterfaceC1891350zJl, String> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C0ONX.class));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C0OLV.class, "bulletin_board_param"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0DTG(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 210));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r10) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C623420Ocm
            if (r0 == 0) goto L86
            r5 = r10
            X.0Ocm r5 = (X.C623420Ocm) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r7 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 != r3) goto La4
            X.C155000ia.LIZIZ(r7)
        L23:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse r7 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse) r7
            if (r7 == 0) goto Lac
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinMemberActionUser> r0 = r7.memberList
            if (r0 == 0) goto L8c
            java.util.Iterator r2 = r0.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinMemberActionUser r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinMemberActionUser) r0
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.actionUser
            if (r1 == 0) goto L34
            X.00s7 r0 = new X.00s7
            r0.<init>(r1)
            r5.add(r0)
            goto L34
        L4f:
            X.C155000ia.LIZIZ(r7)
            java.lang.String r0 = "BulletinMemberListViewModelonLoadMore()"
            X.C0OPX.LJII(r0)
            X.0qg8 r0 = r8.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            X.0OLV r0 = (X.C0OLV) r0
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.LL
            if (r0 == 0) goto Lac
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto Lac
            long r1 = r0.longValue()
            X.09R9 r0 = r8.LL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0OKS r0 = (X.C0OKS) r0
            r5.LLILLL = r3
            java.lang.Object r7 = r0.a(r1, r9, r5)
            if (r7 != r6) goto L23
            return r6
        L86:
            X.0Ocm r5 = new X.0Ocm
            r5.<init>(r8, r10)
            goto L12
        L8c:
            boolean r0 = r7.hasMore
            if (r0 == 0) goto L99
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            java.lang.String r0 = r7.nextCursor
            X.0Cm0 r0 = X.C317290CcB.LJ(r1, r4, r0, r5, r3)
            return r0
        L99:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r5)
            return r0
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lac:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }
}
