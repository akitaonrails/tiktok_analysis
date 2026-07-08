package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DeleteMobileEffectRequestV2 {

    @C09CT("custom_app_effect_id")
    public final Long customAppEffectId;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("effect_source")
    public final Integer effectSource;

    public DeleteMobileEffectRequestV2(Long l, String str, Integer num) {
        this.customAppEffectId = l;
        this.effectId = str;
        this.effectSource = num;
    }
}
