package com.ss.android.ugc.aweme.memory.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1BWL;
import X.C2142608aO;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryStatTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MemoryStatTask";
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
    public final /* synthetic */ int priority() {
        return 1;
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

    public MemoryStatTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (((Boolean) C2142608aO.LIZ.getValue()).booleanValue()) {
                C786410Ut5.u4(C1BWL.LIZ(), new ComponentCallbacks2() { // from class: X.08aN
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration) {
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        boolean z = C2142408aM.LIZ;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("level", -100);
                            C793770VBv.LJII("memory_ontrim_stat", jSONObject, null, null);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i) {
                        if (i == 20) {
                            return;
                        }
                        boolean z = C2142408aM.LIZ;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("level", i);
                            C793770VBv.LJII("memory_ontrim_stat", jSONObject, null, null);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
