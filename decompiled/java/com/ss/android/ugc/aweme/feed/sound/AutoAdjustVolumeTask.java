package com.ss.android.ugc.aweme.feed.sound;

import X.C07OX;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1387610mDH;
import X.C1514430pVp;
import X.C15O7;
import X.C1602860roS;
import X.C1848707Lx;
import X.C1E95;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C582170MsR;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2385309Wh;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AutoAdjustVolumeTask implements C0CCZ, InterfaceC799590VYf {
    public static final Keva LL;
    public static float LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AutoAdjustVolumeTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    static {
        Keva repo = Keva.getRepo("cold_recover_volume");
        repo.dump();
        LL = repo;
        LLILLJJLI = Float.MIN_VALUE;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            if (C1848707Lx.LIZ()) {
                return EnumC799870VZh.BACKGROUND;
            }
        } else if (((Boolean) C07OX.LIZJ.getValue()).booleanValue()) {
            return EnumC799870VZh.BACKGROUND;
        }
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1387610mDH.LIZ.getClass();
        final double dLJIIIIZZ = C2179771ASp.LJIIIIZZ();
        C1387610mDH.LIZLLL = dLJIIIIZZ;
        C1E95 c1e95 = C1E95.LIZIZ;
        if (!c1e95.LJIIZILJ() && c1e95.LJJIIJZLJL()) {
            if (((Boolean) C07OX.LIZJ.getValue()).booleanValue()) {
                C1387610mDH.LIZ(dLJIIIIZZ);
            } else {
                C15O7.LJIIIIZZ(500L).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0O4u
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("AutoAdjustVolumeTask@7f5e.autoAdjustVolume$1");
                        C1387610mDH c1387610mDH = C1387610mDH.LIZ;
                        double d = dLJIIIIZZ;
                        c1387610mDH.getClass();
                        C1387610mDH.LIZ(d);
                        C1C7U.LIZIZ("AutoAdjustVolumeTask@7f5e.autoAdjustVolume$1");
                        return null;
                    }
                });
            }
        }
        if (C582170MsR.LIZ) {
            String strLIZJ = C2179771ASp.LIZJ();
            float fLJIIIIZZ = (float) C2179771ASp.LJIIIIZZ();
            Keva keva = LL;
            float f = keva.getFloat(strLIZJ, Float.MIN_VALUE);
            if (!Intrinsics.LJFF(strLIZJ, "none")) {
                LLILLJJLI = f;
            }
            if (f == Float.MIN_VALUE && !Intrinsics.LJFF(strLIZJ, "none")) {
                keva.storeFloat(strLIZJ, fLJIIIIZZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoAdjustVolumeTask: deviceName=");
            sbLIZ.append(strLIZJ);
            sbLIZ.append(", recoverVolume=");
            sbLIZ.append(f);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
