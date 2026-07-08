package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishImageModel {
    public boolean compiled;
    public final int height;
    public final String path;
    public PublishImageLivePhotoModel publishImageLivePhotoModel;
    public String uri;
    public final int width;

    public final PublishImageModel copy(String str, int i, int i2, String str2, PublishImageLivePhotoModel publishImageLivePhotoModel, boolean z) {
        return new PublishImageModel(str, i, i2, str2, publishImageLivePhotoModel, z);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishImageModel(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", publishImageLivePhotoModel=");
        sbLIZ.append(this.publishImageLivePhotoModel);
        sbLIZ.append(", compiled=");
        sbLIZ.append(this.compiled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCompiled(boolean z) {
        this.compiled = z;
    }

    public final void setPublishImageLivePhotoModel(PublishImageLivePhotoModel publishImageLivePhotoModel) {
        this.publishImageLivePhotoModel = publishImageLivePhotoModel;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public PublishImageModel(String str, int i, int i2, String str2, PublishImageLivePhotoModel publishImageLivePhotoModel, boolean z) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.uri = str2;
        this.publishImageLivePhotoModel = publishImageLivePhotoModel;
        this.compiled = z;
    }
}
