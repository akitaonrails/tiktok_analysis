package com.ss.android.ugc.aweme.ecommerce.base.review.lynx;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C13LE;
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
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ReviewFragmentLynx extends ECBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZz02PiwpPmE/MSs0Zx02PiwpPgkhKSIhLCEnBDwiMQ==";
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 307));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 308));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 305));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 304));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 303));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 301));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 302));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 306));
    public final AssemVMLazy LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReviewFragmentLynx.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/review/lynx/ReviewAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReviewFragmentLynx() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReviewAssemVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 309);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(79);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 310), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 311), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 312), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
    }

    public final ReviewAssemVM VR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (ReviewAssemVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VR().LL = (String) this.LLIZLLLIL.getValue();
        VR().LLILLJJLI = (String) this.LLJ.getValue();
        ReviewAssemVM reviewAssemVMVR = VR();
        String str = (String) this.LLILLL.getValue();
        reviewAssemVMVR.LLILZLL = str;
        reviewAssemVMVR.setState(new AwS76S1000000_26(str, 49));
        VR().LLIZ = (String) this.LLILZ.getValue();
        VR().LLILLL = (Integer) this.LLILZIL.getValue();
        VR().LLILZ = (String) this.LLILZLL.getValue();
        VR().LLILZIL = (String) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 48), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.av0, viewGroup, false);
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
