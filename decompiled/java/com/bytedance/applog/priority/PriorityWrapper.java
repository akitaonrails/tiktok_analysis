package com.bytedance.applog.priority;

import X.C08UT;
import X.C1181104jh;
import X.C1404230me5;
import X.C1554940qZA;
import X.C1554950qZB;
import X.C2190751Aob;
import X.C2190771Aod;
import X.C2190781Aoe;
import X.C2191021Ap2;
import X.C2191171ApH;
import X.C2191191ApJ;
import X.C2191831AqL;
import X.C2191891AqR;
import X.C2191981Aqa;
import X.C2192051Aqh;
import X.C23250099c;
import X.C23271099x;
import X.C786410Ut5;
import X.C800740Vb6;
import X.EnumC2191921AqU;
import X.InterfaceC2190741Aoa;
import X.InterfaceC2191781AqG;
import X.RunnableC2191761AqE;
import Y.AObjectS14S0001000_31;
import Y.AObjectS405S0100000_31;
import Y.AObjectS81S0000000_34;
import Y.ARunnableS134S0100000_34;
import android.content.ContentValues;
import android.os.SystemClock;
import com.bytedance.applog.priority.PriorityWrapper;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS0S2000100_22;
import kotlin.jvm.internal.AwS1S2000100_24;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class PriorityWrapper {
    public static final List<String> LJFF = Collections.singletonList("Priority3");
    public static volatile boolean LJI = true;
    public static final int LJII = 3;
    public static final int LJIIIIZZ = 4;
    public static final C800740Vb6 LJIIIZ = new C08UT<Boolean>() { // from class: X.0Vb6
        @Override // X.C08UT
        public final Object LIZ() {
            LoadSoLancet.LIZJ("applog_rust");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("applog_rust");
            LoadSoLancet.LJ(jUptimeMillis, "applog_rust");
            LoadSoLancet.LIZLLL(jUptimeMillis, "applog_rust");
            LoadSoLancet.LIZIZ("applog_rust");
            return Boolean.TRUE;
        }
    };
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C2191191ApJ LIZIZ;
    public final String LIZJ;
    public final C2191831AqL LIZLLL;
    public volatile boolean LJ;

    public static native int initHooks();

    public static native int nativeAddSessionDuration(String str, String str2, String str3, long j, String str4);

    public static native int nativeInitPriority(String str, String str2, String str3, String str4, PriorityCallback priorityCallback, PriorityEventMetaFactory priorityEventMetaFactory, boolean z, boolean z2);

    public static native boolean nativeIsPriorityEmpty(String str);

    public static native boolean nativeIsPriorityMatchEventType(String str, int i);

    public static native int nativeNewSession(String str, String str2, boolean z, long j, String str3);

    public static native int nativePriorityFlush(String str);

    public static native String nativePriorityGetVersionConfig(String str);

    public static native int nativePriorityOnEvent(String str, int i, String str2, NativeLazyString nativeLazyString);

    public static native int nativePrioritySetConfig(String str, String str2);

    public static native int nativeStartPriority(String str);

    public static native void onHttpPostResponse(long j, PriorityHttpResponse priorityHttpResponse);

    public static native void setDefaultThreadNum(int i);

    public static native void setThreadType(int i);

    public final synchronized void LJ() {
        JSONObject jSONObjectLIZ;
        this.LIZIZ.LIZJ.LIZ("initPriority", new AObjectS81S0000000_34(13));
        if (this.LIZ.get()) {
            return;
        }
        try {
            if (LJI) {
                nativeStartPriority(this.LIZJ);
                this.LJ = nativeIsPriorityEmpty(this.LIZJ);
                this.LIZIZ.LIZJ.LIZ("PriorityWrapper:initPriority", new AObjectS81S0000000_34(11));
            } else {
                C2191831AqL c2191831AqL = this.LIZLLL;
                if (c2191831AqL != null && (jSONObjectLIZ = c2191831AqL.LIZLLL.LIZ()) != null && jSONObjectLIZ.length() != 0) {
                    c2191831AqL.LJ(jSONObjectLIZ);
                    c2191831AqL.LJFF.LIZIZ();
                }
            }
            this.LIZ.set(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.LIZJ.LIZIZ("initPriority", th, new AObjectS81S0000000_34(14));
        }
    }

    public final void LIZLLL() {
        this.LIZIZ.LIZJ.LIZ("flush", new AObjectS81S0000000_34(12));
        if (LJI) {
            nativePriorityFlush(this.LIZJ);
            return;
        }
        C2191831AqL c2191831AqL = this.LIZLLL;
        if (c2191831AqL != null) {
            for (RunnableC2191761AqE runnableC2191761AqE : c2191831AqL.LIZLLL().values()) {
                runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:flush", new AwS547S0100000_3(runnableC2191761AqE, 191));
                Iterator<? extends InterfaceC2191781AqG> it2 = runnableC2191761AqE.LLILZLL.iterator();
                while (it2.hasNext()) {
                    it2.next().flush();
                }
                C2192051Aqh c2192051Aqh = runnableC2191761AqE.LLILZIL;
                ScheduledExecutorService scheduledExecutorService = c2192051Aqh.LIZ;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.submit(new ARunnableS134S0100000_34(c2192051Aqh, 92));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:10:0x001a, B:11:0x001f, B:13:0x0025, B:14:0x002b, B:16:0x0031, B:18:0x003d, B:24:0x004c, B:25:0x005d, B:27:0x0063, B:19:0x0041, B:21:0x0045), top: B:33:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.LIZ
            boolean r0 = r0.get()
            if (r0 == 0) goto L9c
            boolean r0 = com.bytedance.applog.priority.PriorityWrapper.LJI     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L41
            java.lang.String r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = nativePriorityGetVersionConfig(r0)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4c
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6d
        L1f:
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L6d
            if (r0 <= 0) goto L4c
            java.util.List<java.lang.String> r0 = X.C2191981Aqa.LIZ     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L2b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L9c
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6d
            org.json.JSONObject r0 = r3.optJSONObject(r1)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L2b
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L6d
            goto L2b
        L41:
            X.1AqL r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L4c
            org.json.JSONObject r3 = r0.LIZJ()     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L4c
            goto L1f
        L4c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6d
            r2.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "version"
            r0 = 0
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L6d
            java.util.List<java.lang.String> r0 = X.C2191981Aqa.LIZ     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L5d:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6d
            r5.put(r0, r2)     // Catch: java.lang.Throwable -> L6d
            goto L5d
        L6d:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.1ApJ r0 = r4.LIZIZ
            X.1AoI r2 = r0.LIZJ
            Y.AObjectS81S0000000_34 r1 = new Y.AObjectS81S0000000_34
            r0 = 8
            r1.<init>(r0)
            java.lang.String r0 = "addDefaultPriorityOptions"
            r2.LIZIZ(r0, r3, r1)
            X.1ApJ r0 = r4.LIZIZ
            X.1Aqf r0 = r0.LIZIZ
            com.bytedance.applog.priority.PriorityCallback r0 = r0.LJFF
            boolean r0 = r0.isMonitorEnabled()
            if (r0 == 0) goto L9c
            X.1ApJ r0 = r4.LIZIZ
            X.1Aqf r0 = r0.LIZIZ
            com.bytedance.applog.priority.PriorityCallback r2 = r0.LJFF
            java.lang.String r1 = "priority addDefaultPriorityOptions error"
            java.lang.String r0 = r3.toString()
            r2.monitorError(r1, r0)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.priority.PriorityWrapper.LIZIZ(org.json.JSONObject):void");
    }

    public final boolean LJFF(int i) {
        if (LJI) {
            return nativeIsPriorityMatchEventType(this.LIZJ, i);
        }
        C2191831AqL c2191831AqL = this.LIZLLL;
        c2191831AqL.getClass();
        EnumC2191921AqU.Companion.getClass();
        EnumC2191921AqU enumC2191921AqULIZ = C2191891AqR.LIZ(i);
        Set<EnumC2191921AqU> set = c2191831AqL.LIZJ.LIZLLL;
        if ((set == null || !set.contains(enumC2191921AqULIZ)) && !((Set) c2191831AqL.LIZLLL.LIZIZ.getValue()).contains(enumC2191921AqULIZ)) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ(JSONObject jSONObject) {
        if (this.LIZ.get()) {
            Iterator<String> it2 = C2191981Aqa.LIZIZ.iterator();
            while (it2.hasNext()) {
                if (jSONObject.has(it2.next())) {
                    this.LIZIZ.LIZJ.LIZ("parsePriorityConfigFromServerResponse", new AObjectS405S0100000_31(jSONObject, 12));
                    if (!LJI) {
                        C2191831AqL c2191831AqL = this.LIZLLL;
                        if (c2191831AqL != null) {
                            c2191831AqL.LJFF(jSONObject);
                            return;
                        }
                        return;
                    }
                    if (nativePrioritySetConfig(this.LIZJ, C786410Ut5.J3(jSONObject)) != 0) {
                        return;
                    }
                    this.LJ = nativeIsPriorityEmpty(this.LIZJ);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PriorityWrapper(android.content.Context r22, X.C2192031Aqf r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.priority.PriorityWrapper.<init>(android.content.Context, X.1Aqf):void");
    }

    public final boolean LJII(final int i, final String str, InterfaceC2190741Aoa<JSONObject> interfaceC2190741Aoa) {
        boolean z = true;
        final boolean zLIZ = false;
        if (!LJI) {
            C2191831AqL c2191831AqL = this.LIZLLL;
            if (c2191831AqL != null) {
                if (c2191831AqL.LIZJ.LIZ.isEmpty() && ((Set) c2191831AqL.LIZLLL.LIZIZ.getValue()).isEmpty()) {
                    return false;
                }
                zLIZ = this.LIZLLL.LIZ(str, i, new C2190751Aob(interfaceC2190741Aoa));
            }
        } else {
            if (this.LJ) {
                this.LIZIZ.LIZJ.LIZ("onPriorityEvent", new AObjectS81S0000000_34(9));
                return false;
            }
            if (!nativeIsPriorityMatchEventType(this.LIZJ, i)) {
                return false;
            }
            int iNativePriorityOnEvent = nativePriorityOnEvent(this.LIZJ, i, str, new NativeLazyString(interfaceC2190741Aoa));
            int i2 = LJII;
            if (iNativePriorityOnEvent != i2) {
                z = false;
            }
            if (iNativePriorityOnEvent != 0 && iNativePriorityOnEvent != i2 && iNativePriorityOnEvent != LJIIIIZZ) {
                this.LIZIZ.LIZJ.LIZIZ("PriorityWrapper:onPriorityEvent", null, new AObjectS14S0001000_31(iNativePriorityOnEvent, 0));
            }
            zLIZ = z;
        }
        this.LIZIZ.LIZJ.LIZ("PriorityWrapper:onPriorityEvent", new Function0() { // from class: X.14fO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2 = zLIZ;
                int i3 = i;
                String str2 = str;
                List<String> list = PriorityWrapper.LJFF;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("match: ");
                sbLIZ.append(z2);
                sbLIZ.append(" eventType: ");
                sbLIZ.append(i3);
                sbLIZ.append(" eventName: ");
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        return zLIZ;
    }

    public final void LIZJ(long j, String str, String str2, String str3) {
        if (LJI) {
            int iNativeAddSessionDuration = nativeAddSessionDuration(this.LIZJ, str, str2, j, str3);
            if (iNativeAddSessionDuration != 0) {
                this.LIZIZ.LIZJ.LIZIZ("PriorityWrapper:addSessionDuration", null, new AObjectS14S0001000_31(iNativeAddSessionDuration, 1));
                return;
            }
            return;
        }
        C2191831AqL c2191831AqL = this.LIZLLL;
        c2191831AqL.LIZ.LIZJ.LIZ("Engine:addTerminateDuration", new C1181104jh(c2191831AqL, str, str2, j, str3));
        long jMax = Math.max(0L, j);
        if (jMax <= 0) {
            return;
        }
        C2191171ApH c2191171ApH = c2191831AqL.LJFF;
        c2191171ApH.LIZ.LIZJ.LIZ("AppSession:addDuration", new AwS1S2000100_24(str, str2, jMax, 2));
        C2190771Aod c2190771AodLIZ = c2191171ApH.LIZ();
        c2190771AodLIZ.getClass();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("session_id", str);
            contentValues.put("page_name", str2);
            contentValues.put("duration", Long.valueOf(jMax));
            if (str3 != null) {
                contentValues.put("extra_params", str3);
            }
            long jInsert = c2190771AodLIZ.LIZIZ().getWritableDatabase().insert("session_page", null, contentValues);
            if (jInsert >= 0) {
                return;
            }
            c2190771AodLIZ.LIZ.LIZIZ("SessionDatabase:insertPage", null, new C1404230me5(jInsert, str, str2, jMax));
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                c2190771AodLIZ.LIZ.LIZIZ("SessionDatabase:insertPage", th, new AwS0S2000100_22(str, str2, jMax, 1));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJI(long j, String str, String str2, boolean z) {
        JSONObject jSONObject;
        if (LJI) {
            int iNativeNewSession = nativeNewSession(this.LIZJ, str, z, j, str2);
            if (iNativeNewSession != 0) {
                this.LIZIZ.LIZJ.LIZIZ("PriorityWrapper:newSession", null, new AObjectS14S0001000_31(iNativeNewSession, 2));
                return;
            }
            return;
        }
        C2191171ApH c2191171ApH = this.LIZLLL.LJFF;
        c2191171ApH.LIZ.LIZJ.LIZ("AppSession:newSession", new C1554940qZA(str, z));
        String str3 = c2191171ApH.LIZLLL;
        c2191171ApH.LIZLLL = str;
        if (str2 != null) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (!((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C2191021Ap2(c2191171ApH, new C2190781Aoe(str, z, jSONObject, j), str, z, str2, null))).booleanValue() || Intrinsics.LJFF(str3, c2191171ApH.LIZLLL)) {
            return;
        }
        c2191171ApH.LIZ.LIZJ.LIZ("AppSession:newSession", new C1554950qZB(str3, str, z));
        c2191171ApH.LIZIZ();
        try {
            c2191171ApH.LIZIZ.LIZIZ(str, str3, z);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c2191171ApH.LIZ.LIZJ.LIZIZ("AppSession:newSession", th2, AFwS225S0000000_34.get$arr$(297));
        }
    }
}
