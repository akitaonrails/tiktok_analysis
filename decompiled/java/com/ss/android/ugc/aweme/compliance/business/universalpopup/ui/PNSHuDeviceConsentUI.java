package com.ss.android.ugc.aweme.compliance.business.universalpopup.ui;

import X.C197039127h;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSHuDeviceConsentUI extends UniversalPopupUI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2HELIOSOzZiPCE6PiA+Oi4/OCo8PD99PSxiGQEAADAILDk6KyAPJiEgLSs4HAY=";
    public C197039127h LLIZ;
    public C197039127h LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final int MR() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
    }

    public final void ZR(String str, String str2) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview?url=");
            sbLIZ.append(URLEncoder.encode(str, "UTF-8"));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("title", str2);
            smartRouteBuildRoute.withParam("skip_consent", true);
            smartRouteBuildRoute.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r46, android.os.Bundle r47) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSHuDeviceConsentUI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        View view = getView();
        if (view == null) {
            return;
        }
        this.LLIZ = (C197039127h) view.findViewById(R.id.z9);
        this.LLIZLLLIL = (C197039127h) view.findViewById(R.id.fhe);
        C197039127h c197039127h = this.LLIZ;
        C197039127h c197039127h2 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS152S0100000_17(awS596S0100000_17, 94));
        C197039127h c197039127h3 = this.LLIZLLLIL;
        if (c197039127h3 != null) {
            c197039127h2 = c197039127h3;
        }
        C786410Ut5.U8(c197039127h2, new ACListenerS152S0100000_17(awS596S0100000_17, 95));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r2 = 0
            if (r0 == 0) goto L35
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L35
        Le:
            if (r0 == 0) goto L2a
            android.content.Context r1 = r5.getContext()
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r1.setTheme(r0)
        L1a:
            r0 = 2131561020(0x7f0d0a3c, float:1.8747429E38)
            android.view.View r3 = X.C786410Ut5.Td(r5, r0, r6, r2)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L27
            r3 = r2
        L27:
            if (r3 == 0) goto L55
            goto L37
        L2a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131886939(0x7f12035b, float:1.940847E38)
            r1.setTheme(r0)
            goto L1a
        L35:
            r0 = 0
            goto Le
        L37:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L5b
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L5b
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L52
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L5b
        L52:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5b
            return r3
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSHuDeviceConsentUI.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
