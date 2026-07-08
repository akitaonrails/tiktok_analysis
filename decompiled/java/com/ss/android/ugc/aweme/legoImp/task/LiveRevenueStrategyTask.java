package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1525630pnt;
import X.C1602200rnO;
import X.C1BC2;
import X.C1BCA;
import X.EnumC1733330vCt;
import X.EnumC312610CNf;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1006670cIr;
import X.InterfaceC20234614Fk;
import X.InterfaceC20315114eL;
import X.InterfaceC596980NbE;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sync.IByteSyncApi;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20234614Fk
public final class LiveRevenueStrategyTask implements C0CCZ, InterfaceC596980NbE, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LiveRevenueStrategyTask";
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        return 0;
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
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC596980NbE
    public final void LJ(C1525630pnt c1525630pnt) {
        ILiveOuterService iLiveOuterService;
        InterfaceC20315114eL interfaceC20315114eLW4;
        if (c1525630pnt.LIZ != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20315114eLW4 = iLiveOuterService.W4()) != null) {
            interfaceC20315114eLW4.LIZJ(c1525630pnt.LIZ);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        final InterfaceC20315114eL interfaceC20315114eLW4;
        IByteSyncApi iByteSyncApi = (IByteSyncApi) PluggableExtentionKt.pluggableSpi$default(IByteSyncApi.class, false, false, false, 14, null);
        if (iByteSyncApi != null) {
            iByteSyncApi.LIZ(EnumC1733330vCt.LIVE_PAID_USER_GROWTH, this);
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20315114eLW4 = iLiveOuterService.W4()) != null) {
            interfaceC20315114eLW4.onBootFinish();
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.1BDG
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                    interfaceC20315114eLW4.LIZIZ(c1602200rnO, c1602200rnO2);
                }
            });
            C1BCA.LJIILL(new C1BC2() { // from class: X.1BDH
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1BC7 c1bc7, C1BC7 c1bc72) {
                    boolean z;
                    C1BC7 c1bc73 = c1bc72;
                    InterfaceC20315114eL interfaceC20315114eL = interfaceC20315114eLW4;
                    if (!c1bc7.LIZ && c1bc73.LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC20315114eL.LIZLLL(z);
                }
            });
        }
    }
}
