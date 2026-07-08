package com.ss.android.ugc.tools.infosticker.repository.internal.repository;

import X.C09CT;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerCollectTokenResp {

    @C09CT("img_config")
    public UploadImageConfig imgConfig;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_message")
    public final String statusMassage;

    public StickerCollectTokenResp() {
        this(null, -1, "");
    }

    public StickerCollectTokenResp(UploadImageConfig uploadImageConfig, int i, String str) {
        this.imgConfig = uploadImageConfig;
        this.statusCode = i;
        this.statusMassage = str;
    }
}
