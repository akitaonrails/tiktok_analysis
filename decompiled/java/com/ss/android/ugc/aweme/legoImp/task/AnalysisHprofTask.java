package com.ss.android.ugc.aweme.legoImp.task;

import X.C08M1;
import X.C08M4;
import X.C0C64;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C15O7;
import X.C1BWL;
import X.C20525082h;
import X.C2103608Ly;
import X.C2366909Pf;
import X.C2404209bU;
import X.C2406109bn;
import X.C2406809bu;
import X.C2407009bw;
import X.C2407209by;
import X.C2407309bz;
import X.C2407909c5;
import X.C2421209eE;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2223408nQ;
import X.InterfaceC2407509c1;
import X.InterfaceC2407609c2;
import X.InterfaceC799590VYf;
import Y.ACallableS411S0100000_3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AnalysisHprofTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public String key() {
        return "AnalysisHprofTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL;
    }

    public AnalysisHprofTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.08M0] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        C2407009bw.LIZ();
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                C844470XAv.LIZ.getClass();
                jSONObject.put("aid", C844470XAv.LJIIJ);
                jSONObject.put("channel", C844470XAv.LJIILL);
                jSONObject.put("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
                jSONObject.put("app_version", C844470XAv.LIZJ());
                jSONObject.put("update_version_code", String.valueOf(C844470XAv.LIZLLL()));
                jSONObject.put("current_update_version_code", String.valueOf(C844470XAv.LIZLLL()));
                jSONObject.put("process_name", C844470XAv.LIZ().getPackageName());
                jSONObject.put("version_code", C844470XAv.LJ());
                jSONObject.put("region", "");
                jSONObject.put("oversea", true);
                jSONObject.put("release_build", C2404209bU.LIZ());
                jSONObject.put("version_name", C844470XAv.LJFF());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C08M4.LIZ = jSONObject;
            boolean zBooleanValue = ((Boolean) C2407309bz.LIZ.getValue()).booleanValue();
            boolean zLIZ = C2366909Pf.LIZ();
            if (zBooleanValue || zLIZ) {
                System.out.println("LocalLeakWatcher enable local dump enableChaosHprof:" + zBooleanValue + " enableChaosLynx:" + zLIZ);
                Application applicationLIZ = C1BWL.LIZ();
                Activity activityLIZ = C2421209eE.LIZ();
                if (zLIZ && !zBooleanValue) {
                    z = true;
                } else {
                    z = false;
                }
                C2103608Ly.LIZ(applicationLIZ, activityLIZ, z, new C08M1() { // from class: X.08M0
                });
            }
            C20525082h.LIZ = zLIZ;
            if (zBooleanValue) {
                C2407909c5.LIZ = true;
                C2407909c5.LIZJ = new InterfaceC2407609c2() { // from class: X.08M2
                    public long LIZ;

                    @Override // X.InterfaceC2407609c2
                    public final boolean h1() throws InterruptedException {
                        try {
                            if (TextUtils.isEmpty(C08M4.LIZ.optString("device_id"))) {
                                System.out.println((Object) "LocalLeakWatcher device_id is empty");
                                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                                if (!TextUtils.isEmpty(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("LocalLeakWatcher compensation deviceId:");
                                    sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                                    C08M4.LIZ.put("device_id", strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        boolean z2 = false;
                        if (this.LIZ > 0 && System.currentTimeMillis() - this.LIZ <= 240000) {
                            System.out.println((Object) "LocalLeakWatcher too fast, skip");
                            return false;
                        }
                        double dLIZJ = C2367709Pn.LIZJ();
                        System.out.println((Object) ("LocalLeakWatcher local dump usageRate:" + dLIZJ));
                        if (dLIZJ >= 0.9d) {
                            this.LIZ = System.currentTimeMillis();
                            return true;
                        }
                        if (!C2103608Ly.LIZLLL) {
                            System.out.println((Object) "LocalLeakWatcher manual execute gc start");
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            C2095108Ir.LIZLLL();
                            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
                            System.out.println((Object) "LocalLeakWatcher manual execute gc end");
                            z2 = C2103608Ly.LIZLLL;
                        } else if (C2103608Ly.LIZIZ < C2103608Ly.LIZJ) {
                            z2 = true;
                        }
                        System.out.println((Object) ("LocalLeakWatcher local dump isLeak:" + z2));
                        if (z2) {
                            C2103608Ly.LIZIZ = C2103608Ly.LIZJ;
                            this.LIZ = System.currentTimeMillis();
                        }
                        return z2;
                    }
                };
                C2406809bu.LIZLLL = LSPassThroughRecordSizeConfig.DEFAULT;
                C2406809bu.LJ = 5000;
                System.out.println("LocalLeakWatcher config:" + C786410Ut5.J3(C08M4.LIZ));
            }
            C2406809bu.LIZJ = ((Boolean) C2407209by.LIZ.getValue()).booleanValue();
            C2406809bu.LIZ = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "dump_interval_threshold", true);
            C2406809bu.LIZIZ = new InterfaceC2407509c1() { // from class: X.09bv
            };
            C2406109bn.LIZ = new InterfaceC2223408nQ() { // from class: X.09bt
                @Override // X.InterfaceC2223408nQ
                public final void LIZ(int i, long j, boolean z2) {
                    if (!z2) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("event_id", i);
                            JSONObject jSONObject3 = new JSONObject();
                            if (i == 2) {
                                jSONObject3.put("dump_duration", j);
                            }
                            C793770VBv.LJII("hprof_event", jSONObject2, jSONObject3, null);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            };
            C15O7.LIZJ(new ACallableS411S0100000_3(context, 25));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
