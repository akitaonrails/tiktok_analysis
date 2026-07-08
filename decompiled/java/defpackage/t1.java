package defpackage;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes33.dex */
public final class t1 {
    public static final EcSvShouldEnablePhotoModeUiRevampV1Model LIZ = new EcSvShouldEnablePhotoModeUiRevampV1Model(new EcSvShouldPhotoModeShowSecondLineModel(2, 1, false), false);

    public static final boolean LIZ() {
        return LIZIZ().ecSvShouldPhotoModeShowImgCover;
    }

    public static final EcSvShouldEnablePhotoModeUiRevampV1Model LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSvShouldEnablePhotoModeUiRevampV1Model ecSvShouldEnablePhotoModeUiRevampV1Model = LIZ;
        EcSvShouldEnablePhotoModeUiRevampV1Model ecSvShouldEnablePhotoModeUiRevampV1Model2 = (EcSvShouldEnablePhotoModeUiRevampV1Model) settingsManagerLIZLLL.LJIIIIZZ("ec_sv_should_enable_photo_mode_ui_revamp_v1", EcSvShouldEnablePhotoModeUiRevampV1Model.class, ecSvShouldEnablePhotoModeUiRevampV1Model);
        return ecSvShouldEnablePhotoModeUiRevampV1Model2 != null ? ecSvShouldEnablePhotoModeUiRevampV1Model2 : ecSvShouldEnablePhotoModeUiRevampV1Model;
    }
}
