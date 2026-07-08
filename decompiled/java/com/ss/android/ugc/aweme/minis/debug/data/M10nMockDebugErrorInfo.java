package com.ss.android.ugc.aweme.minis.debug.data;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class M10nMockDebugErrorInfo {

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_description")
    public final String errorDescription;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("is_checked")
    public boolean isChecked;

    @C09CT("is_iaa_sdk_inner_error")
    public boolean isIaaSDKInnerError;

    public M10nMockDebugErrorInfo() {
        this(null, null, false, false, null);
    }

    public M10nMockDebugErrorInfo(Integer num, String str, boolean z, boolean z2, String str2) {
        this.errorCode = num;
        this.errorMsg = str;
        this.isChecked = z;
        this.isIaaSDKInnerError = z2;
        this.errorDescription = str2;
    }
}
