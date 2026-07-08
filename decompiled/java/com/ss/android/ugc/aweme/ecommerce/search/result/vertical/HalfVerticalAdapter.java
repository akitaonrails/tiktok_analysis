package com.ss.android.ugc.aweme.ecommerce.search.result.vertical;

import X.C01GW;
import X.C098200Yq;
import X.C0QER;
import X.C0QSJ;
import X.C0QYH;
import X.C0QYZ;
import X.C1205904nh;
import X.C139100g1;
import X.C139200g2;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1766870w4z;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2229651COl;
import X.C616540OGe;
import X.C650500PfM;
import X.C669590QOf;
import X.C669710QOr;
import X.C669750QOv;
import X.C670060QQa;
import X.C672090QXv;
import X.C672890QaN;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC669620QOi;
import X.EnumC669690QOp;
import X.EnumC670440QRm;
import X.InterfaceC1146704e9;
import X.InterfaceC675660Qeq;
import X.InterfaceC687730QyJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.ECSearchJatoConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class HalfVerticalAdapter extends AmeBaseFragment implements ISearchVerticalContext, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+HELIOSKid9OiA/PCMnZjMpOzs6KyQgZwcyJCMaLD0nISYtJQ43KTU4LD0=";
    public TuxTextView LL;
    public SearchResultParam LLILLJJLI;
    public long LLILLL;
    public Long LLILZ;
    public Function1<? super EnumC669690QOp, Unit> LLILZIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final int LJLJJL() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final String Nb1() {
        return "a2270.b8047.c0.d0";
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
        C0QER searchEnterParam;
        SearchResultParam searchResultParam = this.LLILLJJLI;
        ECSearchEntranceData ecSearchEntranceData = (searchResultParam == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null) ? null : searchEnterParam.getEcSearchEntranceData();
        String strLIZ = C670060QQa.LIZ(ecSearchEntranceData != null ? Integer.valueOf(C650500PfM.LIZ(ecSearchEntranceData)) : null, ecSearchEntranceData, EnumC670440QRm.HALF_SHOP.getValue());
        C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
        return new C0QYH(null, null, null, null, null, strLIZ, null, null, null, C669590QOf.LIZ().LIZJ(), null, 24319);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C0QYZ Zm() {
        String strLJIJ;
        String strLJIJ2;
        ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        if (iCommonFeedApiService == null || (strLJIJ = iCommonFeedApiService.LJIJ()) == null) {
            strLJIJ = "";
        }
        ICommonFeedApiService iCommonFeedApiService2 = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        if (iCommonFeedApiService2 == null || (strLJIJ2 = iCommonFeedApiService2.LJIJ()) == null) {
            strLJIJ2 = "";
        }
        return new C0QYZ(null, null, null, strLJIJ, strLJIJ2);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C19EG activity = getActivity();
        if (activity != null) {
            C1554960qZC.LIZLLL(C1558360qeg.LJI(activity, null), C672890QaN.class, "source_default_key");
        }
        if (((Boolean) C139100g1.LIZ.getValue()).booleanValue()) {
            this.LLILZIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.Jd2(EnumC669620QOi.SHOP, true, Long.valueOf(this.LLILLL));
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), ISearchVerticalContext.class, null);
        this.LL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLILLL = System.currentTimeMillis();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.hf1(false, false);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(HalfVerticalAdapter.class.getName());
        }
        super.onResume();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.hf1(true, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final SearchResultParam Tb() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final Long lS1() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String sourceBtmToken;
        String string;
        C0QER searchEnterParam;
        C0QER searchEnterParam2;
        Long endToEndSession;
        String enterMethod;
        SearchResultParam searchResultParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String ecSearchSessionId = null;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("search_key");
            if (serializable instanceof SearchResultParam) {
                searchResultParam = (SearchResultParam) serializable;
            } else {
                searchResultParam = null;
            }
            this.LLILLJJLI = searchResultParam;
        }
        C669710QOr.LIZ.getClass();
        C01GW c01gw = C669710QOr.LIZJ;
        if (((ECSearchJatoConfig) c01gw.getValue()).enableJatoOptimize) {
            ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJII(((ECSearchJatoConfig) c01gw.getValue()).jatoDuration, 2, 4, 1);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C1554960qZC.LIZ(C1558360qeg.LJI(activity, null), new C672890QaN(), C672890QaN.class, "source_default_key");
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        SearchResultParam searchResultParam2 = this.LLILLJJLI;
        if (searchResultParam2 != null) {
            sourceBtmToken = searchResultParam2.getSourceBtmToken();
        } else {
            sourceBtmToken = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b8047", sourceBtmToken);
        SearchResultParam searchResultParam3 = this.LLILLJJLI;
        if (searchResultParam3 != null && (enterMethod = searchResultParam3.getEnterMethod()) != null) {
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            BcmParams bcmParams = new BcmParams();
            bcmParams.put("search_source", enterMethod);
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, Boolean.FALSE);
        }
        if (!((Boolean) C139200g2.LIZ.getValue()).booleanValue()) {
            C1766870w4z c1766870w4z = C1766870w4z.LIZ;
            List listSingletonList = Collections.singletonList(PageFinder.via(btmSDK.getLastCreatePage()));
            Pair[] pairArr = new Pair[2];
            SearchResultParam searchResultParam4 = this.LLILLJJLI;
            if (searchResultParam4 != null && (searchEnterParam2 = searchResultParam4.getSearchEnterParam()) != null && (endToEndSession = searchEnterParam2.getEndToEndSession()) != null) {
                string = endToEndSession.toString();
            } else {
                string = null;
            }
            pairArr[0] = new Pair("end_to_end_search_session_id", string);
            SearchResultParam searchResultParam5 = this.LLILLJJLI;
            if (searchResultParam5 != null && (searchEnterParam = searchResultParam5.getSearchEnterParam()) != null) {
                ecSearchSessionId = searchEnterParam.getEcSearchSessionId();
            }
            pairArr[1] = new Pair("search_session_id", ecSearchSessionId);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (!C1205904nh.LIZ()) {
                mapLJIIJ.put("ec_has_search_container", "1");
                mapLJIIJ.put("search_jump_in_num", CardStruct.IStatusCode.DEFAULT);
            }
            c1766870w4z.getClass();
            C1766870w4z.LJ(true, listSingletonList, mapLJIIJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, ISearchVerticalContext.class, null, null);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.fh4);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (TuxTextView) viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById, 0);
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 153), 3);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 154), 3);
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.XZ1();
        }
        VerticalSearchAbility verticalSearchAbility2 = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility2 != null) {
            verticalSearchAbility2.ga0(false);
        }
        VerticalSearchAbility verticalSearchAbility3 = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility3 != null) {
            verticalSearchAbility3.Jd2(EnumC669620QOi.SHOP, false, Long.valueOf(System.currentTimeMillis()));
        }
        VerticalSearchAbility verticalSearchAbility4 = (VerticalSearchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility4 != null) {
            verticalSearchAbility4.iC0(new InterfaceC675660Qeq() { // from class: X.0QOn
                @Override // X.InterfaceC675660Qeq
                public final void LIZ(EnumC669690QOp enumC669690QOp) {
                    Function1<? super EnumC669690QOp, Unit> function1;
                    if (C669680QOo.LIZ[enumC669690QOp.ordinal()] == 1 && (function1 = this.LIZ.LLILZIL) != null) {
                        function1.invoke(enumC669690QOp);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(getContext()), R.layout.bse, viewGroup, false);
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
    public final void GG0(String str, SearchApiResult searchApiResult, EnumC669620QOi enumC669620QOi, SearchResultParam searchResultParam, String str2, String str3) {
        String imprId;
        String searchChannel;
        String newSource;
        Long lValueOf;
        C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
        C669750QOv c669750QOvLIZ = C669590QOf.LIZ();
        LogPbBean logPbBean = searchApiResult.logPb;
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
        c669750QOvLIZ.LJIJJLI(new LastSearch(str, imprId, searchChannel, newSource, lValueOf, 0L));
        C672090QXv.LIZIZ(C1558360qeg.LJFF(this, null), str2, searchResultParam, enumC669620QOi, searchApiResult);
    }
}
