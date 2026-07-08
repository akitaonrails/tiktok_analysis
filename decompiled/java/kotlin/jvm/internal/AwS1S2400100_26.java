package kotlin.jvm.internal;

import X.AnonymousClass0317;
import X.C034S;
import X.C09AY;
import X.C0QXR;
import X.C1120604Zw;
import X.C197300pP;
import X.C1AQS;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS1S2400100_26 extends C09AY implements Function1 {
    public final int $t;
    public long j6;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S2400100_26 awS1S2400100_26, Object obj) {
        Object obj2;
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Map<String, Object> map;
        Bitmap bitmap = (Bitmap) obj;
        IEcomSearchDependencyService iEcomSearchDependencyService = (IEcomSearchDependencyService) awS1S2400100_26.l2;
        Context context = (Context) awS1S2400100_26.l3;
        IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) awS1S2400100_26.l4;
        String name = null;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            obj2 = map.get("traffic_source_list");
        } else {
            obj2 = null;
        }
        String strLIZ = C197300pP.LIZ(String.valueOf(obj2), Collections.singletonList(6));
        int value = C0QXR.PDP_FIND_SIMILAR.getValue();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams("product_detail", "pdp_main_pic_similar", strLIZ, null, "", 0, "", "", "", "product_detail", "", "mall", ((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).getLatestSearchId(), "", "", "tiktok_mall_photo_search", null, null, null, value, null, "product_detail", null, null, null, null, null, String.valueOf(System.currentTimeMillis()));
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(((PhotoSearchPdpEnterParams) awS1S2400100_26.l5).searchEntrance, "product_detail", "", "pdp_main_pic_similar", "product_detail", null, "main_image_find_similar", null, null, null, null, null, null);
        String str = awS1S2400100_26.s0;
        Object obj9 = "";
        if (str == null) {
            str = "";
        }
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = new PhotoSearchToolsEnterParams(str, Long.valueOf(awS1S2400100_26.j6), "product_detail_photo", null, null, null, null);
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = (PhotoSearchPdpEnterParams) awS1S2400100_26.l5;
        HashMap map2 = new HashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam2 = (IPdpStarter.PdpEnterParam) awS1S2400100_26.l4;
        String str2 = awS1S2400100_26.s1;
        if (pdpEnterParam2 != null) {
            map2.put("product_id", pdpEnterParam2.getProductId());
            Map<String, Object> map3 = pdpEnterParam2.visitReportParams;
            if (map3 != null && (obj8 = map3.get("seller_id")) != null) {
                map2.put("seller_id", obj8);
            }
            Map<String, Object> map4 = pdpEnterParam2.trackParams;
            if (map4 == null || (obj3 = map4.get("source_page_type")) == null) {
                obj3 = "";
            }
            if (Intrinsics.LJFF(obj3, "live")) {
                Map<String, Object> map5 = pdpEnterParam2.trackParams;
                if (map5 == null || (obj6 = map5.get("lineup_room_id")) == null) {
                    obj6 = "";
                }
                map2.put("live_id", obj6);
                Map<String, Object> map6 = pdpEnterParam2.trackParams;
                if (map6 != null && (obj7 = map6.get("author_id")) != null) {
                    obj9 = obj7;
                }
                map2.put("user_id", obj9);
            } else if (Intrinsics.LJFF(obj3, "video")) {
                Map<String, Object> map7 = pdpEnterParam2.trackParams;
                if (map7 == null || (obj4 = map7.get("source_content_id")) == null) {
                    obj4 = "";
                }
                map2.put("video_id", obj4);
                Map<String, Object> map8 = pdpEnterParam2.trackParams;
                if (map8 != null && (obj5 = map8.get("author_id")) != null) {
                    obj9 = obj5;
                }
                map2.put("user_id", obj9);
            }
        }
        if (str2 != null) {
            map2.put("product_title", str2);
        }
        iEcomSearchDependencyService.openPhotoSearchResult(context, new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, photoSearchPdpEnterParams, map2, null, null, null, null), bitmap, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2400100_26 awS1S2400100_26, Object obj) {
        Object obj2;
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Map<String, Object> map;
        Bitmap bitmap = (Bitmap) obj;
        IEcomSearchDependencyService iEcomSearchDependencyService = (IEcomSearchDependencyService) awS1S2400100_26.l2;
        Context context = (Context) awS1S2400100_26.l3;
        IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) awS1S2400100_26.l4;
        String name = null;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            obj2 = map.get("traffic_source_list");
        } else {
            obj2 = null;
        }
        String strLIZ = C197300pP.LIZ(String.valueOf(obj2), Collections.singletonList(6));
        int value = C0QXR.PDP_FIND_SIMILAR.getValue();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams("product_detail", "pdp_main_pic_similar", strLIZ, null, "", 0, "", "", "", "product_detail", "", "mall", ((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).getLatestSearchId(), "", "", "tiktok_mall_photo_search", null, null, null, value, null, "product_detail", null, null, null, null, null, String.valueOf(System.currentTimeMillis()));
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(((PhotoSearchPdpEnterParams) awS1S2400100_26.l5).searchEntrance, "product_detail", "", "pdp_main_pic_similar", "product_detail", null, "main_image_find_similar", null, null, null, null, null, null);
        String str = awS1S2400100_26.s0;
        Object obj9 = "";
        if (str == null) {
            str = "";
        }
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = new PhotoSearchToolsEnterParams(str, Long.valueOf(awS1S2400100_26.j6), "product_detail_photo", null, null, null, null);
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = (PhotoSearchPdpEnterParams) awS1S2400100_26.l5;
        HashMap map2 = new HashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam2 = (IPdpStarter.PdpEnterParam) awS1S2400100_26.l4;
        String str2 = awS1S2400100_26.s1;
        if (pdpEnterParam2 != null) {
            map2.put("product_id", pdpEnterParam2.getProductId());
            Map<String, Object> map3 = pdpEnterParam2.visitReportParams;
            if (map3 != null && (obj8 = map3.get("seller_id")) != null) {
                map2.put("seller_id", obj8);
            }
            Map<String, Object> map4 = pdpEnterParam2.trackParams;
            if (map4 == null || (obj3 = map4.get("source_page_type")) == null) {
                obj3 = "";
            }
            if (Intrinsics.LJFF(obj3, "live")) {
                Map<String, Object> map5 = pdpEnterParam2.trackParams;
                if (map5 == null || (obj6 = map5.get("lineup_room_id")) == null) {
                    obj6 = "";
                }
                map2.put("live_id", obj6);
                Map<String, Object> map6 = pdpEnterParam2.trackParams;
                if (map6 != null && (obj7 = map6.get("author_id")) != null) {
                    obj9 = obj7;
                }
                map2.put("user_id", obj9);
            } else if (Intrinsics.LJFF(obj3, "video")) {
                Map<String, Object> map7 = pdpEnterParam2.trackParams;
                if (map7 == null || (obj4 = map7.get("source_content_id")) == null) {
                    obj4 = "";
                }
                map2.put("video_id", obj4);
                Map<String, Object> map8 = pdpEnterParam2.trackParams;
                if (map8 != null && (obj5 = map8.get("author_id")) != null) {
                    obj9 = obj5;
                }
                map2.put("user_id", obj9);
            }
        }
        if (str2 != null) {
            map2.put("product_title", str2);
        }
        iEcomSearchDependencyService.openPhotoSearchResult(context, new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, photoSearchPdpEnterParams, map2, null, null, null, null), bitmap, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2400100_26(IEcomSearchDependencyService iEcomSearchDependencyService, Context context, IPdpStarter.PdpEnterParam pdpEnterParam, PhotoSearchPdpEnterParams photoSearchPdpEnterParams, String str, long j, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = iEcomSearchDependencyService;
        this.l3 = context;
        this.l4 = pdpEnterParam;
        this.l5 = photoSearchPdpEnterParams;
        this.s0 = str;
        this.j6 = j;
        this.s1 = str2;
    }
}
