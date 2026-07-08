package com.ss.android.ugc.aweme.alog;

import X.C01GW;
import X.C0A7G;
import X.C0A7H;
import X.C0A7I;
import X.C0A7J;
import X.C0A7K;
import X.C0C7D;
import X.C0C7F;
import X.C0C7G;
import X.C0CCZ;
import X.C0VT7;
import X.C0VTA;
import X.C0VZ0;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C275830ArV;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.memrelief.optimize.common.ALogHook;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ALogNativeOptTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ALogNativeOptTask";
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
        return C275830ArV.LIZ(2) ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iIntValue;
        boolean z = true;
        if (!C275830ArV.LIZ(1)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) C0A7G.LIZ.getValue()).booleanValue();
        if (!zBooleanValue) {
            C01GW c01gw = C0A7I.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0 && (iIntValue = ((Number) c01gw.getValue()).intValue()) > 0) {
                zBooleanValue = C2188561Al4.LJIIIZ(iIntValue, context);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("run memrelief mode:");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" lowDevice:");
                sbLIZ.append(zBooleanValue);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        boolean zLIZ = C275830ArV.LIZ(8);
        if (zBooleanValue || !zLIZ) {
            z = zBooleanValue;
        }
        ALogHook aLogHook = ALogHook.LIZ;
        boolean zBooleanValue2 = ((Boolean) C0A7H.LIZ.getValue()).booleanValue();
        aLogHook.getClass();
        ALogHook.LIZ(zBooleanValue2, zLIZ);
        C0C7D.LIZ = z;
        ALogHook.update(z);
        if (((Boolean) C0A7J.LIZ.getValue()).booleanValue()) {
            C0VT7.LIZLLL(new C0VTA() { // from class: X.0C7C
                @Override // X.C0VTA
                public final void LIZ(int i) {
                    boolean z2;
                    boolean z3 = true;
                    if (i != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!C0C7D.LIZ) {
                        C0C7D.LIZIZ = z2;
                        if (!z2 && !C0C7D.LIZLLL) {
                            z3 = false;
                        }
                        if (z3 != C0C7D.LJ) {
                            C0C7D.LJ = z3;
                            ALogHook.LIZ.getClass();
                            ALogHook.update(z3);
                        }
                    }
                }
            });
        }
        if (((Boolean) C0A7K.LIZ.getValue()).booleanValue()) {
            C0C7F.LIZ = new C0C7G() { // from class: X.0C7B
                @Override // X.C0C7G
                public final void LIZ(boolean z2) {
                    boolean z3;
                    if (!C0C7D.LIZ) {
                        if (z2) {
                            C01GW c01gw2 = C0A7L.LIZ;
                            if (((Number) c01gw2.getValue()).longValue() > 0) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - C0C7D.LIZJ > ((Number) c01gw2.getValue()).longValue()) {
                                    C0C7D.LIZJ = jCurrentTimeMillis;
                                } else {
                                    return;
                                }
                            }
                        }
                        C0C7D.LIZLLL = z2;
                        if (!C0C7D.LIZIZ && !C0C7D.LIZLLL) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3 != C0C7D.LJ) {
                            C0C7D.LJ = z3;
                            ALogHook.LIZ.getClass();
                            ALogHook.update(z3);
                        }
                    }
                }
            };
        }
    }
}
