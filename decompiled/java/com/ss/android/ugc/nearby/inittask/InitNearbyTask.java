package com.ss.android.ugc.nearby.inittask;

import X.C0B94;
import X.C0CCZ;
import X.C0NRX;
import X.C0NRY;
import X.C0PEM;
import X.C0VZ0;
import X.C1200000hKg;
import X.C1203730hQh;
import X.C1203930hR1;
import X.C1205170hT1;
import X.C2097608Jq;
import X.C2177408g0;
import X.C2296808zG;
import X.C23250099c;
import X.C266870Ad3;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1199990hKf;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyDoubleColumnCacheOptExperiment;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class InitNearbyTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitNearbyTask";
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

    public static void LJ() {
        Keva keva = C0NRY.LIZ;
        boolean z = keva.getBoolean("do_preload", false);
        boolean z2 = keva.getBoolean("enter_nearby", false);
        InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(C2177408g0.LIZ("nearby_experience_track", "nearby_preload", "nearby_preload_optimization"));
        interfaceC1199990hKfLIZIZ.LJIJJ(C2097608Jq.LJIIIIZZ(new Pair("do_preload", String.valueOf(z)), new Pair("enter_nearby", String.valueOf(z2))));
        interfaceC1199990hKfLIZIZ.start();
        keva.storeBoolean("enter_nearby", false);
        keva.storeBoolean("do_preload", false);
    }

    public final void LJFF() {
        C1205170hT1.LIZ.getClass();
        if (C1205170hT1.LIZIZ() && ((Boolean) C0B94.LIZ.getValue()).booleanValue()) {
            C1203730hQh.LIZ.getClass();
            RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
            String str = roamingLocationInfoLIZ != null ? roamingLocationInfoLIZ.manualRegion : null;
            boolean zBooleanValue = ((Boolean) C266870Ad3.LIZ.getValue()).booleanValue();
            if (!NearbyDoubleColumnCacheOptExperiment.LIZ()) {
                C1203930hR1.LIZ.getClass();
                if (C1203930hR1.LJIILIIL(str)) {
                    return;
                }
            } else if (zBooleanValue) {
                C1203930hR1.LIZ.getClass();
                if (C1203930hR1.LJIILIIL(str) && !C1203930hR1.LJIIIZ()) {
                    return;
                }
            } else {
                C1203930hR1.LIZ.getClass();
                if (C1203930hR1.LJIILIIL(str) && C1203930hR1.LJIIL()) {
                    return;
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NRX(this, roamingLocationInfoLIZ, str, null), 3);
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(this, 127));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:42:0x00b3, B:44:0x00bc, B:45:0x00c0), top: B:87:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.nearby.roaming.RoamingLocationInfo r11, java.lang.String r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.inittask.InitNearbyTask.LIZ(com.ss.android.ugc.nearby.roaming.RoamingLocationInfo, java.lang.String, X.05Vn):java.lang.Object");
    }
}
