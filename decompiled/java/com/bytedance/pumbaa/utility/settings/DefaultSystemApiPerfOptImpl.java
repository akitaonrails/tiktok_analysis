package com.bytedance.pumbaa.utility.settings;

import X.C1229704rX;
import X.C308480C7i;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultSystemApiPerfOptImpl implements ISystemApiPerfOptSettingsV1 {
    @Override // com.bytedance.pumbaa.utility.settings.ISystemApiPerfOptSettingsV1
    public final SystemApiPerfOptConfigV1 getConfig() {
        SystemApiPerfOptConfigV1 systemApiPerfOptConfigV1 = C1229704rX.LIZ;
        SystemApiPerfOptConfigV1 systemApiPerfOptConfigV12 = (SystemApiPerfOptConfigV1) C308480C7i.LIZLLL(SystemApiPerfOptConfigV1.class, "pumbaa_system_api_perf_opt_v1", systemApiPerfOptConfigV1);
        return systemApiPerfOptConfigV12 != null ? systemApiPerfOptConfigV12 : systemApiPerfOptConfigV1;
    }
}
