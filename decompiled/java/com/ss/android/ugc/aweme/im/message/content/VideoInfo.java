package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes15.dex */
public final class VideoInfo {

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("link_info")
    public final LinkInfo linkInfo;

    public VideoInfo() {
        this(null, null);
    }

    public VideoInfo(UrlModel urlModel, LinkInfo linkInfo) {
        this.cover = urlModel;
        this.linkInfo = linkInfo;
    }
}
