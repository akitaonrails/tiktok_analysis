package com.ss.android.ugc.aweme.poi.recommendfeature.list;

import X.C01GW;
import X.C1083110eI9;
import X.C1173300gdc;
import X.C1175240ggk;
import X.C1180090goZ;
import X.C1180170goh;
import X.C1180370gp1;
import X.C1180620gpQ;
import X.C1180920gpu;
import X.C1181930grX;
import X.C1182410gsJ;
import X.C1183220gtc;
import X.C1183240gte;
import X.C1183250gtf;
import X.C1183350gtp;
import X.C1183360gtq;
import X.C1183430gtx;
import X.C1183730guR;
import X.C1184000gus;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1188440h22;
import X.C1189690h43;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C18JG;
import X.C19EG;
import X.C2344009Gk;
import X.C298360Bmk;
import X.C452501pT;
import X.EnumC1181510gqr;
import X.EnumC1181540gqu;
import X.EnumC452301pR;
import X.InterfaceC1180800gpi;
import X.InterfaceC1180970gpz;
import X.InterfaceC1181300gqW;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.api.PoiCategoryFeatureListApi;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.PoiCategoryFeatureLoadingAssem;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiCategoryFeatureListFragment extends SlashFragment<C1183250gtf> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhLSYjJCI2JiEqLCHELIOS4nPTcpZyM6OzFiGSA6CyQ4LCg8OjwKLC4nPTcpBSYgPAM+KCg+LSs4";
    public final C01GW LLLLIIIILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(446), "poi_id", String.class);
    public final C01GW LLLLIIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(567), "poi_session_id", String.class);
    public final C01GW LLLLIILL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(561), "data_version", String.class);
    public final C01GW LLLLIILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(566), "poi_detail_response", PoiListApi.PoiDetailResponse.class);
    public final C01GW LLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(565), "poi_detail_params", C1185410gx9.class);
    public final C01GW LLLLILI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(563), "poi_anchor_data", C1188440h22.class);
    public final C01GW LLLLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(564), "poi_anchor_mob_data", C1185490gxH.class);
    public final C01GW LLLLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(562), "poi_category_feature_mob_params", C1183220gtc.class);
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C1180620gpQ GV(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr) {
        return c1180620gpQ;
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C13IQ<? extends UIAssem> fV() {
        return C13LE.LIZ(PoiCategoryFeatureLoadingAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashApiResponse gT() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final boolean sV() {
        return true;
    }

    public final C1183240gte NV() {
        return (C1183240gte) this.LLLLL.getValue();
    }

    @Override // X.InterfaceC1181010gq3
    public final C1181930grX Pu2() {
        return (C1181930grX) this.LLLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C1173300gdc<C1183250gtf> fT() {
        return new C1173300gdc<>(new C1183250gtf(NV()));
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1181300gqW hT() {
        return new InterfaceC1181300gqW() { // from class: X.0gtj
            @Override // X.InterfaceC1181300gqW
            public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
                String string;
                PoiCategoryFeatureListApi.LIZ.getClass();
                PoiCategoryFeatureListApi poiCategoryFeatureListApiLIZ = C1172780gcm.LIZ();
                String str = slashRequestParam.scene;
                String str2 = slashRequestParam.serviceType;
                Object obj = slashRequestParam.slashParam;
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                return poiCategoryFeatureListApiLIZ.requestPage(str, str2, string, slashRequestParam.businessQueryParam).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gtm
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        C0X52 c0x52 = (C0X52) obj2;
                        return new SlashApiResponse((SlashPage) c0x52.LIZIZ, c0x52.LIZ.LIZLLL);
                    }
                });
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1181300gqW iT() {
        return new InterfaceC1181300gqW() { // from class: X.0gth
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1181300gqW
            public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
                String string;
                PoiCategoryFeatureListApi.LIZ.getClass();
                PoiCategoryFeatureListApi poiCategoryFeatureListApiLIZ = C1172780gcm.LIZ();
                String str = slashRequestParam.scene;
                String str2 = slashRequestParam.serviceType;
                Object obj = slashRequestParam.slashParam;
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                return poiCategoryFeatureListApiLIZ.requestPage(str, str2, string, slashRequestParam.businessQueryParam).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gtn
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        C0X52 c0x52 = (C0X52) obj2;
                        return new SlashApiResponse((SlashPage) c0x52.LIZIZ, c0x52.LIZ.LIZLLL);
                    }
                });
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1180800gpi sT() {
        return new C1189690h43();
    }

    public PoiCategoryFeatureListFragment() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLLLL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1725));
        this.LLLLLIL = C452501pT.LIZ(enumC452301pR, AFwS206S0000000_18.get$arr$(447));
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashRequestParam jT() throws JSONException {
        C1183240gte c1183240gteNV = NV();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_chunk", false);
        jSONObject.put("is_event", false);
        String str = c1183240gteNV.scene;
        String str2 = c1183240gteNV.serviceType;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("poi_id", c1183240gteNV.poiId);
        linkedHashMap.put("cursor", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("count", "18");
        linkedHashMap.put("data_version", c1183240gteNV.dataVersion);
        return new SlashRequestParam(str, str2, jSONObject, linkedHashMap, null, null);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashRequestParam NU(SlashRequestParam slashRequestParam) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(slashRequestParam.businessQueryParam);
        C1083110eI9.LIZ(linkedHashMap, "poi_id", NV().poiId);
        C1083110eI9.LIZ(linkedHashMap, "data_version", NV().dataVersion);
        return slashRequestParam.copy(slashRequestParam.scene, slashRequestParam.serviceType, slashRequestParam.slashParam, slashRequestParam.businessQueryParam, slashRequestParam.customBusinessQueryParam, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final boolean ZS(C1180620gpQ c1180620gpQ) {
        boolean z;
        List<C1180920gpu> listLJIILIIL;
        if (c1180620gpQ != null && (listLJIILIIL = c1180620gpQ.LJIILIIL()) != null && !listLJIILIIL.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (C298360Bmk.LIZ()) {
            if (!C1183430gtx.LIZ) {
                C1183430gtx.LIZ = true;
                C1180090goZ c1180090goZ = new C1180090goZ("poi_recommend_feature_navigation_bar");
                C1189690h43 c1189690h43 = new C1189690h43();
                if (C1180170goh.LIZIZ(c1189690h43) == null) {
                    C1180170goh.LIZIZ.put(c1180090goZ, c1189690h43);
                }
                C1180090goZ c1180090goZ2 = new C1180090goZ("poi_recommend_feature_list");
                C1180370gp1 c1180370gp1 = new C1180370gp1();
                HashMap<C1180090goZ, InterfaceC1180970gpz> map = C1180170goh.LIZIZ;
                map.put(c1180090goZ2, c1180370gp1);
                map.put(new C1180090goZ("poi_recommend_feature_bottom_bar"), new C1183730guR());
                C1183360gtq c1183360gtq = C1183350gtp.LIZ;
                if (C1180170goh.LIZ == null) {
                    C1180170goh.LIZ = c1183360gtq;
                    return;
                }
                return;
            }
            return;
        }
        C1184000gus.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C1183220gtc c1183220gtc = NV().mobParams;
        if (c1183220gtc != null) {
            str = c1183220gtc.sourceBtmToken;
        } else {
            str = null;
        }
        C18JG.LJII(this, "a4257.b78030", str);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final Pair<EnumC1181540gqu, C13IQ<? extends UIAssem>> lT(Throwable th, boolean z) {
        return new Pair<>(EnumC1181540gqu.COMMON, null);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final Pair<EnumC1181540gqu, C13IQ<? extends UIAssem>> mT(C1180620gpQ c1180620gpQ, boolean z) {
        List<C1180920gpu> listLJIILIIL;
        if (c1180620gpQ != null && (listLJIILIIL = c1180620gpQ.LJIILIIL()) != null && !listLJIILIIL.isEmpty()) {
            return super.mT(c1180620gpQ, false);
        }
        return new Pair<>(EnumC1181540gqu.COMMON, null);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG c19egLIZIZ;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZIZ, null);
            C1183220gtc c1183220gtc = NV().mobParams;
            if (c1183220gtc != null) {
                str = c1183220gtc.enterFrom;
            } else {
                str = null;
            }
            PoiPageMobCommonParams poiPageMobCommonParams = new PoiPageMobCommonParams(str, null, "poi_secondary_industry_info_page", null);
            C1183220gtc c1183220gtc2 = NV().mobParams;
            if (c1183220gtc2 != null) {
                str2 = c1183220gtc2.enterFrom;
            } else {
                str2 = null;
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, new PoiCommonMobParams(null, poiPageMobCommonParams, new PoiModuleMobCommonParams(str2, "poi_secondary_industry_info_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175240ggk(this));
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        c1185430gxB.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_secondary_industry_info_page_show", map, c1185050gwZ);
    }
}
