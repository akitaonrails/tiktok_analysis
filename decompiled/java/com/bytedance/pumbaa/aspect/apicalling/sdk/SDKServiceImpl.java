package com.bytedance.pumbaa.aspect.apicalling.sdk;

import X.C0WSW;
import X.C0WSX;
import X.C308480C7i;
import X.C823450WRz;
import X.C825320WZe;
import X.C825350WZh;
import X.C825370WZj;
import android.content.Context;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class SDKServiceImpl implements IPumbaaSdkService, IPumbaaModuleInitService {
    public static SDKConfig LIZ;
    public static boolean LIZIZ;

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZIZ(Context context, C823450WRz c823450WRz) {
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final String name() {
        return "SDKService";
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZ(Context context, C823450WRz c823450WRz) {
        try {
            IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
            if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJIIJ()) {
                return;
            }
            SDKConfig sDKConfig = C825350WZh.LIZ;
            SDKConfig sDKConfig2 = (SDKConfig) C308480C7i.LIZLLL(SDKConfig.class, "pumbaa_3rd_sdk_config", sDKConfig);
            if (sDKConfig2 != null) {
                sDKConfig = sDKConfig2;
            }
            C825370WZj.LIZ(sDKConfig);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("PB_3rd_SDK", new AwS557S0100000_13(e, 13), 6, e);
        }
    }
}
