package com.ss.android.ugc.tiktok.pns;

import X.C0C64;
import X.C0CCZ;
import X.C0PEM;
import X.C0VZ0;
import X.C1408050mkF;
import X.C15ZE;
import X.C15ZL;
import X.C15ZM;
import X.C15ZQ;
import X.C15ZR;
import X.C15ZT;
import X.C15ZX;
import X.C15ZZ;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C306540Bzw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20540815Ze;
import X.InterfaceC20541015Zg;
import X.InterfaceC20541115Zh;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS150S0201000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class InitScreenTimeSDKTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitScreenTimeSDKTask";
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

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0zpM] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C15ZZ c15zz;
        InterfaceC20541015Zg interfaceC20541015Zg;
        C15ZQ c15zq;
        C15ZZ c15zz2 = new C15ZZ();
        c15zz2.LIZ = new InterfaceC20541115Zh() { // from class: X.15Zd
            public final Keva LIZ = Keva.getRepo("screentime_sdk");

            @Override // X.InterfaceC20541115Zh
            public final void LIZ(String str) {
                this.LIZ.erase(str);
            }

            @Override // X.InterfaceC20541115Zh
            public final long getLong(String str) {
                return this.LIZ.getLong(str, 0L);
            }

            @Override // X.InterfaceC20541115Zh
            public final void LIZIZ(String str, long j) {
                this.LIZ.storeLong(str, j);
            }
        };
        c15zz2.LIZJ = new InterfaceC20541015Zg() { // from class: X.04yc
            @Override // X.InterfaceC20541015Zg
            public final void LIZIZ() {
                int i = C2187451AjH.LIZ;
            }

            @Override // X.InterfaceC20541015Zg
            public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                try {
                    C793770VBv.LJII(str, jSONObject, jSONObject2, null);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        };
        c15zz2.LIZIZ = new InterfaceC20540815Ze() { // from class: X.15Zc
            @Override // X.InterfaceC20540815Ze
            public final void LIZ(String str, Map<String, String> map) {
                C20684815ws.LJIILLIIL(str, map);
            }
        };
        c15zz2.LIZLLL = C0C64.LJIILLIIL().LJIJJLI(31744, Mp4ScreenVideoLoadTimeout.CONTROL, "stm_timer_interval", true);
        C15ZT.LIZ(c15zz2);
        C15ZR c15zr = C15ZR.LIZLLL;
        if (c15zr != null) {
            if (C306540Bzw.LIZ()) {
                c15zr.LIZ(new C15ZX());
            }
            c15zr.LIZIZ();
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1408050mkF(null), 3);
        if (C306540Bzw.LIZ()) {
            C15ZL c15zl = new C15ZL(new C15ZM() { // from class: X.0zpM
                public boolean LIZ = true;

                @Override // X.C15ZM
                public final void LIZ() {
                }

                @Override // X.C15ZM
                public final boolean LJ() {
                    return C0XQ7.LJFF().isLogin() && !ComplianceServiceProvider.LJIL().LJJI() && LIZJ(false) > 0;
                }

                @Override // X.C15ZM
                public final int LIZJ(boolean z) {
                    int iLIZ;
                    int iLJIIIZ = ComplianceServiceProvider.LJIL().LJIIIZ() * 60;
                    IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) ServiceManager.get().getService(IComplianceDebugService.class);
                    if (iComplianceDebugService != null) {
                        iComplianceDebugService.LJFF();
                    }
                    int i = iLJIIIZ / 1;
                    int i2 = 0;
                    if (this.LIZ) {
                        iLIZ = C07MU.LIZ();
                    } else {
                        iLIZ = 0;
                    }
                    if (z) {
                        i2 = iLIZ;
                    }
                    return i + i2;
                }

                @Override // X.C15ZM
                public final int LIZLLL(boolean z) {
                    int iLIZ;
                    int i = 0;
                    if (this.LIZ) {
                        iLIZ = C07MU.LIZ();
                    } else {
                        iLIZ = 0;
                    }
                    if (z) {
                        i = iLIZ;
                    }
                    return i + 600;
                }

                @Override // X.C15ZM
                public final void LJFF(boolean z) {
                    this.LIZ = z;
                }

                @Override // X.C15ZM
                public final void LIZIZ(AwS150S0201000_31 awS150S0201000_31, AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312) {
                    if (!LJ()) {
                        return;
                    }
                    awS150S0201000_31.invoke();
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1910930zpL(this, awS575S0100000_31, awS575S0100000_312, null), 3);
                }
            });
            C15ZR c15zr2 = C15ZR.LIZLLL;
            if (c15zr2 != null && (c15zq = c15zr2.LIZIZ) != null && !((ArrayList) c15zq.LIZLLL).contains(c15zl)) {
                ((ArrayList) c15zq.LIZLLL).add(c15zl);
            }
            C15ZE.LIZ = c15zl;
        }
        C15ZR c15zr3 = C15ZR.LIZLLL;
        if (c15zr3 != null && (c15zz = c15zr3.LIZ) != null && (interfaceC20541015Zg = c15zz.LIZJ) != null) {
            interfaceC20541015Zg.LIZ("pnsscreensdk_screen_adapter_initialize", null, null);
        }
    }
}
