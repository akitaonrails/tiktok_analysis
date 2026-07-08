package com.ss.android.ugc.aweme.image.preview;

import X.AbstractC194560119y;
import X.C2188811AlT;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageEditPreviewState extends UiState {
    public static final int $stable = 8;
    public final Boolean captionStatus;
    public final AbstractC194560119y ui;

    public final ImageEditPreviewState copy(AbstractC194560119y abstractC194560119y, Boolean bool) {
        return new ImageEditPreviewState(abstractC194560119y, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageEditPreviewState)) {
            return false;
        }
        ImageEditPreviewState imageEditPreviewState = (ImageEditPreviewState) obj;
        return Intrinsics.LJFF(this.ui, imageEditPreviewState.ui) && Intrinsics.LJFF(this.captionStatus, imageEditPreviewState.captionStatus);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        Boolean bool = this.captionStatus;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageEditPreviewState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", captionStatus=");
        sbLIZ.append(this.captionStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getCaptionStatus() {
        return this.captionStatus;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public ImageEditPreviewState(AbstractC194560119y abstractC194560119y, Boolean bool) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.captionStatus = bool;
    }
}
