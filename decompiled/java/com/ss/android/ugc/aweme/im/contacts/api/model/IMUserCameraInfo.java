package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class IMUserCameraInfo implements Serializable {

    @C09CT("feature_result")
    public final FeatureResult featureResult;

    public IMUserCameraInfo() {
        this(null);
    }

    public IMUserCameraInfo(FeatureResult featureResult) {
        this.featureResult = featureResult;
    }
}
