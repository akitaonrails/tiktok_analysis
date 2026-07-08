package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.AbstractC2173821A5s;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C08A4;
import X.C098200Yq;
import X.C0BT4;
import X.C0GXJ;
import X.C0PYE;
import X.C0QER;
import X.C0QES;
import X.C0QJN;
import X.C0QLM;
import X.C0QLO;
import X.C0QM5;
import X.C0QNA;
import X.C0QNB;
import X.C0QNH;
import X.C0QOB;
import X.C0QPB;
import X.C0QPH;
import X.C0QQZ;
import X.C0QSJ;
import X.C0QT8;
import X.C0QTY;
import X.C0QUI;
import X.C0QUP;
import X.C0QUQ;
import X.C0QUT;
import X.C0QVR;
import X.C0QVS;
import X.C0QVU;
import X.C0QW9;
import X.C0QY3;
import X.C1018703yb;
import X.C1205904nh;
import X.C123100dR;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C14EU;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766860w4y;
import X.C1878350yyn;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20632315oP;
import X.C20673215v0;
import X.C21655219p0;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C256810A4p;
import X.C293710BfF;
import X.C293720BfG;
import X.C315220CXg;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C640270P9l;
import X.C646000PVm;
import X.C650500PfM;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C669550QOb;
import X.C669560QOc;
import X.C671450QVj;
import X.C671480QVm;
import X.C672020QXo;
import X.C672660Qa0;
import X.C672890QaN;
import X.C673150Qan;
import X.C673320Qb4;
import X.C673940Qc4;
import X.C673950Qc5;
import X.C674520Qd0;
import X.C680790Qn7;
import X.C687700QyG;
import X.C703302op;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC669620QOi;
import X.EnumC673930Qc3;
import X.InterfaceC1146704e9;
import X.InterfaceC1760590vur;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC668950QLt;
import X.InterfaceC669910QPl;
import X.InterfaceC671320QUw;
import X.InterfaceC671440QVi;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import Y.ARunnableS79S0200000_10;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.ecommerce.search.page.backstrace.EcSearchBackNode;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.EcSearchDealsSkinData;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.ThemeColor;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchFragment extends ECBaseFragment implements C0QUI, IEcSearchFragmentAbility, C0QSJ, InterfaceC1146704e9 {
    public static final C669550QOb LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final Set<String> LLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTHELIOScvLGEgLSQ+Kid9OCQrLGEWKxYpKD0wIAM+KCg+LSs4";
    public C0GXJ LLILLL;
    public TuxTextView LLILZ;
    public SmartImageView LLILZIL;
    public FrameLayout LLILZLL;
    public C20632315oP LLIZ;
    public C0QW9 LLIZLLLIL;
    public ISearchBarAbility LLJ;
    public ISearchResultSubPageAbility LLJI;
    public C671480QVm LLJILJILJ;
    public C0QER LLJJIJI;
    public SearchResultParam LLJJIJIIJIL;
    public final AssemVMLazy LLJJJ;
    public C672020QXo LLJJJIL;
    public boolean LLJJJJ;
    public EcSearchBackNode LLJJJJJIL;
    public final C0QVS LLJJJJLIIL;
    public C21655219p0 LLJJL;
    public C0QY3 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C0QOB LLJLLL;
    public final EcSearchFragment$pageStateObserveAbility$1 LLJIJIL = new IEcSearchPageStateObserveAbility() { // from class: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment$pageStateObserveAbility$1
        @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility
        public final C0QUT bo2() {
            IPageSearchSubPageAbility iPageSearchSubPageAbilityX8;
            InterfaceC671440QVi interfaceC671440QViAS = this.LL.aS();
            if (interfaceC671440QViAS == null || (iPageSearchSubPageAbilityX8 = interfaceC671440QViAS.x8()) == null) {
                return null;
            }
            return iPageSearchSubPageAbilityX8.Zs2();
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility
        public final InterfaceC420801kM fp0(C674520Qd0 c674520Qd0) {
            InterfaceC671440QVi interfaceC671440QViAS = this.LL.aS();
            if (interfaceC671440QViAS != null) {
                return interfaceC671440QViAS.oz(c674520Qd0);
            }
            return null;
        }
    };
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 58));
    public final NextLiveData<Boolean> LLJILLL = new NextLiveData<>();
    public final C0QVR LLJJ = new InterfaceC669910QPl() { // from class: X.0QVR
        public final ISearchResultSubPageAbility LIZJ() {
            C19EG activity = this.LIZ.getActivity();
            ISearchResultSubPageAbility iSearchResultSubPageAbility = activity != null ? (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJI(activity, null), ISearchResultSubPageAbility.class, null) : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("simpleTabSearchResultTabIndex getResultAbility: ");
            sbLIZ.append(iSearchResultSubPageAbility != null ? "ok" : "null");
            sbLIZ.append(", activity=");
            sbLIZ.append(this.LIZ.getActivity() != null);
            C2188811AlT.LIZIZ(sbLIZ);
            return iSearchResultSubPageAbility;
        }

        @Override // X.InterfaceC669910QPl
        public final NextLiveData<Integer> F6() {
            ISearchResultSubPageAbility iSearchResultSubPageAbilityLIZJ = LIZJ();
            if (iSearchResultSubPageAbilityLIZJ != null) {
                return iSearchResultSubPageAbilityLIZJ.F6();
            }
            return null;
        }

        @Override // X.InterfaceC669910QPl
        public final NextLiveData<Integer> LIZIZ() {
            ISearchResultSubPageAbility iSearchResultSubPageAbilityLIZJ = LIZJ();
            if (iSearchResultSubPageAbilityLIZJ != null) {
                return iSearchResultSubPageAbilityLIZJ.F6();
            }
            return null;
        }

        @Override // X.InterfaceC669910QPl
        public final int getTabIndex() {
            ISearchResultSubPageAbility iSearchResultSubPageAbilityLIZJ = LIZJ();
            if (iSearchResultSubPageAbilityLIZJ != null) {
                return iSearchResultSubPageAbilityLIZJ.q4();
            }
            return -1;
        }

        @Override // X.InterfaceC669910QPl
        public final String LIZ(int i) {
            String tabNameByIndex;
            ISearchResultSubPageAbility iSearchResultSubPageAbilityLIZJ = LIZJ();
            if (iSearchResultSubPageAbilityLIZJ == null || (tabNameByIndex = iSearchResultSubPageAbilityLIZJ.getTabNameByIndex(i)) == null) {
                return "";
            }
            return tabNameByIndex;
        }
    };
    public final C671450QVj LLJJI = new InterfaceC671320QUw() { // from class: X.0QVj
        @Override // X.InterfaceC671320QUw
        public final NextLiveData<Boolean> LJ() {
            return this.LIZ.LLJILLL;
        }

        @Override // X.InterfaceC671320QUw
        public final NextLiveData<Boolean> getEcMiddleAIStateObservable() {
            ISearchBarAbility iSearchBarAbility = this.LIZ.LLJ;
            if (iSearchBarAbility != null) {
                return iSearchBarAbility.uO();
            }
            return null;
        }
    };
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 63));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 61));

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0QOb] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchFragment.class, "searchCartVM", "getSearchCartVM()Lcom/ss/android/ugc/aweme/ecommerce/search/cart/vm/SearchCartVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZ = new Object() { // from class: X.0QOb
        };
        LLL = C13LQ.LJLIIL(new String[]{"", EnumC669620QOi.SHOP.getTabName(), EnumC669620QOi.STORE.getTabName(), EnumC669620QOi.ECOM_LIVE.getTabName(), EnumC669620QOi.ECOM_VIDEO.getTabName()});
    }

    public final ISearchBarAbility VR() {
        C669560QOc c669560QOc;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), (InterfaceC494301wD) this.LLJL.getValue(), ISearchBarContextAbility.class, null, null);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 140), 3);
        C650960Pg6 c650960Pg6Vv1 = vv1();
        if (c650960Pg6Vv1 != null && (c669560QOc = c650960Pg6Vv1.searchEcommerceModel) != null && c669560QOc.enableShowCoin) {
            C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 141), 3);
        }
        ISearchBarAbility iSearchBarAbility = (ISearchBarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchBarAbility.class, null);
        this.LLJ = iSearchBarAbility;
        if (iSearchBarAbility != null) {
            return iSearchBarAbility;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C0QLM ZR() {
        Object c098200Yq;
        String strLJ;
        String strLJ2;
        String str;
        String str2;
        try {
            EcSearchDealsSkinData ecSearchDealsSkinDataLJLI = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJLI(this.LLJJIJI, true);
            if (ecSearchDealsSkinDataLJLI != null) {
                C0QNH c0qnh = ecSearchDealsSkinDataLJLI.searchBarTheme;
                ThemeColor themeColor = ecSearchDealsSkinDataLJLI.backgroundColor;
                if (themeColor == null || (str2 = themeColor.light) == null) {
                    strLJ = null;
                } else {
                    C680790Qn7.LIZ.getClass();
                    strLJ = C680790Qn7.LJ(str2);
                }
                ThemeColor themeColor2 = ecSearchDealsSkinDataLJLI.backgroundColor;
                if (themeColor2 == null || (str = themeColor2.dark) == null) {
                    strLJ2 = null;
                } else {
                    C680790Qn7.LIZ.getClass();
                    strLJ2 = C680790Qn7.LJ(str);
                }
                c098200Yq = new C0QLM(c0qnh, new ThemeColor(strLJ, strLJ2), ecSearchDealsSkinDataLJLI.backgroundImage, null, new AwS554S0100000_10(this, 59), null, 40);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C0QLM) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C0QOB.class) {
            this.LLJLLL = (C0QOB) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchResultFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C0QOB.class) {
            return this.LLJLLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C0QOB.class) {
            this.LLJLLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment$pageStateObserveAbility$1] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0QVS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QVR] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0QVj] */
    public EcSearchFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCartVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 67);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(51);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 55), aFwS241S0000000_10, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10((Fragment) this, 56), aFwS241S0000000_10, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 57), aFwS241S0000000_10, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJ = assemVMLazy;
        this.LLJJJJLIIL = new AbstractC2173821A5s() { // from class: X.0QVS
            /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
            @Override // X.AbstractC2173821A5s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ() {
                /*
                    Method dump skipped, instruction units count: 298
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0QVS.LIZIZ():void");
            }

            {
                super(true);
            }
        };
        this.LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 60));
        this.LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 66));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 65));
        this.LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 64));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 62));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility
    public final C0QPB LLJILJIL() {
        return (C0QPB) this.LLJJIJIL.getValue();
    }

    public final SmartImageView WR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.er6) : null;
            this.LLILZIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility
    public final C0QUT Xw1() {
        String keyword;
        C0QER searchEnterParam;
        SearchResultParam searchResultParam = this.LLJJIJIIJIL;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && searchEnterParam.getInitSugWord() != null) {
            return C0QUT.SUG;
        }
        SearchResultParam searchResultParam2 = this.LLJJIJIIJIL;
        return (searchResultParam2 == null || (keyword = searchResultParam2.getKeyword()) == null || !C123100dR.LIZ(keyword)) ? C0QUT.SUGGEST : C0QUT.RESULT;
    }

    public final C0GXJ cS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wga) : null;
            this.LLILLL = (C0GXJ) viewFindViewById;
        }
        return (C0GXJ) viewFindViewById;
    }

    public final C20632315oP dS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gh2) : null;
            this.LLIZ = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility
    public final C650960Pg6 vv1() {
        return (C650960Pg6) this.LLJJIII.getValue();
    }

    public final InterfaceC671440QVi aS() {
        return C256810A4p.LIZ() ? (InterfaceC671440QVi) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IEcSearchContentAbility.class, null) : this.LLIZLLLIL;
    }

    public final ISearchResultSubPageAbility bS() {
        return C256810A4p.LIZ() ? (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ISearchResultSubPageAbility.class, null) : this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C19EG activity = getActivity();
        if (activity != null) {
            C1554960qZC.LIZLLL(C1558360qeg.LJI(activity, null), C672890QaN.class, "source_default_key");
        }
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            C19EG activity2 = getActivity();
            C0QER c0qer = this.LLJJIJI;
            iEcUgPopupService.onPopupFragmentOnDestroy(activity2, c0qer != null ? c0qer.getHalfSearchForMallParams() : null);
        }
        EventBus.LIZLLL().LJJI(this);
        C0QT8.LIZ = 0;
        C0QT8.LIZJ = false;
        C0QTY.LIZ.LIZIZ();
        if (C293710BfF.LIZ()) {
            C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IEcSearchFragmentAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IEcSearchContentContextAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IEcSearchPageStateObserveAbility.class, null);
        C673940Qc4.LIZIZ = null;
        C673940Qc4.LIZJ = null;
        InterfaceC671440QVi interfaceC671440QViAS = aS();
        if (interfaceC671440QViAS != null) {
            interfaceC671440QViAS.F5();
        }
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() throws IllegalAccessException {
        super.onDetach();
        C1558520qew.LJIIJ(this, ECSearchPageScope.class, ISearchBarContextAbility.class, null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EcSearchFragment.class.getName());
        }
        super.onResume();
    }

    @Override // X.C0QUI
    public final C0QNB s0() {
        IPageSearchSubPageAbility iPageSearchSubPageAbilityX8;
        C0QUT c0qutZs2;
        InterfaceC671440QVi interfaceC671440QViAS = aS();
        if (interfaceC671440QViAS == null || (iPageSearchSubPageAbilityX8 = interfaceC671440QViAS.x8()) == null || (c0qutZs2 = iPageSearchSubPageAbilityX8.Zs2()) == null) {
            return null;
        }
        return C0QUQ.LIZ(c0qutZs2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility
    public final SearchResultParam qs0() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility
    public final C0QER v4() {
        return this.LLJJIJI;
    }

    @Override // X.C0QUI
    public final void Ly(LifecycleObserver lifecycleObserver) {
        getLifecycle().removeObserver(lifecycleObserver);
    }

    @Override // X.C0QUI
    public final void OK(LifecycleObserver lifecycleObserver) {
        getLifecycle().addObserver(lifecycleObserver);
    }

    @Override // X.C0QUI
    public final void Q4(boolean z) {
        C650960Pg6 c650960Pg6Vv1;
        C669560QOc c669560QOc;
        C650960Pg6 c650960Pg6Vv12;
        C669560QOc c669560QOc2;
        String str;
        if (z && (c650960Pg6Vv1 = vv1()) != null && (c669560QOc = c650960Pg6Vv1.searchEcommerceModel) != null && c669560QOc.needBackToPage && C703302op.LIZ(c669560QOc.pageSchema) && (c650960Pg6Vv12 = vv1()) != null && (c669560QOc2 = c650960Pg6Vv12.searchEcommerceModel) != null && (str = c669560QOc2.pageSchema) != null) {
            SmartRouter.buildRoute(this, str).open();
            return;
        }
        LJFF(false);
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.C0QUI
    public final boolean e1(C0QNB c0qnb) {
        C0QUT c0qut;
        InterfaceC671440QVi interfaceC671440QViAS = aS();
        if (interfaceC671440QViAS != null) {
            int i = C0QUP.LIZ[c0qnb.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c0qut = C0QUT.SUGGEST;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c0qut = C0QUT.RESULT;
                }
            } else {
                c0qut = C0QUT.SUG;
            }
            return interfaceC671440QViAS.m9(c0qut);
        }
        return false;
    }

    @Override // X.C0QUI
    public final InterfaceC420801kM fb(final InterfaceC668950QLt interfaceC668950QLt) {
        InterfaceC420801kM interfaceC420801kMOz;
        InterfaceC671440QVi interfaceC671440QViAS = aS();
        if (interfaceC671440QViAS == null || (interfaceC420801kMOz = interfaceC671440QViAS.oz(new C0QPH() { // from class: X.0QUR
            @Override // X.C0QPH
            public final void pc(C0QUT c0qut, C0QUT c0qut2) {
            }

            @Override // X.C0QPH
            public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
                C0QNB c0qnbLIZ;
                InterfaceC668950QLt interfaceC668950QLt2 = interfaceC668950QLt;
                EcSearchBackNode ecSearchBackNode = this.LLJJJJJIL;
                if (c0qut != null) {
                    c0qnbLIZ = C0QUQ.LIZ(c0qut);
                } else {
                    c0qnbLIZ = null;
                }
                interfaceC668950QLt2.LJ(ecSearchBackNode, c0qnbLIZ, C0QUQ.LIZ(c0qut2), searchResultParam);
            }
        })) == null) {
            return new InterfaceC420801kM() { // from class: X.0QUS
                @Override // X.InterfaceC420801kM
                public final void dispose() {
                }

                @Override // X.InterfaceC420801kM
                public final boolean isDisposed() {
                    return true;
                }
            };
        }
        return interfaceC420801kMOz;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gS(com.ss.android.ugc.aweme.search.model.SearchResultParam r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L40
            X.0QXL r0 = X.C0QXL.LIZ
            r0.getClass()
            boolean r0 = X.C0QXL.LIZIZ
            if (r0 == 0) goto L40
            X.0QP4 r0 = X.C0QP4.LIZ
            r0.getClass()
            X.C0QP4.LIZ(r6)
            r5.hS(r6)
            X.0QXN r0 = r6.getEcommerceNewUserModel()
            r4 = 0
            if (r0 == 0) goto L41
            boolean r1 = r0.landingToNewUserPage
            r0 = 1
            if (r1 != r0) goto L41
        L22:
            r3 = 2131388510(0x7f0a685e, float:1.8397537E38)
            r2 = 0
            if (r0 == 0) goto L43
            android.widget.FrameLayout r1 = r5.LLILZLL
            if (r1 != 0) goto L3c
            android.view.View r0 = r5.getView()
            if (r0 == 0) goto L36
            android.view.View r2 = r0.findViewById(r3)
        L36:
            r0 = r2
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.LLILZLL = r0
            r1 = r2
        L3c:
            r0 = -1
            r1.setBackgroundColor(r0)
        L40:
            return
        L41:
            r0 = 0
            goto L22
        L43:
            android.widget.FrameLayout r0 = r5.LLILZLL
            if (r0 != 0) goto L57
            android.view.View r0 = r5.getView()
            if (r0 == 0) goto L51
            android.view.View r2 = r0.findViewById(r3)
        L51:
            r0 = r2
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.LLILZLL = r0
            r0 = r2
        L57:
            r0.setBackgroundColor(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment.gS(com.ss.android.ugc.aweme.search.model.SearchResultParam):void");
    }

    public final void hS(SearchResultParam searchResultParam) {
        if (C0BT4.LIZ() && ZR() != null) {
            return;
        }
        C0QY3 c0qy3LJLIIL = C315220CXg.LIZ().LJLIIL(searchResultParam, true);
        if (!Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0qy3LJLIIL)) {
            C315220CXg.LIZ().LJLJJLL(WR(), c0qy3LJLIIL);
            this.LLJJLIIIJLLLLLLLZ = c0qy3LJLIIL;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        SearchResultParam searchResultParam;
        Serializable serializable2;
        C0QER c0qer;
        C669560QOc c669560QOc;
        C0QJN c0qjn;
        String str;
        Long endToEndSession;
        Long l;
        OnBackPressedDispatcher onBackPressedDispatcher;
        int iIntValue;
        int value;
        String enterMethod;
        ECSearchEntranceData ecSearchEntranceData;
        Integer intOrNullStrategy;
        ECSearchEntranceData ecSearchEntranceData2;
        OnBackPressedDispatcher onBackPressedDispatcher2;
        ECSearchEntranceData ecSearchEntranceData3;
        C650960Pg6 immutableData;
        C0PYE c0pye;
        ECSearchEntranceData ecSearchEntranceData4;
        String stringOrNullStrategy;
        String mallExtraInfo;
        String strLIZJ;
        String ecSearchSessionId;
        boolean z;
        String sourceBtmToken;
        super.onCreate(bundle);
        C673950Qc5 c673950Qc5 = C673940Qc4.LIZIZ;
        if (c673950Qc5 != null) {
            c673950Qc5.LJIIIZ = Long.valueOf(System.currentTimeMillis());
        }
        Map<String, Object> halfSearchForMallParams = null;
        C673940Qc4.LJIIIZ(EnumC673930Qc3.ROOT_FRAGMENT_CREATE, null);
        C673320Qb4.LIZ.getClass();
        C673320Qb4.LJIIIZ();
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
        this.LLJJIJIIJIL = searchResultParam;
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
        this.LLJJIJI = c0qer;
        C19EG activity = getActivity();
        if (activity != null) {
            C640270P9l.LIZ(this, activity).yQ2(activity, this.LLJJIJI, null);
        }
        if (!C256810A4p.LIZ()) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            SearchResultParam searchResultParam2 = this.LLJJIJIIJIL;
            if (searchResultParam2 != null) {
                sourceBtmToken = searchResultParam2.getSourceBtmToken();
            } else {
                sourceBtmToken = null;
            }
            btmSDK.registerBtmPageOnCreate(this, "a2270.b1453", sourceBtmToken);
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        C650960Pg6 c650960Pg6Vv1 = vv1();
        if (c650960Pg6Vv1 != null) {
            c669560QOc = c650960Pg6Vv1.searchEcommerceModel;
        } else {
            c669560QOc = null;
        }
        C650960Pg6 c650960Pg6Vv12 = vv1();
        if (c650960Pg6Vv12 != null) {
            c0qjn = c650960Pg6Vv12.singleSearchEcommerceModel;
        } else {
            c0qjn = null;
        }
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        if (c0qjn != null) {
            str = c0qjn.originIsMallTab;
        } else {
            str = null;
        }
        String str2 = "";
        int i = 0;
        if (str == null) {
            if (c669560QOc != null && c669560QOc.isFromMallUGDeepLink()) {
                z = true;
            } else {
                z = false;
            }
            if (z && iEcomSearchService.LJJLIIIJ() != C0QLO.NO_MALL) {
                int i2 = C0QVU.LIZIZ[iEcomSearchService.LJJLIIIJ().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (c0qjn != null) {
                            c0qjn.setOriginIsMallTab("");
                        }
                    } else {
                        if (c0qjn != null) {
                            c0qjn.setOriginIsMallTab("mall");
                        }
                        iEcomSearchService.LJI("origin_is_mall_tab", "mall");
                    }
                } else {
                    if (c0qjn != null) {
                        c0qjn.setOriginIsMallTab("homepage_mall");
                    }
                    iEcomSearchService.LJI("origin_is_mall_tab", "homepage_mall");
                }
            } else {
                String paramByName = iEcomSearchService.getParamByName("origin_is_mall_tab");
                if (paramByName == null) {
                    paramByName = "";
                }
                if (c0qjn != null) {
                    c0qjn.setOriginIsMallTab(paramByName);
                }
            }
        }
        C0QER c0qer2 = this.LLJJIJI;
        if (c0qer2 != null && (ecSearchSessionId = c0qer2.getEcSearchSessionId()) != null && C650500PfM.LIZJ(this.LLJJIJI)) {
            iEcomSearchService.LJI("ec_search_session_id", ecSearchSessionId);
        }
        C0QES c0qes = C0QES.LIZ;
        C0QER c0qer3 = this.LLJJIJI;
        if (c0qer3 != null) {
            endToEndSession = c0qer3.getEndToEndSession();
        } else {
            endToEndSession = null;
        }
        C0QES.LJ(c0qes, endToEndSession, pageFinderVia, 2);
        C0QER c0qer4 = this.LLJJIJI;
        if (c0qer4 != null && (mallExtraInfo = c0qer4.getMallExtraInfo()) != null) {
            C1766860w4y c1766860w4y = C1766860w4y.LIZ;
            c1766860w4y.getClass();
            C1766860w4y.LJIILL(pageFinderVia, "mall_extra_info", mallExtraInfo, true);
            C672660Qa0 c672660Qa0 = C672660Qa0.LIZ;
            C0QER c0qer5 = this.LLJJIJI;
            if (c0qer5 != null) {
                c672660Qa0.getClass();
                strLIZJ = C672660Qa0.LIZJ(c0qer5);
            } else {
                strLIZJ = null;
            }
            c672660Qa0.getClass();
            String strLIZIZ = C672660Qa0.LIZIZ(strLIZJ, mallExtraInfo);
            if (strLIZIZ != null) {
                c1766860w4y.getClass();
                C1766860w4y.LJIILL(pageFinderVia, "traffic_diversion_info", strLIZIZ, true);
            }
        }
        C0QER c0qer6 = this.LLJJIJI;
        if (c0qer6 != null && (ecSearchEntranceData4 = c0qer6.getEcSearchEntranceData()) != null && (stringOrNullStrategy = ecSearchEntranceData4.getStringOrNullStrategy("btm_root_enter_from_type")) != null) {
            C1766860w4y.LIZ.getClass();
            C1766860w4y.LJIIIIZZ(stringOrNullStrategy);
        }
        C650950Pg5.Companion.getClass();
        C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(this, this);
        if (c650950Pg5LJIIIZ != null && (immutableData = c650950Pg5LJIIIZ.getImmutableData()) != null && (c0pye = immutableData.searchSessionModel) != null) {
            l = c0pye.searchSessionId;
        } else {
            l = null;
        }
        if (C08A4.LIZIZ(l) && l != null) {
            long jLongValue = l.longValue();
            C1766860w4y c1766860w4y2 = C1766860w4y.LIZ;
            String strValueOf = String.valueOf(jLongValue);
            c1766860w4y2.getClass();
            C1766860w4y.LJIILL(pageFinderVia, "search_session_id", strValueOf, true);
        }
        iEcomSearchService.LIZLLL();
        if (!C1205904nh.LIZ()) {
            C1766860w4y c1766860w4y3 = C1766860w4y.LIZ;
            c1766860w4y3.getClass();
            C1766860w4y.LJIILL(pageFinderVia, "search_jump_in_num", CardStruct.IStatusCode.DEFAULT, true);
            c1766860w4y3.getClass();
            C1766860w4y.LJIILL(pageFinderVia, "ec_has_search_container", "1", true);
        }
        C0QPB c0qpb = C0QPB.LLILZLL;
        if (c0qpb == null) {
            C0QER c0qer7 = this.LLJJIJI;
            if (c0qer7 != null) {
                c0qer7.getEcSearchEntranceValue();
            }
            C0QER c0qer8 = this.LLJJIJI;
            if (c0qer8 != null) {
                ecSearchEntranceData3 = c0qer8.getEcSearchEntranceData();
            } else {
                ecSearchEntranceData3 = null;
            }
            c0qpb = new C0QPB(ecSearchEntranceData3);
        }
        C0QPB.LLILZLL = null;
        C672020QXo c672020QXo = new C672020QXo();
        this.LLJJJIL = c672020QXo;
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity2, null), c0qpb, C0QPB.class, "source_default_key");
        }
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity3, null), new C672890QaN(), C672890QaN.class, "source_default_key");
        }
        C19EG activity4 = getActivity();
        if (activity4 != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity4, null), c672020QXo, C672020QXo.class, "source_default_key");
        }
        if (C293720BfG.LIZ()) {
            C19EG activity5 = getActivity();
            if (activity5 != null && (onBackPressedDispatcher2 = activity5.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher2.LIZ(this, this.LLJJJJLIIL);
            }
        } else {
            C19EG activity6 = getActivity();
            if (activity6 != null && (onBackPressedDispatcher = activity6.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.LIZIZ(this.LLJJJJLIIL);
            }
        }
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIL(null, this.LLJJIJIIJIL, "search_result_on_create", null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0QER c0qer9 = this.LLJJIJI;
        if (c0qer9 != null && (ecSearchEntranceData2 = c0qer9.getEcSearchEntranceData()) != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(C650500PfM.LIZ(ecSearchEntranceData2)));
        }
        C0QER c0qer10 = this.LLJJIJI;
        if (c0qer10 != null && (ecSearchEntranceData = c0qer10.getEcSearchEntranceData()) != null && (intOrNullStrategy = ecSearchEntranceData.getIntOrNullStrategy("skeleton_type")) != null) {
            iIntValue = intOrNullStrategy.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap.put("skeleton_type", Integer.valueOf(iIntValue));
        if (bundle != null) {
            i = 1;
        }
        linkedHashMap.put("is_rebuild_scene", Integer.valueOf(i));
        linkedHashMap.put("container_type", Integer.valueOf(C0QQZ.SIMPLE.getValue()));
        SearchResultParam searchResultParam3 = this.LLJJIJIIJIL;
        if (searchResultParam3 != null && (enterMethod = searchResultParam3.getEnterMethod()) != null) {
            str2 = enterMethod;
        }
        linkedHashMap.put("enter_method", str2);
        int i3 = C0QVU.LIZ[Xw1().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                value = C0QNA.SUGGEST.getValue();
            } else {
                value = C0QNA.SUG.getValue();
            }
        } else {
            value = C0QNA.RESULT.getValue();
        }
        linkedHashMap.put("current_state", Integer.valueOf(value));
        C1018703yb.LIZIZ("rd_ec_search_page_show", linkedHashMap);
        IEcUgPopupService iEcUgPopupService = (IEcUgPopupService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupService.class, false, false, false, 14, null);
        if (iEcUgPopupService != null) {
            C19EG activity7 = getActivity();
            C0QER c0qer11 = this.LLJJIJI;
            if (c0qer11 != null) {
                halfSearchForMallParams = c0qer11.getHalfSearchForMallParams();
            }
            iEcUgPopupService.onPopupFragmentOnCreate(activity7, "goods_search", halfSearchForMallParams, null, "full_screen");
        }
        C673320Qb4.LJIIIIZZ();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHandleECKeyboardEvent(C0QM5 c0qm5) {
        C0GXJ c0gxjCS;
        if (isActive() && (c0gxjCS = cS()) != null) {
            HandlerHook.viewPostDelay(c0gxjCS, new ARunnableS79S0200000_10(this, c0qm5, 6), 200L);
        }
    }

    public final void ID2(C0QUT c0qut, C0QUT c0qut2) {
        String strName;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChangeEvent preState=");
        if (c0qut != null) {
            strName = c0qut.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append(", curState=");
        sbLIZ.append(c0qut2.name());
        C2188811AlT.LIZIZ(sbLIZ);
        C0QUT c0qut3 = C0QUT.RESULT;
        boolean z = true;
        if (c0qut2 == c0qut3) {
            C20632315oP c20632315oPDS = dS();
            if (c20632315oPDS != null) {
                c20632315oPDS.setUserInputEnabled(false);
            }
            SmartImageView smartImageViewWR = WR();
            if (smartImageViewWR != null) {
                C786410Ut5.LLFF(0, smartImageViewWR);
            }
        } else {
            C20632315oP c20632315oPDS2 = dS();
            if (c20632315oPDS2 != null) {
                c20632315oPDS2.setUserInputEnabled(true);
            }
            SmartImageView smartImageViewWR2 = WR();
            if (smartImageViewWR2 != null) {
                C786410Ut5.LLFF(8, smartImageViewWR2);
            }
            C21655219p0 c21655219p0 = this.LLJJL;
            if (c21655219p0 != null) {
                c21655219p0.LJFF();
            }
        }
        if (c0qut2 == C0QUT.SUG || c0qut2 == C0QUT.SUGGEST) {
            BtmSDK.INSTANCE.onPageShow(this, Boolean.FALSE);
        }
        NextLiveData<Boolean> nextLiveData = this.LLJILLL;
        if (c0qut2 != c0qut3) {
            z = false;
        }
        nextLiveData.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void");
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
