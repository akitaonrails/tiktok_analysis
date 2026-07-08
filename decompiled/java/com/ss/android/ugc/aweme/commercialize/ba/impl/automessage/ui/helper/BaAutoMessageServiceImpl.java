package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper;

import X.AnonymousClass0956;
import X.C04TD;
import X.C2191031Ap3;
import X.C2191041Ap4;
import X.C2191051Ap5;
import X.C2191071Ap7;
import X.C23250099c;
import X.C475600Ikw;
import X.C483830IyD;
import X.C484210Iyp;
import X.C817503Hh;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes35.dex */
public final class BaAutoMessageServiceImpl implements IBaAutoMessageService {
    public AnonymousClass0956 LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public JobSupport LJ;
    public C484210Iyp LJFF;
    public List<C475600Ikw> LJI = new ArrayList();
    public AnonymousClass0956 LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public C483830IyD LJIIIZ;

    public static IBaAutoMessageService LJIJ() {
        Object objLIZ = C04TD.LIZ(IBaAutoMessageService.class, false);
        if (objLIZ != null) {
            return (IBaAutoMessageService) objLIZ;
        }
        if (C04TD.LLJLIL == null) {
            synchronized (IBaAutoMessageService.class) {
                if (C04TD.LLJLIL == null) {
                    C04TD.LLJLIL = new BaAutoMessageServiceImpl();
                }
            }
        }
        return C04TD.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJ() {
        this.LJIIIIZZ = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2191031Ap3(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJFF() {
        this.LIZ = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2191041Ap4(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJIILIIL() {
        this.LJ = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2191071Ap7(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    public final void LJIILL() {
        this.LJII = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2191051Ap5(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C483830IyD> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2191341ApY
            if (r0 == 0) goto L44
            r5 = r7
            X.1ApY r5 = (X.C2191341ApY) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L52
            if (r0 != r2) goto L4a
            X.C155000ia.LIZIZ(r4)
        L25:
            X.0IyD r0 = r6.LJIIIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.0956 r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L3b
            r6.LJ()
            r5.LLILLL = r1
            java.lang.Object r4 = r6.LIZ(r5)
            if (r4 != r3) goto L55
            return r3
        L3b:
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L25
            return r3
        L44:
            X.1ApY r5 = new X.1ApY
            r5.<init>(r6, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L52:
            X.C155000ia.LIZIZ(r4)
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2191351ApZ
            if (r0 == 0) goto L48
            r5 = r7
            X.1ApZ r5 = (X.C2191351ApZ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L56
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r4)
        L25:
            boolean r0 = r6.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            X.0956 r0 = r6.LIZ
            if (r0 != 0) goto L3f
            r6.LJFF()
            r5.LLILLL = r1
            java.lang.Object r4 = r6.LIZLLL(r5)
            if (r4 != r3) goto L59
            return r3
        L3f:
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L25
            return r3
        L48:
            X.1ApZ r5 = new X.1ApZ
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            X.C155000ia.LIZIZ(r4)
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super java.util.List<X.C475600Ikw>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2191331ApX
            if (r0 == 0) goto L44
            r5 = r7
            X.1ApX r5 = (X.C2191331ApX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L52
            if (r0 != r2) goto L4a
            X.C155000ia.LIZIZ(r4)
        L25:
            java.util.List<X.0Ikw> r0 = r6.LJI
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.0956 r0 = r6.LJII
            if (r0 != 0) goto L3b
            r6.LJIILL()
            r5.LLILLL = r1
            java.lang.Object r4 = r6.LJI(r5)
            if (r4 != r3) goto L55
            return r3
        L3b:
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L25
            return r3
        L44:
            X.1ApX r5 = new X.1ApX
            r5.<init>(r6, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L52:
            X.C155000ia.LIZIZ(r4)
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2191321ApW
            if (r0 == 0) goto L48
            r5 = r7
            X.1ApW r5 = (X.C2191321ApW) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L56
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r4)
        L25:
            boolean r0 = r6.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            X.0956 r0 = r6.LIZ
            if (r0 != 0) goto L3f
            r6.LJFF()
            r5.LLILLL = r1
            java.lang.Object r4 = r6.LJIIJ(r5)
            if (r4 != r3) goto L59
            return r3
        L3f:
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L25
            return r3
        L48:
            X.1ApW r5 = new X.1ApW
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            X.C155000ia.LIZIZ(r4)
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2191371Apb
            if (r0 == 0) goto L48
            r5 = r7
            X.1Apb r5 = (X.C2191371Apb) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L56
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r4)
        L25:
            boolean r0 = r6.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            X.0956 r0 = r6.LIZ
            if (r0 != 0) goto L3f
            r6.LJFF()
            r5.LLILLL = r1
            java.lang.Object r4 = r6.LJIIJJI(r5)
            if (r4 != r3) goto L59
            return r3
        L3f:
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L25
            return r3
        L48:
            X.1Apb r5 = new X.1Apb
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            X.C155000ia.LIZIZ(r4)
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIJJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn<? super X.C484210Iyp> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2191361Apa
            if (r0 == 0) goto L44
            r5 = r7
            X.1Apa r5 = (X.C2191361Apa) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L52
            if (r0 != r2) goto L4a
            X.C155000ia.LIZIZ(r4)
        L25:
            X.0Iyp r0 = r6.LJFF
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            kotlinx.coroutines.JobSupport r0 = r6.LJ
            if (r0 != 0) goto L3b
            r6.LJIILIIL()
            r5.LLILLL = r1
            java.lang.Object r4 = r6.LJIIL(r5)
            if (r4 != r3) goto L55
            return r3
        L3b:
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L25
            return r3
        L44:
            X.1Apa r5 = new X.1Apa
            r5.<init>(r6, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L52:
            X.C155000ia.LIZIZ(r4)
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C475600Ikw r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2191241ApO
            if (r0 == 0) goto L22
            r6 = r9
            X.1ApO r6 = (X.C2191241ApO) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            X.0Ikw r8 = r6.LL
            goto L60
        L22:
            X.1ApO r6 = new X.1ApO
            r6.<init>(r7, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            int r1 = r8.LIZIZ
            r0 = 2
            if (r1 != r0) goto L3e
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3e:
            X.1Apc r3 = X.C2191381Apc.LIZ     // Catch: java.lang.Exception -> L80
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct r2 = new com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct     // Catch: java.lang.Exception -> L80
            r2.<init>()     // Catch: java.lang.Exception -> L80
            long r0 = r8.LIZ     // Catch: java.lang.Exception -> L80
            r2.messageId = r0     // Catch: java.lang.Exception -> L80
            r3.getClass()     // Catch: java.lang.Exception -> L80
            r0 = 4
            com.google.common.util.concurrent.ListenableFuture r0 = X.C2191381Apc.LJ(r0, r2)     // Catch: java.lang.Exception -> L80
            X.099F r0 = X.C23183096n.LIZ(r0)     // Catch: java.lang.Exception -> L80
            r6.LL = r8     // Catch: java.lang.Exception -> L80
            r6.LLILZ = r4     // Catch: java.lang.Exception -> L80
            java.lang.Object r1 = r0.LJLIIIL(r6)     // Catch: java.lang.Exception -> L80
            if (r1 != r5) goto L63
            return r5
        L60:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L80
        L63:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L80
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L80
            if (r0 != 0) goto L7a
            java.util.List<X.0Ikw> r2 = r7.LJI     // Catch: java.lang.Exception -> L80
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7     // Catch: java.lang.Exception -> L80
            r0 = 196(0xc4, float:2.75E-43)
            r1.<init>(r8, r0)     // Catch: java.lang.Exception -> L80
            X.C19719612Di.LJJIIJ(r2, r1, r4)     // Catch: java.lang.Exception -> L80
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L80
            return r0
        L7a:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L80
            return r0
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZIZ(X.0Ikw, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C475600Ikw r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C2191251ApP
            if (r0 == 0) goto L22
            r5 = r11
            X.1ApP r5 = (X.C2191251ApP) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r8 = 1
            if (r0 == 0) goto L30
            if (r0 != r8) goto L28
            X.0Ikw r10 = r5.LL
            goto L5d
        L22:
            X.1ApP r5 = new X.1ApP
            r5.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.1Apc r3 = X.C2191381Apc.LIZ     // Catch: java.lang.Exception -> L9d
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct r2 = new com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct     // Catch: java.lang.Exception -> L9d
            r2.<init>()     // Catch: java.lang.Exception -> L9d
            long r0 = r10.LIZ     // Catch: java.lang.Exception -> L9d
            r2.messageId = r0     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = r10.LIZJ     // Catch: java.lang.Exception -> L9d
            r2.keyword = r0     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = r10.LIZLLL     // Catch: java.lang.Exception -> L9d
            r2.content = r0     // Catch: java.lang.Exception -> L9d
            r3.getClass()     // Catch: java.lang.Exception -> L9d
            r0 = 3
            com.google.common.util.concurrent.ListenableFuture r0 = X.C2191381Apc.LJ(r0, r2)     // Catch: java.lang.Exception -> L9d
            X.099F r0 = X.C23183096n.LIZ(r0)     // Catch: java.lang.Exception -> L9d
            r5.LL = r10     // Catch: java.lang.Exception -> L9d
            r5.LLILZ = r8     // Catch: java.lang.Exception -> L9d
            java.lang.Object r1 = r0.LJLIIIL(r5)     // Catch: java.lang.Exception -> L9d
            if (r1 != r4) goto L60
            return r4
        L5d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L9d
        L60:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L9d
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L97
            java.util.List<X.0Ikw> r0 = r9.LJI     // Catch: java.lang.Exception -> L9d
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> L9d
            r6 = 0
        L6d:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L9d
            r5 = -1
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Exception -> L9d
            X.0Ikw r0 = (X.C475600Ikw) r0     // Catch: java.lang.Exception -> L9d
            long r3 = r0.LIZ     // Catch: java.lang.Exception -> L9d
            long r1 = r10.LIZ     // Catch: java.lang.Exception -> L9d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L84
            r0 = 1
            goto L85
        L84:
            r0 = 0
        L85:
            if (r0 != 0) goto L8b
            int r6 = r6 + 1
            goto L6d
        L8a:
            r6 = -1
        L8b:
            if (r6 == r5) goto L92
            java.util.List<X.0Ikw> r0 = r9.LJI     // Catch: java.lang.Exception -> L9d
            r0.set(r6, r10)     // Catch: java.lang.Exception -> L9d
        L92:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L9d
            return r0
        L97:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L9d
            return r0
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LIZJ(X.0Ikw, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(boolean r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2191291ApT
            if (r0 == 0) goto L4a
            r6 = r9
            X.1ApT r6 = (X.C2191291ApT) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L56
            boolean r8 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L50
            r7.LIZJ = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            r6.LL = r8
            r6.LLILZ = r4
            X.1DFB r3 = X.C0PEM.LIZJ
            X.1Ap6 r2 = new X.1Ap6
            r1 = 0
            r0 = 2
            r2.<init>(r0, r8, r7, r1)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r3, r2)
            if (r1 != r5) goto L24
            return r5
        L4a:
            X.1ApT r6 = new X.1ApT
            r6.<init>(r7, r9)
            goto L12
        L50:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJII(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(boolean r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2191301ApU
            if (r0 == 0) goto L4a
            r6 = r9
            X.1ApU r6 = (X.C2191301ApU) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L56
            boolean r8 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L50
            r7.LIZLLL = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            r6.LL = r8
            r6.LLILZ = r4
            X.1DFB r3 = X.C0PEM.LIZJ
            X.1Ap6 r2 = new X.1Ap6
            r1 = 0
            r0 = 3
            r2.<init>(r0, r8, r7, r1)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r3, r2)
            if (r1 != r5) goto L24
            return r5
        L4a:
            X.1ApU r6 = new X.1ApU
            r6.<init>(r7, r9)
            goto L12
        L50:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIIIZZ(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C484210Iyp r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2191261ApQ
            if (r0 == 0) goto L23
            r6 = r9
            X.1ApQ r6 = (X.C2191261ApQ) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L29
            X.0Iyp r8 = r6.LL
            goto L58
        L23:
            X.1ApQ r6 = new X.1ApQ
            r6.<init>(r7, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            java.lang.Long r2 = r8.LIZ
            if (r2 != 0) goto L3d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L3d:
            X.1Apc r0 = X.C2191381Apc.LIZ     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = r8.LIZJ     // Catch: java.lang.Exception -> L6b
            r0.getClass()     // Catch: java.lang.Exception -> L6b
            r0 = 3
            com.google.common.util.concurrent.ListenableFuture r0 = X.C2191381Apc.LJI(r0, r2, r1)     // Catch: java.lang.Exception -> L6b
            X.099F r0 = X.C23183096n.LIZ(r0)     // Catch: java.lang.Exception -> L6b
            r6.LL = r8     // Catch: java.lang.Exception -> L6b
            r6.LLILZ = r3     // Catch: java.lang.Exception -> L6b
            java.lang.Object r1 = r0.LJLIIIL(r6)     // Catch: java.lang.Exception -> L6b
            if (r1 != r5) goto L5b
            return r5
        L58:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6b
        L5b:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L6b
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L6b
            if (r0 != 0) goto L6f
            r7.LJFF = r8     // Catch: java.lang.Exception -> L6b
            X.099F r0 = X.C090F.LIZ(r8)     // Catch: java.lang.Exception -> L6b
            r7.LJ = r0     // Catch: java.lang.Exception -> L6b
            r4 = 1
            goto L6f
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIIZ(X.0Iyp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.C475600Ikw r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIILJJIL(X.0Ikw, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C484210Iyp r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2191281ApS
            if (r0 == 0) goto L22
            r4 = r9
            X.1ApS r4 = (X.C2191281ApS) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 != r5) goto L28
            X.0Iyp r8 = r4.LL
            goto L6a
        L22:
            X.1ApS r4 = new X.1ApS
            r4.<init>(r7, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            int r0 = r8.LIZIZ     // Catch: java.lang.Exception -> L98
            r3 = 2
            if (r0 == r5) goto L4e
            if (r0 == r3) goto L40
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L98
            return r0
        L40:
            X.1Apc r2 = X.C2191381Apc.LIZ     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = r8.LIZJ     // Catch: java.lang.Exception -> L98
            java.lang.Long r0 = r8.LIZ     // Catch: java.lang.Exception -> L98
            r2.getClass()     // Catch: java.lang.Exception -> L98
            com.google.common.util.concurrent.ListenableFuture r0 = X.C2191381Apc.LJI(r5, r0, r1)     // Catch: java.lang.Exception -> L98
            goto L5b
        L4e:
            X.1Apc r2 = X.C2191381Apc.LIZ     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = r8.LIZJ     // Catch: java.lang.Exception -> L98
            java.lang.Long r0 = r8.LIZ     // Catch: java.lang.Exception -> L98
            r2.getClass()     // Catch: java.lang.Exception -> L98
            com.google.common.util.concurrent.ListenableFuture r0 = X.C2191381Apc.LJI(r3, r0, r1)     // Catch: java.lang.Exception -> L98
        L5b:
            X.099F r0 = X.C23183096n.LIZ(r0)     // Catch: java.lang.Exception -> L98
            r4.LL = r8     // Catch: java.lang.Exception -> L98
            r4.LLILZ = r5     // Catch: java.lang.Exception -> L98
            java.lang.Object r1 = r0.LJLIIIL(r4)     // Catch: java.lang.Exception -> L98
            if (r1 != r6) goto L6d
            return r6
        L6a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L98
        L6d:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L98
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L98
            if (r0 != 0) goto L92
            java.lang.Long r0 = r8.LIZ     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L89
            long r3 = r0.longValue()     // Catch: java.lang.Exception -> L98
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L89
            r7.LJIILIIL()     // Catch: java.lang.Exception -> L98
        L84:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L98
            return r0
        L89:
            r7.LJFF = r8     // Catch: java.lang.Exception -> L98
            X.099F r0 = X.C090F.LIZ(r8)     // Catch: java.lang.Exception -> L98
            r7.LJ = r0     // Catch: java.lang.Exception -> L98
            goto L84
        L92:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L98
            return r0
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIILLIIL(X.0Iyp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(boolean r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2191311ApV
            if (r0 == 0) goto L49
            r5 = r8
            X.1ApV r5 = (X.C2191311ApV) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L55
            boolean r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L4f
            r6.LIZIZ = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            r5.LL = r7
            r5.LLILZ = r3
            X.1DFB r2 = X.C0PEM.LIZJ
            X.1Ap6 r1 = new X.1Ap6
            r0 = 0
            r1.<init>(r3, r7, r6, r0)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L24
            return r4
        L49:
            X.1ApV r5 = new X.1ApV
            r5.<init>(r6, r8)
            goto L12
        L4f:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl.LJIIZILJ(boolean, X.05Vn):java.lang.Object");
    }
}
