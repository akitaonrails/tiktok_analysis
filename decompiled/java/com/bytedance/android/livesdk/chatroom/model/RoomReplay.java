package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.AnchorFragmentListResult;

/* JADX INFO: loaded from: classes.dex */
public final class RoomReplay {

    @C09CT("anchor_fragment_list_result")
    public AnchorFragmentListResult anchorFragmentListResult;

    @C09CT("available")
    public boolean available;

    @C09CT("clip_disable")
    public boolean clipDisable;

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("create_time")
    public long createTime;

    @C09CT("download_mode")
    public int downloadMode;

    @C09CT("fan_ticket")
    public long fanTicket;

    @C09CT("finish_time")
    public long finishTime;

    @C09CT("fragment_count")
    public long fragmentCount;

    @C09CT("generate_duration")
    public long generateDuration;

    @C09CT("hls_video_meta_info")
    public VideoMetaInfo hlsVideoMetaInfo;

    @C09CT("is_game_room")
    public boolean isGameRoom;

    @C09CT("live_mode")
    public int liveMode;

    @C09CT("mark_count")
    public long markCount;

    @C09CT("moment_gen_stats")
    public long momentGenStats;

    @C09CT("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

    @C09CT("music_copyright_status")
    public int musicCopyrightStatus;

    @C09CT("punish_type")
    public long punishType;

    @C09CT("push_status")
    public long pushStatus;

    @C09CT("remux_info")
    public RemuxInfo remuxInfo;

    @C09CT("replay_prompt")
    public int replayPrompt;

    @C09CT("resolution_ratio_info")
    public ResolutionRatioInfo resolutionRatioInfo;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("support_bb_download")
    public boolean supportBbDownload;

    @C09CT("total_user")
    public long totalUser;

    @C09CT("transcode_info")
    public TranscodeInfo transcodeInfo;

    @C09CT("video_info")
    public VideoInfo videoInfo;

    @C09CT("watch_status")
    public int watchStatus;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("moments")
    public List<RoomReplayMoment> moments = new ArrayList();

    @C09CT("title")
    public String title = "";

    @C09CT("fragment_id")
    public String fragmentId = "";

    @C09CT("play_url")
    public String playUrl = "";

    @C09CT("download_url")
    public String downloadUrl = "";

    @C09CT("play_url_vcodec")
    public String playUrlVcodec = "";

    @C09CT("failed_reason")
    public String failedReason = "";

    @C09CT("m3u8_url")
    public String m3u8Url = "";

    @C09CT("vid")
    public String vid = "";

    @C09CT("fragment_count_with_type")
    public List<FragmentTypeCount> fragmentCountWithType = new ArrayList();

    @C09CT("sprite_list")
    public List<SpriteImageItem> spriteList = new ArrayList();

    @C09CT("room_id_encode")
    public String roomIdEncode = "";

    @C09CT("message_content_pb")
    public String messageContentPb = "";

    @C09CT("start_offsets")
    public List<Long> startOffsets = new ArrayList();

    @C09CT("end_offsets")
    public List<Long> endOffsets = new ArrayList();

    @C09CT("replay_stats")
    public String replayStats = "";
}
