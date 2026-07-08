package com.ss.android.ugc.aweme.pipo.errorsdk.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorCodeSdkConfig {

    @C09CT("disable_uiTypes")
    public final List<String> disableUiTypes;

    @C09CT("enabled")
    public final boolean enable;

    public ErrorCodeSdkConfig() {
        this(true, null);
    }

    public ErrorCodeSdkConfig(boolean z, List<String> list) {
        this.enable = z;
        this.disableUiTypes = list;
    }
}
