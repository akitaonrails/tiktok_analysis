package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0GXJ;
import X.C0QER;
import X.C0QNA;
import X.C0QP4;
import X.C0QPB;
import X.C0QQZ;
import X.C0QSJ;
import X.C0QUT;
import X.C0QUU;
import X.C0QW1;
import X.C0QW6;
import X.C0QW7;
import X.C0QW9;
import X.C0QXB;
import X.C0QXL;
import X.C0QXR;
import X.C0QY3;
import X.C1018703yb;
import X.C123100dR;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LQ;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16BC;
import X.C1744700vVE;
import X.C1766560w4U;
import X.C1878350yyn;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C21655219p0;
import X.C2187451AjH;
import X.C2190441Ao6;
import X.C2217381BqS;
import X.C293710BfF;
import X.C299110Bnx;
import X.C315220CXg;
import X.C338490DOt;
import X.C343970De7;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C646000PVm;
import X.C646040PVq;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C669560QOc;
import X.C671610QVz;
import X.C672020QXo;
import X.C672890QaN;
import X.C673150Qan;
import X.C687700QyG;
import X.C703302op;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1740810vOx;
import X.EnumC671640QWc;
import X.InterfaceC1058150ddt;
import X.InterfaceC1146704e9;
import X.InterfaceC1740760vOs;
import X.InterfaceC1760590vur;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import Y.ARunnableS110S0100000_10;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ab.EcSearchBarAnimationConfig;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IECHalfSearchAbility;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcHalfSearchFragment extends ECBaseFragment implements InterfaceC1740760vOs, InterfaceC1058150ddt, C0QSJ, InterfaceC1146704e9 {
    public static final C0QW7 LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgLSQ+Kid9OCQrLGEWKw0tJSkALSQ+KicVOiQrJCo9PA==";
    public C0GXJ LLILLL;
    public TuxTextView LLILZ;
    public SmartImageView LLILZIL;
    public ConstraintLayout LLILZLL;
    public FrameLayout LLIZ;
    public C0QW9 LLIZLLLIL;
    public ISearchBarAbility LLJ;
    public ISearchResultSubPageAbility LLJI;
    public C672020QXo LLJIJIL;
    public C0QER LLJILJILJ;
    public SearchResultParam LLJILLL;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;
    public Map<String, ? extends Object> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C21655219p0 LLJLLIL;
    public C0QY3 LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 47));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 46));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0QW7] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcHalfSearchFragment.class, "searchCartVM", "getSearchCartVM()Lcom/ss/android/ugc/aweme/ecommerce/search/cart/vm/SearchCartVM;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = new Object() { // from class: X.0QW7
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ECSearchPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ECSearchPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ECSearchPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return dS(false);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public EcHalfSearchFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCartVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 178);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(46);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 40), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS554S0100000_10((Fragment) this, 41), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 43), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
        this.LLJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 42));
        this.LLJJL = -1;
        this.LLJL = true;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(231));
        this.LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 44));
        this.LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 45));
        this.LLJZIJLIL = C452501pT.LIZIZ(new C0QW6(this));
        this.LLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 50));
        this.LLLF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 49));
        this.LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 48));
        this.LLLFFI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 177));
    }

    public final C0QPB LLJILJIL() {
        return (C0QPB) this.LLJJ.getValue();
    }

    public final SmartImageView VR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.er6) : null;
            this.LLILZIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final FrameLayout WR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u9_) : null;
            this.LLIZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C0QUT Xw1() {
        String keyword;
        C0QER searchEnterParam;
        SearchResultParam searchResultParam = this.LLJILLL;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && searchEnterParam.getInitSugWord() != null) {
            return C0QUT.SUG;
        }
        SearchResultParam searchResultParam2 = this.LLJILLL;
        return (searchResultParam2 == null || (keyword = searchResultParam2.getKeyword()) == null || !C123100dR.LIZ(keyword)) ? C0QUT.SUGGEST : C0QUT.RESULT;
    }

    public final boolean ZR() {
        ECSearchEntranceData ecSearchEntranceData;
        C0QER c0qer = this.LLJILJILJ;
        if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null) {
            return false;
        }
        return Intrinsics.LJFF(ecSearchEntranceData.getBooleanOrNullStrategy("half_search_disable_mall_event"), Boolean.FALSE);
    }

    public final IPlayerDependencyService aS() {
        return (IPlayerDependencyService) this.LLJLILLLLZIIL.getValue();
    }

    public final ConstraintLayout bS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dvq) : null;
            this.LLILZLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final void dismiss() {
        ECSearchEntranceData ecSearchEntranceData;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
        ISearchBarAbility iSearchBarAbility = this.LLJ;
        if (iSearchBarAbility != null) {
            iSearchBarAbility.gw(EnumC671640QWc.CANCEL);
        }
        C0QER c0qer = this.LLJILJILJ;
        if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || !Intrinsics.LJFF(ecSearchEntranceData.getBooleanOrNullStrategy("enable_player_control"), Boolean.TRUE)) {
            return;
        }
        try {
            if (!aS().isVideoPlaying()) {
                aS().playingVideoResume();
                aS().playingVideoUnMute();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.HALF_SEARCH_LIVE_PAGE.getPageCode();
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        String enterMethod;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchResultParam searchResultParam = this.LLJILLL;
        if (searchResultParam != null && (enterMethod = searchResultParam.getEnterMethod()) != null) {
            linkedHashMap.put("search_source", enterMethod);
        }
        return linkedHashMap;
    }

    public final C650960Pg6 vv1() {
        return (C650960Pg6) this.LLJILJIL.getValue();
    }

    public final void hS() {
        try {
            if (aS().isVideoPlaying()) {
                aS().playingVideoPause();
                aS().playingVideoMute();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IEcUgPopupService iEcUgPopupService;
        super.onDestroy();
        if (ZR() && (iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null)) != null) {
            iEcUgPopupService.onPopupFragmentOnDestroy(getActivity(), this.LLJJIJI);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1554960qZC.LIZLLL(C1558360qeg.LJI(activity, null), C0QPB.class, "source_default_key");
        }
        C1554960qZC.LIZLLL(C1558360qeg.LJFF(this, null), C0QPB.class, "source_default_key");
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1554960qZC.LIZLLL(C1558360qeg.LJI(activity2, null), C672890QaN.class, "source_default_key");
        }
        C1554960qZC.LIZLLL(C1558360qeg.LJFF(this, null), C672890QaN.class, "source_default_key");
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            C1554960qZC.LIZLLL(C1558360qeg.LJI(activity3, null), C672020QXo.class, "source_default_key");
        }
        C1554960qZC.LIZLLL(C1558360qeg.LJFF(this, null), C672020QXo.class, "source_default_key");
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() throws JSONException {
        IPageSearchSubPageAbility iPageSearchSubPageAbility;
        Unit unit;
        super.onDetach();
        C0QUT c0qutZs2 = null;
        try {
            C1558520qew.LJIIJ(this, ECSearchPageScope.class, ISearchBarContextAbility.class, null);
            C19EG activity = getActivity();
            if (activity != null) {
                C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IECHalfSearchAbility.class, null);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C0QW9 c0qw9 = this.LLIZLLLIL;
        if (c0qw9 != null && (iPageSearchSubPageAbility = c0qw9.LLJILJIL) != null) {
            c0qutZs2 = iPageSearchSubPageAbility.Zs2();
        }
        String str = c0qutZs2 == C0QUT.RESULT ? "search_result" : "search_middle";
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_name", str);
        iEventCenter.LIZ("ec_shop_bag_suggestion_refresh", C786410Ut5.J3(jSONObject));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ECSearchEntranceData ecSearchEntranceData;
        ISearchBarAbility iSearchBarAbility;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EcHalfSearchFragment.class.getName());
        }
        super.onResume();
        C0QER c0qer = this.LLJILJILJ;
        if (EcSearchBarAnimationConfig.LIZ(c0qer != null ? Integer.valueOf(c0qer.getEcSearchEntranceValue()) : null) && (iSearchBarAbility = this.LLJ) != null) {
            iSearchBarAbility.fc(350L);
        }
        C0QER c0qer2 = this.LLJILJILJ;
        if (c0qer2 == null || (ecSearchEntranceData = c0qer2.getEcSearchEntranceData()) == null || !Intrinsics.LJFF(ecSearchEntranceData.getBooleanOrNullStrategy("enable_player_control"), Boolean.TRUE)) {
            return;
        }
        hS();
        FrameLayout frameLayoutWR = WR();
        if (frameLayoutWR != null) {
            HandlerHook.viewPost(frameLayoutWR, new ARunnableS110S0100000_10(this, 15));
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final void cS(SearchResultParam searchResultParam) {
        if (searchResultParam != null) {
            C0QXL.LIZ.getClass();
            if (C0QXL.LIZIZ) {
                C0QP4.LIZ.getClass();
                C0QP4.LIZ(searchResultParam);
                iS(searchResultParam);
            }
        }
    }

    public final boolean dS(boolean z) {
        Boolean boolValueOf;
        String str;
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        C669560QOc c669560QOc;
        C650960Pg6 c650960Pg6Vv1;
        C669560QOc c669560QOc2;
        String str2;
        C672020QXo c672020QXo = this.LLJIJIL;
        if (c672020QXo != null) {
            c672020QXo.LIZJ("swipe");
        }
        C0QW9 c0qw9 = this.LLIZLLLIL;
        if (c0qw9 != null) {
            boolValueOf = Boolean.valueOf(c0qw9.X6());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return true;
        }
        C650960Pg6 c650960Pg6Vv12 = vv1();
        if (c650960Pg6Vv12 != null && (c669560QOc = c650960Pg6Vv12.searchEcommerceModel) != null && c669560QOc.needBackToPage && C703302op.LIZ(c669560QOc.pageSchema) && (c650960Pg6Vv1 = vv1()) != null && (c669560QOc2 = c650960Pg6Vv1.searchEcommerceModel) != null && (str2 = c669560QOc2.pageSchema) != null) {
            SmartRouter.buildRoute(this, str2).open();
            return true;
        }
        if (z || (c0qer = this.LLJILJILJ) == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || ecSearchEntranceData.getBooleanStrategy("enable_swipe_right_to_close")) {
            if (z) {
                str = "close_button";
            } else {
                str = "back_press";
            }
            try {
                IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService != null) {
                    iEcomSearchService.LJJIL(null, this.LLJILLL, "close", new AwS61S1000000_10(str, 2));
                }
                dismiss();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return false;
            }
        }
        return false;
    }

    public final void iS(SearchResultParam searchResultParam) {
        ECSearchEntranceData ecSearchEntranceData;
        C0QER c0qer = this.LLJILJILJ;
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null) {
            ECSearchEntranceData.Companion.getClass();
            int iLIZ = C650500PfM.LIZ(ecSearchEntranceData);
            if (iLIZ == C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER.getValue() || iLIZ == C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue()) {
                return;
            }
        }
        C0QY3 c0qy3LJLIIL = C315220CXg.LIZ().LJLIIL(searchResultParam, true);
        if (!Intrinsics.LJFF(this.LLJLLL, c0qy3LJLIIL)) {
            C315220CXg.LIZ().LJLJJLL(VR(), c0qy3LJLIIL);
            this.LLJLLL = c0qy3LJLIIL;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        SearchResultParam searchResultParam;
        Serializable serializable2;
        C0QER c0qer;
        Serializable serializable3;
        boolean z;
        Map<String, ? extends Object> halfSearchForMallParams;
        int iIntValue;
        String enterMethod;
        int value;
        ECSearchEntranceData ecSearchEntranceData;
        Integer intOrNullStrategy;
        ECSearchEntranceData ecSearchEntranceData2;
        C0QER c0qer2;
        String routeUri;
        IEcUgPopupService iEcUgPopupService;
        String routeUri2;
        ECSearchEntranceData ecSearchEntranceData3;
        C650950Pg5 c650950Pg5;
        super.onCreate(bundle);
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("searchParam");
        } else {
            serializable = null;
        }
        if (serializable instanceof SearchResultParam) {
            searchResultParam = (SearchResultParam) serializable;
        } else {
            searchResultParam = null;
        }
        this.LLJILLL = searchResultParam;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("search_enter_param");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof C0QER) {
            c0qer = (C0QER) serializable2;
        } else {
            c0qer = null;
        }
        this.LLJILJILJ = c0qer;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            serializable3 = arguments3.getSerializable("search_context_source");
        } else {
            serializable3 = null;
        }
        if ((serializable3 instanceof C650950Pg5) && (c650950Pg5 = (C650950Pg5) serializable3) != null) {
            C646040PVq.LIZ(this, c650950Pg5, C650950Pg5.class);
            C650950Pg5.Companion.getClass();
            C646000PVm.LIZ(this, c650950Pg5);
        }
        Bundle arguments4 = getArguments();
        int i = 0;
        if (arguments4 != null) {
            z = arguments4.getBoolean("full_screen_directly", false);
        } else {
            z = false;
        }
        this.LLJLIL = z;
        C671610QVz.LIZ(C0QW1.CONTAINER_LAUNCH, null, new AwS589S0100000_10(this, 40));
        C0QPB c0qpb = C0QPB.LLILZLL;
        if (c0qpb == null) {
            C0QER c0qer3 = this.LLJILJILJ;
            if (c0qer3 != null) {
                c0qer3.getEcSearchEntranceValue();
            }
            C0QER c0qer4 = this.LLJILJILJ;
            if (c0qer4 != null) {
                ecSearchEntranceData3 = c0qer4.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData3 = null;
            }
            c0qpb = new C0QPB(ecSearchEntranceData3);
        }
        C672890QaN c672890QaN = new C672890QaN();
        C672020QXo c672020QXo = new C672020QXo();
        this.LLJIJIL = c672020QXo;
        C0QPB.LLILZLL = null;
        C19EG activity = getActivity();
        if (activity != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity, null), c0qpb, C0QPB.class, "source_default_key");
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c0qpb, C0QPB.class, "source_default_key");
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity2, null), c672890QaN, C672890QaN.class, "source_default_key");
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c672890QaN, C672890QaN.class, "source_default_key");
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity3, null), c672020QXo, C672020QXo.class, "source_default_key");
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c672020QXo, C672020QXo.class, "source_default_key");
        C0QER c0qer5 = this.LLJILJILJ;
        if (c0qer5 != null) {
            halfSearchForMallParams = c0qer5.getHalfSearchForMallParams();
        } else {
            halfSearchForMallParams = null;
        }
        this.LLJJIJI = halfSearchForMallParams;
        if (ZR() && (iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null)) != null) {
            C19EG activity4 = getActivity();
            Map<String, ? extends Object> map = this.LLJJIJI;
            C0QER c0qer6 = this.LLJILJILJ;
            if (c0qer6 != null) {
                routeUri2 = c0qer6.getRouteUri();
            } else {
                routeUri2 = null;
            }
            iEcUgPopupService.onPopupFragmentOnCreate(activity4, "goods_search", map, routeUri2, "seven_tenths_screen");
        }
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIL(null, this.LLJILLL, "search_result_on_create", null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0QER c0qer7 = this.LLJILJILJ;
        if (c0qer7 != null && (ecSearchEntranceData2 = c0qer7.getEcSearchEntranceData()) != null) {
            int iLIZ = C650500PfM.LIZ(ecSearchEntranceData2);
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(iLIZ));
            if (C2190441Ao6.LIZ(iLIZ) && C13LQ.LJIILJJIL(iLIZ, (int[]) C0QXB.LIZIZ.getValue()) && (c0qer2 = this.LLJILJILJ) != null && (routeUri = c0qer2.getRouteUri()) != null) {
                linkedHashMap.put("route_uri", routeUri);
            }
        }
        C0QER c0qer8 = this.LLJILJILJ;
        if (c0qer8 != null && (ecSearchEntranceData = c0qer8.getEcSearchEntranceData()) != null && (intOrNullStrategy = ecSearchEntranceData.getIntOrNullStrategy("skeleton_type")) != null) {
            iIntValue = intOrNullStrategy.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap.put("skeleton_type", Integer.valueOf(iIntValue));
        if (bundle != null) {
            i = 1;
        }
        linkedHashMap.put("is_rebuild_scene", Integer.valueOf(i));
        linkedHashMap.put("container_type", Integer.valueOf(C0QQZ.HALF_NEW.getValue()));
        SearchResultParam searchResultParam2 = this.LLJILLL;
        if (searchResultParam2 == null || (enterMethod = searchResultParam2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        linkedHashMap.put("enter_method", enterMethod);
        int i2 = C0QUU.LIZ[Xw1().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                value = C0QNA.SUGGEST.getValue();
            } else {
                value = C0QNA.SUG.getValue();
            }
        } else {
            value = C0QNA.RESULT.getValue();
        }
        linkedHashMap.put("current_state", Integer.valueOf(value));
        C1018703yb.LIZIZ("rd_ec_search_page_show", linkedHashMap);
    }

    public static final void gS(TuxSheet tuxSheet, boolean z) {
        Dialog dialog = tuxSheet.getDialog();
        if (dialog != null) {
            TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(tuxSheet.requireActivity(), dialog);
            tuxImmersionBarLJFF.LIZIZ.LJIIJ(z);
            tuxImmersionBarLJFF.LIZIZ.LJIIL();
            tuxImmersionBarLJFF.LIZ(false);
            tuxImmersionBarLJFF.LIZLLL();
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        int iLIZIZ;
        int i;
        ConstraintLayout constraintLayoutBS;
        if (this.LLJLIL || f > 1.0f) {
            return;
        }
        if (f >= 0.6f) {
            iLIZIZ = (int) ((((((double) f) * 2.5d) - 1.5d) * ((double) this.LLJJJIL)) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJJJJIL)))));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJJJJIL)));
        }
        FrameLayout frameLayoutWR = WR();
        if (frameLayoutWR != null) {
            C426750GoL.LJIIIZ(frameLayoutWR, null, Integer.valueOf(iLIZIZ), null, null, false, 29);
        }
        if (this.LLJJL == 3 && (i = this.LLJJJJLIIL) > 0 && this.LLJL) {
            if (f > 0.0f) {
                int i2 = (int) (((iLIZIZ + this.LLJJJJ) * f) + i);
                ConstraintLayout constraintLayoutBS2 = bS();
                if (constraintLayoutBS2 != null) {
                    C1744700vVE.LJIIIIZZ(i2, constraintLayoutBS2);
                }
            }
            if (f == 0.0f && (constraintLayoutBS = bS()) != null) {
                C1744700vVE.LJIIIIZZ(this.LLJJJJLIIL, constraintLayoutBS);
            }
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        int i2;
        IEcUgPopupService iEcUgPopupService;
        String routeUri;
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    if (!((Boolean) this.LLLFFI.getValue()).booleanValue()) {
                        gS(tuxSheet, false);
                    }
                    IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                    if (iEcomSearchService != null) {
                        iEcomSearchService.LJJIL(null, this.LLJILLL, "close", AFwS241S0000000_10.get$arr$(47));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.LLJJIJIL) {
                this.LLJJIJIL = true;
                IEcomSearchService iEcomSearchService2 = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService2 != null) {
                    iEcomSearchService2.LJJIL(null, this.LLJILLL, "full_screen_to_seven", AFwS241S0000000_10.get$arr$(48));
                }
            }
            if (((Boolean) this.LLLFFI.getValue()).booleanValue()) {
                return;
            }
            gS(tuxSheet, false);
            return;
        }
        FrameLayout frameLayoutWR = WR();
        if (frameLayoutWR == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayoutWR.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        if (i2 != this.LLJJJIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJJJJJIL)))) {
            return;
        }
        if (!((Boolean) this.LLLFFI.getValue()).booleanValue()) {
            gS(tuxSheet, true);
        }
        if (!((Boolean) this.LLJLL.getValue()).booleanValue()) {
            if (C299110Bnx.LIZ()) {
                C16BC c16bc = (C16BC) this.LLJJJ.getValue();
                if ((c16bc instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bc) != null) {
                    tuxSheetBehavior.LJIJI = false;
                }
            } else {
                C16BC c16bc2 = (C16BC) this.LLJJJ.getValue();
                if ((c16bc2 instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bc2) != null) {
                    bottomSheetBehavior.setDraggable(false);
                }
            }
        }
        if (ZR() && (iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null)) != null) {
            C19EG activity = getActivity();
            Map<String, ? extends Object> map = this.LLJJIJI;
            C0QER c0qer = this.LLJILJILJ;
            if (c0qer != null) {
                routeUri = c0qer.getRouteUri();
            } else {
                routeUri = null;
            }
            iEcUgPopupService.onPopupFragmentExpandFull(activity, "goods_search", map, routeUri);
        }
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        IEcomSearchService iEcomSearchService3 = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService3 == null) {
            return;
        }
        iEcomSearchService3.LJJIL(null, this.LLJILLL, "seven_to_full_screen", new AwS589S0100000_10(this, 41));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(74:0|2|(1:4)|5|(1:7)|8|(1:10)(1:283)|11|(67:13|(1:15)|16|(3:(1:280)(1:21)|22|(3:275|(1:277)|(1:279))(2:26|(1:(1:(1:30))(2:(1:269)|270))(3:271|(1:273)|274)))|31|(1:37)|38|(1:40)(1:267)|41|(4:45|(1:47)(1:266)|48|(1:50))|51|(1:57)|58|(1:265)(1:64)|65|(1:68)|69|(1:71)|72|(1:76)|77|(1:79)(1:264)|80|(1:82)(1:263)|83|(1:85)(1:262)|86|(1:88)|89|(1:97)|98|(6:100|(1:104)|105|(1:107)|108|(1:110))|111|(2:256|(1:261)(1:260))(1:119)|120|(1:122)|123|(1:255)(1:127)|128|(2:187|(2:192|(1:254)(2:196|(18:206|207|(2:209|(1:252)(1:213))|214|(1:216)(1:251)|217|(1:220)|221|(1:223)(1:250)|224|(1:249)(1:228)|229|(1:231)(1:248)|232|(1:247)(1:236)|237|(1:241)|242)(12:204|(0)|207|(0)|214|(0)(0)|217|(1:220)|221|(0)(0)|224|(6:226|249|229|(0)(0)|232|(7:234|243|245|247|237|(2:239|241)|242)(6:243|245|247|237|(0)|242))(0))))(1:191))(1:132)|133|(1:135)|136|(3:138|(1:140)(1:186)|141)|142|(3:144|(3:146|(1:148)(1:185)|149)|150)|151|(1:153)|154|(1:156)|157|(1:159)|160|(1:164)|165|(1:171)|172|(1:178)|179|(1:183)|184|315|284|(1:299)(3:288|(2:290|(9:292|(1:294)|295|296|(1:298)(1:300)|301|(1:303)|304|(1:306)))|307)|308|311|(2:313|314)(1:317))(1:281)|282|16|(0)|31|(3:33|35|37)|38|(0)(0)|41|(5:43|45|(0)(0)|48|(0))|51|(3:53|55|57)|58|(2:60|265)(0)|65|(1:68)|69|(0)|72|(2:74|76)|77|(0)(0)|80|(0)(0)|83|(0)(0)|86|(0)|89|(4:91|93|95|97)|98|(0)|111|(3:113|256|(2:258|261)(0))(0)|120|(0)|123|(2:125|255)(0)|128|(3:130|187|(3:189|192|(2:194|254)(0))(0))(0)|133|(0)|136|(0)|142|(0)|151|(0)|154|(0)|157|(0)|160|(2:162|164)|165|(2:167|171)(0)|172|(2:174|178)(0)|179|(2:181|183)(0)|184|315|284|(3:286|299|308)(0)|311|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x06d7, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06d8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0QVV, X.0QWG] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r58, android.os.Bundle r59) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcHalfSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.bru, requireActivity(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }
}
