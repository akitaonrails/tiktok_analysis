package com.ss.android.ugc.aweme.socialavatar.network.socialavatar;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class BatchTnsRequest {
    public static final int $stable = 8;

    @C09CT("image_uris")
    public final List<String> imageUri;

    public BatchTnsRequest(List<String> list) {
        this.imageUri = list;
    }
}
