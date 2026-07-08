package com.ss.android.ugc.aweme.live.livehostimpl.livereply;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplyPayload implements Serializable {
    public static final int $stable = 8;

    @C09CT("download_url")
    public String downloadUrl = "";

    @C09CT("is_success")
    public boolean isSuccess;

    @C09CT("punish_type")
    public int punishType;

    @C09CT("replay_id")
    public long replayId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("transcode_duration")
    public long transcodeDuration;

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final int getPunishType() {
        return this.punishType;
    }

    public final long getReplayId() {
        return this.replayId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getTranscodeDuration() {
        return this.transcodeDuration;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public final void setPunishType(int i) {
        this.punishType = i;
    }

    public final void setReplayId(long j) {
        this.replayId = j;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final void setTranscodeDuration(long j) {
        this.transcodeDuration = j;
    }
}
