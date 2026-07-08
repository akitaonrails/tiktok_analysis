package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class LooperProtectEnhanceSetting$LooperProtectEnhanceConfig {

    @C09CT("ignoreList")
    public List<LooperProtectEnhanceSetting$ExceptionInfo> ignoreList;

    public static boolean LIZ(LooperProtectEnhanceSetting$LooperProtectEnhanceConfig looperProtectEnhanceSetting$LooperProtectEnhanceConfig) {
        List<LooperProtectEnhanceSetting$ExceptionInfo> list;
        if (looperProtectEnhanceSetting$LooperProtectEnhanceConfig != null && (list = looperProtectEnhanceSetting$LooperProtectEnhanceConfig.ignoreList) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }
}
