package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C036E;
import X.C098200Yq;
import X.C1175850ghj;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1252710ihh;
import X.C1309650kBX;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.C19EG;
import X.C23250099c;
import X.C339190DRl;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;

/* JADX INFO: loaded from: classes19.dex */
public class AkS6S1200000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS6S1200000_18 akS6S1200000_18, View view) {
        Object c098200Yq;
        String collectInfo;
        String str;
        String str2;
        Integer numValueOf;
        Integer userLocation;
        String initialEnterFrom;
        String initialEnterMethod;
        DistanceInfo distanceInfo;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1175850ghj c1175850ghj = C1175850ghj.LIZ;
        Context context = ((PoiDetailFoodHeaderAssem) akS6S1200000_18.l1).getContext();
        PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = (PoiDetailFoodHeaderAssem) akS6S1200000_18.l1;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        String str3 = akS6S1200000_18.s0;
        PageFinder pageFinderZo = poiDetailFoodHeaderAssem.Zo();
        c1175850ghj.getClass();
        C1175850ghj.LIZIZ(context, poiDetailFoodHeaderAssem, poiDetailResponse, null, str3, "poi_header", pageFinderZo);
        String initialPoiFromGroupId = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailFoodHeaderAssem) akS6S1200000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
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
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = akS6S1200000_18.s0;
        if (str4 == null) {
            str4 = "";
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse2 != null) {
            collectInfo = poiDetailResponse2.getCollectInfo();
        } else {
            collectInfo = null;
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailFoodHeaderAssem) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailFoodHeaderAssem) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse3 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse3 != null && (distanceInfo = poiDetailResponse3.getDistanceInfo()) != null) {
            numValueOf = Integer.valueOf(distanceInfo.distanceType);
        } else {
            numValueOf = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse4 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse4 != null) {
            userLocation = poiDetailResponse4.getUserLocation();
        } else {
            userLocation = null;
        }
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            initialEnterMethod = c1185410gx9.getInitialEnterMethod();
            initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
        } else {
            initialEnterFrom = null;
            initialEnterMethod = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailFoodHeaderAssem) akS6S1200000_18.l1);
        PageFinder pageFinderZo2 = ((PoiDetailFoodHeaderAssem) akS6S1200000_18.l1).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIFFI(str4, collectInfo, str, str2, numValueOf, userLocation, "click_button", initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, interfaceC665370Q7zLJIIL, pageFinderZo2);
    }

    public static final void LIZ$1(AkS6S1200000_18 akS6S1200000_18, View view) {
        Object c098200Yq;
        String collectInfo;
        String str;
        String str2;
        Integer numValueOf;
        Integer userLocation;
        String initialEnterFrom;
        String initialEnterMethod;
        DistanceInfo distanceInfo;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1175850ghj c1175850ghj = C1175850ghj.LIZ;
        Context context = ((PoiDetailHotelHeaderAssem) akS6S1200000_18.l1).getContext();
        PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem = (PoiDetailHotelHeaderAssem) akS6S1200000_18.l1;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        String str3 = akS6S1200000_18.s0;
        PageFinder pageFinderZo = poiDetailHotelHeaderAssem.Zo();
        c1175850ghj.getClass();
        C1175850ghj.LIZIZ(context, poiDetailHotelHeaderAssem, poiDetailResponse, null, str3, "poi_header", pageFinderZo);
        String initialPoiFromGroupId = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHotelHeaderAssem) akS6S1200000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
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
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = akS6S1200000_18.s0;
        if (str4 == null) {
            str4 = "";
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse2 != null) {
            collectInfo = poiDetailResponse2.getCollectInfo();
        } else {
            collectInfo = null;
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHotelHeaderAssem) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHotelHeaderAssem) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse3 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse3 != null && (distanceInfo = poiDetailResponse3.getDistanceInfo()) != null) {
            numValueOf = Integer.valueOf(distanceInfo.distanceType);
        } else {
            numValueOf = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse4 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse4 != null) {
            userLocation = poiDetailResponse4.getUserLocation();
        } else {
            userLocation = null;
        }
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            initialEnterMethod = c1185410gx9.getInitialEnterMethod();
            initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
        } else {
            initialEnterFrom = null;
            initialEnterMethod = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) akS6S1200000_18.l1);
        PageFinder pageFinderZo2 = ((PoiDetailHotelHeaderAssem) akS6S1200000_18.l1).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIFFI(str4, collectInfo, str, str2, numValueOf, userLocation, "click_button", initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, interfaceC665370Q7zLJIIL, pageFinderZo2);
    }

    public static final void LIZ$2(AkS6S1200000_18 akS6S1200000_18, View view) {
        Object c098200Yq;
        String collectInfo;
        String str;
        String str2;
        Integer numValueOf;
        Integer userLocation;
        String initialEnterFrom;
        String initialEnterMethod;
        DistanceInfo distanceInfo;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1175850ghj c1175850ghj = C1175850ghj.LIZ;
        Context context = ((PoiDetailHeaderAssem) akS6S1200000_18.l1).getContext();
        PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) akS6S1200000_18.l1;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        String str3 = akS6S1200000_18.s0;
        PageFinder pageFinderZo = poiDetailHeaderAssem.Zo();
        c1175850ghj.getClass();
        C1175850ghj.LIZIZ(context, poiDetailHeaderAssem, poiDetailResponse, null, str3, "poi_header", pageFinderZo);
        String initialPoiFromGroupId = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHeaderAssem) akS6S1200000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
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
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = akS6S1200000_18.s0;
        if (str4 == null) {
            str4 = "";
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse2 != null) {
            collectInfo = poiDetailResponse2.getCollectInfo();
        } else {
            collectInfo = null;
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse3 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse3 != null && (distanceInfo = poiDetailResponse3.getDistanceInfo()) != null) {
            numValueOf = Integer.valueOf(distanceInfo.distanceType);
        } else {
            numValueOf = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse4 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse4 != null) {
            userLocation = poiDetailResponse4.getUserLocation();
        } else {
            userLocation = null;
        }
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            initialEnterMethod = c1185410gx9.getInitialEnterMethod();
            initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
        } else {
            initialEnterFrom = null;
            initialEnterMethod = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) akS6S1200000_18.l1);
        PageFinder pageFinderZo2 = ((PoiDetailHeaderAssem) akS6S1200000_18.l1).Zo();
        c1185430gxB.getClass();
        C1185430gxB.LJJIFFI(str4, collectInfo, str, str2, numValueOf, userLocation, "click_button", initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, interfaceC665370Q7zLJIIL, pageFinderZo2);
    }

    public static final void LIZ$3(AkS6S1200000_18 akS6S1200000_18, View view) {
        C339190DRl.LIZIZ(((MyMomentsMainElementsAssem) akS6S1200000_18.l1).LLLLJ);
        C339190DRl.LIZIZ(((MyMomentsMainElementsAssem) akS6S1200000_18.l1).LLLLLLLLL);
        MyMomentsMainElementsAssem myMomentsMainElementsAssem = (MyMomentsMainElementsAssem) akS6S1200000_18.l1;
        View view2 = myMomentsMainElementsAssem.LLLIILIL;
        if (view2 != null) {
            C786410Ut5.I7(new AkS57S0200000_18(myMomentsMainElementsAssem, (MyMomentsData) akS6S1200000_18.l2, 24), view2);
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C339190DRl.LIZLLL(((MyMomentsMainElementsAssem) akS6S1200000_18.l1).LLLIZZ);
                C1390410mHn c1390410mHn = ((MyMomentsMainElementsAssem) akS6S1200000_18.l1).LLLILZLLLI;
                if (c1390410mHn != null) {
                    c1390410mHn.LIZJ();
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(((MyMomentsMainElementsAssem) akS6S1200000_18.l1).Lo()), null, null, new C1309650kBX(akS6S1200000_18.s0, null), 3);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ((MyMomentsMainElementsAssem) akS6S1200000_18.l1);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131823048);
            c1389890mGx.LJIIJJI();
        }
        ((MyMomentsMainElementsAssem) akS6S1200000_18.l1).Zo();
        ((MyMomentsMainElementsAssem) akS6S1200000_18.l1).Vo(false);
    }

    public static final void LIZ$4(AkS6S1200000_18 akS6S1200000_18, View view) {
        Object c098200Yq;
        String collectInfo;
        String str;
        String str2;
        Integer numValueOf;
        Integer userLocation;
        String initialEnterFrom;
        String initialEnterMethod;
        DistanceInfo distanceInfo;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1175850ghj c1175850ghj = C1175850ghj.LIZ;
        Context context = ((PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1).getContext();
        PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2 = (PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        String str3 = akS6S1200000_18.s0;
        PageFinder pageFinderZo = poiDetailTravelHeaderAssemV2.Zo();
        c1175850ghj.getClass();
        C1175850ghj.LIZIZ(context, poiDetailTravelHeaderAssemV2, poiDetailResponse, null, str3, "poi_header", pageFinderZo);
        String initialPoiFromGroupId = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
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
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str4 = akS6S1200000_18.s0;
        if (str4 == null) {
            str4 = "";
        }
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse2 != null) {
            collectInfo = poiDetailResponse2.getCollectInfo();
        } else {
            collectInfo = null;
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo != null && (c1184480gve2 = c1184460gvcOo.LLILLL) != null) {
            str = c1184480gve2.LLILLJJLI;
        } else {
            str = null;
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null) {
            str2 = c1184480gve.LL;
        } else {
            str2 = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse3 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse3 != null && (distanceInfo = poiDetailResponse3.getDistanceInfo()) != null) {
            numValueOf = Integer.valueOf(distanceInfo.distanceType);
        } else {
            numValueOf = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse4 = (PoiListApi.PoiDetailResponse) akS6S1200000_18.l2;
        if (poiDetailResponse4 != null) {
            userLocation = poiDetailResponse4.getUserLocation();
        } else {
            userLocation = null;
        }
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
            initialEnterMethod = c1185410gx9.getInitialEnterMethod();
            initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
        } else {
            initialEnterFrom = null;
            initialEnterMethod = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI((PoiDetailTravelHeaderAssemV2) akS6S1200000_18.l1));
        c1185430gxB.getClass();
        C1185430gxB.LJJIFFI(str4, collectInfo, str, str2, numValueOf, userLocation, "click_button", initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, interfaceC665370Q7zLJIIL, pageFinderVia);
    }

    public AkS6S1200000_18(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
