package com.ss.android.ugc.aweme.mention.viewmodel;

import X.AbstractC316870CbV;
import X.C0KBN;
import X.C13BV;
import X.C20610715kv;
import X.C316640Cb8;
import X.C317290CcB;
import X.C325540CpU;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoCaptionMentionRecommendViewModel extends AssemListViewModel<C325540CpU, InterfaceC1891350zJl, Boolean> {
    public C20610715kv LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325540CpU(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 82));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: Exception -> 0x00a7, LOOP:0: B:24:0x0089->B:26:0x008f, LOOP_END, TryCatch #0 {Exception -> 0x00a7, blocks: (B:21:0x0057, B:22:0x005a, B:23:0x005c, B:24:0x0089, B:26:0x008f, B:27:0x009e, B:15:0x0031, B:17:0x0037, B:20:0x004d), top: B:32:0x001b }] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Boolean>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C317040Cbm
            if (r0 == 0) goto L20
            r5 = r7
            X.0Cbm r5 = (X.C317040Cbm) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L57
        L20:
            X.0Cbm r5 = new X.0Cbm
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = X.C277040AtS.LIZ()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L4d
            X.0Cak r0 = X.C316400Cak.LIZ     // Catch: java.lang.Exception -> La7
            r5.LLILLL = r1     // Catch: java.lang.Exception -> La7
            r0.getClass()     // Catch: java.lang.Exception -> La7
            X.0Cag r3 = new X.0Cag     // Catch: java.lang.Exception -> La7
            r2 = 0
            r0 = 6
            r3.<init>(r0, r2)     // Catch: java.lang.Exception -> La7
            java.lang.Object r2 = X.C2296808zG.LJ(r3, r5)     // Catch: java.lang.Exception -> La7
            if (r2 != r4) goto L5a
            return r4
        L4d:
            X.0Cak r0 = X.C316400Cak.LIZ     // Catch: java.lang.Exception -> La7
            r0.getClass()     // Catch: java.lang.Exception -> La7
            kotlin.Pair r2 = X.C316400Cak.LIZ()     // Catch: java.lang.Exception -> La7
            goto L5c
        L57:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> La7
        L5a:
            kotlin.Pair r2 = (kotlin.Pair) r2     // Catch: java.lang.Exception -> La7
        L5c:
            java.lang.Object r3 = r2.getFirst()     // Catch: java.lang.Exception -> La7
            X.0Cbk r3 = (X.C317020Cbk) r3     // Catch: java.lang.Exception -> La7
            java.lang.Object r2 = r2.getSecond()     // Catch: java.lang.Exception -> La7
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> La7
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4     // Catch: java.lang.Exception -> La7
            r0 = 83
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> La7
            r6.setState(r1)     // Catch: java.lang.Exception -> La7
            X.15kv r0 = r3.LIZ     // Catch: java.lang.Exception -> La7
            r6.LL = r0     // Catch: java.lang.Exception -> La7
            X.0CcB r4 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> La7
            java.util.List<X.15l2> r1 = r3.LIZIZ     // Catch: java.lang.Exception -> La7
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> La7
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> La7
            r3.<init>(r0)     // Catch: java.lang.Exception -> La7
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> La7
        L89:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L9e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La7
            X.15l2 r1 = (X.C20611415l2) r1     // Catch: java.lang.Exception -> La7
            X.0Cbn r0 = new X.0Cbn     // Catch: java.lang.Exception -> La7
            r0.<init>(r1)     // Catch: java.lang.Exception -> La7
            r3.add(r0)     // Catch: java.lang.Exception -> La7
            goto L89
        L9e:
            r4.getClass()     // Catch: java.lang.Exception -> La7
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> La7
            r0.<init>(r3)     // Catch: java.lang.Exception -> La7
            return r0
        La7:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        bool.booleanValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }
}
