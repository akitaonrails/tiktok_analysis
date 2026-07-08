package com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel;

import X.C1888220zEi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatorCareModeNewDesignViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData<Boolean> LLILLJJLI;

    public CreatorCareModeNewDesignViewModel() {
        C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
        c1888220zEi.LJFF();
        boolean zLIZLLL = c1888220zEi.LIZLLL();
        this.LL = new MutableLiveData<>(Boolean.TRUE);
        this.LLILLJJLI = new MutableLiveData<>(Boolean.valueOf(zLIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1415105gL
            if (r0 == 0) goto L20
            r5 = r7
            X.05gL r5 = (X.C1415105gL) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L42
        L20:
            X.05gL r5 = new X.05gL
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            X.05gJ r1 = new X.05gJ     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            if (r1 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
        L45:
            X.00o6 r1 = (X.C189200o6) r1     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            java.lang.Object r0 = r1.m10unboximpl()     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L59
            return r0
        L4c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel.wQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.String>> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1415205gM
            if (r0 == 0) goto L3d
            r5 = r7
            X.05gM r5 = (X.C1415205gM) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.05gF r1 = new X.05gF
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.05gM r5 = new X.05gM
            r5.<init>(r6, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(boolean r7, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.String>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1415005gK
            if (r0 == 0) goto L43
            r5 = r8
            X.05gK r5 = (X.C1415005gK) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILLL
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2c
            if (r2 == r0) goto L51
            if (r2 != r1) goto L49
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L2b:
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            if (r7 == 0) goto L3a
            r5.LLILLL = r0
            java.lang.Object r0 = r6.wQ2(r5)
            if (r0 != r3) goto L5a
            return r3
        L3a:
            r5.LLILLL = r1
            java.lang.Object r0 = r6.xQ2(r5)
            if (r0 != r3) goto L2b
            return r3
        L43:
            X.05gK r5 = new X.05gK
            r5.<init>(r6, r8)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L51:
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.viewmodel.CreatorCareModeNewDesignViewModel.vQ2(boolean, X.05Vn):java.lang.Object");
    }
}
