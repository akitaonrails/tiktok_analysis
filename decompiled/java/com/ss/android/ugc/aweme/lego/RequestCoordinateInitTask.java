package com.ss.android.ugc.aweme.lego;

import X.C0CCZ;
import X.C0S78;
import X.C0VZ0;
import X.C1486510omn;
import X.C807400Vlq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestCoordinateInitTask implements C0CCZ {
    public final ScheduledExecutorService LL = C807400Vlq.LJ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RequestCoordinateInitTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return C1486510omn.LIZ() || C1486510omn.LIZIZ();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0S78.LIZJ(new AwS567S0100000_23(this, 99), ((Boolean) C1486510omn.LIZJ.getValue()).booleanValue());
    }
}
