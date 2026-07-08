package com.bytedance.ies.ugc.statisticlogger.config;

import X.AbstractC807600VmA;
import X.C09JN;
import X.C0B4R;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1906580ziK;
import X.C2162308dZ;
import X.C2210321Bf4;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C310290CEh;
import X.C786410Ut5;
import X.C807620VmC;
import X.C807630VmD;
import X.C827000WcM;
import X.C827010WcN;
import X.C827020WcO;
import X.C827030WcP;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.ARunnableS92S0000000_13;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.statistic.StatisticLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class LazyLoadLegoTask implements C0CCZ, InterfaceC799590VYf {
    public final Application LL;
    public final Runnable LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LazyLoadLegoTask";
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        return 0;
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
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return C310290CEh.LIZ ? 2 : 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LinkedList linkedList;
        C827000WcM c827000WcM;
        boolean zLJI = MethodIDManager.LJI(72086);
        Runnable runnable = this.LLILLJJLI;
        if (runnable != null) {
            runnable.run();
        }
        C827020WcO c827020WcO = new C827020WcO();
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        c827020WcO.LIZ = c2213981Bky.LJFF();
        c827020WcO.LIZIZ = c2213981Bky.getChannel();
        c2213981Bky.isDebug();
        c827020WcO.LIZJ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        c827020WcO.LIZLLL = c2213981Bky.LIZJ();
        c2213981Bky.LIZIZ();
        c827020WcO.LJ = c2213981Bky.getAppId();
        C827000WcM c827000WcM2 = new C827000WcM();
        TextUtils.isEmpty(c827020WcO.LIZ);
        if (!TextUtils.isEmpty(c827020WcO.LIZIZ)) {
            c827000WcM2.LIZ = c827020WcO.LIZIZ;
        }
        TextUtils.isEmpty(c827020WcO.LIZJ);
        TextUtils.isEmpty(null);
        TextUtils.isEmpty(c827020WcO.LIZLLL);
        c827000WcM2.LIZIZ = c827020WcO.LJ;
        Application application = this.LL;
        boolean zLJI2 = C2162308dZ.LJI(context);
        C807620VmC c807620VmC = C807630VmD.LIZ;
        c807620VmC.LJI = application;
        c807620VmC.LJII = c827000WcM2;
        if (!c807620VmC.LIZLLL.getAndSet(true)) {
            AbstractC807600VmA abstractC807600VmA = new AbstractC807600VmA() { // from class: X.1Bf4
                @Override // X.InterfaceC807610VmB
                public final void LIZIZ() {
                }

                public static final void LIZJ(Context context2, C827000WcM c827000WcM3) {
                    boolean z;
                    boolean z2;
                    C2213981Bky c2213981Bky2 = C2213981Bky.LIZIZ;
                    DeviceRegisterManager.setForceOpenNewUserMode(c2213981Bky2.isRegressionTest());
                    Keva keva = C19254010Ug.LIZ;
                    if (!c2213981Bky2.isOffline() && !c2213981Bky2.isRegressionTest()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z3 = keva.getBoolean("open_event_sampling", !z);
                    AppLog.setEventSamplingEnable(z3);
                    AppLog.setTeaEventSamplingEnable(z3);
                    DeviceRegisterManager.setAppId(c827000WcM3.LIZIZ);
                    DeviceRegisterManager.setChannel(c827000WcM3.LIZ);
                    if (!c2213981Bky2.isOffline() && !c2213981Bky2.isRegressionTest()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    DeviceRegisterManager.setLocalTest(z2);
                    C2210691Bff c2210691Bff = C2210691Bff.LIZIZ;
                    String[] strArr = {c2210691Bff.LIZJ()};
                    String[] strArr2 = {c2210691Bff.LJI()};
                    String[] strArr3 = {c2210691Bff.LIZ(), c2210691Bff.LIZ()};
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(c2210691Bff.LIZLLL());
                    sbLIZ.append("/service/2/app_alert_check/");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    String strLIZIZ2 = c2210691Bff.LIZIZ();
                    String[] strArr4 = {c2210691Bff.LIZJ()};
                    String strLIZIZ3 = c2210691Bff.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("https://");
                    sbLIZ2.append(c2210691Bff.LIZLLL());
                    C1486650on1 c1486650on1 = new C1486650on1(strArr, strArr2, strArr3, strLIZIZ, strLIZIZ2, strArr4, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ2));
                    AppLog.setAppContext(C0X2C.LIZ);
                    AppLog.registerHeaderCustomCallback(new C1AF1() { // from class: X.10Uf
                        @Override // X.C1AF1
                        public final void LIZ(JSONObject jSONObject) {
                            try {
                                jSONObject.put("nqe", C2210691Bff.LIZIZ.getEffectiveConnectionType());
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (C2210441BfG.LIZIZ.LIZ()) {
                                arrayList.addAll((Collection) C191812102g.LIZIZ.getValue());
                            }
                            C0VJU.LIZ(jSONObject);
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    jSONObject.remove((String) it2.next());
                                }
                            }
                            IAppLogReaperService iAppLogReaperService = (IAppLogReaperService) PluggableExtentionKt.pluggableSpi(IAppLogReaperService.class);
                            if (iAppLogReaperService != null) {
                                iAppLogReaperService.LIZ(jSONObject);
                            }
                        }
                    });
                    AppLog.init(context2, false, c1486650on1);
                }
            };
            if (!TextUtils.isEmpty("applog") && zLJI2) {
                Application application2 = c807620VmC.LJI;
                if (application2 != null && (c827000WcM = c807620VmC.LJII) != null) {
                    C2210321Bf4.LIZJ(application2, c827000WcM);
                }
                ((ConcurrentHashMap) c807620VmC.LIZ).put("applog", abstractC807600VmA);
            }
        }
        c807620VmC.LIZIZ.set(true);
        if (c807620VmC.LIZIZ.get()) {
            synchronized (c807620VmC.LJ) {
                try {
                    linkedList = new LinkedList(c807620VmC.LJ);
                    ((LinkedList) c807620VmC.LJ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            while (!linkedList.isEmpty()) {
                c807620VmC.LIZIZ((StatisticLog) linkedList.poll());
            }
        }
        C827030WcP.LIZ = true;
        C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS92S0000000_13(45));
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new C09JN<Boolean>() { // from class: X.0Vj3
            /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Boolean r7) {
                /*
                    r6 = this;
                    java.lang.String r5 = "StatisticLoggerFixer@a785.onInited$1"
                    X.C1C7U.LIZ(r5)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r0 = r7.booleanValue()
                    if (r0 == 0) goto L43
                    boolean r0 = com.ss.android.common.applog.AppLog.getSwitchToBdtracker()
                    if (r0 == 0) goto L4a
                    boolean r0 = X.InterfaceC307110C2b.LIZ
                    if (r0 == 0) goto L4a
                    int r1 = X.C307120C2c.LIZ
                    r0 = -1
                    if (r1 != r0) goto L2b
                    X.1Bky r0 = X.C2213981Bky.LIZIZ
                    android.content.Context r0 = r0.getApplicationContext()
                    X.0VgP r0 = X.C804020VgO.LIZ(r0)
                    if (r0 != 0) goto L47
                    r0 = 0
                L29:
                    X.C307120C2c.LIZ = r0
                L2b:
                    int r1 = X.C307120C2c.LIZ
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 > r0) goto L4a
                    long r3 = java.lang.System.currentTimeMillis()
                    long r0 = X.C0VX9.LIZJ()
                    long r3 = r3 - r0
                    r1 = 30000(0x7530, double:1.4822E-319)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 < 0) goto L4a
                    com.bytedance.applog.AppLog.flushAsync()
                L43:
                    X.C1C7U.LIZIZ(r5)
                    return
                L47:
                    int r0 = X.C804030VgP.LIZ
                    goto L29
                L4a:
                    X.01GW r1 = X.C805690Vj5.LIZIZ
                    java.lang.Object r0 = r1.getValue()
                    com.ss.android.ugc.aweme.experiment.AppLogNetworkOptExperimentModel r0 = (com.ss.android.ugc.aweme.experiment.AppLogNetworkOptExperimentModel) r0
                    boolean r0 = r0.isOpen
                    if (r0 == 0) goto L71
                    X.0Vj4 r0 = X.C805680Vj4.LIZ
                    r0.getClass()
                    com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = X.C805680Vj4.LIZIZ
                    Y.ARunnableS92S0000000_13 r2 = new Y.ARunnableS92S0000000_13
                    r0 = 46
                    r2.<init>(r0)
                    java.lang.Object r0 = r1.getValue()
                    com.ss.android.ugc.aweme.experiment.AppLogNetworkOptExperimentModel r0 = (com.ss.android.ugc.aweme.experiment.AppLogNetworkOptExperimentModel) r0
                    int r0 = r0.delayMs
                    long r0 = (long) r0
                    X.C786410Ut5.LJLIIL(r0, r3, r2)
                    goto L43
                L71:
                    com.ss.android.common.applog.AppLog.flush()
                    goto L43
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C805670Vj3.accept(java.lang.Object):void");
            }
        });
        int iLIZ = C827010WcN.LIZ();
        if (iLIZ == 2 || iLIZ == 3) {
            ReentrantLock reentrantLock = (ReentrantLock) C827010WcN.LIZIZ;
            reentrantLock.lock();
            try {
                C827010WcN.LIZ = true;
                C827010WcN.LIZJ.signalAll();
                reentrantLock.unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                ((ReentrantLock) C827010WcN.LIZIZ).unlock();
                throw th2;
            }
        }
        if (AppLog.getSwitchToBdtracker()) {
            com.bytedance.applog.AppLog.setBgSessionTaskEnabled(false);
        }
        C2213981Bky c2213981Bky2 = C2213981Bky.LIZIZ;
        if (c2213981Bky2.isOffline() || c2213981Bky2.isRegressionTest() || Intrinsics.LJFF(c2213981Bky2.getChannel(), "live_inhouse")) {
            C2211941Bhg c2211941Bhg = C2211941Bhg.LIZ;
            c2211941Bhg.LJFF(c2213981Bky2.getApplicationContext());
            if (((Boolean) C0B4R.LIZ.getValue()).booleanValue()) {
                c2211941Bhg.LIZIZ();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public LazyLoadLegoTask(Application application, Runnable runnable) {
        this.LL = application;
        this.LLILLJJLI = runnable;
    }
}
