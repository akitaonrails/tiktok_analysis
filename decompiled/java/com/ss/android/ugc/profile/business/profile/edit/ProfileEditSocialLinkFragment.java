package com.ss.android.ugc.profile.business.profile.edit;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C723850SaN;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditSocialLinkFragment extends ProfileEditInputFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjHELIOSLyY/LWspLSYnZhU+Jik6JCAJLSYnGyovIC4/BCwiIgkhKSIhLCEn";
    public IProfileEditLinkAbility LLILZLL;
    public Function1<? super IProfileEditLinkAbility, Unit> LLIZ;

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() {
        Function1<? super IProfileEditLinkAbility, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(this.LLILZLL);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        gS();
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileDetailEditFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, view, 71), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (getActivity() != null && viewGroup != null) {
            viewTd = C20673215v0.LIZLLL(R.layout.ecf, getActivity(), viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ecf, viewGroup, false);
        }
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
