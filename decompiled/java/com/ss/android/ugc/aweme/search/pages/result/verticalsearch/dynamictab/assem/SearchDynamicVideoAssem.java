package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem;

import X.AbstractC738140SxQ;
import X.C0PDE;
import X.C0PDF;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C646200PWg;
import X.C646870PYv;
import X.C646880PYw;
import X.C663070Pzd;
import X.C679340Qkm;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC648270Pbl;
import Y.AObserverS214S0100000_10;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicVideoAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicVideoAssem;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabPlayConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicVideoAssem<D> extends AbstractC738140SxQ implements ISearchDynamicVideoAbility, InterfaceC1554640qYg {
    public boolean LL;
    public boolean LLILLJJLI;
    public SearchStateViewModel LLILZ;
    public SearchStartViewModel LLILZIL;
    public InterfaceC648270Pbl LLILZLL;
    public boolean LLILLL = true;
    public final C1559260qg8 LLIZ = new C1559260qg8(new C723580SZw(this, C646880PYw.class, "search_dynamic_fragment_data_key"), checkSupervisorPrepared());

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -844176274) {
            return null;
        }
        return this;
    }

    public final C646880PYw<D> bo() {
        return (C646880PYw) this.LLIZ.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        C19EG c19eg;
        super.onParentViewCreated();
        this.LL = false;
        C646880PYw<D> c646880PYwBo = bo();
        if (c646880PYwBo != null && (c19eg = c646880PYwBo.LL) != null) {
            this.LLILZ = (SearchStateViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchStateViewModel.class);
            this.LLILZIL = (SearchStartViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchStartViewModel.class);
        }
        SearchStateViewModel searchStateViewModel = this.LLILZ;
        if (searchStateViewModel != null && (mutableLiveData3 = searchStateViewModel.isShowingFilters) != null) {
            mutableLiveData3.observe(this, new AObserverS214S0100000_10(this, 63));
        }
        SearchStateViewModel searchStateViewModel2 = this.LLILZ;
        if (searchStateViewModel2 != null && (mutableLiveData2 = searchStateViewModel2.shouldBlockMediaPlay) != null) {
            mutableLiveData2.observe(this, new AObserverS214S0100000_10(this, 64));
        }
        SearchStateViewModel searchStateViewModel3 = this.LLILZ;
        if (searchStateViewModel3 == null || (mutableLiveData = searchStateViewModel3.searchState) == null) {
            return;
        }
        C0PDE c0pde = new C0PDE();
        c0pde.LL = new C0PDF(this) { // from class: X.0PYz
            public final /* synthetic */ SearchDynamicVideoAssem<D> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.C0PDF
            public final void LIZ() {
            }

            @Override // X.C0PDF
            public final void LLFF() {
            }

            @Override // X.C0PDF
            public final void LIZIZ(boolean z) {
                SearchStartViewModel searchStartViewModel;
                NextLiveData<Integer> nextLiveDataYQ2;
                if (z && (searchStartViewModel = this.LIZ.LLILZIL) != null && (nextLiveDataYQ2 = searchStartViewModel.yQ2()) != null) {
                    Integer value = nextLiveDataYQ2.getValue();
                    C644560PPy.LIZ.getClass();
                    int iLJIIL = C644560PPy.LJIIL();
                    if (value != null && value.intValue() == iLJIIL) {
                        this.LIZ.LLILLL = true;
                        C646200PWg.LIZIZ();
                        return;
                    }
                }
                this.LIZ.LLILLL = false;
                C646200PWg.LIZ();
            }
        };
        mutableLiveData.observe(this, c0pde);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        SearchStateViewModel searchStateViewModel;
        HashSet<Integer> hashSet;
        ISearchDynamicLiveAbility iSearchDynamicLiveAbility;
        Fragment fragmentLJI;
        ISearchDynamicLiveAbility iSearchDynamicLiveAbility2;
        C646880PYw<D> c646880PYwBo;
        C646870PYv c646870PYv;
        SearchTabPlayConfig searchTabPlayConfig;
        C646870PYv c646870PYv2;
        SearchTabPlayConfig searchTabPlayConfig2;
        C646870PYv c646870PYv3;
        SearchTabPlayConfig searchTabPlayConfig3;
        SearchStateViewModel searchStateViewModel2;
        HashSet<Integer> hashSet2;
        super.onResume();
        C646880PYw<D> c646880PYwBo2 = bo();
        boolean z = c646880PYwBo2 == null || (c646870PYv3 = c646880PYwBo2.LLILLL) == null || (searchTabPlayConfig3 = c646870PYv3.searchTabPlayConfig) == null || !searchTabPlayConfig3.isLiveSource() ? !((searchStateViewModel = this.LLILZ) == null || (hashSet = searchStateViewModel.queryWordChangeInProcess) == null || !hashSet.contains(1)) : !((searchStateViewModel2 = this.LLILZ) == null || (hashSet2 = searchStateViewModel2.queryWordChangeInProcess) == null || !hashSet2.contains(2));
        C646880PYw<D> c646880PYwBo3 = bo();
        if (!((c646880PYwBo3 == null || (c646870PYv2 = c646880PYwBo3.LLILLL) == null || (searchTabPlayConfig2 = c646870PYv2.searchTabPlayConfig) == null || !searchTabPlayConfig2.isLiveSource()) ? false : true) || (fragmentLJI = C724240Sb0.LJI(this)) == null || (iSearchDynamicLiveAbility2 = (ISearchDynamicLiveAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicLiveAbility.class, null)) == null || !iSearchDynamicLiveAbility2.q10() || z || (c646880PYwBo = bo()) == null || (c646870PYv = c646880PYwBo.LLILLL) == null || (searchTabPlayConfig = c646870PYv.searchTabPlayConfig) == null || !searchTabPlayConfig.needAutoPlay || !this.LLILLL || this.LL || this.LLILLJJLI) {
            this.LLILZLL = null;
        } else {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && fragmentLJI2.getUserVisibleHint()) {
                C646200PWg.LIZIZ();
            }
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 == null || (iSearchDynamicLiveAbility = (ISearchDynamicLiveAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), ISearchDynamicLiveAbility.class, null)) == null) {
            return;
        }
        iSearchDynamicLiveAbility.Gb2();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicVideoAbility
    public final void setUserVisibleHint(boolean z) {
        C646870PYv c646870PYv;
        SearchTabPlayConfig searchTabPlayConfig;
        HashSet<Integer> hashSet;
        InterfaceC648270Pbl interfaceC648270Pbl;
        C646870PYv c646870PYv2;
        SearchTabPlayConfig searchTabPlayConfig2;
        C646880PYw<D> c646880PYwBo = bo();
        if (c646880PYwBo != null && (c646870PYv = c646880PYwBo.LLILLL) != null && (searchTabPlayConfig = c646870PYv.searchTabPlayConfig) != null && searchTabPlayConfig.needAutoPlay) {
            if (!z) {
                InterfaceC648270Pbl interfaceC648270PblLIZJ = C646200PWg.LIZJ();
                C646880PYw<D> c646880PYwBo2 = bo();
                if ((c646880PYwBo2 == null || (c646870PYv2 = c646880PYwBo2.LLILLL) == null || (searchTabPlayConfig2 = c646870PYv2.searchTabPlayConfig) == null || !searchTabPlayConfig2.isLiveSource() || (interfaceC648270PblLIZJ instanceof C663070Pzd)) && this.LLILZLL == null) {
                    this.LLILZLL = C646200PWg.LIZJ();
                    C646200PWg.LIZ();
                    return;
                }
                return;
            }
            SearchStateViewModel searchStateViewModel = this.LLILZ;
            if (searchStateViewModel != null && (hashSet = searchStateViewModel.queryWordChangeInProcess) != null && !hashSet.contains(2) && (interfaceC648270Pbl = this.LLILZLL) != null) {
                interfaceC648270Pbl.LLLLLIL();
            }
            this.LLILZLL = null;
        }
    }
}
