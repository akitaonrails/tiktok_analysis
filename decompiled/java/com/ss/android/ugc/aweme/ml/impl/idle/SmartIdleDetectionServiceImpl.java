package com.ss.android.ugc.aweme.ml.impl.idle;

import X.AnonymousClass0956;
import X.C01QE;
import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C0NWL;
import X.C0PEM;
import X.C0R1F;
import X.C1510050pOl;
import X.C1510570pPb;
import X.C1510580pPc;
import X.C1510600pPe;
import X.C189200o6;
import X.C1906580ziK;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import Y.AfS192S0100000_23;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.ab.SmartIdleDetectionConfig;
import com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartIdleDetectionServiceImpl extends SmartIdleDetectionService {
    public volatile AnonymousClass0956 LJFF;
    public volatile long LJII;
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final Object LJ = new Object();
    public volatile long LJI = 600000;

    public final void LIZJ() {
        AnonymousClass0956 anonymousClass0956;
        synchronized (this.LJ) {
            try {
                if (this.LIZIZ.get() && !this.LIZLLL.get() && ((anonymousClass0956 = this.LJFF) == null || !anonymousClass0956.isActive())) {
                    this.LJFF = C23250099c.LIZLLL(this.LIZ, null, null, new C01QE(this.LJI, this, null), 3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService
    public final boolean isRunning() {
        return this.LIZIZ.get();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService, com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService
    public final void onUserInteraction() {
        if (this.LIZIZ.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.LJII < 1000) {
                return;
            }
            this.LJII = jUptimeMillis;
            synchronized (C1510580pPc.LIZ) {
                C1510580pPc.LIZIZ = 0;
                C1510580pPc.LIZJ = 0;
            }
            C0NWL.LIZ.getClass();
            C0NWL.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService, com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService
    public final void start() {
        Object c098200Yq;
        if (this.LIZIZ.compareAndSet(false, true)) {
            SmartIdleDetectionConfig smartIdleDetectionConfigLIZ = C1510600pPe.LIZ();
            if (smartIdleDetectionConfigLIZ == null || !smartIdleDetectionConfigLIZ.getEnabled()) {
                this.LIZIZ.set(false);
                return;
            }
            C1510570pPb.LIZ.getClass();
            String strLIZIZ = C1510570pPb.LIZIZ("idle_detection_reset_version");
            Keva kevaLIZ = C0R1F.LIZ();
            if ((kevaLIZ != null ? kevaLIZ.getInt(strLIZIZ, 0) : 0) != smartIdleDetectionConfigLIZ.getResetVersion()) {
                C0R1F.LIZJ(C1510570pPb.LIZIZ("idle_detection_phone_weekday_hour_pairs"));
                C0R1F.LIZJ(C1510570pPb.LIZIZ("idle_detection_suppress_until_timestamp"));
                C0R1F.LIZJ(C1510570pPb.LIZIZ("idle_detection_suppress_backoff_seconds"));
                int resetVersion = smartIdleDetectionConfigLIZ.getResetVersion();
                String strLIZIZ2 = C1510570pPb.LIZIZ("idle_detection_reset_version");
                Keva kevaLIZ2 = C0R1F.LIZ();
                if (kevaLIZ2 != null) {
                    kevaLIZ2.storeInt(strLIZIZ2, resetVersion);
                }
                C0NWL.LIZ.getClass();
                C0NWL.LIZIZ();
                C1510580pPc.LIZ.LIZIZ();
            }
            long pollingIntervalSeconds = smartIdleDetectionConfigLIZ.getPollingIntervalSeconds();
            if (pollingIntervalSeconds <= 0) {
                pollingIntervalSeconds = 600;
            }
            this.LJI = pollingIntervalSeconds * 1000;
            this.LIZLLL.set(C1906580ziK.LJI());
            if (this.LIZJ.compareAndSet(false, true)) {
                try {
                    c098200Yq = C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new AfS192S0100000_23(this, 5));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
            LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService
    public final void stop() {
        if (this.LIZIZ.compareAndSet(true, false)) {
            synchronized (this.LJ) {
                try {
                    AnonymousClass0956 anonymousClass0956 = this.LJFF;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LJFF = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1510580pPc.LIZ.LIZIZ();
            C0NWL.LIZ.getClass();
            C0NWL.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0285 A[Catch: all -> 0x030c, TryCatch #3 {, blocks: (B:121:0x01ec, B:123:0x01f5, B:130:0x0202, B:132:0x0209, B:133:0x020d, B:135:0x0220, B:145:0x0235, B:147:0x023e, B:148:0x0242, B:150:0x024b, B:151:0x024f, B:153:0x0258, B:171:0x027b, B:173:0x0285, B:178:0x028d, B:180:0x0293, B:181:0x0297, B:190:0x02a9, B:204:0x02d3, B:206:0x02d7, B:207:0x02f5, B:201:0x02c7, B:203:0x02d1, B:195:0x02b6, B:197:0x02bb, B:200:0x02c1, B:212:0x02fd), top: B:293:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0293 A[Catch: all -> 0x030c, TryCatch #3 {, blocks: (B:121:0x01ec, B:123:0x01f5, B:130:0x0202, B:132:0x0209, B:133:0x020d, B:135:0x0220, B:145:0x0235, B:147:0x023e, B:148:0x0242, B:150:0x024b, B:151:0x024f, B:153:0x0258, B:171:0x027b, B:173:0x0285, B:178:0x028d, B:180:0x0293, B:181:0x0297, B:190:0x02a9, B:204:0x02d3, B:206:0x02d7, B:207:0x02f5, B:201:0x02c7, B:203:0x02d1, B:195:0x02b6, B:197:0x02bb, B:200:0x02c1, B:212:0x02fd), top: B:293:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d7 A[Catch: all -> 0x030c, TryCatch #3 {, blocks: (B:121:0x01ec, B:123:0x01f5, B:130:0x0202, B:132:0x0209, B:133:0x020d, B:135:0x0220, B:145:0x0235, B:147:0x023e, B:148:0x0242, B:150:0x024b, B:151:0x024f, B:153:0x0258, B:171:0x027b, B:173:0x0285, B:178:0x028d, B:180:0x0293, B:181:0x0297, B:190:0x02a9, B:204:0x02d3, B:206:0x02d7, B:207:0x02f5, B:201:0x02c7, B:203:0x02d1, B:195:0x02b6, B:197:0x02bb, B:200:0x02c1, B:212:0x02fd), top: B:293:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.impl.idle.SmartIdleDetectionServiceImpl.LIZ():void");
    }

    public static Number LIZIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            ReturnCode returnCode = new ReturnCode(-1, -1);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
            if (producer$default != null) {
                c098200Yq = producer$default.getNumericFeature(str, (JSONObject) null, "idle_detection", returnCode);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Number) obj;
    }
}
