package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.AbstractC194560119y;
import X.C0LCS;
import X.C125R;
import X.C125X;
import X.C1644450stX;
import X.C194561119z;
import X.C529130Kp5;
import X.C529140Kp6;
import X.C529150Kp7;
import X.C786410Ut5;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.ui_component.UiState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class EditTextStickerViewState extends UiState {
    public static final int $stable = 8;
    public final C0LCS<Unit> addGuidanceStickerIfNeed;
    public final C1644450stX<TextStickerData, Boolean> addSticker;
    public final C0LCS<TextWatcher> addTextChangeListenerEvent;
    public final C0LCS<String> addTextStickerViaString;
    public final C0LCS<Pair<TextStickerData, String>> afterChangeTextAutoRead;
    public final C529150Kp7 cancelNewStickerRead;
    public final C529130Kp5 changeTextEditPageReadIcon;
    public final C0LCS<Function2<C125R, C125R, Unit>> changeToTopListener;
    public final C529150Kp7 dismissHitText;
    public final C0LCS<C125R> editTextSticker;
    public final C529130Kp5 enableDirectEditEvent;
    public final C0LCS<String> fakeTextDataAndRead;
    public final C529130Kp5 forceHideReadItemEvent;
    public final C529130Kp5 getNowStringGoToReadWithFake;
    public final C0LCS<C125R> goReadTextStickerScene;
    public final C0LCS<View.OnClickListener> guideListener;
    public final C529130Kp5 guideViewVisibility;
    public final boolean inTimeEditView;
    public final C0LCS<TextStickerData> mobClickTextReadingEvent;
    public final C529130Kp5 muteReadText;
    public final C0LCS<Function1<C125R, Unit>> readTextClickListener;
    public final C529150Kp7 registerTimeEditRefreshListener;
    public final C529150Kp7 reloadStickerEvent;
    public final C529150Kp7 removeAllStickerEvent;
    public final C529150Kp7 removeAllTextSticker;
    public final C529150Kp7 removeGuidanceText;
    public final C0LCS<C125R> removeTextSticker;
    public final C529150Kp7 resetGuideViewVisibilityEvent;
    public final C0LCS<C125R> showInputView;
    public final C0LCS<C125R> sticker2Top;
    public final C0LCS<Pair<Integer, Integer>> targetCanvasSize;
    public final C0LCS<C125X> textStickerEditListener;
    public final C0LCS<Function1<C125R, Unit>> timeClickListener;
    public final AbstractC194560119y ui;
    public final C529150Kp7 unRegisterTimeEditRefreshListener;
    public final C529150Kp7 updateLayoutSizeEvent;
    public final C529140Kp6 updateStickerTime;
    public final C529130Kp5 videoPlayState;

    public EditTextStickerViewState() {
        this(new C194561119z(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C529130Kp5(false), null, null, null, null, null, null, null, null, null, null);
    }

    public final EditTextStickerViewState copy(AbstractC194560119y abstractC194560119y, boolean z, C0LCS<? extends C125R> c0lcs, C529150Kp7 c529150Kp7, C1644450stX<TextStickerData, Boolean> c1644450stX, C0LCS<? extends View.OnClickListener> c0lcs2, C529150Kp7 c529150Kp72, C0LCS<? extends Function2<? super C125R, ? super C125R, Unit>> c0lcs3, C0LCS<? extends C125X> c0lcs4, C0LCS<? extends Function1<? super C125R, Unit>> c0lcs5, C0LCS<? extends Function1<? super C125R, Unit>> c0lcs6, C0LCS<Unit> c0lcs7, C0LCS<Pair<Integer, Integer>> c0lcs8, C0LCS<? extends C125R> c0lcs9, C0LCS<? extends C125R> c0lcs10, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, C529130Kp5 c529130Kp5, C529150Kp7 c529150Kp75, C529130Kp5 c529130Kp52, C0LCS<? extends C125R> c0lcs11, C529150Kp7 c529150Kp76, C0LCS<String> c0lcs12, C529130Kp5 c529130Kp53, C529130Kp5 c529130Kp54, C0LCS<Pair<TextStickerData, String>> c0lcs13, C0LCS<TextStickerData> c0lcs14, C529130Kp5 c529130Kp55, C529130Kp5 c529130Kp56, C0LCS<? extends TextWatcher> c0lcs15, C0LCS<String> c0lcs16, C0LCS<? extends C125R> c0lcs17, C529140Kp6 c529140Kp6, C529150Kp7 c529150Kp77, C529150Kp7 c529150Kp78, C529150Kp7 c529150Kp79, C529150Kp7 c529150Kp710, C529130Kp5 c529130Kp57) {
        return new EditTextStickerViewState(abstractC194560119y, z, c0lcs, c529150Kp7, c1644450stX, c0lcs2, c529150Kp72, c0lcs3, c0lcs4, c0lcs5, c0lcs6, c0lcs7, c0lcs8, c0lcs9, c0lcs10, c529150Kp73, c529150Kp74, c529130Kp5, c529150Kp75, c529130Kp52, c0lcs11, c529150Kp76, c0lcs12, c529130Kp53, c529130Kp54, c0lcs13, c0lcs14, c529130Kp55, c529130Kp56, c0lcs15, c0lcs16, c0lcs17, c529140Kp6, c529150Kp77, c529150Kp78, c529150Kp79, c529150Kp710, c529130Kp57);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextStickerViewState)) {
            return false;
        }
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return Intrinsics.LJFF(this.ui, editTextStickerViewState.ui) && this.inTimeEditView == editTextStickerViewState.inTimeEditView && Intrinsics.LJFF(this.sticker2Top, editTextStickerViewState.sticker2Top) && Intrinsics.LJFF(this.dismissHitText, editTextStickerViewState.dismissHitText) && Intrinsics.LJFF(this.addSticker, editTextStickerViewState.addSticker) && Intrinsics.LJFF(this.guideListener, editTextStickerViewState.guideListener) && Intrinsics.LJFF(this.reloadStickerEvent, editTextStickerViewState.reloadStickerEvent) && Intrinsics.LJFF(this.changeToTopListener, editTextStickerViewState.changeToTopListener) && Intrinsics.LJFF(this.textStickerEditListener, editTextStickerViewState.textStickerEditListener) && Intrinsics.LJFF(this.timeClickListener, editTextStickerViewState.timeClickListener) && Intrinsics.LJFF(this.readTextClickListener, editTextStickerViewState.readTextClickListener) && Intrinsics.LJFF(this.addGuidanceStickerIfNeed, editTextStickerViewState.addGuidanceStickerIfNeed) && Intrinsics.LJFF(this.targetCanvasSize, editTextStickerViewState.targetCanvasSize) && Intrinsics.LJFF(this.showInputView, editTextStickerViewState.showInputView) && Intrinsics.LJFF(this.editTextSticker, editTextStickerViewState.editTextSticker) && Intrinsics.LJFF(this.removeAllStickerEvent, editTextStickerViewState.removeAllStickerEvent) && Intrinsics.LJFF(this.updateLayoutSizeEvent, editTextStickerViewState.updateLayoutSizeEvent) && Intrinsics.LJFF(this.guideViewVisibility, editTextStickerViewState.guideViewVisibility) && Intrinsics.LJFF(this.resetGuideViewVisibilityEvent, editTextStickerViewState.resetGuideViewVisibilityEvent) && Intrinsics.LJFF(this.forceHideReadItemEvent, editTextStickerViewState.forceHideReadItemEvent) && Intrinsics.LJFF(this.goReadTextStickerScene, editTextStickerViewState.goReadTextStickerScene) && Intrinsics.LJFF(this.cancelNewStickerRead, editTextStickerViewState.cancelNewStickerRead) && Intrinsics.LJFF(this.fakeTextDataAndRead, editTextStickerViewState.fakeTextDataAndRead) && Intrinsics.LJFF(this.getNowStringGoToReadWithFake, editTextStickerViewState.getNowStringGoToReadWithFake) && Intrinsics.LJFF(this.changeTextEditPageReadIcon, editTextStickerViewState.changeTextEditPageReadIcon) && Intrinsics.LJFF(this.afterChangeTextAutoRead, editTextStickerViewState.afterChangeTextAutoRead) && Intrinsics.LJFF(this.mobClickTextReadingEvent, editTextStickerViewState.mobClickTextReadingEvent) && Intrinsics.LJFF(this.muteReadText, editTextStickerViewState.muteReadText) && Intrinsics.LJFF(this.enableDirectEditEvent, editTextStickerViewState.enableDirectEditEvent) && Intrinsics.LJFF(this.addTextChangeListenerEvent, editTextStickerViewState.addTextChangeListenerEvent) && Intrinsics.LJFF(this.addTextStickerViaString, editTextStickerViewState.addTextStickerViaString) && Intrinsics.LJFF(this.removeTextSticker, editTextStickerViewState.removeTextSticker) && Intrinsics.LJFF(this.updateStickerTime, editTextStickerViewState.updateStickerTime) && Intrinsics.LJFF(this.removeGuidanceText, editTextStickerViewState.removeGuidanceText) && Intrinsics.LJFF(this.registerTimeEditRefreshListener, editTextStickerViewState.registerTimeEditRefreshListener) && Intrinsics.LJFF(this.unRegisterTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener) && Intrinsics.LJFF(this.removeAllTextSticker, editTextStickerViewState.removeAllTextSticker) && Intrinsics.LJFF(this.videoPlayState, editTextStickerViewState.videoPlayState);
    }

    public int hashCode() {
        int iHashCode = ((this.ui.hashCode() * 31) + C786410Ut5.Z2(this.inTimeEditView)) * 31;
        C0LCS<C125R> c0lcs = this.sticker2Top;
        int iHashCode2 = (iHashCode + (c0lcs == null ? 0 : c0lcs.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.dismissHitText;
        int iHashCode3 = (iHashCode2 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        C1644450stX<TextStickerData, Boolean> c1644450stX = this.addSticker;
        int iHashCode4 = (iHashCode3 + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C0LCS<View.OnClickListener> c0lcs2 = this.guideListener;
        int iHashCode5 = (iHashCode4 + (c0lcs2 == null ? 0 : c0lcs2.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.reloadStickerEvent;
        int iHashCode6 = (iHashCode5 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C0LCS<Function2<C125R, C125R, Unit>> c0lcs3 = this.changeToTopListener;
        int iHashCode7 = (iHashCode6 + (c0lcs3 == null ? 0 : c0lcs3.hashCode())) * 31;
        C0LCS<C125X> c0lcs4 = this.textStickerEditListener;
        int iHashCode8 = (iHashCode7 + (c0lcs4 == null ? 0 : c0lcs4.hashCode())) * 31;
        C0LCS<Function1<C125R, Unit>> c0lcs5 = this.timeClickListener;
        int iHashCode9 = (iHashCode8 + (c0lcs5 == null ? 0 : c0lcs5.hashCode())) * 31;
        C0LCS<Function1<C125R, Unit>> c0lcs6 = this.readTextClickListener;
        int iHashCode10 = (iHashCode9 + (c0lcs6 == null ? 0 : c0lcs6.hashCode())) * 31;
        C0LCS<Unit> c0lcs7 = this.addGuidanceStickerIfNeed;
        int iHashCode11 = (iHashCode10 + (c0lcs7 == null ? 0 : c0lcs7.hashCode())) * 31;
        C0LCS<Pair<Integer, Integer>> c0lcs8 = this.targetCanvasSize;
        int iHashCode12 = (iHashCode11 + (c0lcs8 == null ? 0 : c0lcs8.hashCode())) * 31;
        C0LCS<C125R> c0lcs9 = this.showInputView;
        int iHashCode13 = (iHashCode12 + (c0lcs9 == null ? 0 : c0lcs9.hashCode())) * 31;
        C0LCS<C125R> c0lcs10 = this.editTextSticker;
        int iHashCode14 = (iHashCode13 + (c0lcs10 == null ? 0 : c0lcs10.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.removeAllStickerEvent;
        int iHashCode15 = (iHashCode14 + (c529150Kp73 == null ? 0 : c529150Kp73.hashCode())) * 31;
        C529150Kp7 c529150Kp74 = this.updateLayoutSizeEvent;
        int iHashCode16 = (iHashCode15 + (c529150Kp74 == null ? 0 : c529150Kp74.hashCode())) * 31;
        C529130Kp5 c529130Kp5 = this.guideViewVisibility;
        int iHashCode17 = (iHashCode16 + (c529130Kp5 == null ? 0 : c529130Kp5.hashCode())) * 31;
        C529150Kp7 c529150Kp75 = this.resetGuideViewVisibilityEvent;
        int iHashCode18 = (iHashCode17 + (c529150Kp75 == null ? 0 : c529150Kp75.hashCode())) * 31;
        C529130Kp5 c529130Kp52 = this.forceHideReadItemEvent;
        int iHashCode19 = (iHashCode18 + (c529130Kp52 == null ? 0 : c529130Kp52.hashCode())) * 31;
        C0LCS<C125R> c0lcs11 = this.goReadTextStickerScene;
        int iHashCode20 = (iHashCode19 + (c0lcs11 == null ? 0 : c0lcs11.hashCode())) * 31;
        C529150Kp7 c529150Kp76 = this.cancelNewStickerRead;
        int iHashCode21 = (iHashCode20 + (c529150Kp76 == null ? 0 : c529150Kp76.hashCode())) * 31;
        C0LCS<String> c0lcs12 = this.fakeTextDataAndRead;
        int iHashCode22 = (iHashCode21 + (c0lcs12 == null ? 0 : c0lcs12.hashCode())) * 31;
        C529130Kp5 c529130Kp53 = this.getNowStringGoToReadWithFake;
        int iHashCode23 = (iHashCode22 + (c529130Kp53 == null ? 0 : c529130Kp53.hashCode())) * 31;
        C529130Kp5 c529130Kp54 = this.changeTextEditPageReadIcon;
        int iHashCode24 = (iHashCode23 + (c529130Kp54 == null ? 0 : c529130Kp54.hashCode())) * 31;
        C0LCS<Pair<TextStickerData, String>> c0lcs13 = this.afterChangeTextAutoRead;
        int iHashCode25 = (iHashCode24 + (c0lcs13 == null ? 0 : c0lcs13.hashCode())) * 31;
        C0LCS<TextStickerData> c0lcs14 = this.mobClickTextReadingEvent;
        int iHashCode26 = (((iHashCode25 + (c0lcs14 == null ? 0 : c0lcs14.hashCode())) * 31) + this.muteReadText.hashCode()) * 31;
        C529130Kp5 c529130Kp55 = this.enableDirectEditEvent;
        int iHashCode27 = (iHashCode26 + (c529130Kp55 == null ? 0 : c529130Kp55.hashCode())) * 31;
        C0LCS<TextWatcher> c0lcs15 = this.addTextChangeListenerEvent;
        int iHashCode28 = (iHashCode27 + (c0lcs15 == null ? 0 : c0lcs15.hashCode())) * 31;
        C0LCS<String> c0lcs16 = this.addTextStickerViaString;
        int iHashCode29 = (iHashCode28 + (c0lcs16 == null ? 0 : c0lcs16.hashCode())) * 31;
        C0LCS<C125R> c0lcs17 = this.removeTextSticker;
        int iHashCode30 = (iHashCode29 + (c0lcs17 == null ? 0 : c0lcs17.hashCode())) * 31;
        C529140Kp6 c529140Kp6 = this.updateStickerTime;
        int iHashCode31 = (iHashCode30 + (c529140Kp6 == null ? 0 : c529140Kp6.hashCode())) * 31;
        C529150Kp7 c529150Kp77 = this.removeGuidanceText;
        int iHashCode32 = (iHashCode31 + (c529150Kp77 == null ? 0 : c529150Kp77.hashCode())) * 31;
        C529150Kp7 c529150Kp78 = this.registerTimeEditRefreshListener;
        int iHashCode33 = (iHashCode32 + (c529150Kp78 == null ? 0 : c529150Kp78.hashCode())) * 31;
        C529150Kp7 c529150Kp79 = this.unRegisterTimeEditRefreshListener;
        int iHashCode34 = (iHashCode33 + (c529150Kp79 == null ? 0 : c529150Kp79.hashCode())) * 31;
        C529150Kp7 c529150Kp710 = this.removeAllTextSticker;
        int iHashCode35 = (iHashCode34 + (c529150Kp710 == null ? 0 : c529150Kp710.hashCode())) * 31;
        C529130Kp5 c529130Kp56 = this.videoPlayState;
        return iHashCode35 + (c529130Kp56 != null ? c529130Kp56.hashCode() : 0);
    }

    public String toString() {
        return "EditTextStickerViewState(ui=" + this.ui + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", guideListener=" + this.guideListener + ", reloadStickerEvent=" + this.reloadStickerEvent + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", readTextClickListener=" + this.readTextClickListener + ", addGuidanceStickerIfNeed=" + this.addGuidanceStickerIfNeed + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", editTextSticker=" + this.editTextSticker + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", guideViewVisibility=" + this.guideViewVisibility + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ", forceHideReadItemEvent=" + this.forceHideReadItemEvent + ", goReadTextStickerScene=" + this.goReadTextStickerScene + ", cancelNewStickerRead=" + this.cancelNewStickerRead + ", fakeTextDataAndRead=" + this.fakeTextDataAndRead + ", getNowStringGoToReadWithFake=" + this.getNowStringGoToReadWithFake + ", changeTextEditPageReadIcon=" + this.changeTextEditPageReadIcon + ", afterChangeTextAutoRead=" + this.afterChangeTextAutoRead + ", mobClickTextReadingEvent=" + this.mobClickTextReadingEvent + ", muteReadText=" + this.muteReadText + ", enableDirectEditEvent=" + this.enableDirectEditEvent + ", addTextChangeListenerEvent=" + this.addTextChangeListenerEvent + ", addTextStickerViaString=" + this.addTextStickerViaString + ", removeTextSticker=" + this.removeTextSticker + ", updateStickerTime=" + this.updateStickerTime + ", removeGuidanceText=" + this.removeGuidanceText + ", registerTimeEditRefreshListener=" + this.registerTimeEditRefreshListener + ", unRegisterTimeEditRefreshListener=" + this.unRegisterTimeEditRefreshListener + ", removeAllTextSticker=" + this.removeAllTextSticker + ", videoPlayState=" + this.videoPlayState + ')';
    }

    public final C0LCS<Unit> getAddGuidanceStickerIfNeed() {
        return this.addGuidanceStickerIfNeed;
    }

    public final C1644450stX<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final C0LCS<TextWatcher> getAddTextChangeListenerEvent() {
        return this.addTextChangeListenerEvent;
    }

    public final C0LCS<String> getAddTextStickerViaString() {
        return this.addTextStickerViaString;
    }

    public final C0LCS<Pair<TextStickerData, String>> getAfterChangeTextAutoRead() {
        return this.afterChangeTextAutoRead;
    }

    public final C529150Kp7 getCancelNewStickerRead() {
        return this.cancelNewStickerRead;
    }

    public final C529130Kp5 getChangeTextEditPageReadIcon() {
        return this.changeTextEditPageReadIcon;
    }

    public final C0LCS<Function2<C125R, C125R, Unit>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final C529150Kp7 getDismissHitText() {
        return this.dismissHitText;
    }

    public final C0LCS<C125R> getEditTextSticker() {
        return this.editTextSticker;
    }

    public final C529130Kp5 getEnableDirectEditEvent() {
        return this.enableDirectEditEvent;
    }

    public final C0LCS<String> getFakeTextDataAndRead() {
        return this.fakeTextDataAndRead;
    }

    public final C529130Kp5 getForceHideReadItemEvent() {
        return this.forceHideReadItemEvent;
    }

    public final C529130Kp5 getGetNowStringGoToReadWithFake() {
        return this.getNowStringGoToReadWithFake;
    }

    public final C0LCS<C125R> getGoReadTextStickerScene() {
        return this.goReadTextStickerScene;
    }

    public final C0LCS<View.OnClickListener> getGuideListener() {
        return this.guideListener;
    }

    public final C529130Kp5 getGuideViewVisibility() {
        return this.guideViewVisibility;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C0LCS<TextStickerData> getMobClickTextReadingEvent() {
        return this.mobClickTextReadingEvent;
    }

    public final C529130Kp5 getMuteReadText() {
        return this.muteReadText;
    }

    public final C0LCS<Function1<C125R, Unit>> getReadTextClickListener() {
        return this.readTextClickListener;
    }

    public final C529150Kp7 getRegisterTimeEditRefreshListener() {
        return this.registerTimeEditRefreshListener;
    }

    public final C529150Kp7 getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final C529150Kp7 getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final C529150Kp7 getRemoveAllTextSticker() {
        return this.removeAllTextSticker;
    }

    public final C529150Kp7 getRemoveGuidanceText() {
        return this.removeGuidanceText;
    }

    public final C0LCS<C125R> getRemoveTextSticker() {
        return this.removeTextSticker;
    }

    public final C529150Kp7 getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final C0LCS<C125R> getShowInputView() {
        return this.showInputView;
    }

    public final C0LCS<C125R> getSticker2Top() {
        return this.sticker2Top;
    }

    public final C0LCS<Pair<Integer, Integer>> getTargetCanvasSize() {
        return this.targetCanvasSize;
    }

    public final C0LCS<C125X> getTextStickerEditListener() {
        return this.textStickerEditListener;
    }

    public final C0LCS<Function1<C125R, Unit>> getTimeClickListener() {
        return this.timeClickListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final C529150Kp7 getUnRegisterTimeEditRefreshListener() {
        return this.unRegisterTimeEditRefreshListener;
    }

    public final C529150Kp7 getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    public final C529140Kp6 getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    public final C529130Kp5 getVideoPlayState() {
        return this.videoPlayState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditTextStickerViewState(AbstractC194560119y abstractC194560119y, boolean z, C0LCS<? extends C125R> c0lcs, C529150Kp7 c529150Kp7, C1644450stX<TextStickerData, Boolean> c1644450stX, C0LCS<? extends View.OnClickListener> c0lcs2, C529150Kp7 c529150Kp72, C0LCS<? extends Function2<? super C125R, ? super C125R, Unit>> c0lcs3, C0LCS<? extends C125X> c0lcs4, C0LCS<? extends Function1<? super C125R, Unit>> c0lcs5, C0LCS<? extends Function1<? super C125R, Unit>> c0lcs6, C0LCS<Unit> c0lcs7, C0LCS<Pair<Integer, Integer>> c0lcs8, C0LCS<? extends C125R> c0lcs9, C0LCS<? extends C125R> c0lcs10, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, C529130Kp5 c529130Kp5, C529150Kp7 c529150Kp75, C529130Kp5 c529130Kp52, C0LCS<? extends C125R> c0lcs11, C529150Kp7 c529150Kp76, C0LCS<String> c0lcs12, C529130Kp5 c529130Kp53, C529130Kp5 c529130Kp54, C0LCS<Pair<TextStickerData, String>> c0lcs13, C0LCS<TextStickerData> c0lcs14, C529130Kp5 c529130Kp55, C529130Kp5 c529130Kp56, C0LCS<? extends TextWatcher> c0lcs15, C0LCS<String> c0lcs16, C0LCS<? extends C125R> c0lcs17, C529140Kp6 c529140Kp6, C529150Kp7 c529150Kp77, C529150Kp7 c529150Kp78, C529150Kp7 c529150Kp79, C529150Kp7 c529150Kp710, C529130Kp5 c529130Kp57) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.inTimeEditView = z;
        this.sticker2Top = c0lcs;
        this.dismissHitText = c529150Kp7;
        this.addSticker = c1644450stX;
        this.guideListener = c0lcs2;
        this.reloadStickerEvent = c529150Kp72;
        this.changeToTopListener = c0lcs3;
        this.textStickerEditListener = c0lcs4;
        this.timeClickListener = c0lcs5;
        this.readTextClickListener = c0lcs6;
        this.addGuidanceStickerIfNeed = c0lcs7;
        this.targetCanvasSize = c0lcs8;
        this.showInputView = c0lcs9;
        this.editTextSticker = c0lcs10;
        this.removeAllStickerEvent = c529150Kp73;
        this.updateLayoutSizeEvent = c529150Kp74;
        this.guideViewVisibility = c529130Kp5;
        this.resetGuideViewVisibilityEvent = c529150Kp75;
        this.forceHideReadItemEvent = c529130Kp52;
        this.goReadTextStickerScene = c0lcs11;
        this.cancelNewStickerRead = c529150Kp76;
        this.fakeTextDataAndRead = c0lcs12;
        this.getNowStringGoToReadWithFake = c529130Kp53;
        this.changeTextEditPageReadIcon = c529130Kp54;
        this.afterChangeTextAutoRead = c0lcs13;
        this.mobClickTextReadingEvent = c0lcs14;
        this.muteReadText = c529130Kp55;
        this.enableDirectEditEvent = c529130Kp56;
        this.addTextChangeListenerEvent = c0lcs15;
        this.addTextStickerViaString = c0lcs16;
        this.removeTextSticker = c0lcs17;
        this.updateStickerTime = c529140Kp6;
        this.removeGuidanceText = c529150Kp77;
        this.registerTimeEditRefreshListener = c529150Kp78;
        this.unRegisterTimeEditRefreshListener = c529150Kp79;
        this.removeAllTextSticker = c529150Kp710;
        this.videoPlayState = c529130Kp57;
    }
}
