package kotlin.jvm.internal;

import X.C062U;
import X.C09AY;
import X.C1175120ggY;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1186970gzf;
import X.C18JG;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopCtaBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS173S0400000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS173S0400000_18 awS173S0400000_18, Object obj, Object obj2) {
        PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = (PoiDetailFoodHeaderAssem) awS173S0400000_18.l0;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) awS173S0400000_18.l1;
        PoiListApi.PoiDetailResponse poiDetailResponse2 = (PoiListApi.PoiDetailResponse) awS173S0400000_18.l2;
        poiDetailFoodHeaderAssem.vq(poiDetailResponse, poiDetailResponse2, "new_merchant_tag", new AwS419S0200000_18(poiDetailResponse, poiDetailResponse2, 10), new AwS227S0300000_18((PoiDetailFoodHeaderAssem) awS173S0400000_18.l0, (PoiDetailTag) awS173S0400000_18.l3, (PoiListApi.PoiDetailResponse) awS173S0400000_18.l2, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS173S0400000_18 awS173S0400000_18, Object obj, Object obj2) {
        Integer numValueOf;
        C1186970gzf c1186970gzf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        String activitySource;
        String activityPageId;
        String requestId;
        List<PoiBookingContent> list = ((PoiShopBookingInfo) awS173S0400000_18.l0).contentList;
        String str7 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        int i = 1;
        if (C1175120ggY.LIZJ(numValueOf) <= 1) {
            i = 0;
        }
        PoiDetailHeaderPoiShopCtaBaseAssem poiDetailHeaderPoiShopCtaBaseAssem = (PoiDetailHeaderPoiShopCtaBaseAssem) awS173S0400000_18.l1;
        PoiShopBookingInfo poiShopBookingInfo = (PoiShopBookingInfo) awS173S0400000_18.l0;
        String strLLIIJI = poiDetailHeaderPoiShopCtaBaseAssem.LLIIJI();
        if (strLLIIJI == null) {
            if (i != 0) {
                strLLIIJI = "click_list";
            } else {
                strLLIIJI = "click_button";
            }
        }
        String str8 = ((PoiShopBookingInfo) awS173S0400000_18.l0).trackInfo;
        String strLIZLLL = C18JG.LIZLLL(PageFinder.via((View) awS173S0400000_18.l2), "c74061.d0923", (BcmParams) awS173S0400000_18.l3);
        PageFinder pageFinder = (PageFinder) ((PoiDetailHeaderPoiShopCtaBaseAssem) awS173S0400000_18.l1).LLJJIJIIJIL.getValue();
        C062U c062uKp = poiDetailHeaderPoiShopCtaBaseAssem.kp();
        if (c062uKp != null) {
            c1186970gzf = c062uKp.LLILLJJLI;
        } else {
            c1186970gzf = null;
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        Integer num = poiShopBookingInfo.provider;
        if (c1186970gzf != null) {
            str7 = c1186970gzf.poiId;
            str = c1186970gzf.poiRegionCode;
            str2 = c1186970gzf.poiCity;
            str3 = c1186970gzf.ttTypeCode;
            str4 = c1186970gzf.collectInfo;
            str5 = c1186970gzf.entranceEnterFrom;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        if (str5 == null) {
            str5 = "";
        }
        if (c1186970gzf == null || (str6 = c1186970gzf.entranceEnterMethod) == null) {
            str6 = "";
        }
        C1185410gx9 c1185410gx9 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx92 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx92 == null || (initialEnterMethod = c1185410gx92.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1185410gx9 c1185410gx93 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx93 == null || (initialPoiFromGroupId = c1185410gx93.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        C1185410gx9 c1185410gx94 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx94 == null || (initialPoiId = c1185410gx94.getInitialPoiId()) == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx95 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx95 == null || (adClickId = c1185410gx95.getAdClickId()) == null) {
            adClickId = "";
        }
        C1185410gx9 c1185410gx96 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx96 == null || (activitySource = c1185410gx96.getActivitySource()) == null) {
            activitySource = "";
        }
        C1185410gx9 c1185410gx97 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx97 == null || (activityPageId = c1185410gx97.getActivityPageId()) == null) {
            activityPageId = "";
        }
        C1185410gx9 c1185410gx98 = poiDetailHeaderPoiShopCtaBaseAssem.LLJJI;
        if (c1185410gx98 == null || (requestId = c1185410gx98.getRequestId()) == null) {
            requestId = "";
        }
        String strIconType$poi_release = poiShopBookingInfo.iconType$poi_release();
        c1185430gxB.getClass();
        String str9 = str2;
        String str10 = str7;
        C1185430gxB.LJJJJJL(strLLIIJI, num, str10, str9, str, str3, str4, str8, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, str5, str6, i, adClickId, activitySource, activityPageId, requestId, strLIZLLL, strIconType$poi_release, pageFinder);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S0400000_18(View view, BcmParams bcmParams, PoiDetailHeaderPoiShopCtaBaseAssem poiDetailHeaderPoiShopCtaBaseAssem, PoiShopBookingInfo poiShopBookingInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiShopBookingInfo;
        this.l1 = poiDetailHeaderPoiShopCtaBaseAssem;
        this.l2 = view;
        this.l3 = bcmParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S0400000_18(PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, PoiListApi.PoiDetailResponse poiDetailResponse2, PoiDetailTag poiDetailTag, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailFoodHeaderAssem;
        this.l1 = poiDetailResponse;
        this.l2 = poiDetailResponse2;
        this.l3 = poiDetailTag;
    }
}
