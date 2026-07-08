package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicEditResponse extends BaseResponse {

    @C09CT("music_edit_result")
    public MusicEditResult musicEditResult;

    @C09CT("req_id")
    public final String reqId;

    public final MusicEditResult getMusicEditResult() {
        return this.musicEditResult;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final void setMusicEditResult(MusicEditResult musicEditResult) {
        this.musicEditResult = musicEditResult;
    }
}
