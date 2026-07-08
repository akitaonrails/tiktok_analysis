package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoResponse extends BaseNetResponse {
    public static final int $stable = 8;
    public VideoItemInfo data;

    public final VideoItemInfo getData() {
        return this.data;
    }

    public final void setData(VideoItemInfo videoItemInfo) {
        this.data = videoItemInfo;
    }
}
