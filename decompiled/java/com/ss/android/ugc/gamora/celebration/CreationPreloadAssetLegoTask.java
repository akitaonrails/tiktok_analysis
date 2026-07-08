package com.ss.android.ugc.gamora.celebration;

import X.C0CCZ;
import X.C0VZ0;
import X.C1420280n3y;
import X.C201955140j;
import X.C554890LpX;
import X.EnumC1420320n42;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CreationPreloadAssetLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CreationPreloadAssetLegoTask";
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
        C1420280n3y.LIZ.getClass();
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CelebrationAsset, onColdStart");
        C1420280n3y.LIZ(EnumC1420320n42.COLD_START);
    }
}
