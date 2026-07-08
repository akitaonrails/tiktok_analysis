package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import X.C538540LAe;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class DMCameraSettingsConfig implements Serializable {

    @C09CT("album_select_config")
    public final DMAlbumSelectConfig albumConfig;

    @C09CT("image_bg_upload_config")
    public final DMBDImageUploadConfig imageBDConfig;

    @C09CT("record_page_config")
    public final DMRecordPageConfig recordPageConfig;

    @C09CT("video_bg_upload_config")
    public final DMBDVideoUploadConfig videoBDConfig;

    public DMCameraSettingsConfig() {
        this(new DMBDImageUploadConfig(2, 10, 1, 2, 5, 1, -1), new DMBDVideoUploadConfig(2, 1, 40, 524288, 2, 30, 6, 40, 10000, 1, 1, 0, true), new DMAlbumSelectConfig(9, C538540LAe.LLJJJIL, 2), new DMRecordPageConfig(3));
    }

    public DMCameraSettingsConfig(DMBDImageUploadConfig dMBDImageUploadConfig, DMBDVideoUploadConfig dMBDVideoUploadConfig, DMAlbumSelectConfig dMAlbumSelectConfig, DMRecordPageConfig dMRecordPageConfig) {
        this.imageBDConfig = dMBDImageUploadConfig;
        this.videoBDConfig = dMBDVideoUploadConfig;
        this.albumConfig = dMAlbumSelectConfig;
        this.recordPageConfig = dMRecordPageConfig;
    }
}
