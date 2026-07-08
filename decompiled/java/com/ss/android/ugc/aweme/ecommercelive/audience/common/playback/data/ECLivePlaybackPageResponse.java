package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;

/* JADX INFO: loaded from: classes27.dex */
public final class ECLivePlaybackPageResponse {

    @C09CT("live_room_info")
    public final ECLivePlaybackLiveRoomInfo liveRoomInfo;

    @C09CT("product_card")
    public final ECLivePlaybackProductCardInfo productCardInfo;

    @C09CT("server_time")
    public final Long serverTime;

    @C09CT("user_info")
    public final ECLivePlaybackUserInfo userInfo;

    @C09CT("video")
    public final PlaybackVideoPreviewStreamData video;

    @C09CT("video_play_conf")
    public final VideoPlayConfig videoPlayConfig;

    @C09CT("watch_live_button")
    public final ECLivePlaybackWatchLiveButton watchLiveButton;

    public ECLivePlaybackPageResponse() {
        this(null, null, null, null, null, null, null);
    }

    public ECLivePlaybackPageResponse(ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo, ECLivePlaybackUserInfo eCLivePlaybackUserInfo, ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton, PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData, VideoPlayConfig videoPlayConfig, ECLivePlaybackProductCardInfo eCLivePlaybackProductCardInfo, Long l) {
        this.liveRoomInfo = eCLivePlaybackLiveRoomInfo;
        this.userInfo = eCLivePlaybackUserInfo;
        this.watchLiveButton = eCLivePlaybackWatchLiveButton;
        this.video = playbackVideoPreviewStreamData;
        this.videoPlayConfig = videoPlayConfig;
        this.productCardInfo = eCLivePlaybackProductCardInfo;
        this.serverTime = l;
    }
}
