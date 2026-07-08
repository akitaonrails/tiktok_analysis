package com.ss.android.ugc.aweme.ecommerce.dependency.sea.creatorfeed;

import X.C04TD;
import X.C09YK;
import X.C09YL;
import X.C09YN;
import X.C123100dR;
import X.C1741890vQh;
import X.C1AF0;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.WriteImpressionRequest;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SeaPdpCreatorVideoFeedDependencyService implements ISeaPdpCreatorVideoFeedDependencyService {
    public void initService() {
    }

    public static ISeaPdpCreatorVideoFeedDependencyService createISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISeaPdpCreatorVideoFeedDependencyService.class, z);
        if (objLIZ != null) {
            return (ISeaPdpCreatorVideoFeedDependencyService) objLIZ;
        }
        if (C04TD.f104O == null) {
            synchronized (ISeaPdpCreatorVideoFeedDependencyService.class) {
                if (C04TD.f104O == null) {
                    C04TD.f104O = new SeaPdpCreatorVideoFeedDependencyService();
                }
            }
        }
        return C04TD.f104O;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService
    public Object reportRecommendImpression(WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn<? super Response<Object>> interfaceC1364105Vn) {
        C09YL.LIZ.getClass();
        return C09YK.LIZ(writeImpressionRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService
    public boolean startSeaPdpCreatorVideoFeed(Context context, RouteIntent routeIntent) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        String strLIZ4;
        String strLIZ5;
        String strLIZ6;
        Integer numLIZIZ;
        int iIntValue;
        String strLIZ7;
        Integer numLIZIZ2;
        int iIntValue2;
        String strLIZ8;
        String strLIZ9;
        String strLIZ10;
        String strLIZ11;
        String strLIZ12;
        String strLIZ13;
        String strLIZ14;
        String strLIZ15;
        String strLIZ16;
        C09YN.LIZ.getClass();
        if (routeIntent == null) {
            return false;
        }
        try {
            Intent extra = routeIntent.getExtra();
            if (extra == null || (strLIZ = C09YN.LIZ(extra, "video_from")) == null) {
                strLIZ = "from_sea_pdp_creator_video";
            }
            Intent extra2 = routeIntent.getExtra();
            String str = "";
            if (extra2 == null || (strLIZ2 = C09YN.LIZ(extra2, FollowStatusChangeMethod.PARAM_UID)) == null) {
                strLIZ2 = "";
            }
            Intent extra3 = routeIntent.getExtra();
            if (extra3 == null || (strLIZ3 = C09YN.LIZ(extra3, "ids")) == null) {
                strLIZ3 = "";
            }
            Intent extra4 = routeIntent.getExtra();
            if (extra4 == null || (strLIZ4 = C09YN.LIZ(extra4, "enter_from")) == null) {
                strLIZ4 = "";
            }
            Intent extra5 = routeIntent.getExtra();
            if (extra5 == null || (strLIZ5 = C09YN.LIZ(extra5, "request_body")) == null) {
                strLIZ5 = "";
            }
            Intent extra6 = routeIntent.getExtra();
            if (extra6 == null || (strLIZ6 = C09YN.LIZ(extra6, "detail_load_page_count")) == null || (numLIZIZ = C123100dR.LIZIZ(strLIZ6)) == null) {
                iIntValue = 5;
            } else {
                iIntValue = numLIZIZ.intValue();
            }
            Intent extra7 = routeIntent.getExtra();
            if (extra7 == null || (strLIZ7 = C09YN.LIZ(extra7, "click_into_inner_feed_offset")) == null || (numLIZIZ2 = C123100dR.LIZIZ(strLIZ7)) == null) {
                iIntValue2 = 3;
            } else {
                iIntValue2 = numLIZIZ2.intValue();
            }
            Intent extra8 = routeIntent.getExtra();
            if (extra8 == null || (strLIZ8 = C09YN.LIZ(extra8, "product_id")) == null) {
                strLIZ8 = "";
            }
            Intent extra9 = routeIntent.getExtra();
            if (extra9 == null || (strLIZ9 = C09YN.LIZ(extra9, "da_info")) == null) {
                strLIZ9 = "";
            }
            Intent extra10 = routeIntent.getExtra();
            if (extra10 == null || (strLIZ10 = C09YN.LIZ(extra10, "feed_type")) == null) {
                strLIZ10 = "";
            }
            Intent extra11 = routeIntent.getExtra();
            if (extra11 == null || (strLIZ11 = C09YN.LIZ(extra11, "feed_sub_type")) == null) {
                strLIZ11 = "";
            }
            Intent extra12 = routeIntent.getExtra();
            if (extra12 == null || (strLIZ12 = C09YN.LIZ(extra12, Scene.SCENE_SERVICE)) == null) {
                strLIZ12 = "";
            }
            Intent extra13 = routeIntent.getExtra();
            if (extra13 == null || (strLIZ13 = C09YN.LIZ(extra13, "session_id")) == null) {
                strLIZ13 = "";
            }
            Intent extra14 = routeIntent.getExtra();
            if (extra14 == null || (strLIZ14 = C09YN.LIZ(extra14, "source_btm_token")) == null) {
                strLIZ14 = "";
            }
            Intent extra15 = routeIntent.getExtra();
            if (extra15 == null || (strLIZ15 = C09YN.LIZ(extra15, "module_da_info")) == null) {
                strLIZ15 = "";
            }
            Intent extra16 = routeIntent.getExtra();
            if (extra16 != null && (strLIZ16 = C09YN.LIZ(extra16, "card_da_info_list")) != null) {
                str = strLIZ16;
            }
            HashMap map = new HashMap();
            map.put("request_body", strLIZ5);
            map.put("detail_load_page_count", String.valueOf(iIntValue));
            map.put("click_into_inner_feed_offset", String.valueOf(iIntValue2));
            map.put("feed_type", strLIZ10);
            map.put("feed_sub_type", strLIZ11);
            map.put(Scene.SCENE_SERVICE, strLIZ12);
            map.put("session_id", strLIZ13);
            map.put("module_da_info", strLIZ15);
            map.put("card_da_info_list", str);
            map.put("vod_tag", "gec_creator_video_detail");
            HashMap map2 = new HashMap();
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(strLIZ9);
            if (mapLJIIJ != null) {
                for (Object obj : mapLJIIJ.entrySet()) {
                    map2.put(((Map.Entry) obj).getKey(), String.valueOf(((Map.Entry) obj).getValue()));
                }
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strLIZ2);
            smartRouteBuildRoute.withParam("ids", strLIZ3);
            smartRouteBuildRoute.withParam("video_from", strLIZ);
            smartRouteBuildRoute.withParam("video_type", 126);
            smartRouteBuildRoute.withParam("enter_from", strLIZ4);
            smartRouteBuildRoute.withParam("feed_param_extra", map);
            smartRouteBuildRoute.withParam("product_id", strLIZ8);
            smartRouteBuildRoute.withParam("feed_param_log_extra", map2);
            try {
                smartRouteBuildRoute.withParam("activity_has_activity_options", false);
                smartRouteBuildRoute.withParam("source_btm_token", strLIZ14);
                smartRouteBuildRoute.open();
                return true;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "sea start creator video inner page fail!");
                return false;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
