package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment;

import X.C098200Yq;
import X.C0P9B;
import X.C0PDC;
import X.C0PRC;
import X.C0PRI;
import X.C0PSD;
import X.C0PSL;
import X.C0Q3E;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1390410mHn;
import X.C1393800mNG;
import X.C13BV;
import X.C13LQ;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1826520xdC;
import X.C189200o6;
import X.C18IO;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C20600815jK;
import X.C2200821BBo;
import X.C293000Be6;
import X.C622840Obq;
import X.C640350P9t;
import X.C640440PAc;
import X.C646870PYv;
import X.C649670Pe1;
import X.C649980PeW;
import X.C689740R3s;
import X.C716800S9u;
import X.C786410Ut5;
import X.EnumC622850Obr;
import X.EnumC669620QOi;
import X.InterfaceC1891350zJl;
import X.InterfaceC636730OyF;
import X.InterfaceC650190Per;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicPlaceRequestParamsVM;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.model.SearchPlaceSubTabItem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlaceContainerFragment extends SearchVisibilityDetectFragment implements InterfaceC650190Per {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPyohPCwvKCHELIOSMgLSQ+Kid9OColPS4xZiM+KCg+LSs4Zxw2KTcvIR8/KSYpCiA9PCQlJyohDjctLiI2JjE=";
    public SearchResultParam LLJI;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public C716800S9u LLJJ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJI;
    public C1826520xdC LLJJIII;
    public C1390410mHn LLJJIJI;
    public View LLJJIJIIJIL;
    public int LLJJJ;
    public C689740R3s LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public C646870PYv LLJ = new C646870PYv(null, 0, null, null, false, false, false, false, 0, null, null, null, null, 8191, null);
    public List<C649670Pe1> LLJIJIL = C13BV.INSTANCE;
    public boolean LLJJIJIL = true;

    public final void LJIIL() {
        this.LLJJIJIL = false;
        C1390410mHn c1390410mHn = this.LLJJIJI;
        if (c1390410mHn != null && c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object SR(View view, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void UR(int i) {
    }

    public final SearchPlaceSubTabFragment bS() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJI;
        return cS(viewOnAttachStateChangeListenerC20631115oD != null ? viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        C1826520xdC c1826520xdC = this.LLJJIII;
        if (c1826520xdC != null) {
            c1826520xdC.setOnSelectedChangeListener(null);
        }
        this.LLJJIII = null;
        C689740R3s c689740R3s = this.LLJJJIL;
        if (c689740R3s != null && (viewOnAttachStateChangeListenerC20631115oD = this.LLJJI) != null) {
            viewOnAttachStateChangeListenerC20631115oD.unregisterOnPageChangeCallback(c689740R3s);
        }
        this.LLJJJIL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        LJIIL();
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object MR() {
        SearchPlaceSubTabFragment searchPlaceSubTabFragmentBS = bS();
        if (searchPlaceSubTabFragmentBS != null) {
            return searchPlaceSubTabFragmentBS.LLJJJJ.getValue();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int OR() {
        return this.LLJJL;
    }

    public static ViewGroup aS(C1826520xdC c1826520xdC) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View childAt = c1826520xdC.getChildAt(0);
        if (!(childAt instanceof ViewGroup) || (viewGroup = (ViewGroup) childAt) == null) {
            return null;
        }
        View childAt2 = viewGroup.getChildAt(0);
        if (!(childAt2 instanceof ViewGroup) || (viewGroup2 = (ViewGroup) childAt2) == null) {
            return null;
        }
        View childAt3 = viewGroup2.getChildAt(1);
        if (!(childAt3 instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) childAt3;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final String RR(int i) {
        return EnumC669620QOi.PLACE.getTabName();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void VR(int i) {
        this.LLJJL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void WR(SearchResultParam searchResultParam) {
        this.LLJI = searchResultParam;
        this.LLJILLL = false;
        C716800S9u c716800S9u = this.LLJJ;
        if (c716800S9u != null) {
            c716800S9u.scrollTo(0, 0);
        }
        SearchPlaceSubTabFragment searchPlaceSubTabFragmentBS = bS();
        if (searchPlaceSubTabFragmentBS != null) {
            searchPlaceSubTabFragmentBS.WR(searchResultParam);
            AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(searchPlaceSubTabFragmentBS, searchResultParam, 69);
            int size = this.LLJIJIL.size();
            for (int i = 0; i < size; i++) {
                SearchPlaceSubTabFragment searchPlaceSubTabFragmentCS = cS(i);
                if (searchPlaceSubTabFragmentCS != null) {
                    awS376S0200000_10.invoke(searchPlaceSubTabFragmentCS);
                }
            }
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            C786410Ut5.LJJIZ(arguments, "search_key", searchResultParam);
        }
    }

    public final SearchPlaceSubTabFragment cS(int i) {
        Fragment fragmentLIZIZ;
        InterfaceC636730OyF fragmentItemOperator;
        if (i < 0 || i >= this.LLJIJIL.size()) {
            return null;
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (fragmentItemOperator = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator()) != null) {
            fragmentLIZIZ = fragmentItemOperator.LIZIZ(i);
        } else {
            fragmentLIZIZ = null;
        }
        if (!(fragmentLIZIZ instanceof SearchPlaceSubTabFragment)) {
            return null;
        }
        return (SearchPlaceSubTabFragment) fragmentLIZIZ;
    }

    public final void dS(SearchPlaceSubTabFragment searchPlaceSubTabFragment) {
        boolean z;
        Object c098200Yq;
        String strSS = searchPlaceSubTabFragment.sS();
        if (this.LLJIJIL.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z) {
            strSS = null;
        }
        String str = "";
        if (strSS == null) {
            strSS = "";
        }
        try {
            c098200Yq = (C0PRC) C0Q3E.LIZIZ(searchPlaceSubTabFragment).Ph1().LIZJ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C0PRC c0prc = (C0PRC) c098200Yq;
        if (c0prc == null) {
            return;
        }
        Iterator it2 = C13LQ.LJIIJJI(new String[]{c0prc.LLLF, searchPlaceSubTabFragment.cS().searchType, this.LLJ.searchType}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next).length() > 0) {
                obj = next;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            str = str2;
        }
        C0Q3E.LIZIZ(this).fe(new C0P9B(strSS));
        C0Q3E.LIZIZ(this).fe(new C0PDC(c0prc.LLJLL));
        C0Q3E.LIZIZ(this).fe(new C640440PAc(c0prc.LLLFZ));
        if (c0prc.LLILLL.length() > 0) {
            C0Q3E.LIZIZ(this).fe(new C0PRI(c0prc.LLIZLLLIL, c0prc.LLILLL, null, null, null, null, 0, str, false, 380));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C646870PYv c646870PYv;
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("search_tab_config");
                SearchResultParam searchResultParam = null;
                if (!(serializable instanceof C646870PYv) || (c646870PYv = (C646870PYv) serializable) == null) {
                    c646870PYv = new C646870PYv(null, 0, null, null, false, false, false, false, 0, null, null, null, null, 8191, null);
                }
                this.LLJ = c646870PYv;
                Serializable serializable2 = arguments.getSerializable("search_key");
                if (serializable2 instanceof SearchResultParam) {
                    searchResultParam = (SearchResultParam) serializable2;
                }
                this.LLJI = searchResultParam;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLJ.btm.length() > 0) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            boolean z = false;
            btmSDK.registerBtmPageOnCreate(new C18IO((Fragment) this, this.LLJ.btm, z, z, true, (String) null, 108));
            try {
                String pageId = btmSDK.getPageId(PageFinder.via((Fragment) this));
                ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
                if (pageId == null) {
                    pageId = "";
                }
                iSearchContextAbilityLIZIZ.fe(new C640350P9t(pageId));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/verticalsearch/poitab/fragment/SearchPlaceContainerFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOW7Ie4CdaIjDxBi4MOWtMfcYWHKtq2qtfVcw6wXagbBlakd3TbTRcY/H4A3gNZZ2eidLHYOd/7f0+t7o=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            C1393800mNG.LIZ(this, c0psl);
        }
        SearchPlaceSubTabFragment searchPlaceSubTabFragmentBS = bS();
        if (z) {
            if (searchPlaceSubTabFragmentBS != null) {
                DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(searchPlaceSubTabFragmentBS, getActivity());
                if (dynamicPlaceRequestParamsVMLIZ != null && dynamicPlaceRequestParamsVMLIZ.LLILZIL) {
                    C0Q3E.LIZIZ(searchPlaceSubTabFragmentBS).fe(new C0PSD(true));
                }
                searchPlaceSubTabFragmentBS.setUserVisibleHint(z);
            }
        } else if (searchPlaceSubTabFragmentBS != null) {
            searchPlaceSubTabFragmentBS.setUserVisibleHint(z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SearchPlaceContainerFragment.class);
        }
    }

    public static void hS(C1826520xdC c1826520xdC, int i) {
        boolean z;
        ViewGroup viewGroupAS = aS(c1826520xdC);
        if (viewGroupAS == null) {
            return;
        }
        int childCount = viewGroupAS.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroupAS.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJ = (C716800S9u) view.findViewById(R.id.qk0);
        this.LLJJIII = (C1826520xdC) view.findViewById(R.id.qku);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.qkv);
        viewOnAttachStateChangeListenerC20631115oD.setUserInputEnabled(false);
        this.LLJJI = viewOnAttachStateChangeListenerC20631115oD;
        this.LLJJIJI = (C1390410mHn) view.findViewById(R.id.qko);
        this.LLJJIJIIJIL = view.findViewById(R.id.qkn);
        C1390410mHn c1390410mHn = this.LLJJIJI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            List<C649670Pe1> listLJIIJJI = C1697810uHb.LJIIJJI(new C649670Pe1("all", "", C293000Be6.LIZIZ("all"), null), new C649670Pe1("deals", "", C293000Be6.LIZIZ("deals"), null));
            this.LLJIJIL = listLJIIJJI;
            InterfaceC636730OyF fragmentItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getFragmentItemOperator();
            C622840Obq c622840Obq = new C622840Obq();
            c622840Obq.LIZ = 1;
            c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
            fragmentItemOperator.LIZLLL(c622840Obq);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD2.getFragmentItemOperator().getState();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
            for (C649670Pe1 c649670Pe1 : listLJIIJJI) {
                arrayList.add(new SearchPlaceSubTabItem(c649670Pe1.tabKey, c649670Pe1.tabTitle, c649670Pe1.pageSchema));
            }
            state.LIZLLL(arrayList, null);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
            C689740R3s c689740R3s = new C689740R3s(this, 0);
            viewOnAttachStateChangeListenerC20631115oD3.registerOnPageChangeCallback(c689740R3s);
            this.LLJJJIL = c689740R3s;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f2f, viewGroup, false);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean gS(com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceSubTabFragment r18, com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse r19, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r20, java.util.Map<java.lang.String, ? extends java.lang.Object> r21) {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceContainerFragment.gS(com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceSubTabFragment, com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, java.util.Map):boolean");
    }
}
