package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CreateMobileEffectRequestV3 {

    @C09CT("activity_id")
    public final String activityId;

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

    @C09CT("icon_list")
    public final List<Icon> iconList;

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

    public CreateMobileEffectRequestV3(Long l, String str, List<Icon> list, String str2, String str3, Long l2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.customAppEffectId = l;
        this.name = str;
        this.iconList = list;
        this.effectFileKey = str2;
        this.templateId = str3;
        this.parentAppEffectId = l2;
        this.fileChecksum = str4;
        this.uploadType = str5;
        this.openglEsVersion = str6;
        this.devicePlatform = str7;
        this.hint = str8;
        this.iconAssetId = str9;
        this.activityId = str10;
        this.iconFileKey = str11;
    }
}
