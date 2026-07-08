package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.ui;

import X.C01GW;
import X.C036E;
import X.C0PM7;
import X.C0PSG;
import X.C0PYW;
import X.C0PZF;
import X.C0PZI;
import X.C0PZS;
import X.C0Q3E;
import X.C0Q3Q;
import X.C0QER;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C301880BsQ;
import X.C326370Cqp;
import X.C452070Ho5;
import X.C614900O9w;
import X.C644560PPy;
import X.C646000PVm;
import X.C646760PYk;
import X.C649290PdP;
import X.C649980PeW;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C662670Pyz;
import X.C664030Q2v;
import X.C669480QNu;
import X.C724750Sbp;
import X.C7740030o;
import X.EnumC642100PGm;
import X.EnumC669620QOi;
import X.InterfaceC1294060jmO;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS110S0100000_10;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.config.OptimizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicPlaceRequestParamsVM;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicSearchPlaceData;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.DynamicSearchPlaceViewModel;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class DynamicSearchPlaceFragment extends DynamicSearchFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public static final int LLLIZZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiOSHELIOSMyKyA/LC4hKy1iKiAhLWs5IGEXMSstJCYwGyAtOyw7GCktKioVOiQrJCo9PA==";
    public final String LLLIILIL = EnumC669620QOi.PLACE.getTabName();
    public final Gson LLLIL = C7740030o.LIZ().getGson();
    public final AssemVMLazy LLLILZ;
    public final String LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DynamicSearchPlaceFragment.class, "placeVM", "getPlaceVM()Lcom/ss/android/ugc/aweme/search/pages/result/placesearch/core/model/DynamicSearchPlaceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        C0PZS.LIZ.getClass();
        LLLIZZ = ((OptimizeConfig) C0PZS.LIZJ.getValue()).verticalPlace;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final boolean BS() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void kS() {
        this.LLILLJJLI = true;
    }

    public DynamicSearchPlaceFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DynamicSearchPlaceViewModel.class);
        this.LLLILZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 627), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 628), AFwS241S0000000_10.get$arr$(284));
        this.LLLILZJ = "a2270.b0055";
        this.LLJILLL = C644560PPy.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLILZJ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return this.LLLIILIL;
    }

    public final String NS(n nVar) {
        Gson gson = this.LLLIL;
        if (nVar == null) {
            nVar = new n();
            nVar.LJJIII(-1, "status_code");
        }
        boolean z = C0PYW.LIZ;
        return GsonProtectorUtils.toJson(gson, new DynamicSearchPlaceData(nVar, new RequestInfo(C0PYW.LIZLLL(this.LLJILLL))));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) throws JSONException {
        new C646760PYk(c614900O9w.LIZIZ, c614900O9w.LIZ).LIZ(this.LLLFZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final JSONObject qS(C0QER c0qer) throws Throwable {
        boolean z;
        JSONObject jSONObjectQS = super.qS(c0qer);
        try {
            Map<String, String> mapLIZ = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ();
            if (mapLIZ == null || mapLIZ.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                    jSONObjectQS.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObjectQS;
    }

    @Override // X.C0PYZ
    public final void rL(C0PZI c0pzi) {
        String strLJIL;
        String str;
        C664030Q2v c664030Q2v;
        n nVar;
        k kVarLJJIIZ;
        ((C649290PdP) c0pzi).LJIIIZ(C0Q3E.LIZIZ(this));
        String strDS = dS();
        String str2 = this.LLJJIJI;
        C01GW<C669480QNu> c01gw = C669480QNu.LJ;
        String strLIZJ = C326370Cqp.LIZ().LIZJ();
        try {
            SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
            if (searchResultConfigLIZ == null || (nVar = searchResultConfigLIZ.verticalPlace) == null || (kVarLJJIIZ = nVar.LJJIIZ("schema")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                strLJIL = "aweme://lynxview/?channel=fe_search_vertical_lynx&target_handler=search_vertical&bundle=vertical-poi/template.js&use_spark=1&preload_storage_keys=[tt_poi_search_permission]&ab_params=enable_search_network_jsb,show_poi_vertical_search,show_poi_vertical_search_collect,vertical_search_single_feedback,show_single_feedback_V2,tt_search_pressed_state,search_rounded_corners_UI_style_optimization,search_aid_feedback,enable_new_poi_card,refactor_search_vertical&surl=https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/fe_search_vertical_lynx/vertical-poi/template.js";
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(strLJIL).buildUpon();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("keyword", strDS).appendQueryParameter("search_context", strLIZJ).appendQueryParameter("search_source", str2);
            C650950Pg5.Companion.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
            if (c650960Pg6LJII != null && (c664030Q2v = c650960Pg6LJII.searchVideoModel) != null) {
                str = c664030Q2v.groupId;
            } else {
                str = null;
            }
            builderAppendQueryParameter.appendQueryParameter("lastFromGroupId", str);
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = builderBuildUpon.toString();
            c0pzi.LJFF(dynamicPatch, null, false, false, false, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment
    public final void GS(int i, C0PSG c0psg) throws Throwable {
        boolean zLIZIZ;
        Integer num;
        String sugGenerateType;
        String str;
        super.GS(i, c0psg);
        getActivity();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        EnumC642100PGm enumC642100PGm = null;
        if (zLIZIZ) {
            zS();
            String strDS = dS();
            int i2 = LLLIZZ;
            String str2 = this.LLJJIJI;
            String str3 = this.LLILZIL.searchId;
            C01GW<C669480QNu> c01gw = C669480QNu.LJ;
            String strLIZJ = C326370Cqp.LIZ().LIZJ();
            String strLIZ = C0Q3Q.LIZ(lR().get(), this, this.LLJI);
            if (ComplianceServiceProvider.LJI().LJJII()) {
                num = 1;
            } else {
                num = null;
            }
            SearchResultParam searchResultParam = this.LLJI;
            if (searchResultParam != null) {
                sugGenerateType = searchResultParam.getSugGenerateType();
            } else {
                sugGenerateType = null;
            }
            long j = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
            C662670Pyz.LIZ.getClass();
            String strLIZ2 = C662670Pyz.LIZ();
            DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ = C649980PeW.LIZ(this, getActivity());
            if (dynamicPlaceRequestParamsVMLIZ != null) {
                str = dynamicPlaceRequestParamsVMLIZ.LL;
                dynamicPlaceRequestParamsVMLIZ.LL = null;
            } else {
                str = null;
            }
            SearchRequestParam searchRequestParam = new SearchRequestParam(strDS, 0, str2, "", 0, 0, "", str3, 0L, i2, "", null, null, null, null, null, strLIZJ, null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, Long.valueOf(j), null, strLIZ2, null, str, null, null, null, 0, 0, 0, false, null, null, C2097608Jq.LJ());
            AssemVMLazy assemVMLazy = this.LLLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
            ((AbstractSearchDynamicTabViewModel) assemVMLazy.getValue()).vQ2(searchRequestParam);
            DynamicPlaceRequestParamsVM dynamicPlaceRequestParamsVMLIZ2 = C649980PeW.LIZ(this, getActivity());
            if (dynamicPlaceRequestParamsVMLIZ2 != null) {
                dynamicPlaceRequestParamsVMLIZ2.wQ2(null);
                return;
            }
            return;
        }
        SearchNetworkStandardStatusVM searchNetworkStandardStatusVM = this.LLLIIL;
        if (searchNetworkStandardStatusVM != null) {
            enumC642100PGm = searchNetworkStandardStatusVM.LL;
        }
        EnumC642100PGm enumC642100PGm2 = EnumC642100PGm.REFRESH_NO_NETWORK_LOADING;
        if (enumC642100PGm == enumC642100PGm2) {
            return;
        }
        zS();
        SearchNetworkStandardStatusVM searchNetworkStandardStatusVM2 = this.LLLIIL;
        if (searchNetworkStandardStatusVM2 != null) {
            searchNetworkStandardStatusVM2.LL = enumC642100PGm2;
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPostDelay(view, this.LLLIIIL, 2500L);
        }
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        HandlerHook.viewPostDelay(view2, new ARunnableS110S0100000_10(this, 105), 2500L);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0PZP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C647210Pa3) obj).LL;
            }
        }, null, new AwS589S0100000_10(this, 399), null, new C0PZF(this), 10, null);
    }
}
