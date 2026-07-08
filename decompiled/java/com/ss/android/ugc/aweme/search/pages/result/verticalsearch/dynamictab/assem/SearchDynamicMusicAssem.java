package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem;

import X.AbstractC738140SxQ;
import X.C0PDE;
import X.C0PDF;
import X.C0PZI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C646880PYw;
import X.C648360Pbu;
import X.C649290PdP;
import X.C679340Qkm;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.AObserverS214S0100000_10;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicMusicAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicMusicAssem;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicMusicAssem<D> extends AbstractC738140SxQ implements ISearchDynamicMusicAbility, InterfaceC1554640qYg {
    public MusicPlayHelper LL;
    public SearchStateViewModel LLILLJJLI;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723580SZw(this, C646880PYw.class, "search_dynamic_fragment_data_key"), checkSupervisorPrepared());

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1173993348) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicMusicAbility
    public final void x40() {
        MusicPlayHelper musicPlayHelper = this.LL;
        if (musicPlayHelper != null) {
            musicPlayHelper.BQ2(null, false);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        MutableLiveData<Boolean> mutableLiveData;
        SearchStateViewModel searchStateViewModel;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        C19EG c19eg;
        SearchBaseSparkView searchBaseSparkView;
        ISearchDynamicContentAbility iSearchDynamicContentAbility;
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C0PZI c0pziRw2 = null;
        if (fragmentLJI != null && (iSearchDynamicContentAbility = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ISearchDynamicContentAbility.class, null)) != null) {
            c0pziRw2 = iSearchDynamicContentAbility.rw2();
        }
        if ((c0pziRw2 instanceof C649290PdP) && (searchBaseSparkView = (SearchBaseSparkView) c0pziRw2) != null) {
            searchBaseSparkView.LJI(new C648360Pbu());
        }
        C646880PYw c646880PYw = (C646880PYw) this.LLILLL.getValue();
        if (c646880PYw != null && (c19eg = c646880PYw.LL) != null) {
            this.LL = (MusicPlayHelper) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(MusicPlayHelper.class);
            this.LLILLJJLI = (SearchStateViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchStateViewModel.class);
        }
        C0PDE c0pde = new C0PDE();
        c0pde.LL = new C0PDF(this) { // from class: X.0PZ4
            public final /* synthetic */ SearchDynamicMusicAssem<D> LIZ;

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
                if (!z) {
                    this.LIZ.x40();
                }
            }
        };
        SearchStateViewModel searchStateViewModel2 = this.LLILLJJLI;
        if (searchStateViewModel2 != null && (mutableLiveData3 = searchStateViewModel2.searchState) != null) {
            mutableLiveData3.observe(this, c0pde);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (searchStateViewModel = this.LLILLJJLI) != null && (mutableLiveData2 = searchStateViewModel.isShowingFilters) != null) {
            mutableLiveData2.observe(fragmentLJI2, new AObserverS214S0100000_10(this, 61));
        }
        SearchStateViewModel searchStateViewModel3 = this.LLILLJJLI;
        if (searchStateViewModel3 == null || (mutableLiveData = searchStateViewModel3.shouldBlockMediaPlay) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 62));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }
}
