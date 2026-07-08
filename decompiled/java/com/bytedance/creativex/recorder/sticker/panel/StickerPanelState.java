package com.bytedance.creativex.recorder.sticker.panel;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerPanelState extends UiState {
    public final AbstractC194560119y ui;

    public final StickerPanelState copy(AbstractC194560119y abstractC194560119y) {
        return new StickerPanelState(abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerPanelState) && Intrinsics.LJFF(this.ui, ((StickerPanelState) obj).ui);
    }

    public int hashCode() {
        return this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerPanelState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerPanelState() {
        this(new C194561119z());
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public StickerPanelState(AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
    }
}
