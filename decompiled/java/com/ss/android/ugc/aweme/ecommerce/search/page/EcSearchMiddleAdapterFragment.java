package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.C01GW;
import X.C098200Yq;
import X.C0PM7;
import X.C0PSL;
import X.C0Q3E;
import X.C0QER;
import X.C0QF6;
import X.C0QPH;
import X.C0QR7;
import X.C0QUT;
import X.C1202604nA;
import X.C1205904nh;
import X.C139200g2;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1766870w4z;
import X.C1878350yyn;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C293710BfF;
import X.C293720BfG;
import X.C293970Bff;
import X.C452501pT;
import X.C640270P9l;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C669560QOc;
import X.C670980QTo;
import X.C672250QYl;
import X.C673320Qb4;
import X.C673940Qc4;
import X.C674330Qch;
import X.C674380Qcm;
import X.C674520Qd0;
import X.C674630QdB;
import X.C679340Qkm;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC673970Qc7;
import X.EnumC674310Qcf;
import X.InterfaceC1760590vur;
import X.InterfaceC420801kM;
import X.InterfaceC494301wD;
import X.InterfaceC650190Per;
import X.InterfaceC665370Q7z;
import X.InterfaceC668720QKw;
import X.InterfaceC669220QMu;
import X.InterfaceC671770QWp;
import Y.AObserverS206S0100000_2;
import Y.ARunnableS102S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class EcSearchMiddleAdapterFragment extends AmeBaseFragment implements InterfaceC669220QMu, InterfaceC650190Per, InterfaceC671770QWp {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+HELIOSKid9OCQrLGEWKxYpKD0wIAglLSs/LQQoKD8nLTcKOy40JSAiPQ==";
    public InterfaceC668720QKw LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public ISearchSuggestSubPageAbility LLILZ;
    public ISearchSugSubPageAbility LLILZIL;
    public EcSearchIntermediateViewModelNew LLILZLL;
    public SearchStateViewModel LLIZ;
    public SearchKeywordPresenter LLIZLLLIL;
    public SugKeywordPresenter LLJ;
    public SearchEditTextViewModel LLJI;
    public final C0QF6 LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final EcSearchMiddleAdapterFragment$pageStateObserveAbility$1 LLJJ;
    public final List<C0QPH> LLJJI;
    public int LLJJIII;

    public EcSearchMiddleAdapterFragment() {
        this(null);
    }

    @Override // X.InterfaceC671770QWp
    public final void Ec(EnumC674310Qcf enumC674310Qcf, boolean z) {
    }

    @Override // X.InterfaceC671770QWp
    public final void NQ(boolean z, String str, C674380Qcm c674380Qcm) {
    }

    @Override // X.InterfaceC669220QMu
    public final int WC() {
        return 0;
    }

    @Override // X.InterfaceC669220QMu
    public final void Y9(int i, SearchSugEntity searchSugEntity, String str, String str2) {
    }

    @Override // X.InterfaceC669220QMu
    public final void cI(SearchSugEntity searchSugEntity) {
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

    @Override // X.InterfaceC671770QWp
    public final void t3(C674630QdB c674630QdB) {
    }

    @Override // X.InterfaceC669220QMu
    public final void uy(SearchSugEntity searchSugEntity) {
    }

    @Override // X.InterfaceC671770QWp
    public final void vG() {
    }

    public final C650960Pg6 OR() {
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity = getActivity();
        c646000PVm.getClass();
        return C646000PVm.LJII(this, activity);
    }

    @Override // X.InterfaceC669220QMu
    public final void Pm() {
        ISearchSugSubPageAbility iSearchSugSubPageAbility = this.LLILZIL;
        if (iSearchSugSubPageAbility != null) {
            iSearchSugSubPageAbility.Pm();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean PR() {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment.PR():boolean");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C293720BfG.LIZ()) {
            this.LL = null;
        }
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IEcSearchPageStateObserveAbility.class, null);
        if (C293970Bff.LIZ()) {
            ((ArrayList) this.LLJJI).clear();
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment$pageStateObserveAbility$1] */
    public EcSearchMiddleAdapterFragment(InterfaceC668720QKw interfaceC668720QKw) {
        ECSearchEntranceData ecSearchEntranceData;
        this.LL = interfaceC668720QKw;
        ISearchService iSearchService = (ISearchService) ServiceManager.get().getService(ISearchService.class);
        C0QER c0qer = C640270P9l.LIZ(this, getActivity()).LL;
        if (c0qer != null) {
            ecSearchEntranceData = c0qer.getEcSearchEntranceData();
        } else {
            ecSearchEntranceData = null;
        }
        this.LLJIJIL = iSearchService.C(ecSearchEntranceData);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 68));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 69));
        this.LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 70));
        this.LLJJ = new IEcSearchPageStateObserveAbility() { // from class: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment$pageStateObserveAbility$1
            @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility
            public final C0QUT bo2() {
                int i = this.LL.LLJJIII;
                return i != 0 ? i != 1 ? i != 2 ? C0QUT.RESULT : C0QUT.SUG : C0QUT.SUGGEST : C0QUT.RESULT;
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility
            public final InterfaceC420801kM fp0(final C674520Qd0 c674520Qd0) {
                ((ArrayList) this.LL.LLJJI).add(c674520Qd0);
                final EcSearchMiddleAdapterFragment ecSearchMiddleAdapterFragment = this.LL;
                return new InterfaceC420801kM() { // from class: X.0QPG
                    @Override // X.InterfaceC420801kM
                    public final void dispose() {
                        ((ArrayList) ecSearchMiddleAdapterFragment.LLJJI).remove(c674520Qd0);
                    }

                    @Override // X.InterfaceC420801kM
                    public final boolean isDisposed() {
                        return !((ArrayList) ecSearchMiddleAdapterFragment.LLJJI).contains(c674520Qd0);
                    }
                };
            }
        };
        this.LLJJI = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<SearchHistory> listLJIIL;
        String sourceBtmToken;
        C0QER searchEnterParam;
        String string;
        SearchResultParam searchResultParamY3;
        C0QER searchEnterParam2;
        SearchResultParam searchResultParamY32;
        C0QER searchEnterParam3;
        Long endToEndSession;
        SearchResultParam searchResultParamY33;
        SearchResultParam searchResultParamY34;
        super.onCreate(bundle);
        C673320Qb4.LIZ.getClass();
        C673320Qb4.LJIIIZ();
        C19EG activity = getActivity();
        String ecSearchSessionId = null;
        if (activity != null) {
            this.LLILZLL = (EcSearchIntermediateViewModelNew) C679340Qkm.LIZIZ(this, activity).get(EcSearchIntermediateViewModelNew.class);
            this.LLIZ = (SearchStateViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStateViewModel.class);
            this.LLIZLLLIL = new SearchKeywordPresenter(activity, this);
            SugKeywordPresenter sugKeywordPresenter = new SugKeywordPresenter(activity, this);
            this.LLJ = sugKeywordPresenter;
            SearchKeywordPresenter searchKeywordPresenter = this.LLIZLLLIL;
            if (searchKeywordPresenter == null) {
                searchKeywordPresenter = null;
            }
            sugKeywordPresenter.LIZIZ(searchKeywordPresenter.getEditText());
            this.LLJI = (SearchEditTextViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchEditTextViewModel.class);
        }
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LLILZLL;
        if (ecSearchIntermediateViewModelNew == null) {
            ecSearchIntermediateViewModelNew = null;
        }
        ecSearchIntermediateViewModelNew.vQ2().observe(this, new AObserverS206S0100000_2(this, 2));
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew2 = this.LLILZLL;
        if (ecSearchIntermediateViewModelNew2 == null) {
            ecSearchIntermediateViewModelNew2 = null;
        }
        ((LiveData) ecSearchIntermediateViewModelNew2.LLILLL.getValue()).observe(this, new AObserverS206S0100000_2(this, 3));
        C670980QTo c670980QToLIZ = C670980QTo.LIZIZ.LIZ();
        if (C1202604nA.LIZ()) {
            listLJIIL = ((C0QF6) this.LLJILJIL.getValue()).LJIIL(0);
        } else {
            listLJIIL = this.LLJIJIL.LJIIL(0);
        }
        c670980QToLIZ.LIZ = listLJIIL;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        InterfaceC668720QKw interfaceC668720QKw = this.LL;
        if (interfaceC668720QKw != null && (searchResultParamY34 = interfaceC668720QKw.y3()) != null) {
            sourceBtmToken = searchResultParamY34.getSourceBtmToken();
        } else {
            sourceBtmToken = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b1453", sourceBtmToken);
        if (!((Boolean) C139200g2.LIZ.getValue()).booleanValue()) {
            C1766870w4z c1766870w4z = C1766870w4z.LIZ;
            List listSingletonList = Collections.singletonList(PageFinder.via((Fragment) this));
            Pair[] pairArr = new Pair[4];
            InterfaceC668720QKw interfaceC668720QKw2 = this.LL;
            if (interfaceC668720QKw2 != null && (searchResultParamY33 = interfaceC668720QKw2.y3()) != null) {
                searchEnterParam = searchResultParamY33.getSearchEnterParam();
            } else {
                searchEnterParam = null;
            }
            pairArr[0] = new Pair("search_entrance", C0QR7.LJ(searchEnterParam));
            InterfaceC668720QKw interfaceC668720QKw3 = this.LL;
            if (interfaceC668720QKw3 != null && (searchResultParamY32 = interfaceC668720QKw3.y3()) != null && (searchEnterParam3 = searchResultParamY32.getSearchEnterParam()) != null && (endToEndSession = searchEnterParam3.getEndToEndSession()) != null) {
                string = endToEndSession.toString();
            } else {
                string = null;
            }
            pairArr[1] = new Pair("end_to_end_search_session_id", string);
            InterfaceC668720QKw interfaceC668720QKw4 = this.LL;
            if (interfaceC668720QKw4 != null && (searchResultParamY3 = interfaceC668720QKw4.y3()) != null && (searchEnterParam2 = searchResultParamY3.getSearchEnterParam()) != null) {
                ecSearchSessionId = searchEnterParam2.getEcSearchSessionId();
            }
            pairArr[2] = new Pair("search_session_id", ecSearchSessionId);
            pairArr[3] = new Pair("last_from_group_id", ((C0PM7) C0Q3E.LJFF().uF().LIZJ()).LLILLL);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (!C1205904nh.LIZ()) {
                mapLJIIJ.put("ec_has_search_container", "1");
                mapLJIIJ.put("search_jump_in_num", CardStruct.IStatusCode.DEFAULT);
            }
            c1766870w4z.getClass();
            C1766870w4z.LJ(true, listSingletonList, mapLJIIJ);
        }
        C673320Qb4.LJIIIIZZ();
    }

    public final void MR(C0QUT c0qut, C0QUT c0qut2) {
        Iterator<C0QPH> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            it2.next().q8(c0qut, c0qut2, null);
        }
    }

    public final void NR(C0QUT c0qut, C0QUT c0qut2) {
        Iterator<C0QPH> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            it2.next().pc(c0qut, c0qut2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        C669560QOc c669560QOc;
        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility;
        super.onViewCreated(view, bundle);
        C673320Qb4.LIZ.getClass();
        C673320Qb4.LJIIJJI();
        C673940Qc4.LJIIJJI(EnumC673970Qc7.SEARCH);
        C674330Qch c674330Qch = (C674330Qch) view.findViewById(R.id.ac_);
        if (c674330Qch != null) {
            c674330Qch.setTouchHandle(new AwS589S0100000_10(this, 12));
        }
        View viewFindViewById = null;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this.LLJJ, IEcSearchPageStateObserveAbility.class, null, null);
        if (getActivity() != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG activity = getActivity();
            sAFHelper.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(this, activity);
            if (interfaceC665370Q7zLJJIJLIJ != null) {
                C1558520qew.LJII(interfaceC665370Q7zLJJIJLIJ, (InterfaceC494301wD) this.LLJILJILJ.getValue(), ISearchSuggestContextAbilityNew.class, null, null);
            }
            C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 16), 3);
            if (interfaceC665370Q7zLJJIJLIJ != null && (iSearchSuggestSubPageAbility = (ISearchSuggestSubPageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJJIJLIJ, ISearchSuggestSubPageAbility.class, null)) != null) {
                ((ArrayList) this.LLJJI).add(iSearchSuggestSubPageAbility);
            } else {
                iSearchSuggestSubPageAbility = null;
            }
            this.LLILZ = iSearchSuggestSubPageAbility;
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), (InterfaceC494301wD) this.LLJILLL.getValue(), ISearchSugContextAbility.class, null, null);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 14), 3);
        ISearchSugSubPageAbility iSearchSugSubPageAbility = (ISearchSugSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchSugSubPageAbility.class, null);
        if (iSearchSugSubPageAbility != null) {
            ((ArrayList) this.LLJJI).add(iSearchSugSubPageAbility);
        } else {
            iSearchSugSubPageAbility = null;
        }
        this.LLILZIL = iSearchSugSubPageAbility;
        C650960Pg6 c650960Pg6OR = OR();
        if (c650960Pg6OR != null && (c669560QOc = c650960Pg6OR.searchEcommerceModel) != null && c669560QOc.enableShowCoin) {
            C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 15), 3);
        }
        if (C672250QYl.LIZIZ(C640270P9l.LIZJ(this, getActivity()))) {
            C723850SaN.LIZ(this, false, null, new AwS589S0100000_10(this, 7), 3);
        }
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.ac9);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById2;
        }
        C786410Ut5.LJZ(0, (FrameLayout) viewFindViewById2);
        View view3 = this.LLILLL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.ac8);
            }
            this.LLILLL = (FrameLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.LJZ(0, (FrameLayout) view3);
        PR();
        C673320Qb4.LJIIJ();
    }

    @Override // X.InterfaceC671770QWp
    public final void ov(String str, boolean z) {
        if (!z) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.updateBtmPage(this, str);
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(this, null, c0psl);
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS102S0100000_2(this, 2));
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bqv, viewGroup, false);
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
