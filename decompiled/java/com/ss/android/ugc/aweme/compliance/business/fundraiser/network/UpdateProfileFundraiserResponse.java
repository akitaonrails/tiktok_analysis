package com.ss.android.ugc.aweme.compliance.business.fundraiser.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class UpdateProfileFundraiserResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("fundraiser_already_exists_on_profile")
    public final boolean fundraiserAlreadyExists;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public UpdateProfileFundraiserResponse() {
        this(0, "", false);
    }

    public UpdateProfileFundraiserResponse(int i, String str, boolean z) {
        this.statusCode = i;
        this.statusMsg = str;
        this.fundraiserAlreadyExists = z;
    }
}
