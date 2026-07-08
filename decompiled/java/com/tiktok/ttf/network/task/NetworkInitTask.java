package com.tiktok.ttf.network.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1495130p0h;
import X.C1496450p2p;
import X.C1499670p81;
import X.C15O7;
import X.C19489211Ms;
import X.C2162308dZ;
import X.C2241008qG;
import X.C793770VBv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1495070p0b;
import Y.ACallableS237S0200000_3;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttf.network.task.NetworkInitTask;
import com.tiktok.ttf.network.zstd.ZstdDownToTTNetInitTask;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NetworkInitTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C1496450p2p.LIZIZ.LJIIIZ() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (C19489211Ms.LIZ == null) {
                C19489211Ms.LIZ = new AfS172S0100000_3(this, 92);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C15O7.LIZJ(new ACallableS237S0200000_3(this, th, 10));
        }
        C1499670p81.LIZIZ.LJFF(new InterfaceC1495070p0b() { // from class: X.0p2m
            @Override // X.InterfaceC1495070p0b
            public final void LIZJ() {
                C1496450p2p c1496450p2p = C1496450p2p.LIZIZ;
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_INIT_TO_INIT_TTNET, false);
                c1496450p2p.LIZJ();
            }

            @Override // X.InterfaceC1495070p0b
            public final void LIZ(C1495130p0h c1495130p0h) {
                this.LIZ.getClass();
                NetworkInitTask.LIZ(true, c1495130p0h, null);
                C1496450p2p c1496450p2p = C1496450p2p.LIZIZ;
                c1496450p2p.LJIIL(c1495130p0h);
                this.LIZ.getClass();
                C1493400oxu.LJIIJ(c1495130p0h.LIZ).LJIILLIIL(c1495130p0h.LJIIJ.LIZ.LJIIIZ.invoke());
                if (!C2104008Mc.LIZIZ(c1495130p0h.LIZ)) {
                    C1494230ozF.LIZIZ = c1495130p0h.LJIIIIZZ;
                    C1494570ozn.LJLL = C1493800oyY.LIZ;
                }
                c1496450p2p.LIZ(c1495130p0h);
            }

            @Override // X.InterfaceC1495070p0b
            public final void LIZIZ(boolean z) {
                if (z) {
                    C1496400p2k.LIZ.getClass();
                    C1496400p2k.LIZIZ();
                } else {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new ZstdDownToTTNetInitTask());
                    c799890VZj.LIZIZ();
                }
            }

            @Override // X.InterfaceC1495070p0b
            public final void LIZLLL(C1495130p0h c1495130p0h) {
                C1496450p2p c1496450p2p = C1496450p2p.LIZIZ;
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_INIT_TTNET_DURATION, true);
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_BOOT_TO_INIT_TTNET_END, true);
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_INIT_TTNET_END_TO_NETWORK, false);
                EnumC1496430p2n enumC1496430p2n = EnumC1496430p2n.NETWORK_INIT_SEC_DURATION;
                c1496450p2p.LJIIJ(enumC1496430p2n, false);
                c1496450p2p.LJIIIIZZ(c1495130p0h);
                c1496450p2p.LJIIJ(enumC1496430p2n, true);
                c1496450p2p.LIZLLL(c1495130p0h);
            }

            @Override // X.InterfaceC1495070p0b
            public final void LJI(C1495130p0h c1495130p0h) {
                C1496450p2p.LIZIZ.LJI(c1495130p0h);
            }

            @Override // X.InterfaceC1495070p0b
            public final void LJII(C1495130p0h c1495130p0h) {
                C1496450p2p c1496450p2p = C1496450p2p.LIZIZ;
                c1496450p2p.LJII(c1495130p0h);
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_INIT_TO_INIT_TTNET, true);
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_INIT_TTNET_DURATION, false);
                c1496450p2p.LJIIJ(EnumC1496430p2n.NETWORK_BOOT_TO_INIT_TTNET, true);
            }

            @Override // X.InterfaceC1495070p0b
            public final void LJ(C1495130p0h c1495130p0h, Throwable th2) {
                this.LIZ.getClass();
                NetworkInitTask.LIZ(false, c1495130p0h, th2);
                C1496450p2p.LIZIZ.LJ(c1495130p0h, th2);
            }
        }, C1496450p2p.LIZIZ.LIZIZ());
    }

    public static void LIZ(boolean z, C1495130p0h c1495130p0h, Throwable th) {
        JSONObject jSONObjectLJ;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("is_success", Integer.valueOf(z ? 1 : 0));
        c2241008qG.LIZ.put("process_name", C2162308dZ.LIZ(c1495130p0h.LIZ));
        JSONObject jSONObjectLJ2 = c2241008qG.LJ();
        if (th == null) {
            jSONObjectLJ = null;
        } else {
            C2241008qG c2241008qG2 = new C2241008qG();
            c2241008qG2.LIZ.put("error_msg", Log.getStackTraceString(th));
            jSONObjectLJ = c2241008qG2.LJ();
        }
        C793770VBv.LJII("TTNetInitStatus", jSONObjectLJ2, null, jSONObjectLJ);
    }
}
