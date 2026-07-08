package com.bytedance.pumbaa.aspect.apicalling.systemapi;

import X.C0WSW;
import X.C0WSX;
import X.C308480C7i;
import X.C823450WRz;
import X.C825320WZe;
import X.C825360WZi;
import X.C825380WZk;
import android.content.Context;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class SystemApiServiceImpl implements IPumbaaSystemApiService, IPumbaaModuleInitService {
    public static SystemApiConfig LIZ;
    public static boolean LIZIZ;

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZIZ(Context context, C823450WRz c823450WRz) {
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final String name() {
        return "SystemApiService";
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZ(Context context, C823450WRz c823450WRz) {
        try {
            IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
            if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJII()) {
                return;
            }
            SystemApiConfig systemApiConfig = C825360WZi.LIZ;
            SystemApiConfig systemApiConfig2 = (SystemApiConfig) C308480C7i.LIZLLL(SystemApiConfig.class, "pumbaa_system_api_config", systemApiConfig);
            if (systemApiConfig2 != null) {
                systemApiConfig = systemApiConfig2;
            }
            C825380WZk.LIZ(systemApiConfig);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("PB_SYSTEM_API", new AwS557S0100000_13(e, 16), 6, null);
        }
    }
}
