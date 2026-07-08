package com.tts.oecverify.verify;

import X.C14A2;
import X.C14AC;
import X.C785410UrT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class RiskControlService implements C14A2 {
    public C14AC mDialogShowing;
    public String mShowingRequestPath;
    public boolean mForceFetchSettings = true;
    public boolean mSyncSettings = true;

    @Override // X.C14A2
    public boolean isProcess(int i) {
        return i == 2 || i == 15;
    }

    public final void dismissVerifyDialog() {
        try {
            C14AC c14ac = this.mDialogShowing;
            if (c14ac == null || !c14ac.isShowing()) {
                return;
            }
            C14AC c14ac2 = this.mDialogShowing;
            c14ac2.dismiss();
            C785410UrT.LIZ(c14ac2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final int getBlockedSamePathCount() {
        C14AC c14ac = this.mDialogShowing;
        if (c14ac != null) {
            return c14ac.LLJLLL;
        }
        return 0;
    }

    public final void increaseBlockSamePathReqCount() {
        C14AC c14ac = this.mDialogShowing;
        if (c14ac != null) {
            c14ac.LLJLLL++;
        }
    }

    public final String getMShowingRequestPath() {
        return this.mShowingRequestPath;
    }

    public final String getShowingRequestPath() {
        return this.mShowingRequestPath;
    }

    public final void setMShowingRequestPath(String str) {
        this.mShowingRequestPath = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // X.C14A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean execute(final X.AbstractC202199149t r17, final com.tts.oecverify.BdTuringCallback r18) {
        /*
            r16 = this;
            r3 = r16
            java.lang.String r2 = r3.mShowingRequestPath
            r0 = 1
            r8 = r17
            if (r2 == 0) goto L1b
            java.lang.String r1 = r8.LJFF()
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 == 0) goto L1b
            X.14AC r2 = r3.mDialogShowing
            int r1 = r2.LLJLLL
            int r1 = r1 + 1
            r2.LLJLLL = r1
        L1b:
            X.14AC r1 = r3.mDialogShowing
            r14 = 0
            r2 = r18
            if (r1 == 0) goto L3d
            boolean r1 = r1.isShowing()
            if (r1 != r0) goto L3d
            X.149V r1 = X.C149V.VERIFY_POP_CONFLICT_ERROR
            int r9 = r1.getCode()
            r10 = 0
            r12 = 0
            java.lang.String r13 = r3.mShowingRequestPath
            r8 = r8
            X.C202191149l.LJII(r8, r9, r10, r12, r13)
            r1 = 998(0x3e6, float:1.398E-42)
            r2.onFail(r1, r12)
            return r0
        L3d:
            long r10 = java.lang.System.currentTimeMillis()
            X.149w r7 = new X.149w
            r7 = r7
            r9 = r2
            r12 = r3
            r7.<init>()
            X.149f r6 = X.C202185149f.LIZ
            java.lang.String r2 = r8.LJI()
            java.lang.String r4 = r8.LJIIIZ()
            int r1 = r2.length()
            if (r1 == 0) goto L94
            int r1 = r4.length()
            if (r1 == 0) goto L94
            java.lang.String r1 = "setting_version"
            org.json.JSONObject r1 = X.C202185149f.LJII(r1)
            java.lang.String r2 = r1.optString(r2)
            int r1 = r2.length()
            if (r1 <= 0) goto L94
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L94
            r5 = 0
        L76:
            r3.mSyncSettings = r5
            java.lang.String r13 = r8.LJII()
            java.lang.String r15 = r8.LJFF()
            r1 = 137774(0x21a2e, float:1.93062E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r1)
            if (r5 != 0) goto L92
            r9 = -1
            r8 = 0
            r10 = 0
            java.lang.String r12 = "pop_update"
            r7.LIZIZ(r8, r9, r10, r12, r13, r14, r15)
        L92:
            monitor-enter(r6)
            goto L96
        L94:
            r5 = 1
            goto L76
        L96:
            java.util.List<X.14A3> r2 = X.C202185149f.LJI     // Catch: java.lang.Throwable -> Lb9
            r1 = r2
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch: java.lang.Throwable -> Lb9
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb9
            if (r1 != 0) goto La2
            r14 = 1
        La2:
            if (r5 == 0) goto La9
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch: java.lang.Throwable -> Lb9
            r2.add(r7)     // Catch: java.lang.Throwable -> Lb9
        La9:
            if (r14 == 0) goto Lb2
            java.lang.String r3 = "pop_update"
            r1 = 0
            X.C202185149f.LJIIIZ(r1, r3, r13, r15)     // Catch: java.lang.Throwable -> Lb9
        Lb2:
            monitor-exit(r6)
            if (r4 == 0) goto Lb8
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb8:
            return r0
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r6)
            if (r4 == 0) goto Lc3
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tts.oecverify.verify.RiskControlService.execute(X.149t, com.tts.oecverify.BdTuringCallback):boolean");
    }
}
