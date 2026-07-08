package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C1446840nko;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class ProTemplateEffect extends Effect {
    public static final int $stable = 8;
    public int coverMainColorId;
    public final List<String> effectTypes;

    public final String getEffectPath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getUnzipPath());
        sbLIZ.append("/effect");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public List<String> getTypes() {
        ArrayList arrayList = new ArrayList(super.getTypes());
        List<String> list = this.effectTypes;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final int getCoverMainColorId() {
        return this.coverMainColorId;
    }

    public final void setCoverMainColorId(int i) {
        this.coverMainColorId = i;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect
    public void setTypes(List<String> list) {
        super.setTypes(list);
    }

    public ProTemplateEffect(Effect effect, List<String> list) {
        super(effect);
        this.effectTypes = list;
        C1446840nko.LJFF(this);
    }
}
