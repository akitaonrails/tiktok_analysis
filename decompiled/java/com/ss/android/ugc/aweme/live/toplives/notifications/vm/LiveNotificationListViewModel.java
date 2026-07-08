package com.ss.android.ugc.aweme.live.toplives.notifications.vm;

import X.AbstractC316870CbV;
import X.AbstractC479160Iqg;
import X.C0160003a;
import X.C09YA;
import X.C1263004wu;
import X.C484340Iz2;
import X.C627660Ojc;
import X.EnumC484320Iz0;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.feed.TopliveNoticeListRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNotificationListViewModel extends AssemListViewModel<C484340Iz2, C0160003a, C1263004wu> {
    public final C09YA LL = new C09YA(this, AFwS193S0000000_7.get$arr$(159));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C484340Iz2(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0160003a> c627660Ojc) {
        setState(new AwS586S0100000_7(c627660Ojc, (C627660Ojc<AbstractC479160Iqg>) 249));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1263004wu>> interfaceC1364105Vn) {
        return vQ2(new TopliveNoticeListRequest(), EnumC484320Iz0.REFRESH, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.InterfaceC1364105Vn r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C484390Iz7
            if (r0 == 0) goto L20
            r5 = r8
            X.0Iz7 r5 = (X.C484390Iz7) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2a
            goto L26
        L20:
            X.0Iz7 r5 = new X.0Iz7
            r5.<init>(r7, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L77
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            java.util.List r0 = r7.listGetAll()     // Catch: java.lang.Exception -> L77
            r2 = 0
            if (r0 == 0) goto L47
            java.lang.Object r1 = X.C13LP.LJJLIIIJJI(r0)     // Catch: java.lang.Exception -> L77
            X.003a r1 = (X.C0160003a) r1     // Catch: java.lang.Exception -> L77
        L42:
            boolean r0 = r1 instanceof X.C0160003a     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L4a
            goto L49
        L47:
            r1 = r2
            goto L42
        L49:
            r2 = r1
        L4a:
            if (r2 == 0) goto L67
            webcast.api.feed.TopliveNoticeListRequest r3 = new webcast.api.feed.TopliveNoticeListRequest     // Catch: java.lang.Exception -> L77
            r3.<init>()     // Catch: java.lang.Exception -> L77
            webcast.api.feed.NoticeItem r2 = r2.LLILLJJLI     // Catch: java.lang.Exception -> L77
            long r0 = r2.noticeId     // Catch: java.lang.Exception -> L77
            r3.lastNoticeId = r0     // Catch: java.lang.Exception -> L77
            long r0 = r2.createTime     // Catch: java.lang.Exception -> L77
            r3.lastNoticeCreateTime = r0     // Catch: java.lang.Exception -> L77
            X.0Iz0 r0 = X.EnumC484320Iz0.LOAD_MORE     // Catch: java.lang.Exception -> L77
            r5.LLILLL = r4     // Catch: java.lang.Exception -> L77
            java.lang.Object r1 = r7.vQ2(r3, r0, r5)     // Catch: java.lang.Exception -> L77
            if (r1 != r6) goto L66
            return r6
        L66:
            return r1
        L67:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L77
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L77
            r1.<init>()     // Catch: java.lang.Exception -> L77
            r0.getClass()     // Catch: java.lang.Exception -> L77
            X.0Cb9 r0 = new X.0Cb9     // Catch: java.lang.Exception -> L77
            r0.<init>(r1)     // Catch: java.lang.Exception -> L77
            return r0
        L77:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel.wQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(C1263004wu c1263004wu, InterfaceC1364105Vn<? super AbstractC316870CbV<C1263004wu>> interfaceC1364105Vn) {
        return wQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(webcast.api.feed.TopliveNoticeListRequest r12, X.EnumC484320Iz0 r13, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1263004wu>> r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel.vQ2(webcast.api.feed.TopliveNoticeListRequest, X.0Iz0, X.05Vn):java.lang.Object");
    }
}
