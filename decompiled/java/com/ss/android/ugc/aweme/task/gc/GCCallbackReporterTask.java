package com.ss.android.ugc.aweme.task.gc;

import X.C08U2;
import X.C0CCZ;
import X.C0VZ0;
import X.C2185581AgG;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class GCCallbackReporterTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GCCallbackReporterTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (((Boolean) C2185581AgG.LIZJ.getValue()).booleanValue()) {
            AtomicBoolean atomicBoolean = C08U2.LIZ;
            AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(977);
            if (atomicBoolean.compareAndSet(false, true)) {
                aFwS189S0000000_3.invoke();
            }
        }
    }
}
