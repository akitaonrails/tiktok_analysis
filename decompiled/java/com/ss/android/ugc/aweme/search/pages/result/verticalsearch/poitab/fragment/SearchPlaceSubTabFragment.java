package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment;

import X.C01GW;
import X.C07CZ;
import X.C0PDE;
import X.C0PDF;
import X.C0PSD;
import X.C0PSG;
import X.C0Q3E;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C645500PTo;
import X.C646870PYv;
import X.C649980PeW;
import X.C663670Q1l;
import X.C679340Qkm;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AObserverS214S0100000_10;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
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
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicPlaceRequestParamsVM;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicSearchPlaceViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.model.SearchPlaceSubTabItem;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlaceSubTabFragment extends BaseSearchDynamicTabFragment<n> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPyohPCwvHELIOSKCMgLSQ+Kid9OColPS4xZiM+KCg+LSs4Zxw2KTcvIR8/KSYpGjoxHCQuDz0yLygpJzs=";
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public long LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchPlaceSubTabFragment.class, "placeVM", "getPlaceVM()Lcom/ss/android/ugc/aweme/search/pages/result/placesearch/core/model/DynamicSearchPlaceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final HashMap<String, Object> oS() {
        HashMap<String, Object> map = new HashMap<>();
        Integer numLIZ = SearchLocationCacheData.LIZ(SearchLocationCacheData.LIZ);
        map.put("current_location_status", Integer.valueOf(numLIZ != null ? numLIZ.intValue() : -1));
        map.put("sub_tab_type", sS());
        return map;
    }

    public final DynamicSearchPlaceViewModel qS() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (DynamicSearchPlaceViewModel) assemVMLazy.getValue();
    }

    public final ISearchDebugService rS() {
        return (ISearchDebugService) PluggableExtentionKt.pluggableSpi$default(ISearchDebugService.class, false, false, false, 14, null);
    }

    public final String sS() {
        String str;
        SearchPlaceSubTabItem searchPlaceSubTabItem = (SearchPlaceSubTabItem) this.LLJLLIL.getValue();
        return (searchPlaceSubTabItem == null || (str = searchPlaceSubTabItem.tabKey) == null) ? "all" : str;
    }

    public SearchPlaceSubTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicSearchPlaceViewModel.class);
        this.LLJLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 826), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 827), AFwS241S0000000_10.get$arr$(364));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 828));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final AbstractSearchDynamicTabViewModel<n> bS() {
        return qS();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final Map<String, String> hS() {
        JSONObject jSONObject;
        DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
        if (dynamicPlaceRequestParamsVMLIZ == null || (jSONObject = dynamicPlaceRequestParamsVMLIZ.LLILLJJLI) == null) {
            return null;
        }
        return C663670Q1l.LIZIZ(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final String iS() {
        DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
        if (dynamicPlaceRequestParamsVMLIZ != null) {
            return dynamicPlaceRequestParamsVMLIZ.LL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C645500PTo.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final void mS(SearchRequestParam searchRequestParam) {
        String str;
        SearchRequestParam searchRequestParamLIZ = searchRequestParam;
        if (this.LLJJLIIIJLLLLLLLZ && searchRequestParamLIZ != null) {
            this.LLJJLIIIJLLLLLLLZ = false;
            searchRequestParamLIZ = SearchRequestParam.LIZ(searchRequestParamLIZ, null, null, null, C2097608Jq.LJIILIIL(searchRequestParamLIZ.LIZJ, new Pair("local_service_places_current_tab", sS())), -1, 4095);
        }
        if (C07CZ.LIZ()) {
            DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
            SearchRequestParam searchRequestParamLIZ2 = null;
            if (dynamicPlaceRequestParamsVMLIZ != null && (str = dynamicPlaceRequestParamsVMLIZ.LLILLL) != null && str.length() != 0) {
                setEnterMethod(str);
                qS().LL = str;
            }
            if (searchRequestParamLIZ != null) {
                searchRequestParamLIZ2 = SearchRequestParam.LIZ(searchRequestParamLIZ, this.LLJILJILJ, null, null, null, -5, 8191);
            }
            super.mS(searchRequestParamLIZ2);
            return;
        }
        super.mS(searchRequestParamLIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        SearchPlaceContainerFragment searchPlaceContainerFragment;
        C646870PYv c646870PYv;
        String str;
        int i = 0;
        setUserVisibleHint(false);
        Fragment parentFragment = getParentFragment();
        SearchResultParam searchResultParam = null;
        if (parentFragment instanceof SearchPlaceContainerFragment) {
            searchPlaceContainerFragment = (SearchPlaceContainerFragment) parentFragment;
        } else {
            searchPlaceContainerFragment = null;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!arguments.containsKey("search_tab_config")) {
                if (searchPlaceContainerFragment == null || (c646870PYv = searchPlaceContainerFragment.LLJ) == null) {
                    c646870PYv = new C646870PYv(null, 0, null, null, false, false, false, false, 0, null, null, null, null, 8191, null);
                }
                SearchPlaceSubTabItem searchPlaceSubTabItem = (SearchPlaceSubTabItem) this.LLJLLIL.getValue();
                if (searchPlaceSubTabItem == null || (str = searchPlaceSubTabItem.pageSchema) == null) {
                    str = c646870PYv.pageSchema;
                }
                C786410Ut5.LJJIZ(arguments, "search_tab_config", c646870PYv.copy(c646870PYv.searchType, c646870PYv.curTabIndex, str, "", c646870PYv.enableSearchFilter, c646870PYv.isNativeFirstRequest, c646870PYv.shouldShowCenterLoadingView, c646870PYv.needLocationParams, c646870PYv.loadMoreCount, c646870PYv.searchTabPlayConfig, c646870PYv.searchChannel, c646870PYv.apiConfig, c646870PYv.lynxEventDelegates));
            }
            if (!arguments.containsKey("search_key")) {
                if (searchPlaceContainerFragment != null) {
                    searchResultParam = searchPlaceContainerFragment.LLJI;
                }
                C786410Ut5.LJJIZ(arguments, "search_key", searchResultParam);
            }
        }
        if (searchPlaceContainerFragment != null) {
            i = searchPlaceContainerFragment.LLJJL;
        }
        VR(i);
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        String str;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/verticalsearch/poitab/fragment/SearchPlaceSubTabFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOW7Ie4CdaIjDxBi4MOWtMfcYWHKtq2qtfVcw6wXagbBlakd3TbTRcY/H4E2IBRZ2VocXUFKPnC5A=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (!z) {
            this.LLJJLIIIJLLLLLLLZ = false;
        } else if (!this.LLJJJJLIIL && getView() != null) {
            C0Q3E.LIZIZ(this).fe(new C0PSD(true));
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
            C20533215Wg.LIZ(SearchPlaceSubTabFragment.class);
        }
    }

    public final Map<String, Object> wS(Map<String, ? extends Object> map) {
        boolean z;
        SearchPlaceContainerFragment searchPlaceContainerFragment;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof SearchPlaceContainerFragment) && (searchPlaceContainerFragment = (SearchPlaceContainerFragment) parentFragment) != null) {
            z = searchPlaceContainerFragment.LLJILLL;
            searchPlaceContainerFragment.LLJILLL = true;
        } else {
            z = false;
        }
        HashMap map2 = new HashMap(map);
        map2.put("forbid_perf_event", Boolean.valueOf(z));
        return map2;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment
    public final void kS(int i, C0PSG c0psg) {
        SearchPlaceContainerFragment searchPlaceContainerFragment;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        if (this.LLJL) {
            this.LLJL = false;
            return;
        }
        String str = "switch_tab";
        if (!this.LLJJJJLIIL) {
            if (this.LLJJL) {
                return;
            }
            if (!this.LLJJLIIIJLLLLLLLZ) {
                Fragment parentFragment = getParentFragment();
                if ((parentFragment instanceof SearchPlaceContainerFragment) && (searchPlaceContainerFragment = (SearchPlaceContainerFragment) parentFragment) != null) {
                    if (!searchPlaceContainerFragment.LLJILJILJ && (viewOnAttachStateChangeListenerC20631115oD = searchPlaceContainerFragment.LLJJI) != null && searchPlaceContainerFragment.cS(viewOnAttachStateChangeListenerC20631115oD.getCurrentItem()) == this) {
                        searchPlaceContainerFragment.LLJILJILJ = true;
                    } else {
                        return;
                    }
                }
                str = "first_req";
            }
            this.LLJJL = true;
        }
        this.LLJLIL = str;
        this.LLJLILLLLZIIL = System.currentTimeMillis();
        super.kS(i, c0psg);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        NextLiveData<Integer> nextLiveDataYQ2;
        MutableLiveData<Integer> mutableLiveData;
        SearchPlaceContainerFragment searchPlaceContainerFragment;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        super.onViewCreated(view, bundle);
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof SearchPlaceContainerFragment) && (searchPlaceContainerFragment = (SearchPlaceContainerFragment) parentFragment) != null && (viewOnAttachStateChangeListenerC20631115oD = searchPlaceContainerFragment.LLJJI) != null) {
            boolean z = true;
            if (searchPlaceContainerFragment.cS(viewOnAttachStateChangeListenerC20631115oD.getCurrentItem()) != this || !searchPlaceContainerFragment.getUserVisibleHint()) {
                z = false;
            }
            setUserVisibleHint(z);
        }
        AssemViewModel.asyncSubscribe$default(qS(), new C2217381BqS() { // from class: X.0PZd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 353), null, new AwS589S0100000_10(this, 354), 10, null);
        if (C645500PTo.LIZLLL()) {
            view.findViewById(R.id.gdh);
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) C679340Qkm.LIZIZ(this, requireActivity()).get(SearchStateViewModel.class);
            if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.searchState) != null) {
                C0PDE c0pde = new C0PDE();
                c0pde.LL = new C0PDF() { // from class: X.0PZe
                    @Override // X.C0PDF
                    public final void LIZ() {
                    }

                    @Override // X.C0PDF
                    public final void LLFF() {
                    }

                    @Override // X.C0PDF
                    public final void LIZIZ(boolean z2) {
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
                nextLiveDataYQ2.observe(this, new AObserverS214S0100000_10(this, 67));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS(com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r3 = ""
            java.lang.String r6 = r7.LLJLIL
            if (r6 != 0) goto L7
            return
        L7:
            long r4 = r7.LLJLILLLLZIIL
            r0 = 0
            r7.LLJLIL = r0
            r1 = 0
            r7.LLJLILLLLZIIL = r1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r4
        L19:
            if (r8 == 0) goto L25
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r8.logPb     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L25
            java.lang.String r5 = r0.getImprId()     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L26
        L25:
            r5 = r3
        L26:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L2a
            goto L36
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L36:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            if (r0 == 0) goto L3d
            r5 = r3
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r8 == 0) goto La3
            com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse$SearchPOIInfo r0 = r8.poiInfo
            if (r0 == 0) goto La3
            com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse$LocalServiceInfo r0 = r0.localServiceInfo
            if (r0 == 0) goto La3
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse$PlacesTabItem> r0 = r0.allTabsList
            if (r0 == 0) goto La3
            int r4 = r0.size()
        L51:
            if (r9 != 0) goto L9e
            if (r8 == 0) goto L9e
            r0 = 2
            if (r4 < r0) goto L78
            java.lang.String r0 = "first_req"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse$SearchPOIInfo r0 = r8.poiInfo
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse$LocalServiceInfo r0 = r0.localServiceInfo
            if (r0 == 0) goto L74
            java.lang.String r3 = r0.currentTab
            if (r3 == 0) goto L74
            int r0 = r3.length()
            if (r0 == 0) goto L74
            if (r3 != 0) goto L78
        L74:
            java.lang.String r3 = r7.sS()
        L78:
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r0 = "search_id"
            r4.LJIIIIZZ(r0, r5)
            java.lang.String r0 = "type"
            r4.LJIIIIZZ(r0, r6)
            java.lang.String r0 = "target_tab"
            r4.LJIIIIZZ(r0, r3)
            java.lang.String r0 = "duration"
            r4.LIZLLL(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "search_place_request"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L99:
            java.lang.String r3 = r7.sS()
            goto L78
        L9e:
            java.lang.String r3 = r7.sS()
            goto L78
        La3:
            r4 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceSubTabFragment.uS(com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse, boolean):void");
    }
}
