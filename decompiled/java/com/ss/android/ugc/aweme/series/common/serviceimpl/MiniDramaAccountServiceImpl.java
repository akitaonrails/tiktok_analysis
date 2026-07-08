package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C0XQ7;
import X.C1620880sHW;
import X.C848230XPh;
import X.InterfaceC1573880r3i;
import X.InterfaceC586170Myt;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaAccountServiceImpl implements MiniDramaAccountService {
    public final ConcurrentHashMap<InterfaceC1573880r3i, InterfaceC586170Myt> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.service.MiniDramaAccountService
    public final boolean LIZJ() {
        return C848230XPh.LL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaAccountService
    public final String getCurUserId() {
        return C0XQ7.LJFF().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaAccountService
    public final void LIZ(InterfaceC1573880r3i interfaceC1573880r3i) {
        C1620880sHW c1620880sHW = new C1620880sHW(interfaceC1573880r3i, 1);
        this.LIZIZ.put(interfaceC1573880r3i, c1620880sHW);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(c1620880sHW);
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaAccountService
    public final void LIZIZ(InterfaceC1573880r3i interfaceC1573880r3i) {
        InterfaceC586170Myt interfaceC586170MytRemove = this.LIZIZ.remove(interfaceC1573880r3i);
        if (interfaceC586170MytRemove != null) {
            C0XQ7.LJ();
            C0XQ7.LIZ.LJI(interfaceC586170MytRemove);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    @Override // com.ss.android.ugc.aweme.service.MiniDramaAccountService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r5, java.lang.String r6, java.lang.String r7, final kotlin.jvm.functions.Function0 r8, final kotlin.jvm.functions.Function0 r9, final kotlin.jvm.functions.Function0 r10) {
        /*
            r4 = this;
        L0:
            boolean r0 = r5 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L60
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto L59
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L60
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r1 = 0
            if (r7 == 0) goto L36
            int r0 = r7.length()
            if (r0 == 0) goto L21
            java.lang.String r0 = "force_insert_id"
            X.C786410Ut5.LJJJI(r0, r7, r3)
            if (r7 == 0) goto L36
        L21:
            int r0 = r7.length()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.series.feed.ISeriesFeedService r0 = X.C0RRR.LIZIZ()
            if (r0 == 0) goto L36
            X.0r9a r0 = r0.LIZIZ()
            if (r0 == 0) goto L36
            r0.LJIIJ(r7, r1)
        L36:
            com.ss.android.ugc.aweme.ILoginService r2 = X.C0XQ7.LIZJ()
            X.0XQS r1 = new X.0XQS
            r1.<init>()
            r1.LIZ = r5
            java.lang.String r0 = "drama_tab_guest_view"
            r1.LIZIZ = r0
            r1.LIZJ = r6
            r1.LIZLLL = r3
            X.0s2x r0 = new X.0s2x
            r0.<init>()
            r1.LJ = r0
            X.0XQT r0 = new X.0XQT
            r0.<init>(r1)
            r2.showLoginAndRegisterView(r0)
            return
        L59:
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            android.content.Context r5 = r5.getBaseContext()
            goto L0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaAccountServiceImpl.LIZLLL(android.content.Context, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }
}
