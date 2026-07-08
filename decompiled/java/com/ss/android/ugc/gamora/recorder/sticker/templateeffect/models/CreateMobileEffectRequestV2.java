package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CreateMobileEffectRequestV2 {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("aigc_effect_extra")
    public final AigcEffectExtra aigcEffectExtra;

    @C09CT("custom_app_effect_id")
    public final Long customAppEffectId;

    @C09CT("device_platform")
    public final String devicePlatform;

    @C09CT("effect_file_key")
    public final String effectFileKey;

    @C09CT("file_checksum")
    public final String fileChecksum;

    @C09CT("hint")
    public final String hint;

    @C09CT("icon_asset_id")
    public final String iconAssetId;

    @C09CT("icon_file_key")
    public final String iconFileKey;

    @C09CT("name")
    public final String name;

    @C09CT("opengl_es_version")
    public final String openglEsVersion;

    @C09CT("parent_app_effect_id")
    public final Long parentAppEffectId;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("upload_type")
    public final String uploadType;

    public CreateMobileEffectRequestV2(Long l, String str, String str2, String str3, String str4, Long l2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, AigcEffectExtra aigcEffectExtra) {
        this.customAppEffectId = l;
        this.name = str;
        this.iconFileKey = str2;
        this.effectFileKey = str3;
        this.templateId = str4;
        this.parentAppEffectId = l2;
        this.fileChecksum = str5;
        this.uploadType = str6;
        this.openglEsVersion = str7;
        this.devicePlatform = str8;
        this.hint = str9;
        this.iconAssetId = str10;
        this.activityId = str11;
        this.aigcEffectExtra = aigcEffectExtra;
    }
}
