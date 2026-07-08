package com.ss.android.ugc.aweme.im.sticker.impl.replytosticker.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IMStickerSearchSimilarResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("sticker_list")
    public final List<IMReplySuggestionStickerInfo> stickerList;

    public IMStickerSearchSimilarResponse(Integer num, String str, List<IMReplySuggestionStickerInfo> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.stickerList = list;
    }
}
