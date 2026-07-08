package com.ss.android.ugc.aweme.services.editeffect.model;

import X.EnumC1429610nJ1;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class EditEffectAnchorInfo {
    public final List<EditEffectReuseDetails> details;
    public Effect effect;
    public final String effectId;
    public final EnumC1429610nJ1 effectType;

    public final void setEffect(Effect effect) {
        this.effect = effect;
    }

    public EditEffectAnchorInfo(String str, List<EditEffectReuseDetails> list, Effect effect, EnumC1429610nJ1 enumC1429610nJ1) {
        this.effectId = str;
        this.details = list;
        this.effect = effect;
        this.effectType = enumC1429610nJ1;
    }
}
