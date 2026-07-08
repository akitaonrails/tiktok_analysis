package com.bytedance.lynx.service.i18n;

import X.C0X8C;
import X.C1289470jez;
import X.C1312900kGm;
import X.C1312910kGn;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.icu.RegisterICU;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.service.ILynxI18nService;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxI18nService implements ILynxI18nService {
    public static final C1312900kGm Companion = new Object() { // from class: X.0kGm
    };
    public static final LynxI18nService INSTANCE = new LynxI18nService();

    @Override // com.lynx.tasm.service.ILynxI18nService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1312910kGn.LIZ(this);
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    @Override // com.lynx.tasm.service.ILynxI18nService
    public boolean loadLibrary(C0X8C c0x8c) {
        try {
            c0x8c.loadLibrary("napi");
            c0x8c.loadLibrary("icu");
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vmsdk-icu load failed: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("LynxI18nService", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    @Override // com.lynx.tasm.service.ILynxI18nService
    public boolean registerNapiEnv(long j) {
        RegisterICU.nativeRegisterICUInNapiEnv(j);
        return true;
    }
}
