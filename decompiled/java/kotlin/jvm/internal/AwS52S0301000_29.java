package kotlin.jvm.internal;

import X.C09AY;
import X.C0ET4;
import X.C12CR;
import X.C1558520qew;
import X.C19471811Ga;
import X.C19675111yP;
import X.C19676011yY;
import X.C19A3;
import X.C1DRG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C450840Hm6;
import X.C451220Hmi;
import X.C559610Lx9;
import X.C675940QfI;
import X.C675950QfJ;
import X.InterfaceC19578011ik;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.Extra;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendProduct;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.SysRecommendAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS52S0301000_29 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S0301000_29 awS52S0301000_29, Object obj) {
        String str;
        BcmStandardTrackEvent bcmStandardTrackEvent;
        BcmStandardTrackEvent bcmStandardTrackEvent2;
        String str2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        SysRecommendFeedItem sysRecommendFeedItem = (SysRecommendFeedItem) obj;
        if (sysRecommendFeedItem != null) {
            SysRecommendAssem sysRecommendAssem = (SysRecommendAssem) awS52S0301000_29.l0;
            SysRecommendModel sysRecommendModel = (SysRecommendModel) awS52S0301000_29.l1;
            int i = awS52S0301000_29.i3;
            SysRecommendFeedItem sysRecommendFeedItem2 = (SysRecommendFeedItem) awS52S0301000_29.l2;
            C19471811Ga.LIZ.getClass();
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZ().storeInt("recommend_module_show_count", 0);
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService != null) {
                iEcomSearchService.LJI("source_module", "rec_photo_search_page_view_outer_maybe_you_like_module");
            }
            IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL(sysRecommendAssem), IEcPreviewViewAbility.class, null);
            if (iEcPreviewViewAbility != null) {
                iEcPreviewViewAbility.yn1(sysRecommendFeedItem, PageType.RECOMMEND, "photo_search_recom_hover");
            }
            PhotoSearchEnterParams photoSearchEnterParamsHp = sysRecommendAssem.hp();
            Pair[] pairArr = new Pair[2];
            PhotoSearchEnterParams photoSearchEnterParamsHp2 = sysRecommendAssem.hp();
            String str3 = "";
            if (photoSearchEnterParamsHp2 == null || (photoSearchBusinessEnterParams = photoSearchEnterParamsHp2.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("goods_");
            int i2 = i + 1;
            sbLIZ.append(i2);
            pairArr[1] = new Pair("click_type", C2188811AlT.LIZIZ(sbLIZ));
            C19676011yY.LIZ(photoSearchEnterParamsHp, C2097608Jq.LJIIJ(pairArr));
            PhotoSearchEnterParams photoSearchEnterParamsHp3 = sysRecommendAssem.hp();
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("product_id", sysRecommendFeedItem2.id), new Pair("item_order", String.valueOf(i2)));
            SysRecommendProduct sysRecommendProduct = sysRecommendFeedItem2.product;
            if (sysRecommendProduct != null) {
                bcmStandardTrackEvent = sysRecommendProduct.bcmStandardTrackEvent;
            } else {
                bcmStandardTrackEvent = null;
            }
            C675940QfI.LIZJ("photo_search_recom_product_click", photoSearchEnterParamsHp3, new AwS376S0200000_10(mapLJIIJ, (Map<String, String>) bcmStandardTrackEvent, (BcmStandardTrackEvent) 78));
            PhotoSearchEnterParams photoSearchEnterParamsHp4 = sysRecommendAssem.hp();
            Pair[] pairArr2 = new Pair[8];
            pairArr2[0] = new Pair("page_name", "photo_search_page_view");
            pairArr2[1] = new Pair("source_page_type", "photo_search_page_view");
            pairArr2[2] = new Pair("source_module", "rec_photo_search_page_view_outer_maybe_you_like_module");
            pairArr2[3] = new Pair("item_order", String.valueOf(i2));
            pairArr2[4] = new Pair("product_id", sysRecommendFeedItem2.id);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(sysRecommendModel.requestId);
            sbLIZ2.append('_');
            sbLIZ2.append(sysRecommendFeedItem2.id);
            sbLIZ2.append('_');
            sbLIZ2.append(i2);
            pairArr2[5] = new Pair("track_id", C2188811AlT.LIZIZ(sbLIZ2));
            String str4 = sysRecommendModel.requestId;
            if (str4 == null) {
                str4 = "";
            }
            pairArr2[6] = new Pair("request_id", str4);
            Extra extra = sysRecommendFeedItem2.extra;
            if (extra != null && (str2 = extra.recommendInfo) != null) {
                str3 = str2;
            }
            pairArr2[7] = new Pair("rec_params", str3);
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
            SysRecommendProduct sysRecommendProduct2 = sysRecommendFeedItem2.product;
            if (sysRecommendProduct2 != null) {
                bcmStandardTrackEvent2 = sysRecommendProduct2.bcmStandardTrackEvent;
            } else {
                bcmStandardTrackEvent2 = null;
            }
            C19676011yY.LIZIZ(photoSearchEnterParamsHp4, mapLJIIJ2, bcmStandardTrackEvent2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS52S0301000_29 awS52S0301000_29, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C12CR c12cr = new C12CR((C1DRG) obj, (C19A3) awS52S0301000_29.l1, awS52S0301000_29.i3, (VideoPublishEditModel) awS52S0301000_29.l2);
        ((C559610Lx9) awS52S0301000_29.l0).getClass();
        C559610Lx9.LIZ(c12cr);
        c12cr.afterInit$als_release(jUptimeMillis);
        return c12cr;
    }

    public static final Object invoke$2(AwS52S0301000_29 awS52S0301000_29, Object obj) {
        String str;
        String str2;
        BcmStandardTrackEvent bcmStandardTrackEvent;
        BcmStandardTrackEvent bcmStandardTrackEvent2;
        String str3;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        if (obj != null) {
            C19675111yP c19675111yP = (C19675111yP) awS52S0301000_29.l0;
            int i = awS52S0301000_29.i3;
            SysRecommendFeedItem sysRecommendFeedItem = (SysRecommendFeedItem) awS52S0301000_29.l1;
            SysRecommendModel sysRecommendModel = (SysRecommendModel) awS52S0301000_29.l2;
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService != null) {
                iEcomSearchService.LJI("source_module", "rec_photo_search_page_view_outer_maybe_you_like_module");
            }
            c19675111yP.LLILZLL.invoke(Integer.valueOf(i), obj);
            PhotoSearchEnterParams photoSearchEnterParams = c19675111yP.LLILLJJLI;
            Pair[] pairArr = new Pair[2];
            String str4 = "";
            if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (c19675111yP.LLILLL) {
                str2 = "goods";
            } else {
                str2 = "extend_goods";
            }
            sbLIZ.append(str2);
            sbLIZ.append('_');
            int i2 = i + 1;
            sbLIZ.append(i2);
            pairArr[1] = new Pair("click_type", C2188811AlT.LIZIZ(sbLIZ));
            C19676011yY.LIZ(photoSearchEnterParams, C2097608Jq.LJIIJ(pairArr));
            PhotoSearchEnterParams photoSearchEnterParams2 = c19675111yP.LLILLJJLI;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("product_id", sysRecommendFeedItem.id), new Pair("item_order", String.valueOf(i2)));
            SysRecommendProduct sysRecommendProduct = sysRecommendFeedItem.product;
            if (sysRecommendProduct != null) {
                bcmStandardTrackEvent = sysRecommendProduct.bcmStandardTrackEvent;
            } else {
                bcmStandardTrackEvent = null;
            }
            C675940QfI.LIZJ("photo_search_recom_product_click", photoSearchEnterParams2, new AwS376S0200000_10(mapLJIIJ, (Map<String, String>) bcmStandardTrackEvent, (BcmStandardTrackEvent) 78));
            PhotoSearchEnterParams photoSearchEnterParams3 = c19675111yP.LLILLJJLI;
            Pair[] pairArr2 = new Pair[8];
            pairArr2[0] = new Pair("page_name", "photo_search_page_view");
            pairArr2[1] = new Pair("source_page_type", "photo_search_page_view");
            pairArr2[2] = new Pair("source_module", "rec_photo_search_page_view_outer_maybe_you_like_module");
            pairArr2[3] = new Pair("item_order", String.valueOf(i2));
            pairArr2[4] = new Pair("product_id", sysRecommendFeedItem.id);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(sysRecommendModel.requestId);
            sbLIZ2.append('_');
            sbLIZ2.append(sysRecommendFeedItem.id);
            sbLIZ2.append('_');
            sbLIZ2.append(i2);
            pairArr2[5] = new Pair("track_id", C2188811AlT.LIZIZ(sbLIZ2));
            String str5 = sysRecommendModel.requestId;
            if (str5 == null) {
                str5 = "";
            }
            pairArr2[6] = new Pair("request_id", str5);
            Extra extra = sysRecommendFeedItem.extra;
            if (extra != null && (str3 = extra.recommendInfo) != null) {
                str4 = str3;
            }
            pairArr2[7] = new Pair("rec_params", str4);
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
            SysRecommendProduct sysRecommendProduct2 = sysRecommendFeedItem.product;
            if (sysRecommendProduct2 != null) {
                bcmStandardTrackEvent2 = sysRecommendProduct2.bcmStandardTrackEvent;
            } else {
                bcmStandardTrackEvent2 = null;
            }
            C19676011yY.LIZIZ(photoSearchEnterParams3, mapLJIIJ2, bcmStandardTrackEvent2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS52S0301000_29 awS52S0301000_29, Object obj) {
        C451220Hmi c451220Hmi = (C451220Hmi) obj;
        if (awS52S0301000_29.i3 != -1) {
            c451220Hmi.LIZIZ((C450840Hm6) awS52S0301000_29.l0);
        }
        InterfaceC19578011ik interfaceC19578011ik = (InterfaceC19578011ik) awS52S0301000_29.l1;
        if (interfaceC19578011ik != null && interfaceC19578011ik.LJII()) {
            c451220Hmi.LIZIZ((C450840Hm6) awS52S0301000_29.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0301000_29(int i, C450840Hm6 c450840Hm6, InterfaceC19578011ik interfaceC19578011ik, C450840Hm6 c450840Hm62, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = c450840Hm6;
        this.l1 = interfaceC19578011ik;
        this.l2 = c450840Hm62;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0301000_29(C19675111yP c19675111yP, int i, SysRecommendFeedItem sysRecommendFeedItem, SysRecommendModel sysRecommendModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c19675111yP;
        this.i3 = i;
        this.l1 = sysRecommendFeedItem;
        this.l2 = sysRecommendModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0301000_29(SysRecommendAssem sysRecommendAssem, SysRecommendModel sysRecommendModel, int i, SysRecommendFeedItem sysRecommendFeedItem, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = sysRecommendAssem;
        this.l1 = sysRecommendModel;
        this.i3 = i;
        this.l2 = sysRecommendFeedItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0301000_29(C0ET4 c0et4, C559610Lx9 c559610Lx9, C19A3 c19a3, int i, VideoPublishEditModel videoPublishEditModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c19a3;
        this.i3 = i;
        this.l2 = videoPublishEditModel;
    }
}
