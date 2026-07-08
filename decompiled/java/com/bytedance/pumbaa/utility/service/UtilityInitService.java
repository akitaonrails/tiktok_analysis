package com.bytedance.pumbaa.utility.service;

import X.AbstractC19994813Le;
import X.C0W9R;
import X.C0W9S;
import X.C0W9U;
import X.C0WP5;
import X.C0WSW;
import X.C0WSX;
import X.C0WZA;
import X.C308480C7i;
import X.C813160Vv8;
import X.C823280WRi;
import X.C823450WRz;
import X.C825320WZe;
import X.C837730Wtf;
import X.C838890WvX;
import X.C838900WvY;
import X.C838930Wvb;
import X.C838940Wvc;
import X.C838950Wvd;
import X.C838960Wve;
import X.C838980Wvg;
import X.C838990Wvh;
import X.InterfaceC837740Wtg;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import com.bytedance.bpea.transmit.IRegister;
import com.bytedance.bpea.transmit.StackManager;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.pumbaa.bpea.adapter.BPEAMonitorTransform;
import com.bytedance.pumbaa.common.business.pl.CrossStackPageStack;
import com.bytedance.pumbaa.common.business.pl.PageStackConfig;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDConfig;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class UtilityInitService implements IPumbaaModuleInitService {
    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZIZ(Context context, C823450WRz c823450WRz) {
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final String name() {
        return "UtilityInit";
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZ(Context context, C823450WRz c823450WRz) throws Throwable {
        MethodIDConfig methodIDConfig;
        AutoDFIDConfig autoDFIDConfig;
        if (!C825320WZe.LJ()) {
            return;
        }
        C813160Vv8.LIZIZ();
        BPEAMonitorTransform.LIZ.getClass();
        C0WZA c0wza = BPEAMonitorTransform.LIZJ;
        CopyOnWriteArraySet<InterfaceC837740Wtg> copyOnWriteArraySet = C837730Wtf.LIZIZ;
        copyOnWriteArraySet.remove(c0wza);
        copyOnWriteArraySet.add(c0wza);
        C838990Wvh.LIZ.getClass();
        if (C838990Wvh.LIZJ) {
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Pumbaa_Utility", AFwS200S0000000_13.get$arr$(55), 6, null);
            return;
        }
        BPEATransmitConfig bPEATransmitConfig = C838950Wvd.LIZ;
        BPEATransmitConfig bPEATransmitConfig2 = (BPEATransmitConfig) C308480C7i.LIZLLL(BPEATransmitConfig.class, "bpea_transmit_config", bPEATransmitConfig);
        if (bPEATransmitConfig2 != null) {
            bPEATransmitConfig = bPEATransmitConfig2;
        }
        C0WP5.LIZ = bPEATransmitConfig.enable;
        C0WP5.LIZIZ = bPEATransmitConfig.enableThreadHook;
        C0WP5.LIZJ = bPEATransmitConfig.enableHandlerHook;
        C0WP5.LIZLLL = bPEATransmitConfig.enableAsyncTaskHook;
        C0WP5.LJ = bPEATransmitConfig.enableHandlerHook;
        C0WP5.LJFF = bPEATransmitConfig.enableThreadPoolHook;
        C0WP5.LJI = bPEATransmitConfig.enableCoroutineHook;
        C0WP5.LJII = bPEATransmitConfig.enableTimerHook;
        C0WP5.LJIIIIZZ = bPEATransmitConfig.enableHandlerReflectHook;
        CrossStackConfig crossStackConfig = C838940Wvc.LIZ;
        CrossStackConfig crossStackConfig2 = (CrossStackConfig) C308480C7i.LIZLLL(CrossStackConfig.class, "pns_cross_stack_config", crossStackConfig);
        if (crossStackConfig2 != null) {
            crossStackConfig = crossStackConfig2;
        }
        int i = StackManager.LIZ;
        StackManager.LIZLLL = crossStackConfig.enableCollectStack;
        StackManager.LJ = crossStackConfig.stackMaxCount;
        StackManager.LJI = crossStackConfig.stackCollectMode;
        StackManager.LJII = crossStackConfig.stackSamplingRate;
        StackManager.LJIIIIZZ = crossStackConfig.stackSource;
        StackManager.LJIIIZ = crossStackConfig.enableReturnSampleStatus;
        StackManager.LJIIJ = crossStackConfig.enableInjectPauseStatus;
        C0W9U.LIZIZ = new C0W9S() { // from class: X.0WvW
            /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
            @Override // X.C0W9S
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0W9T LIZ(X.C0W9T r7) {
                /*
                    Method dump skipped, instruction units count: 307
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C838880WvW.LIZ(X.0W9T):X.0W9T");
            }
        };
        try {
            methodIDConfig = C838930Wvb.LIZ;
            MethodIDConfig methodIDConfig2 = (MethodIDConfig) C308480C7i.LIZLLL(MethodIDConfig.class, "pns_methodID_config", methodIDConfig);
            if (methodIDConfig2 != null) {
                methodIDConfig = methodIDConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            methodIDConfig = C838930Wvb.LIZ;
        }
        MethodIDManager.LIZ = c823450WRz.LIZ.LIZ;
        MethodIDManager.LIZIZ = methodIDConfig.enable;
        MethodIDManager.LIZJ = methodIDConfig.optimizeMode;
        MethodIDManager.LIZLLL = methodIDConfig.enableCollectRuntimeInfo;
        MethodIDManager.LJ = methodIDConfig.enableCollectConfigInfo;
        double d = methodIDConfig.globalSampleRate;
        boolean z = methodIDConfig.enableDynamicSampleRate;
        double d2 = methodIDConfig.downgradeRate;
        double d3 = methodIDConfig.minDynamicSampleRate;
        long j = methodIDConfig.dynamicSampleTimeWindow;
        C838890WvX.LIZ = d;
        C838890WvX.LJ = z;
        C838890WvX.LJFF = d2;
        C838890WvX.LJII = d3;
        C838890WvX.LJI = j;
        if (z) {
            ScheduledFuture<?> scheduledFuture = C838890WvX.LJIIJJI;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            C838890WvX.LJIIJJI = ((ScheduledExecutorService) MethodIDManager.LJI.getValue()).scheduleAtFixedRate(new ARunnableS92S0000000_13(42), AbstractC19994813Le.Default.nextLong(C838890WvX.LJI), C838890WvX.LJI, TimeUnit.SECONDS);
        } else {
            ScheduledFuture<?> scheduledFuture2 = C838890WvX.LJIIJJI;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
            }
        }
        if (MethodIDManager.LIZ) {
            ((ScheduledExecutorService) MethodIDManager.LJI.getValue()).scheduleAtFixedRate(new ARunnableS92S0000000_13(41), 3L, 3L, TimeUnit.SECONDS);
        }
        if (MethodIDManager.LIZLLL) {
            ScheduledFuture<?> scheduledFuture3 = C838980Wvg.LJII;
            if (scheduledFuture3 != null) {
                scheduledFuture3.cancel(false);
            }
            C838980Wvg.LJII = ((ScheduledExecutorService) MethodIDManager.LJI.getValue()).scheduleAtFixedRate(new ARunnableS92S0000000_13(40), 5L, 5L, TimeUnit.SECONDS);
        }
        try {
            C838980Wvg.LIZLLL = new JSONObject(new Gson().LJIILL(methodIDConfig));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C823280WRi.LIZLLL(e);
        }
        try {
            autoDFIDConfig = C838960Wve.LIZ;
            AutoDFIDConfig autoDFIDConfig2 = (AutoDFIDConfig) C308480C7i.LIZLLL(AutoDFIDConfig.class, "pns_auto_dfid_config", autoDFIDConfig);
            if (autoDFIDConfig2 != null) {
                autoDFIDConfig = autoDFIDConfig2;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            autoDFIDConfig = C838960Wve.LIZ;
        }
        AutoDFIDManager.LIZIZ = autoDFIDConfig.enable;
        try {
            if (CrossStackPageStack.LIZLLL) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("CrossStackPageStack", AFwS200S0000000_13.get$arr$(294), 5, null);
            } else {
                PageStackConfig pageStackConfig = C0W9R.LIZ;
                PageStackConfig pageStackConfig2 = (PageStackConfig) C308480C7i.LIZLLL(PageStackConfig.class, "pns_cross_page_config", pageStackConfig);
                if (pageStackConfig2 != null) {
                    pageStackConfig = pageStackConfig2;
                }
                CrossStackPageStack.LIZ = pageStackConfig;
                if (!pageStackConfig.enable) {
                    CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
                    C0WSW.LIZ("CrossStackPageStack", AFwS200S0000000_13.get$arr$(295), 3, null);
                } else {
                    C838990Wvh.LIZ.getClass();
                    final C0W9S c0w9s = C0W9U.LIZIZ;
                    C0W9U.LIZIZ = new C0W9S() { // from class: X.0W9P
                        @Override // X.C0W9S
                        public final C0W9T LIZ(C0W9T c0w9t) {
                            C0W9S c0w9s2 = c0w9s;
                            if (c0w9s2 != null) {
                                c0w9t = c0w9s2.LIZ(c0w9t);
                            }
                            try {
                                PageStackConfig pageStackConfig3 = CrossStackPageStack.LIZ;
                                if (pageStackConfig3.enable) {
                                    if (pageStackConfig3.sampleTimeType == 0) {
                                        if (c0w9t == null) {
                                            C0W9T c0w9tLIZIZ = C0W9Q.LIZIZ();
                                            boolean zLIZ = C0W9Q.LIZ(CrossStackPageStack.LIZ.sampleRate);
                                            c0w9tLIZIZ.setData(CrossStackPageStack.LIZJ, Boolean.valueOf(zLIZ));
                                            if (zLIZ) {
                                                c0w9tLIZIZ.setData(CrossStackPageStack.LIZIZ, CrossStackPageStack.LIZ());
                                                return c0w9tLIZIZ;
                                            }
                                            return c0w9tLIZIZ;
                                        }
                                        Object data = c0w9t.getData(CrossStackPageStack.LIZJ);
                                        if (!(data instanceof Boolean) || ((Boolean) data) == null) {
                                            boolean zLIZ2 = C0W9Q.LIZ(CrossStackPageStack.LIZ.sampleRate);
                                            c0w9t.setData(CrossStackPageStack.LIZJ, Boolean.valueOf(zLIZ2));
                                            if (zLIZ2) {
                                                c0w9t.setData(CrossStackPageStack.LIZIZ, CrossStackPageStack.LIZ());
                                                return c0w9t;
                                            }
                                        }
                                    } else if (c0w9t == null) {
                                        if (C786410Ut5.u3() == CrossStackPageStack.LJ && C0W9Q.LIZ(CrossStackPageStack.LIZ.sampleRate)) {
                                            C0W9T c0w9tLIZIZ2 = C0W9Q.LIZIZ();
                                            c0w9tLIZIZ2.setData(CrossStackPageStack.LIZIZ, CrossStackPageStack.LIZ());
                                            return c0w9tLIZIZ2;
                                        }
                                    } else if (c0w9t.getData(CrossStackPageStack.LIZIZ) == null && C786410Ut5.u3() == CrossStackPageStack.LJ && C0W9Q.LIZ(CrossStackPageStack.LIZ.sampleRate)) {
                                        c0w9t.setData(CrossStackPageStack.LIZIZ, CrossStackPageStack.LIZ());
                                        return c0w9t;
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            return c0w9t;
                        }
                    };
                    CrossStackPageStack.LIZLLL = true;
                    CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList4 = C0WSW.LIZ;
                    C0WSW.LIZ("CrossStackPageStack", AFwS200S0000000_13.get$arr$(296), 3, null);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C823280WRi.LJII("CrossStackPageStack init", th3, new LinkedHashMap());
        }
        synchronized (C838990Wvh.LIZ) {
            if (!C838990Wvh.LIZJ) {
                for (IRegister iRegister : ServiceManager.get().getServices(IRegister.class)) {
                    if (iRegister.enable()) {
                        C838990Wvh.LIZ.getClass();
                        int i2 = C838990Wvh.LIZIZ;
                        C838990Wvh.LIZIZ = i2 + 1;
                        iRegister.LIZ(i2);
                    }
                }
                C838990Wvh.LIZJ = true;
            } else {
                throw new RuntimeException("init must be called only once");
            }
        }
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList5 = C0WSW.LIZ;
        C0WSW.LIZ("Pumbaa_Utility", new C838900WvY(bPEATransmitConfig, crossStackConfig, methodIDConfig, autoDFIDConfig), 3, null);
    }
}
