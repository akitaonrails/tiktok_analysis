package com.ss.android.ugc.aweme.image.adjust;

import X.AbstractC194560119y;
import X.C2188811AlT;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageAdjustState extends UiState {
    public static final int $stable = 8;
    public final SingleImageData data;
    public final AbstractC194560119y ui;

    public final ImageAdjustState copy(AbstractC194560119y abstractC194560119y, SingleImageData singleImageData) {
        return new ImageAdjustState(abstractC194560119y, singleImageData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageAdjustState)) {
            return false;
        }
        ImageAdjustState imageAdjustState = (ImageAdjustState) obj;
        return Intrinsics.LJFF(this.ui, imageAdjustState.ui) && Intrinsics.LJFF(this.data, imageAdjustState.data);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        SingleImageData singleImageData = this.data;
        return iHashCode + (singleImageData == null ? 0 : singleImageData.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageAdjustState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SingleImageData getData() {
        return this.data;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public ImageAdjustState(AbstractC194560119y abstractC194560119y, SingleImageData singleImageData) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.data = singleImageData;
    }
}
