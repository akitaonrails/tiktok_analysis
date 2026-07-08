package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StreamStatusChangeInfo {

    @C09CT("change_timestamp")
    public long changeTimestamp;

    @C09CT("cur_status")
    public int curStatus;

    @C09CT("pre_status")
    public int preStatus;

    @C09CT("stream_id")
    public long streamId;
}
