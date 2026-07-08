package com.bytedance.ies.cutsame.source.api;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoResponse extends BaseResponse {
    public VideoItemInfo data;

    public VideoResponse() {
    }

    public final VideoItemInfo getData() {
        return this.data;
    }

    public final void setData(VideoItemInfo videoItemInfo) {
        this.data = videoItemInfo;
    }

    public VideoResponse(int i, String str, Throwable th) {
        super(i, str, th);
    }
}
