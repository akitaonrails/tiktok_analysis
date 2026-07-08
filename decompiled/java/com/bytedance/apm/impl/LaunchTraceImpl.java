package com.bytedance.apm.impl;

import X.C0NBU;
import X.C0V2C;
import X.C0V2D;
import X.C0V2E;
import X.C0V2K;
import X.C0V2L;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787900UvU;
import X.C791040V1i;
import X.C791050V1j;
import X.C791060V1k;
import X.C791070V1l;
import X.C791080V1m;
import X.C791090V1n;
import X.C791120V1q;
import X.C792400V6o;
import Y.ARunnableS0S2101000_13;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LaunchTraceImpl implements ILaunchTrace {
    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void cancelTrace() {
        if (C0V2C.LIZIZ) {
            C0V2D.LIZIZ();
        }
        C791040V1i c791040V1i = C0V2C.LIZ;
        if (c791040V1i != null) {
            c791040V1i.LIZJ.clear();
            C0V2C.LIZ = null;
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startTrace() {
        C0V2C.LIZ();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endSpan(String str, String str2) {
        C791040V1i c791040V1i = C0V2C.LIZ;
        if (c791040V1i != null) {
            ConcurrentHashMap<String, C791090V1n> concurrentHashMap = c791040V1i.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("#");
            sbLIZ.append(str2);
            C791090V1n c791090V1n = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
            if (c791090V1n != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String name = C786410Ut5.u3().getName();
                c791090V1n.LIZIZ = jCurrentTimeMillis;
                c791090V1n.LIZJ = name;
                ConcurrentHashMap<String, C791090V1n> concurrentHashMap2 = c791040V1i.LIZJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("#");
                sbLIZ2.append(str2);
                concurrentHashMap2.put(C2188811AlT.LIZIZ(sbLIZ2), c791090V1n);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startSpan(String str, String str2) {
        C791040V1i c791040V1i = C0V2C.LIZ;
        if (c791040V1i != null) {
            ConcurrentHashMap<String, C791090V1n> concurrentHashMap = c791040V1i.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("#");
            sbLIZ.append(str2);
            if (concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ)) == null) {
                C791090V1n c791090V1n = new C791090V1n(System.currentTimeMillis());
                ConcurrentHashMap<String, C791090V1n> concurrentHashMap2 = c791040V1i.LIZJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("#");
                sbLIZ2.append(str2);
                concurrentHashMap2.put(C2188811AlT.LIZIZ(sbLIZ2), c791090V1n);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endTrace(final int i, String str, long j) {
        C791060V1k c791060V1k;
        final long[] jArrLIZ;
        C0V2L c0v2l;
        C0V2L c0v2l2;
        if (C0V2C.LIZIZ) {
            C0V2D.LIZIZ();
        }
        C791040V1i c791040V1i = C0V2C.LIZ;
        if (c791040V1i != null) {
            if (i == -1 && C792400V6o.LJIIIIZZ()) {
                throw new IllegalArgumentException("Launch mode is both none");
            }
            if (c791040V1i.LIZ() && !C791120V1q.LIZ) {
                C791120V1q.LIZ = true;
                C791070V1l.LIZ.LIZ().getClass();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            c791040V1i.LIZIZ = jCurrentTimeMillis;
            long j2 = jCurrentTimeMillis - c791040V1i.LIZ;
            if (j > 0 && j2 > j) {
                return;
            }
            if (c791040V1i.LIZ() && C0V2E.LLJILJILJ && C791040V1i.LJFF) {
                C791040V1i.LJFF = false;
                final long j3 = c791040V1i.LIZ;
                final long j4 = c791040V1i.LIZIZ;
                try {
                    c0v2l = C0V2K.LJIJJLI;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (c0v2l != null && (c0v2l2 = C0V2K.LJIL) != null && c0v2l != c0v2l2) {
                    int i2 = c0v2l.LIZIZ;
                    if (i2 == 0) {
                        i2 = C0V2K.LJ - 1;
                    }
                    jArrLIZ = C0V2K.LIZ(c0v2l2.LIZ, i2);
                } else {
                    jArrLIZ = null;
                }
                final long jUptimeMillis = SystemClock.uptimeMillis();
                if (jArrLIZ != null) {
                    C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0V1r
                        public final /* synthetic */ String LLILZLL = "";

                        public final void LIZ() {
                            try {
                                int i3 = C0V2K.LIZ;
                                String strLIZJ = C0V2K.LIZJ(jUptimeMillis, jArrLIZ);
                                if (TextUtils.isEmpty(strLIZJ)) {
                                    return;
                                }
                                long j5 = j4 - j3;
                                JSONObject jSONObjectLIZ = C791560V3i.LIZLLL().LIZ();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
                                jSONObject.put("block_duration", j5);
                                jSONObject.put("stack", strLIZJ);
                                jSONObject.put("stack_key", "4194302\n");
                                jSONObject.put(Scene.SCENE_SERVICE, "launchTrace");
                                jSONObject.put("cost_time", j5);
                                jSONObject.put("method_time", j5);
                                jSONObject.put("message", "launchTrace");
                                jSONObject.put("event_type", "lag_drop_frame");
                                JSONObject jSONObjectLIZJ = C2257208ss.LIZ().LIZJ(true);
                                jSONObjectLIZJ.put("crash_section", C792400V6o.LJII(System.currentTimeMillis()));
                                jSONObjectLIZJ.put("trace_type", "launchTrace");
                                jSONObjectLIZJ.put("launchMode", String.valueOf(i));
                                jSONObjectLIZJ.put("customLaunchMode", this.LLILZLL);
                                jSONObject.put("custom", jSONObjectLIZ);
                                jSONObject.put("filters", jSONObjectLIZJ);
                                C792310V6f.LJIIIZ().LIZJ(new C0V1I("drop_frame_stack", jSONObject));
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TraceStats@aae3.reportPerfInfo$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TraceStats@aae3.reportPerfInfo$1");
                        }
                    });
                }
            }
            if (c791040V1i.LIZ()) {
                C791050V1j c791050V1j = C791070V1l.LIZ;
                synchronized (c791050V1j) {
                    if (c791050V1j.LIZIZ == null) {
                        c791050V1j.LIZIZ = new C791060V1k(new C791080V1m());
                    }
                    c791060V1k = c791050V1j.LIZIZ;
                }
                c791060V1k.getClass();
            }
            C787900UvU.LIZ.LIZJ(new ARunnableS0S2101000_13(c791040V1i, i, str, 3));
            if (!c791040V1i.LIZ()) {
                return;
            }
            ExecutorService executorService = C0NBU.LIZ;
        }
    }
}
