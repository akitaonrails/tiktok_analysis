package com.ss.android.ugc.gamora.editor.sticker.pov.api;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class PovResponse {

    @C09CT("extra_params")
    public final String extraParams;

    @C09CT("pov_info")
    public final List<PovItemInfo> povInfoList;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    @C09CT("tns_block_cnt")
    public final Integer tnsBlockCount;

    public PovResponse() {
        this(null, null, null, null, null);
    }

    public PovResponse(Integer num, String str, List<PovItemInfo> list, Integer num2, String str2) {
        this.statusCode = num;
        this.statusMessage = str;
        this.povInfoList = list;
        this.tnsBlockCount = num2;
        this.extraParams = str2;
    }
}
