package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.musictab.fragment;

import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.common.searchmusic.core.viewmodel.DynamicSearchMusicVM;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMusicDynamicTabFragment extends BaseSearchDynamicTabFragment<n> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPyohPCwvKCMgHELIOSLSQ+Kid9JTA/ICwnKSdiLz0yLygpJzt9GyAtOyw7BTA/ICwXMSstJCYwHCQuDz0yLygpJzs=";
    public final AssemVMLazy LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMusicDynamicTabFragment.class, "musicVM", "getMusicVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchmusic/core/viewmodel/DynamicSearchMusicVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final String aS() {
        C664000Q2s c664000Q2s;
        String str;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity = getActivity();
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, activity);
        return (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final AbstractSearchDynamicTabViewModel<n> bS() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (AbstractSearchDynamicTabViewModel) assemVMLazy.getValue();
    }

    public SearchMusicDynamicTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicSearchMusicVM.class);
        this.LLJJJJLIIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 815), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 816), AFwS241S0000000_10.get$arr$(360));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0PZL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 341), null, new AwS589S0100000_10(this, 342), 10, null);
    }
}
