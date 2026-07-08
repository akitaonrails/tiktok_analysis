package com.ss.android.ugc.profile.business.ur.school.verifyschool;

import X.C01GW;
import X.C338080DNe;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class VerifySchoolViewModel extends AssemViewModel<C338080DNe> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2282));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2283));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2285));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2284));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C338080DNe(0);
    }

    public final String wQ2() {
        return (String) this.LLILLL.getValue();
    }

    public final VerifySchoolCache xQ2() {
        return (VerifySchoolCache) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(java.lang.String r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel.AQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.C331430Cyz r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel.vQ2(X.0Cyz, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C331020CyK
            if (r0 == 0) goto L74
            r5 = r8
            X.0CyK r5 = (X.C331020CyK) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L41
            if (r0 != r1) goto L86
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r4)
        L26:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L7a
            int r0 = r4.length()
            if (r0 == 0) goto L7a
            X.01wk r3 = r6.getAssemVMScope()
            X.0DNd r2 = new X.0DNd
            r1 = 0
            r2.<init>(r6, r4, r7, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            X.C155000ia.LIZIZ(r4)
            r0 = 141(0x8d, float:1.98E-43)
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            r6.setState(r0)
            r5.LL = r7
            r5.LLILZ = r1
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r2.<init>(r0)
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 189(0xbd, float:2.65E-43)
            r1.<init>(r2, r0)
            r6.withState(r1)
            java.lang.Object r4 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r4 != r0) goto L71
            X.C099Q.LIZJ(r5)
        L71:
            if (r4 != r3) goto L26
            return r3
        L74:
            X.0CyK r5 = new X.0CyK
            r5.<init>(r6, r8)
            goto L12
        L7a:
            r0 = 142(0x8e, float:1.99E-43)
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            r6.setState(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel.yQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C330990CyH
            if (r0 == 0) goto L24
            r5 = r10
            X.0CyH r5 = (X.C330990CyH) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r6 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 == r1) goto L51
            if (r0 != r2) goto L2a
            goto L68
        L24:
            X.0CyH r5 = new X.0CyH
            r5.<init>(r7, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r6)
            int r0 = r9.length()     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            if (r0 != 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 == 0) goto L57
            X.01GW r0 = r7.LL     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            java.lang.Object r0 = r0.getValue()     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolAPI r0 = (com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolAPI) r0     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            r5.LLILLL = r1     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            java.lang.Object r6 = r0.verifyEmail(r8, r5)     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            if (r6 != r4) goto L54
            return r4
        L51:
            X.C155000ia.LIZIZ(r6)     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
        L54:
            com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse r6 = (com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse) r6     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            goto L6d
        L57:
            X.01GW r0 = r7.LL     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            java.lang.Object r0 = r0.getValue()     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolAPI r0 = (com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolAPI) r0     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            r5.LLILLL = r2     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            java.lang.Object r6 = r0.verifyEmail(r8, r9, r5)     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
            if (r6 != r4) goto L6b
            return r4
        L68:
            X.C155000ia.LIZIZ(r6)     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
        L6b:
            com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse r6 = (com.ss.android.ugc.profile.business.ur.school.datasource.VerifyEmailResponse) r6     // Catch: X.C0XIR -> L83 java.io.IOException -> L91
        L6d:
            java.util.List<com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoResponse> r0 = r6.schoolInfo
            if (r0 == 0) goto L77
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L78
        L77:
            r3 = 1
        L78:
            if (r3 == 0) goto L7b
            return r6
        L7b:
            X.0DNY r1 = new X.0DNY
            java.util.List<com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoResponse> r0 = r6.schoolInfo
            r1.<init>(r0)
            throw r1
        L83:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0DNW r1 = new X.0DNW
            java.lang.String r0 = r2.getErrorMsg()
            r1.<init>(r2, r0)
            throw r1
        L91:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0DNW r1 = new X.0DNW
            r0 = 0
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.verifyschool.VerifySchoolViewModel.zQ2(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
