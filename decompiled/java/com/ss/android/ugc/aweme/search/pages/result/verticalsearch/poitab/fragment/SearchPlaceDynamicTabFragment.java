package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment;

import X.C07CZ;
import X.C0PDE;
import X.C0PDF;
import X.C0PSD;
import X.C0Q3E;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C645500PTo;
import X.C649980PeW;
import X.C663670Q1l;
import X.C679340Qkm;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import Y.AObserverS214S0100000_10;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.search.debug.ISearchDebugService;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicPlaceRequestParamsVM;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicSearchPlaceViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlaceDynamicTabFragment extends BaseSearchDynamicTabFragment<n> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPyohPCwvKCHELIOSMgLSQ+Kid9OColPS4xZiM+KCg+LSs4Zxw2KTcvIR8/KSYpDTY9KSglKhsyKgM+KCg+LSs4";
    public boolean LLJJJJLIIL;
    public final AssemVMLazy LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchPlaceDynamicTabFragment.class, "placeVM", "getPlaceVM()Lcom/ss/android/ugc/aweme/search/pages/result/placesearch/core/model/DynamicSearchPlaceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final HashMap<String, Object> oS() {
        HashMap<String, Object> map = new HashMap<>();
        Integer numLIZ = SearchLocationCacheData.LIZ(SearchLocationCacheData.LIZ);
        map.put("current_location_status", Integer.valueOf(numLIZ != null ? numLIZ.intValue() : -1));
        return map;
    }

    public final DynamicSearchPlaceViewModel qS() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (DynamicSearchPlaceViewModel) assemVMLazy.getValue();
    }

    public final ISearchDebugService rS() {
        return (ISearchDebugService) PluggableExtentionKt.pluggableSpi$default(ISearchDebugService.class, false, false, false, 14, null);
    }

    public SearchPlaceDynamicTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicSearchPlaceViewModel.class);
        this.LLJJL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 824), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 825), AFwS241S0000000_10.get$arr$(363));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final AbstractSearchDynamicTabViewModel<n> bS() {
        return qS();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final Map<String, String> hS() {
        DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
        if (dynamicPlaceRequestParamsVMLIZ == null) {
            return null;
        }
        JSONObject jSONObject = dynamicPlaceRequestParamsVMLIZ.LLILLJJLI;
        dynamicPlaceRequestParamsVMLIZ.LLILLJJLI = null;
        if (jSONObject != null) {
            return C663670Q1l.LIZIZ(jSONObject);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final String iS() {
        DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
        if (dynamicPlaceRequestParamsVMLIZ == null) {
            return null;
        }
        String str = dynamicPlaceRequestParamsVMLIZ.LL;
        dynamicPlaceRequestParamsVMLIZ.LL = null;
        return str;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C645500PTo.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final void mS(SearchRequestParam searchRequestParam) {
        boolean z;
        String str;
        DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
        if (dynamicPlaceRequestParamsVMLIZ != null && dynamicPlaceRequestParamsVMLIZ.LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJLIIL = z;
        if (C07CZ.LIZ()) {
            DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ2 = C649980PeW.LIZ(this, getActivity());
            SearchRequestParam searchRequestParamLIZ = null;
            if (dynamicPlaceRequestParamsVMLIZ2 != null && (str = dynamicPlaceRequestParamsVMLIZ2.LLILLL) != null && str.length() != 0) {
                setEnterMethod(str);
                qS().LL = str;
            }
            if (searchRequestParam != null) {
                searchRequestParamLIZ = SearchRequestParam.LIZ(searchRequestParam, this.LLJILJILJ, null, null, null, -5, 8191);
            }
            super.mS(searchRequestParamLIZ);
            return;
        }
        super.mS(searchRequestParam);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        String str;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/verticalsearch/poitab/fragment/SearchPlaceDynamicTabFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOW7Ie4CdaIjDxBi4MOWtMfcYWHKtq2qtfVcw6wXagbBlakd3TbTRcY/H4BG4NcJGehOPUI8jtQKK3rwTG", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (C07CZ.LIZ()) {
            if (z) {
                DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
                if (dynamicPlaceRequestParamsVMLIZ != null) {
                    if (dynamicPlaceRequestParamsVMLIZ.LLILZ) {
                        C0Q3E.LIZIZ(this).fe(new C0PSD(true));
                        if (dynamicPlaceRequestParamsVMLIZ != null) {
                            dynamicPlaceRequestParamsVMLIZ.LLILZ = false;
                            str = dynamicPlaceRequestParamsVMLIZ.LLILLL;
                            if (str != null && str.length() != 0) {
                                setEnterMethod(str);
                                qS().LL = str;
                            }
                        }
                    } else if (dynamicPlaceRequestParamsVMLIZ != null) {
                        str = dynamicPlaceRequestParamsVMLIZ.LLILLL;
                        if (str != null) {
                            setEnterMethod(str);
                            qS().LL = str;
                        }
                    }
                }
                super.setUserVisibleHint(z);
            }
        } else {
            super.setUserVisibleHint(z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SearchPlaceDynamicTabFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NextLiveData<Integer> nextLiveDataYQ2;
        MutableLiveData<Integer> mutableLiveData;
        super.onViewCreated(view, bundle);
        AssemViewModel.asyncSubscribe$default(qS(), new C2217381BqS() { // from class: X.0PZO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 351), null, new AwS589S0100000_10(this, 352), 10, null);
        if (C645500PTo.LIZLLL()) {
            view.findViewById(R.id.gdh);
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) C679340Qkm.LIZIZ(this, requireActivity()).get(SearchStateViewModel.class);
            if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.searchState) != null) {
                C0PDE c0pde = new C0PDE();
                c0pde.LL = new C0PDF() { // from class: X.0PZJ
                    @Override // X.C0PDF
                    public final void LIZ() {
                    }

                    @Override // X.C0PDF
                    public final void LLFF() {
                    }

                    @Override // X.C0PDF
                    public final void LIZIZ(boolean z) {
                        ISearchDebugService iSearchDebugServiceRS = this.LIZ.rS();
                        C645500PTo.LIZIZ();
                        if (iSearchDebugServiceRS != null) {
                            iSearchDebugServiceRS.LIZLLL();
                        }
                    }
                };
                mutableLiveData.observe(this, c0pde);
            }
            SearchStartViewModel searchStartViewModel = (SearchStartViewModel) C679340Qkm.LIZIZ(this, requireActivity()).get(SearchStartViewModel.class);
            if (searchStartViewModel != null && (nextLiveDataYQ2 = searchStartViewModel.yQ2()) != null) {
                nextLiveDataYQ2.observe(this, new AObserverS214S0100000_10(this, 66));
            }
        }
    }
}
