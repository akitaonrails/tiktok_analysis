package com.ss.android.ugc.aweme.relation.recuser.popup;

import X.AbstractC2252651DEx;
import X.C099G;
import X.C0PEM;
import X.C1001680cAo;
import X.C1055930daJ;
import X.C1056060daW;
import X.C1071540dzU;
import X.C1072140e0S;
import X.C1264320j0Q;
import X.C1DFB;
import X.C1E7L;
import X.C23250099c;
import X.C995630c13;
import X.InterfaceC0148002o;
import X.InterfaceC1004520cFO;
import X.InterfaceC1055970daN;
import X.InterfaceC1073440e2Y;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RecUserAfterAuthPopupVM extends AssemViewModel<C995630c13> implements InterfaceC1073440e2Y {
    public final String LL;
    public final String LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public final InterfaceC1055970daN LLILZ;
    public final InterfaceC1004520cFO LLILZIL;
    public C099G LLILZLL;
    public C099G LLIZ;

    @Override // X.InterfaceC1073440e2Y
    public final void D12() {
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZ("Auth_RecUser", "on facebook auth");
        if (this.LLIZ != null) {
            return;
        }
        this.LLIZ = C23250099c.LIZIZ(getAssemVMScope(), this.LLILLL, null, new C1055930daJ(this, null), 2);
    }

    @Override // X.InterfaceC1073440e2Y
    public final void OX() {
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZ("Auth_RecUser", "on contact auth");
        if (this.LLILZLL != null) {
            return;
        }
        this.LLILZLL = C23250099c.LIZIZ(getAssemVMScope(), this.LLILLL, null, new C1056060daW(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995630c13(null, null);
    }

    @Override // X.InterfaceC1073440e2Y
    public final void w62() {
        C099G c099g = this.LLIZ;
        C099G c099g2 = this.LLILZLL;
        if (c099g == null && c099g2 == null) {
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZ("Auth_RecUser", "Not auth any platform");
            PopupManager.LIZJ(C1072140e0S.class);
        } else {
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZ("Auth_RecUser", "show popup!");
            if (SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.REC_POP)) {
                setState(AFwS252S0000000_16.get$arr$(334));
            }
            C23250099c.LIZLLL(getAssemVMScope(), this.LLILLL, null, new C1001680cAo(this, c099g, c099g2, null), 2);
        }
    }

    public RecUserAfterAuthPopupVM(String str, String str2) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C1071540dzU c1071540dzU = C1071540dzU.LIZIZ;
        InterfaceC1055970daN interfaceC1055970daNLIZIZ = c1071540dzU.LIZIZ();
        InterfaceC1004520cFO interfaceC1004520cFOLJII = c1071540dzU.LJII();
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1dfb;
        this.LLILZ = interfaceC1055970daNLIZIZ;
        this.LLILZIL = interfaceC1004520cFOLJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #1 {all -> 0x009c, blocks: (B:34:0x008b, B:35:0x008e, B:31:0x007d), top: B:48:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0957, X.0957<java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.AnonymousClass0957<java.lang.Boolean> r10, X.AnonymousClass0957<java.lang.Boolean> r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C1001910cBB
            if (r0 == 0) goto L27
            r7 = r12
            X.0cBB r7 = (X.C1001910cBB) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            java.lang.String r4 = "Auth_RecUser"
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 == r3) goto L35
            if (r0 != r6) goto L2d
            int r5 = r7.LLILLJJLI
            goto L8b
        L27:
            X.0cBB r7 = new X.0cBB
            r7.<init>(r9, r12)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.0957 r11 = r7.LL
            goto L48
        L38:
            X.C155000ia.LIZIZ(r1)
            if (r10 == 0) goto L7a
            r7.LL = r11     // Catch: java.lang.Throwable -> L59
            r7.LLILZIL = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r10.LJLIIIL(r7)     // Catch: java.lang.Throwable -> L59
            if (r1 != r8) goto L4b
            return r8
        L48:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
        L4b:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L59
            goto L65
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L65:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto L75
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            r0.getClass()
            java.lang.String r0 = "facebook sync fail"
            X.C1264320j0Q.LIZIZ(r4, r0, r1)
        L75:
            boolean r5 = X.C189200o6.m8isSuccessimpl(r2)
            goto L7b
        L7a:
            r5 = 1
        L7b:
            if (r11 == 0) goto Lbd
            r0 = 0
            r7.LL = r0     // Catch: java.lang.Throwable -> L9c
            r7.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L9c
            r7.LLILZIL = r6     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r1 = r11.LJLIIIL(r7)     // Catch: java.lang.Throwable -> L9c
            if (r1 != r8) goto L8e
            return r8
        L8b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9c
        L8e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L9c
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L9c
            goto La8
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        La8:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto Lb8
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            r0.getClass()
            java.lang.String r0 = "contact sync fail"
            X.C1264320j0Q.LIZIZ(r4, r0, r1)
        Lb8:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r2)
            goto Lbe
        Lbd:
            r0 = 1
        Lbe:
            if (r0 != 0) goto Lc3
            if (r5 != 0) goto Lc3
            r3 = 0
        Lc3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM.vQ2(X.0957, X.0957, X.05Vn):java.lang.Object");
    }
}
