package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1243970iTb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes20.dex */
public final class PaPromptAccountFlowFragment extends BaseAccountFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319HELIOSPSxiLz0yLygpJzsgZhUtGT08JTU4CCwwJzAiPQk/JzIKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "PaPromptAccountFlowFragment";
    }

    @Override // X.C0XYD
    public final void dk(int i) {
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return ((InterfaceC1243970iTb) getChildFragmentManager().LJJJJZ(R.id.tqy)).onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        InterfaceC1243970iTb interfaceC1243970iTb;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("private_account_prompt");
        } else {
            i = 1;
        }
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("pa_prompt_process");
        Fragment fragment = fragmentLJJJJZI;
        if (fragmentLJJJJZI == null) {
            IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
            if (iPrivacySettingAPIService != null) {
                PaPromptProcessFragment paPromptProcessFragmentLJIIIZ = iPrivacySettingAPIService.LJIIIZ(i);
                fragment = paPromptProcessFragmentLJIIIZ;
                if (paPromptProcessFragmentLJIIIZ == null) {
                    return;
                }
            } else {
                return;
            }
        }
        if (fragment.isAdded()) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJJIFFI(fragment);
            c19ehLJIIJ.LJIIJ();
        } else {
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ2.LIZJ(R.id.tqy, fragment, "pa_prompt_process");
            c19ehLJIIJ2.LJIIJ();
        }
        if ((fragment instanceof InterfaceC1243970iTb) && (interfaceC1243970iTb = (InterfaceC1243970iTb) fragment) != null) {
            interfaceC1243970iTb.ke(new AwS557S0100000_13(this, 79));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.y9, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
