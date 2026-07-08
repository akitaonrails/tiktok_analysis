package com.ss.android.ugc.aweme.comment.poll.repository;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes22.dex */
public final class CreatePollResponse extends BaseResponse {

    @C09CT("poll_id")
    public final Long pollId;

    public CreatePollResponse() {
        this(null);
    }

    public CreatePollResponse(Long l) {
        this.pollId = l;
    }
}
