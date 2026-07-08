package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C013C;
import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.C15O7;
import X.C2188811AlT;
import X.C259800zU;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ThirdNetMonitorInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        try {
            C0X52 c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            LIZIZ(request, c0x52LIZ, null);
            return c0x52LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(request, null, th);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
    public final void LIZIZ(final Request request, final C0X52<?> c0x52, final Throwable th) {
        try {
            final C259800zU c259800zU = new C259800zU();
            final C013C c013c = new C013C();
            List<C080U> headers = request.getHeaders();
            if (headers != null) {
                for (C080U c080u : headers) {
                    if (Intrinsics.LJFF(c080u.LIZ, "x-tt-dataflow-id")) {
                        c259800zU.element = c080u.LIZIZ;
                    }
                    if (Intrinsics.LJFF(c080u.LIZ, "x-metasec-third-party-net-standard-api")) {
                        c013c.element = true;
                    }
                }
            }
            T t = c259800zU.element;
            if (t != 0) {
                try {
                    int i = CastIntegerProtector.parseInt((String) t);
                    if (671088641 <= i && i < 681154970) {
                        C15O7.LIZJ(new Callable() { // from class: X.08fx
                            /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0005, B:7:0x0018, B:9:0x001c, B:10:0x0020, B:24:0x005d, B:26:0x0067, B:27:0x006b, B:23:0x005a, B:11:0x002c, B:13:0x0032, B:14:0x0039, B:16:0x003d, B:19:0x0048), top: B:33:0x0005, inners: #1 }] */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object call() {
                                /*
                                    r7 = this;
                                    java.lang.String r6 = "ThirdNetMonitorInterceptor@7ed2.parseEvent$2"
                                    X.C1C7U.LIZ(r6)
                                    com.bytedance.retrofit2.client.Request r0 = r1     // Catch: java.lang.Throwable -> L74
                                    java.lang.String r0 = r0.getUrl()     // Catch: java.lang.Throwable -> L74
                                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L74
                                    java.lang.String r4 = r0.getAuthority()     // Catch: java.lang.Throwable -> L74
                                    java.lang.String r2 = ""
                                    if (r4 != 0) goto L18
                                    r4 = r2
                                L18:
                                    X.0X52<?> r0 = r2     // Catch: java.lang.Throwable -> L74
                                    if (r0 == 0) goto L2c
                                    X.08fh r0 = r0.LIZ     // Catch: java.lang.Throwable -> L74
                                    int r5 = r0.LIZIZ     // Catch: java.lang.Throwable -> L74
                                L20:
                                    com.ss.android.ugc.aweme.legoImp.task.pumbaa.ThirdNetMonitorInterceptor r1 = r4     // Catch: java.lang.Throwable -> L74
                                    X.00zU<java.lang.String> r0 = r5     // Catch: java.lang.Throwable -> L74
                                    T r3 = r0.element     // Catch: java.lang.Throwable -> L74
                                    java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L74
                                    r1.getClass()     // Catch: java.lang.Throwable -> L74
                                    goto L46
                                L2c:
                                    java.lang.Throwable r1 = r3     // Catch: java.lang.Throwable -> L74
                                    boolean r0 = r1 instanceof X.C1494430ozZ     // Catch: java.lang.Throwable -> L74
                                    if (r0 == 0) goto L39
                                    X.0ozZ r1 = (X.C1494430ozZ) r1     // Catch: java.lang.Throwable -> L74
                                    int r5 = r1.getStatusCode()     // Catch: java.lang.Throwable -> L74
                                    goto L20
                                L39:
                                    boolean r0 = r1 instanceof X.C1494690ozz     // Catch: java.lang.Throwable -> L74
                                    if (r0 == 0) goto L44
                                    X.0ozz r1 = (X.C1494690ozz) r1     // Catch: java.lang.Throwable -> L74
                                    int r5 = r1.getStatusCode()     // Catch: java.lang.Throwable -> L74
                                    goto L20
                                L44:
                                    r5 = -1
                                    goto L20
                                L46:
                                    if (r3 == 0) goto L58
                                    int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r3)     // Catch: java.lang.Throwable -> L56
                                    r0 = 16
                                    kotlin.text.CharsKt__CharJVMKt.checkRadix(r0)     // Catch: java.lang.Throwable -> L56
                                    java.lang.String r2 = java.lang.Integer.toString(r1, r0)     // Catch: java.lang.Throwable -> L56
                                    goto L58
                                L56:
                                    r0 = move-exception
                                    goto L5a
                                L58:
                                    r3 = r2
                                    goto L5d
                                L5a:
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
                                L5d:
                                    com.ss.android.ugc.aweme.legoImp.task.pumbaa.ThirdNetMonitorInterceptor r2 = r4     // Catch: java.lang.Throwable -> L74
                                    X.013C r0 = r6     // Catch: java.lang.Throwable -> L74
                                    boolean r1 = r0.element     // Catch: java.lang.Throwable -> L74
                                    java.lang.Throwable r0 = r3     // Catch: java.lang.Throwable -> L74
                                    if (r0 == 0) goto L72
                                    java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L74
                                L6b:
                                    r2.getClass()     // Catch: java.lang.Throwable -> L74
                                    com.ss.android.ugc.aweme.legoImp.task.pumbaa.ThirdNetMonitorInterceptor.LIZ(r5, r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L74
                                    goto L78
                                L72:
                                    r0 = 0
                                    goto L6b
                                L74:
                                    r0 = move-exception
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                L78:
                                    kotlin.Unit r0 = kotlin.Unit.LIZ
                                    X.C1C7U.LIZIZ(r6)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.CallableC2177108fx.call():java.lang.Object");
                            }
                        });
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public static void LIZ(int i, String str, String str2, String str3, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dfid", str);
        jSONObject.put("isStandardApi", z);
        jSONObject.put("domain", str2);
        jSONObject.put("responseCode", i);
        jSONObject.put("errorMsg", str3);
        AppLogNewUtils.onEventV3("pns_bpea_3rd_net_event", jSONObject);
        if (i == 200) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pns_bpea_3rd_net_event:");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pns_bpea_3rd_net_event:");
        sbLIZ2.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
