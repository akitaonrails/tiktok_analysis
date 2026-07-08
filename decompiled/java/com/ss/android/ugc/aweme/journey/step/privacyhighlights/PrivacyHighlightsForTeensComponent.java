package com.ss.android.ugc.aweme.journey.step.privacyhighlights;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1848530yCh;
import X.C1869040yjm;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C446960Hfq;
import X.C786410Ut5;
import X.InterfaceC446950Hfp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.tiktok.privacy.api.phl.vm.PhlViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivacyHighlightsForTeensComponent extends NUJComponentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGs8OyYlKSY1HELIOSISY0ICklLicnO2scOyYlKSY1ASY0ICklLicnOwMjOxs2LSs/CiA+OCoiLCEn";
    public Fragment LLJI;
    public PhlViewModel LLJIJIL;

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C446960Hfq c446960Hfq;
        final PrivacyHighlightsForTeens privacyHighlightsForTeens;
        super.onCreate(bundle);
        C1869040yjm c1869040yjmPR = PR();
        if ((c1869040yjmPR instanceof C446960Hfq) && (c446960Hfq = (C446960Hfq) c1869040yjmPR) != null && (privacyHighlightsForTeens = c446960Hfq.LIZIZ) != null) {
            this.LLJIJIL = (PhlViewModel) ViewModelProviders.of(requireActivity(), new ViewModelProvider.Factory(privacyHighlightsForTeens) { // from class: X.0Hf8
                public final PrivacyHighlightsForTeens LIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                {
                    this.LIZ = privacyHighlightsForTeens;
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    final PrivacyHighlightsForTeens privacyHighlightsForTeens2 = this.LIZ;
                    return new PhlViewModel(new InterfaceC438730HIh(privacyHighlightsForTeens2) { // from class: X.0Hf9
                        public final PrivacyHighlightsForTeens LIZ;

                        @Override // X.InterfaceC438730HIh
                        public final C11NZ<PrivacyHighlightsForTeens> LIZ() {
                            return C11NZ.LJJJJZ(this.LIZ);
                        }

                        {
                            this.LIZ = privacyHighlightsForTeens2;
                        }
                    });
                }
            }).get(PhlViewModel.class);
        } else {
            NR(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Fragment fragmentLIZJ = 0;
        C1848530yCh.LIZLLL(this, "page_nuj_privacy_for_teens", null);
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI("phl_fragment");
        this.LLJI = fragmentLJJJJZI;
        if (fragmentLJJJJZI == null) {
            IPrivacyHighlightService iPrivacyHighlightService = (IPrivacyHighlightService) PluggableExtentionKt.pluggableSpi$default(IPrivacyHighlightService.class, false, false, false, 14, null);
            if (iPrivacyHighlightService != null) {
                fragmentLIZJ = iPrivacyHighlightService.LIZJ();
            }
            this.LLJI = fragmentLIZJ;
            if (fragmentLIZJ == 0) {
                NR(Boolean.TRUE);
            } else {
                ((InterfaceC446950Hfp) fragmentLIZJ).Oc(new AwS550S0100000_6(this, 1023));
                Fragment fragment = this.LLJI;
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.drh, fragment, "phl_fragment");
                c19ehLJIIJ.LJJIFFI(fragment);
                c19ehLJIIJ.LJIIJ();
            }
        }
        PhlViewModel phlViewModel = this.LLJIJIL;
        if (phlViewModel != null) {
            phlViewModel.vQ2();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czf, viewGroup, false);
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
