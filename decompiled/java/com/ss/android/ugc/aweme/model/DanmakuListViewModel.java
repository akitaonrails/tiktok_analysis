package com.ss.android.ugc.aweme.model;

import X.AbstractC316870CbV;
import X.C1158140gFA;
import X.C1383820m7A;
import X.C1383850m7D;
import X.C1383860m7E;
import X.C1383870m7F;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuListViewModel extends AssemListViewModel<C1383820m7A, C1158140gFA, C1383860m7E> {
    public Aweme LL;
    public String LLILLJJLI;
    public C1383870m7F LLILLL;
    public final Set<String> LLILZ = new LinkedHashSet();
    public C1383850m7D LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1383820m7A(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        xQ2(true);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1158140gFA> c627660Ojc) {
        setState(new AwS600S0100000_21(c627660Ojc, (C627660Ojc<C1158140gFA>) 148));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1383860m7E>> interfaceC1364105Vn) {
        return vQ2(true, null, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            X.0m7D r1 = r0.LLILZIL
            r7 = 0
            if (r1 == 0) goto L5d
            java.util.List<java.lang.String> r1 = r1.LJ
            int r2 = r1.size()
            if (r2 <= 0) goto L5d
            if (r19 != 0) goto L16
            r1 = 100
            if (r2 >= r1) goto L16
            return
        L16:
            X.0lWb r2 = X.C1361150lWb.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.LL
            java.lang.String r12 = r0.LLILLJJLI
            if (r12 != 0) goto L20
            java.lang.String r12 = ""
        L20:
            X.0m7D r1 = r0.LLILZIL
            if (r1 == 0) goto L5b
            int r13 = r1.LIZJ
            java.util.List<java.lang.String> r3 = r1.LJ
            if (r3 != 0) goto L2c
        L2a:
            X.13BV r3 = X.C13BV.INSTANCE
        L2c:
            java.lang.String r4 = ","
            java.lang.String r5 = "["
            java.lang.String r6 = "]"
            r8 = 0
            r1 = 193(0xc1, float:2.7E-43)
            kotlin.jvm.internal.AFwS259S0000000_21 r9 = kotlin.jvm.internal.AFwS259S0000000_21.get$arr$(r1)
            r10 = 24
            java.lang.String r14 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            X.0lWZ r1 = X.EnumC1361130lWZ.DANMAKU_LIST
            java.lang.String r15 = r1.getValue()
            X.00yp r16 = X.EnumC255700yp.IS_NOT_LANDSCAPE
            r2.getClass()
            r17 = r7
            X.C1361150lWb.LJ(r11, r12, r13, r14, r15, r16, r17)
            X.0m7D r0 = r0.LLILZIL
            if (r0 == 0) goto L5a
            r0.LIZJ = r7
            java.util.List<java.lang.String> r0 = r0.LJ
            r0.clear()
        L5a:
            return
        L5b:
            r13 = 0
            goto L2a
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.DanmakuListViewModel.xQ2(boolean):void");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1383860m7E c1383860m7E, InterfaceC1364105Vn<? super AbstractC316870CbV<C1383860m7E>> interfaceC1364105Vn) {
        return vQ2(false, c1383860m7E, interfaceC1364105Vn);
    }

    public final void wQ2(Aweme aweme, String str) {
        if (aweme == null) {
            return;
        }
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = new C1383870m7F(aweme, DanmakuApi.LIZ, str);
        aweme.getAid();
        this.LLILZIL = new C1383850m7D(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(boolean r20, X.C1383860m7E r21, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1383860m7E>> r22) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.DanmakuListViewModel.vQ2(boolean, X.0m7E, X.05Vn):java.lang.Object");
    }
}
