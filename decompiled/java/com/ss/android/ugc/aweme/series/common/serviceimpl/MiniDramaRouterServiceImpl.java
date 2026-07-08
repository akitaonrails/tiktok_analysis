package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C1537900q7g;
import X.C1541950qED;
import X.C844470XAv;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.service.MiniDramaRouterService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MiniDramaRouterServiceImpl implements MiniDramaRouterService {
    @Override // com.ss.android.ugc.aweme.service.MiniDramaRouterService
    public final void LIZJ(long j) {
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://paidcontent/collections/detail");
        smartRouteBuildRoute.withParam("collection_id", j);
        smartRouteBuildRoute.withParam("enter_from", "recommended_drama");
        smartRouteBuildRoute.withParam("root_scene", "2");
        smartRouteBuildRoute.withParam("category", "MINI_DRAMA");
        smartRouteBuildRoute.withParam("ignore_login_once", "1");
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaRouterService
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        if (str != null && str.length() != 0) {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                sparkContext.LJJLIIIJ(entry.getValue(), entry.getKey());
            }
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            c1537900q7g.getClass();
            new C1541950qED(contextLIZ, sparkContext).LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaRouterService
    public final void LIZIZ(String str, Map<String, Boolean> map) {
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), str);
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            smartRouteBuildRoute.withParam(entry.getKey(), entry.getValue().booleanValue());
        }
        smartRouteBuildRoute.open();
    }
}
