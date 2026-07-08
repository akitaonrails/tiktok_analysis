package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.fragment;

import X.C0PEM;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C647200Pa2;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.defaulttab.viewmodel.DefaultSearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabApiConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDefaultDynamicTabFragment extends BaseSearchDynamicTabFragment<n> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPyohPCwvKCMgLSHELIOSQ+Kid9LCAqKDo/PDEtK2E1OiQrJCo9PGsfLC4hKy0ILCkyPSk4DTY9KSglKhsyKgM+KCg+LSs4";
    public final AssemVMLazy LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchDefaultDynamicTabFragment.class, "tabVM", "getTabVM()Lcom/ss/android/ugc/aweme/search/pages/result/verticalsearch/defaulttab/viewmodel/DefaultSearchDynamicTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final AbstractSearchDynamicTabViewModel<n> bS() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (AbstractSearchDynamicTabViewModel) assemVMLazy.getValue();
    }

    public SearchDefaultDynamicTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DefaultSearchDynamicTabViewModel.class);
        this.LLJJJJLIIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 805), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 806), AFwS241S0000000_10.get$arr$(356));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final void mS(SearchRequestParam searchRequestParam) {
        SearchTabApiConfig searchTabApiConfig = cS().apiConfig;
        if (searchRequestParam != null) {
            AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            DefaultSearchDynamicTabViewModel defaultSearchDynamicTabViewModel = (DefaultSearchDynamicTabViewModel) assemVMLazy.getValue();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(defaultSearchDynamicTabViewModel), C0PEM.LIZJ, null, new C647200Pa2(defaultSearchDynamicTabViewModel, searchTabApiConfig, searchRequestParam, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Pa1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 333), null, new AwS589S0100000_10(this, 334), 10, null);
    }
}
