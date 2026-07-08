package com.ss.android.ugc.aweme.publish.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;

/* JADX INFO: loaded from: classes23.dex */
public class UploadAuthKeyConfig extends VideoCreation {

    @C09CT("aigc_arch_vod_auth_config")
    public AIGCArchVodAuthConfig AIGCArchVodAuthConfig;

    @C09CT("aigc_avatar_auth_config")
    public AIGCAvatarAuthConfig aigcAvatarAuthConfig;

    @C09CT("ai_remix_auth_config")
    public AutoCutAgentAuthConfig autoCutAgentAuthConfig;

    @C09CT("cloud_edit_upload_auth_config")
    public CloudEditUploadAuthConfig cloudEditUploadAuthConfig;

    @C09CT("current_region")
    public String currentRegion = "";

    @C09CT("custom_sticker_config")
    public UploadImageConfig customStickerConfig;

    @C09CT("custom_sticker_image_config")
    public UploadImageConfig customStickerImageConfig;

    @C09CT("vframe_config")
    public UploadImageConfig frameUploadConfig;

    @C09CT("img_config")
    public UploadImageConfig imgConfig;

    @C09CT("raw_photo_upload_config")
    public UploadImageConfig photoModeRawUploadConfig;

    @C09CT("photo_upload_config")
    public UploadImageConfig photoModeUploadConfig;

    @C09CT("save_time")
    public long saveTime;

    @C09CT("audio_config")
    public UploadAudioConfig uploadAudioConfig;

    @C09CT("settings_config")
    public UploadSettingConfig uploadSettingConfig;

    @C09CT("video_config")
    @InterfaceC2126708Uv
    public UploadVideoConfig videoConfig;

    @Override // com.ss.android.ugc.aweme.publish.model.VideoCreation, com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadAuthKeyConfig{videoConfig=");
        sbLIZ.append(this.videoConfig);
        sbLIZ.append(", uploadSettingConfig=");
        sbLIZ.append(this.uploadSettingConfig);
        sbLIZ.append(", imgConfig=");
        sbLIZ.append(this.imgConfig);
        sbLIZ.append(", frameUploadConfig=");
        sbLIZ.append(this.frameUploadConfig);
        sbLIZ.append(", uploadAudioConfig=");
        sbLIZ.append(this.uploadAudioConfig);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
