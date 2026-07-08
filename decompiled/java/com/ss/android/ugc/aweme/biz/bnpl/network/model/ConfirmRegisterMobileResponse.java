package com.ss.android.ugc.aweme.biz.bnpl.network.model;

import X.C09CT;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PopOutInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ConfirmRegisterMobileResponse {

    @C09CT("popout_info")
    public final PopOutInfo popOutInfo;

    @C09CT("verify_info")
    public final String verifyInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmRegisterMobileResponse)) {
            return false;
        }
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse = (ConfirmRegisterMobileResponse) obj;
        return Intrinsics.LJFF(this.verifyInfo, confirmRegisterMobileResponse.verifyInfo) && Intrinsics.LJFF(this.popOutInfo, confirmRegisterMobileResponse.popOutInfo);
    }

    public ConfirmRegisterMobileResponse(String str, PopOutInfo popOutInfo) {
        this.verifyInfo = str;
        this.popOutInfo = popOutInfo;
    }
}
