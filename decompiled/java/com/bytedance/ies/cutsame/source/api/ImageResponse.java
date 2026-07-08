package com.bytedance.ies.cutsame.source.api;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageResponse extends BaseResponse {
    public AfrResponse data;

    public ImageResponse() {
    }

    public final AfrResponse getData() {
        return this.data;
    }

    public final void setData(AfrResponse afrResponse) {
        this.data = afrResponse;
    }

    public ImageResponse(int i, String str, Throwable th) {
        super(i, str, th);
    }
}
