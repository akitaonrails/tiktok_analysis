package com.ss.android.ugc.aweme.fe.method.upload.response;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes31.dex */
public final class I18nUploadResponse extends BaseResponse {

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("video")
    public UrlModel video;

    public final UrlModel getCover() {
        return this.cover;
    }

    public final UrlModel getVideo() {
        return this.video;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }
}
