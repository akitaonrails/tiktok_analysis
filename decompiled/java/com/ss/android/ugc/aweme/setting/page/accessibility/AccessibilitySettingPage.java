package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.C098200Yq;
import X.C0TVI;
import X.C14K9;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC836760Ws6
public final class AccessibilitySettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOS40LWstHELIOSKiw2OzYlKyY/ITE1Zw4wKyA/OiYxISklPTYALTE4ICE0GCQrLA==";
    public long LLJ;
    public long LLJI;
    public final String LLJIJIL = "ATTACHED";

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void SR() {
        super.SR();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LLJ = jElapsedRealtime;
        this.LLJI = jElapsedRealtime - 0;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_method", "click_setting");
        c2344009Gk.LJIIIIZZ("exit_to", "setting");
        c2344009Gk.LIZLLL(0L, "enter_timestamp");
        c2344009Gk.LIZLLL(this.LLJ, "exit_timestamp");
        c2344009Gk.LIZLLL(this.LLJI, "time_spent_on_page");
        C20684815ws.LJIILLIIL("exit_a11y_settings", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZR(android.content.Context r21, X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.accessibility.AccessibilitySettingPage.ZR(android.content.Context, X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        final ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C14K9.LJIJJ(composeView, new C0TVI() { // from class: X.0ttf
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                if (!Intrinsics.LJFF(composeView.getTag(), this.LLJIJIL)) {
                    composeView.setTag(this.LLJIJIL);
                    C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-673271221, new AwS639S0100000_25(this, 38), true));
                }
                return q0.LJIIL(view, c20246014Ju);
            }
        });
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
