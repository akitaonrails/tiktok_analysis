package com.ss.android.ugc.aweme.series.vip.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1559070qfp;
import X.C1559260qg8;
import X.C1614790s7h;
import X.C1614800s7i;
import X.C1614890s7r;
import X.C1620980sHg;
import X.C1621000sHi;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesVipSubscriptionFooterAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1559070qfp.class, "vip_subscription_status_hierarchy_key"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C1614790s7h LLJILJIL;

    public SeriesVipSubscriptionFooterAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1111);
        this.LLJ = new C736950SvV(C13LE.LIZ(SeriesVipSubscriptionViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(357), new AwS568S0100000_24((AbstractC738140SxQ) this, 1110), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1108));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1109));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJ.getValue();
        selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0s8C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0s8D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0s8L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0s8J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLJ;
            }
        }, new C2217381BqS() { // from class: X.0s8N
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLJILLL;
            }
        }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, new C1621000sHi(this, 0));
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LLJ.getValue();
        selectSubscribe(assemViewModel2, new C2217381BqS() { // from class: X.0s8B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1614710s7Z) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.0s8H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0s8F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1614710s7Z) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZIZ(assemViewModel2.usedInReusedScene), null, new C1620980sHg(this, 0));
    }

    public static C1614800s7i Ho(C1614800s7i c1614800s7i, boolean z) {
        if (!z) {
            return c1614800s7i;
        }
        int i = C1614890s7r.LIZ[c1614800s7i.LIZ.ordinal()];
        if (i != 1 && i != 2) {
            return c1614800s7i;
        }
        return new C1614800s7i(c1614800s7i.LIZ, c1614800s7i.LIZIZ, c1614800s7i.LIZJ, c1614800s7i.LIZLLL, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(X.C197039127h r8, X.C1614800s7i r9, boolean r10, X.EnumC1614900s7s r11) {
        /*
            r7 = this;
            java.lang.String r3 = r9.LIZIZ
            r2 = 1
            r6 = 0
            if (r3 != 0) goto L31
            java.lang.Integer r0 = r9.LIZJ
            java.lang.String r5 = ""
            if (r0 == 0) goto L30
            int r4 = r0.intValue()
            java.lang.String r3 = r9.LIZLLL
            if (r3 == 0) goto L62
            int r0 = r3.length()
            if (r0 == 0) goto L62
            r0 = 2131848167(0x7f116be7, float:1.9329832E38)
            if (r4 != r0) goto L55
            android.content.Context r1 = r8.getContext()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r3
            r0[r2] = r5
            java.lang.String r3 = r1.getString(r4, r0)
        L2e:
            if (r3 != 0) goto L31
        L30:
            r3 = r5
        L31:
            if (r10 == 0) goto L53
            X.0s7s r0 = r9.LIZ
            if (r11 != r0) goto L53
            r1 = 1
        L38:
            r8.setLoading(r1)
            boolean r0 = r9.LJ
            if (r0 == 0) goto L51
            if (r1 != 0) goto L51
        L41:
            r8.setEnabled(r2)
            r8.setText(r3)
            Y.ACListenerS88S0300000_24 r1 = new Y.ACListenerS88S0300000_24
            r0 = 1
            r1.<init>(r7, r9, r8, r0)
            X.C786410Ut5.U8(r8, r1)
            return
        L51:
            r2 = 0
            goto L41
        L53:
            r1 = 0
            goto L38
        L55:
            android.content.Context r1 = r8.getContext()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r6] = r3
            java.lang.String r3 = r1.getString(r4, r0)
            goto L2e
        L62:
            android.content.Context r0 = r8.getContext()
            java.lang.String r3 = r0.getString(r4)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionFooterAssem.Go(X.127h, X.0s7i, boolean, X.0s7s):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jo(X.C1614790s7h r6, boolean r7, X.EnumC1614900s7s r8, boolean r9) {
        /*
            r5 = this;
            X.0s7i r0 = r6.LJ
            X.0s7i r4 = Ho(r0, r9)
            X.0s7b r1 = r6.LIZ
            X.0s7b r0 = X.EnumC1614730s7b.ACTIVE_SUBSCRIBER
            r2 = 0
            if (r1 != r0) goto L6f
            X.0s7i r3 = r6.LJ
            X.0s7s r1 = r3.LIZ
            X.0s7s r0 = X.EnumC1614900s7s.CHANGE_PLAN
            if (r1 != r0) goto L6f
            boolean r0 = r3.LJ
            if (r0 != 0) goto L6f
            r3 = 0
        L1a:
            X.01GW r0 = r5.LLJI
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r3 == 0) goto L6c
            r0 = 0
        L25:
            X.C786410Ut5.LJLLLLLL(r0, r1)
            X.01GW r0 = r5.LLJIJIL
            java.lang.Object r1 = r0.getValue()
            X.127h r1 = (X.C197039127h) r1
            if (r3 == 0) goto L6a
            r0 = -1
        L33:
            r1.setButtonVariant(r0)
            if (r3 == 0) goto L43
            X.01GW r0 = r5.LLJI
            java.lang.Object r0 = r0.getValue()
            X.127h r0 = (X.C197039127h) r0
            r5.Go(r0, r4, r7, r8)
        L43:
            X.0s7i r0 = r6.LJFF
            if (r0 == 0) goto L68
            X.0s7i r1 = Ho(r0, r9)
        L4b:
            X.01GW r0 = r5.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r1 != 0) goto L57
            r2 = 8
        L57:
            X.C786410Ut5.LJLLLLLL(r2, r0)
            if (r1 == 0) goto L67
            X.01GW r0 = r5.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            X.127h r0 = (X.C197039127h) r0
            r5.Go(r0, r1, r7, r8)
        L67:
            return
        L68:
            r1 = 0
            goto L4b
        L6a:
            r0 = 1
            goto L33
        L6c:
            r0 = 8
            goto L25
        L6f:
            r3 = 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionFooterAssem.Jo(X.0s7h, boolean, X.0s7s, boolean):void");
    }
}
