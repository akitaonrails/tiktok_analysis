package com.ss.android.ugc.aweme.profile.model;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockStatus extends BaseResponse {
    public int blockStatus;
    public String userId;

    public int getBlockStatus() {
        return this.blockStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setBlockStatus(int i) {
        this.blockStatus = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public BlockStatus(String str, int i) {
        this.userId = str;
        this.blockStatus = i;
    }
}
