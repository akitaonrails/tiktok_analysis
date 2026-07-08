package com.ss.android.ugc.aweme.ml.common;

import X.C0B34;
import X.C0BFS;
import X.C0CCZ;
import X.C0CN5;
import X.C0NAL;
import X.C0VZ0;
import X.C1152704f7;
import X.C1244904tz;
import X.C1510060pOm;
import X.C1510320pPC;
import X.C1510520pPW;
import X.C1510710pPp;
import X.C1510740pPs;
import X.C1510800pPy;
import X.C1510850pQ3;
import X.C1510910pQ9;
import X.C1512230pSH;
import X.C1BCF;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1510780pPw;
import X.InterfaceC1511680pRO;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.feature.FeatureServiceManagerImpl;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes24.dex */
public final class ClientAiInitServiceImpl implements IInferenceEngineService {

    /* JADX INFO: loaded from: classes10.dex */
    @C1BCF(distinctId = 103, taskType = "preload")
    public static final class ClientAiInitTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "ClientAiInitServiceImpl$ClientAiInitTask";
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.C0CCZ
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return C0BFS.LIZ != -1 ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            long j = C0BFS.LIZ;
            if (j != -1) {
                C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS109S0100000_9(this, 97));
            } else {
                MLCommonService.Companion.getClass();
                C0NAL.LIZ.checkAndInit(2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService
    public final void LIZ() {
        if (C1510060pOm.LIZ == null) {
            C1510060pOm.LIZ = FeatureServiceManagerImpl.INSTANCE;
        }
        if (C1510320pPC.LIZ == null) {
            C1510320pPC.LIZ = C1510520pPW.LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService
    public final void init(Context context) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            try {
                if (C1510060pOm.LIZ == null) {
                    C1510060pOm.LIZ = FeatureServiceManagerImpl.INSTANCE;
                }
                if (C1510320pPC.LIZ == null) {
                    C1510320pPC.LIZ = C1510520pPW.LIZ;
                }
                InterfaceC1511680pRO interfaceC1511680pRO = new InterfaceC1511680pRO() { // from class: X.0pQ0
                    @Override // X.InterfaceC1511680pRO
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1511680pRO
                    public final ExecutorService LIZ() {
                        ExecutorService executorService = C2123308Tn.LIZ;
                        return C2123308Tn.LIZ;
                    }

                    @Override // X.InterfaceC1511680pRO
                    public final ScheduledExecutorService LIZJ() {
                        ScheduledExecutorService scheduledExecutorService = C2123108Tl.LIZ;
                        return C2123108Tl.LIZ;
                    }

                    @Override // X.InterfaceC1511680pRO
                    public final C1510900pQ8 getLogger() {
                        return C1510890pQ7.LIZ;
                    }
                };
                C786410Ut5.N3(context);
                C1510910pQ9.LIZ = interfaceC1511680pRO;
                C1510850pQ3.LIZ = new C1510800pPy() { // from class: X.0pPz
                    @Override // X.C1510800pPy
                    public final ExecutorService LIZ() {
                        ExecutorService executorService = C2123308Tn.LIZ;
                        return C2123308Tn.LIZ;
                    }

                    @Override // X.C1510800pPy
                    public final ScheduledExecutorService LIZIZ() {
                        ScheduledExecutorService scheduledExecutorService = C2123108Tl.LIZ;
                        return C2123108Tl.LIZ;
                    }
                };
                if (!((Boolean) C1244904tz.LIZIZ.getValue()).booleanValue()) {
                    C1512230pSH.LIZ(context);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                i = -1;
            }
        }
        MLCommonService.Companion.getClass();
        i = 0;
        C0NAL.LIZ.checkAndInit(0);
        if (C0B34.LIZ) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0pPk
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ClientAiInitServiceImpl@78e0.init$2");
                    try {
                        C1510710pPp c1510710pPp = InterfaceC1510780pPw.LIZ;
                        C1152704f7 c1152704f7 = new C1152704f7();
                        c1510710pPp.getClass();
                        C1510710pPp.LIZ(c1152704f7);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ClientAiInitServiceImpl@78e0.init$2");
                }
            });
        } else {
            C1510710pPp c1510710pPp = InterfaceC1510780pPw.LIZ;
            C1152704f7 c1152704f7 = new C1152704f7();
            c1510710pPp.getClass();
            C1510710pPp.LIZ(c1152704f7);
        }
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new ClientAiInitTask());
        c799890VZj.LIZIZ();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C1510740pPs.LIZ.getClass();
        C1510740pPs.LIZIZ = jCurrentTimeMillis2;
        C1510740pPs.LIZJ = i;
    }
}
