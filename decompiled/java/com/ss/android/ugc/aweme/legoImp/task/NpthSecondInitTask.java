package com.ss.android.ugc.aweme.legoImp.task;

import X.C089S;
import X.C08OL;
import X.C0BFI;
import X.C0C64;
import X.C0CCZ;
import X.C0CN5;
import X.C0VZ0;
import X.C0X35;
import X.C1602860roS;
import X.C1DS1;
import X.C2187451AjH;
import X.C285090BFj;
import X.C804020VgO;
import X.C804030VgP;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC308350C6v;
import X.RunnableC806650Vkd;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class NpthSecondInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public String key() {
        return "NpthSecondInitTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ((Boolean) C285090BFj.LJJIII.getValue()).booleanValue() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0X35.LIZ("npth_task_second", false);
        C0X35.LIZ("npth_task_second_set_tag_cache", false);
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "set_tag_cache_service", true, false)) {
            C0X35.LIZ("npth_task_second_set_tag_cache_inner", false);
            Npth.setTagCacheService(new C08OL(context));
            C0X35.LJIIJJI("npth_task_second_set_tag_cache_inner", false);
        }
        C0X35.LJIIJJI("npth_task_second_set_tag_cache", false);
        int i = C2187451AjH.LIZ;
        Npth.addTag("has_tostring", "false");
        C1602860roS.LIZ.getClass();
        Npth.addTag("is_new_user", String.valueOf(C1602860roS.LJ));
        if (C804020VgO.LIZ(context) != null) {
            int i2 = C804030VgP.LIZ;
            int iCeil = (int) Math.ceil(((double) i2) / 1024.0d);
            Npth.addTag("ram_mb", Integer.toString(i2));
            Npth.addTag("ram_gb", Integer.toString(iCeil));
        } else {
            Npth.addTag("ram_mb", Integer.toString(-1));
            Npth.addTag("ram_gb", Integer.toString(-1));
        }
        C0X35.LIZ("npth_task_second_crash_report", false);
        C0X35.LJIIJJI("npth_task_second_crash_report", false);
        if (!C089S.LIZ) {
            C089S.LIZIZ = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.089R
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    if (thread != null && th != null) {
                        try {
                            if (thread.getName().equals("FinalizerWatchdogDaemon") && (th instanceof TimeoutException)) {
                                return;
                            }
                            if (thread.getName().equals("sliver_sampling") && (th instanceof ArrayIndexOutOfBoundsException)) {
                                return;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            Thread threadU3 = C786410Ut5.u3();
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C089S.LIZIZ;
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(threadU3, th2);
                                return;
                            }
                            return;
                        }
                    }
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = C089S.LIZIZ;
                    if (uncaughtExceptionHandler2 != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th);
                    }
                }
            });
            C089S.LIZ = true;
        }
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "npth_get_vids", true, false)) {
            Npth.setCrashUploadCallback(new InterfaceC308350C6v() { // from class: X.0C6U
                @Override // X.InterfaceC308350C6v
                public final void LIZ(CrashType crashType, JSONObject jSONObject) {
                    try {
                        final C307820C4u c307820C4u = C307820C4u.LIZJ;
                        c307820C4u.getClass();
                        List list = (List) C0C6R.LJIIIIZZ("ConfigMetaDataManager", "", new C0C6T() { // from class: X.0C4x
                            @Override // X.C0C6T
                            public final Object call() {
                                C307820C4u c307820C4u2 = c307820C4u;
                                c307820C4u2.getClass();
                                Map<String, ConfigItem> map = C2502809rO.LIZ;
                                HashSet hashSet = new HashSet();
                                Iterator it2 = ((HashMap) map).entrySet().iterator();
                                while (it2.hasNext()) {
                                    hashSet.add(Integer.valueOf(c307820C4u2.LIZIZ((String) ((Map.Entry) it2.next()).getKey())));
                                }
                                return new ArrayList(hashSet);
                            }
                        });
                        JSONArray jSONArray = new JSONArray();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            jSONArray.put((Integer) it2.next());
                        }
                        jSONObject.put("vids", jSONArray);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
        }
        if (C1DS1.LIZJ) {
            Npth.setCrashUploadCallback(new InterfaceC308350C6v() { // from class: X.0VgM
                @Override // X.InterfaceC308350C6v
                public final void LIZ(CrashType crashType, JSONObject jSONObject) {
                    try {
                        EnumC804170Vgd enumC804170Vgd = EnumC804170Vgd.STABILITY_CRASH;
                        int i3 = C803990VgL.LIZ[crashType.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                enumC804170Vgd = EnumC804170Vgd.STABILITY_OOM;
                            }
                        } else {
                            enumC804170Vgd = EnumC804170Vgd.STABILITY_ANR;
                        }
                        if (jSONObject.optString("data").contains("java.lang.OutOfMemoryError")) {
                            enumC804170Vgd = EnumC804170Vgd.STABILITY_OOM;
                        }
                        C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.STABILITY, enumC804170Vgd, jSONObject.optString("session_id"), jSONObject.optLong("crash_time") - jSONObject.optLong("app_start_time"), 16));
                        C0QO8.LIZ.getClass();
                        C0QO8.LIZIZ(crashType, jSONObject);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
        }
        long j = C0BFI.LIZ;
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS113S0100000_13(this, 110));
        } else {
            try {
                C823050WQl.LIZLLL().execute(new RunnableC806650Vkd());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C0X35.LJIIJJI("npth_task_second", false);
    }
}
