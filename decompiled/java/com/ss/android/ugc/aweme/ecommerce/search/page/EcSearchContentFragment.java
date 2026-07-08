package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.C01GW;
import X.C098200Yq;
import X.C0GXJ;
import X.C0PSL;
import X.C0QER;
import X.C0QPH;
import X.C0QUT;
import X.C0QW9;
import X.C0QWG;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C452501pT;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C671520QVq;
import X.C671530QVr;
import X.C671540QVs;
import X.C673940Qc4;
import X.C674380Qcm;
import X.C674630QdB;
import X.C786410Ut5;
import X.EnumC671220QUm;
import X.EnumC673970Qc7;
import X.EnumC674310Qcf;
import X.InterfaceC420801kM;
import X.InterfaceC665370Q7z;
import X.InterfaceC671770QWp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchContentFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchContentContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchContentFragment extends Fragment implements IEcSearchContentAbility, InterfaceC671770QWp {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgHELIOSLSQ+Kid9OCQrLGEWKxYpKD0wIAYjJzs2JjEKOy40JSAiPQ==";
    public C0QW9 LL;
    public ISearchBarAbility LLILLJJLI;
    public ISearchSuggestSubPageAbility LLILLL;
    public ISearchSugSubPageAbility LLILZ;
    public ISearchResultSubPageAbility LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 54));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 53));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 52));

    @Override // X.InterfaceC671770QWp
    public final void Ec(EnumC674310Qcf enumC674310Qcf, boolean z) {
    }

    public final IEcSearchFragmentAbility MR() {
        return (IEcSearchFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IEcSearchFragmentAbility.class, null);
    }

    @Override // X.InterfaceC671770QWp
    public final void NQ(boolean z, String str, C674380Qcm c674380Qcm) {
    }

    public final IEcSearchContentContextAbility NR() {
        return (IEcSearchContentContextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IEcSearchContentContextAbility.class, null);
    }

    @Override // X.InterfaceC671770QWp
    public final void i4() {
    }

    @Override // X.InterfaceC671770QWp
    public final void kP(EnumC674310Qcf enumC674310Qcf) {
    }

    @Override // X.InterfaceC671770QWp
    public final void lO() {
    }

    @Override // X.InterfaceC671440QVi
    public final boolean m9(C0QUT c0qut) {
        return false;
    }

    @Override // X.InterfaceC671770QWp
    public final void t3(C674630QdB c674630QdB) {
    }

    @Override // X.InterfaceC671770QWp
    public final void vG() {
    }

    @Override // X.InterfaceC671440QVi
    public final void F5() {
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            c0qw9.F5();
        }
    }

    public final ISearchBarAbility OR() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = (ISearchBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchBarAbility.class, null);
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC671440QVi
    public final boolean X6() {
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            return c0qw9.X6();
        }
        return false;
    }

    @Override // X.InterfaceC671440QVi
    public final IPageSearchSubPageAbility x8() {
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            return c0qw9.LLJILJIL;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C673940Qc4.LIZIZ = null;
        C673940Qc4.LIZJ = null;
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IEcSearchContentAbility.class, null);
        }
    }

    @Override // X.InterfaceC671440QVi
    public final void LLIILII(SearchResultParam searchResultParam) {
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            c0qw9.LLIILII(searchResultParam);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String sourceBtmToken;
        SearchResultParam searchResultParamQs0;
        super.onCreate(bundle);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        IEcSearchFragmentAbility iEcSearchFragmentAbilityMR = MR();
        if (iEcSearchFragmentAbilityMR != null && (searchResultParamQs0 = iEcSearchFragmentAbilityMR.qs0()) != null) {
            sourceBtmToken = searchResultParamQs0.getSourceBtmToken();
        } else {
            sourceBtmToken = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b1453", sourceBtmToken);
    }

    @Override // X.InterfaceC671440QVi
    public final InterfaceC420801kM oz(C0QPH c0qph) {
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            return c0qw9.oz(c0qph);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        C650960Pg6 c650960Pg6Vv1;
        int i;
        EnumC671220QUm disableSugStrategy;
        C0QW9 c671530QVr;
        C0QER c0qerV4;
        ECSearchEntranceData ecSearchEntranceData;
        C0QUT c0qutXw1;
        IEcSearchContentContextAbility iEcSearchContentContextAbilityNR;
        C664000Q2s c664000Q2s;
        C0GXJ c0gxj;
        super.onViewCreated(view, bundle);
        C673940Qc4.LJIIJJI(EnumC673970Qc7.SEARCH);
        C19EG activity = getActivity();
        SearchResultParam searchResultParamQs0 = null;
        if (activity != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IEcSearchContentAbility.class, null, null);
        }
        if ((view instanceof C0GXJ) && (c0gxj = (C0GXJ) view) != null) {
            c0gxj.setIgnoreMaxDiff(true);
            c0gxj.setTouchHandle(new AwS589S0100000_10(this, 5));
        }
        IEcSearchFragmentAbility iEcSearchFragmentAbility = (IEcSearchFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IEcSearchFragmentAbility.class, null);
        if (iEcSearchFragmentAbility != null) {
            c650960Pg6Vv1 = iEcSearchFragmentAbility.vv1();
        } else {
            c650960Pg6Vv1 = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        if (c650960Pg6Vv1 != null && (c664000Q2s = c650960Pg6Vv1.searchCommonModel) != null) {
            i = c664000Q2s.backPressFlag;
        } else {
            i = 2;
        }
        final C671520QVq c671520QVq = new C671520QVq(interfaceC665370Q7zLJFF, i);
        C0QWG c0qwg = new C0QWG() { // from class: X.0QVT
            @Override // X.C0QPH
            public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
            }

            @Override // X.C0QWG
            public final boolean Bd() {
                if (this.LL.getActivity() != null) {
                    return !C20633086l.LIZ(r1);
                }
                return true;
            }

            @Override // X.C0QWG
            public final C0QPB LLJILJIL() {
                IEcSearchFragmentAbility iEcSearchFragmentAbility2 = (IEcSearchFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IEcSearchFragmentAbility.class, null);
                if (iEcSearchFragmentAbility2 != null) {
                    return iEcSearchFragmentAbility2.LLJILJIL();
                }
                return null;
            }

            @Override // X.C0QWG
            public final C671520QVq Cg() {
                return c671520QVq;
            }

            @Override // X.C0QWG
            public final LifecycleOwner getLifecycleOwner() {
                return this.LL;
            }

            @Override // X.C0QPH
            public final void pc(C0QUT c0qut, C0QUT c0qut2) {
                if (C0BT4.LIZ()) {
                    EcSearchContentFragment ecSearchContentFragment = this.LL;
                    if (!ecSearchContentFragment.LLILZLL && c0qut2 == C0QUT.RESULT) {
                        ecSearchContentFragment.LLILZLL = true;
                        C723850SaN.LIZ(ecSearchContentFragment, false, null, new AwS376S0200000_10(ecSearchContentFragment, view, 1), 3);
                    }
                }
                IEcSearchContentContextAbility iEcSearchContentContextAbilityNR2 = this.LL.NR();
                if (iEcSearchContentContextAbilityNR2 != null) {
                    iEcSearchContentContextAbilityNR2.ID2(c0qut, c0qut2);
                }
            }
        };
        ISearchBarAbility iSearchBarAbilityOR = OR();
        if (iSearchBarAbilityOR == null) {
            C1AF0.LIZJ("SearchBarAbility must not be null in EcSearchContentFragment");
            c671530QVr = null;
        } else {
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(iSearchBarAbilityOR, 9);
            AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10(this, 5);
            AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this, 12);
            AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(this, 19);
            IEcSearchFragmentAbility iEcSearchFragmentAbilityMR = MR();
            if (iEcSearchFragmentAbilityMR != null && (c0qerV4 = iEcSearchFragmentAbilityMR.v4()) != null && (ecSearchEntranceData = c0qerV4.getEcSearchEntranceData()) != null) {
                disableSugStrategy = ecSearchEntranceData.getDisableSugStrategy();
            } else {
                disableSugStrategy = null;
            }
            if (disableSugStrategy == EnumC671220QUm.DISABLE_PAGE) {
                c671530QVr = new C671540QVs(c0qwg, awS554S0100000_10, awS554S0100000_102, awS546S0100000_2, awS546S0100000_22);
            } else {
                c671530QVr = new C671530QVr(c0qwg, awS554S0100000_10, awS554S0100000_102, awS546S0100000_2, awS546S0100000_22);
            }
        }
        this.LL = c671530QVr;
        IEcSearchFragmentAbility iEcSearchFragmentAbilityMR2 = MR();
        if (iEcSearchFragmentAbilityMR2 == null || (c0qutXw1 = iEcSearchFragmentAbilityMR2.Xw1()) == null) {
            c0qutXw1 = C0QUT.SUGGEST;
        }
        IEcSearchFragmentAbility iEcSearchFragmentAbilityMR3 = MR();
        if (iEcSearchFragmentAbilityMR3 != null && (searchResultParamQs0 = iEcSearchFragmentAbilityMR3.qs0()) != null && (iEcSearchContentContextAbilityNR = NR()) != null) {
            iEcSearchContentContextAbilityNR.Ae0(searchResultParamQs0);
        }
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            c0qw9.aM(c0qutXw1, searchResultParamQs0, view);
        }
    }

    @Override // X.InterfaceC671770QWp
    public final void ov(String str, boolean z) {
        if (!z) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.updateBtmPage(this, str);
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(this, null, c0psl);
        }
    }

    @Override // X.InterfaceC671440QVi
    public final void aM(C0QUT c0qut, SearchResultParam searchResultParam, View view) {
        SearchResultParam searchResultParamQs0;
        C0QW9 c0qw9 = this.LL;
        if (c0qw9 != null) {
            IEcSearchFragmentAbility iEcSearchFragmentAbilityMR = MR();
            if (iEcSearchFragmentAbilityMR != null) {
                searchResultParamQs0 = iEcSearchFragmentAbilityMR.qs0();
            } else {
                searchResultParamQs0 = null;
            }
            c0qw9.aM(c0qut, searchResultParamQs0, view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bqn, viewGroup, false);
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
