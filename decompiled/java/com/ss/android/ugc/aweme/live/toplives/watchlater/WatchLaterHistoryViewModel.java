package com.ss.android.ugc.aweme.live.toplives.watchlater;

import X.AbstractC316870CbV;
import X.AbstractC993580bxk;
import X.C0KBN;
import X.C317290CcB;
import X.C325960CqA;
import X.C627660Ojc;
import X.C993570bxj;
import X.C993630bxp;
import X.EnumC993550bxh;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS583S0100000_4;
import webcast.api.audience.WatchLaterHistoryResp;

/* JADX INFO: loaded from: classes28.dex */
public final class WatchLaterHistoryViewModel extends AssemListViewModel<C325960CqA, AbstractC993580bxk, Unit> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325960CqA(0);
    }

    public static List vQ2(WatchLaterHistoryResp.Data data) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC993580bxk() { // from class: X.0bxl
            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return interfaceC1891350zJl instanceof C993590bxl;
            }
        });
        if (!data.recentlyMissed.isEmpty()) {
            arrayList.add(new C993570bxj(EnumC993550bxh.RECENTLY_MISSED));
            Iterator<WatchLaterHistoryResp.Item> it2 = data.recentlyMissed.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C993630bxp(it2.next()));
            }
        }
        if (!data.recentlyWatched.isEmpty()) {
            arrayList.add(new C993570bxj(EnumC993550bxh.RECENTLY_WATCHED));
            Iterator<WatchLaterHistoryResp.Item> it3 = data.recentlyWatched.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C993630bxp(it3.next()));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<AbstractC993580bxk> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 81));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<kotlin.Unit>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1842300y2e
            if (r0 == 0) goto L20
            r4 = r6
            X.0y2e r4 = (X.C1842300y2e) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L58
        L20:
            X.0y2e r4 = new X.0y2e
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.Class<com.bytedance.android.feed.api.ILiveFeedApiService> r0 = com.bytedance.android.feed.api.ILiveFeedApiService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> L8d
            com.bytedance.android.feed.api.ILiveFeedApiService r0 = (com.bytedance.android.feed.api.ILiveFeedApiService) r0     // Catch: java.lang.Exception -> L8d
            r0.zr()     // Catch: java.lang.Exception -> L8d
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L8d
            java.lang.Class<com.bytedance.android.livesdk.feed.watchlater.WatchLaterApi> r0 = com.bytedance.android.livesdk.feed.watchlater.WatchLaterApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L8d
            java.lang.Object r0 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L8d
            com.bytedance.android.livesdk.feed.watchlater.WatchLaterApi r0 = (com.bytedance.android.livesdk.feed.watchlater.WatchLaterApi) r0     // Catch: java.lang.Exception -> L8d
            X.11NZ r0 = r0.getWatchLaterHistory()     // Catch: java.lang.Exception -> L8d
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L8d
            java.lang.Object r1 = X.C11UD.LIZJ(r0, r4)     // Catch: java.lang.Exception -> L8d
            if (r1 != r3) goto L5b
            return r3
        L58:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L8d
        L5b:
            webcast.api.audience.WatchLaterHistoryResp r1 = (webcast.api.audience.WatchLaterHistoryResp) r1     // Catch: java.lang.Exception -> L8d
            webcast.api.audience.WatchLaterHistoryResp$Data r1 = r1.data     // Catch: java.lang.Exception -> L8d
            if (r1 == 0) goto L71
            java.util.List<webcast.api.audience.WatchLaterHistoryResp$Item> r0 = r1.recentlyMissed     // Catch: java.lang.Exception -> L8d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L7e
            java.util.List<webcast.api.audience.WatchLaterHistoryResp$Item> r0 = r1.recentlyWatched     // Catch: java.lang.Exception -> L8d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L7e
        L71:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L8d
            X.13BV r1 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L8d
            r0.getClass()     // Catch: java.lang.Exception -> L8d
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L8d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8d
            return r0
        L7e:
            java.util.List r1 = vQ2(r1)     // Catch: java.lang.Exception -> L8d
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L8d
            r0.getClass()     // Catch: java.lang.Exception -> L8d
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L8d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8d
            return r0
        L8d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.toplives.watchlater.WatchLaterHistoryViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Unit unit, InterfaceC1364105Vn<? super AbstractC316870CbV<Unit>> interfaceC1364105Vn) {
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }
}
