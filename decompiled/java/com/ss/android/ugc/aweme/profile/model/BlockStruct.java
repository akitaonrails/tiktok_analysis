package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class BlockStruct extends BaseResponse {
    public static final Companion Companion = new Companion();

    @C09CT("block_status")
    public int blockStatus;

    public static final class Companion {
    }

    public final int getBlockStatus() {
        return this.blockStatus;
    }

    public final void setBlockStatus(int i) {
        this.blockStatus = i;
    }
}
