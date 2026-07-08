package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.fragment;

import X.C0PEM;
import X.C0Q3E;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C646670PYb;
import X.C647260Pa8;
import X.C648890Pcl;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel.SearchLiveViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveDynamicTabFragment extends BaseSearchDynamicTabFragment<SearchLiveList> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPyohPCwvKCHELIOSMgLSQ+Kid9JCw6LDsyKmsqOy40JSAiPWEALSQ+KicfITMpDTY9KSglKhsyKgM+KCg+LSs4";
    public final AssemVMLazy LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchLiveDynamicTabFragment.class, "searchLiveVM", "getSearchLiveVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchlive/core/videmodel/SearchLiveViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final SearchLiveViewModel oS() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (SearchLiveViewModel) assemVMLazy.getValue();
    }

    public SearchLiveDynamicTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchLiveViewModel.class);
        this.LLJJJJLIIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 813), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 814), AFwS241S0000000_10.get$arr$(359));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final AbstractSearchDynamicTabViewModel<SearchLiveList> bS() {
        return oS();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void searchLiveLoadMore(C648890Pcl c648890Pcl) {
        SearchRequestParam searchRequestParamZX1;
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicParamsHandleAbility.class, null);
        if (iSearchDynamicParamsHandleAbility != null && (searchRequestParamZX1 = iSearchDynamicParamsHandleAbility.ZX1(this, null, ((C646670PYb) C0Q3E.LIZIZ(this).Jh0().LIZJ()).LLILLJJLI, false, "")) != null) {
            SearchLiveViewModel searchLiveViewModelOS = oS();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(searchLiveViewModelOS), C0PEM.LIZJ, null, new C647260Pa8(searchLiveViewModelOS, searchRequestParamZX1, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 340), 3);
        AssemViewModel.asyncSubscribe$default(oS(), new C2217381BqS() { // from class: X.0PZQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 401), null, new AwS589S0100000_10(this, 402), 10, null);
        if (cS().searchTabPlayConfig.needAutoPlay) {
            AssemViewModel.asyncSubscribe$default(oS(), new C2217381BqS() { // from class: X.0PZU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C647210Pa3) obj).LLILLJJLI;
                }
            }, null, new AwS589S0100000_10(this, 403), null, new AwS589S0100000_10(this, 404), 10, null);
        }
    }
}
