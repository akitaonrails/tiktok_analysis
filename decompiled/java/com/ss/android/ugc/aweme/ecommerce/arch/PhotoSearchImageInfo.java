package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchImageInfo {

    @C09CT("box_detection")
    public final List<String> boxDetection;

    @C09CT("detection")
    public final String detection;

    @C09CT("image_uri")
    public final String imageUri;

    public PhotoSearchImageInfo() {
        this(null, null, null);
    }

    public PhotoSearchImageInfo(String str, List<String> list, String str2) {
        this.imageUri = str;
        this.boxDetection = list;
        this.detection = str2;
    }
}
