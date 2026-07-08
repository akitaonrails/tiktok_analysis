package com.bytedance.android.livesdk.bytest.collector;

import X.C089E;
import X.C0VSJ;
import X.C0VSV;
import X.C1163670gO5;
import X.C1163690gO7;
import X.C1292240jjS;
import X.C1C7U;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1292250jjT;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class BytestPerfCollectorManager {
    public static Context LIZ;
    public static C1292240jjS LIZIZ;
    public static CopyOnWriteArraySet<InterfaceC1292250jjT> LIZJ;
    public static JSONArray LIZLLL = new JSONArray();
    public static long LJ = 3000;
    public static long LJFF = 15000;
    public static HandlerThread LJI;
    public static TestHandler LJII;

    public static final class TestHandler extends BPEAHandler {
        public TestHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws Throwable {
            File fileY2;
            C1C7U.LIZ("BytestPerfCollectorManager$TestHandler@f1f2.handleMessage");
            int i = message.what;
            if (i != 1001) {
                if (i == 1002) {
                    Context context = BytestPerfCollectorManager.LIZ;
                    if (context != null && (fileY2 = C786410Ut5.y2(context, "bytest_perf")) != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(fileY2.getPath());
                        sbLIZ.append("/apm_");
                        sbLIZ.append(jCurrentTimeMillis);
                        sbLIZ.append(".txt");
                        C0VSV c0vsv = new C0VSV(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
                        try {
                            c0vsv.write(BytestPerfCollectorManager.LIZLLL.toString().getBytes(Charsets.UTF_8));
                            BytestPerfCollectorManager.LIZLLL = new JSONArray();
                            C2107108Nh.LIZ(c0vsv, null);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = null;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsv, th);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                    TestHandler testHandler = BytestPerfCollectorManager.LJII;
                    if (testHandler != null) {
                        C786410Ut5.LJLJJI(1002, BytestPerfCollectorManager.LJFF, testHandler);
                    }
                }
            } else {
                CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet = BytestPerfCollectorManager.LIZJ;
                if (copyOnWriteArraySet != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    for (InterfaceC1292250jjT interfaceC1292250jjT : copyOnWriteArraySet) {
                        jSONObject.put(interfaceC1292250jjT.name(), interfaceC1292250jjT.LIZ());
                    }
                    JSONArray jSONArray = BytestPerfCollectorManager.LIZLLL;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("time", jCurrentTimeMillis2);
                    jSONObject2.put("appInfo", C1163690gO7.LIZ.LIZ());
                    jSONObject2.put("data", jSONObject);
                    jSONArray.put(jSONObject2);
                }
                TestHandler testHandler2 = BytestPerfCollectorManager.LJII;
                if (testHandler2 != null) {
                    C786410Ut5.LJLJJI(1001, BytestPerfCollectorManager.LJ, testHandler2);
                }
            }
            C1C7U.LIZIZ("BytestPerfCollectorManager$TestHandler@f1f2.handleMessage");
        }
    }

    public static boolean LIZ(File file) {
        boolean zLIZ = true;
        if (file.isDirectory() && file.listFiles() != null) {
            C089E c089e = new C089E(file.listFiles());
            while (c089e.hasNext()) {
                zLIZ = LIZ((File) c089e.next());
            }
        }
        return file.delete() & zLIZ;
    }

    public static void LIZIZ(boolean z) {
        Context context;
        File fileY2;
        C1163670gO5.LIZJ = false;
        HandlerThread handlerThread = LJI;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet = LIZJ;
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.clear();
        }
        if (z && (context = LIZ) != null && (fileY2 = C786410Ut5.y2(context, "bytest_perf")) != null) {
            LIZ(fileY2);
        }
    }
}
