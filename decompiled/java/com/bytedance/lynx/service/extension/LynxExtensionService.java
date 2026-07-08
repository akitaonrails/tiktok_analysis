package com.bytedance.lynx.service.extension;

import X.C1289430jev;
import X.C1289470jez;
import X.C1299340juu;
import X.C1301610jyZ;
import X.C2188811AlT;
import X.InterfaceC1310130kCJ;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.h;
import com.lynx.tasm.LynxEnv;
import j27.s;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxExtensionService implements InterfaceC1310130kCJ {
    public static final LynxExtensionService INSTANCE = new LynxExtensionService();

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    @Override // X.InterfaceC1310130kCJ
    public void onLynxEnvSetup() {
        C1301610jyZ.LIZIZ().execute(new ARunnableS119S0100000_19((List) LynxEnv.inst().getBehaviors(), 14));
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public Class getServiceClass() {
        return InterfaceC1310130kCJ.class;
    }

    private final void destroyLynxKrypton(s sVar) {
        if (sVar == null) {
            LynxLog.e("LynxExtensionService", "LynxContext is null");
            return;
        }
        h hVarLJIIIIZZ = sVar.LJIIIIZZ();
        if (hVarLJIIIIZZ == null) {
            return;
        }
        hVarLJIIIIZZ.LIZ();
    }

    @Override // X.InterfaceC1310130kCJ
    public void onLynxViewDestroy(s sVar) {
        destroyLynxKrypton(sVar);
    }

    private final void setUpLynxKrypton(s sVar, C1299340juu c1299340juu, C1289430jev c1289430jev) {
        if (sVar != null && !sVar.LJIJI()) {
            try {
                Object objNewInstance = Class.forName("com.lynx.tasm.behavior.ui.krypton.LynxKryptonModule").getConstructor(s.class, C1299340juu.class, C1289430jev.class).newInstance(sVar, c1299340juu, c1289430jev);
                if (objNewInstance != null) {
                    ((HashMap) sVar.LLLFFI).put("LynxKryptonModule", (h) objNewInstance);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.lynx.jsbridge.LynxExtensionModule");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed init LynxKryptonModule with exception: ");
                sbLIZ.append(e);
                LynxLog.e("LynxExtensionService", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        LynxLog.e("LynxExtensionService", "LynxContext is null or embedded mode is ON");
    }

    @Override // X.InterfaceC1310130kCJ
    public void onLynxViewSetup(s sVar, C1299340juu c1299340juu, C1289430jev c1289430jev) {
        setUpLynxKrypton(sVar, c1299340juu, c1289430jev);
    }
}
