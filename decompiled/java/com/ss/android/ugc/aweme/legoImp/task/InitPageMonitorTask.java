package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C117F;
import X.C117G;
import X.C2207131BZv;
import X.C2207151BZx;
import X.C2407009bw;
import X.C2548409yk;
import X.C624500OeW;
import X.C818490W8x;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2207161BZy;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class InitPageMonitorTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitPageMonitorTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C2548409yk.LIZ && context != null) {
            C2407009bw.LIZ();
            final C2207131BZv c2207131BZv = new C2207131BZv();
            ((List) C117G.LIZ.getValue()).add(new C117F() { // from class: X.1BZu
                @Override // X.C117F
                public final void LIZ(Activity activity, boolean z) {
                    InterfaceC2207141BZw interfaceC2207141BZw = c2207131BZv.LIZ;
                    if (interfaceC2207141BZw != null) {
                        interfaceC2207141BZw.LIZIZ(activity, z);
                    }
                }
            });
            ((Application) context).registerActivityLifecycleCallbacks(new C624500OeW() { // from class: X.1BZt
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    InterfaceC2207141BZw interfaceC2207141BZw = c2207131BZv.LIZ;
                    if (interfaceC2207141BZw != null) {
                        interfaceC2207141BZw.onActivityDestroyed(activity);
                    }
                }

                @Override // X.C624500OeW, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    InterfaceC2207141BZw interfaceC2207141BZw = c2207131BZv.LIZ;
                    if (interfaceC2207141BZw != null) {
                        interfaceC2207141BZw.LIZ(activity);
                    }
                }
            });
            if (C818490W8x.LIZ()) {
                InterfaceC2207161BZy interfaceC2207161BZy = C2207151BZx.LIZIZ;
                if (interfaceC2207161BZy != null) {
                    interfaceC2207161BZy.LIZ(null);
                }
                c2207131BZv.LIZ = C2207151BZx.LIZ;
                C2207151BZx.LIZIZ = c2207131BZv;
            }
        }
    }
}
