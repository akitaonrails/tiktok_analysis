package com.ss.android.ugc.aweme.ecommerce.dependency.creatorfeed;

import X.C04TD;
import X.C095D;
import X.C1741890vQh;
import X.C1AF0;
import X.C2200908jn;
import X.C2256708sn;
import X.C2256808so;
import X.C2256908sp;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import android.content.Context;
import android.content.Intent;
import android.util.LruCache;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendListResponse;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.VideoDetailResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PdpCreatorVideoFeedDependencyService implements IPdpCreatorVideoFeedDependencyService {
    public void initService() {
    }

    public static IPdpCreatorVideoFeedDependencyService createIPdpCreatorVideoFeedDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPdpCreatorVideoFeedDependencyService.class, z);
        if (objLIZ != null) {
            return (IPdpCreatorVideoFeedDependencyService) objLIZ;
        }
        if (C04TD.j == null) {
            synchronized (IPdpCreatorVideoFeedDependencyService.class) {
                if (C04TD.j == null) {
                    C04TD.j = new PdpCreatorVideoFeedDependencyService();
                }
            }
        }
        return C04TD.j;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService
    public void clearPdpCreatorVideoCache(String str) {
        LruCache<String, VideoDetailResponse> lruCache = C2256808so.LIZ;
        if (lruCache != null) {
            lruCache.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService
    public Object fetchCreatorVideoList(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Response<RecommendListResponse>>> interfaceC1364105Vn) {
        C2256908sp.LLILLJJLI.getValue().LL.getClass();
        return new C095D(new C2200908jn(map, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService
    public boolean startPdpCreatorVideoFeed(Context context, RouteIntent routeIntent) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        String strLIZ4;
        String strLIZ5;
        String strLIZ6;
        String strLIZ7;
        String strLIZ8;
        C2256708sn.LIZ.getClass();
        if (routeIntent == null) {
            return false;
        }
        try {
            Intent extra = routeIntent.getExtra();
            if (extra == null || (strLIZ = C2256708sn.LIZ(extra, "video_from")) == null) {
                strLIZ = "from_pdp_creator_video";
            }
            Intent extra2 = routeIntent.getExtra();
            String str = "";
            if (extra2 == null || (strLIZ2 = C2256708sn.LIZ(extra2, FollowStatusChangeMethod.PARAM_UID)) == null) {
                strLIZ2 = "";
            }
            Intent extra3 = routeIntent.getExtra();
            if (extra3 == null || (strLIZ3 = C2256708sn.LIZ(extra3, "ids")) == null) {
                strLIZ3 = "";
            }
            Intent extra4 = routeIntent.getExtra();
            if (extra4 == null || (strLIZ4 = C2256708sn.LIZ(extra4, "enter_from")) == null) {
                strLIZ4 = "";
            }
            Intent extra5 = routeIntent.getExtra();
            if (extra5 == null || (strLIZ5 = C2256708sn.LIZ(extra5, "request_body")) == null) {
                strLIZ5 = "";
            }
            Intent extra6 = routeIntent.getExtra();
            if (extra6 == null || (strLIZ6 = C2256708sn.LIZ(extra6, "product_id")) == null) {
                strLIZ6 = "";
            }
            Intent extra7 = routeIntent.getExtra();
            if (extra7 == null || (strLIZ7 = C2256708sn.LIZ(extra7, "da_info")) == null) {
                strLIZ7 = "";
            }
            Intent extra8 = routeIntent.getExtra();
            if (extra8 != null && (strLIZ8 = C2256708sn.LIZ(extra8, "source_btm_token")) != null) {
                str = strLIZ8;
            }
            HashMap map = new HashMap();
            map.put("request_body", strLIZ5);
            HashMap map2 = new HashMap();
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(strLIZ7);
            if (mapLJIIJ != null) {
                for (Object obj : mapLJIIJ.entrySet()) {
                    map2.put(((Map.Entry) obj).getKey(), String.valueOf(((Map.Entry) obj).getValue()));
                }
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strLIZ2);
            smartRouteBuildRoute.withParam("ids", strLIZ3);
            smartRouteBuildRoute.withParam("video_from", strLIZ);
            smartRouteBuildRoute.withParam("video_type", 123);
            smartRouteBuildRoute.withParam("enter_from", strLIZ4);
            smartRouteBuildRoute.withParam("feed_param_extra", map);
            smartRouteBuildRoute.withParam("product_id", strLIZ6);
            smartRouteBuildRoute.withParam("feed_param_log_extra", map2);
            try {
                smartRouteBuildRoute.withParam("activity_has_activity_options", false);
                smartRouteBuildRoute.withParam("source_btm_token", str);
                smartRouteBuildRoute.open();
                return true;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "start creator video inner page fail!");
                return false;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
