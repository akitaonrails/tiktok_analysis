package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import X.AbstractC194560119y;
import X.C122H;
import X.C1644450stX;
import X.C194561119z;
import X.C2188811AlT;
import X.C529130Kp5;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditStickerState extends UiState {
    public static final int $stable = 8;
    public final C1644450stX<Float, Long> pollTextAnimEvent;
    public final C122H<Float, Float, Float> pollTextLayoutEvent;
    public final C529150Kp7 refreshVideoSource;
    public final AbstractC194560119y ui;
    public final C1644450stX<Integer, Boolean> updateStickerTime;
    public final C1644450stX<Integer, Integer> videoLengthUpdateEvent;
    public final C529130Kp5 viewRenderStickerVisibleEvent;

    public FTCEditStickerState() {
        this(new C194561119z(), null, null, null, null, null, null);
    }

    public final FTCEditStickerState copy(AbstractC194560119y abstractC194560119y, C1644450stX<Float, Long> c1644450stX, C122H<Float, Float, Float> c122h, C529130Kp5 c529130Kp5, C1644450stX<Integer, Integer> c1644450stX2, C529150Kp7 c529150Kp7, C1644450stX<Integer, Boolean> c1644450stX3) {
        return new FTCEditStickerState(abstractC194560119y, c1644450stX, c122h, c529130Kp5, c1644450stX2, c529150Kp7, c1644450stX3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditStickerState)) {
            return false;
        }
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return Intrinsics.LJFF(this.ui, fTCEditStickerState.ui) && Intrinsics.LJFF(this.pollTextAnimEvent, fTCEditStickerState.pollTextAnimEvent) && Intrinsics.LJFF(this.pollTextLayoutEvent, fTCEditStickerState.pollTextLayoutEvent) && Intrinsics.LJFF(this.viewRenderStickerVisibleEvent, fTCEditStickerState.viewRenderStickerVisibleEvent) && Intrinsics.LJFF(this.videoLengthUpdateEvent, fTCEditStickerState.videoLengthUpdateEvent) && Intrinsics.LJFF(this.refreshVideoSource, fTCEditStickerState.refreshVideoSource) && Intrinsics.LJFF(this.updateStickerTime, fTCEditStickerState.updateStickerTime);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        C1644450stX<Float, Long> c1644450stX = this.pollTextAnimEvent;
        int iHashCode2 = (iHashCode + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C122H<Float, Float, Float> c122h = this.pollTextLayoutEvent;
        int iHashCode3 = (iHashCode2 + (c122h == null ? 0 : c122h.hashCode())) * 31;
        C529130Kp5 c529130Kp5 = this.viewRenderStickerVisibleEvent;
        int iHashCode4 = (iHashCode3 + (c529130Kp5 == null ? 0 : c529130Kp5.hashCode())) * 31;
        C1644450stX<Integer, Integer> c1644450stX2 = this.videoLengthUpdateEvent;
        int iHashCode5 = (iHashCode4 + (c1644450stX2 == null ? 0 : c1644450stX2.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.refreshVideoSource;
        int iHashCode6 = (iHashCode5 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C1644450stX<Integer, Boolean> c1644450stX3 = this.updateStickerTime;
        return iHashCode6 + (c1644450stX3 != null ? c1644450stX3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditStickerState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", pollTextAnimEvent=");
        sbLIZ.append(this.pollTextAnimEvent);
        sbLIZ.append(", pollTextLayoutEvent=");
        sbLIZ.append(this.pollTextLayoutEvent);
        sbLIZ.append(", viewRenderStickerVisibleEvent=");
        sbLIZ.append(this.viewRenderStickerVisibleEvent);
        sbLIZ.append(", videoLengthUpdateEvent=");
        sbLIZ.append(this.videoLengthUpdateEvent);
        sbLIZ.append(", refreshVideoSource=");
        sbLIZ.append(this.refreshVideoSource);
        sbLIZ.append(", updateStickerTime=");
        sbLIZ.append(this.updateStickerTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1644450stX<Float, Long> getPollTextAnimEvent() {
        return this.pollTextAnimEvent;
    }

    public final C122H<Float, Float, Float> getPollTextLayoutEvent() {
        return this.pollTextLayoutEvent;
    }

    public final C529150Kp7 getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final C1644450stX<Integer, Boolean> getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    public final C1644450stX<Integer, Integer> getVideoLengthUpdateEvent() {
        return this.videoLengthUpdateEvent;
    }

    public final C529130Kp5 getViewRenderStickerVisibleEvent() {
        return this.viewRenderStickerVisibleEvent;
    }

    public FTCEditStickerState(AbstractC194560119y abstractC194560119y, C1644450stX<Float, Long> c1644450stX, C122H<Float, Float, Float> c122h, C529130Kp5 c529130Kp5, C1644450stX<Integer, Integer> c1644450stX2, C529150Kp7 c529150Kp7, C1644450stX<Integer, Boolean> c1644450stX3) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.pollTextAnimEvent = c1644450stX;
        this.pollTextLayoutEvent = c122h;
        this.viewRenderStickerVisibleEvent = c529130Kp5;
        this.videoLengthUpdateEvent = c1644450stX2;
        this.refreshVideoSource = c529150Kp7;
        this.updateStickerTime = c1644450stX3;
    }
}
