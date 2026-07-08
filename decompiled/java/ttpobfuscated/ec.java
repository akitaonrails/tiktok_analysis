package ttpobfuscated;

import X.C1954807lC;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import ttp.orbu.sdk.requestvalidator.Request;
import ttpobfuscated.lb;

/* JADX INFO: loaded from: classes14.dex */
public final class ec {
    public static Map<String, ? extends Map<String, String>> C;

    public static final Map<String, Object> a(Request request) {
        Map<String, Object> mapLJ;
        if (!(request instanceof Request.Configuration) && !(request instanceof Request.PreDefinedFlow) && !(request instanceof Request.Gecko) && !(request instanceof Request.LiveVideo) && !(request instanceof Request.LiveAudio) && !(request instanceof Request.LiveSEI)) {
            if (request instanceof Request.Http) {
                Request.Http http = (Request.Http) request;
                return C2097608Jq.LJIIIIZZ(new Pair("url", http.c), new Pair("method", http.d), new Pair("headers", http.f));
            }
            if (request instanceof Request.WebRouter) {
                Request.WebRouter webRouter = (Request.WebRouter) request;
                return C2097608Jq.LJIIIIZZ(new Pair("routerString", webRouter.e), new Pair("webviewRuntime", webRouter.d), new Pair("url", webRouter.c));
            }
            if (request instanceof Request.AppToApp) {
                Pair[] pairArr = new Pair[2];
                Request.AppToApp appToApp = (Request.AppToApp) request;
                pairArr[0] = new Pair("targetAppName", appToApp.c);
                JSONObject jSONObject = appToApp.d;
                if (jSONObject == null || (mapLJ = b8.a(jSONObject)) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                pairArr[1] = new Pair("sharedData", mapLJ);
                return C2097608Jq.LJIIIIZZ(pairArr);
            }
            if (request instanceof Request.SystemAPI) {
                Request.SystemAPI systemAPI = (Request.SystemAPI) request;
                return C2097608Jq.LJIIIIZZ(new Pair("className", systemAPI.c), new Pair("methodName", systemAPI.d), new Pair("params", systemAPI.e));
            }
            if (request instanceof Request.SDK) {
                Request.SDK sdk = (Request.SDK) request;
                return C2097608Jq.LJIIIIZZ(new Pair("sdkDescriptor", sdk.c), new Pair("methodName", sdk.d), new Pair("params", sdk.e));
            }
            throw new C1954807lC();
        }
        return C2097608Jq.LJ();
    }

    public static final Map<String, Object> b(Request request) {
        lb.a aVar = lb.j;
        Long lA = nd.a(aVar);
        Map<String, Object> mapA = a(request);
        Map<String, ? extends Map<String, String>> map = C;
        if (map != null && (!map.isEmpty())) {
            mapA = C2097608Jq.LJIIL(mapA, C2097608Jq.LJIIZILJ(map));
        }
        aVar.getClass();
        lb.a(lb.k, "Request.dataMap", lA, false, null, 12, null);
        return mapA;
    }

    public static final void a(Map<String, ? extends Map<String, String>> map) {
        C = map;
    }
}
