package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class EditCoverCropAndPreviewConfig {

    @C09CT("enable_cover_crop_2")
    public final boolean enableCoverCrop2;

    @C09CT("enable_preview_cover_2")
    public final boolean enablePreviewCover2;

    public EditCoverCropAndPreviewConfig() {
        this(false, false);
    }

    public EditCoverCropAndPreviewConfig(boolean z, boolean z2) {
        this.enablePreviewCover2 = z;
        this.enableCoverCrop2 = z2;
    }
}
