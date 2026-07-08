package com.ss.android.ugc.aweme.abretrieve;

import X.C0CCZ;
import X.C0VZ0;
import X.C201955140j;
import X.C596970NbD;
import X.EnumC1733330vCt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC596980NbE;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AbRetrieveTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AbRetrieveTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C201955140j.LJFF("abretrieve", "lego task run start");
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.RETRIEVE_DEVICE_AB_ID, new InterfaceC596980NbE() { // from class: X.05s3
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1487505s1(null), 3);
            }
        });
    }
}
