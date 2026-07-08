package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FacedFeatureData {

    @C09CT("vcFaceRect")
    public List<FaceFeatureV2> vcFaceFeature;

    public FacedFeatureData() {
        this(new ArrayList());
    }

    public FacedFeatureData(List<FaceFeatureV2> list) {
        this.vcFaceFeature = list;
    }

    public final void setVcFaceFeature(List<FaceFeatureV2> list) {
        this.vcFaceFeature = list;
    }
}
