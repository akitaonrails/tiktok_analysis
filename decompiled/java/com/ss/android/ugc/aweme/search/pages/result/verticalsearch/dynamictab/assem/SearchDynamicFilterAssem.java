package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem;

import X.AbstractC738140SxQ;
import X.C0PCY;
import X.C0Q3E;
import X.C0Q94;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C288060BQu;
import X.C646670PYb;
import X.C646870PYv;
import X.C646880PYw;
import X.C665590Q8v;
import X.C679340Qkm;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicFilterAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicFilterAssem<D> extends AbstractC738140SxQ implements ISearchDynamicFilterAbility, InterfaceC1554640qYg {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C646880PYw.class, "search_dynamic_fragment_data_key"), checkSupervisorPrepared());
    public SearchStartViewModel LLILLJJLI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 823465523) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C19EG c19eg;
        super.onParentViewCreated();
        C646880PYw c646880PYw = (C646880PYw) this.LL.getValue();
        if (c646880PYw == null || (c19eg = c646880PYw.LL) == null) {
            return;
        }
        this.LLILLJJLI = (SearchStartViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchStartViewModel.class);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicFilterAbility
    public final void l6(boolean z) {
        boolean z2;
        SearchStartViewModel searchStartViewModel;
        NextLiveData<Boolean> nextLiveDataAQ2;
        boolean z3;
        ISearchDynamicPageAbility iSearchDynamicPageAbility;
        NextLiveData<Boolean> nextLiveDataVQ2;
        C0Q94 c0q94Ju2;
        ISearchDynamicPageAbility iSearchDynamicPageAbility2;
        NextLiveData<Boolean> nextLiveDataVQ22;
        OptionConfigParams optionConfigParamsLIZ;
        ISearchDynamicPageAbility iSearchDynamicPageAbility3;
        NextLiveData<Boolean> nextLiveDataVQ23;
        AmeBaseFragment ameBaseFragment;
        ISearchDynamicPageAbility iSearchDynamicPageAbility4;
        ISearchContextAbility iSearchContextAbilityLIZIZ;
        C0PCY<C646670PYb> c0pcyJh0;
        C646670PYb c646670PYb;
        AmeBaseFragment ameBaseFragment2;
        ISearchDynamicPageAbility iSearchDynamicPageAbility5;
        SearchResultParam searchResultParamI;
        C646870PYv c646870PYv;
        C646880PYw c646880PYw = (C646880PYw) this.LL.getValue();
        if (c646880PYw != null && (c646870PYv = c646880PYw.LLILLL) != null) {
            z2 = c646870PYv.enableSearchFilter;
        } else {
            z2 = false;
        }
        if (C288060BQu.LIZ && z2) {
            C646880PYw c646880PYw2 = (C646880PYw) this.LL.getValue();
            if ((c646880PYw2 == null || (ameBaseFragment2 = c646880PYw2.LLILLJJLI) == null || (iSearchDynamicPageAbility5 = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(ameBaseFragment2, null), ISearchDynamicPageAbility.class, null)) == null || (searchResultParamI = iSearchDynamicPageAbility5.I()) == null || searchResultParamI.getFilterOption() == null) && (searchStartViewModel = this.LLILLJJLI) != null && (nextLiveDataAQ2 = searchStartViewModel.AQ2()) != null) {
                nextLiveDataAQ2.setValue(Boolean.FALSE);
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(fragmentLJI)) != null && (c0pcyJh0 = iSearchContextAbilityLIZIZ.Jh0()) != null && (c646670PYb = (C646670PYb) c0pcyJh0.LIZJ()) != null) {
                z3 = c646670PYb.LLJ;
            } else {
                z3 = false;
            }
            if (z) {
                C646880PYw c646880PYw3 = (C646880PYw) this.LL.getValue();
                if (c646880PYw3 != null && (ameBaseFragment = c646880PYw3.LLILLJJLI) != null && (iSearchDynamicPageAbility4 = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(ameBaseFragment, null), ISearchDynamicPageAbility.class, null)) != null) {
                    c0q94Ju2 = iSearchDynamicPageAbility4.ju2();
                } else {
                    c0q94Ju2 = null;
                }
                if (!z3) {
                    C665590Q8v c665590Q8v = C665590Q8v.LIZ;
                    if (c0q94Ju2 != null) {
                        optionConfigParamsLIZ = c0q94Ju2.LIZ();
                    } else {
                        optionConfigParamsLIZ = null;
                    }
                    c665590Q8v.getClass();
                    if (!C665590Q8v.LIZ(optionConfigParamsLIZ)) {
                        SearchStartViewModel searchStartViewModel2 = this.LLILLJJLI;
                        if (searchStartViewModel2 != null && (nextLiveDataVQ23 = searchStartViewModel2.vQ2()) != null) {
                            nextLiveDataVQ23.setValue(Boolean.FALSE);
                        }
                        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                        if (fragmentLJI2 != null && (iSearchDynamicPageAbility3 = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), ISearchDynamicPageAbility.class, null)) != null) {
                            iSearchDynamicPageAbility3.fa2(false);
                            return;
                        }
                        return;
                    }
                }
                SearchStartViewModel searchStartViewModel3 = this.LLILLJJLI;
                if (searchStartViewModel3 != null && (nextLiveDataVQ22 = searchStartViewModel3.vQ2()) != null) {
                    nextLiveDataVQ22.setValue(Boolean.TRUE);
                }
                Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                if (fragmentLJI3 == null || (iSearchDynamicPageAbility2 = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), ISearchDynamicPageAbility.class, null)) == null) {
                    return;
                }
                iSearchDynamicPageAbility2.fa2(true);
                return;
            }
            SearchStartViewModel searchStartViewModel4 = this.LLILLJJLI;
            if (searchStartViewModel4 != null && (nextLiveDataVQ2 = searchStartViewModel4.vQ2()) != null) {
                nextLiveDataVQ2.setValue(Boolean.FALSE);
            }
            Fragment fragmentLJI4 = C724240Sb0.LJI(this);
            if (fragmentLJI4 == null || (iSearchDynamicPageAbility = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI4, null), ISearchDynamicPageAbility.class, null)) == null) {
                return;
            }
            iSearchDynamicPageAbility.fa2(false);
        }
    }
}
