package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C1176204iu;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19313410hA;
import X.C19EG;
import X.C19GS;
import X.C1BV2;
import X.C1BV9;
import X.C23250099c;
import X.C452501pT;
import X.C754140Ti8;
import X.C754150Ti9;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC19312510h1;
import Y.ARunnableS61S0300000_28;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.services.AlternativeNetworkService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes29.dex */
public final class LoginSignupTabFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiKDonIGs5IGE/JyIlJ2EfJyIlJxw6Lys5ORsyKgM+KCg+LSs4";
    public C1BV2 LLILLJJLI;
    public boolean LLILZ;
    public long LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 96));
    public final long LLILLL = 2000;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 94));

    public final SignupViewModel MR() {
        return (SignupViewModel) this.LLILZLL.getValue();
    }

    public final InterfaceC19312510h1 NR() {
        return (InterfaceC19312510h1) this.LL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MR().LLILLL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19EG c19egRequireActivity = requireActivity();
        MR().VQ2();
        MR().LLILLL = NR();
        this.LLILLJJLI = new C1BV2((BaseActivity) c19egRequireActivity, this, new C1BV9(MR().getEnterFrom(), MR().getEnterMethod(), MR().yQ2(), MR().BQ2(), (String) MR().LLJJIJI.getValue(), null), new AwS572S0100000_28(this, 95));
        AccountGSMAExperiment.LIZ.getClass();
        if (AccountGSMAExperiment.LIZIZ() || AccountGSMAPhase2Experiment.LIZJ()) {
            AlternativeNetworkService.INSTANCE.manuallyActivateCell(C786410Ut5.P3(requireActivity()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        MR().LLLJL = new C19313410hA((TuxTextView) view.findViewById(R.id.y08), view.findViewById(R.id.fz3), (TuxIconView) view.findViewById(R.id.yb6), (TuxIconView) view.findViewById(R.id.ycn), (TuxTextView) view.findViewById(R.id.vg2));
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.vb_);
        C1176204iu content = NR().getContent();
        if ((content instanceof C1176204iu) && content != null && (view2 = content.LIZ) != null) {
            ViewParent parent = view2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view2, viewGroup);
            }
            viewGroup2.addView(view2);
        }
        HandlerHook.viewPost(view, new ARunnableS61S0300000_28(view, this, bundle, 0));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C754150Ti9(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            if (intent.getIntExtra("error_code", -1) == 1097) {
                C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
                c1397580mTM.LJFF(2131825241);
                c1397580mTM.LIZ(2131825240);
                C985403tE.LIZ(c1397580mTM, new AwS591S0100000_12(this, 592));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C754140Ti8(this, extras, i2, null), 2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.zl, viewGroup, false);
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
