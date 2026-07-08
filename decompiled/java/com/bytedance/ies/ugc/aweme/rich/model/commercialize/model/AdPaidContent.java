package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdPaidContent implements Serializable {

    @C09CT("collection_id")
    public final String collectionId;

    @C09CT("collection_name")
    public final String collectionName;

    @C09CT("profile_landing_optimization")
    public final boolean profileLandingOptimization;

    public AdPaidContent() {
        this("", "", false);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionName() {
        return this.collectionName;
    }

    public final boolean getProfileLandingOptimization() {
        return this.profileLandingOptimization;
    }

    public AdPaidContent(String str, String str2, boolean z) {
        this.collectionId = str;
        this.collectionName = str2;
        this.profileLandingOptimization = z;
    }
}
