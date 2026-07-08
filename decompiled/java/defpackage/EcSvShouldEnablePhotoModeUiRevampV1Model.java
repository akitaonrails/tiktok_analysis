package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcSvShouldEnablePhotoModeUiRevampV1Model {

    @C09CT("ec_sv_should_photo_mode_show_img_cover")
    public final boolean ecSvShouldPhotoModeShowImgCover;

    @C09CT("ec_sv_should_photo_mode_show_second_line")
    public final EcSvShouldPhotoModeShowSecondLineModel ecSvShouldPhotoModeShowSecondLine;

    public EcSvShouldEnablePhotoModeUiRevampV1Model() {
        this(new EcSvShouldPhotoModeShowSecondLineModel(2, 1, false), false);
    }

    public EcSvShouldEnablePhotoModeUiRevampV1Model(EcSvShouldPhotoModeShowSecondLineModel ecSvShouldPhotoModeShowSecondLineModel, boolean z) {
        this.ecSvShouldPhotoModeShowSecondLine = ecSvShouldPhotoModeShowSecondLineModel;
        this.ecSvShouldPhotoModeShowImgCover = z;
    }
}
