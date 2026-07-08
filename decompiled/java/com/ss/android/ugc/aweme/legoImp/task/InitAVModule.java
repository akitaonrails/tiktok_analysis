package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1150504el;
import X.C1848707Lx;
import X.C1BWL;
import X.C569390MUv;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC2273951DzV;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC569380MUu;
import X.InterfaceC799780VYy;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class InitAVModule implements C0CCZ, InterfaceC799780VYy {
    public static InitAVModule LL;

    @Override // X.InterfaceC799780VYy
    public final /* synthetic */ long LIZ() {
        return 0L;
    }

    @Override // X.InterfaceC799780VYy
    public final void LJFF() {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAVModule";
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
        return 17;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static InitAVModule LJIIIIZZ() {
        if (LL == null) {
            LL = new InitAVModule();
        }
        return LL;
    }

    public final void LJIIIZ() {
        IAVInitializer iAVInitializer = (IAVInitializer) PluggableExtentionKt.pluggableSpi(IAVInitializer.class);
        if (iAVInitializer != null) {
            iAVInitializer.initMonitor(C1BWL.LIZ());
        }
    }

    @Override // X.InterfaceC799780VYy
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799780VYy
    public final void LJ(Long l) {
        l.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.139s] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1150504el.LIZ().LIZLLL("method_av_module_init_duration", false);
        IAVInitializer iAVInitializer = (IAVInitializer) PluggableExtentionKt.pluggableSpi(IAVInitializer.class);
        if (iAVInitializer != null) {
            iAVInitializer.initialize(C1BWL.LIZ());
        }
        if (C1848707Lx.LIZ()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                LJIIIZ();
            } else {
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS129S0100000_29(this, 56));
            }
        }
        C569390MUv.LIZIZ = false;
        EnumC2273951DzV enumC2273951DzV = EnumC2273951DzV.MAIN_BUSINESS;
        final ?? r1 = new InterfaceC569380MUu() { // from class: X.139s
            @Override // X.InterfaceC569380MUu
            public final String LIZ(String str, EnumC569430MUz enumC569430MUz, EnumC569430MUz enumC569430MUz2) {
                return str;
            }
        };
        ?? r12 = r1;
        if (C569390MUv.LIZIZ) {
            r12 = new InterfaceC569380MUu(r1) { // from class: X.139r
                public final InterfaceC569380MUu LIZ;

                {
                    this.LIZ = r1;
                }

                @Override // X.InterfaceC569380MUu
                public final String LIZ(String str, EnumC569430MUz enumC569430MUz, EnumC569430MUz enumC569430MUz2) {
                    if (str != null && str.length() > 5000) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is ");
                        sbLIZ.append(str.length());
                        sbLIZ.append("!");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return this.LIZ.LIZ(str, enumC569430MUz, enumC569430MUz2);
                }
            };
        }
        ((ConcurrentHashMap) C569390MUv.LIZ).put(enumC2273951DzV, r12);
        C1150504el.LIZ().LJI("method_av_module_init_duration", false);
    }
}
