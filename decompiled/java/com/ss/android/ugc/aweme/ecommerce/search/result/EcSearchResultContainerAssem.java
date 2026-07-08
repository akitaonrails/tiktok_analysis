package com.ss.android.ugc.aweme.ecommerce.search.result;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C08QL;
import X.C098200Yq;
import X.C09R3;
import X.C09RB;
import X.C0BT4;
import X.C0C64;
import X.C0PSL;
import X.C0QER;
import X.C0QPB;
import X.C0QUT;
import X.C0QV7;
import X.C0QVX;
import X.C0QWA;
import X.C0QXT;
import X.C0QZ2;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C14EU;
import X.C1507790pL7;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1766860w4y;
import X.C1845990y8b;
import X.C1846140y8q;
import X.C189200o6;
import X.C1940007io;
import X.C19719912Dl;
import X.C19EG;
import X.C20633086l;
import X.C212367188v;
import X.C21655219p0;
import X.C2217381BqS;
import X.C2232408os;
import X.C2441009hQ;
import X.C285950BIr;
import X.C315220CXg;
import X.C341050DYp;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C669540QOa;
import X.C669740QOu;
import X.C669790QOz;
import X.C672610QZv;
import X.C675650Qep;
import X.C676890Qgp;
import X.C676940Qgu;
import X.C676970Qgx;
import X.C677080Qh8;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC669620QOi;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC677130QhD;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.page.IEcSearchFragmentAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.vm.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.vm.EcSearchTabViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchFilterViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.EcSearchPagerItem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchResultContainerAssem extends UISlotAssem implements ISearchResultSubPageAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public ConstraintLayout LLJJI;
    public FrameLayout LLJJIII;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public ViewGroup LLJJJ;
    public C1846140y8q LLJJJIL;
    public C1846140y8q LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public SearchResultParam LLJLIL;
    public C669790QOz LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public final AssemVMLazy LLJLLL;
    public final AssemVMLazy LLJZ;
    public boolean LLJZIJLIL;
    public C676940Qgu LLL;
    public long LLLF;
    public Integer LLLFF;
    public final C01GW LLLFFI;
    public final List<InterfaceC677130QhD> LLLFZ;
    public boolean LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchResultContainerAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/search/result/EcSearchContainerVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EcSearchResultContainerAssem.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/ecommerce/search/result/tab/ECSearchFilterViewModel;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1672577172) {
            return null;
        }
        return this;
    }

    public EcSearchResultContainerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcSearchContainerVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 105);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(61);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 106), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ECSearchFilterViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), C019F.LIZ, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 107), AFwS241S0000000_10.get$arr$(62), null, true);
        this.LLJZIJLIL = true;
        this.LLL = new C676940Qgu(0);
        this.LLLFFI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 104));
        this.LLLFZ = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final View Gu() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wyn) : null;
            this.LLJJJJJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final View Le() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wx1) : null;
            this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final View Lu() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wyp) : null;
            this.LLJJJJLIIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final EnumC669620QOi P1() {
        C669790QOz c669790QOz = this.LLJLILLLLZIIL;
        if (c669790QOz != null) {
            return c669790QOz.LIZIZ(lp().getCurrentItem());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final View Wu() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wyz) : null;
            this.LLJJL = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final int dx0() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ohz) : null;
            this.LLJJI = (ConstraintLayout) viewFindViewById;
        }
        return viewFindViewById.getWidth();
    }

    public final ViewGroup kp() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.mer) : null;
            this.LLJJJ = (ViewGroup) viewFindViewById;
        }
        return (ViewGroup) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20631115oD lp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.rn_) : null;
            this.LLJJIJI = (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20631115oD) viewFindViewById;
    }

    public final FrameLayout mp() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tpv) : null;
            this.LLJJIII = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C0QER searchEnterParam;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - this.LLJL);
            jSONObject.put("enter_method", "destroy");
            jSONObject.put("next_tab", "");
            SearchResultParam searchResultParam = this.LLJLIL;
            jSONObject.put("search_entrance", (searchResultParam == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null) ? null : searchEnterParam.getEnterSearchFrom());
            jSONObject.put("search_id", ((ISearchService) ServiceManager.get().getService(ISearchService.class)).getLatestSearchId());
            SearchResultParam searchResultParam2 = this.LLJLIL;
            jSONObject.put("search_keyword", searchResultParam2 != null ? searchResultParam2.getKeyword() : null);
            jSONObject.put("current_tab", C669740QOu.LIZLLL(this.LLJLL));
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_switch_tab_finish", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        ((ArrayList) this.LLLFZ).clear();
    }

    public final View op() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u9c) : null;
            this.LLJJIJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final int q4() {
        if (this.LLJZIJLIL) {
            return -1;
        }
        return lp().getCurrentItem();
    }

    public final View sp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ucj) : null;
            this.LLJJIJIIJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final EcSearchContainerVM up() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (EcSearchContainerVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final Integer wz() {
        List<EnumC669620QOi> list;
        C669790QOz c669790QOz = this.LLJLILLLLZIIL;
        if (c669790QOz == null || (list = c669790QOz.LIZ) == null) {
            return null;
        }
        return Integer.valueOf(((ArrayList) list).size());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final EnumC669620QOi yC0() {
        List<EnumC669620QOi> list;
        C669790QOz c669790QOz = this.LLJLILLLLZIIL;
        if (c669790QOz != null && (list = c669790QOz.LIZ) != null) {
            EnumC669620QOi enumC669620QOi = EnumC669620QOi.TOP;
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains(enumC669620QOi)) {
                enumC669620QOi = EnumC669620QOi.SHOP;
                if (arrayList.contains(enumC669620QOi)) {
                }
            }
            return enumC669620QOi;
        }
        return null;
    }

    public final boolean yN2() {
        List<EnumC669620QOi> list;
        C0QER searchEnterParam;
        C669790QOz c669790QOz = this.LLJLILLLLZIIL;
        if (c669790QOz == null || (list = c669790QOz.LIZ) == null || ((ArrayList) list).size() <= 1) {
            return false;
        }
        C676890Qgp c676890Qgp = C676890Qgp.LIZ;
        SearchResultParam searchResultParam = this.LLJLIL;
        return c676890Qgp.LIZ((searchResultParam == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null) ? null : searchEnterParam.getEcSearchEntranceData());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return C0QV7.LIZ() ? R.layout.bqm : R.layout.bql;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final NextLiveData<Integer> F6() {
        return up().LLILZ;
    }

    public final boolean GX() {
        IECSearchFilterAbility iECSearchFilterAbility = (IECSearchFilterAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IECSearchFilterAbility.class, null);
        return iECSearchFilterAbility != null && iECSearchFilterAbility.GX();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final EnumC669620QOi SU0() {
        return up().LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void Tm0() {
        EcSearchContainerVM ecSearchContainerVMUp = up();
        C675650Qep c675650Qep = ecSearchContainerVMUp.LL;
        if (c675650Qep != null) {
            c675650Qep.LIZ = null;
        } else {
            ecSearchContainerVMUp.LL = new C675650Qep(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        VerticalSearchAbility verticalSearchAbility;
        ViewGroup viewGroupKp = kp();
        if (viewGroupKp != null) {
            C786410Ut5.LJLZ(8, viewGroupKp);
        }
        Fragment fragmentLIZIZ = lp().getFragmentItemOperator().LIZIZ(lp().getCurrentItem());
        if (fragmentLIZIZ == null || (verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZIZ, null), VerticalSearchAbility.class, null)) == null) {
            return;
        }
        verticalSearchAbility.hf1(false, true);
    }

    public final C1846140y8q ip() {
        View viewFindViewById;
        if (yN2()) {
            View view = this.LLJJJIL;
            if (view == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f775p8b) : null;
                this.LLJJJIL = (C1846140y8q) viewFindViewById;
                view = viewFindViewById;
            }
            return (C1846140y8q) view;
        }
        View view2 = this.LLJJJJ;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            viewFindViewById = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.p8a) : null;
            this.LLJJJJ = (C1846140y8q) viewFindViewById;
            view2 = viewFindViewById;
        }
        return (C1846140y8q) view2;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final Integer qQ() {
        C1846140y8q c1846140y8qIp = ip();
        if (c1846140y8qIp != null) {
            return Integer.valueOf(c1846140y8qIp.getWidth());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final C675650Qep tk2() {
        return up().LL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final SearchResultParam Tb() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final C0QUT Zs2() {
        return C0QUT.RESULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final boolean nN() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void GO0(boolean z) {
        Integer num;
        C1846140y8q c1846140y8qIp = ip();
        if (c1846140y8qIp != null) {
            if (z) {
                num = 24;
            } else {
                num = null;
            }
            c1846140y8qIp.setFixedTabTextSpacing(num);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void Hb2(int i) {
        View viewSp = sp();
        if (viewSp != null) {
            C786410Ut5.LJLLLLLL(i, viewSp);
        }
        if (i == 0) {
            C1846140y8q c1846140y8qIp = ip();
            if (c1846140y8qIp != null) {
                c1846140y8qIp.LLJJI = false;
                c1846140y8qIp.LLILZLL.invalidate();
                return;
            }
            return;
        }
        C1846140y8q c1846140y8qIp2 = ip();
        if (c1846140y8qIp2 == null) {
            return;
        }
        c1846140y8qIp2.LLJJI = true;
        c1846140y8qIp2.LLILZLL.invalidate();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void MP1(int i) {
        View viewSp = sp();
        if (viewSp != null) {
            viewSp.setBackgroundColor(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void Vq0(int i) throws JSONException {
        EnumC669620QOi enumC669620QOiLIZIZ;
        SearchResultParam searchResultParam = this.LLJLIL;
        if (searchResultParam != null) {
            searchResultParam.setIsNonPersonalizedSearch(i);
            searchResultParam.setShouldRecreateEcomResultPage(true);
            C669790QOz c669790QOz = up().LLILLJJLI;
            if (c669790QOz != null) {
                enumC669620QOiLIZIZ = c669790QOz.LIZIZ(lp().getCurrentItem());
            } else {
                enumC669620QOiLIZIZ = null;
            }
            searchResultParam.setEcomTargetTab(enumC669620QOiLIZIZ);
            j72(searchResultParam);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void XE1(C0QWA c0qwa) {
        C0QER c0qerV4;
        C0QER c0qerV42;
        VerticalSearchAbility verticalSearchAbility;
        ViewGroup viewGroupKp = kp();
        if (viewGroupKp != null) {
            C786410Ut5.LJLZ(0, viewGroupKp);
        }
        Fragment fragmentLIZIZ = lp().getFragmentItemOperator().LIZIZ(lp().getCurrentItem());
        if (fragmentLIZIZ != null && (verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZIZ, null), VerticalSearchAbility.class, null)) != null) {
            verticalSearchAbility.hf1(true, true);
        }
        IECSearchFilterAbility iECSearchFilterAbility = (IECSearchFilterAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IECSearchFilterAbility.class, null);
        if (iECSearchFilterAbility != null) {
            iECSearchFilterAbility.H41();
        }
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageContextAbility.class, null);
        if (iSearchResultSubPageContextAbility != null && (c0qerV42 = iSearchResultSubPageContextAbility.v4()) != null) {
            c0qerV42.setLastSearchPosition(null);
        }
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility2 = (ISearchResultSubPageContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageContextAbility.class, null);
        if (iSearchResultSubPageContextAbility2 != null && (c0qerV4 = iSearchResultSubPageContextAbility2.v4()) != null) {
            c0qerV4.setRefreshTime(null);
        }
        try {
            Fragment fragmentLIZIZ2 = lp().getFragmentItemOperator().LIZIZ(lp().getCurrentItem());
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Boolean bool = Boolean.TRUE;
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(fragmentLIZIZ2, bool, c0psl);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void Xd1(EnumC669620QOi enumC669620QOi) {
        C669790QOz c669790QOz;
        Map<EnumC669620QOi, Boolean> map;
        if (enumC669620QOi != null && (c669790QOz = up().LLILLJJLI) != null && (map = c669790QOz.LIZIZ) != null) {
            map.put(enumC669620QOi, Boolean.TRUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final boolean bx(EnumC669620QOi enumC669620QOi) {
        Map<EnumC669620QOi, Boolean> map;
        Boolean bool;
        C669790QOz c669790QOz = up().LLILLJJLI;
        if (c669790QOz != null && (map = c669790QOz.LIZIZ) != null && (bool = (Boolean) ((LinkedHashMap) map).get(enumC669620QOi)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final String getTabNameByIndex(int i) {
        EnumC669620QOi enumC669620QOiLIZIZ;
        String tabName;
        C669790QOz c669790QOz = up().LLILLJJLI;
        if (c669790QOz == null || (enumC669620QOiLIZIZ = c669790QOz.LIZIZ(i)) == null || (tabName = enumC669620QOiLIZIZ.getTabName()) == null) {
            return "";
        }
        return tabName;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void he0(EnumC669620QOi enumC669620QOi) {
        up().LLILLL = enumC669620QOi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hp(int i) {
        float fFloatValue;
        C1846140y8q[] c1846140y8qArr = new C1846140y8q[2];
        View viewFindViewById = this.LLJJJJ;
        AttributeSet attributeSet = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.p8a);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJJ = (C1846140y8q) viewFindViewById;
        }
        c1846140y8qArr[0] = viewFindViewById;
        View viewFindViewById2 = this.LLJJJIL;
        if (viewFindViewById2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.f775p8b);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJIL = (C1846140y8q) viewFindViewById2;
        }
        c1846140y8qArr[1] = viewFindViewById2;
        Iterator it2 = C09RB.LJI(C09RB.LJIIJJI(C13LQ.LJIIJJI(c1846140y8qArr))).iterator();
        while (true) {
            C08QL c08ql = (C08QL) it2;
            if (c08ql.hasNext()) {
                C1846140y8q c1846140y8q = (C1846140y8q) c08ql.next();
                c1846140y8q.getClass();
                TypedArray typedArrayObtainStyledAttributes = new ContextThemeWrapper(c1846140y8q.getContext(), i).obtainStyledAttributes(attributeSet, R$styleable.TuxTabBar, R.attr.yx, 0);
                int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarBackgroundColor, 0);
                int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarIndicatorColor, 0);
                int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextColor, 0);
                int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextSelectColor, 0);
                c1846140y8q.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarSeparatorColor, 0);
                typedArrayObtainStyledAttributes.recycle();
                Float fLJFF = C1308910kAL.LJFF(R.attr.a36, c1846140y8q.getContext());
                if (fLJFF != null) {
                    fFloatValue = fLJFF.floatValue();
                } else {
                    fFloatValue = 0.2f;
                }
                c1846140y8q.LLIZLLLIL = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color4, C2441009hQ.LJIIL(color3, (int) (fFloatValue * Color.alpha(color3))), color3});
                c1846140y8q.setBackgroundColor(color);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                c384050F3z.LIZ = Integer.valueOf(color2);
                c1846140y8q.LLJJIII = c384050F3z.LIZ(c1846140y8q.getContext());
                c1846140y8q.LLILZLL.setSelectedIndicatorHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                int childCount = c1846140y8q.LLILZLL.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = c1846140y8q.LLILZLL.getChildAt(i2);
                    if (childAt instanceof C1845990y8b) {
                        ((C1845990y8b) childAt).LIZ();
                    }
                }
                c1846140y8q.setBackgroundColor(0);
                attributeSet = null;
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void in2(int i) {
        View viewSp;
        this.LLLFF = Integer.valueOf(i);
        hp(i);
        IECSearchFilterAbility iECSearchFilterAbility = (IECSearchFilterAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IECSearchFilterAbility.class, null);
        if (iECSearchFilterAbility != null) {
            iECSearchFilterAbility.oN2(i);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, new ContextThemeWrapper(getContext(), i));
        if (numLIZJ != null && (viewSp = sp()) != null) {
            viewSp.setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void j72(SearchResultParam searchResultParam) throws JSONException {
        EnumC669620QOi enumC669620QOiLIZIZ;
        int currentItem;
        EcSearchPagerItem ecSearchPagerItem;
        Map<EnumC669620QOi, Boolean> map;
        EnumC669620QOi enumC669620QOi;
        EnumC669620QOi enumC669620QOiLIZIZ2;
        int iLIZ;
        EcSearchPagerItem ecSearchPagerItem2;
        Map<EnumC669620QOi, Boolean> map2;
        EnumC669620QOi enumC669620QOi2;
        SearchResultParam searchResultParamQs0;
        String sourceBtmToken;
        Map<String, Object> map3;
        boolean z;
        C0QPB c0qpbLLJILJIL;
        C0QZ2 c0qz2;
        C675650Qep c675650Qep = up().LL;
        String enterSearchFrom = null;
        if (c675650Qep != null && (c0qz2 = c675650Qep.LIZ) != null) {
            c0qz2.setShopId(null);
            c0qz2.setCreatorId(null);
        }
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        assemVMLazy.getValue().setState(AFwS241S0000000_10.get$arr$(401));
        C669790QOz c669790QOz = up().LLILLJJLI;
        if (c669790QOz != null) {
            Iterator it2 = ((LinkedHashMap) c669790QOz.LIZIZ).entrySet().iterator();
            while (it2.hasNext()) {
                ((Map.Entry) it2.next()).setValue(Boolean.FALSE);
            }
        }
        C1766860w4y c1766860w4y = C1766860w4y.LIZ;
        String keyword = searchResultParam.getKeyword();
        c1766860w4y.getClass();
        C1766860w4y.LJIILL(null, "search_keyword", keyword, true);
        c1766860w4y.getClass();
        C1766860w4y.LJIILL(null, "ec_search_action", "", true);
        this.LLJLIL = searchResultParam;
        String keyword2 = searchResultParam.getKeyword();
        c1766860w4y.getClass();
        C1766860w4y.LJIILL(null, "query", keyword2, true);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (!this.LLJZIJLIL && searchResultParam.getCapsuleWords() == null && C20633086l.LIZ(c19egLIZ)) {
                C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3((Object) c19egLIZ, 6));
            }
            this.LLJZIJLIL = false;
            EcSearchStartViewModel ecSearchStartViewModel = (EcSearchStartViewModel) ViewModelProviders.of(c19egLIZ).get(EcSearchStartViewModel.class);
            ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageContextAbility.class, null);
            if (iSearchResultSubPageContextAbility != null && (c0qpbLLJILJIL = iSearchResultSubPageContextAbility.LLJILJIL()) != null && c0qpbLLJILJIL.LIZ() != null) {
                z = true;
            } else {
                z = false;
            }
            ecSearchStartViewModel.LL = z;
        }
        if (!this.LLJLLIL) {
            EcSearchContainerVM ecSearchContainerVMUp = up();
            ecSearchContainerVMUp.LLILLJJLI = new C669790QOz(searchResultParam.getSearchEnterParam());
            ecSearchContainerVMUp.setState(new AwS589S0100000_10(ecSearchContainerVMUp, 642));
            zp(searchResultParam);
            C2232408os c2232408os = C341050DYp.LIZ;
            String strLJ = C341050DYp.LJ(C1940007io.LIZ(), C1940007io.LIZIZ());
            c1766860w4y.getClass();
            C1766860w4y.LJIILL(null, "search_pre_product_id", strLJ, true);
        } else {
            zp(searchResultParam);
            if (searchResultParam.getEcomTargetTab() != null) {
                C669790QOz c669790QOz2 = this.LLJLILLLLZIIL;
                if (c669790QOz2 != null) {
                    iLIZ = c669790QOz2.LIZ(searchResultParam.getEcomTargetTab());
                } else {
                    iLIZ = 0;
                }
                if (lp().getCurrentItem() == iLIZ) {
                    Fragment fragmentLIZIZ = lp().getFragmentItemOperator().LIZIZ(iLIZ);
                    if (fragmentLIZIZ instanceof EcSearchPagerItem) {
                        ecSearchPagerItem2 = (EcSearchPagerItem) fragmentLIZIZ;
                    } else {
                        ecSearchPagerItem2 = null;
                    }
                    C669790QOz c669790QOz3 = up().LLILLJJLI;
                    if (c669790QOz3 != null && (map2 = c669790QOz3.LIZIZ) != null) {
                        if (ecSearchPagerItem2 == null || (enumC669620QOi2 = ecSearchPagerItem2.LLILLL) == null) {
                            enumC669620QOi2 = EnumC669620QOi.SHOP;
                        }
                        map2.put(enumC669620QOi2, Boolean.TRUE);
                    }
                    if (ecSearchPagerItem2 != null) {
                        ecSearchPagerItem2.MR();
                    }
                } else {
                    lp().setCurrentItem(iLIZ, false);
                    up().LLILZ.setValue(Integer.valueOf(iLIZ));
                }
            } else {
                C669790QOz c669790QOz4 = up().LLILLJJLI;
                if (c669790QOz4 != null) {
                    enumC669620QOiLIZIZ = c669790QOz4.LIZIZ(0);
                } else {
                    enumC669620QOiLIZIZ = null;
                }
                searchResultParam.setEcomTargetTab(enumC669620QOiLIZIZ);
                if (((Boolean) C285950BIr.LIZ.getValue()).booleanValue()) {
                    C669790QOz c669790QOz5 = up().LLILLJJLI;
                    if (c669790QOz5 != null) {
                        enumC669620QOiLIZIZ2 = c669790QOz5.LIZIZ(lp().getCurrentItem());
                    } else {
                        enumC669620QOiLIZIZ2 = null;
                    }
                    searchResultParam.setEcomTargetTab(enumC669620QOiLIZIZ2);
                    currentItem = lp().getCurrentItem();
                } else {
                    currentItem = 0;
                }
                if (lp().getCurrentItem() == currentItem) {
                    Fragment fragmentLIZIZ2 = lp().getFragmentItemOperator().LIZIZ(currentItem);
                    if (fragmentLIZIZ2 instanceof EcSearchPagerItem) {
                        ecSearchPagerItem = (EcSearchPagerItem) fragmentLIZIZ2;
                    } else {
                        ecSearchPagerItem = null;
                    }
                    C669790QOz c669790QOz6 = up().LLILLJJLI;
                    if (c669790QOz6 != null && (map = c669790QOz6.LIZIZ) != null) {
                        if (ecSearchPagerItem == null || (enumC669620QOi = ecSearchPagerItem.LLILLL) == null) {
                            enumC669620QOi = EnumC669620QOi.SHOP;
                        }
                        map.put(enumC669620QOi, Boolean.TRUE);
                    }
                    if (ecSearchPagerItem != null) {
                        ecSearchPagerItem.MR();
                    }
                } else {
                    lp().setCurrentItem(currentItem, false);
                    up().LLILZ.setValue(Integer.valueOf(currentItem));
                }
            }
        }
        IEcSearchFragmentAbility iEcSearchFragmentAbility = (IEcSearchFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IEcSearchFragmentAbility.class, null);
        if (iEcSearchFragmentAbility != null && iEcSearchFragmentAbility.Xw1() == C0QUT.RESULT && (searchResultParamQs0 = iEcSearchFragmentAbility.qs0()) != null && (sourceBtmToken = searchResultParamQs0.getSourceBtmToken()) != null) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C677080Qh8 c677080Qh8 = (C677080Qh8) C13LP.LJJJLL(BtmSDK.getBcmParamsWithBtm(PageFinder.via(btmSDK.getLastCreatePage()), Collections.singletonList("a2270.b1453"), 1, false));
            if (c677080Qh8 != null) {
                map3 = c677080Qh8.LIZ;
            } else {
                map3 = null;
            }
            BcmParams.Companion.getClass();
            btmSDK.addBcmBySourceBtmToken(sourceBtmToken, C212367188v.LIZJ(map3));
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, "result_realSearch");
        jSONObject.put("is_native_request", 1);
        jSONObject.put("enter_method", searchResultParam.getEnterMethod());
        C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        }
        jSONObject.put("enter_from", enterSearchFrom);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
    }

    @C14EU
    public final void onSearchViewAllEvent(C669540QOa c669540QOa) {
        SearchResultParam searchResultParam;
        Map<String, Object> ecomRecomSearchParamMap;
        if (this.LLJLLIL && c669540QOa != null && c669540QOa.LIZ != null) {
            for (Map.Entry<String, Object> entry : c669540QOa.LIZ.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                SearchResultParam searchResultParam2 = this.LLJLIL;
                if (searchResultParam2 != null && (ecomRecomSearchParamMap = searchResultParam2.getEcomRecomSearchParamMap()) != null) {
                    ecomRecomSearchParamMap.put(key, value);
                }
                if (Intrinsics.LJFF(key, "attach_products") && (value instanceof String) && (searchResultParam = this.LLJLIL) != null) {
                    searchResultParam.setResultAttachCard(new C672610QZv(C0QXT.PRODUCT_CARD, (String) value, null, null, null));
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        float f;
        C0QER c0qerV4;
        ViewGroup viewGroupKp;
        super.onViewCreated(view);
        View viewFindViewById = null;
        if (C0BT4.LIZ()) {
            ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageContextAbility.class, null);
            if (iSearchResultSubPageContextAbility != null) {
                c0qerV4 = iSearchResultSubPageContextAbility.v4();
            } else {
                c0qerV4 = null;
            }
            if (C315220CXg.LIZ().LJLI(c0qerV4, false) != null && (viewGroupKp = kp()) != null) {
                viewGroupKp.setBackgroundColor(0);
            }
        }
        C723850SaN.LIZLLL(this, new AwS589S0100000_10(this, 56));
        EcSearchTabViewModel ecSearchTabViewModelLIZ = C0QVX.LIZ(view);
        View view2 = this.LLJJI;
        if (view2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ohz);
            }
            this.LLJJI = (ConstraintLayout) viewFindViewById;
            view2 = viewFindViewById;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        FrameLayout frameLayoutMp = mp();
        if (C0QV7.LIZ()) {
            f = 0.9f;
        } else {
            f = 0.7f;
        }
        ecSearchTabViewModelLIZ.LLILLJJLI = new C21655219p0(viewGroup, view, frameLayoutMp, f, new AwS589S0100000_10(this, 57));
        C736680Sv4.LJIIIZ(this, up(), new C2217381BqS() { // from class: X.0Qh3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C676960Qgw) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Qgy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C676960Qgw) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS659S0100000_10(this, 0), 8);
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qh4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C677050Qh5) obj).LLILLL;
            }
        }, null, new AwS624S0100000_10(this, 10), 6);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void setMaxWidth(int i) {
        int iDx0 = dx0();
        boolean z = false;
        if (iDx0 > 0 && 1 <= i && i < iDx0) {
            z = true;
        }
        GO0(z);
        C1846140y8q c1846140y8qIp = ip();
        if (c1846140y8qIp != null) {
            c1846140y8qIp.setParentMaxWidth(i);
        }
    }

    public final CharSequence tp(C676940Qgu c676940Qgu) {
        String str;
        String str2;
        int iN3;
        String string;
        Integer num = C676970Qgx.LIZ().tabSortShowRecommend;
        if (num != null && num.intValue() == 1) {
            str = "search_sort_recommended";
            str2 = "Recommended";
        } else {
            str = "sort_relevance";
            str2 = "Best match";
        }
        Context context = getContext();
        if (context != null && (iN3 = C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName())) != 0 && (string = context.getString(iN3)) != null) {
            str2 = string;
        }
        String str3 = c676940Qgu.LLILLL;
        if (str3 != null && str3.length() > 0) {
            return str3;
        }
        return str2;
    }

    public final void yp(boolean z) {
        C669790QOz c669790QOz;
        VerticalSearchAbility verticalSearchAbility;
        if (C0QV7.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_search_tab_swipe_padding_fix", true, true) && (c669790QOz = this.LLJLILLLLZIIL) != null) {
            Fragment fragmentLIZIZ = lp().getFragmentItemOperator().LIZIZ(c669790QOz.LIZ(EnumC669620QOi.SHOP));
            if (fragmentLIZIZ != null && (verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZIZ, null), VerticalSearchAbility.class, null)) != null) {
                verticalSearchAbility.CO0(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(com.ss.android.ugc.aweme.search.model.SearchResultParam r5) {
        /*
            r4 = this;
            X.0QXL r0 = X.C0QXL.LIZ
            r0.getClass()
            boolean r0 = X.C0QXL.LIZIZ
            if (r0 != 0) goto La
            return
        La:
            r2 = 0
            r4.LLLI = r2
            r3 = 1
            if (r5 == 0) goto L3a
            X.0QXN r0 = r5.getEcommerceNewUserModel()
            if (r0 == 0) goto L1e
            boolean r0 = r0.landingToNewUserPage
            if (r0 != r3) goto L1e
            r4.LLLI = r3
            if (r5 == 0) goto L3a
        L1e:
            X.0QER r0 = r5.getSearchEnterParam()
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r1 = r0.getEcSearchEntranceData()
            if (r1 == 0) goto L3a
            java.lang.String r0 = "single_tab_type"
            java.lang.String r0 = r1.getStringOrNullStrategy(r0)
            if (r0 == 0) goto L3a
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 != r3) goto L3a
            r4.LLLI = r3
        L3a:
            X.0QOz r0 = r4.LLJLILLLLZIIL
            if (r0 == 0) goto L4c
            java.util.List<X.0QOi> r0 = r0.LIZ
            if (r0 == 0) goto L4c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != r3) goto L4c
            r4.LLLI = r3
        L4c:
            boolean r0 = r4.LLLI
            if (r0 == 0) goto L70
            android.view.View r0 = r4.op()
            r1 = 8
            if (r0 == 0) goto L5b
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L5b:
            android.view.View r0 = r4.sp()
            if (r0 == 0) goto L64
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L64:
            X.15oD r1 = r4.lp()
            boolean r0 = r4.LLLI
            r0 = r0 ^ 1
            r1.setUserInputEnabled(r0)
            return
        L70:
            android.view.View r0 = r4.op()
            if (r0 == 0) goto L79
            X.C786410Ut5.LJLLLLLL(r2, r0)
        L79:
            android.view.View r0 = r4.sp()
            if (r0 == 0) goto L82
            X.C786410Ut5.LJLLLLLL(r2, r0)
        L82:
            android.view.ViewGroup r0 = r4.kp()
            if (r0 == 0) goto L64
            r0.setBackgroundColor(r2)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem.zp(com.ss.android.ugc.aweme.search.model.SearchResultParam):void");
    }

    @Override // X.C0QPH
    public final void pc(C0QUT c0qut, C0QUT c0qut2) {
        IECSearchFilterAbility iECSearchFilterAbility;
        VerticalSearchAbility verticalSearchAbility;
        boolean z;
        try {
            Fragment fragmentLIZIZ = lp().getFragmentItemOperator().LIZIZ(lp().getCurrentItem());
            if (fragmentLIZIZ != null && (verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZIZ, null), VerticalSearchAbility.class, null)) != null) {
                if (c0qut2 != C0QUT.RESULT) {
                    z = true;
                } else {
                    z = false;
                }
                verticalSearchAbility.Jd2(null, z, Long.valueOf(System.currentTimeMillis()));
            }
            C0QUT c0qut3 = C0QUT.RESULT;
            if (c0qut == c0qut3 && c0qut2 != c0qut3 && (iECSearchFilterAbility = (IECSearchFilterAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IECSearchFilterAbility.class, null)) != null) {
                iECSearchFilterAbility.xU1();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0QPH
    public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        IECSearchFilterAbility iECSearchFilterAbility;
        if (c0qut2 == C0QUT.RESULT && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this)) != null && (iECSearchFilterAbility = (IECSearchFilterAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IECSearchFilterAbility.class, null)) != null) {
            iECSearchFilterAbility.Cy2(true);
        }
    }
}
