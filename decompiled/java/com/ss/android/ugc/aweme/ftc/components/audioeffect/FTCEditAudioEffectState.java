package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditAudioEffectState extends UiState {
    public static final int $stable = 8;
    public final C529150Kp7 clearAudioEffect;
    public final AbstractC194560119y ui;

    public FTCEditAudioEffectState() {
        this(null, new C194561119z());
    }

    public final FTCEditAudioEffectState copy(C529150Kp7 c529150Kp7, AbstractC194560119y abstractC194560119y) {
        return new FTCEditAudioEffectState(c529150Kp7, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditAudioEffectState)) {
            return false;
        }
        FTCEditAudioEffectState fTCEditAudioEffectState = (FTCEditAudioEffectState) obj;
        return Intrinsics.LJFF(this.clearAudioEffect, fTCEditAudioEffectState.clearAudioEffect) && Intrinsics.LJFF(this.ui, fTCEditAudioEffectState.ui);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.clearAudioEffect;
        return ((c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditAudioEffectState(clearAudioEffect=");
        sbLIZ.append(this.clearAudioEffect);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getClearAudioEffect() {
        return this.clearAudioEffect;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public FTCEditAudioEffectState(C529150Kp7 c529150Kp7, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.clearAudioEffect = c529150Kp7;
        this.ui = abstractC194560119y;
    }
}
