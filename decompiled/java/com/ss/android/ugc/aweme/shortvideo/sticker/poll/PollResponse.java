package com.ss.android.ugc.aweme.shortvideo.sticker.poll;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class PollResponse extends BaseResponse {

    @C09CT("option_id")
    public int optionId = -1;

    public final int getOptionId() {
        return this.optionId;
    }

    public final void setOptionId(int i) {
        this.optionId = i;
    }
}
