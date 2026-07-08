package com.ss.android.ugc.aweme.featureeffectvideo.model;

import X.C01GW;
import X.C11NJ;
import X.C452501pT;
import X.EnumC615370OBr;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureVideoViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(106));
    public final MutableLiveData<EnumC615370OBr> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public final MutableLiveData<Integer> LLILZ;
    public final MutableLiveData LLILZIL;

    public FeatureVideoViewModel() {
        MutableLiveData<EnumC615370OBr> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(-1);
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = mutableLiveData2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LL.getValue()).LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(java.lang.String r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C615350OBp
            if (r0 == 0) goto L20
            r4 = r7
            X.0OBp r4 = (X.C615350OBp) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L4a
        L20:
            X.0OBp r4 = new X.0OBp
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            if (r6 != 0) goto L36
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.0OBw r0 = X.C615420OBw.LIZ     // Catch: java.lang.Throwable -> L66
            r0.getClass()     // Catch: java.lang.Throwable -> L66
            com.ss.android.ugc.aweme.featureeffectvideo.repo.FeatureVideoApi r0 = X.C615420OBw.LIZIZ     // Catch: java.lang.Throwable -> L66
            X.11NZ r0 = r0.LIZ(r6)     // Catch: java.lang.Throwable -> L66
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)     // Catch: java.lang.Throwable -> L66
            if (r3 != r2) goto L4d
            return r2
        L4a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L66
        L4d:
            com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList r3 = (com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList) r3     // Catch: java.lang.Throwable -> L66
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.items     // Catch: java.lang.Throwable -> L66
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L66
            r0 = r0 ^ 1
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r5.LLILZ     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L66
            r1.postValue(r0)     // Catch: java.lang.Throwable -> L66
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L66
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L66
            goto L72
        L66:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L72:
            X.C189200o6.m5exceptionOrNullimpl(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel.vQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(androidx.lifecycle.LifecycleOwner r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C615340OBo
            if (r0 == 0) goto L55
            r6 = r9
            X.0OBo r6 = (X.C615340OBo) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L5b
            X.C155000ia.LIZIZ(r1)
        L23:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L2b
            boolean r4 = r1.booleanValue()
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L30:
            X.C155000ia.LIZIZ(r1)
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r7.LLILZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L63
            int r1 = r0.intValue()
            r0 = -1
            if (r1 != r0) goto L63
            X.0OBm r2 = new X.0OBm
            r0 = 0
            r2.<init>(r7, r8, r0)
            r6.LLILLL = r3
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r1 = X.C099A.LIZJ(r0, r2, r6)
            if (r1 != r5) goto L23
            return r5
        L55:
            X.0OBo r6 = new X.0OBo
            r6.<init>(r7, r9)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L63:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r7.LLILZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L74
            int r0 = r0.intValue()
            if (r0 != r3) goto L74
            r4 = 1
        L74:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel.wQ2(androidx.lifecycle.LifecycleOwner, X.05Vn):java.lang.Object");
    }
}
