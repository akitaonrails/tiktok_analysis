package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.C01GW;
import X.C098200Yq;
import X.C0D5L;
import X.C0XGX;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1687890u1b;
import X.C189200o6;
import X.C19252910Tv;
import X.C19286010ck;
import X.C19309810ga;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC19303410fY;
import X.InterfaceC19312510h1;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LoginDialogFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0HELIOSIStiKDonIGs5IGE/JyIlJ2EfJyIlJws6KSkjLgkhKSIhLCEn";
    public ViewPagerLoginView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 93));

    public final SignupViewModel MR() {
        return (SignupViewModel) this.LLILLJJLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IPNSChangeRegionService iPNSChangeRegionService;
        super.onDestroyView();
        AccountGSMAExperiment.LIZ.getClass();
        if (AccountGSMAExperiment.LIZIZ() || AccountGSMAPhase2Experiment.LIZJ()) {
            GSMAService.INSTANCE.cancelJob();
        }
        ViewPagerLoginView viewPagerLoginView = this.LL;
        if (viewPagerLoginView != null) {
            C19309810ga c19309810ga = viewPagerLoginView.LJIIL;
            if (c19309810ga != null && (iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null)) != null) {
                iPNSChangeRegionService.LJII(c19309810ga);
            }
            viewPagerLoginView.LJIIJJI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numLIZJ;
        List<? extends C1687890u1b> list;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Integer numLIZJ2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        boolean z = arguments.getBoolean("is_signup_view");
        InterfaceC19312510h1 interfaceC19312510h1 = C0D5L.LIZ(requireActivity()).LLILLL;
        if (interfaceC19312510h1 == null) {
            return;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        boolean zLIZIZ = c19252910Tv.LIZLLL().LJIJ().LIZIZ();
        Bundle arguments2 = getArguments();
        if (arguments2 != null && zLIZIZ) {
            C786410Ut5.LJJJI("login_panel_type", "login_show_qr", arguments2);
        }
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.gl);
        int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.ht);
        int dimensionPixelSize3 = view.getContext().getResources().getDimensionPixelSize(R.dimen.hs);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.vbd);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.do6);
        View viewFindViewById = view.findViewById(R.id.doe);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zax);
        if (MR().PQ2()) {
            C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 21);
        }
        InterfaceC19303410fY interfaceC19303410fYLJIJ = c19252910Tv.LIZLLL().LJIJ();
        if (C0XGX.LIZ()) {
            supportFragmentManager = getChildFragmentManager();
        } else {
            supportFragmentManager = requireActivity().getSupportFragmentManager();
        }
        interfaceC19303410fYLJIJ.LIZJ(constraintLayout, constraintLayout2, tuxTextView, supportFragmentManager, getActivity(), z, MR().zQ2());
        if (arguments.getBoolean("is_signup_view") || !zLIZIZ) {
            c19252910Tv.LIZLLL().LIZIZ().LIZLLL(viewFindViewById);
        }
        if (MR().xQ2()) {
            if (!(constraintLayout2.getLayoutParams() instanceof C19ME)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) constraintLayout2.getLayoutParams();
            marginLayoutParams3.height = -2;
            C786410Ut5.m6(constraintLayout2, marginLayoutParams3);
        } else if (C19286010ck.LIZLLL()) {
            ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(dimensionPixelSize);
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                C786410Ut5.m6(constraintLayout2, marginLayoutParams);
            }
        }
        if (!MR().OQ2()) {
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, context)) != null) {
                tuxTextView.setBackgroundColor(numLIZJ2.intValue());
            }
        } else {
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context2)) != null) {
                tuxTextView.setBackgroundColor(numLIZJ.intValue());
            }
        }
        if (C19286010ck.LIZLLL()) {
            if (!MR().xQ2()) {
                C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(dimensionPixelSize2), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), 16);
            } else {
                C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(dimensionPixelSize2), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(dimensionPixelSize3), 16);
            }
            tuxTextView.setTuxFont(81);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.setMarginStart(dimensionPixelSize);
                marginLayoutParams2.setMarginEnd(dimensionPixelSize);
                C786410Ut5.R6(tuxTextView, marginLayoutParams2);
            }
        }
        BaseActivity baseActivity = (BaseActivity) getActivity();
        SignupViewModel signupViewModelMR = MR();
        if (z) {
            list = signupViewModelMR.LLIZ;
        } else {
            list = signupViewModelMR.LLILZLL;
        }
        this.LL = new ViewPagerLoginView(interfaceC19312510h1, baseActivity, view, z, list);
        if (!z) {
            MR().LLJ.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 12));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ym, viewGroup, false);
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
