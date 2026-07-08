package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileEffectApiModel {

    @C09CT("effect")
    public final Effect effect;

    @C09CT("moderation_status")
    public final int moderationStatus;

    @C09CT("template_info")
    public final MobileEffectTemplateInfo templateInfo;

    public MobileEffectApiModel(Effect effect, int i, MobileEffectTemplateInfo mobileEffectTemplateInfo) {
        this.effect = effect;
        this.moderationStatus = i;
        this.templateInfo = mobileEffectTemplateInfo;
    }
}
