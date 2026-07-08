package com.ss.android.ugc.aweme.legoImp.task;

import X.C07OX;
import X.C0CCZ;
import X.C0CLW;
import X.C0VU1;
import X.C0VZ0;
import X.C1514430pVp;
import X.C1542900qFk;
import X.C1544660qIa;
import X.C1854907Oh;
import X.C1BR1;
import X.C1BRI;
import X.C20323314ff;
import X.C2204701BQm;
import X.C2204711BQn;
import X.C316660CbA;
import X.C822030WMn;
import X.C822640WOw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.governance.network.HybridTrafficColoringModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class JsBridge2InitTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "JsBridge2InitTask";
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

    @Override // X.InterfaceC799590VYf
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL;
    }

    public JsBridge2InitTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    public final void LIZ(final long j) {
        SettingsManager.LIZLLL().getClass();
        final boolean z = true;
        C2204701BQm.LJIIJ = Boolean.valueOf(SettingsManager.LIZ("disable_jsb_auth_webcast", true));
        if (this.LL != EnumC799870VZh.BOOT_FINISH) {
            z = false;
        }
        C1BRI c1bri = new C1BRI(z, j) { // from class: X.0dfs
            public final /* synthetic */ boolean LIZ;

            @Override // X.C1BRI
            public final void onInitialized() {
                if (this.LIZ) {
                    return;
                }
                C1BR7 c1br7 = C2204711BQn.LJ;
                if (TextUtils.isEmpty("host")) {
                    return;
                }
                C1BR7 c1br72 = C2204711BQn.LJ;
                if (c1br72.LIZ() != null) {
                    c1br72.LIZ().LIZIZ("host", null);
                }
            }
        };
        if (C07OX.LIZJ()) {
            C2204711BQn.LIZIZ(z, c1bri);
        } else {
            C2204711BQn.LIZ(z, new JsBridge2PermissionConfigurator(), c1bri, new C1BR1(), new C1544660qIa());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("workType", this.LL.name()).put("fetchPermissionConfig", z).put("isJsBridge2OptSpiConfig", C07OX.LIZJ());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1542900qFk.LIZJ("jsb_auth_enablePermissionCheck", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1542900qFk.LIZJ("jsb_auth_enablePermissionCheck", jSONObject);
            throw th;
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean zBooleanValue;
        if (this.LL != EnumC799870VZh.BOOT_FINISH && ((Boolean) C1854907Oh.LIZJ.getValue()).booleanValue() && !C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zBooleanValue = C0CLW.LIZIZ.LIZ.getUseBridgeEngineV2().booleanValue();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            zBooleanValue = false;
        }
        EnumC799870VZh enumC799870VZh = this.LL;
        EnumC799870VZh enumC799870VZh2 = EnumC799870VZh.BOOT_FINISH;
        if (zBooleanValue) {
            LIZ(jCurrentTimeMillis);
            HybridTrafficColoringModel hybridTrafficColoringModelLIZ = C822030WMn.LIZ();
            if (!hybridTrafficColoringModelLIZ.enabled || !hybridTrafficColoringModelLIZ.contextPassEnabled) {
                return;
            }
            C2204711BQn.LJFF = new C822640WOw();
            return;
        }
        if (enumC799870VZh != enumC799870VZh2) {
            return;
        }
        SettingsManager.LIZLLL().LJIIIZ(new C20323314ff(this, jCurrentTimeMillis));
    }
}
