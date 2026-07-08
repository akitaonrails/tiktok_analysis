package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1175180gge;
import X.C1175450gh5;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1190430h5F;
import X.C1191160h6Q;
import X.C1252710ihh;
import X.C1367960lha;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.C18JG;
import X.EnumC1175380ggy;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeFragment;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS38S1400000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS38S1400000_18 awS38S1400000_18) {
        Object c098200Yq;
        String str;
        int i;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        DynamicMapParams dynamicMapParams;
        EnumC1175380ggy enumC1175380ggy;
        String string;
        String string2;
        String string3;
        String fromGroupId;
        String fromPoiId;
        String enterFrom;
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        Double d;
        String string4;
        Double d2;
        Double d3;
        Double d4;
        String str2 = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHeaderAssem) awS38S1400000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        if (C1175450gh5.LIZIZ() && awS38S1400000_18.s0 != null && ((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF() && ((dynamicMapParams = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams()) == null || !Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE))) {
            C1175180gge c1175180gge = PoiMapModeFragment.LLJJJ;
            Context context = ((ViewGroup) awS38S1400000_18.l3).getContext();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) awS38S1400000_18.l1);
            if (((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).isRegionalPOI()) {
                enumC1175380ggy = EnumC1175380ggy.SCENE_REGION_POI_DETAIL_LANDING;
            } else {
                enumC1175380ggy = EnumC1175380ggy.SCENE_NON_REGION_POI_DETAIL_LANDING;
            }
            PoiMapModeTargetData poiMapModeTargetData = new PoiMapModeTargetData(awS38S1400000_18.s0, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getPoiLocation());
            DynamicMapParams dynamicMapParams2 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams2 != null && (d4 = dynamicMapParams2.lngMax) != null) {
                string = d4.toString();
            } else {
                string = null;
            }
            String str3 = "";
            if (string == null) {
                string = "";
            }
            DynamicMapParams dynamicMapParams3 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams3 == null || (d3 = dynamicMapParams3.latMax) == null || (string2 = d3.toString()) == null) {
                string2 = "";
            }
            DynamicMapParams dynamicMapParams4 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams4 == null || (d2 = dynamicMapParams4.lngMin) == null || (string3 = d2.toString()) == null) {
                string3 = "";
            }
            DynamicMapParams dynamicMapParams5 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams5 != null && (d = dynamicMapParams5.latMin) != null && (string4 = d.toString()) != null) {
                str3 = string4;
            }
            PoiMapModeDataParams poiMapModeDataParams = new PoiMapModeDataParams(poiMapModeTargetData, null, null, awS38S1400000_18.s0, null, null, new MapBounds(string, string2, string3, str3), null);
            MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_ADDRESS;
            if (c1185410gx9 != null) {
                fromGroupId = c1185410gx9.getFromGroupId();
                fromPoiId = c1185410gx9.getFromPoiId();
                enterFrom = c1185410gx9.getEnterFrom();
                enterMethod = c1185410gx9.getEnterMethod();
                initialEnterFrom = c1185410gx9.getInitialEnterFrom();
                initialEnterMethod = c1185410gx9.getInitialEnterMethod();
                initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
                initialPoiId = c1185410gx9.getInitialPoiId();
                adClickId = c1185410gx9.getAdClickId();
            } else {
                fromGroupId = null;
                fromPoiId = null;
                enterFrom = null;
                enterMethod = null;
                initialEnterFrom = null;
                initialEnterMethod = null;
                initialPoiFromGroupId = null;
                initialPoiId = null;
                adClickId = null;
            }
            PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId, fromPoiId, mapModeEnterMethod, enterFrom, enterMethod, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, adClickId, MapModeType.OTHERS, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getCollectInfo(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null), "poi_detail", null);
            c1175180gge.getClass();
            C1175180gge.LIZ(context, interfaceC665370Q7zLJIIL, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams);
        } else {
            PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) awS38S1400000_18.l1;
            poiDetailHeaderAssem.hp(awS38S1400000_18.s0, poiDetailHeaderAssem.ap().getState().LL, (C1184480gve) awS38S1400000_18.l4, MapModeEnterMethod.CLICK_ADDRESS.getEnterMethod(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null));
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailHeaderAssem) awS38S1400000_18.l1).cp().LLILLJJLI;
        if (poiDetailResponse != null) {
            PoiDetailHeaderAssem poiDetailHeaderAssem2 = (PoiDetailHeaderAssem) awS38S1400000_18.l1;
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(poiDetailHeaderAssem2);
            String str4 = poiDetailHeaderAssem2.cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = poiDetailHeaderAssem2.Oo();
            if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
                str = c1184480gve2.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvcOo2 = poiDetailHeaderAssem2.Oo();
            if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
                str2 = c1184480gve.LL;
            }
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                i = distanceInfo.distanceType;
            } else {
                i = 0;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = poiDetailHeaderAssem2.Zo();
            c1185430gxB.getClass();
            C1185430gxB.LJIIJ(interfaceC665370Q7zLJIIL2, str4, collectInfo, str, str2, i, userLocation, pageFinderZo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S1400000_18 awS38S1400000_18) {
        Object c098200Yq;
        String str;
        int i;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        IPoiMapService iPoiMapService;
        DynamicMapParams dynamicMapParams;
        EnumC1175380ggy enumC1175380ggy;
        String string;
        String string2;
        String string3;
        String fromGroupId;
        String fromPoiId;
        String enterFrom;
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        Double d;
        String string4;
        Double d2;
        Double d3;
        Double d4;
        String str2 = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailFoodHeaderAssem) awS38S1400000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        if (C1175450gh5.LIZIZ() && awS38S1400000_18.s0 != null && (iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null)) != null && iPoiMapService.LJFF() && ((dynamicMapParams = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams()) == null || !Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE))) {
            C1175180gge c1175180gge = PoiMapModeFragment.LLJJJ;
            Context context = ((View) awS38S1400000_18.l3).getContext();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailFoodHeaderAssem) awS38S1400000_18.l1);
            if (((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).isRegionalPOI()) {
                enumC1175380ggy = EnumC1175380ggy.SCENE_REGION_POI_DETAIL_LANDING;
            } else {
                enumC1175380ggy = EnumC1175380ggy.SCENE_NON_REGION_POI_DETAIL_LANDING;
            }
            PoiMapModeTargetData poiMapModeTargetData = new PoiMapModeTargetData(awS38S1400000_18.s0, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getPoiLocation());
            DynamicMapParams dynamicMapParams2 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams2 != null && (d4 = dynamicMapParams2.lngMax) != null) {
                string = d4.toString();
            } else {
                string = null;
            }
            String str3 = "";
            if (string == null) {
                string = "";
            }
            DynamicMapParams dynamicMapParams3 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams3 == null || (d3 = dynamicMapParams3.latMax) == null || (string2 = d3.toString()) == null) {
                string2 = "";
            }
            DynamicMapParams dynamicMapParams4 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams4 == null || (d2 = dynamicMapParams4.lngMin) == null || (string3 = d2.toString()) == null) {
                string3 = "";
            }
            DynamicMapParams dynamicMapParams5 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams5 != null && (d = dynamicMapParams5.latMin) != null && (string4 = d.toString()) != null) {
                str3 = string4;
            }
            PoiMapModeDataParams poiMapModeDataParams = new PoiMapModeDataParams(poiMapModeTargetData, null, null, awS38S1400000_18.s0, null, null, new MapBounds(string, string2, string3, str3), null);
            MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_ADDRESS;
            if (c1185410gx9 != null) {
                fromGroupId = c1185410gx9.getFromGroupId();
                fromPoiId = c1185410gx9.getFromPoiId();
                enterFrom = c1185410gx9.getEnterFrom();
                enterMethod = c1185410gx9.getEnterMethod();
                initialEnterFrom = c1185410gx9.getInitialEnterFrom();
                initialEnterMethod = c1185410gx9.getInitialEnterMethod();
                initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
                initialPoiId = c1185410gx9.getInitialPoiId();
                adClickId = c1185410gx9.getAdClickId();
            } else {
                fromGroupId = null;
                fromPoiId = null;
                enterFrom = null;
                enterMethod = null;
                initialEnterFrom = null;
                initialEnterMethod = null;
                initialPoiFromGroupId = null;
                initialPoiId = null;
                adClickId = null;
            }
            PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId, fromPoiId, mapModeEnterMethod, enterFrom, enterMethod, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, adClickId, MapModeType.OTHERS, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getCollectInfo(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null), "poi_detail", null);
            c1175180gge.getClass();
            C1175180gge.LIZ(context, interfaceC665370Q7zLJIIL, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams);
        } else {
            PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = (PoiDetailFoodHeaderAssem) awS38S1400000_18.l1;
            poiDetailFoodHeaderAssem.hp(awS38S1400000_18.s0, poiDetailFoodHeaderAssem.ap().getState().LL, (C1184480gve) awS38S1400000_18.l4, MapModeEnterMethod.CLICK_ADDRESS.getEnterMethod(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null));
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailFoodHeaderAssem) awS38S1400000_18.l1).cp().LLILLJJLI;
        if (poiDetailResponse != null) {
            PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem2 = (PoiDetailFoodHeaderAssem) awS38S1400000_18.l1;
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(poiDetailFoodHeaderAssem2);
            String str4 = poiDetailFoodHeaderAssem2.cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = poiDetailFoodHeaderAssem2.Oo();
            if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
                str = c1184480gve2.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvcOo2 = poiDetailFoodHeaderAssem2.Oo();
            if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
                str2 = c1184480gve.LL;
            }
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                i = distanceInfo.distanceType;
            } else {
                i = 0;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = poiDetailFoodHeaderAssem2.Zo();
            c1185430gxB.getClass();
            C1185430gxB.LJIIJ(interfaceC665370Q7zLJIIL2, str4, collectInfo, str, str2, i, userLocation, pageFinderZo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS38S1400000_18 awS38S1400000_18) {
        Object c098200Yq;
        String str;
        int i;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        IPoiMapService iPoiMapService;
        DynamicMapParams dynamicMapParams;
        EnumC1175380ggy enumC1175380ggy;
        String string;
        String string2;
        String string3;
        String fromGroupId;
        String fromPoiId;
        String enterFrom;
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        Double d;
        String string4;
        Double d2;
        Double d3;
        Double d4;
        String str2 = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHotelHeaderAssem) awS38S1400000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        if (C1175450gh5.LIZIZ() && awS38S1400000_18.s0 != null && (iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null)) != null && iPoiMapService.LJFF() && ((dynamicMapParams = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams()) == null || !Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE))) {
            C1175180gge c1175180gge = PoiMapModeFragment.LLJJJ;
            Context context = ((ViewGroup) awS38S1400000_18.l3).getContext();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) awS38S1400000_18.l1);
            if (((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).isRegionalPOI()) {
                enumC1175380ggy = EnumC1175380ggy.SCENE_REGION_POI_DETAIL_LANDING;
            } else {
                enumC1175380ggy = EnumC1175380ggy.SCENE_NON_REGION_POI_DETAIL_LANDING;
            }
            PoiMapModeTargetData poiMapModeTargetData = new PoiMapModeTargetData(awS38S1400000_18.s0, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getPoiLocation());
            DynamicMapParams dynamicMapParams2 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams2 != null && (d4 = dynamicMapParams2.lngMax) != null) {
                string = d4.toString();
            } else {
                string = null;
            }
            String str3 = "";
            if (string == null) {
                string = "";
            }
            DynamicMapParams dynamicMapParams3 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams3 == null || (d3 = dynamicMapParams3.latMax) == null || (string2 = d3.toString()) == null) {
                string2 = "";
            }
            DynamicMapParams dynamicMapParams4 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams4 == null || (d2 = dynamicMapParams4.lngMin) == null || (string3 = d2.toString()) == null) {
                string3 = "";
            }
            DynamicMapParams dynamicMapParams5 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams5 != null && (d = dynamicMapParams5.latMin) != null && (string4 = d.toString()) != null) {
                str3 = string4;
            }
            PoiMapModeDataParams poiMapModeDataParams = new PoiMapModeDataParams(poiMapModeTargetData, null, null, awS38S1400000_18.s0, null, null, new MapBounds(string, string2, string3, str3), null);
            MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_ADDRESS;
            if (c1185410gx9 != null) {
                fromGroupId = c1185410gx9.getFromGroupId();
                fromPoiId = c1185410gx9.getFromPoiId();
                enterFrom = c1185410gx9.getEnterFrom();
                enterMethod = c1185410gx9.getEnterMethod();
                initialEnterFrom = c1185410gx9.getInitialEnterFrom();
                initialEnterMethod = c1185410gx9.getInitialEnterMethod();
                initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
                initialPoiId = c1185410gx9.getInitialPoiId();
                adClickId = c1185410gx9.getAdClickId();
            } else {
                fromGroupId = null;
                fromPoiId = null;
                enterFrom = null;
                enterMethod = null;
                initialEnterFrom = null;
                initialEnterMethod = null;
                initialPoiFromGroupId = null;
                initialPoiId = null;
                adClickId = null;
            }
            PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId, fromPoiId, mapModeEnterMethod, enterFrom, enterMethod, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, adClickId, MapModeType.OTHERS, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getCollectInfo(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null), "poi_detail", null);
            c1175180gge.getClass();
            C1175180gge.LIZ(context, interfaceC665370Q7zLJIIL, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams);
        } else {
            PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem = (PoiDetailHotelHeaderAssem) awS38S1400000_18.l1;
            poiDetailHotelHeaderAssem.hp(awS38S1400000_18.s0, poiDetailHotelHeaderAssem.ap().getState().LL, (C1184480gve) awS38S1400000_18.l4, MapModeEnterMethod.CLICK_ADDRESS.getEnterMethod(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null));
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailHotelHeaderAssem) awS38S1400000_18.l1).cp().LLILLJJLI;
        if (poiDetailResponse != null) {
            PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem2 = (PoiDetailHotelHeaderAssem) awS38S1400000_18.l1;
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(poiDetailHotelHeaderAssem2);
            String str4 = poiDetailHotelHeaderAssem2.cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = poiDetailHotelHeaderAssem2.Oo();
            if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
                str = c1184480gve2.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvcOo2 = poiDetailHotelHeaderAssem2.Oo();
            if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
                str2 = c1184480gve.LL;
            }
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                i = distanceInfo.distanceType;
            } else {
                i = 0;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = poiDetailHotelHeaderAssem2.Zo();
            c1185430gxB.getClass();
            C1185430gxB.LJIIJ(interfaceC665370Q7zLJIIL2, str4, collectInfo, str, str2, i, userLocation, pageFinderZo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS38S1400000_18 awS38S1400000_18) {
        Object c098200Yq;
        String str;
        int i;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        IPoiMapService iPoiMapService;
        DynamicMapParams dynamicMapParams;
        EnumC1175380ggy enumC1175380ggy;
        String string;
        String string2;
        String string3;
        String fromGroupId;
        String fromPoiId;
        String enterFrom;
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        Double d;
        String string4;
        Double d2;
        Double d3;
        Double d4;
        String str2 = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailTravelHeaderAssemV2) awS38S1400000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        if (C1175450gh5.LIZIZ() && awS38S1400000_18.s0 != null && (iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null)) != null && iPoiMapService.LJFF() && ((dynamicMapParams = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams()) == null || !Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE))) {
            C1175180gge c1175180gge = PoiMapModeFragment.LLJJJ;
            Context context = ((View) awS38S1400000_18.l3).getContext();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS38S1400000_18.l1);
            if (((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).isRegionalPOI()) {
                enumC1175380ggy = EnumC1175380ggy.SCENE_REGION_POI_DETAIL_LANDING;
            } else {
                enumC1175380ggy = EnumC1175380ggy.SCENE_NON_REGION_POI_DETAIL_LANDING;
            }
            PoiMapModeTargetData poiMapModeTargetData = new PoiMapModeTargetData(awS38S1400000_18.s0, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getPoiLocation());
            DynamicMapParams dynamicMapParams2 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams2 != null && (d4 = dynamicMapParams2.lngMax) != null) {
                string = d4.toString();
            } else {
                string = null;
            }
            String str3 = "";
            if (string == null) {
                string = "";
            }
            DynamicMapParams dynamicMapParams3 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams3 == null || (d3 = dynamicMapParams3.latMax) == null || (string2 = d3.toString()) == null) {
                string2 = "";
            }
            DynamicMapParams dynamicMapParams4 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams4 == null || (d2 = dynamicMapParams4.lngMin) == null || (string3 = d2.toString()) == null) {
                string3 = "";
            }
            DynamicMapParams dynamicMapParams5 = ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getDynamicMapParams();
            if (dynamicMapParams5 != null && (d = dynamicMapParams5.latMin) != null && (string4 = d.toString()) != null) {
                str3 = string4;
            }
            PoiMapModeDataParams poiMapModeDataParams = new PoiMapModeDataParams(poiMapModeTargetData, null, null, awS38S1400000_18.s0, null, null, new MapBounds(string, string2, string3, str3), null);
            MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_ADDRESS;
            if (c1185410gx9 != null) {
                fromGroupId = c1185410gx9.getFromGroupId();
                fromPoiId = c1185410gx9.getFromPoiId();
                enterFrom = c1185410gx9.getEnterFrom();
                enterMethod = c1185410gx9.getEnterMethod();
                initialEnterFrom = c1185410gx9.getInitialEnterFrom();
                initialEnterMethod = c1185410gx9.getInitialEnterMethod();
                initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
                initialPoiId = c1185410gx9.getInitialPoiId();
                adClickId = c1185410gx9.getAdClickId();
            } else {
                fromGroupId = null;
                fromPoiId = null;
                enterFrom = null;
                enterMethod = null;
                initialEnterFrom = null;
                initialEnterMethod = null;
                initialPoiFromGroupId = null;
                initialPoiId = null;
                adClickId = null;
            }
            PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId, fromPoiId, mapModeEnterMethod, enterFrom, enterMethod, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, adClickId, MapModeType.OTHERS, ((PoiListApi.PoiDetailResponse) awS38S1400000_18.l2).getCollectInfo(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null), "poi_detail", null);
            c1175180gge.getClass();
            C1175180gge.LIZ(context, interfaceC665370Q7zLJIIL, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams);
        } else {
            PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2 = (PoiDetailTravelHeaderAssemV2) awS38S1400000_18.l1;
            poiDetailTravelHeaderAssemV2.hp(awS38S1400000_18.s0, poiDetailTravelHeaderAssemV2.ap().getState().LL, (C1184480gve) awS38S1400000_18.l4, MapModeEnterMethod.CLICK_ADDRESS.getEnterMethod(), C18JG.LIZ("c74061.d38819", PageFinder.via((View) awS38S1400000_18.l3), null));
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailTravelHeaderAssemV2) awS38S1400000_18.l1).cp().LLILLJJLI;
        if (poiDetailResponse != null) {
            PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV22 = (PoiDetailTravelHeaderAssemV2) awS38S1400000_18.l1;
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(poiDetailTravelHeaderAssemV22);
            String str4 = poiDetailTravelHeaderAssemV22.cp().LL;
            String collectInfo = poiDetailResponse.getCollectInfo();
            C1184460gvc c1184460gvcOo = poiDetailTravelHeaderAssemV22.Oo();
            if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
                str = c1184480gve2.LLILLJJLI;
            } else {
                str = null;
            }
            C1184460gvc c1184460gvcOo2 = poiDetailTravelHeaderAssemV22.Oo();
            if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
                str2 = c1184480gve.LL;
            }
            DistanceInfo distanceInfo = poiDetailResponse.getDistanceInfo();
            if (distanceInfo != null) {
                i = distanceInfo.distanceType;
            } else {
                i = 0;
            }
            Integer userLocation = poiDetailResponse.getUserLocation();
            PageFinder pageFinderZo = poiDetailTravelHeaderAssemV22.Zo();
            c1185430gxB.getClass();
            C1185430gxB.LJIIJ(interfaceC665370Q7zLJIIL2, str4, collectInfo, str, str2, i, userLocation, pageFinderZo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS38S1400000_18 awS38S1400000_18) {
        C1190430h5F c1190430h5F = (C1190430h5F) awS38S1400000_18.l1;
        String str = ((PoiReviewsApi.PoiReviewSummaryModel) awS38S1400000_18.l2).externalUrl;
        String str2 = awS38S1400000_18.s0;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS38S1400000_18.l3;
        PageFinder pageFinder = (PageFinder) awS38S1400000_18.l4;
        c1190430h5F.getClass();
        C1191160h6Q.LIZ.getClass();
        C1191160h6Q.LJJIFFI(pageFinder, interfaceC665370Q7z, "click_banner");
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJJLIIIJLLLLLLLZ(c1190430h5F.getContext(), UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).appendQueryParameter("mob_extra", str2).appendQueryParameter("start_time", String.valueOf(System.currentTimeMillis())).toString());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1400000_18(C1190430h5F c1190430h5F, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1190430h5F;
        this.l2 = poiReviewSummaryModel;
        this.s0 = str;
        this.l3 = interfaceC665370Q7z;
        this.l4 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1400000_18(PoiDetailHeaderAssem poiDetailHeaderAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, ViewGroup viewGroup, C1184480gve c1184480gve, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailHeaderAssem;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = viewGroup;
        this.l4 = c1184480gve;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1400000_18(PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, View view, C1184480gve c1184480gve, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailFoodHeaderAssem;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = view;
        this.l4 = c1184480gve;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1400000_18(PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, ViewGroup viewGroup, C1184480gve c1184480gve, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailHotelHeaderAssem;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = viewGroup;
        this.l4 = c1184480gve;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S1400000_18(PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, String str, PoiListApi.PoiDetailResponse poiDetailResponse, View view, C1184480gve c1184480gve, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailTravelHeaderAssemV2;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = view;
        this.l4 = c1184480gve;
    }
}
