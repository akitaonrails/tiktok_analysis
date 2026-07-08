package com.ss.android.ugc.aweme.poi.recommendfeature.detail;

import X.C01GW;
import X.C1083110eI9;
import X.C1173300gdc;
import X.C1175220ggi;
import X.C1180090goZ;
import X.C1180170goh;
import X.C1180440gp8;
import X.C1180620gpQ;
import X.C1180920gpu;
import X.C1181080gqA;
import X.C1181930grX;
import X.C1182410gsJ;
import X.C1183120gtS;
import X.C1183210gtb;
import X.C1183220gtc;
import X.C1183340gto;
import X.C1183350gtp;
import X.C1183360gtq;
import X.C1183420gtw;
import X.C1184000gus;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1189690h43;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
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
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.api.PoiCategoryFeatureDetailListApi;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.desc.PoiRecommendFeatureDetailDescModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabEntityIdAbility;
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
public final class PoiCategoryFeatureDetailFragment extends SlashFragment<C1183120gtS> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEhLSYjJCI2JiEqLC4nPTHELIOScpZys2PCQlJWEDJywPKDs2Lyo+MAk2KTE5OyoXLTEtICMVOiQrJCo9PA==";
    public final C01GW LLLLIIIILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(444), "poi_id", String.class);
    public final C01GW LLLLIIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(443), "entity_id", String.class);
    public final C01GW LLLLIILL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(557), "data_version", String.class);
    public final C01GW LLLLIILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(559), "poi_session_id", String.class);
    public final C01GW LLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(558), "poi_category_feature_mob_params", C1183220gtc.class);
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;

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
    public final boolean uU() {
        return false;
    }

    public final C1183210gtb NV() {
        return (C1183210gtb) this.LLLLILI.getValue();
    }

    @Override // X.InterfaceC1181010gq3
    public final C1181930grX Pu2() {
        return (C1181930grX) this.LLLLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final C1173300gdc<C1183120gtS> fT() {
        return new C1173300gdc<>(new C1183120gtS(NV()));
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final InterfaceC1181300gqW hT() {
        return new InterfaceC1181300gqW() { // from class: X.0gti
            @Override // X.InterfaceC1181300gqW
            public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
                String string;
                PoiCategoryFeatureDetailListApi.LIZ.getClass();
                PoiCategoryFeatureDetailListApi poiCategoryFeatureDetailListApiLIZ = C1172770gcl.LIZ();
                String str = slashRequestParam.scene;
                String str2 = slashRequestParam.serviceType;
                Object obj = slashRequestParam.slashParam;
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                return poiCategoryFeatureDetailListApiLIZ.requestPage(str, str2, string, slashRequestParam.businessQueryParam).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gtk
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
        return new InterfaceC1181300gqW() { // from class: X.0gtg
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1181300gqW
            public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
                String string;
                PoiCategoryFeatureDetailListApi.LIZ.getClass();
                PoiCategoryFeatureDetailListApi poiCategoryFeatureDetailListApiLIZ = C1172770gcl.LIZ();
                String str = slashRequestParam.scene;
                String str2 = slashRequestParam.serviceType;
                Object obj = slashRequestParam.slashParam;
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                return poiCategoryFeatureDetailListApiLIZ.requestPage(str, str2, string, slashRequestParam.businessQueryParam).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gtl
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

    public PoiCategoryFeatureDetailFragment() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLLLILI = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1718));
        this.LLLLJ = C452501pT.LIZ(enumC452301pR, AFwS206S0000000_18.get$arr$(445));
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashRequestParam jT() throws JSONException {
        C1183210gtb c1183210gtbNV = NV();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_chunk", false);
        jSONObject.put("is_event", false);
        String str = c1183210gtbNV.scene;
        String str2 = c1183210gtbNV.serviceType;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("poi_id", c1183210gtbNV.poiId);
        linkedHashMap.put("entity_id", c1183210gtbNV.entityId);
        linkedHashMap.put("cursor", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("count", "18");
        return new SlashRequestParam(str, str2, jSONObject, linkedHashMap, null, null);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment
    public final SlashRequestParam NU(SlashRequestParam slashRequestParam) {
        String strLc1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(slashRequestParam.businessQueryParam);
        C1083110eI9.LIZ(linkedHashMap, "poi_id", NV().poiId);
        C1083110eI9.LIZ(linkedHashMap, "data_version", NV().dataVersion);
        PoiRecommendFeatureDetailTabEntityIdAbility poiRecommendFeatureDetailTabEntityIdAbility = (PoiRecommendFeatureDetailTabEntityIdAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), PoiRecommendFeatureDetailTabEntityIdAbility.class, null);
        if (poiRecommendFeatureDetailTabEntityIdAbility == null || (strLc1 = poiRecommendFeatureDetailTabEntityIdAbility.lc1()) == null) {
            strLc1 = NV().entityId;
        }
        C1083110eI9.LIZ(linkedHashMap, "entity_id", strLc1);
        return slashRequestParam.copy(slashRequestParam.scene, slashRequestParam.serviceType, slashRequestParam.slashParam, linkedHashMap, slashRequestParam.customBusinessQueryParam, slashRequestParam.businessBodyParam);
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
            if (!C1183420gtw.LIZ) {
                C1183420gtw.LIZ = true;
                C1180090goZ c1180090goZ = new C1180090goZ("poi_recommend_feature_navigation_bar");
                C1189690h43 c1189690h43 = new C1189690h43();
                if (C1180170goh.LIZIZ(c1189690h43) == null) {
                    C1180170goh.LIZIZ.put(c1180090goZ, c1189690h43);
                }
                C1180090goZ c1180090goZ2 = new C1180090goZ("poi_recommend_feature_detail_tab");
                C1181080gqA c1181080gqA = new C1181080gqA();
                HashMap<C1180090goZ, InterfaceC1180970gpz> map = C1180170goh.LIZIZ;
                map.put(c1180090goZ2, c1181080gqA);
                map.put(new C1180090goZ("poi_recommend_feature_detail_desc"), new C1180440gp8());
                map.put(new C1180090goZ("poi_recommend_feature_detail_feed"), new C1183340gto());
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
        C18JG.LJII(this, "a4257.b20114", str);
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
            PoiPageMobCommonParams poiPageMobCommonParams = new PoiPageMobCommonParams(str, null, "poi_industry_info_detail_page", null);
            C1183220gtc c1183220gtc2 = NV().mobParams;
            if (c1183220gtc2 != null) {
                str2 = c1183220gtc2.enterFrom;
            } else {
                str2 = null;
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJI, new PoiCommonMobParams(null, poiPageMobCommonParams, new PoiModuleMobCommonParams(str2, "poi_industry_info_detail_page", null), "PoiCommonMobParams"), PoiCommonMobParams.class, "source_default_key");
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", PoiCommonMobParams.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new C1175220ggi(this));
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        c1185430gxB.getClass();
        C1185430gxB.LJJLIIIJILLIZJL(pageFinderVia, interfaceC665370Q7zLJFF);
    }

    @Override // com.ss.android.ugc.aweme.slash.page.SlashFragment, X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
        String collectInfo;
        super.mC(c1180620gpQ, enumC1181510gqr, z, str);
        if (z && enumC1181510gqr == EnumC1181510gqr.REQUEST) {
            PoiRecommendFeatureDetailDescModule poiRecommendFeatureDetailDescModule = (PoiRecommendFeatureDetailDescModule) qw("poi_recommend_feature_detail_desc");
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String str2 = NV().entityId;
            if (poiRecommendFeatureDetailDescModule != null) {
                collectInfo = poiRecommendFeatureDetailDescModule.getCollectInfo();
            } else {
                collectInfo = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            c1185430gxB.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
            C1189060h32.LJJIFFI(c2344009Gk, "entity_id", str2);
            C1189060h32.LJJIFFI(c2344009Gk, "ai_collect_info", collectInfo);
            C1189060h32.LIZJ(c2344009Gk, collectInfo);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            Map<String, String> map = c2344009Gk.LIZ;
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("ttls_poi_industry_info_detail_page_show", map, c1185050gwZ);
        }
    }
}
