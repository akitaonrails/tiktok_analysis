package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.AbstractC1255880imo;
import X.C036E;
import X.C0P9E;
import X.C0PN2;
import X.C0PQK;
import X.C0PSG;
import X.C1257170iot;
import X.C19EG;
import X.C643800PNa;
import X.C810560Vqw;
import X.EnumC1609900rzo;
import X.EnumC642100PGm;
import X.InterfaceC645400PTe;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchOriginalFragment<D> extends SearchFragment<D> implements InterfaceC645400PTe {
    public C643800PNa<?> LLLLLJIL;
    public final ARunnableS110S0100000_10 LLLLLJLJLL = new ARunnableS110S0100000_10(this, 60);

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC1212360hec
    public final void Ng1() {
        T t = cU().LL;
        if (t != 0) {
            SearchFragment.NT(this, false, (SearchApiResult) t.getData(), null, ((AbstractC1255880imo) cU().LL).isDataEmpty(), 5);
            if (C0PQK.LIZ((SearchApiResult) t.getData(), null, 2)) {
                return;
            }
        }
        ET(true);
    }

    @Override // X.InterfaceC643870PNh
    public void XF(DynamicPatch dynamicPatch, String str) {
    }

    public final C643800PNa<?> cU() {
        C643800PNa<?> c643800PNa = this.LLLLLJIL;
        if (c643800PNa != null) {
            return c643800PNa;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void kS() {
        if (this.LLLLLJIL == null) {
            return;
        }
        T t = cU().LL;
        if (t != 0) {
            ((C0PN2) t).LJIIL();
        }
        clearData();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final String HS() {
        C0PN2 c0pn2;
        C643800PNa<?> c643800PNaCU = cU();
        if (c643800PNaCU == null || (c0pn2 = (C0PN2) c643800PNaCU.LL) == null) {
            return null;
        }
        return c0pn2.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        cU().LIZ();
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLLLLJLJLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void qT() {
        boolean zLIZIZ;
        getActivity();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLLLIIIILLL;
            if (searchNetworkStandardStatusVM != null) {
                if (searchNetworkStandardStatusVM.LL == EnumC642100PGm.LOADMORE_NO_NETWORK_LOADING) {
                    return;
                }
                searchNetworkStandardStatusVM.LL = EnumC642100PGm.LOADMORE_NO_NETWORK_LOADING;
                searchNetworkStandardStatusVM.LLILLJJLI = true;
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C1257170iot.LIZ(activity, EnumC1609900rzo.SEARCH, null, null);
            }
            if (oT()) {
                NS().showLoadMoreLoading();
            }
            View view = getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, this.LLLLLJLJLL, 2500L);
                return;
            }
            return;
        }
        T t = cU().LL;
        if (t != 0) {
            ((C0PN2) t).LLJILJIL = 0;
        }
        C643800PNa<?> c643800PNaCU = cU();
        Object[] objArr = new Object[5];
        objArr[0] = 4;
        QueryCorrectComponentInfo queryCorrectComponentInfo = QueryCorrectHelper.Companion.LIZ(this).LIZ;
        Integer numValueOf = queryCorrectComponentInfo != null ? Integer.valueOf(queryCorrectComponentInfo.correctLevel) : null;
        QueryCorrectComponentInfo queryCorrectComponentInfo2 = QueryCorrectHelper.Companion.LIZ(this).LIZ;
        String strDS = queryCorrectComponentInfo2 != null ? queryCorrectComponentInfo2.correctedQuery : null;
        gS().LIZ(new C0P9E(dS(), (numValueOf == null || numValueOf.intValue() != 2 || strDS == null) ? "" : strDS));
        if (numValueOf == null || numValueOf.intValue() != 2 || strDS == null) {
            strDS = dS();
        }
        objArr[1] = strDS;
        objArr[2] = 0;
        objArr[3] = Integer.valueOf(this.LLJJJJJIL);
        SearchResultParam searchResultParam = this.LLJI;
        objArr[4] = searchResultParam != null ? searchResultParam.getFilterOption() : null;
        c643800PNaCU.LIZJ(objArr);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void rS() {
        T t = cU().LL;
        if (t != 0) {
            ((C0PN2) t).LJIIL();
        }
    }

    public void dU(int i) {
        C0PSG filterOption;
        GS().setIsRefreshingData(true);
        C643800PNa<?> c643800PNaCU = cU();
        Object[] objArr = new Object[5];
        objArr[0] = 1;
        objArr[1] = dS();
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(this.LLJJJJJIL);
        SearchResultParam searchResultParam = this.LLJI;
        if (searchResultParam != null) {
            filterOption = searchResultParam.getFilterOption();
        } else {
            filterOption = null;
        }
        objArr[4] = filterOption;
        c643800PNaCU.LIZJ(objArr);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void sT(boolean z) throws Throwable {
        IT(cS(), ((C0PN2) cU().LL).LLJILJILJ, dS(), null, z);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void VT(boolean z, Integer num, boolean z2) {
        if (this.LLLLLJIL == null) {
            return;
        }
        super.VT(z, num, z2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void FT(int i, C0PSG c0psg, boolean z, boolean z2, Integer num) {
        super.FT(i, c0psg, z, z2, num);
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (this.LLLLLJIL == null) {
                    return;
                }
                T t = cU().LL;
                if (t != 0) {
                    ((C0PN2) t).LLJILJIL = 0;
                }
                cU().LJFF(this.LLJJIJI);
                dU(i);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C810560Vqw.LIZLLL(new ARunnableS110S0100000_10(this, 61), 100);
    }
}
