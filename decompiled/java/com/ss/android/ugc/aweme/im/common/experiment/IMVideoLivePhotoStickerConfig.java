package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class IMVideoLivePhotoStickerConfig {

    @C09CT("animated_output_width")
    public final int animatedOutputWidth;

    @C09CT("cutout_wait_ms")
    public final long cutoutWaitMs;

    @C09CT("enable_image_auto_retry")
    public final boolean enableImageAutoRetry;

    @C09CT("mp4_bps")
    public final int mp4Bps;

    @C09CT("mp4_max_rate")
    public final long mp4MaxRate;

    @C09CT("skip_text_audit")
    public final boolean skipTextAudit;

    @C09CT("use_webp_for_animated")
    public final boolean useWebpForAnimated;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMVideoLivePhotoStickerConfig)) {
            return false;
        }
        IMVideoLivePhotoStickerConfig iMVideoLivePhotoStickerConfig = (IMVideoLivePhotoStickerConfig) obj;
        return this.cutoutWaitMs == iMVideoLivePhotoStickerConfig.cutoutWaitMs && this.skipTextAudit == iMVideoLivePhotoStickerConfig.skipTextAudit && this.animatedOutputWidth == iMVideoLivePhotoStickerConfig.animatedOutputWidth && this.useWebpForAnimated == iMVideoLivePhotoStickerConfig.useWebpForAnimated && this.mp4Bps == iMVideoLivePhotoStickerConfig.mp4Bps && this.mp4MaxRate == iMVideoLivePhotoStickerConfig.mp4MaxRate && this.enableImageAutoRetry == iMVideoLivePhotoStickerConfig.enableImageAutoRetry;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.cutoutWaitMs) * 31) + C786410Ut5.Z2(this.skipTextAudit)) * 31) + this.animatedOutputWidth) * 31) + C786410Ut5.Z2(this.useWebpForAnimated)) * 31) + this.mp4Bps) * 31) + C786410Ut5.Y2(this.mp4MaxRate)) * 31) + C786410Ut5.Z2(this.enableImageAutoRetry);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVideoLivePhotoStickerConfig(cutoutWaitMs=");
        sbLIZ.append(this.cutoutWaitMs);
        sbLIZ.append(", skipTextAudit=");
        sbLIZ.append(this.skipTextAudit);
        sbLIZ.append(", animatedOutputWidth=");
        sbLIZ.append(this.animatedOutputWidth);
        sbLIZ.append(", useWebpForAnimated=");
        sbLIZ.append(this.useWebpForAnimated);
        sbLIZ.append(", mp4Bps=");
        sbLIZ.append(this.mp4Bps);
        sbLIZ.append(", mp4MaxRate=");
        sbLIZ.append(this.mp4MaxRate);
        sbLIZ.append(", enableImageAutoRetry=");
        sbLIZ.append(this.enableImageAutoRetry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMVideoLivePhotoStickerConfig() {
        this(200L, false, 480, true, 3000000, 3500000L, false);
    }

    public IMVideoLivePhotoStickerConfig(long j, boolean z, int i, boolean z2, int i2, long j2, boolean z3) {
        this.cutoutWaitMs = j;
        this.skipTextAudit = z;
        this.animatedOutputWidth = i;
        this.useWebpForAnimated = z2;
        this.mp4Bps = i2;
        this.mp4MaxRate = j2;
        this.enableImageAutoRetry = z3;
    }
}
