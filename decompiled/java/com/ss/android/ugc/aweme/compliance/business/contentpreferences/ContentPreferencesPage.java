package com.ss.android.ugc.aweme.compliance.business.contentpreferences;

import X.C01GW;
import X.C098200Yq;
import X.C11G4;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C14EU;
import X.C1685300txQ;
import X.C189200o6;
import X.C1914820zvc;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C484220Iyq;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1914810zvb;
import X.EnumC1915270zwL;
import X.EnumC20537615Xy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.nonpersonalized.NonPersonalizedBannerVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class ContentPreferencesPage extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzHELIOSZiKiA9PCAiPT8hLSMpOyo9KyA/Zww8JjEpJzsDOiAqLD02JiYpOh8yLyA=";
    public C127K LLIZ;
    public TuxNavBar LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public C127K LLJIJIL;
    public C127K LLJILJIL;
    public C127K LLJILJILJ;
    public C127K LLJILLL;
    public C127K LLJJ;
    public C127K LLJJI;
    public C127K LLJJIII;
    public C127K LLJJIJI;
    public C127K LLJJIJIIJIL;
    public ComposeView LLJJIJIL;
    public final EnumC20537615Xy LLJJJ = ComplianceServiceProvider.LJIIJJI().LIZIZ();
    public final AssemVMLazy LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ContentPreferencesPage.class, "nonPersonalizedNoticeVM", "getNonPersonalizedNoticeVM()Lcom/ss/android/ugc/aweme/compliance/business/contentpreferences/nonpersonalized/NonPersonalizedBannerVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C127K SR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.awh) : null;
            this.LLJJI = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hxw) : null;
            this.LLIZ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K VR() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jlz) : null;
            this.LLJJIII = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K WR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nys) : null;
            this.LLJJ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K ZR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q_k) : null;
            this.LLJILJILJ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K aS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q_l) : null;
            this.LLJILLL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K bS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tdj) : null;
            this.LLJILJIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K cS() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w38) : null;
            this.LLJJIJIIJIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final TuxNavBar dS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y08) : null;
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public ContentPreferencesPage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NonPersonalizedBannerVM.class);
        this.LLJJJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 240), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 241), AFwS264S0000000_24.get$arr$(48));
        this.LLJJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS264S0000000_24.get$arr$(47), "enter_from", String.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C11G4 c11g4;
        C11G4 c11g42;
        C11G4 c11g43;
        C11G4 c11g44;
        C11G4 c11g45;
        super.onResume();
        C127K c127kSR = SR();
        C127M accessory = c127kSR != null ? c127kSR.getAccessory() : null;
        C11G4 c11g46 = accessory instanceof C11G4 ? (C11G4) accessory : null;
        if (c11g46 != null) {
            IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
            c11g46.LJIILJJIL((iAlgoRefreshService == null || !iAlgoRefreshService.LJ()) ? "" : getString(2131829500));
        }
        C127K c127kUR = UR();
        C127M accessory2 = c127kUR != null ? c127kUR.getAccessory() : null;
        if ((accessory2 instanceof C11G4) && (c11g45 = (C11G4) accessory2) != null) {
            IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
            c11g45.LJIILJJIL(String.valueOf(iFilterVideoService != null ? Integer.valueOf(iFilterVideoService.LJFF()) : null));
        }
        EnumC20537615Xy enumC20537615Xy = this.LLJJJ;
        if (enumC20537615Xy == EnumC20537615Xy.CHILD) {
            C127K c127kBS = bS();
            C127M accessory3 = c127kBS != null ? c127kBS.getAccessory() : null;
            if ((accessory3 instanceof C11G4) && (c11g44 = (C11G4) accessory3) != null) {
                c11g44.LJIILJJIL(getString(2131846672));
            }
        } else if (enumC20537615Xy == EnumC20537615Xy.UNLINK_LOCKED && ComplianceServiceProvider.LJIIJJI().LJIJJLI()) {
            C127K c127kBS2 = bS();
            C127M accessory4 = c127kBS2 != null ? c127kBS2.getAccessory() : null;
            if ((accessory4 instanceof C11G4) && (c11g42 = (C11G4) accessory4) != null) {
                c11g42.LJIILJJIL(getString(2131830654));
            }
        } else {
            C127K c127kBS3 = bS();
            C127M accessory5 = c127kBS3 != null ? c127kBS3.getAccessory() : null;
            if ((accessory5 instanceof C11G4) && (c11g4 = (C11G4) accessory5) != null) {
                c11g4.LJIILJJIL(ComplianceServiceProvider.LJIL().Ve() == 1 ? getString(2131830654) : getString(2131838251));
            }
        }
        EnumC1915270zwL enumC1915270zwLLJJIJ = ComplianceServiceProvider.LJJI().LJJIJ();
        C127K c127kCS = cS();
        C127M accessory6 = c127kCS != null ? c127kCS.getAccessory() : null;
        if ((accessory6 instanceof C11G4) && (c11g43 = (C11G4) accessory6) != null) {
            c11g43.LJIILJJIL(enumC1915270zwLLJJIJ.isSelfOrSystemOn() ? getString(2131848807) : enumC1915270zwLLJJIJ == EnumC1915270zwL.PARENT_SET_ON ? getString(2131834377) : getString(2131848805));
        }
        C786410Ut5.LLZLL(cS(), (C1914820zvc.LIZ(EnumC1914810zvb.ENABLE_STEM_FEED_ENTRANCE) && (enumC1915270zwLLJJIJ.isOn() || enumC1915270zwLLJJIJ == EnumC1915270zwL.OFF) && ComplianceServiceProvider.LJIL().Ve() == 0) ? 0 : 8);
    }

    @C14EU
    public final void onAlgoRefreshCancelled(C484220Iyq c484220Iyq) {
        String strOptString;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("eventName");
        } else {
            strOptString = null;
        }
        Intrinsics.LJFF(strOptString, "bc_algo_reset_cancelled");
    }

    @C14EU
    public final void onAlgoRefreshed(C484220Iyq c484220Iyq) {
        String strOptString;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("eventName");
        } else {
            strOptString = null;
        }
        Intrinsics.LJFF(strOptString, "bc_algo_reset");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS271S0000000_28.get$arr$(37));
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x04b1  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.contentpreferences.ContentPreferencesPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8_, viewGroup, false);
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
