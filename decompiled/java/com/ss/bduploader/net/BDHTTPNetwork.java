package com.ss.bduploader.net;

import X.AbstractC842510X3h;
import X.AbstractC842530X3j;
import X.C0WZX;
import X.C0X0P;
import X.C0X33;
import X.C0XLY;
import X.C1495500p1I;
import X.C1495510p1J;
import X.C1495520p1K;
import X.C2204961BRm;
import X.InterfaceC1495580p1Q;
import X.InterfaceC1495610p1T;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.net.BDVNetClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class BDHTTPNetwork extends BDVNetClient {
    public static final C0X0P JSON = C0X0P.LIZJ("application/json");
    public static C1495520p1K mClient;
    public InterfaceC1495580p1Q mCall;

    @Override // com.ss.bduploader.net.BDVNetClient
    public void cancel() {
        InterfaceC1495580p1Q interfaceC1495580p1Q = this.mCall;
        if (interfaceC1495580p1Q == null || interfaceC1495580p1Q.isCanceled()) {
            return;
        }
        this.mCall.cancel();
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void startTask(String str, Map<String, String> map, final BDVNetClient.CompletionListener completionListener) throws Throwable {
        synchronized (BDHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    C1495510p1J c1495510p1J = new C1495510p1J(new C1495520p1K());
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c1495510p1J.connectTimeout(10L, timeUnit);
                    c1495510p1J.writeTimeout(10L, timeUnit);
                    c1495510p1J.readTimeout(10L, timeUnit);
                    mClient = C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pT8vpFFTt8rP/A3FvoM=", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                c0x33.LIZJ(str2, map.get(str2));
            }
        }
        Request requestLIZIZ = c0x33.LIZIZ();
        C1495520p1K c1495520p1K = mClient;
        c1495520p1K.getClass();
        C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1K, requestLIZIZ, false);
        this.mCall = c1495500p1ILIZJ;
        C2204961BRm.i0(c1495500p1ILIZJ, new InterfaceC1495610p1T() { // from class: com.ss.bduploader.net.BDHTTPNetwork.1
            @Override // X.InterfaceC1495610p1T
            public void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // X.InterfaceC1495610p1T
            public void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) throws Throwable {
                AbstractC842510X3h abstractC842510X3h;
                JSONObject jSONObject;
                try {
                    abstractC842510X3h = c0xly.LLIZ;
                } catch (Throwable th2) {
                    th = th2;
                    abstractC842510X3h = null;
                }
                try {
                    try {
                        jSONObject = new JSONObject(abstractC842510X3h.string());
                        e = null;
                        if (!c0xly.LIZIZ()) {
                            e = new Exception("http fail");
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        jSONObject = null;
                    }
                    if (abstractC842510X3h != null) {
                        try {
                            abstractC842510X3h.close();
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    if (e == null) {
                        completionListener.onCompletion(jSONObject, null);
                    } else {
                        completionListener.onCompletion(jSONObject, new Error(0, null, null, e.toString()));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                    if (abstractC842510X3h != null) {
                        try {
                            abstractC842510X3h.close();
                            throw th;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
        }, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pT8vpFFTt8rP/A3FvoM=", null));
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final BDVNetClient.CompletionListener completionListener) throws Throwable {
        synchronized (BDHTTPNetwork.class) {
            try {
                if (mClient == null) {
                    C1495510p1J c1495510p1J = new C1495510p1J(new C1495520p1K());
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c1495510p1J.connectTimeout(10L, timeUnit);
                    c1495510p1J.writeTimeout(10L, timeUnit);
                    c1495510p1J.readTimeout(10L, timeUnit);
                    mClient = C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pT8vpFFTt8rP/A3FvoM=", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                c0x33.LIZ(str2, map.get(str2));
            }
        }
        if (i == 1) {
            c0x33.LIZLLL("POST", AbstractC842530X3j.LIZJ(JSON, String.valueOf(jSONObject)));
        }
        C1495520p1K c1495520p1K = mClient;
        Request requestLIZIZ = c0x33.LIZIZ();
        c1495520p1K.getClass();
        C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1K, requestLIZIZ, false);
        this.mCall = c1495500p1ILIZJ;
        C2204961BRm.i0(c1495500p1ILIZJ, new InterfaceC1495610p1T() { // from class: com.ss.bduploader.net.BDHTTPNetwork.2
            @Override // X.InterfaceC1495610p1T
            public void onFailure(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // X.InterfaceC1495610p1T
            public void onResponse(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) throws Throwable {
                AbstractC842510X3h abstractC842510X3h;
                String string;
                JSONObject jSONObject2;
                try {
                    abstractC842510X3h = c0xly.LLIZ;
                    try {
                        try {
                            jSONObject2 = new JSONObject(abstractC842510X3h.string());
                            string = null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            string = e.toString();
                            jSONObject2 = null;
                        }
                        if (!c0xly.LIZIZ()) {
                            string = c0xly.LLILZ;
                        }
                        if (abstractC842510X3h != null) {
                            try {
                                abstractC842510X3h.close();
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        if (string == null) {
                            completionListener.onCompletion(jSONObject2, null);
                        } else {
                            completionListener.onCompletion(jSONObject2, new Error(0, null, null, string));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        if (abstractC842510X3h != null) {
                            try {
                                abstractC842510X3h.close();
                                throw th;
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    abstractC842510X3h = null;
                }
            }
        }, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pT8vpFFTt8rP/A3FvoM=", null));
    }
}
