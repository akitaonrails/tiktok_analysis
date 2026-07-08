package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.AbstractC637050Oyl;
import X.C01GW;
import X.C0AP9;
import X.C0NN5;
import X.C0PEM;
import X.C1720106oR;
import X.C1901570zaF;
import X.C1DEV;
import X.C20554115bn;
import X.C20554315bp;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C452501pT;
import X.C636870OyT;
import X.C636930OyZ;
import X.C637060Oym;
import X.EnumC20654715s1;
import X.InterfaceC625970Ogt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.n;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class M2BannerAssem extends InboxBannerAssem {
    public final Set<String> LLILZ = new LinkedHashSet();
    public final Set<String> LLILZIL = new LinkedHashSet();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(268));
    public final C1DEV LLIZ = C2191201ApK.LIZ();

    public final InterfaceC625970Ogt ho() {
        return (InterfaceC625970Ogt) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C20554315bp c20554315bp = C20554315bp.LIZIZ;
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.INBOX_BANNER;
        c20554315bp.LJIIIIZZ(enumC20654715s1, new AbstractC637050Oyl() { // from class: X.0OyU
            @Override // X.AbstractC637050Oyl
            public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                this.LIZ.ko(c20554115bn, str, nVar);
            }
        });
        c20554315bp.LJ(enumC20654715s1, "enter_inbox_tab", new AbstractC637050Oyl() { // from class: X.0OyV
            @Override // X.AbstractC637050Oyl
            public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                this.LIZ.ko(c20554115bn, str, nVar);
            }
        });
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (((Number) C0AP9.LIZ.getValue()).intValue() == 1) {
            C20554315bp.LIZIZ.LIZIZ(EnumC20654715s1.INBOX_BANNER);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    /* JADX INFO: renamed from: do */
    public final void mo243do(C637060Oym c637060Oym) {
        if (this.LLILZIL.contains(c637060Oym.LLILLJJLI)) {
            return;
        }
        this.LLILZIL.add(c637060Oym.LLILLJJLI);
        C1901570zaF c1901570zaF = C1901570zaF.LIZ;
        Map<String, String> map = c637060Oym.LLJILLL;
        c1901570zaF.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        C20684815ws.LJIILLIIL("guide_user_m2_show", c2344009Gk.LIZ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0NN5(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            java.lang.String r5 = "m2_inbox_banner_not_clicked"
            boolean r0 = r9 instanceof X.C0NN6
            if (r0 == 0) goto L28
            r7 = r9
            X.0NN6 r7 = (X.C0NN6) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZ = r2
        L14:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L2e
            X.1DEV r3 = r7.LL
            X.C155000ia.LIZIZ(r6)
            goto L46
        L28:
            X.0NN6 r7 = new X.0NN6
            r7.<init>(r8, r9)
            goto L14
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r6)
            X.1DEV r3 = r8.LLIZ
            r7.LL = r3
            r7.LLILZ = r0
            java.lang.Object r0 = r3.LIZLLL(r4, r7)
            if (r0 != r2) goto L46
            return r2
        L46:
            X.0Ogt r1 = r8.ho()     // Catch: java.lang.Throwable -> L89
            r6 = 0
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r0 = r1.LJI(r5, r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L7d
            java.util.List r2 = X.C13LQ.LJLI(r0)     // Catch: java.lang.Throwable -> L89
        L57:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L89
            r2.add(r0)     // Catch: java.lang.Throwable -> L89
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L89
            r0 = 100
            if (r1 <= r0) goto L6d
            r2.remove(r6)     // Catch: java.lang.Throwable -> L89
        L6d:
            X.0Ogt r1 = r8.ho()     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L89
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L89
            r1.LJII(r5, r0)     // Catch: java.lang.Throwable -> L89
            goto L83
        L7d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r2.<init>()     // Catch: java.lang.Throwable -> L89
            goto L57
        L83:
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L89
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem.mo(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object oo(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            java.lang.String r5 = "m2_inbox_banner_frequency"
            boolean r0 = r9 instanceof X.C0NN7
            if (r0 == 0) goto L28
            r7 = r9
            X.0NN7 r7 = (X.C0NN7) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZ = r2
        L14:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L2e
            X.1DEV r3 = r7.LL
            X.C155000ia.LIZIZ(r6)
            goto L46
        L28:
            X.0NN7 r7 = new X.0NN7
            r7.<init>(r8, r9)
            goto L14
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r6)
            X.1DEV r3 = r8.LLIZ
            r7.LL = r3
            r7.LLILZ = r0
            java.lang.Object r0 = r3.LIZLLL(r4, r7)
            if (r0 != r2) goto L46
            return r2
        L46:
            X.0Ogt r1 = r8.ho()     // Catch: java.lang.Throwable -> L89
            r6 = 0
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r0 = r1.LJI(r5, r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L7d
            java.util.List r2 = X.C13LQ.LJLI(r0)     // Catch: java.lang.Throwable -> L89
        L57:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L89
            r2.add(r0)     // Catch: java.lang.Throwable -> L89
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L89
            r0 = 100
            if (r1 <= r0) goto L6d
            r2.remove(r6)     // Catch: java.lang.Throwable -> L89
        L6d:
            X.0Ogt r1 = r8.ho()     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L89
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L89
            r1.LJII(r5, r0)     // Catch: java.lang.Throwable -> L89
            goto L83
        L7d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r2.<init>()     // Catch: java.lang.Throwable -> L89
            goto L57
        L83:
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L89
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem.oo(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lo(boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0NN8
            if (r0 == 0) goto L3c
            r6 = r9
            X.0NN8 r6 = (X.C0NN8) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r3 = r6.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILZIL
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L67
            boolean r8 = r6.LL
            X.1DEV r4 = r6.LLILLJJLI
            X.C155000ia.LIZIZ(r3)
        L27:
            if (r8 == 0) goto L50
            goto L42
        L2a:
            X.C155000ia.LIZIZ(r3)
            X.1DEV r4 = r7.LLIZ
            r6.LLILLJJLI = r4
            r6.LL = r8
            r6.LLILZIL = r0
            java.lang.Object r0 = r4.LIZLLL(r5, r6)
            if (r0 != r2) goto L27
            return r2
        L3c:
            X.0NN8 r6 = new X.0NN8
            r6.<init>(r7, r9)
            goto L12
        L42:
            X.0Ogt r3 = r7.ho()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "m2_inbox_banner_exit_strategy_click_x_mark"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            r3.LJIIIIZZ(r2, r0)     // Catch: java.lang.Throwable -> L5f
            goto L59
        L50:
            X.0Ogt r1 = r7.ho()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "m2_inbox_banner_not_clicked"
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> L5f
        L59:
            r4.LIZIZ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5f
            r4.LIZIZ(r5)
            throw r0
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem.lo(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object so(com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem.so(com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uo(com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem.uo(com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo, X.05Vn):java.lang.Object");
    }

    public final void ko(C20554115bn c20554115bn, String str, n nVar) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onM2SignalReceive, result.errorCode: ");
        sbLIZ.append(c20554115bn.LIZ);
        sbLIZ.append(", result.errorMsg: ");
        sbLIZ.append(c20554115bn.LIZIZ);
        sbLIZ.append(", timing: ");
        sbLIZ.append(str);
        C1720106oR.LJI("M2BannerAssem", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onM2SignalReceive, contentParam: ");
        sbLIZ2.append(nVar);
        C2188811AlT.LIZIZ(sbLIZ2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C636870OyT(CoroutineExceptionHandler.LJJLIL, str, nVar)), null, new C636930OyZ(c20554115bn, this, nVar, str, null), 2);
    }
}
