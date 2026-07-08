package com.ss.android.ugc.aweme.feed.features.model;

import X.C09CT;
import X.C2252021DCm;
import X.C558502Fr;
import com.ss.android.ugc.aweme.feed.model.live.HotReloadFeedParams;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class SessionFeatureItem {
    public String LIZ;
    public transient List<C558502Fr> LIZIZ;
    public transient HotReloadFeedParams LIZJ;

    @C09CT("ad_id")
    public Long adId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String awemeId;

    @C09CT("aweme_type")
    public Integer awemeType;

    @C09CT("block_count")
    public Integer blockCount;

    @C09CT("block_duration")
    public Long blockDuration;

    @C09CT("creative_id")
    public Long creativeId;

    @C09CT("day_r_num")
    public int dayRNum;

    @C09CT("day_v_num")
    public int dayVNum;

    @C09CT("dynamic_features")
    public final HashMap<String, Object> dynamicFeatures;

    @C09CT("first_frame_duration")
    public Long firstFrameDuration;

    @C09CT("is_ad")
    public Boolean isAd;

    @C09CT("is_ad_click")
    public boolean isAdClick;

    @C09CT("is_bytevc")
    public Boolean isBytevc1;

    @C09CT("is_click_comment")
    public Boolean isClickComment;

    @C09CT("is_commented")
    public Boolean isCommentted;

    @C09CT("is_disliked")
    public Boolean isDisliked;

    @C09CT("is_ecom")
    public Boolean isEcom;

    @C09CT("is_enter_music")
    public Boolean isEnterMusic;

    @C09CT("is_enter_profile")
    public boolean isEnterUserProfile;

    @C09CT("is_favorite")
    public Boolean isFavorite;

    @C09CT("is_follow")
    public Boolean isFollow;

    @C09CT("is_like")
    public Boolean isLike;

    @C09CT("is_live")
    public Boolean isLive;

    @C09CT("is_finished")
    public boolean isPlayFinished;

    @C09CT("is_reported")
    public Boolean isReported;

    @C09CT("is_share")
    public Boolean isShare;

    @C09CT("is_survey_liked")
    public Boolean isSurveyLiked;

    @C09CT("is_survey_notliked")
    public Boolean isSurveyNotLiked;

    @C09CT("is_survey_showed")
    public Boolean isSurveyShowed;

    @C09CT("log_id")
    public String logId;

    @C09CT("play_time_cur_live")
    public long playTimeCurLiveRoom;

    @C09CT("play_time_live_room")
    public long playTimeLiveRoom;

    @C09CT("play_time_max")
    public Long playTimeMax;

    @C09CT("play_time_max_v2")
    public long playTimeMaxV2;

    @C09CT("play_time_sum")
    public long playTimeSum;

    @C09CT("play_time_sum_v2")
    public long playTimeSumV2;

    @C09CT("session_r_num")
    public int sessionRNum;

    @C09CT("session_v_num")
    public int sessionVNum;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("video_bitrate")
    public long videoBitrate;

    @C09CT("video_duration")
    public Integer videoDuration;

    @C09CT("video_resolution")
    public String videoResolution;

    @C09CT("start_time_stamp")
    public Long videoStartTimestamp;

    @C09CT("vv")
    public int vv;

    public SessionFeatureItem() {
        this("");
    }

    public SessionFeatureItem(String str) {
        this.awemeId = str;
        this.sessionVNum = -1;
        this.sessionRNum = -1;
        this.dayVNum = -1;
        this.dayRNum = -1;
        this.blockCount = -1;
        this.blockDuration = 0L;
        this.videoResolution = "";
        this.LIZIZ = new ArrayList();
        this.dynamicFeatures = new HashMap<>();
        if (C2252021DCm.LJIIJJI) {
            this.isDisliked = Boolean.FALSE;
        }
        if (C2252021DCm.LJIIIZ) {
            this.isFavorite = Boolean.FALSE;
        }
        if (C2252021DCm.LJIIL) {
            this.isReported = Boolean.FALSE;
        }
        if (C2252021DCm.LJIIJ) {
            this.isShare = Boolean.FALSE;
        }
        if (C2252021DCm.LJ) {
            this.vv = 0;
        }
        if (C2252021DCm.LIZLLL) {
            this.videoDuration = 0;
        }
        if (C2252021DCm.LJI) {
            this.isFollow = Boolean.FALSE;
        }
        if (C2252021DCm.LJIIIIZZ) {
            this.isLike = Boolean.FALSE;
        }
        if (C2252021DCm.LIZ().enable_is_enter_music) {
            this.isEnterMusic = Boolean.FALSE;
        }
        if (C2252021DCm.LIZ().enable_is_click_comment) {
            this.isClickComment = Boolean.FALSE;
        }
        if (C2252021DCm.LIZ().enable_is_commentted) {
            this.isCommentted = Boolean.FALSE;
        }
    }
}
