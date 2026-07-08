package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcSvShouldPhotoModeShowSecondLineModel {

    @C09CT("ec_photo_metadata_api_call_delay_sec")
    public final int delayCallSec;

    @C09CT("ec_photo_anchor_show_subtitle_delay")
    public final int delayShowSubtitle;

    @C09CT("enable")
    public final boolean enable;

    public EcSvShouldPhotoModeShowSecondLineModel() {
        this(2, 1, false);
    }

    public EcSvShouldPhotoModeShowSecondLineModel(int i, int i2, boolean z) {
        this.delayShowSubtitle = i;
        this.delayCallSec = i2;
        this.enable = z;
    }
}
