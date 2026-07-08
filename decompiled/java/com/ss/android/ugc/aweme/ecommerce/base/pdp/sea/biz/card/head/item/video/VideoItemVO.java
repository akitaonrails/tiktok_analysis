package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class VideoItemVO {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("play_control")
    public final PlayControlConfig playControlConfig;

    @C09CT("recommend")
    public final RecommendData recommendData;

    @C09CT("type")
    public final String type;

    @C09CT("video")
    public final VideoData video;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItemVO)) {
            return false;
        }
        VideoItemVO videoItemVO = (VideoItemVO) obj;
        return Intrinsics.LJFF(this.video, videoItemVO.video) && Intrinsics.LJFF(this.recommendData, videoItemVO.recommendData) && Intrinsics.LJFF(this.daInfo, videoItemVO.daInfo) && Intrinsics.LJFF(this.playControlConfig, videoItemVO.playControlConfig) && Intrinsics.LJFF(this.type, videoItemVO.type);
    }

    public VideoItemVO(VideoData videoData, RecommendData recommendData, String str, PlayControlConfig playControlConfig, String str2) {
        this.video = videoData;
        this.recommendData = recommendData;
        this.daInfo = str;
        this.playControlConfig = playControlConfig;
        this.type = str2;
    }
}
