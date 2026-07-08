package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import X.AbstractC194560119y;
import X.C0LCS;
import X.C1644450stX;
import X.C194561119z;
import X.C196925122x;
import X.C529140Kp6;
import X.C529150Kp7;
import X.C786410Ut5;
import X.InterfaceC196910122i;
import X.InterfaceC196915122n;
import X.InterfaceC196928123a;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCEditTextStickerViewState extends UiState {
    public static final int $stable = 8;
    public final C1644450stX<TextStickerData, Boolean> addSticker;
    public final C0LCS<Function2<C196925122x, C196925122x, Unit>> changeToTopListener;
    public final C529150Kp7 dismissHitText;
    public final boolean inTimeEditView;
    public final C529150Kp7 reloadStickerEvent;
    public final C529150Kp7 removeAllStickerEvent;
    public final C529150Kp7 resetGuideViewVisibilityEvent;
    public final C0LCS<C196925122x> showInputView;
    public final C0LCS<C196925122x> sticker2Top;
    public final C0LCS<Pair<Integer, Integer>> targetCanvasSize;
    public final C0LCS<InterfaceC196910122i> textStickerEditListener;
    public final C0LCS<InterfaceC196915122n> textStickerListener;
    public final C0LCS<InterfaceC196928123a> textStickerMob;
    public final C0LCS<Function1<C196925122x, Unit>> timeClickListener;
    public final AbstractC194560119y ui;
    public final C529150Kp7 updateLayoutSizeEvent;
    public final C529140Kp6 updateStickerTime;

    public FTCEditTextStickerViewState() {
        this(new C194561119z(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final FTCEditTextStickerViewState copy(AbstractC194560119y abstractC194560119y, boolean z, C0LCS<? extends C196925122x> c0lcs, C529150Kp7 c529150Kp7, C1644450stX<TextStickerData, Boolean> c1644450stX, C529150Kp7 c529150Kp72, C0LCS<? extends InterfaceC196915122n> c0lcs2, C0LCS<? extends Function2<? super C196925122x, ? super C196925122x, Unit>> c0lcs3, C0LCS<? extends InterfaceC196910122i> c0lcs4, C0LCS<? extends Function1<? super C196925122x, Unit>> c0lcs5, C0LCS<? extends InterfaceC196928123a> c0lcs6, C0LCS<Pair<Integer, Integer>> c0lcs7, C0LCS<? extends C196925122x> c0lcs8, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, C529150Kp7 c529150Kp75, C529140Kp6 c529140Kp6) {
        return new FTCEditTextStickerViewState(abstractC194560119y, z, c0lcs, c529150Kp7, c1644450stX, c529150Kp72, c0lcs2, c0lcs3, c0lcs4, c0lcs5, c0lcs6, c0lcs7, c0lcs8, c529150Kp73, c529150Kp74, c529150Kp75, c529140Kp6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditTextStickerViewState)) {
            return false;
        }
        FTCEditTextStickerViewState fTCEditTextStickerViewState = (FTCEditTextStickerViewState) obj;
        return Intrinsics.LJFF(this.ui, fTCEditTextStickerViewState.ui) && this.inTimeEditView == fTCEditTextStickerViewState.inTimeEditView && Intrinsics.LJFF(this.sticker2Top, fTCEditTextStickerViewState.sticker2Top) && Intrinsics.LJFF(this.dismissHitText, fTCEditTextStickerViewState.dismissHitText) && Intrinsics.LJFF(this.addSticker, fTCEditTextStickerViewState.addSticker) && Intrinsics.LJFF(this.reloadStickerEvent, fTCEditTextStickerViewState.reloadStickerEvent) && Intrinsics.LJFF(this.textStickerListener, fTCEditTextStickerViewState.textStickerListener) && Intrinsics.LJFF(this.changeToTopListener, fTCEditTextStickerViewState.changeToTopListener) && Intrinsics.LJFF(this.textStickerEditListener, fTCEditTextStickerViewState.textStickerEditListener) && Intrinsics.LJFF(this.timeClickListener, fTCEditTextStickerViewState.timeClickListener) && Intrinsics.LJFF(this.textStickerMob, fTCEditTextStickerViewState.textStickerMob) && Intrinsics.LJFF(this.targetCanvasSize, fTCEditTextStickerViewState.targetCanvasSize) && Intrinsics.LJFF(this.showInputView, fTCEditTextStickerViewState.showInputView) && Intrinsics.LJFF(this.removeAllStickerEvent, fTCEditTextStickerViewState.removeAllStickerEvent) && Intrinsics.LJFF(this.updateLayoutSizeEvent, fTCEditTextStickerViewState.updateLayoutSizeEvent) && Intrinsics.LJFF(this.resetGuideViewVisibilityEvent, fTCEditTextStickerViewState.resetGuideViewVisibilityEvent) && Intrinsics.LJFF(this.updateStickerTime, fTCEditTextStickerViewState.updateStickerTime);
    }

    public int hashCode() {
        int iHashCode = ((this.ui.hashCode() * 31) + C786410Ut5.Z2(this.inTimeEditView)) * 31;
        C0LCS<C196925122x> c0lcs = this.sticker2Top;
        int iHashCode2 = (iHashCode + (c0lcs == null ? 0 : c0lcs.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.dismissHitText;
        int iHashCode3 = (iHashCode2 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C1644450stX<TextStickerData, Boolean> c1644450stX = this.addSticker;
        int iHashCode4 = (iHashCode3 + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.reloadStickerEvent;
        int iHashCode5 = (iHashCode4 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C0LCS<InterfaceC196915122n> c0lcs2 = this.textStickerListener;
        int iHashCode6 = (iHashCode5 + (c0lcs2 == null ? 0 : c0lcs2.hashCode())) * 31;
        C0LCS<Function2<C196925122x, C196925122x, Unit>> c0lcs3 = this.changeToTopListener;
        int iHashCode7 = (iHashCode6 + (c0lcs3 == null ? 0 : c0lcs3.hashCode())) * 31;
        C0LCS<InterfaceC196910122i> c0lcs4 = this.textStickerEditListener;
        int iHashCode8 = (iHashCode7 + (c0lcs4 == null ? 0 : c0lcs4.hashCode())) * 31;
        C0LCS<Function1<C196925122x, Unit>> c0lcs5 = this.timeClickListener;
        int iHashCode9 = (iHashCode8 + (c0lcs5 == null ? 0 : c0lcs5.hashCode())) * 31;
        C0LCS<InterfaceC196928123a> c0lcs6 = this.textStickerMob;
        int iHashCode10 = (iHashCode9 + (c0lcs6 == null ? 0 : c0lcs6.hashCode())) * 31;
        C0LCS<Pair<Integer, Integer>> c0lcs7 = this.targetCanvasSize;
        int iHashCode11 = (iHashCode10 + (c0lcs7 == null ? 0 : c0lcs7.hashCode())) * 31;
        C0LCS<C196925122x> c0lcs8 = this.showInputView;
        int iHashCode12 = (iHashCode11 + (c0lcs8 == null ? 0 : c0lcs8.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.removeAllStickerEvent;
        int iHashCode13 = (iHashCode12 + (c529150Kp73 == null ? 0 : c529150Kp73.hashCode())) * 31;
        C529150Kp7 c529150Kp74 = this.updateLayoutSizeEvent;
        int iHashCode14 = (iHashCode13 + (c529150Kp74 == null ? 0 : c529150Kp74.hashCode())) * 31;
        C529150Kp7 c529150Kp75 = this.resetGuideViewVisibilityEvent;
        int iHashCode15 = (iHashCode14 + (c529150Kp75 == null ? 0 : c529150Kp75.hashCode())) * 31;
        C529140Kp6 c529140Kp6 = this.updateStickerTime;
        return iHashCode15 + (c529140Kp6 != null ? c529140Kp6.hashCode() : 0);
    }

    public String toString() {
        return "FTCEditTextStickerViewState(ui=" + this.ui + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", reloadStickerEvent=" + this.reloadStickerEvent + ", textStickerListener=" + this.textStickerListener + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", textStickerMob=" + this.textStickerMob + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ", updateStickerTime=" + this.updateStickerTime + ')';
    }

    public final C1644450stX<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final C0LCS<Function2<C196925122x, C196925122x, Unit>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final C529150Kp7 getDismissHitText() {
        return this.dismissHitText;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C529150Kp7 getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final C529150Kp7 getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final C529150Kp7 getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final C0LCS<C196925122x> getShowInputView() {
        return this.showInputView;
    }

    public final C0LCS<C196925122x> getSticker2Top() {
        return this.sticker2Top;
    }

    public final C0LCS<Pair<Integer, Integer>> getTargetCanvasSize() {
        return this.targetCanvasSize;
    }

    public final C0LCS<InterfaceC196910122i> getTextStickerEditListener() {
        return this.textStickerEditListener;
    }

    public final C0LCS<InterfaceC196915122n> getTextStickerListener() {
        return this.textStickerListener;
    }

    public final C0LCS<InterfaceC196928123a> getTextStickerMob() {
        return this.textStickerMob;
    }

    public final C0LCS<Function1<C196925122x, Unit>> getTimeClickListener() {
        return this.timeClickListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final C529150Kp7 getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    public final C529140Kp6 getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditTextStickerViewState(AbstractC194560119y abstractC194560119y, boolean z, C0LCS<? extends C196925122x> c0lcs, C529150Kp7 c529150Kp7, C1644450stX<TextStickerData, Boolean> c1644450stX, C529150Kp7 c529150Kp72, C0LCS<? extends InterfaceC196915122n> c0lcs2, C0LCS<? extends Function2<? super C196925122x, ? super C196925122x, Unit>> c0lcs3, C0LCS<? extends InterfaceC196910122i> c0lcs4, C0LCS<? extends Function1<? super C196925122x, Unit>> c0lcs5, C0LCS<? extends InterfaceC196928123a> c0lcs6, C0LCS<Pair<Integer, Integer>> c0lcs7, C0LCS<? extends C196925122x> c0lcs8, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, C529150Kp7 c529150Kp75, C529140Kp6 c529140Kp6) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.inTimeEditView = z;
        this.sticker2Top = c0lcs;
        this.dismissHitText = c529150Kp7;
        this.addSticker = c1644450stX;
        this.reloadStickerEvent = c529150Kp72;
        this.textStickerListener = c0lcs2;
        this.changeToTopListener = c0lcs3;
        this.textStickerEditListener = c0lcs4;
        this.timeClickListener = c0lcs5;
        this.textStickerMob = c0lcs6;
        this.targetCanvasSize = c0lcs7;
        this.showInputView = c0lcs8;
        this.removeAllStickerEvent = c529150Kp73;
        this.updateLayoutSizeEvent = c529150Kp74;
        this.resetGuideViewVisibilityEvent = c529150Kp75;
        this.updateStickerTime = c529140Kp6;
    }
}
