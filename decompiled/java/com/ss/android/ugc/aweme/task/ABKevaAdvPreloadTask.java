package com.ss.android.ugc.aweme.task;

import X.C08R2;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1AF0;
import X.C20684815ws;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ABKevaAdvPreloadTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABKevaAdvPreloadTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (C08R2.LIZIZ() != 0) {
                JSONObject jSONObjectPut = new JSONObject().put("so_wall_duration", C08R2.LJIIIIZZ).put("so_cpu_duration", C08R2.LJII).put("so_coordinate", C08R2.LJIIIZ).put("so_preload_time_up", C08R2.LJI);
                if (C08R2.LIZLLL != null || C08R2.LJ != null || C08R2.LJFF != null) {
                    jSONObjectPut.put("has_crashed", true);
                    Throwable th = C08R2.LIZLLL;
                    if (th != null) {
                        C1AF0.LJFF(th, "ABKevaAdvPreloadTask");
                        jSONObjectPut.put("keva_crash", C08R2.LIZLLL);
                        if (th.getStackTrace().length != 0) {
                            jSONObjectPut.put("keva_stack", th.getStackTrace()[0]);
                        }
                        C08R2.LIZLLL = null;
                    }
                    Throwable th2 = C08R2.LJ;
                    if (th2 != null) {
                        C1AF0.LJFF(th2, "ABKevaAdvPreloadTask");
                        jSONObjectPut.put("so_crash", C08R2.LJ);
                        if (th2.getStackTrace().length != 0) {
                            jSONObjectPut.put("so_stack", th2.getStackTrace()[0]);
                        }
                        C08R2.LJ = null;
                    }
                    Throwable th3 = C08R2.LJFF;
                    if (th3 != null) {
                        C1AF0.LJFF(th3, "ABKevaAdvPreloadTask");
                        jSONObjectPut.put("more_so_crash", C08R2.LJFF);
                        if (th3.getStackTrace().length != 0) {
                            jSONObjectPut.put("more_so_stack", th3.getStackTrace()[0]);
                        }
                        C08R2.LJFF = null;
                    }
                }
                C20684815ws.LJIJ("ab_keva_preload_crashed", jSONObjectPut);
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C1AF0.LJFF(th4, "ABKevaAdvPreloadTask");
        }
    }
}
