package com.ss.android.ugc.aweme.ecommerce.search.result.vertical;

import X.C01GW;
import X.C098200Yq;
import X.C0P9D;
import X.C0P9E;
import X.C0P9L;
import X.C0PCY;
import X.C0PR4;
import X.C0PRF;
import X.C0PRI;
import X.C0PRW;
import X.C0PS4;
import X.C0PSG;
import X.C0PSL;
import X.C0PSN;
import X.C0PSP;
import X.C0Q3E;
import X.C0QER;
import X.C0QSJ;
import X.C0QYH;
import X.C0QYZ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1278704zR;
import X.C1388190mED;
import X.C1393800mNG;
import X.C1440005kM;
import X.C1507790pL7;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1766860w4y;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C2037507yX;
import X.C20533215Wg;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2211631BhB;
import X.C2229651COl;
import X.C285950BIr;
import X.C293970Bff;
import X.C315220CXg;
import X.C452501pT;
import X.C584850Mwl;
import X.C616540OGe;
import X.C644910PRh;
import X.C646000PVm;
import X.C647110PZt;
import X.C650500PfM;
import X.C650950Pg5;
import X.C663990Q2r;
import X.C664270Q3t;
import X.C664290Q3v;
import X.C670150QQj;
import X.C672090QXv;
import X.C672890QaN;
import X.C673150Qan;
import X.C679340Qkm;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1740810vOx;
import X.EnumC669620QOi;
import X.InterfaceC1146704e9;
import X.InterfaceC1670800ta2;
import X.InterfaceC1740760vOs;
import X.InterfaceC214902198i;
import X.InterfaceC2211731BhL;
import X.InterfaceC649890PeN;
import X.InterfaceC664230Q3p;
import X.InterfaceC664240Q3q;
import X.InterfaceC664250Q3r;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.EcSearchBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.EcomPersonalizedToastAbility;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class GeneralStoreTabAdapter extends EcSearchBaseFragment implements ISearchVerticalContext, InterfaceC2211731BhL, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+KiHELIOSd9OiA/PCMnZjMpOzs6KyQgZwg2JiA+KCMAPCo+LBsyKgQoKD8nLTc=";
    public TuxTextView LLJJJ;
    public SearchStateViewModel LLJJJJJIL;
    public boolean LLJJJIL = true;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 120));
    public final int LLJJJJLIIL = -1;
    public String LLJJL = "";

    @Override // X.InterfaceC2211731BhL
    public final Object LLFZ() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.EcSearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean NR() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void Yt1(C2229651COl c2229651COl) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchVerticalScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVerticalScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVerticalScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final Long lS1() {
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C0QYH Bf() {
        InterfaceC664230Q3p interfaceC664230Q3pLIZ;
        String str = ((C663990Q2r) C0Q3E.LIZIZ(this).Ww1().LIZJ()).LLIZLLLIL;
        String tabName = EnumC669620QOi.STORE.getTabName();
        String strO = C1ER1.LIZIZ.O();
        InterfaceC664250Q3r interfaceC664250Q3r = this.LLJI;
        return new C0QYH(str, null, null, null, null, "normal", tabName, null, null, strO, (interfaceC664250Q3r == null || (interfaceC664230Q3pLIZ = interfaceC664250Q3r.LIZ()) == null) ? null : interfaceC664230Q3pLIZ.LIZLLL(), 7324);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        if (r2.equals("recom_search") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r2.equals("related_search_keyword") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
    
        if (r2.equals("search_sug") == false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String dS() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.GeneralStoreTabAdapter.dS():java.lang.String");
    }

    @Override // X.InterfaceC2211731BhL, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.STORE_VERTICAL_PAGE.getPageCode();
    }

    public GeneralStoreTabAdapter() {
        InterfaceC664230Q3p interfaceC664230Q3pLIZ;
        InterfaceC664250Q3r interfaceC664250Q3r = this.LLJI;
        this.LLJILLL = (interfaceC664250Q3r == null || (interfaceC664230Q3pLIZ = interfaceC664250Q3r.LIZ()) == null) ? 0 : interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.STORE);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C0QYZ Zm() {
        String strLJ;
        String strLLIIJI;
        InterfaceC664240Q3q interfaceC664240Q3qLIZIZ;
        InterfaceC664240Q3q interfaceC664240Q3qLIZIZ2;
        InterfaceC664230Q3p interfaceC664230Q3pLIZ;
        InterfaceC664230Q3p interfaceC664230Q3pLIZ2;
        C0PCY<C0PRF> c0pcyWg1;
        C0PRF c0prf;
        ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
        int i = (iSearchContextAbilityLIZIZ == null || (c0pcyWg1 = iSearchContextAbilityLIZIZ.Wg1()) == null || (c0prf = (C0PRF) c0pcyWg1.LIZJ()) == null) ? -1 : c0prf.LL;
        InterfaceC664250Q3r interfaceC664250Q3r = this.LLJI;
        boolean z = false;
        if (interfaceC664250Q3r != null && (interfaceC664230Q3pLIZ2 = interfaceC664250Q3r.LIZ()) != null && i == interfaceC664230Q3pLIZ2.getInitIndex()) {
            z = true;
        }
        String strLLIIIL = null;
        if (z || i == this.LLJJIII) {
            strLJ = null;
        } else {
            InterfaceC664250Q3r interfaceC664250Q3r2 = this.LLJI;
            strLJ = (interfaceC664250Q3r2 == null || (interfaceC664230Q3pLIZ = interfaceC664250Q3r2.LIZ()) == null) ? null : interfaceC664230Q3pLIZ.LJ(i);
            if (Intrinsics.LJFF(strLJ, "general_search")) {
                strLJ = "general";
            }
        }
        InterfaceC664250Q3r interfaceC664250Q3r3 = this.LLJI;
        if (interfaceC664250Q3r3 != null && (interfaceC664240Q3qLIZIZ2 = interfaceC664250Q3r3.LIZIZ()) != null) {
            strLLIIIL = interfaceC664240Q3qLIZIZ2.LLIIIL();
        }
        InterfaceC664250Q3r interfaceC664250Q3r4 = this.LLJI;
        if (interfaceC664250Q3r4 == null || (interfaceC664240Q3qLIZIZ = interfaceC664250Q3r4.LIZIZ()) == null || (strLLIIJI = interfaceC664240Q3qLIZIZ.LLIIJI()) == null) {
            strLLIIJI = "";
        }
        return new C0QYZ(strLJ, strLLIIIL, strLLIIJI, ((C0PRF) C0Q3E.LIZIZ(this).Wg1().LIZJ()).LLJ, ((C0PRF) C0Q3E.LIZIZ(this).Wg1().LIZJ()).LLJ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws Throwable {
        super.onDestroy();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG activity = getActivity();
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(this, activity);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1554960qZC.LIZLLL(interfaceC665370Q7zLJJIJLIJ, C672890QaN.class, "source_default_key");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), ISearchVerticalContext.class, null);
        if (C293970Bff.LIZ()) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Context context = getContext();
            C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
            sAFHelper.getClass();
            int iLJIILL = SAFHelper.LJIILL(this, c19egLIZIZ);
            ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
            if (iSearchService != null) {
                iSearchService.LJJLIIIIJ(iLJIILL);
            }
        }
        this.LLJJJ = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.hf1(false, false);
        }
        EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), EcomPersonalizedToastAbility.class, null);
        if (ecomPersonalizedToastAbility != null) {
            ecomPersonalizedToastAbility.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(GeneralStoreTabAdapter.class.getName());
        }
        super.onResume();
        if (getUserVisibleHint()) {
            VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
            if (verticalSearchAbility != null) {
                verticalSearchAbility.hf1(true, false);
            }
            EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), EcomPersonalizedToastAbility.class, null);
            if (ecomPersonalizedToastAbility != null) {
                ecomPersonalizedToastAbility.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2211731BhL
    public final String qz() {
        InterfaceC1740760vOs interfaceC1740760vOs;
        String btmPageCode;
        for (Fragment parentFragment = getParentFragment(); parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC1740760vOs) {
                return ((InterfaceC1740760vOs) parentFragment).getBtmPageCode();
            }
        }
        InterfaceC1670800ta2 activity = getActivity();
        return (!(activity instanceof InterfaceC1740760vOs) || (interfaceC1740760vOs = (InterfaceC1740760vOs) activity) == null || (btmPageCode = interfaceC1740760vOs.getBtmPageCode()) == null) ? "" : btmPageCode;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return C664270Q3t.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final int LJLJJL() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final String Nb1() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final SearchResultParam Tb() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.EcSearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void WR(SearchResultParam searchResultParam) throws JSONException {
        String enterSearchFrom;
        String enterSearchFrom2;
        InterfaceC664250Q3r interfaceC664250Q3r;
        InterfaceC664240Q3q interfaceC664240Q3qLIZIZ;
        String enterSearchFrom3;
        super.WR(searchResultParam);
        this.LLJJJIL = true;
        String str = "";
        if (((Boolean) C285950BIr.LIZ.getValue()).booleanValue()) {
            if (!isViewValid() || (searchResultParam.getForceIndex() != -1 && searchResultParam.getForceIndex() != this.LLJJIII)) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    C786410Ut5.LJJIZ(arguments, "search_key", searchResultParam);
                }
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "setSearchKeyword_1");
                C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam == null || (enterSearchFrom3 = searchEnterParam.getEnterSearchFrom()) == null) {
                    enterSearchFrom3 = "";
                }
                jSONObject.put("enter_from", enterSearchFrom3);
                String enterMethod = searchResultParam.getEnterMethod();
                if (enterMethod != null) {
                    str = enterMethod;
                }
                jSONObject.put("enter_method", str);
                int i = C670150QQj.LJIJ;
                jSONObject.put("tab_name", "store");
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
                return;
            }
        } else if (!isViewValid()) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                C786410Ut5.LJJIZ(arguments2, "search_key", searchResultParam);
            }
            C1507790pL7 c1507790pL72 = C1507790pL7.LIZ;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Scene.SCENE_SERVICE, "setSearchKeyword_2");
            C0QER searchEnterParam2 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam2 == null || (enterSearchFrom = searchEnterParam2.getEnterSearchFrom()) == null) {
                enterSearchFrom = "";
            }
            jSONObject2.put("enter_from", enterSearchFrom);
            String enterMethod2 = searchResultParam.getEnterMethod();
            if (enterMethod2 != null) {
                str = enterMethod2;
            }
            jSONObject2.put("enter_method", str);
            int i2 = C670150QQj.LJIJ;
            jSONObject2.put("tab_name", "store");
            c1507790pL72.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject2);
            return;
        }
        gS(searchResultParam);
        Context context = getContext();
        if (context != null && (interfaceC664250Q3r = this.LLJI) != null && (interfaceC664240Q3qLIZIZ = interfaceC664250Q3r.LIZIZ()) != null) {
            interfaceC664240Q3qLIZIZ.LLIIL(context, searchResultParam);
        }
        C1507790pL7 c1507790pL73 = C1507790pL7.LIZ;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(Scene.SCENE_SERVICE, "setSearchKeyword_3");
        C0QER searchEnterParam3 = searchResultParam.getSearchEnterParam();
        if (searchEnterParam3 == null || (enterSearchFrom2 = searchEnterParam3.getEnterSearchFrom()) == null) {
            enterSearchFrom2 = "";
        }
        jSONObject3.put("enter_from", enterSearchFrom2);
        String enterMethod3 = searchResultParam.getEnterMethod();
        if (enterMethod3 != null) {
            str = enterMethod3;
        }
        jSONObject3.put("enter_method", str);
        int i3 = C670150QQj.LJIJ;
        jSONObject3.put("tab_name", "store");
        c1507790pL73.getClass();
        C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject3);
        hS(false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.EcSearchBaseFragment
    public final void bS(boolean z) {
        super.bS(z);
        if (!z) {
            VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
            if (verticalSearchAbility != null) {
                verticalSearchAbility.hf1(false, false);
            }
            EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), EcomPersonalizedToastAbility.class, null);
            if (ecomPersonalizedToastAbility != null) {
                ecomPersonalizedToastAbility.dismiss();
                return;
            }
            return;
        }
        VerticalSearchAbility verticalSearchAbility2 = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility2 == null) {
            return;
        }
        verticalSearchAbility2.hf1(true, true);
    }

    public final void gS(SearchResultParam searchResultParam) {
        boolean z;
        String enterMethod;
        this.LLJIJIL = searchResultParam;
        ((C0P9D) this.LLJILJILJ.getValue()).LIZ(new C0P9E(searchResultParam.getKeyword(), 2));
        searchResultParam.getSugHint();
        this.LLJJ = searchResultParam.getSearchFrom();
        searchResultParam.getNeedCorrect();
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
        cS(enterMethod);
        if (Intrinsics.LJFF(this.LLJJI, "channel_unknown")) {
            this.LLILZIL.setRecentRequestSearchSourceUnknown(true);
            C0Q3E.LIZIZ(this).fe(new C0P9L());
        }
        if (Intrinsics.LJFF(this.LLJJ, "search_sug")) {
            searchResultParam.getSugType();
        }
    }

    public final void hS(boolean z) {
        boolean z2;
        InterfaceC664230Q3p interfaceC664230Q3pLIZ;
        InterfaceC664240Q3q interfaceC664240Q3qLIZIZ;
        C0PSG filterOption;
        C0PCY<C0PRF> c0pcyWg1;
        C0PRF c0prf;
        if (isViewValid() && getUserVisibleHint() && this.LLJJIJIIJIL) {
            if (this.LLJJJIL) {
                ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
                if (iSearchContextAbilityLIZIZ == null || (c0pcyWg1 = iSearchContextAbilityLIZIZ.Wg1()) == null || (c0prf = (C0PRF) c0pcyWg1.LIZJ()) == null || c0prf.LL != this.LLJJIII) {
                    cS("switch_tab");
                    SearchResultParam searchResultParam = this.LLJIJIL;
                    if (searchResultParam != null) {
                        searchResultParam.setEnterMethod("switch_tab", false);
                    }
                }
                SearchResultParam searchResultParam2 = this.LLJIJIL;
                this.LLJILJIL = searchResultParam2;
                if (searchResultParam2 != null && searchResultParam2.getIsFilterFromSchema()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    SearchResultParam searchResultParam3 = this.LLJIJIL;
                    if (searchResultParam3 != null) {
                        filterOption = searchResultParam3.getFilterOption();
                    } else {
                        filterOption = null;
                    }
                    this.LLILZ = filterOption;
                    if (filterOption != null) {
                        filterOption.setFromSchema(true);
                    }
                    SearchResultParam searchResultParam4 = this.LLJIJIL;
                    if (searchResultParam4 != null) {
                        searchResultParam4.setIsFilterFromSchema(false);
                    }
                }
                SearchResultParam searchResultParam5 = this.LLJIJIL;
                if (searchResultParam5 != null) {
                    searchResultParam5.setFilterOption(null);
                }
                SearchStateViewModel searchStateViewModel = this.LLJJJJJIL;
                if (searchStateViewModel != null) {
                    searchStateViewModel.setIsRefreshingData(true);
                }
                cS(dS());
                SearchResultParam searchResultParam6 = this.LLJIJIL;
                if (searchResultParam6 != null) {
                    searchResultParam6.setEnterMethod(this.LLJJI);
                }
                VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
                if (verticalSearchAbility != null) {
                    verticalSearchAbility.ga0(false);
                }
                InterfaceC664250Q3r interfaceC664250Q3r = this.LLJI;
                if (interfaceC664250Q3r != null && (interfaceC664240Q3qLIZIZ = interfaceC664250Q3r.LIZIZ()) != null) {
                    interfaceC664240Q3qLIZIZ.LLIIIZ();
                }
                this.LLJJJIL = false;
                InterfaceC664250Q3r interfaceC664250Q3r2 = this.LLJI;
                if (interfaceC664250Q3r2 != null && (interfaceC664230Q3pLIZ = interfaceC664250Q3r2.LIZ()) != null && this.LLJILLL == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.TOP)) {
                    return;
                }
                System.currentTimeMillis();
                return;
            }
            C646000PVm c646000PVm = C650950Pg5.Companion;
            C19EG activity = getActivity();
            c646000PVm.getClass();
            C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, activity);
            if (c0ps4LJFF != null) {
                c0ps4LJFF.setLastShowingPageIndex(this.LLJJIII);
            }
            C0Q3E.LIZIZ(this).fe(new C0PSN(this.LLJJIII));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        MutableLiveData<Integer> mutableLiveData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            gS((SearchResultParam) arguments.getSerializable("search_key"));
        }
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJJJJJIL = (SearchStateViewModel) C679340Qkm.LIZIZ(this, activity).get(SearchStateViewModel.class);
        }
        SearchStateViewModel searchStateViewModel = this.LLJJJJJIL;
        if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.searchState) != null) {
            mutableLiveData.observe(this, new AObserverS214S0100000_10(this, 105));
        }
        this.LLIZLLLIL.add(new C647110PZt(this));
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG activity2 = getActivity();
        sAFHelper.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJJIJLIJ = SAFHelper.LJJIJLIJ(this, activity2);
        if (interfaceC665370Q7zLJJIJLIJ != null) {
            C1554960qZC.LIZ(interfaceC665370Q7zLJJIJLIJ, new C672890QaN(), C672890QaN.class, "source_default_key");
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        String sourceBtmToken = null;
        if (iEcomSearchService != null) {
            iEcomSearchService.LJJIL(null, this.LLJIJIL, "store_result_on_create", null);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        SearchResultParam searchResultParam = this.LLJIJIL;
        if (searchResultParam != null) {
            sourceBtmToken = searchResultParam.getSourceBtmToken();
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b16062", sourceBtmToken);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.b16062");
        sbLIZ.append(".c0.d0");
        this.LLJJL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.SearchVisibilityDetectFragmentNew, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        VerticalSearchAbility verticalSearchAbility;
        Object obj;
        Object obj2;
        Object obj3;
        long jCurrentTimeMillis;
        C0QER searchEnterParam;
        String enterSearchFrom;
        C0QER searchEnterParam2;
        Long l;
        Map<String, Object> productJumpParamsMap;
        Map<String, Object> productJumpParamsMap2;
        Map<String, Object> productJumpParamsMap3;
        Object obj4;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/search/result/vertical/GeneralStoreTabAdapter", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkfYvyKU2EurYJ5sakPZWvnOdZrUBdSMNgoSZOBpNyK3pQQT8B94=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj4 = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj4).booleanValue();
        }
        super.setUserVisibleHint(zBooleanValue);
        hS(true);
        if (zBooleanValue) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_name", "store_search");
            SearchResultParam searchResultParam = this.LLJIJIL;
            String str = "";
            if (searchResultParam == null || (productJumpParamsMap3 = searchResultParam.getProductJumpParamsMap()) == null || (obj = productJumpParamsMap3.get("token_type")) == null) {
                obj = "";
            }
            jSONObject.put("token_type", obj);
            SearchResultParam searchResultParam2 = this.LLJIJIL;
            if (searchResultParam2 == null || (productJumpParamsMap2 = searchResultParam2.getProductJumpParamsMap()) == null || (obj2 = productJumpParamsMap2.get("type")) == null) {
                obj2 = "";
            }
            jSONObject.put("type", obj2);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            SearchResultParam searchResultParam3 = this.LLJIJIL;
            if (searchResultParam3 != null && (productJumpParamsMap = searchResultParam3.getProductJumpParamsMap()) != null) {
                obj3 = productJumpParamsMap.get("view_more_click_timestamp");
            } else {
                obj3 = null;
            }
            if ((obj3 instanceof Long) && (l = (Long) obj3) != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            jSONObject.put("duration", jCurrentTimeMillis2 - jCurrentTimeMillis);
            SearchResultParam searchResultParam4 = this.LLJIJIL;
            if (searchResultParam4 != null) {
                searchEnterParam = searchResultParam4.getSearchEnterParam();
            } else {
                searchEnterParam = null;
            }
            jSONObject.put("root_enter_from_type", C650500PfM.LIZIZ(searchEnterParam));
            SearchResultParam searchResultParam5 = this.LLJIJIL;
            if (searchResultParam5 == null || (searchEnterParam2 = searchResultParam5.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam2.getEnterSearchFrom()) == null) {
                enterSearchFrom = "";
            }
            jSONObject.put("enter_from", enterSearchFrom);
            String strDS = dS();
            if (strDS != null) {
                str = strDS;
            }
            jSONObject.put("enter_method", str);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("view_more_click_timestamp", jSONObject);
            C2211631BhB.LJIIZILJ(this, false);
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            C1393800mNG.LIZ(this, c0psl);
            C650950Pg5.Companion.getClass();
            C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, this);
            if (c0ps4LJFF != null) {
                c0ps4LJFF.setSearchLastShowPageIndex(this.LLJJIII);
            }
            C0Q3E.LIZIZ(this).fe(new C0PSP(this.LLJJIII));
            SearchResultParam searchResultParam6 = this.LLJIJIL;
            if (searchResultParam6 != null) {
                searchResultParam6.setIndex(this.LLJJIII);
            }
        } else {
            C2211631BhB.LJIILLIIL(this);
            EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), EcomPersonalizedToastAbility.class, null);
            if (ecomPersonalizedToastAbility != null) {
                ecomPersonalizedToastAbility.dismiss();
            }
        }
        if (isActive() && (verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null)) != null) {
            verticalSearchAbility.hf1(zBooleanValue, false);
        }
        C1440005kM.LIZ(new C2037507yX(zBooleanValue));
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_visible", zBooleanValue);
            iEventCenter.LIZ("general_search_tab_switch_event", C786410Ut5.J3(jSONObject2));
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && zBooleanValue) {
            C20533215Wg.LIZ(GeneralStoreTabAdapter.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ui.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SearchResultParam searchResultParam;
        super.onViewCreated(view, bundle);
        C2211631BhB.LJIIZILJ(this, true);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ISearchVerticalContext.class, null, null);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            View viewFindViewById = this.LLJJJ;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.fh4);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJJ = (TuxTextView) viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById, 0);
        }
        if (bundle == null && (searchResultParam = this.LLJIJIL) != null) {
            WR(searchResultParam);
        }
        cS(dS());
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 152), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(getContext()), R.layout.bse, viewGroup, false);
        if (C315220CXg.LIZ().LJLIIL(this.LLJIJIL, false) != null) {
            viewTd.setBackgroundColor(0);
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

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void GG0(String str, SearchApiResult searchApiResult, EnumC669620QOi enumC669620QOi, SearchResultParam searchResultParam, String str2, String str3) throws Throwable {
        String imprId;
        String searchChannel;
        String newSource;
        Long lValueOf;
        String imprId2;
        int iIntValue;
        int iIntValue2;
        String searchChannel2;
        String newSource2;
        String imprId3;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        LogPbBean logPbBean = searchApiResult.logPb;
        String str4 = "";
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            searchChannel = globalDoodleConfig.getSearchChannel();
        } else {
            searchChannel = null;
        }
        GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            newSource = globalDoodleConfig2.getNewSource();
        } else {
            newSource = null;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = searchApiResult.extra;
        if (serverTimeExtra != null) {
            lValueOf = Long.valueOf(serverTimeExtra.now);
        } else {
            lValueOf = null;
        }
        c1er1.LJIJJLI(new LastSearch(str, imprId, searchChannel, newSource, lValueOf, 0L));
        View view = getView();
        if (view != null) {
            C1766860w4y c1766860w4y = C1766860w4y.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("query", str);
            LogPbBean logPbBean2 = searchApiResult.logPb;
            if (logPbBean2 != null && (imprId3 = logPbBean2.getImprId()) != null) {
                str4 = imprId3;
            }
            jSONObject.put("search_id", str4);
            GlobalDoodleConfig globalDoodleConfig3 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig3 != null) {
                searchChannel2 = globalDoodleConfig3.getSearchChannel();
            } else {
                searchChannel2 = null;
            }
            jSONObject.put("channel", searchChannel2);
            jSONObject.put("source", str3);
            GlobalDoodleConfig globalDoodleConfig4 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig4 != null) {
                newSource2 = globalDoodleConfig4.getNewSource();
            } else {
                newSource2 = null;
            }
            jSONObject.put("enter_method", newSource2);
            jSONObject.put("search_timestamp", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            linkedHashMap.put("ec_search_action", C786410Ut5.J3(jSONObject));
            c1766860w4y.getClass();
            C1766860w4y.LJIILIIL(view, linkedHashMap, true);
        }
        GlobalDoodleConfig globalDoodleConfig5 = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig5 != null) {
            if (!Intrinsics.LJFF(globalDoodleConfig5.getSearchChannel(), "tiktok_mall")) {
                Intrinsics.LJFF(globalDoodleConfig5.getSearchChannel(), "tiktok_ecom");
            }
            this.LLILZIL.setFeedbackSurvey(globalDoodleConfig5.getFeedbackSurvey());
            this.LLILZIL.feelGoodToken.clear();
            HashMap<String, Object> feelGood = globalDoodleConfig5.getFeelGood();
            if (feelGood != null) {
                this.LLILZIL.feelGoodToken.putAll(feelGood);
            }
            ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
            List<FeedbackContents> feedbackSurvey = globalDoodleConfig5.getFeedbackSurvey();
            HashMap<String, Object> feelGood2 = globalDoodleConfig5.getFeelGood();
            if (feelGood2 == null) {
                feelGood2 = new HashMap<>();
            }
            iSearchContextAbilityLIZIZ.fe(new C0PR4(feelGood2, feedbackSurvey));
        }
        LogPbBean logPbBean3 = searchApiResult.logPb;
        if (logPbBean3 != null && (imprId2 = logPbBean3.getImprId()) != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) this.LLJJJJ.getValue();
            C19EG activity = getActivity();
            sAFHelper.getClass();
            Integer numLJJIJIIJI = SAFHelper.LJJIJIIJI(interfaceC214902198i, activity);
            ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = C664290Q3v.LIZ;
            if (numLJJIJIIJI != null) {
                iIntValue = numLJJIJIIJI.intValue();
            } else {
                iIntValue = 0;
            }
            InterfaceC649890PeN interfaceC649890PeNLIZIZ = C664290Q3v.LIZIZ(iIntValue);
            InterfaceC649890PeN interfaceC649890PeN = interfaceC649890PeNLIZIZ;
            if (interfaceC649890PeNLIZIZ == null) {
                C1278704zR c1278704zR = new C1278704zR();
                if (numLJJIJIIJI != null) {
                    iIntValue2 = numLJJIJIIJI.intValue();
                } else {
                    iIntValue2 = 0;
                }
                C664290Q3v.LIZLLL(iIntValue2, c1278704zR);
                interfaceC649890PeN = c1278704zR;
            }
            int i = this.LLJJIII;
            C644910PRh c644910PRh = new C644910PRh();
            c644910PRh.LIZ = imprId2;
            c644910PRh.LIZIZ = aS();
            interfaceC649890PeN.LJI(i, c644910PRh);
            C0PRW c0prw = this.LLILZIL;
            c0prw.setSearchId(imprId2);
            c0prw.setSearchKeyword(aS());
            C0Q3E.LIZIZ(this).fe(new C0PRI(aS(), imprId2, null, null, null, null, 0, null, false, 508));
            c1er1.T(imprId2);
            C584850Mwl.LIZ.LJI(imprId2, logPbBean3);
        }
        SearchStateViewModel searchStateViewModel = this.LLJJJJJIL;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(false);
        }
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG activity2 = getActivity();
        c646000PVm.getClass();
        C0PS4 c0ps4LJFF = C646000PVm.LJFF(this, activity2);
        if (c0ps4LJFF != null) {
            c0ps4LJFF.setLastShowingPageIndex(this.LLJJIII);
        }
        C0Q3E.LIZIZ(this).fe(new C0PSN(this.LLJJIII));
        C672090QXv.LIZIZ(C1558360qeg.LJFF(this, null), str2, searchResultParam, enumC669620QOi, searchApiResult);
    }
}
