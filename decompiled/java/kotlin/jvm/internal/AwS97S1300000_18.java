package kotlin.jvm.internal;

import X.C09AY;
import X.C1182410gsJ;
import X.C1184710gw1;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1190430h5F;
import X.C1191160h6Q;
import X.C1558520qew;
import X.EnumC1190240h4w;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS97S1300000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS97S1300000_18 awS97S1300000_18, Object obj, Object obj2) {
        float fDoubleValue;
        int iLongValue;
        int value;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = awS97S1300000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS97S1300000_18.l1).getCollectInfo();
        if (collectInfo != null) {
            str2 = collectInfo;
        }
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).score;
        if (d != null) {
            fDoubleValue = (float) d.doubleValue();
        } else {
            fDoubleValue = 0.0f;
        }
        Long l = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).totalCount;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).source;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_Unknown.getValue();
        }
        Integer numValueOf = Integer.valueOf(value);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) awS97S1300000_18.l3);
        PageFinder pageFinderZo = ((PoiDetailHotelHeaderAssem) awS97S1300000_18.l3).Zo();
        C1184710gw1 c1184710gw1 = ((PoiDetailHotelHeaderAssem) awS97S1300000_18.l3).LLJL;
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJL(str, str2, fDoubleValue, iLongValue, numValueOf, interfaceC665370Q7zLJIIL, pageFinderZo, c1184710gw1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS97S1300000_18 awS97S1300000_18, Object obj, Object obj2) {
        float fDoubleValue;
        int iLongValue;
        int value;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = awS97S1300000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS97S1300000_18.l1).getCollectInfo();
        if (collectInfo != null) {
            str2 = collectInfo;
        }
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).score;
        if (d != null) {
            fDoubleValue = (float) d.doubleValue();
        } else {
            fDoubleValue = 0.0f;
        }
        Long l = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).totalCount;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).source;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_Unknown.getValue();
        }
        Integer numValueOf = Integer.valueOf(value);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) awS97S1300000_18.l3);
        PageFinder pageFinderZo = ((PoiDetailHeaderAssem) awS97S1300000_18.l3).Zo();
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJL(str, str2, fDoubleValue, iLongValue, numValueOf, interfaceC665370Q7zLJIIL, pageFinderZo, null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS97S1300000_18 awS97S1300000_18, Object obj, Object obj2) {
        float fDoubleValue;
        int iLongValue;
        int value;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = awS97S1300000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS97S1300000_18.l1).getCollectInfo();
        if (collectInfo != null) {
            str2 = collectInfo;
        }
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).score;
        if (d != null) {
            fDoubleValue = (float) d.doubleValue();
        } else {
            fDoubleValue = 0.0f;
        }
        Long l = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).totalCount;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) awS97S1300000_18.l2).source;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_Unknown.getValue();
        }
        Integer numValueOf = Integer.valueOf(value);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailTravelHeaderAssemV2) awS97S1300000_18.l3);
        PageFinder pageFinderZo = ((PoiDetailTravelHeaderAssemV2) awS97S1300000_18.l3).Zo();
        C1184710gw1 c1184710gw1 = ((PoiDetailTravelHeaderAssemV2) awS97S1300000_18.l3).LLJJJJLIIL;
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJL(str, str2, fDoubleValue, iLongValue, numValueOf, interfaceC665370Q7zLJIIL, pageFinderZo, c1184710gw1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS97S1300000_18 awS97S1300000_18, Object obj, Object obj2) {
        C1190430h5F c1190430h5F = (C1190430h5F) awS97S1300000_18.l1;
        if (!c1190430h5F.LLILZIL) {
            c1190430h5F.LLILZIL = true;
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            String str = awS97S1300000_18.s0;
            InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS97S1300000_18.l2;
            PageFinder pageFinder = (PageFinder) awS97S1300000_18.l3;
            c1191160h6Q.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
            C1189060h32.LJJ("tabelog_rating", str, linkedHashMap);
            C1189060h32.LJJ("enter_from", "poi_reviews", linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("ttls_review_tabelog_banner_show", linkedHashMap, c1185050gwZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S1300000_18(C1190430h5F c1190430h5F, String str, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, int i) {
        super(2);
        this.$t = i;
        this.l1 = c1190430h5F;
        this.s0 = str;
        this.l2 = interfaceC665370Q7z;
        this.l3 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S1300000_18(String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailHeaderAssem poiDetailHeaderAssem, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = poiReviewSummaryModel;
        this.l3 = poiDetailHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S1300000_18(String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = poiReviewSummaryModel;
        this.l3 = poiDetailHotelHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S1300000_18(String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = poiReviewSummaryModel;
        this.l3 = poiDetailTravelHeaderAssemV2;
    }
}
