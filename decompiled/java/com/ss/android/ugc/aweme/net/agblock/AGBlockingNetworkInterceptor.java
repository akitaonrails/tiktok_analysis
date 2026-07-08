package com.ss.android.ugc.aweme.net.agblock;

import X.C098200Yq;
import X.C0BVK;
import X.C0DQQ;
import X.C0X52;
import X.C1493620oyG;
import X.C1494160oz8;
import X.C1494590ozp;
import X.C189200o6;
import X.C793770VBv;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AGBlockingNetworkInterceptor implements InterfaceC1904907d9 {
    public static final AGBlockingNetworkInterceptor LL = new AGBlockingNetworkInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494160oz8 c1494160oz8;
        String host;
        String path;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (request.getExtraInfo() == null) {
            request.setExtraInfo(new C1493620oyG());
        }
        Object extraInfo = request.getExtraInfo();
        if (extraInfo instanceof C1493620oyG) {
            c1494160oz8 = (C1494160oz8) extraInfo;
        } else {
            c1494160oz8 = null;
        }
        if (c1494160oz8 != null) {
            c1494160oz8.LJIIJ = true;
        }
        try {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if ((((Number) C0BVK.LIZ.getValue()).intValue() & 1) != 0) {
                String method = request.getMethod();
                C0DQQ c0dqq = new C0DQQ(th, method);
                if (c0dqq.LIZ) {
                    try {
                        Uri uri = UriProtector.parse(c0dqq.LIZJ);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", c0dqq.LIZIZ);
                        if (uri == null || (host = uri.getHost()) == null) {
                            host = "";
                        }
                        jSONObject.put("host", host);
                        if (uri == null || (path = uri.getPath()) == null) {
                            path = "";
                        }
                        jSONObject.put("path", path);
                        String str = c0dqq.LIZLLL;
                        if (str == null) {
                            str = "";
                        }
                        jSONObject.put("msg", str);
                        if (method == null) {
                            method = "";
                        }
                        jSONObject.put("method", method);
                        C793770VBv.LJII("ag_blocking_monitor", jSONObject, null, null);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        throw th;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                        throw th;
                    }
                }
            }
            throw th;
        }
    }
}
