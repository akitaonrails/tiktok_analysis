package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import X.AbstractC194560119y;
import X.C0LCS;
import X.C122H;
import X.C1644450stX;
import X.C194561119z;
import X.C2188811AlT;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditInfoStickerState extends UiState {
    public static final int $stable = 8;
    public final C0LCS<StickerItemModel> clickStickerItemEvent;
    public final C1644450stX<Float, Long> editViewAnimEvent;
    public final C122H<Float, Float, Float> editViewLayoutEvent;
    public final C529150Kp7 hideHelpBoxEvent;
    public final C529150Kp7 refreshVideoSource;
    public final C1644450stX<Integer, Integer> resetVideoLengthEvent;
    public final AbstractC194560119y ui;

    public FTCEditInfoStickerState() {
        this(new C194561119z(), null, null, null, null, null, null);
    }

    public final FTCEditInfoStickerState copy(AbstractC194560119y abstractC194560119y, C529150Kp7 c529150Kp7, C1644450stX<Integer, Integer> c1644450stX, C0LCS<? extends StickerItemModel> c0lcs, C1644450stX<Float, Long> c1644450stX2, C122H<Float, Float, Float> c122h, C529150Kp7 c529150Kp72) {
        return new FTCEditInfoStickerState(abstractC194560119y, c529150Kp7, c1644450stX, c0lcs, c1644450stX2, c122h, c529150Kp72);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditInfoStickerState)) {
            return false;
        }
        FTCEditInfoStickerState fTCEditInfoStickerState = (FTCEditInfoStickerState) obj;
        return Intrinsics.LJFF(this.ui, fTCEditInfoStickerState.ui) && Intrinsics.LJFF(this.hideHelpBoxEvent, fTCEditInfoStickerState.hideHelpBoxEvent) && Intrinsics.LJFF(this.resetVideoLengthEvent, fTCEditInfoStickerState.resetVideoLengthEvent) && Intrinsics.LJFF(this.clickStickerItemEvent, fTCEditInfoStickerState.clickStickerItemEvent) && Intrinsics.LJFF(this.editViewAnimEvent, fTCEditInfoStickerState.editViewAnimEvent) && Intrinsics.LJFF(this.editViewLayoutEvent, fTCEditInfoStickerState.editViewLayoutEvent) && Intrinsics.LJFF(this.refreshVideoSource, fTCEditInfoStickerState.refreshVideoSource);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        C529150Kp7 c529150Kp7 = this.hideHelpBoxEvent;
        int iHashCode2 = (iHashCode + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C1644450stX<Integer, Integer> c1644450stX = this.resetVideoLengthEvent;
        int iHashCode3 = (iHashCode2 + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C0LCS<StickerItemModel> c0lcs = this.clickStickerItemEvent;
        int iHashCode4 = (iHashCode3 + (c0lcs == null ? 0 : c0lcs.hashCode())) * 31;
        C1644450stX<Float, Long> c1644450stX2 = this.editViewAnimEvent;
        int iHashCode5 = (iHashCode4 + (c1644450stX2 == null ? 0 : c1644450stX2.hashCode())) * 31;
        C122H<Float, Float, Float> c122h = this.editViewLayoutEvent;
        int iHashCode6 = (iHashCode5 + (c122h == null ? 0 : c122h.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.refreshVideoSource;
        return iHashCode6 + (c529150Kp72 != null ? c529150Kp72.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditInfoStickerState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", hideHelpBoxEvent=");
        sbLIZ.append(this.hideHelpBoxEvent);
        sbLIZ.append(", resetVideoLengthEvent=");
        sbLIZ.append(this.resetVideoLengthEvent);
        sbLIZ.append(", clickStickerItemEvent=");
        sbLIZ.append(this.clickStickerItemEvent);
        sbLIZ.append(", editViewAnimEvent=");
        sbLIZ.append(this.editViewAnimEvent);
        sbLIZ.append(", editViewLayoutEvent=");
        sbLIZ.append(this.editViewLayoutEvent);
        sbLIZ.append(", refreshVideoSource=");
        sbLIZ.append(this.refreshVideoSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0LCS<StickerItemModel> getClickStickerItemEvent() {
        return this.clickStickerItemEvent;
    }

    public final C1644450stX<Float, Long> getEditViewAnimEvent() {
        return this.editViewAnimEvent;
    }

    public final C122H<Float, Float, Float> getEditViewLayoutEvent() {
        return this.editViewLayoutEvent;
    }

    public final C529150Kp7 getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final C529150Kp7 getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    public final C1644450stX<Integer, Integer> getResetVideoLengthEvent() {
        return this.resetVideoLengthEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditInfoStickerState(AbstractC194560119y abstractC194560119y, C529150Kp7 c529150Kp7, C1644450stX<Integer, Integer> c1644450stX, C0LCS<? extends StickerItemModel> c0lcs, C1644450stX<Float, Long> c1644450stX2, C122H<Float, Float, Float> c122h, C529150Kp7 c529150Kp72) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.hideHelpBoxEvent = c529150Kp7;
        this.resetVideoLengthEvent = c1644450stX;
        this.clickStickerItemEvent = c0lcs;
        this.editViewAnimEvent = c1644450stX2;
        this.editViewLayoutEvent = c122h;
        this.refreshVideoSource = c529150Kp72;
    }
}
