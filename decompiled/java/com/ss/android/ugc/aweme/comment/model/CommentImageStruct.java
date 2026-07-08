package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentImageStruct implements Serializable {

    @C09CT("crop_url")
    public UrlModel cropUrl;
    public transient int height;

    @C09CT("live_photo")
    public CommentLivePhotoInfoModel livePhotoInfoModel;

    @C09CT("origin_url")
    public UrlModel originUrl;
    public transient int progress = 100;

    @C09CT("source")
    public int source;
    public transient int width;

    public final boolean isAIImageComment() {
        return this.source == 2;
    }

    public final UrlModel getCropUrl() {
        return this.cropUrl;
    }

    public final int getHeight() {
        return this.height;
    }

    public final CommentLivePhotoInfoModel getLivePhotoInfoModel() {
        return this.livePhotoInfoModel;
    }

    public final UrlModel getOriginUrl() {
        return this.originUrl;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setCropUrl(UrlModel urlModel) {
        this.cropUrl = urlModel;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLivePhotoInfoModel(CommentLivePhotoInfoModel commentLivePhotoInfoModel) {
        this.livePhotoInfoModel = commentLivePhotoInfoModel;
    }

    public final void setOriginUrl(UrlModel urlModel) {
        this.originUrl = urlModel;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
