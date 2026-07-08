package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PushModerationModel {
    public static final int $stable = 0;

    @C09CT("block_download")
    public final boolean blockDownload;

    @C09CT("block_watermark")
    public final boolean blockWatermark;

    @C09CT("frame_id")
    public final String frameId;

    @C09CT("pass")
    public final boolean result;

    public final boolean getBlockDownload() {
        return this.blockDownload;
    }

    public final boolean getBlockWatermark() {
        return this.blockWatermark;
    }

    public final String getFrameId() {
        return this.frameId;
    }

    public final boolean getResult() {
        return this.result;
    }

    public PushModerationModel(String str, boolean z, boolean z2, boolean z3) {
        this.frameId = str;
        this.result = z;
        this.blockDownload = z2;
        this.blockWatermark = z3;
    }
}
