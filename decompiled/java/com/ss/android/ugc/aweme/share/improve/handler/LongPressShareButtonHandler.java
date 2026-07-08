package com.ss.android.ugc.aweme.share.improve.handler;

import X.C1371740lng;
import X.C1373440lqQ;
import X.C1374720lsU;
import X.C13LE;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class LongPressShareButtonHandler extends TTShareDefaultHandler<AwemeSharePackage> {
    public final C1371740lng LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC1371340ln2 LJFF() {
        return new InterfaceC1371340ln2() { // from class: X.0lmw
            @Override // X.InterfaceC1371340ln2
            public final void LIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
                C1369870lkf.LJIIJ(baseSharePackage, interfaceC1369790lkX, -1, false);
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                this.LIZ.LLILLJJLI.LJIILLIIL(interfaceC1369790lkX, true, baseSharePackage, context);
                C1369870lkf.LJIIIZ(false, baseSharePackage, -1);
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, C1374170lrb c1374170lrb) {
                C1369870lkf.LJIIIZ(false, baseSharePackage, -1);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LJ(InterfaceC1369790lkX interfaceC1369790lkX) {
        return Intrinsics.LJFF(interfaceC1369790lkX.key(), "email");
    }

    public LongPressShareButtonHandler(C1371740lng c1371740lng, Context context) {
        super(context);
        this.LLILLJJLI = c1371740lng;
        C13LE.LIZ(AwemeSharePackage.class);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = baseSharePackage.itemType;
        c1373440lqQ.getClass();
        return C1373440lqQ.LIZIZ(interfaceC1369790lkX, str, 0);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJI(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = baseSharePackage.itemType;
        String str2 = baseSharePackage.description;
        c1373440lqQ.getClass();
        return C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final String LJII(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
            return C1374720lsU.LIZIZ().getString(2131845764);
        }
        return baseSharePackage.title;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1369790lkX r6, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1371300lmy
            if (r0 == 0) goto L45
            r4 = r8
            X.0lmy r4 = (X.C1371300lmy) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L4b
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r1 = r7.extras
            java.lang.String r0 = "share_url"
            X.C786410Ut5.LJJJI(r0, r3, r1)
            android.os.Bundle r2 = r7.extras
            java.lang.String r1 = "share_form"
            java.lang.String r0 = "url_form"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            return r3
        L37:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r7
            r4.LLILZ = r0
            java.lang.Object r3 = super.LJIIIZ(r6, r7, r4)
            if (r3 != r2) goto L24
            return r2
        L45:
            X.0lmy r4 = new X.0lmy
            r4.<init>(r5, r8)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler.LJIIIZ(X.0lkX, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(android.content.Context r12, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r13, X.InterfaceC1369790lkX r14, android.view.View r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            r11 = this;
            r3 = r16
            r7 = r13
            r6 = r12
            r8 = r14
            r9 = r15
            boolean r0 = r3 instanceof X.C1371290lmx
            r5 = r11
            if (r0 == 0) goto L64
            r10 = r3
            X.0lmx r10 = (X.C1371290lmx) r10
            int r2 = r10.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r10.LLIZ = r2
        L19:
            java.lang.Object r4 = r10.LLILZIL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLIZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L43
            if (r0 != r2) goto L6a
            X.C155000ia.LIZIZ(r4)
        L2c:
            return r4
        L2d:
            X.C155000ia.LIZIZ(r4)
            X.0lng r0 = r5.LLILLJJLI
            r10.LL = r6
            r10.LLILLJJLI = r7
            r10.LLILLL = r8
            r10.LLILZ = r9
            r10.LLIZ = r1
            java.lang.Object r0 = r0.LIZLLL(r6, r7, r8, r10)
            if (r0 != r3) goto L52
            return r3
        L43:
            java.lang.Object r9 = r10.LLILZ
            android.view.View r9 = (android.view.View) r9
            X.0lkX r8 = r10.LLILLL
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7 = r10.LLILLJJLI
            java.lang.Object r6 = r10.LL
            android.content.Context r6 = (android.content.Context) r6
            X.C155000ia.LIZIZ(r4)
        L52:
            r0 = 0
            r10.LL = r0
            r10.LLILLJJLI = r0
            r10.LLILLL = r0
            r10.LLILZ = r0
            r10.LLIZ = r2
            java.lang.Object r4 = super.LJIILIIL(r6, r7, r8, r9, r10)
            if (r4 != r3) goto L2c
            return r3
        L64:
            X.0lmx r10 = new X.0lmx
            r10.<init>(r5, r3)
            goto L19
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, X.0lkX, android.view.View, X.05Vn):java.lang.Object");
    }
}
