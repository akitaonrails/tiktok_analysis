package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoModerationResponseItem {
    public static final int $stable = 0;

    @C09CT("block_download")
    public final boolean blockDownload;

    @C09CT("block_watermark")
    public final boolean blockWatermark;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("type")
    public final int type;

    @C09CT("watermark_moderation")
    public final WaterMarkModerationModel waterMarkModerationModel;

    public VideoModerationResponseItem(int i, int i2, WaterMarkModerationModel waterMarkModerationModel, boolean z, boolean z2) {
        this.type = i;
        this.status = i2;
        this.waterMarkModerationModel = waterMarkModerationModel;
        this.blockDownload = z;
        this.blockWatermark = z2;
    }
}
