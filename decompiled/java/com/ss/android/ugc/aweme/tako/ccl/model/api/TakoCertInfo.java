package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoCertInfo {

    @C09CT("custom_verify")
    public final String customVerify;

    @C09CT("is_verify")
    public final boolean isVerify;

    public TakoCertInfo() {
        this(false, "");
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isVerify) * 31;
        String str = this.customVerify;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public TakoCertInfo(boolean z, String str) {
        this.isVerify = z;
        this.customVerify = str;
    }
}
