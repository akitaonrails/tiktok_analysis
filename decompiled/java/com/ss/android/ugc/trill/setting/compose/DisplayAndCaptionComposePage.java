package com.ss.android.ugc.trill.setting.compose;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0BJD;
import X.C0PEM;
import X.C0XQ7;
import X.C1246690iXz;
import X.C13LE;
import X.C1685300txQ;
import X.C1839820xye;
import X.C189200o6;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1E8U;
import X.C2217381BqS;
import X.C23250099c;
import X.C294280BgA;
import X.C300940Bqu;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C901130ZWt;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS42S0010000_30;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC836760Ws6
public final class DisplayAndCaptionComposePage extends BasePage {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpPTs6JiJiKiHELIOSA+OCo/LGEXITY8JS4qCSsoCi4jPCwjJww8JTUjOioDKSIp";
    public final AssemVMLazy LLJ;
    public String LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DisplayAndCaptionComposePage.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/trill/setting/compose/DisplayAndCaptionVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return 0;
    }

    public final DisplayAndCaptionVM aS() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (DisplayAndCaptionVM) assemVMLazy.getValue();
    }

    public DisplayAndCaptionComposePage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DisplayAndCaptionVM.class);
        this.LLJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 2681), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2682), AFwS274S0000000_30.get$arr$(234));
        this.LLJI = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZR(X.InterfaceC1680500tpg r9, int r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionComposePage.ZR(X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Intent intent;
        String stringExtra;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("enter_method");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.LLJI = stringExtra;
        }
        DisplayAndCaptionVM displayAndCaptionVMAS = aS();
        Context contextRequireContext = requireContext();
        if (!C0BJD.LIZ() && !C300940Bqu.LIZ()) {
            displayAndCaptionVMAS.setState(AFwS274S0000000_30.get$arr$(262));
            if (C1839820xye.LIZ().LJIIIIZZ().getDoNotTranslateList() != null) {
                if (C294280BgA.LIZ()) {
                    displayAndCaptionVMAS.setState(new AwS396S0200000_30(contextRequireContext, displayAndCaptionVMAS, 36));
                } else {
                    displayAndCaptionVMAS.setState(new AwS396S0200000_30(contextRequireContext, displayAndCaptionVMAS, 37));
                }
            }
        }
        DisplayAndCaptionVM displayAndCaptionVMAS2 = aS();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(displayAndCaptionVMAS2), C0PEM.LIZJ, null, new C1246690iXz(displayAndCaptionVMAS2, requireContext(), this.LLJI, null), 2);
        DisplayAndCaptionVM displayAndCaptionVMAS3 = aS();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        if (C1E8U.LIZ() && C901130ZWt.LIZIZ.LJIIIZ()) {
            z = true;
        } else {
            z = false;
        }
        displayAndCaptionVMAS3.setState(new AwS42S0010000_30(zIsLogin, 3));
        displayAndCaptionVMAS3.setState(new AwS42S0010000_30(z, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            super.onActivityResult(r13, r14, r15)
            r0 = -1
            if (r14 != r0) goto L28
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r13 != r0) goto L5e
            if (r15 == 0) goto L67
            java.lang.String r0 = "updated_language_name"
            java.lang.String r3 = r15.getStringExtra(r0)     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L67
            int r0 = r3.length()
            if (r0 == 0) goto L67
            com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM r2 = r12.aS()
            kotlin.jvm.internal.AwS80S1000000_30 r1 = new kotlin.jvm.internal.AwS80S1000000_30
            r0 = 6
            r1.<init>(r3, r0)
            r2.setState(r1)
            return
        L28:
            if (r14 == r0) goto L5e
            if (r14 != r0) goto L67
        L2c:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r13 == r0) goto L34
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r13 != r0) goto L67
        L34:
            X.15zt r0 = X.C20703515zt.LIZ
            r0.getClass()
            java.util.List r4 = X.C20703515zt.LJ()
            com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM r3 = r12.aS()
            if (r4 == 0) goto L52
            java.lang.String r5 = ", "
            r6 = 0
            r8 = 0
            r11 = 62
            r7 = r6
            r9 = r6
            r10 = r6
            java.lang.String r2 = X.C13LP.LJJLIIIJ(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 != 0) goto L54
        L52:
            java.lang.String r2 = ""
        L54:
            kotlin.jvm.internal.AwS80S1000000_30 r1 = new kotlin.jvm.internal.AwS80S1000000_30
            r0 = 5
            r1.<init>(r2, r0)
            r3.setState(r1)
            return
        L5e:
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r13 != r0) goto L2c
            return
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionComposePage.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setContent(new C19719212De(-2068282622, new AwS455S0200000_19(composeView, this, 31), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
