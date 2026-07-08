package com.ss.android.ugc.aweme.reliability.emergencychannel;

import X.C08NF;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2154208cG;
import X.C2155708cV;
import X.C23250099c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC596980NbE;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigDomain;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class EmergencyChannelByteSyncRegistrationTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "EmergencyChannelByteSyncRegistrationTask";
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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.08NI] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Map<EmergencyConfigDomain, C2155708cV> map = C08NF.LIZ;
        C23250099c.LIZLLL(C08NF.LIZIZ, null, null, new C2154208cG(new InterfaceC596980NbE() { // from class: X.08NI
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                C23250099c.LIZLLL(C08NF.LIZIZ, null, null, new C2155008cO(c1525630pnt, c1525630pnt, null), 3);
            }
        }, null), 3);
    }
}
