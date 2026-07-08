package com.ss.ttvideoengine.fetcher;

import X.AbstractC1468760oKA;
import X.C0VOR;
import X.C0VOX;
import X.C1468790oKD;
import X.C1468800oKE;
import X.C1469810oLr;
import X.C1470240oMY;
import X.C1471660oOq;
import X.C1473400oRe;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787250UuR;
import X.C795730VJj;
import X.EnumC2281151EQn;
import X.InterfaceC1309180kAm;
import X.InterfaceC1468830oKH;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import fyo.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public final class VideoInfoFetcher {
    public static HashMap<String, Integer> LJIILL;
    public final Handler LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public InterfaceC1468830oKH LJII;
    public final AbstractC1468760oKA LJIIIIZZ;
    public HashMap<String, EnumC2281151EQn> LJIIIZ;
    public int LJIIJ;
    public final Context LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;

    public final void LJI() {
        synchronized (this) {
            try {
                this.LIZ.removeCallbacksAndMessages(null);
                InterfaceC1468830oKH interfaceC1468830oKH = this.LJII;
                if (interfaceC1468830oKH == null) {
                    return;
                }
                interfaceC1468830oKH.onLog("fetcher cancelled");
                if (this.LIZIZ) {
                    return;
                }
                this.LIZIZ = true;
                this.LJIIIIZZ.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        if (this.LJIILIIL && (TextUtils.isEmpty(this.LIZLLL) || !C787250UuR.LIZIZ(this.LJIIJJI))) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("VideoInfoFetcher", "get videomodel from DB");
            EngineThreadPool.addExecuteTask(new ARunnableS113S0100000_13(this, 136));
        } else if (TextUtils.isEmpty(this.LIZLLL)) {
            LIZLLL(new e("kTTVideoErrorDomainFetchingInfo", -9999, 0, "apistring empty"));
        } else {
            LIZ(this.LIZLLL);
        }
    }

    public static class MyHandler extends BPEAHandler {
        public final WeakReference<VideoInfoFetcher> LL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("VideoInfoFetcher$MyHandler@d616.handleMessage");
            VideoInfoFetcher videoInfoFetcher = this.LL.get();
            if (videoInfoFetcher == null) {
                C1C7U.LIZIZ("VideoInfoFetcher$MyHandler@d616.handleMessage");
                return;
            }
            InterfaceC1468830oKH interfaceC1468830oKH = videoInfoFetcher.LJII;
            if (interfaceC1468830oKH == null) {
                C1C7U.LIZIZ("VideoInfoFetcher$MyHandler@d616.handleMessage");
                return;
            }
            if (videoInfoFetcher.LIZIZ) {
                interfaceC1468830oKH.onLog("fetcher is cancelled");
                C1C7U.LIZIZ("VideoInfoFetcher$MyHandler@d616.handleMessage");
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            interfaceC1468830oKH.LIZIZ(message.arg1, (String) HandlerHook.getMessageObj(message.obj));
                        }
                    } else {
                        interfaceC1468830oKH.LIZJ((C1470240oMY) HandlerHook.getMessageObj(message.obj), null);
                    }
                } else {
                    interfaceC1468830oKH.LIZJ(null, (e) HandlerHook.getMessageObj(message.obj));
                }
            } else {
                interfaceC1468830oKH.LIZ((e) HandlerHook.getMessageObj(message.obj));
            }
            C1C7U.LIZIZ("VideoInfoFetcher$MyHandler@d616.handleMessage");
        }

        public MyHandler(VideoInfoFetcher videoInfoFetcher, Looper looper) {
            super(looper);
            this.LL = new WeakReference<>(videoInfoFetcher);
        }
    }

    public VideoInfoFetcher(Context context) {
        this.LIZLLL = "";
        this.LJIILJJIL = -1;
        this.LJIIJJI = context;
        this.LIZ = new MyHandler(this, C795730VJj.LJII());
        this.LJIIIIZZ = new C1469810oLr();
    }

    public static int LJIIIIZZ(JSONObject jSONObject) {
        if (jSONObject.has("CodeN")) {
            return jSONObject.optInt("CodeN");
        }
        if (jSONObject.has("Code")) {
            String strOptString = jSONObject.optString("Code");
            if (TextUtils.isEmpty(strOptString)) {
                return -1;
            }
            int iIndexOf = strOptString.indexOf(e3.d);
            if (iIndexOf > 0) {
                strOptString = strOptString.substring(0, iIndexOf);
            }
            if (LJIILL == null) {
                HashMap<String, Integer> map = new HashMap<>();
                LJIILL = map;
                map.put("InvalidClientTokenId", 100009);
                LJIILL.put("SignatureDoesNotMatch", 100010);
                LJIILL.put("MissingSignature", 100005);
                LJIILL.put("InvalidTimestamp", 100006);
                LJIILL.put("LackProjectPolicy", 100012);
                LJIILL.put("AccessDenied", 100013);
                LJIILL.put("InternalServiceError", 100014);
                LJIILL.put("InternalServiceTimeout", 100016);
                LJIILL.put("FlowLimitExceeded", 100018);
                LJIILL.put("ServiceUnavailableTemp", 100019);
                LJIILL.put("MethodNotAllowed", 100020);
            }
            if (LJIILL.containsKey(strOptString)) {
                try {
                    return LJIILL.get(strOptString).intValue();
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void LIZ(String str) {
        HashMap map;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_beginToFetch url ");
        sbLIZ.append(str);
        C1471660oOq.LIZJ("VideoInfoFetcher", C2188811AlT.LIZIZ(sbLIZ));
        SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(this.LJFF)) {
            map = new HashMap();
            map.put("Authorization", this.LJFF);
        } else {
            map = null;
        }
        Method[] declaredMethods = this.LJIIIIZZ.getClass().getDeclaredMethods();
        if (declaredMethods != null && declaredMethods.length > 0) {
            for (Method method : declaredMethods) {
                if (method != null && method.getName() != null && method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                    this.LJIIIIZZ.LIZLLL(str, map, new InterfaceC1309180kAm() { // from class: X.0oKF
                        @Override // X.InterfaceC1309180kAm
                        public final void LIZIZ(JSONObject jSONObject, e eVar) {
                            if (jSONObject == null) {
                                if (eVar != null) {
                                    this.LIZ.LJFF(eVar);
                                    return;
                                }
                            } else if (eVar != null) {
                                this.LIZ.LJIILJJIL = eVar.LIZIZ;
                            }
                            this.LIZ.LIZJ(jSONObject, null);
                        }
                    });
                    return;
                }
            }
        }
        this.LJIIIIZZ.LIZJ(str, map, new InterfaceC1309180kAm() { // from class: X.0oKG
            @Override // X.InterfaceC1309180kAm
            public final void LIZIZ(JSONObject jSONObject, e eVar) {
                if (jSONObject == null && eVar != null) {
                    this.LIZ.LJFF(eVar);
                } else {
                    this.LIZ.LIZJ(jSONObject, null);
                }
            }
        });
    }

    public final void LIZLLL(e eVar) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_notifyError ");
        sbLIZ.append(eVar);
        C1471660oOq.LIZJ("VideoInfoFetcher", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(1, eVar));
    }

    public final void LJFF(e eVar) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_retryIfNeeded error ");
        sbLIZ.append(eVar);
        C1471660oOq.LIZJ("VideoInfoFetcher", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this) {
            try {
                if (this.LIZIZ) {
                    return;
                }
                if (eVar != null) {
                    if (TextUtils.isEmpty(eVar.LIZJ) && eVar.LIZ == -9979) {
                        eVar = new e("kTTVideoErrorDomainFetchingInfo", -9979, eVar.LIZIZ, eVar.LIZLLL);
                    } else if (TextUtils.isEmpty(eVar.LIZJ)) {
                        eVar = new e("kTTVideoErrorDomainFetchingInfo", -9994, eVar.LIZIZ, eVar.LIZLLL);
                    }
                } else {
                    eVar = new e("kTTVideoErrorDomainFetchingInfo", -9994);
                }
                if (eVar.LIZ == -9969) {
                    int i2 = eVar.LIZIZ;
                    if (i2 / 10000 != 10 && i2 != -9970) {
                        eVar.LIZ = -9990;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("<apiStr:");
                    sbLIZ2.append(this.LIZLLL);
                    sbLIZ2.append(">");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(eVar.LIZLLL);
                    sbLIZ3.append(strLIZIZ);
                    eVar.LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
                    LIZLLL(eVar);
                    return;
                }
                if (this.LIZJ < 1) {
                    C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(0, eVar));
                    this.LIZJ++;
                    LIZIZ();
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("<apiStr:");
                    sbLIZ4.append(this.LIZLLL);
                    sbLIZ4.append(">");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(eVar.LIZLLL);
                    sbLIZ5.append(strLIZIZ2);
                    eVar.LIZLLL = C2188811AlT.LIZIZ(sbLIZ5);
                    LIZLLL(eVar);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ(boolean z) {
        this.LJIILIIL = z;
        if (z) {
            C0VOR.LIZ(this.LJIIJJI);
        }
    }

    public VideoInfoFetcher(Context context, AbstractC1468760oKA abstractC1468760oKA) {
        this.LIZLLL = "";
        this.LJIILJJIL = -1;
        this.LJIIJJI = context;
        this.LIZ = new MyHandler(this, C795730VJj.LJII());
        if (abstractC1468760oKA == null) {
            this.LJIIIIZZ = new C1469810oLr();
        } else {
            this.LJIIIIZZ = abstractC1468760oKA;
        }
    }

    public final void LIZJ(JSONObject jSONObject, C0VOX c0vox) {
        int iLJIIIIZZ;
        int i = C2187451AjH.LIZ;
        C1471660oOq.LIZJ("VideoInfoFetcher", "_getInfoSuccess");
        synchronized (this) {
            try {
                if (!this.LIZIZ && jSONObject != null) {
                    C1470240oMY c1470240oMY = new C1470240oMY();
                    if (!jSONObject.has("ResponseMetadata") && !jSONObject.has("Result")) {
                        try {
                            if (!TextUtils.isEmpty(this.LJ) || this.LJI) {
                                c1470240oMY.LJI = true;
                                String str = this.LJ;
                                C1473400oRe c1473400oRe = c1470240oMY.LIZJ;
                                if (c1473400oRe != null) {
                                    c1473400oRe.LJIIJJI(218, str);
                                }
                                c1470240oMY.LJII = str;
                            }
                            c1470240oMY.LJJIJ(jSONObject);
                            int iOptInt = jSONObject.optInt("code");
                            String strOptString = jSONObject.optString("message");
                            String strOptString2 = jSONObject.optString("tttrace_id");
                            if (c1470240oMY.LIZJ != null && c1470240oMY.LJIIZILJ(4) != 10 && c1470240oMY.LJIIZILJ(4) != 0) {
                                LJ(c1470240oMY.LJIIZILJ(4), strOptString);
                                return;
                            } else if (iOptInt != 0) {
                                e eVar = new e("kTTVideoErrorDomainFetchingInfo", -9990, iOptInt, C786410Ut5.J3(jSONObject));
                                eVar.LJ.put("log_id", strOptString2);
                                LIZLLL(eVar);
                                return;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            LJFF(new e("kTTVideoErrorDomainFetchingInfo", -9976, 0, th.toString()));
                            return;
                        }
                    } else {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ResponseMetadata");
                        if (jSONObjectOptJSONObject == null) {
                            C1471660oOq.LIZJ("VideoInfoFetcher", "_getInfoSuccess metadata is null");
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("Error");
                        if (jSONObjectOptJSONObject2 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(C786410Ut5.J3(jSONObjectOptJSONObject2));
                            sbLIZ.append(" RequestId:");
                            sbLIZ.append(jSONObjectOptJSONObject.optString("RequestId"));
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (this.LJIIJ == 2) {
                                iLJIIIIZZ = LJIIIIZZ(jSONObjectOptJSONObject2);
                            } else {
                                iLJIIIIZZ = this.LJIILJJIL;
                            }
                            e eVar2 = new e("kTTVideoErrorDomainFetchingInfo", -9969, iLJIIIIZZ, strLIZIZ);
                            eVar2.LJ.put("log_id", jSONObjectOptJSONObject.optString("RequestId"));
                            LJFF(eVar2);
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("Result");
                        if (jSONObjectOptJSONObject3 == null) {
                            LJFF(new e("kTTVideoErrorDomainFetchingInfo", -9997, 0, "fetched info Result is empty"));
                            return;
                        }
                        if (this.LJIIJ == 2) {
                            try {
                                jSONObjectOptJSONObject3 = jSONObjectOptJSONObject3.optJSONObject("Data");
                                if (jSONObjectOptJSONObject3 == null) {
                                    LJFF(new e("kTTVideoErrorDomainFetchingInfo", -9997, 0, "fetched info Result is empty after decrypt"));
                                    return;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                LJFF(new e("kTTVideoErrorDomainFetchingInfo", -9977, 0, th2.toString()));
                                return;
                            }
                        }
                        try {
                            c1470240oMY.LJJIJ(jSONObjectOptJSONObject3);
                            if (c1470240oMY.LJIIL() && c1470240oMY.LJIIZILJ(4) != 10 && c1470240oMY.LJIIZILJ(4) != 0) {
                                LJ(c1470240oMY.LJIIZILJ(4), "ver2 server side error,hh");
                                return;
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            LJFF(new e("kTTVideoErrorDomainFetchingInfo", -9976, 0, "fetched info Result is empty after decrypt"));
                            return;
                        }
                    }
                    c1470240oMY.LJJI(this.LJIIIZ);
                    C1471660oOq.LIZJ("VideoInfoFetcher", "_notifySuccess");
                    C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(2, c1470240oMY));
                    if (this.LJIILIIL) {
                        if (c0vox != null) {
                            C1468800oKE c1468800oKE = new C1468800oKE();
                            c1468800oKE.LIZ = c1470240oMY;
                            c1468800oKE.LIZIZ = c0vox.LIZ;
                            C1468790oKD.LIZIZ().LIZLLL(this.LJIIL, null, c1468800oKE);
                        } else {
                            C0VOR.LIZIZ(this.LJIIL, C786410Ut5.J3(jSONObject));
                            C1468790oKD.LIZIZ().LJ(this.LJIIL, this.LIZLLL, c1470240oMY);
                        }
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("_getInfoSuccess mCancelled ");
                sbLIZ2.append(this.LIZIZ);
                sbLIZ2.append(" or jsonObject is null ");
                sbLIZ2.append(jSONObject);
                C1471660oOq.LIZJ("VideoInfoFetcher", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    public final void LJ(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_notifyException ");
        sbLIZ.append(i);
        sbLIZ.append(", excMessage ");
        sbLIZ.append(str);
        C1471660oOq.LIZJ("VideoInfoFetcher", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLJJL(this.LIZ, this.LIZ.obtainMessage(3, i, 0, str));
    }

    public final void LJII(int i, String str, String str2, String str3) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchInfo apiString ");
        sbLIZ.append(str);
        sbLIZ.append(", auth ");
        sbLIZ.append(str2);
        sbLIZ.append(", playversion ");
        sbLIZ.append(i);
        sbLIZ.append(", keyseed ");
        sbLIZ.append(str3);
        C1471660oOq.LIZJ("VideoInfoFetcher", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = str;
        this.LJFF = str2;
        this.LIZJ = 0;
        this.LJIIJ = i;
        this.LJ = str3;
        try {
            new URL(str).getHost();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZIZ();
    }
}
