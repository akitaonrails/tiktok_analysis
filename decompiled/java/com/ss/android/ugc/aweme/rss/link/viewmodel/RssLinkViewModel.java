package com.ss.android.ugc.aweme.rss.link.viewmodel;

import X.C1165270gQf;
import X.C1395020mPE;
import X.C1845670y85;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1845760y8E;
import X.InterfaceC0148002o;
import X.InterfaceC1165170gQV;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;

/* JADX INFO: loaded from: classes28.dex */
public final class RssLinkViewModel extends AssemViewModel<C1845670y85> {
    public final RssLinkParam LL;
    public final InterfaceC1165170gQV LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1845670y85(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.C1166120gS2 r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L12
            java.lang.Integer r2 = r4.LIZIZ
            if (r2 == 0) goto L45
            int r1 = r2.intValue()
            r0 = 11280(0x2c10, float:1.5807E-41)
            if (r1 != r0) goto L24
            X.0y8E r2 = X.EnumC1845760y8E.NOT_MATCH
        L10:
            if (r2 != 0) goto L14
        L12:
            X.0y8E r2 = X.EnumC1845760y8E.CONNECT
        L14:
            r1 = 1
            r0 = 0
            wQ2(r3, r0, r2, r1)
            kotlin.jvm.internal.AwS606S0100000_27 r1 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 177(0xb1, float:2.48E-43)
            r1.<init>(r4, r0)
            r3.setState(r1)
            return
        L24:
            int r1 = r2.intValue()
            r0 = 11281(0x2c11, float:1.5808E-41)
            if (r1 != r0) goto L2f
            X.0y8E r2 = X.EnumC1845760y8E.FETCH
            goto L10
        L2f:
            int r1 = r2.intValue()
            r0 = 11282(0x2c12, float:1.581E-41)
            if (r1 != r0) goto L3a
            X.0y8E r2 = X.EnumC1845760y8E.INVALID_LINK
            goto L10
        L3a:
            int r1 = r2.intValue()
            r0 = 11272(0x2c08, float:1.5795E-41)
            if (r1 != r0) goto L45
            X.0y8E r2 = X.EnumC1845760y8E.SECURITY
            goto L10
        L45:
            X.0y8E r2 = X.EnumC1845760y8E.CONNECT
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel.vQ2(X.0gS2):void");
    }

    public RssLinkViewModel(RssLinkParam rssLinkParam, C1165270gQf c1165270gQf) {
        this.LL = rssLinkParam;
        this.LLILLJJLI = c1165270gQf;
    }

    public static void wQ2(RssLinkViewModel rssLinkViewModel, int i, EnumC1845760y8E enumC1845760y8E, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC1845760y8E = EnumC1845760y8E.NONE;
        }
        rssLinkViewModel.getClass();
        C1395020mPE c1395020mPE = C1395020mPE.LIZ;
        String enterFrom = rssLinkViewModel.LL.getEnterFrom();
        c1395020mPE.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LIZJ(i, "load_status");
        c2344009Gk.LJIIIIZZ("fail_reason", enumC1845760y8E.getReason());
        C20684815ws.LJIILLIIL("rss_link_load_status", c2344009Gk.LIZ);
    }
}
