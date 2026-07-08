package com.ss.android.ugc.aweme.ecommerce.service;

import X.C0CCZ;
import X.InterfaceC1393680mN4;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public interface IEcommerceAnchorOuterService {
    InterfaceC1393680mN4 LIZ();

    InterfaceC1393680mN4 LIZIZ();

    boolean LIZJ();

    boolean LIZLLL(JSONObject jSONObject, String str, Map map);

    List<String> LJ();

    VideoTagCategoryProtocol LJFF();

    C0CCZ LJI();

    VideoTagCategoryProtocol LJII();

    VideoTagCategoryProtocol LJIIIIZZ();

    boolean LJIIIZ(boolean z);

    InterfaceC1393680mN4 LJIIJ();

    VideoTagCategoryProtocol LJIIJJI();

    boolean startVideoFeed(Context context, RouteIntent routeIntent);
}
