package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base;

import X.AbstractC1223200hw6;
import X.AbstractC316870CbV;
import X.C1157130gDX;
import X.C326270Cqf;
import X.C627660Ojc;
import X.C994040byU;
import X.InterfaceC0148002o;
import X.InterfaceC1222900hvc;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseCheckupRelationViewModel<S, B extends AbstractC1223200hw6<S>> extends AssemListViewModel<C326270Cqf, C994040byU, S> {
    public final MutableLiveData<String> LL = new MutableLiveData<>();
    public String LLILLJJLI = "";
    public String LLILLL = "";

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(S s, InterfaceC1364105Vn<? super AbstractC316870CbV<S>> interfaceC1364105Vn) {
        return wQ2(this, s, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<S>> interfaceC1364105Vn) {
        return xQ2(this, interfaceC1364105Vn);
    }

    public abstract InterfaceC1222900hvc<S, B> vQ2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326270Cqf(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C994040byU> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 123));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <S, B extends X.AbstractC1223200hw6<S>> java.lang.Object xQ2(com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel<S, B> r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<S>> r8) {
        /*
            boolean r0 = r8 instanceof X.C1223190hw5
            if (r0 == 0) goto L21
            r6 = r8
            X.0hw5 r6 = (X.C1223190hw5) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L3f
        L21:
            X.0hw5 r6 = new X.0hw5
            r6.<init>(r7, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            X.0hvc r0 = r7.vQ2()     // Catch: java.lang.Exception -> L64
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L64
            java.lang.Object r5 = r0.LIZ(r4, r6)     // Catch: java.lang.Exception -> L64
            if (r5 != r1) goto L42
            return r1
        L3f:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L64
        L42:
            X.0hw6 r5 = (X.AbstractC1223200hw6) r5     // Catch: java.lang.Exception -> L64
            java.lang.Object r2 = r5.LIZIZ()     // Catch: java.lang.Exception -> L64
            boolean r0 = r5.LIZJ()     // Catch: java.lang.Exception -> L64
            java.util.List r1 = r5.LIZ()     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L59
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L64
            X.0Cm0 r0 = X.C317290CcB.LJ(r0, r4, r2, r1, r3)     // Catch: java.lang.Exception -> L64
            return r0
        L59:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L64
            r0.getClass()     // Catch: java.lang.Exception -> L64
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L64
            r0.<init>(r1)     // Catch: java.lang.Exception -> L64
            return r0
        L64:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel.xQ2(com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <S, B extends X.AbstractC1223200hw6<S>> java.lang.Object wQ2(com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel<S, B> r5, S r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<S>> r7) {
        /*
            boolean r0 = r7 instanceof X.C1223180hw4
            if (r0 == 0) goto L20
            r3 = r7
            X.0hw4 r3 = (X.C1223180hw4) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L3e
        L20:
            X.0hw4 r3 = new X.0hw4
            r3.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0hvc r0 = r5.vQ2()     // Catch: java.lang.Exception -> L64
            r3.LLILLL = r4     // Catch: java.lang.Exception -> L64
            java.lang.Object r2 = r0.LIZ(r6, r3)     // Catch: java.lang.Exception -> L64
            if (r2 != r1) goto L41
            return r1
        L3e:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L64
        L41:
            X.0hw6 r2 = (X.AbstractC1223200hw6) r2     // Catch: java.lang.Exception -> L64
            java.lang.Object r3 = r2.LIZIZ()     // Catch: java.lang.Exception -> L64
            boolean r0 = r2.LIZJ()     // Catch: java.lang.Exception -> L64
            java.util.List r2 = r2.LIZ()     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L59
            X.0CcB r1 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L64
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r1, r0, r3, r2, r4)     // Catch: java.lang.Exception -> L64
            return r0
        L59:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L64
            r0.getClass()     // Catch: java.lang.Exception -> L64
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L64
            r0.<init>(r2)     // Catch: java.lang.Exception -> L64
            return r0
        L64:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel.wQ2(com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
