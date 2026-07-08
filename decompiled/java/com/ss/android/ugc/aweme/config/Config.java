package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class Config {

    @C09CT("image_load_duration")
    public final int imageLoadDurationMs;

    @C09CT("image_load_failed_count")
    public final int imageLoadFailedCount;

    @C09CT("video_play_duration")
    public final int videoPlayDuration;

    public Config() {
        this(0, LivePreCreateNextRoomPlayer.ENABLE, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(imageLoadFailedCount=");
        sbLIZ.append(this.imageLoadFailedCount);
        sbLIZ.append(", imageLoadDurationMs=");
        sbLIZ.append(this.imageLoadDurationMs);
        sbLIZ.append(", videoPlayDuration=");
        sbLIZ.append(this.videoPlayDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Config(int i, int i2, int i3) {
        this.imageLoadFailedCount = i;
        this.imageLoadDurationMs = i2;
        this.videoPlayDuration = i3;
    }
}
