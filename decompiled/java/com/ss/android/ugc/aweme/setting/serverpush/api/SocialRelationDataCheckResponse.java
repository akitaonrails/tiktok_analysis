package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialRelationDataCheckResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("has_remaining_data")
    public boolean hasRemainingData;

    public final boolean getHasRemainingData() {
        return this.hasRemainingData;
    }

    public final void setHasRemainingData(boolean z) {
        this.hasRemainingData = z;
    }
}
