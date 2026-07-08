package com.ss.android.ugc.aweme.property.bytebench;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraLayoutDowngradeConfig {
    public static final int $stable = 0;

    @C09CT("camera_preview_width_123")
    public final int cameraPreviewWidth123;

    @C09CT("camera_preview_width_46")
    public final int cameraPreviewWidth46;

    @C09CT("camera_width_123")
    public final int cameraWidth123;

    @C09CT("camera_width_46")
    public final int cameraWidth46;

    @C09CT("max_grid_count")
    public final int maxGridCount;

    @C09CT("max_grid_count")
    public final int maxUploadGridCount;

    @C09CT("record_photo_compile_width")
    public final int recordPhotoCompileWidth;

    @C09CT("record_video_compile_width_123")
    public final int recordVideoCompileWidth123;

    @C09CT("record_video_compile_width_46")
    public final int recordVideoCompileWidth46;

    @C09CT("record_width_123")
    public final int recordWidth123;

    @C09CT("record_width_46")
    public final int recordWidth46;

    @C09CT("support_effect")
    public final boolean supportEffect;

    @C09CT("upload_cell_width_123")
    public final int uploadCellWidth123;

    @C09CT("upload_cell_width_46")
    public final int uploadCellWidth46;

    @C09CT("upload_compress_width_threshold")
    public final int uploadCompressWidthThreshold;

    @C09CT("upload_width_threshold")
    public final int uploadWidthThreshold;

    public CameraLayoutDowngradeConfig() {
        this(6, 6, true, 1080, 1080, 1080, 576, 720, 576, 720, 1080, 1080, 1440, 720, 576, 720);
    }

    public CameraLayoutDowngradeConfig(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.maxGridCount = i;
        this.maxUploadGridCount = i2;
        this.supportEffect = z;
        this.cameraWidth123 = i3;
        this.cameraWidth46 = i4;
        this.cameraPreviewWidth123 = i5;
        this.cameraPreviewWidth46 = i6;
        this.recordWidth123 = i7;
        this.recordWidth46 = i8;
        this.recordVideoCompileWidth123 = i9;
        this.recordVideoCompileWidth46 = i10;
        this.recordPhotoCompileWidth = i11;
        this.uploadWidthThreshold = i12;
        this.uploadCellWidth123 = i13;
        this.uploadCellWidth46 = i14;
        this.uploadCompressWidthThreshold = i15;
    }
}
