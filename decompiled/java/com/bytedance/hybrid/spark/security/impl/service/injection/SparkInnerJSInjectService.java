package com.bytedance.hybrid.spark.security.impl.service.injection;

import X.C04TD;
import X.C2281108wj;
import X.EnumC2281308wl;
import X.InterfaceC1541990qEH;
import Y.ARunnableS92S0200000_23;
import com.bytedance.hybrid.spark.autoservice.ISparkInnerJSInjectService;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkInnerJSInjectService implements ISparkInnerJSInjectService {
    public static ISparkInnerJSInjectService createISparkInnerJSInjectServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISparkInnerJSInjectService.class, z);
        if (objLIZ != null) {
            return (ISparkInnerJSInjectService) objLIZ;
        }
        if (C04TD.LJJIII == null) {
            synchronized (ISparkInnerJSInjectService.class) {
                if (C04TD.LJJIII == null) {
                    C04TD.LJJIII = new SparkInnerJSInjectService();
                }
            }
        }
        return C04TD.LJJIII;
    }

    @Override // com.bytedance.hybrid.spark.autoservice.ISparkInnerJSInjectService
    public void preload(InterfaceC1541990qEH interfaceC1541990qEH, HybridSchemaParam hybridSchemaParam) {
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Blocked, true, new ARunnableS92S0200000_23(hybridSchemaParam, interfaceC1541990qEH, 14));
    }
}
