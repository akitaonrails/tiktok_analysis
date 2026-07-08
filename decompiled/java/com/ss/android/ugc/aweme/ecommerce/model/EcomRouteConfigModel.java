package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomRouteConfigModel {

    @C09CT("black_list")
    public final EcomRouteConfigModel blackList;

    @C09CT("host")
    public final String host;

    @C09CT("params")
    public final Map<String, String> params;

    @C09CT("params_contain")
    public final Map<String, String> paramsContain;

    @C09CT("params_v2")
    public final Map<String, List<String>> paramsV2;

    @C09CT("path")
    public final String path;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("schema")
    public final String schema;

    @C09CT("track_params")
    public final List<String> trackParams;

    public EcomRouteConfigModel() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.net.Uri r6) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel.LIZ(android.net.Uri):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(com.bytedance.router.RouteIntent r8) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel.LIZIZ(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcomRouteConfigModel(String str, EcomRouteConfigModel ecomRouteConfigModel, String str2, String str3, String str4, Map<String, String> map, Map<String, ? extends List<String>> map2, List<String> list, Map<String, String> map3) {
        this.scene = str;
        this.blackList = ecomRouteConfigModel;
        this.schema = str2;
        this.host = str3;
        this.path = str4;
        this.params = map;
        this.paramsV2 = map2;
        this.trackParams = list;
        this.paramsContain = map3;
    }
}
