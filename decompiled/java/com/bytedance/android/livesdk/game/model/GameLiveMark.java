package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GameLiveMark {

    @C09CT("cover_url")
    public String coverUrl;

    @C09CT("create_time")
    public Long createTime;

    @C09CT("download_url")
    public String downloadUrl;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("extra")
    public String extra;

    @C09CT("is_edit")
    public Integer isEdit;

    @C09CT("mark_id")
    public Long markId;

    @C09CT("mark_id_str")
    public String markIdStr;

    @C09CT("mark_time")
    public Long markTime;

    @C09CT("op_time")
    public Long opTime;

    @C09CT("owner_user_id")
    public Long ownerUserId;

    @C09CT("owner_user_id_str")
    public String ownerUserIdStr;

    @C09CT("preview_pic_url")
    public String previewPicUrl;

    @C09CT("replay_create_time")
    public Long replayCreateTime;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("room_id_str")
    public String roomIdStr;

    @C09CT("start_time")
    public Long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("stream_url")
    public String streamUrl;

    @C09CT("title")
    public String title;

    @C09CT("update_time")
    public Long updateTime;

    @C09CT("vid")
    public String vid;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.markId != null) {
            sb.append(", mark_id=");
            sb.append(this.markId);
        }
        if (this.markIdStr != null) {
            sb.append(", mark_id_str=");
            sb.append(this.markIdStr);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.roomIdStr != null) {
            sb.append(", room_id_str=");
            sb.append(this.roomIdStr);
        }
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        if (this.coverUrl != null) {
            sb.append(", cover_url=");
            sb.append(this.coverUrl);
        }
        if (this.downloadUrl != null) {
            sb.append(", download_url=");
            sb.append(this.downloadUrl);
        }
        if (this.streamUrl != null) {
            sb.append(", stream_url=");
            sb.append(this.streamUrl);
        }
        if (this.ownerUserId != null) {
            sb.append(", owner_user_id=");
            sb.append(this.ownerUserId);
        }
        if (this.ownerUserIdStr != null) {
            sb.append(", owner_user_id_str=");
            sb.append(this.ownerUserIdStr);
        }
        if (this.markTime != null) {
            sb.append(", mark_time=");
            sb.append(this.markTime);
        }
        if (this.startTime != null) {
            sb.append(", start_time=");
            sb.append(this.startTime);
        }
        if (this.endTime != null) {
            sb.append(", end_time=");
            sb.append(this.endTime);
        }
        if (this.replayCreateTime != null) {
            sb.append(", replay_create_time=");
            sb.append(this.replayCreateTime);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.isEdit != null) {
            sb.append(", is_edit=");
            sb.append(this.isEdit);
        }
        if (this.opTime != null) {
            sb.append(", op_time=");
            sb.append(this.opTime);
        }
        if (this.previewPicUrl != null) {
            sb.append(", preview_pic_url=");
            sb.append(this.previewPicUrl);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.createTime != null) {
            sb.append(", create_time=");
            sb.append(this.createTime);
        }
        if (this.updateTime != null) {
            sb.append(", update_time=");
            sb.append(this.updateTime);
        }
        sb.replace(0, 2, "GameLiveMark{");
        sb.append('}');
        return sb.toString();
    }
}
