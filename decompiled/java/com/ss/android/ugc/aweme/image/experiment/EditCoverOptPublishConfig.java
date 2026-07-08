package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class EditCoverOptPublishConfig {

    @C09CT("enable_click_preview_area")
    public final boolean enableClickPreviewArea;

    @C09CT("enable_cover_crop")
    public final boolean enableCoverCrop;

    @C09CT("enable_edit_cover_in_preview")
    public final boolean enableEditCoverInPreview;

    @C09CT("enable_other_opt")
    public final boolean enableOtherOpt;

    @C09CT("enable_preview_cover")
    public final boolean enablePreviewCover;

    @C09CT("enable_upload_cover")
    public final boolean enableUploadCover;

    public EditCoverOptPublishConfig() {
        this(false, false, false, false, false, false);
    }

    public EditCoverOptPublishConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableUploadCover = z;
        this.enablePreviewCover = z2;
        this.enableEditCoverInPreview = z3;
        this.enableCoverCrop = z4;
        this.enableClickPreviewArea = z5;
        this.enableOtherOpt = z6;
    }
}
