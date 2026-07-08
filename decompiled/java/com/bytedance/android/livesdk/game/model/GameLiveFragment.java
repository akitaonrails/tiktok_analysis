package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameLiveFragment {

    @C09CT("autocut_log_info")
    public AutocutLogInfo autocutLogInfo;

    @C09CT("autocut_relation_info")
    public AutocutRelationInfo autocutRelationInfo;

    @C09CT("create_time")
    public Long createTime;

    @C09CT("encode_status")
    public int encodeStatus;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("fragment_id")
    public Long fragmentId;

    @C09CT("fragment_type")
    public Integer fragmentType;

    @C09CT("game_highlight_type")
    public int gameHighlightType;

    @C09CT("is_edit")
    public Integer isEdit;

    @C09CT("is_muted")
    public boolean isMuted;

    @C09CT("is_posted")
    public boolean isPosted;

    @C09CT("mark_time")
    public Long markTime;

    @C09CT("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

    @C09CT("op_time")
    public Long opTime;

    @C09CT("owner_user_id")
    public Long ownerUserId;

    @C09CT("post_by_scene")
    public int postByScene;

    @C09CT("replay_create_time")
    public Long replayCreateTime;

    @C09CT("replay_relative_time")
    public long replayRelativeTime;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("room_star_live_timestsamp")
    public long roomStarLiveTimestsamp;

    @C09CT("show_info")
    public LiveFragmentShowInfo showInfo;

    @C09CT("sprite_list")
    public List<Sprite> spriteList;

    @C09CT("start_time")
    public Long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("update_time")
    public Long updateTime;

    @C09CT("item_id_str")
    public String itemIdStr = "";

    @C09CT("fragment_id_str")
    public String fragmentIdStr = "";

    @C09CT("vid")
    public String vid = "";

    @C09CT("download_url")
    public String downloadUrl = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("title")
    public String title = "";

    @C09CT("stream_url")
    public String streamUrl = "";

    @C09CT("preview_pic_url")
    public String previewPicUrl = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("owner_user_id_str")
    public String ownerUserIdStr = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fragmentId != null) {
            sb.append(", fragment_id=");
            sb.append(this.fragmentId);
        }
        if (this.fragmentIdStr != null) {
            sb.append(", fragment_id_str=");
            sb.append(this.fragmentIdStr);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.fragmentType != null) {
            sb.append(", fragment_type=");
            sb.append(this.fragmentType);
        }
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        if (this.downloadUrl != null) {
            sb.append(", download_url=");
            sb.append(this.downloadUrl);
        }
        if (this.coverUrl != null) {
            sb.append(", cover_url=");
            sb.append(this.coverUrl);
        }
        if (this.ownerUserId != null) {
            sb.append(", owner_user_id=");
            sb.append(this.ownerUserId);
        }
        if (this.startTime != null) {
            sb.append(", start_time=");
            sb.append(this.startTime);
        }
        if (this.endTime != null) {
            sb.append(", end_time=");
            sb.append(this.endTime);
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
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.markTime != null) {
            sb.append(", mark_time=");
            sb.append(this.markTime);
        }
        if (this.opTime != null) {
            sb.append(", op_time=");
            sb.append(this.opTime);
        }
        if (this.streamUrl != null) {
            sb.append(", stream_url=");
            sb.append(this.streamUrl);
        }
        if (this.previewPicUrl != null) {
            sb.append(", preview_pic_url=");
            sb.append(this.previewPicUrl);
        }
        if (this.roomIdStr != null) {
            sb.append(", room_id_str=");
            sb.append(this.roomIdStr);
        }
        if (this.ownerUserIdStr != null) {
            sb.append(", owner_user_id_str=");
            sb.append(this.ownerUserIdStr);
        }
        if (this.replayCreateTime != null) {
            sb.append(", replay_create_time=");
            sb.append(this.replayCreateTime);
        }
        if (this.isEdit != null) {
            sb.append(", is_edit=");
            sb.append(this.isEdit);
        }
        sb.replace(0, 2, "GameLiveFragment{");
        sb.append('}');
        return sb.toString();
    }
}
