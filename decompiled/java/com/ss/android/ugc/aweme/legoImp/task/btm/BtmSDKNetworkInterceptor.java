package com.ss.android.ugc.aweme.legoImp.task.btm;

import X.C01GW;
import X.C1499550p7p;
import X.C452501pT;
import X.InterfaceC1904907d9;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class BtmSDKNetworkInterceptor implements InterfaceC1904907d9 {
    public static final C01GW<Regex> LL = C452501pT.LIZIZ(new C1499550p7p());

    public static JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("generated_by_backup", 1);
        String bcmChainStandardStringByFinder = BtmSDK.INSTANCE.getBcmChainStandardStringByFinder("c0.d0", PageFinder.via((Object) null), null);
        if (bcmChainStandardStringByFinder != null) {
            return new JSONObject(bcmChainStandardStringByFinder).put("debug_params", jSONObject);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(7:50|(0)|52|90|62|65|(2:80|81)(6:69|(1:71)|72|(2:74|(2:76|77))|78|79))|90|62|65|(1:67)|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.btm.BtmSDKNetworkInterceptor.intercept(X.0X0l):X.0X52");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd A[Catch: Exception -> 0x00f0, TRY_ENTER, TryCatch #0 {Exception -> 0x00f0, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0013, B:12:0x001e, B:17:0x002b, B:19:0x0033, B:21:0x0040, B:23:0x0046, B:25:0x004c, B:27:0x0052, B:29:0x0058, B:31:0x005e, B:32:0x0069, B:33:0x006c, B:35:0x0074, B:37:0x0081, B:60:0x00cd, B:62:0x00d8, B:64:0x00de, B:66:0x00e4), top: B:71:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.btm.BtmSDKNetworkInterceptor.LIZIZ(java.lang.String, java.lang.String):java.lang.String");
    }
}
