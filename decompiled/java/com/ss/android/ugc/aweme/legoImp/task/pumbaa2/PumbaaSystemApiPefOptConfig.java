package com.ss.android.ugc.aweme.legoImp.task.pumbaa2;

import X.C04TD;
import X.C08Q0;
import X.C844470XAv;
import com.bytedance.pumbaa.utility.settings.ISystemApiPerfOptSettingsV1;
import com.bytedance.pumbaa.utility.settings.SystemApiPerfOptConfigV1;

/* JADX INFO: loaded from: classes3.dex */
public final class PumbaaSystemApiPefOptConfig implements ISystemApiPerfOptSettingsV1 {
    public static ISystemApiPerfOptSettingsV1 LIZ() {
        Object objLIZ = C04TD.LIZ(ISystemApiPerfOptSettingsV1.class, false);
        if (objLIZ != null) {
            return (ISystemApiPerfOptSettingsV1) objLIZ;
        }
        if (C04TD.R1 == null) {
            synchronized (ISystemApiPerfOptSettingsV1.class) {
                if (C04TD.R1 == null) {
                    C04TD.R1 = new PumbaaSystemApiPefOptConfig();
                }
            }
        }
        return C04TD.R1;
    }

    @Override // com.bytedance.pumbaa.utility.settings.ISystemApiPerfOptSettingsV1
    public final SystemApiPerfOptConfigV1 getConfig() {
        System.nanoTime();
        C844470XAv.LIZ.getClass();
        long jLongValue = Long.valueOf(C08Q0.LIZJ(C844470XAv.LIZ(), "PumbaaSysOptMask", 0L)).longValue();
        SystemApiPerfOptConfigV1 systemApiPerfOptConfigV1 = new SystemApiPerfOptConfigV1((1 & jLongValue) != 0, (jLongValue & 2) != 0);
        System.nanoTime();
        return systemApiPerfOptConfigV1;
    }
}
