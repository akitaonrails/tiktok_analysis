package com.ss.android.ugc.aweme.boot;

import X.C0CCZ;
import X.C0CN5;
import X.C0DNA;
import X.C0VU1;
import X.C0VZ0;
import X.C1440005kM;
import X.C280480Az0;
import X.C287030BMv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class RetryUnsuccessfulPublishTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RetryUnsuccessfulPublishTask";
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
        return 3;
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
        if (((Number) C287030BMv.LIZ.getValue()).intValue() == 1) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C280480Az0.LIZ.getValue()).longValue()), new Runnable() { // from class: X.0DN9
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RetryUnsuccessfulPublishTask@4b1f.run$1");
                    try {
                        C1440005kM.LIZ(new C0DNA());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RetryUnsuccessfulPublishTask@4b1f.run$1");
                }
            });
        } else {
            C1440005kM.LIZ(new C0DNA());
        }
    }
}
