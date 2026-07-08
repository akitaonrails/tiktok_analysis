package kotlin.jvm.internal;

import X.C09AY;
import X.C1184710gw1;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1190970h67;
import X.C1191160h6Q;
import X.C123100dR;
import X.C1558520qew;
import X.EnumC1179480gna;
import X.EnumC1190240h4w;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS40S2200000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S2200000_18 awS40S2200000_18, Object obj, Object obj2) {
        long jLongValue;
        int value;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = awS40S2200000_18.s0;
        String str2 = awS40S2200000_18.s1;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = (PoiReviewsApi.PoiReviewSummaryModel) awS40S2200000_18.l2;
        Double d = poiReviewSummaryModel.score;
        Long l = poiReviewSummaryModel.totalCount;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) awS40S2200000_18.l2).source;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
        }
        PageFinder pageFinder = ((C1190970h67) awS40S2200000_18.l3).getPageFinder();
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIIZI("poi_reviews", str, str2, d, jLongValue, value, true, null, null, pageFinder);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S2200000_18 awS40S2200000_18, Object obj, Object obj2) {
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = awS40S2200000_18.s0;
        String str2 = awS40S2200000_18.s1;
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) awS40S2200000_18.l2).score;
        PageFinder pageFinder = ((C1190970h67) awS40S2200000_18.l3).getPageFinder();
        c1191160h6Q.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_reviews");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("poi_id", str);
        C1189060h32.LIZ(str2, linkedHashMap);
        linkedHashMap.put("rating", String.valueOf(d));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_rating_rules_entrance_show", linkedHashMap, c1185050gwZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS40S2200000_18 awS40S2200000_18, Object obj, Object obj2) {
        String strMobPicMode;
        String strMobPicMode2 = null;
        if (C123100dR.LIZ(awS40S2200000_18.s0)) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS40S2200000_18.l2);
            String strValueOf = String.valueOf(EnumC1179480gna.POI_DETAIL_TAG_OPENING_STATUS.getValue());
            PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) awS40S2200000_18.l3;
            if (poiDetailResponse != null) {
                strMobPicMode = poiDetailResponse.mobPicMode();
            } else {
                strMobPicMode = null;
            }
            PageFinder pageFinderZo = ((PoiDetailTravelHeaderAssemV2) awS40S2200000_18.l2).Zo();
            C1184710gw1 c1184710gw1 = ((PoiDetailTravelHeaderAssemV2) awS40S2200000_18.l2).LLJJJJLIIL;
            c1185430gxB.getClass();
            C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL, false, null, strValueOf, strMobPicMode, "ordinary", pageFinderZo, c1184710gw1);
        }
        if (C123100dR.LIZ(awS40S2200000_18.s1)) {
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS40S2200000_18.l2);
            String strValueOf2 = String.valueOf(EnumC1179480gna.POI_DETAIL_TAG_TYPE_OPENING_TIME.getValue());
            PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) awS40S2200000_18.l3;
            if (poiDetailResponse2 != null) {
                strMobPicMode2 = poiDetailResponse2.mobPicMode();
            }
            PageFinder pageFinderZo2 = ((PoiDetailTravelHeaderAssemV2) awS40S2200000_18.l2).Zo();
            C1184710gw1 c1184710gw12 = ((PoiDetailTravelHeaderAssemV2) awS40S2200000_18.l2).LLJJJJLIIL;
            c1185430gxB2.getClass();
            C1185430gxB.LJJJ(interfaceC665370Q7zLJIIL2, false, null, strValueOf2, strMobPicMode2, "ordinary", pageFinderZo2, c1184710gw12);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2200000_18(String str, PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l2 = poiDetailTravelHeaderAssemV2;
        this.l3 = poiDetailResponse;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2200000_18(String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, C1190970h67 c1190970h67, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = poiReviewSummaryModel;
        this.l3 = c1190970h67;
    }
}
