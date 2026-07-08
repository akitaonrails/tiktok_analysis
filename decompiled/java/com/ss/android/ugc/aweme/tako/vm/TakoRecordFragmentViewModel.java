package com.ss.android.ugc.aweme.tako.vm;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0NPX;
import X.C189200o6;
import X.InterfaceC0148002o;
import X.InterfaceSurfaceHolderCallbackC20740316Dx;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoRecordFragmentViewModel extends AssemViewModel<C0NPX> {
    public boolean LL;
    public BottomSheetBehavior<View> LLILLJJLI;
    public InterfaceSurfaceHolderCallbackC20740316Dx LLILLL;
    public AnonymousClass0956 LLILZ;
    public Uri LLILZIL;
    public File LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0NPX(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super android.net.Uri> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0NPV
            if (r0 == 0) goto L35
            r4 = r6
            X.0NPV r4 = (X.C0NPV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L3b
            X.C155000ia.LIZIZ(r3)
        L22:
            android.net.Uri r0 = r5.LLILZIL
            return r0
        L25:
            X.C155000ia.LIZIZ(r3)
            X.0956 r0 = r5.LLILZ
            if (r0 == 0) goto L22
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJJZ(r4)
            if (r0 != r2) goto L22
            return r2
        L35:
            X.0NPV r4 = new X.0NPV
            r4.<init>(r5, r6)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    public final void wQ2(boolean z) {
        Boolean boolValueOf;
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        if (z) {
            try {
                File file = this.LLILZLL;
                if (file != null) {
                    boolValueOf = Boolean.valueOf(file.delete());
                } else {
                    boolValueOf = null;
                }
                C189200o6.m2constructorimpl(boolValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LLILZLL = null;
        if (z) {
            this.LLIZ = false;
        }
    }
}
