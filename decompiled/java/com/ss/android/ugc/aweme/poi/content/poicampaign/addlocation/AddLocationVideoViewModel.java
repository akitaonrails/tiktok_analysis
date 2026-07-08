package com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation;

import X.AbstractC316870CbV;
import X.C09R9;
import X.C1158280gFO;
import X.C1165730gRP;
import X.C1198080hHa;
import X.C1198220hHo;
import X.C1198430hI9;
import X.C13LE;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AddLocationVideoViewModel extends AssemListViewModel<C1198080hHa, C1158280gFO, C1198220hHo> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1198430hI9.class));
    public AbstractC316870CbV<C1198220hHo> LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1198080hHa(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1158280gFO> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 273));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1198220hHo>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1198310hHx
            if (r0 == 0) goto L3f
            r4 = r6
            X.0hHx r4 = (X.C1198310hHx) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L45
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0HZe r1 = (X.C443120HZe) r1
            java.lang.Object r0 = r1.getFirst()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0CbV<X.0hHo> r0 = r5.LLILLJJLI
            if (r0 != 0) goto L28
            X.0hHo r1 = new X.0hHo
            r0 = 0
            r1.<init>(r0)
            r4.LLILLL = r2
            java.lang.Object r1 = r5.wQ2(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L3f:
            X.0hHx r4 = new X.0hHx
            r4.<init>(r5, r6)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1198220hHo r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1198220hHo>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1198330hHz
            if (r0 == 0) goto L35
            r4 = r7
            X.0hHz r4 = (X.C1198330hHz) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3b
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0HZe r3 = (X.C443120HZe) r3
            java.lang.Object r0 = r3.getFirst()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.wQ2(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L35:
            X.0hHz r4 = new X.0hHz
            r4.<init>(r5, r7)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel.onLoadMore(X.0hHo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.C1198220hHo r12, X.InterfaceC1364105Vn<? super X.C443120HZe<? extends X.AbstractC316870CbV<X.C1198220hHo>, ? extends X.EnumC1198390hI5, com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsVideoListResponse>> r13) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel.wQ2(X.0hHo, X.05Vn):java.lang.Object");
    }
}
