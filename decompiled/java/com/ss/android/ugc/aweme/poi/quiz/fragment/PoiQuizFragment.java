package com.ss.android.ugc.aweme.poi.quiz.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C1175270ggn;
import X.C1178440glu;
import X.C1208620hYa;
import X.C13LE;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1182690gsl;
import X.EnumC1182750gsr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiQuizFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEiHELIOSPSw2ZykhKSIhLCEnZhUjIB4mIT8KOy40JSAiPQ==";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(436), "enter_from", String.class);
    public C1175270ggn LLIZLLLIL;
    public ConstraintLayout LLJ;
    public ViewGroup LLJI;
    public final AssemVMLazy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizFragment.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiQuizFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1687);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(555);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1688), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 1689), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1690), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
    }

    public final PoiQuizPageVM SR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onCreate(bundle);
        if (bundle != null) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        NR(AFwS256S0000000_18.get$arr$(553));
        activityConfiguration(AFwS256S0000000_18.get$arr$(554));
        C19EG activity2 = getActivity();
        if (activity2 != null && (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(this, new C1208620hYa(this, 3));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        super.onViewCreated(view, bundle);
        SR().LLJI = new C1178440glu(getContext());
        PoiQuizPageVM poiQuizPageVMSR = SR();
        poiQuizPageVMSR.LLILZLL.LIZIZ(EnumC1182690gsl.HOME_PAGE);
        poiQuizPageVMSR.LLILZLL.LIZ(EnumC1182750gsr.LIST_LOADING, null);
        poiQuizPageVMSR.xQ2();
        SR().LL = (String) this.LLIZ.getValue();
        PoiQuizPageVM poiQuizPageVMSR2 = SR();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ, null);
        } else {
            interfaceC665370Q7zLJI = null;
        }
        poiQuizPageVMSR2.LLIZ = interfaceC665370Q7zLJI;
        this.LLIZLLLIL = (C1175270ggn) view.findViewById(R.id.r9e);
        this.LLJ = (ConstraintLayout) view.findViewById(R.id.r9a);
        this.LLJI = (ViewGroup) view.findViewById(R.id.r98);
        C1175270ggn c1175270ggn = this.LLIZLLLIL;
        if (c1175270ggn != null) {
            c1175270ggn.setRemoveBottomInsets(true);
        }
        C1175270ggn c1175270ggn2 = this.LLIZLLLIL;
        if (c1175270ggn2 != null) {
            c1175270ggn2.setRemoveTopInsets(false);
        }
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 881), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e6d, viewGroup, false);
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
