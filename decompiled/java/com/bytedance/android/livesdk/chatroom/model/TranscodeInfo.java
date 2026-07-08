package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;

/* JADX INFO: loaded from: classes.dex */
public final class TranscodeInfo {

    @C09CT("estimated_size")
    public long estimatedSize;

    @C09CT("fail_reason")
    public String failReason = "";

    @C09CT("transcode_status")
    public int transcodeStatus;

    @C09CT("video_meta")
    public VideoMetaInfo videoMeta;
}
