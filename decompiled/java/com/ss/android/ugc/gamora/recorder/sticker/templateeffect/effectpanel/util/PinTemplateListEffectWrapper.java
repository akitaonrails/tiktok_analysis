package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.util;

import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PinTemplateListEffectWrapper extends Effect {
    public static final int $stable = 8;
    public final Effect effect;

    public final PinTemplateListEffectWrapper copy(Effect effect) {
        return new PinTemplateListEffectWrapper(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinTemplateListEffectWrapper) && Intrinsics.LJFF(this.effect, ((PinTemplateListEffectWrapper) obj).effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public int hashCode() {
        return this.effect.hashCode();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinTemplateListEffectWrapper(effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public PinTemplateListEffectWrapper(Effect effect) {
        super(effect);
        this.effect = effect;
    }
}
