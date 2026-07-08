package com.ss.android.ugc.gamora.recorder.sticker.optionlist;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionPanelState extends UiState {
    public static final int $stable = 8;
    public final Effect effect;
    public final boolean isBottomSheetVisible;
    public final AbstractC194560119y ui;

    public OptionPanelState() {
        this(new C194561119z(), null, false);
    }

    public final OptionPanelState copy(AbstractC194560119y abstractC194560119y, Effect effect, boolean z) {
        return new OptionPanelState(abstractC194560119y, effect, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionPanelState)) {
            return false;
        }
        OptionPanelState optionPanelState = (OptionPanelState) obj;
        return Intrinsics.LJFF(this.ui, optionPanelState.ui) && Intrinsics.LJFF(this.effect, optionPanelState.effect) && this.isBottomSheetVisible == optionPanelState.isBottomSheetVisible;
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        Effect effect = this.effect;
        return ((iHashCode + (effect == null ? 0 : effect.hashCode())) * 31) + C786410Ut5.Z2(this.isBottomSheetVisible);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptionPanelState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", isBottomSheetVisible=");
        sbLIZ.append(this.isBottomSheetVisible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final boolean isBottomSheetVisible() {
        return this.isBottomSheetVisible;
    }

    public OptionPanelState(AbstractC194560119y abstractC194560119y, Effect effect, boolean z) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.effect = effect;
        this.isBottomSheetVisible = z;
    }
}
