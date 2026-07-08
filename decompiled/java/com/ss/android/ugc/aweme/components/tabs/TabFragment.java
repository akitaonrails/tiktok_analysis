package com.ss.android.ugc.aweme.components.tabs;

import X.C01GW;
import X.C13LE;
import X.C336720DHy;
import X.C452501pT;
import X.EnumC452301pR;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import com.ss.android.ugc.aweme.layout.VerticalComponentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TabFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjHELIOSJD88JiAiPTx9PCQuOmEHKScKOy40JSAiPQ==";
    public final ViewModelLazy LL;

    public TabFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS553S0100000_9(new AwS553S0100000_9((Fragment) this, 81), (Function0<Unit>) 82));
        this.LL = C336720DHy.LIZ(this, C13LE.LIZ(VerticalComponentViewModel.class), new AwS553S0100000_9(c01gwLIZ, 83), new AwS410S0200000_9((Function0) null, c01gwLIZ, 13), new AwS410S0200000_9(this, c01gwLIZ, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 33
            java.lang.String r2 = "tab_child_params"
            if (r1 < r0) goto L3f
            android.os.Bundle r1 = r7.getArguments()
            if (r1 == 0) goto L52
            java.lang.Class<com.ss.android.ugc.aweme.components.tabs.TabChildParams> r0 = com.ss.android.ugc.aweme.components.tabs.TabChildParams.class
            java.io.Serializable r2 = r1.getSerializable(r2, r0)
            com.ss.android.ugc.aweme.components.tabs.TabChildParams r2 = (com.ss.android.ugc.aweme.components.tabs.TabChildParams) r2
        L17:
            r1 = 2131564423(0x7f0d1787, float:1.875433E38)
            r0 = 0
            android.view.View r5 = X.C786410Ut5.Td(r8, r1, r9, r0)
            r0 = 2131368365(0x7f0a19ad, float:1.8356678E38)
            android.view.View r6 = r5.findViewById(r0)
            androidx.compose.ui.platform.ComposeView r6 = (androidx.compose.ui.platform.ComposeView) r6
            if (r2 == 0) goto L54
            kotlin.jvm.internal.AwS445S0200000_9 r3 = new kotlin.jvm.internal.AwS445S0200000_9
            r0 = 1
            r3.<init>(r7, r2, r0)
            X.12De r2 = new X.12De
            r1 = 1479056997(0x58289e65, float:7.41593E14)
            r0 = 1
            r2.<init>(r1, r3, r0)
            X.0nG7 r0 = X.EnumC1427810nG7.Auto
            X.C1669670tYD.LJ(r6, r0, r2)
            goto L54
        L3f:
            android.os.Bundle r0 = r7.getArguments()
            if (r0 == 0) goto L50
            java.io.Serializable r2 = r0.getSerializable(r2)
        L49:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.components.tabs.TabChildParams
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.components.tabs.TabChildParams r2 = (com.ss.android.ugc.aweme.components.tabs.TabChildParams) r2
            goto L17
        L50:
            r2 = r4
            goto L49
        L52:
            r2 = r4
            goto L17
        L54:
            androidx.lifecycle.LifecycleOwner r0 = r7.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L78
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r5, r0)     // Catch: java.lang.Throwable -> L78
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r5, r7)     // Catch: java.lang.Throwable -> L78
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r5.setTag(r0, r7)     // Catch: java.lang.Throwable -> L78
            X.19EG r1 = r7.getActivity()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6f
            r4 = r1
            X.19GS r4 = (X.C19GS) r4     // Catch: java.lang.Throwable -> L78
        L6f:
            X.C1685300txQ.LIZ(r4)     // Catch: java.lang.Throwable -> L78
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L78
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L78
            return r5
        L78:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.components.tabs.TabFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
