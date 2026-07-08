package com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes30.dex */
public final class CountDownStickerResponse extends BaseResponse {

    @C09CT("is_subscribed")
    public final boolean subscribeState;

    public CountDownStickerResponse(boolean z) {
        this.subscribeState = z;
    }
}
