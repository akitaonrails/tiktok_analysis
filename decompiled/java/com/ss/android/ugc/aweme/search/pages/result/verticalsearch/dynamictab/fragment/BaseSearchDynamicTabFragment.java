package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment;

import X.C01GW;
import X.C036E;
import X.C07H0;
import X.C098200Yq;
import X.C0BQU;
import X.C0CSC;
import X.C0H62;
import X.C0P9L;
import X.C0P9O;
import X.C0PD7;
import X.C0PDC;
import X.C0PO5;
import X.C0PR8;
import X.C0PRC;
import X.C0PS4;
import X.C0PSD;
import X.C0PSG;
import X.C0PSJ;
import X.C0PSL;
import X.C0PSP;
import X.C0PYW;
import X.C0PYX;
import X.C0PZ2;
import X.C0PZI;
import X.C0Q3E;
import X.C0Q94;
import X.C0QER;
import X.C0QSJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1393800mNG;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C18IO;
import X.C1935507i5;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C326370Cqp;
import X.C452501pT;
import X.C614900O9w;
import X.C640350P9t;
import X.C640870PBt;
import X.C640880PBu;
import X.C641110PCr;
import X.C644060POa;
import X.C644490PPr;
import X.C644910PRh;
import X.C646000PVm;
import X.C646670PYb;
import X.C646680PYc;
import X.C646730PYh;
import X.C646760PYk;
import X.C646790PYn;
import X.C646810PYp;
import X.C646830PYr;
import X.C646840PYs;
import X.C646870PYv;
import X.C647010PZj;
import X.C647030PZl;
import X.C647120PZu;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C653440Pk6;
import X.C660870Pw5;
import X.C664030Q2v;
import X.C664290Q3v;
import X.C664410Q4h;
import X.C665420Q8e;
import X.C669480QNu;
import X.C673150Qan;
import X.C679340Qkm;
import X.C686820Qwq;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC642100PGm;
import X.EnumC654460Plk;
import X.EnumC664420Q4i;
import X.InterfaceC1146704e9;
import X.InterfaceC644520PPu;
import X.InterfaceC646750PYj;
import X.InterfaceC649890PeN;
import X.InterfaceC650190Per;
import X.InterfaceC687730QyJ;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.core.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.ability.ISearchPageStatusAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicContentAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicMusicAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicSurveyAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicVideoAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.livetab.ability.ISearchDynamicLiveAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseSearchDynamicTabFragment<D> extends SearchVisibilityDetectFragment implements InterfaceC650190Per, ISearchDynamicPageAbility, InterfaceC644520PPu, C0QSJ, InterfaceC1146704e9 {
    public C665420Q8e LLJ;
    public SearchResultParam LLJIJIL;
    public int LLJILJIL;
    public SearchStateViewModel LLJJI;
    public SearchStartViewModel LLJJIII;
    public SearchEnterViewModel LLJJIJI;
    public C646870PYv LLJI = new C646870PYv(null, 0, null, null, false, false, false, false, 0, null, null, null, null, 8191, null);
    public String LLJILJILJ = "";
    public boolean LLJILLL = true;
    public C646830PYr LLJJ = new C646830PYr(C036E.LIZ.LIZIZ(), C686820Qwq.LIZ());
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10((BaseSearchDynamicTabFragment) this, 811));
    public final C646810PYp LLJJIJIL = new C0H62(this) { // from class: X.0PYp
        public final /* synthetic */ BaseSearchDynamicTabFragment<D> LL;

        {
            this.LL = this;
        }

        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            if (C0N7C.LIZ[c0o0l2.ordinal()] == 1) {
                if (c0o0l != C0O0L.AVAILABLE) {
                    C1524805y2.LIZIZ(0L, new AwS554S0100000_10((BaseSearchDynamicTabFragment) this.LL, StrategyCenter.ENABLE_SMART_SERVICE));
                    return;
                }
                return;
            }
            C1524805y2.LIZIZ(0L, new AwS554S0100000_10((BaseSearchDynamicTabFragment) this.LL, 809));
        }
    };
    public final C646840PYs LLJJJ = new C0CSC(this) { // from class: X.0PYs
        public final /* synthetic */ BaseSearchDynamicTabFragment<D> LIZ;

        {
            this.LIZ = this;
        }

        @Override // X.C0CSC
        public final void LIZ(EnumC325100Com enumC325100Com) {
            C1524805y2.LIZIZ(0L, new AwS411S0200000_10((BaseSearchDynamicTabFragment) this.LIZ, enumC325100Com, (EnumC325100Com) 52));
        }
    };
    public final ARunnableS110S0100000_10 LLJJJIL = new ARunnableS110S0100000_10(this, 83);
    public final C01GW LLJJJJ = C1935507i5.LIZ(new AwS554S0100000_10((BaseSearchDynamicTabFragment) this, 810));
    public final String LLJJJJJIL = ((C646670PYb) C0Q3E.LIZIZ(this).Jh0().LIZJ()).LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object SR(View view, String str) {
        return null;
    }

    public abstract AbstractSearchDynamicTabViewModel<D> bS();

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchFragmentScope.class);
        return arrayList;
    }

    public Map<String, String> hS() {
        return null;
    }

    public String iS() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC644520PPu
    public final boolean sq(String str) {
        return false;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object MR() {
        return this.LLJJJJ.getValue();
    }

    public final C646870PYv cS() {
        C646870PYv c646870PYv;
        if (this.LLJI.searchType.length() == 0) {
            try {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    Serializable serializable = arguments.getSerializable("search_tab_config");
                    if ((serializable instanceof C646870PYv) && (c646870PYv = (C646870PYv) serializable) != null) {
                        this.LLJI = c646870PYv;
                        C0Q3E.LIZIZ(this).fe(new C646790PYn(c646870PYv.curTabIndex));
                        C0Q3E.LIZIZ(this).fe(new C0PZ2(c646870PYv.shouldShowCenterLoadingView));
                    }
                    if (this.LLJI.searchType.length() == 0) {
                        C664410Q4h.LIZIZ(EnumC654460Plk.COMMON, EnumC664420Q4i.TAB_MANAGE, null, "onError searchType is empty in BaseSearchDynamicTabFragment getSearchTabItem ", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility
    public final C0Q94 ju2() {
        return (C0Q94) this.LLJJJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C036E.LIZ.LIZLLL(this.LLJJIJIL);
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).removeNetworkChangeObserver(this.LLJJJ);
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJJJIL);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility
    public final DynamicPatch zc0() {
        C664030Q2v c664030Q2v;
        C01GW<C669480QNu> c01gw = C669480QNu.LJ;
        String strLIZJ = C326370Cqp.LIZ().LIZJ();
        String str = ((C646670PYb) C0Q3E.LIZIZ(this).Jh0().LIZJ()).LLILZIL;
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(cS().pageSchema).buildUpon();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("keyword", str).appendQueryParameter("search_context", strLIZJ).appendQueryParameter("search_source", this.LLJILJILJ);
            C650950Pg5.Companion.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
            builderAppendQueryParameter.appendQueryParameter("lastFromGroupId", (c650960Pg6LJII == null || (c664030Q2v = c650960Pg6LJII.searchVideoModel) == null) ? null : c664030Q2v.groupId).appendQueryParameter("target_handler", "search_vertical").appendQueryParameter("enable_extra_info", "1");
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = builderBuildUpon.toString();
            return dynamicPatch;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            C660870Pw5.LIZJ(view);
        }
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
        this.LLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility
    public final SearchResultParam I() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int OR() {
        return this.LLJILJIL;
    }

    public String aS() {
        return this.LLJJJJJIL;
    }

    private final void gS(SearchResultParam searchResultParam) {
        boolean z;
        String enterMethod;
        this.LLJIJIL = searchResultParam;
        ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
        String keyword = searchResultParam.getKeyword();
        String sugHint = searchResultParam.getSugHint();
        if (sugHint == null) {
            sugHint = "";
        }
        iSearchContextAbilityLIZIZ.fe(new C646680PYc(keyword, sugHint, searchResultParam.getSearchFrom(), searchResultParam.getNeedCorrect()));
        String enterMethod2 = searchResultParam.getEnterMethod();
        if (enterMethod2 != null && enterMethod2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            enterMethod = "channel_unknown";
        } else {
            enterMethod = searchResultParam.getEnterMethod();
        }
        setEnterMethod(enterMethod);
        if (Intrinsics.LJFF(this.LLJILJILJ, "channel_unknown")) {
            this.LLILZIL.setRecentRequestSearchSourceUnknown(true);
            C0Q3E.LIZIZ(this).fe(new C0P9L());
        }
        C19EG activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchResultViewModel.class)).LL.postValue(searchResultParam);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final String RR(int i) {
        return cS().searchType;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void UR(int i) {
        C0Q3E.LIZIZ(this).fe(new C646790PYn(i));
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void VR(int i) {
        this.LLJILJIL = i;
        this.LLILZIL.setTabIndex(i);
        this.LLILZIL.setSearchPosition(RR(i));
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void WR(SearchResultParam searchResultParam) {
        SearchStateViewModel searchStateViewModel;
        HashSet<Integer> hashSet;
        String str = ((C0PRC) C0Q3E.LIZIZ(this).Ph1().LIZJ()).LLJ;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, searchResultParam.getKeyword())) {
            int iLIZ = C0BQU.LIZ();
            if (iLIZ != 1) {
                if (iLIZ == 2 && cS().searchTabPlayConfig.hasVideoPlay && cS().searchTabPlayConfig.isLiveSource() && (searchStateViewModel = this.LLJJI) != null && (hashSet = searchStateViewModel.queryWordChangeInProcess) != null) {
                    hashSet.add(2);
                }
            } else {
                this.LLILLJJLI = true;
            }
        }
        ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
        String keyword = searchResultParam.getKeyword();
        String str2 = "";
        if (keyword == null) {
            keyword = "";
        }
        iSearchContextAbilityLIZIZ.fe(new C0P9O(keyword));
        ISearchContextAbility iSearchContextAbilityLIZIZ2 = C0Q3E.LIZIZ(this);
        String keyword2 = searchResultParam.getKeyword();
        if (keyword2 != null) {
            str2 = keyword2;
        }
        iSearchContextAbilityLIZIZ2.fe(new C640880PBu(str2));
        C0Q3E.LIZIZ(this).fe(new C0PSD(true));
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                C786410Ut5.LJJIZ(arguments, "search_key", searchResultParam);
                return;
            }
            return;
        }
        gS(searchResultParam);
        Context context = getContext();
        if (context != null) {
            C641110PCr.LIZIZ(context, this, searchResultParam);
        }
        nS(false);
    }

    public final void dS(boolean z) {
        this.LLILZIL.setFragmentVisible(z);
        C0Q3E.LIZIZ(this).fe(new C0PD7(z));
        if (z) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Boolean bool = Boolean.TRUE;
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(this, bool, c0psl);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility
    public final void fa2(boolean z) {
        this.LLILLL = z;
    }

    public void mS(SearchRequestParam searchRequestParam) {
        if (searchRequestParam != null) {
            bS().vQ2(searchRequestParam);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS(boolean r7) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment.nS(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity = getActivity();
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(this, activity);
        if (c650950Pg5LJIIIZ == null) {
            return;
        }
        C0PSJ mutableData = c650950Pg5LJIIIZ.getMutableData();
        C650950Pg5 c650950Pg5Copy = c650950Pg5LJIIIZ.copy(c650950Pg5LJIIIZ.LL, mutableData.copy(this.LLILZIL, mutableData.globalData));
        c646000PVm.getClass();
        C646000PVm.LIZ(this, c650950Pg5Copy);
        ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
        int i = this.LLJILJIL;
        iSearchContextAbilityLIZIZ.fe(new C0PR8(i, RR(i)));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) throws JSONException {
        C646760PYk c646760PYk = new C646760PYk(c614900O9w.LIZIZ, c614900O9w.LIZ);
        C0PZI c0pziRw2 = null;
        ISearchDynamicContentAbility iSearchDynamicContentAbility = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicContentAbility.class, null);
        if (iSearchDynamicContentAbility != null) {
            c0pziRw2 = iSearchDynamicContentAbility.rw2();
        }
        c646760PYk.LIZ(c0pziRw2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C646870PYv c646870PYv;
        MutableLiveData<Integer> mutableLiveData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            try {
                Serializable serializable = arguments.getSerializable("search_tab_config");
                if ((serializable instanceof C646870PYv) && (c646870PYv = (C646870PYv) serializable) != null) {
                    this.LLJI = c646870PYv;
                }
                C0Q3E.LIZIZ(this).fe(new C646790PYn(cS().curTabIndex));
                C0Q3E.LIZIZ(this).fe(new C0PZ2(cS().shouldShowCenterLoadingView));
                gS((SearchResultParam) arguments.getSerializable("search_key"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        boolean z = false;
        if (cS().btm.length() > 0) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.registerBtmPageOnCreate(new C18IO((Fragment) this, cS().btm, z, z, true, str, 108));
            String pageId = btmSDK.getPageId(PageFinder.via((Fragment) this));
            ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
            if (pageId == null) {
                pageId = "";
            }
            iSearchContextAbilityLIZIZ.fe(new C640350P9t(pageId));
        }
        SearchStateViewModel searchStateViewModel = this.LLJJI;
        if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.searchState) != null) {
            mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 2));
        }
        if (this.LLILZ == null) {
            ((C0Q94) this.LLJJJJ.getValue()).LIZJ();
        }
        this.LLIZLLLIL.add(new InterfaceC646750PYj(this) { // from class: X.0PYe
            public final /* synthetic */ BaseSearchDynamicTabFragment<Object> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC646750PYj
            public final void LIZ(boolean z2) {
                BaseSearchDynamicTabFragment<Object> baseSearchDynamicTabFragment = this.LIZ;
                if (baseSearchDynamicTabFragment.LLJILLL) {
                    baseSearchDynamicTabFragment.dS(z2);
                }
            }
        });
        C036E.LIZ.LIZ(this.LLJJIJIL);
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(this.LLJJJ);
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10((BaseSearchDynamicTabFragment) this, 335), 3);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void recordViewDrawEnd(C0PYX c0pyx) {
        String str;
        C644910PRh c644910PRhLJII;
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ == null || (c644910PRhLJII = interfaceC649890PeNLIZ.LJII(this.LLJILJIL)) == null || (str = c644910PRhLJII.LIZ) == null) {
            str = "";
        }
        C644060POa c644060POa = C644060POa.LIZ;
        SearchResultParam searchResultParam = this.LLJIJIL;
        c644060POa.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParam);
        c0po5LJII.LJIL(c0pyx.LIZLLL);
        Intrinsics.LJFF(c0po5LJII, C640870PBt.LIZ);
        c0po5LJII.LIZIZ(c0pyx.LIZJ);
        c0po5LJII.LJII(str);
        c0po5LJII.LJI = c0pyx.LIZ;
        c0po5LJII.LIZLLL = c0pyx.LJ;
        c0po5LJII.LJJJLZIJ = true;
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS110S0100000_10(c0po5LJII, 84));
        }
    }

    public final void setEnterMethod(String str) {
        this.LLJILJILJ = str;
        this.LLILZIL.setEnterMethod(str);
        C0Q3E.LIZIZ(this).fe(new C0PDC(str));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/verticalsearch/dynamictab/fragment/BaseSearchDynamicTabFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOW7Ie4CdaIjDxBi4MOWtMadARCYkwow00OjxgLFhuehEO+vc6W+MiymEZZu5Iw2wt1coIzdQJDx9oUZo8XLEG", null)));
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
        nS(true);
        if (z) {
            C650950Pg5.Companion.getClass();
            C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, this);
            if (c0ps4LJFF != null) {
                c0ps4LJFF.setSearchLastShowPageIndex(this.LLJILJIL);
            }
            C0Q3E.LIZIZ(this).fe(new C0PSP(this.LLJILJIL));
            C653440Pk6.LIZLLL = false;
            C653440Pk6.LJIIIIZZ = false;
            SearchResultParam searchResultParam = this.LLJIJIL;
            if (searchResultParam != null) {
                searchResultParam.setIndex(this.LLJILJIL);
            }
        } else {
            ISearchDynamicMusicAbility iSearchDynamicMusicAbility = (ISearchDynamicMusicAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicMusicAbility.class, null);
            if (iSearchDynamicMusicAbility != null) {
                iSearchDynamicMusicAbility.x40();
            }
        }
        ISearchDynamicVideoAbility iSearchDynamicVideoAbility = (ISearchDynamicVideoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicVideoAbility.class, null);
        if (iSearchDynamicVideoAbility != null) {
            iSearchDynamicVideoAbility.setUserVisibleHint(z);
        }
    }

    @Override // X.InterfaceC644520PPu
    public final void x(String str) {
        ISearchDynamicLiveAbility iSearchDynamicLiveAbility = (ISearchDynamicLiveAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicLiveAbility.class, null);
        if (iSearchDynamicLiveAbility != null) {
            iSearchDynamicLiveAbility.x(str);
        }
    }

    public void kS(int i, C0PSG c0psg) {
        String strSb1;
        SearchRequestParam searchRequestParamZX1;
        ISearchPageStatusAbility iSearchPageStatusAbility;
        C0QER c0qer;
        C0PSG filterOption;
        C0PYW.LIZJ++;
        int i2 = ((C646670PYb) C0Q3E.LIZIZ(this).Jh0().LIZJ()).LL;
        if (i2 >= 0) {
            C0PYW.LJI.put(i2, Long.valueOf(System.currentTimeMillis()));
        }
        if (c0psg == null) {
            this.LLILZ = null;
            ((C0Q94) this.LLJJJJ.getValue()).LIZJ();
        }
        SearchResultParam searchResultParam = this.LLJIJIL;
        if (searchResultParam != null && searchResultParam.getIsFilterFromSchema()) {
            SearchResultParam searchResultParam2 = this.LLJIJIL;
            if (searchResultParam2 != null) {
                filterOption = searchResultParam2.getFilterOption();
            } else {
                filterOption = null;
            }
            this.LLILZ = filterOption;
            if (filterOption != null) {
                filterOption.setFromSchema(true);
            }
            SearchResultParam searchResultParam3 = this.LLJIJIL;
            if (searchResultParam3 != null) {
                searchResultParam3.setIsFilterFromSchema(false);
            }
        }
        SearchResultParam searchResultParam4 = this.LLJIJIL;
        if (searchResultParam4 != null) {
            searchResultParam4.setFilterOption(c0psg);
        }
        SearchStateViewModel searchStateViewModel = this.LLJJI;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
        }
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicParamsHandleAbility.class, null);
        if (iSearchDynamicParamsHandleAbility == null || (strSb1 = iSearchDynamicParamsHandleAbility.sb1()) == null) {
            strSb1 = "";
        }
        setEnterMethod(strSb1);
        C644490PPr.LIZ.getClass();
        C644490PPr.LIZIZ = C644490PPr.LIZJ;
        ISearchDynamicContentAbility iSearchDynamicContentAbility = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicContentAbility.class, null);
        if (iSearchDynamicContentAbility != null) {
            SearchEnterViewModel searchEnterViewModel = this.LLJJIJI;
            if (searchEnterViewModel != null) {
                c0qer = searchEnterViewModel.LL;
            } else {
                c0qer = null;
            }
            iSearchDynamicContentAbility.mI1(c0qer);
        }
        if (cS().isNativeFirstRequest()) {
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam5 = this.LLJIJIL;
            c644060POa.getClass();
            C644060POa.LJII(searchResultParam5).LJIILJJIL();
        }
        C0PYW.LIZ = false;
        ISearchDynamicSurveyAbility iSearchDynamicSurveyAbility = (ISearchDynamicSurveyAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicSurveyAbility.class, null);
        if (iSearchDynamicSurveyAbility != null) {
            iSearchDynamicSurveyAbility.vz2();
        }
        C0Q3E.LIZIZ(this).fe(new C647120PZu(true, 0L));
        C0Q3E.LIZIZ(this).fe(new C647010PZj(""));
        C0Q3E.LIZIZ(this).fe(new C647030PZl(-1));
        SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = (SearchNetworkStandardStatusVM) this.LLJJIJIIJIL.getValue();
        if (searchNetworkStandardStatusVM != null) {
            searchNetworkStandardStatusVM.LL = EnumC642100PGm.NORMAL;
        }
        C0Q3E.LIZIZ(this).fe(new C646730PYh(i, c0psg));
        if (cS().isNativeFirstRequest()) {
            getActivity();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    ISearchPageStatusAbility iSearchPageStatusAbility2 = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageStatusAbility.class, null);
                    if (iSearchPageStatusAbility2 != null) {
                        iSearchPageStatusAbility2.bG1();
                    }
                    ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility2 = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicParamsHandleAbility.class, null);
                    if (iSearchDynamicParamsHandleAbility2 != null) {
                        searchRequestParamZX1 = iSearchDynamicParamsHandleAbility2.ZX1(this, c0psg, aS(), true, cS().searchChannel);
                    } else {
                        searchRequestParamZX1 = null;
                    }
                    mS(searchRequestParamZX1);
                    if (c0psg != null && (iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageStatusAbility.class, null)) != null) {
                        iSearchPageStatusAbility.bG1();
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ISearchDynamicContentAbility iSearchDynamicContentAbility2 = (ISearchDynamicContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicContentAbility.class, null);
            if (iSearchDynamicContentAbility2 != null) {
                iSearchDynamicContentAbility2.mG0(c0psg, this.LLJJJIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String strSb1;
        ISearchPageStatusAbility iSearchPageStatusAbility;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJJI = (SearchStateViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStateViewModel.class);
            this.LLJJIII = (SearchStartViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStartViewModel.class);
            this.LLJJIJI = (SearchEnterViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchEnterViewModel.class);
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ISearchDynamicPageAbility.class, null, getViewLifecycleOwner());
        C723850SaN.LIZ(this, false, null, new AwS589S0100000_10((BaseSearchDynamicTabFragment) this, 336), 3);
        SearchResultParam searchResultParam = this.LLJIJIL;
        if (searchResultParam != null) {
            WR(searchResultParam);
        }
        EventBus.LIZLLL().LJIJJ(this);
        FeedbackHelper feedbackHelper = FeedbackHelper.LIZ;
        C19EG activity2 = getActivity();
        feedbackHelper.getClass();
        FeedbackHelper.LIZIZ(this, activity2);
        ISearchDynamicParamsHandleAbility iSearchDynamicParamsHandleAbility = (ISearchDynamicParamsHandleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicParamsHandleAbility.class, null);
        if (iSearchDynamicParamsHandleAbility == null || (strSb1 = iSearchDynamicParamsHandleAbility.sb1()) == null) {
            strSb1 = "";
        }
        setEnterMethod(strSb1);
        getActivity();
        try {
            if (C036E.LIZ.LIZIZ() && (iSearchPageStatusAbility = (ISearchPageStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchPageStatusAbility.class, null)) != null) {
                iSearchPageStatusAbility.bG1();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (!C07H0.LIZ()) {
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(getContext()), R.layout.ex3, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex3, viewGroup, false);
        }
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

    @Override // X.InterfaceC644520PPu
    public final void rq(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        ISearchDynamicLiveAbility iSearchDynamicLiveAbility = (ISearchDynamicLiveAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchDynamicLiveAbility.class, null);
        if (iSearchDynamicLiveAbility != null) {
            iSearchDynamicLiveAbility.rq(searchLiveList, list, z);
        }
    }
}
