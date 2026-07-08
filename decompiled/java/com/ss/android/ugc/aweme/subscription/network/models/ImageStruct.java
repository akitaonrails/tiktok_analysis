package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ImageStruct implements Serializable {
    public static final int $stable = 0;

    @C09CT("uri")
    public final String imageUri;

    @C09CT("subscription_info")
    public final SubsInfo subsInfo;

    public ImageStruct(String str, SubsInfo subsInfo) {
        this.imageUri = str;
        this.subsInfo = subsInfo;
    }
}
