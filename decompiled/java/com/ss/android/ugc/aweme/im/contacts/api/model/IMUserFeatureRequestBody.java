package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.EnumC1725606pK;

/* JADX INFO: loaded from: classes3.dex */
public final class IMUserFeatureRequestBody {

    @C09CT("im_user_feature_name")
    public final int featureKey;

    @C09CT("im_user_feature_value")
    public final IMUserFeatureValueData featureValue;

    public IMUserFeatureRequestBody() {
        this(EnumC1725606pK.UNKNOWN.getValue(), new IMUserFeatureValueData(0, null, null, null, null, null, null, null));
    }

    public IMUserFeatureRequestBody(int i, IMUserFeatureValueData iMUserFeatureValueData) {
        this.featureKey = i;
        this.featureValue = iMUserFeatureValueData;
    }
}
