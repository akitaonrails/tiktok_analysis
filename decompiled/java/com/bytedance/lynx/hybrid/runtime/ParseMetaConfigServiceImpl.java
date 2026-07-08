package com.bytedance.lynx.hybrid.runtime;

import X.C04TD;
import X.C1537480q70;
import com.bytedance.lynx.hybrid.service.IParseMetaConfigAPI;

/* JADX INFO: loaded from: classes3.dex */
public final class ParseMetaConfigServiceImpl implements IParseMetaConfigAPI {
    @Override // com.bytedance.lynx.hybrid.service.IParseMetaConfigAPI
    public void configSparkPlatform(C1537480q70 c1537480q70) {
    }

    public static IParseMetaConfigAPI createIParseMetaConfigAPIbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IParseMetaConfigAPI.class, z);
        if (objLIZ != null) {
            return (IParseMetaConfigAPI) objLIZ;
        }
        if (C04TD.LJJIJIL == null) {
            synchronized (IParseMetaConfigAPI.class) {
                if (C04TD.LJJIJIL == null) {
                    C04TD.LJJIJIL = new ParseMetaConfigServiceImpl();
                }
            }
        }
        return C04TD.LJJIJIL;
    }
}
