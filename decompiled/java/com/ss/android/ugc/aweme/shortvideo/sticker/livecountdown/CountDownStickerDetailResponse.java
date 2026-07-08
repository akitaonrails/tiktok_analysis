package com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;

/* JADX INFO: loaded from: classes30.dex */
public final class CountDownStickerDetailResponse extends BaseResponse {

    @C09CT("sticker_detail")
    public final CountDownStickerStruct stickerDetail;

    public CountDownStickerDetailResponse(CountDownStickerStruct countDownStickerStruct) {
        this.stickerDetail = countDownStickerStruct;
    }
}
