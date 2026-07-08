package com.ss.android.ugc.aweme.tako;

import X.C058F;
import X.C058I;
import X.C0CCZ;
import X.C0PEM;
import X.C0VU1;
import X.C0VZ0;
import X.C14TF;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoBackgroundInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TakoBackgroundInitTask";
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
    public final int level() {
        return ((C058I.LIZ() == 3 || C058I.LIZ() == 4) ? 0 : 1) ^ 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return (C058I.LIZ() == 1 || C058I.LIZ() == 3) ? EnumC799870VZh.IDLE : EnumC799870VZh.APP_BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C14TF.LIZIZ.LJLJJI()) {
            return;
        }
        SystemClock.elapsedRealtime();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C058F(null), 3);
    }
}
