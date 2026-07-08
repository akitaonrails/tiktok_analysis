package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C01GW;
import X.C1446720nkc;
import X.C1446840nko;
import X.C20012313Rx;
import X.C201955140j;
import X.C2188811AlT;
import X.C452501pT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MobileEffectTemplateEffect extends Effect {
    public final Effect effect;
    public final List<String> effectTypes;
    public final C01GW isAMETemplate$delegate;
    public static final C1446720nkc Companion = new Object() { // from class: X.0nkc
    };
    public static final int $stable = 8;

    public final MobileEffectTemplateEffect copy(Effect effect, List<String> list) {
        return new MobileEffectTemplateEffect(effect, list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectTemplateEffect)) {
            return false;
        }
        MobileEffectTemplateEffect mobileEffectTemplateEffect = (MobileEffectTemplateEffect) obj;
        return Intrinsics.LJFF(this.effect, mobileEffectTemplateEffect.effect) && Intrinsics.LJFF(this.effectTypes, mobileEffectTemplateEffect.effectTypes);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public int hashCode() {
        int iHashCode = this.effect.hashCode() * 31;
        List<String> list = this.effectTypes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectTemplateEffect(effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", effectTypes=");
        sbLIZ.append(this.effectTypes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isAMETemplate() {
        return ((Boolean) this.isAMETemplate$delegate.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public List<String> getTypes() {
        if (!C1446840nko.LJ(this)) {
            return super.getTypes();
        }
        ArrayList arrayList = new ArrayList(super.getTypes());
        List<String> list = this.effectTypes;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public void setTypes(List<String> list) {
        if (!C1446840nko.LJ(this)) {
            super.setTypes(list);
        }
    }

    public MobileEffectTemplateEffect(Effect effect, List<String> list) {
        super(effect);
        this.effect = effect;
        this.effectTypes = list;
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init {");
        sbLIZ.append(getName());
        sbLIZ.append('}');
        C201955140j.LIZLLL(c20012313Rx, "MobileEffectTemplateEffect", C2188811AlT.LIZIZ(sbLIZ));
        C1446840nko.LJFF(this);
        this.isAMETemplate$delegate = C452501pT.LIZIZ(new AwS566S0100000_22(this, 801));
    }
}
