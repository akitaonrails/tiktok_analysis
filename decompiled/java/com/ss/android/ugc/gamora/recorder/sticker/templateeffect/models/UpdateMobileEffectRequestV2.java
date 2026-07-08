package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class UpdateMobileEffectRequestV2 {

    @C09CT("custom_app_effect_id")
    public final Long customAppEffectId;

    @C09CT("effect_source")
    public final Integer effectSource;

    @C09CT("icon_file_key")
    public final String iconFileKey;

    @C09CT("name")
    public final String name;

    public UpdateMobileEffectRequestV2(Long l, String str, String str2, Integer num) {
        this.customAppEffectId = l;
        this.name = str;
        this.iconFileKey = str2;
        this.effectSource = num;
    }
}
