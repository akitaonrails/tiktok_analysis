package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchImageResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("box_detection")
    public List<String> boxDetection;

    @C09CT("detection")
    public String detection;

    @C09CT("image_uri")
    public String imageUri;

    public final List<String> getBoxDetection() {
        return this.boxDetection;
    }

    public final String getDetection() {
        return this.detection;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final void setBoxDetection(List<String> list) {
        this.boxDetection = list;
    }

    public final void setDetection(String str) {
        this.detection = str;
    }

    public final void setImageUri(String str) {
        this.imageUri = str;
    }
}
