package com.ss.android.ugc.aweme.account;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XVG;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C2107308Nj;
import X.EnumC586700Mzk;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.hook.AfterLogoutHook;
import com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook;

/* JADX INFO: loaded from: classes14.dex */
public final class UpdateUserContextHook implements AfterLoginHook, AfterSwitchAccountHook, AfterLogoutHook {
    public final C0XVH LIZIZ = C0XVH.UPDATE_USER_CONTEXT_HOOK;
    public final C0XVG LIZJ = C0XVG.UPDATE_USER_CONTEXT_HOOK;
    public final EnumC586700Mzk LIZLLL = EnumC586700Mzk.UPDATE_USER_CONTEXT_HOOK;
    public final AbstractC2238408pq LJ;
    public final boolean LJFF;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLogoutHook
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        return true;
    }

    public UpdateUserContextHook() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C2107308Nj.LIZ;
        this.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final C0XVG LJFF() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLogoutHook
    public final EnumC586700Mzk LJII() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        return this.LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r6
      0x0023: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:6:0x001e, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final X.C0XVI r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            long r2 = java.lang.System.currentTimeMillis()
            X.0XVK r1 = r9.LIZLLL
            X.0XVK r0 = X.C0XVK.LOGIN
            r7 = 1
            r6 = 0
            if (r1 != r0) goto L55
            android.os.Bundle r0 = r9.LIZ
            X.15O7 r5 = X.C19276710bF.LIZ(r0)
        L12:
            X.0J6f r4 = new X.0J6f
            X.0XVK r0 = r9.LIZLLL
            int[] r1 = X.C0XVL.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r7) goto L23
            r6 = 2
            if (r0 == r6) goto L24
        L23:
            r7 = r6
        L24:
            r4.<init>(r7)
            X.C1440005kM.LIZ(r4)
            X.099m r4 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r10)
            r4.<init>(r0)
            X.0XVO<TTaskResult, TContinuationResult> r0 = new X.InterfaceC2385309Wh() { // from class: X.0XVO
                static {
                    /*
                        X.0XVO r0 = new X.0XVO
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0XVO<TTaskResult, TContinuationResult>) X.0XVO.LIZ X.0XVO
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XVO.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XVO.<init>():void");
                }

                @Override // X.InterfaceC2385309Wh
                public final java.lang.Object then(X.C15O7 r4) {
                    /*
                        r3 = this;
                        java.lang.String r2 = "UpdateUserContextHook@36ce.run$2$1"
                        X.C1C7U.LIZ(r2)
                        com.ss.android.ugc.aweme.ILoginService r1 = X.C0XQ7.LIZJ()
                        r0 = 1
                        r1.uploadAccountNum(r0)
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        X.C1C7U.LIZIZ(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XVO.then(X.15O7):java.lang.Object");
                }
            }
            X.15O7 r1 = r5.LJIILLIIL(r0)
            X.0XVD r0 = new X.0XVD
            r0.<init>()
            r1.LIZLLL(r0)
            java.lang.Object r1 = r4.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L4e
            X.C099Q.LIZJ(r10)
        L4e:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L93
            return r1
        L55:
            X.0XVK r0 = X.C0XVK.SWITCH_ACCOUNT
            if (r1 != r0) goto L77
            android.os.Bundle r4 = r9.LIZ
            int r0 = X.C294010Bfj.LIZIZ()
            if (r0 == r7) goto L75
            int r1 = X.C294010Bfj.LIZIZ()
            r0 = 3
            if (r1 == r0) goto L75
            int r1 = X.C294010Bfj.LIZIZ()
            r0 = 4
            if (r1 == r0) goto L75
            r0 = 0
        L70:
            X.15O7 r5 = X.C19276710bF.LIZJ(r4, r0)
            goto L12
        L75:
            r0 = 1
            goto L70
        L77:
            android.os.Bundle r5 = r9.LIZ
            X.0XVP r4 = new X.0XVP
            r4.<init>(r6)
            boolean r0 = r9 instanceof X.C0XVR
            if (r0 == 0) goto L87
            r1 = r9
            X.0XVR r1 = (X.C0XVR) r1
            if (r1 != 0) goto L8e
        L87:
            X.0XVR r1 = new X.0XVR
            android.os.Bundle r0 = r9.LIZ
            r1.<init>(r0, r6)
        L8e:
            X.15O7 r5 = X.C19276710bF.LIZIZ(r5, r4, r1)
            goto L12
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.UpdateUserContextHook.LIZ(X.0XVI, X.05Vn):java.lang.Object");
    }
}
