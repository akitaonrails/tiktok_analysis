package com.ss.android.ugc.aweme.litemode;

import X.AnonymousClass0752;
import X.C0CCZ;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0S78;
import X.C0VU1;
import X.C0VW0;
import X.C0VWA;
import X.C0VZ0;
import X.C1150504el;
import X.C1243604tm;
import X.C1833307Fz;
import X.C1905280zgE;
import X.C1905290zgF;
import X.C1905300zgG;
import X.C1BC4;
import X.C1BCA;
import X.C202099145x;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189391AmP;
import X.C312240CLu;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS217S0000000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class LiteModeInitTask implements C0CCZ, InterfaceC799590VYf, C0VWA, C1BC4 {
    public static boolean LLILLJJLI;
    public static final LiteModeInitTask LL = new LiteModeInitTask();
    public static final int LLILLL = 1;

    @Override // X.C0VWA
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LiteModeInitTask";
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

    public static void LJFF() {
        C1905300zgG.LIZ.getClass();
        if (C1905300zgG.LIZJ() || C1905300zgG.LIZLLL() || C1905300zgG.LIZIZ() > 0) {
            return;
        }
        AtomicLong atomicLong = C1905300zgG.LJI;
        if (atomicLong.get() <= 0) {
            atomicLong.set(System.currentTimeMillis());
            C1905300zgG.LIZ().storeLong((String) C1905300zgG.LJII.getValue(), atomicLong.get());
        }
        C1905300zgG.LJ(1, "plan_c_auto", null);
    }

    @Override // X.C0VWA
    public final void LJIIIZ() throws JSONException {
        C0VW0.LJIIL.remove(this);
        LIZ(0);
    }

    public static void LJ() {
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ == null || liteModePushConfigLIZ.enablePreciseExp != 1) {
            LJFF();
        } else if (C1833307Fz.LIZ() == 1) {
            LJFF();
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public static void LIZ(int i) throws JSONException {
        if (!LLILLJJLI) {
            LLILLJJLI = true;
            JSONObject jSONObjectPut = new JSONObject().put("bad_session_reason", i).put("lite_mode_switch", C1905290zgF.LIZIZ() ? 1 : 0);
            C1905300zgG.LIZ.getClass();
            C20684815ws.LJIJ("lite_mode_bad_session_sample", jSONObjectPut.put("lite_mode_state", C1905300zgG.LIZJ() ? 1 : 0));
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Integer numValueOf;
        int i;
        if (((Number) AnonymousClass0752.LIZ.getValue()).intValue() == 1) {
            C0VW0.LJIIL.add(this);
            C1BCA.LJJIII(this);
        }
        if (!C1905290zgF.LIZIZ()) {
            return;
        }
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ != null && liteModePushConfigLIZ.enablePreciseExp == 1) {
            C1905300zgG.LIZ.getClass();
            if (C1905300zgG.LIZJ() && C1833307Fz.LIZ() == 0) {
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lite mode init task begin, state=");
        C1905300zgG.LIZ.getClass();
        sbLIZ.append(C1905300zgG.LIZJ());
        sbLIZ.append(", enablePreciseExp=");
        LiteModePushConfig liteModePushConfigLIZ2 = C1905280zgE.LIZ();
        if (liteModePushConfigLIZ2 != null) {
            numValueOf = Integer.valueOf(liteModePushConfigLIZ2.enablePreciseExp);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C202099145x c202099145xLIZ = C1150504el.LIZ();
        if (C1905300zgG.LIZJ()) {
            i = 1;
        } else {
            i = -1;
        }
        c202099145xLIZ.LJIILLIIL = i;
        if ((C1243604tm.LIZ() & 1) == 1 || C1905290zgF.LIZ(4)) {
            C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "", AFwS212S0000000_23.get$arr$(154), true));
        }
        if (C1905290zgF.LIZIZ() && C1905280zgE.LIZ() != null) {
            C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "", AFwS217S0000000_28.get$arr$(532), true));
        }
        C0S78.LIZJ(AFwS217S0000000_28.get$arr$(248), true);
    }

    @Override // X.InterfaceC1006670cIr
    public final void LJIIJ(C2189391AmP c2189391AmP, C2189391AmP c2189391AmP2) throws JSONException {
        if (c2189391AmP2.LIZIZ()) {
            C1BCA.LJJIJIL(this);
            LIZ(LLILLL);
        }
    }
}
