package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SubContractStatusMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public PushContractStatusResult data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }

    public SubContractStatusMessage() {
        this.type = C001A.SUB_CONTRACT_STATUS_MESSAGE;
    }
}
