package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioAppendRequest {

    @C09CT("task_id")
    public final String id;

    @C09CT("generate_sticker_count")
    public final Integer resultCnt;

    public MixStudioAppendRequest() {
        this(null, null);
    }

    public MixStudioAppendRequest(String str, Integer num) {
        this.id = str;
        this.resultCnt = num;
    }
}
