package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C01GW;
import X.C1559260qg8;
import X.C1612860s4a;
import X.C1613130s51;
import X.C1613210s59;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS8S0220000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPanelSquareViewModel extends AssemListViewModel<C1613130s51, InterfaceC1891350zJl, Integer> {
    public InterfaceC420801kM LL;
    public AnonymousClass0956 LLILZLL;
    public boolean LLIZLLLIL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1612860s4a.class, "series_video_playlist_hierarchy_data"), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(232));
    public String LLILZ = "";
    public String LLILZIL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(233));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(231));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1613130s51(0);
    }

    public final long vQ2() {
        C1612860s4a c1612860s4a = (C1612860s4a) this.LLILLJJLI.getValue();
        if (c1612860s4a != null) {
            return c1612860s4a.LLILZLL;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleared() {
        /*
            r4 = this;
            super.onCleared()
            java.lang.String r0 = ""
            r4.LLILZ = r0
            r4.LLILZIL = r0
            X.0956 r0 = r4.LLILZLL
            if (r0 == 0) goto L1f
            boolean r1 = r0.isCancelled()
            r0 = 1
            if (r1 != r0) goto L1f
        L14:
            r1 = 0
            if (r0 != 0) goto L21
            X.0956 r0 = r4.LLILZLL
            if (r0 == 0) goto L21
            r0.LIZIZ(r1)
            goto L21
        L1f:
            r0 = 0
            goto L14
        L21:
            java.util.List r0 = r4.wQ2()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L76
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L7a
        L30:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L42
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r1 instanceof X.C1612910s4f     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L30
            r3.add(r1)     // Catch: java.lang.Throwable -> L7a
            goto L30
        L42:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
        L46:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L74
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L7a
            X.0s4f r0 = (X.C1612910s4f) r0     // Catch: java.lang.Throwable -> L7a
            com.ss.android.ugc.aweme.model.PaidCollectionOverView r0 = r0.LL     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.model.UrlModel r0 = r0.cover     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L46
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L46
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L46
            X.0kbA r1 = X.C1322200kVm.LIZ()     // Catch: java.lang.Throwable -> L7a
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L7a
            r1.LJ(r0)     // Catch: java.lang.Throwable -> L7a
            goto L46
        L74:
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7a
        L76:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7a
            return
        L7a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel.onCleared():void");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        Pair<String, String> pairKj;
        String second;
        String str;
        super.onPrepared();
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        String str2 = "";
        if (miniDramaPlayListServiceLIZ != null) {
            C1612860s4a c1612860s4a = (C1612860s4a) this.LLILLJJLI.getValue();
            if (c1612860s4a == null || (str = c1612860s4a.LL) == null) {
                str = "";
            }
            pairKj = miniDramaPlayListServiceLIZ.kj(str);
            if (pairKj == null || (first = pairKj.getFirst()) == null) {
            }
            this.LLILZ = first;
            if (pairKj != null && (second = pairKj.getSecond()) != null) {
                str2 = second;
            }
            this.LLILZIL = str2;
        }
        pairKj = null;
        String first = "";
        this.LLILZ = first;
        if (pairKj != null) {
            str2 = second;
        }
        this.LLILZIL = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC1891350zJl> wQ2() {
        return ((C1613130s51) getState()).LL.LLILZ;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 137));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1613150s53
            if (r0 == 0) goto L38
            r4 = r6
            X.0s53 r4 = (X.C1613150s53) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L3e
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L36
            r0 = 1073741823(0x3fffffff, float:1.9999999)
        L2d:
            r4.LLILLL = r1
            java.lang.Object r3 = r5.xQ2(r1, r0, r1, r4)
            if (r3 != r2) goto L22
            return r2
        L36:
            r0 = 0
            goto L2d
        L38:
            X.0s53 r4 = new X.0s53
            r4.<init>(r5, r6)
            goto L12
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return xQ2(false, 0, false, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return xQ2(true, 1073741823, false, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(boolean r18, int r19, boolean r20, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel.xQ2(boolean, int, boolean, X.05Vn):java.lang.Object");
    }

    public final void yQ2(AbstractC1623806Xk abstractC1623806Xk, List list, boolean z, boolean z2) {
        setState(new AwS8S0220000_24(abstractC1623806Xk, list, z, z2, 1));
    }
}
