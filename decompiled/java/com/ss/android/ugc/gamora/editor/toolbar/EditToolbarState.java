package com.ss.android.ugc.gamora.editor.toolbar;

import X.AbstractC194560119y;
import X.C1453050nup;
import X.C1464760oDi;
import X.C1644450stX;
import X.C1662100tM0;
import X.C375830EoP;
import X.C529150Kp7;
import X.C786410Ut5;
import X.EnumC1651790t5N;
import android.animation.LayoutTransition;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class EditToolbarState extends UiState {
    public static final int $stable = 8;
    public final C1644450stX<Integer, Function2<Integer, Integer, Unit>> actionWithItemPositionEvent;
    public final boolean aiCaptionOn;
    public final C1464760oDi aiLiveState;
    public final C1453050nup autoEnhanceStatus;
    public final String backTipText;
    public final Boolean backTipVisible;
    public final Boolean backVisible;
    public final Integer bottomHeight;
    public final Drawable chooseMusicIcon;
    public final Integer chooseMusicIconRes;
    public final String chooseMusicText;
    public final C529150Kp7 hideMoreEvent;
    public final C375830EoP<EnumC1651790t5N> hidePromote;
    public final C1644450stX<Integer, Function1<View, Unit>> iconAnimation;
    public final C1644450stX<Integer, Integer> iconColor;
    public final C1644450stX<Integer, String> iconLottieAnimation;
    public final C1644450stX<Integer, Integer> iconRes;
    public final LivePhotoPreviewMode livePhotoPreviewMode;
    public final C1644450stX<Integer, LayoutTransition> makeItemVisibleOnCollapsed;
    public final Integer marginValue;
    public final C529150Kp7 refresh;
    public final C1644450stX<Integer, C1662100tM0> showPromote;
    public final boolean soundSyncOn;
    public final Integer topMargin;
    public final AbstractC194560119y ui;

    public final EditToolbarState copy(AbstractC194560119y abstractC194560119y, Boolean bool, Boolean bool2, String str, C529150Kp7 c529150Kp7, String str2, Drawable drawable, Integer num, Integer num2, C529150Kp7 c529150Kp72, C1644450stX<Integer, Function1<View, Unit>> c1644450stX, C1644450stX<Integer, String> c1644450stX2, C1453050nup c1453050nup, Integer num3, Integer num4, C1464760oDi c1464760oDi, C1644450stX<Integer, Function2<Integer, Integer, Unit>> c1644450stX3, boolean z, boolean z2, LivePhotoPreviewMode livePhotoPreviewMode, C1644450stX<Integer, LayoutTransition> c1644450stX4, C1644450stX<Integer, C1662100tM0> c1644450stX5, C375830EoP<EnumC1651790t5N> c375830EoP, C1644450stX<Integer, Integer> c1644450stX6, C1644450stX<Integer, Integer> c1644450stX7) {
        return new EditToolbarState(abstractC194560119y, bool, bool2, str, c529150Kp7, str2, drawable, num, num2, c529150Kp72, c1644450stX, c1644450stX2, c1453050nup, num3, num4, c1464760oDi, c1644450stX3, z, z2, livePhotoPreviewMode, c1644450stX4, c1644450stX5, c375830EoP, c1644450stX6, c1644450stX7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditToolbarState)) {
            return false;
        }
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return Intrinsics.LJFF(this.ui, editToolbarState.ui) && Intrinsics.LJFF(this.backVisible, editToolbarState.backVisible) && Intrinsics.LJFF(this.backTipVisible, editToolbarState.backTipVisible) && Intrinsics.LJFF(this.backTipText, editToolbarState.backTipText) && Intrinsics.LJFF(this.hideMoreEvent, editToolbarState.hideMoreEvent) && Intrinsics.LJFF(this.chooseMusicText, editToolbarState.chooseMusicText) && Intrinsics.LJFF(this.chooseMusicIcon, editToolbarState.chooseMusicIcon) && Intrinsics.LJFF(this.topMargin, editToolbarState.topMargin) && Intrinsics.LJFF(this.bottomHeight, editToolbarState.bottomHeight) && Intrinsics.LJFF(this.refresh, editToolbarState.refresh) && Intrinsics.LJFF(this.iconAnimation, editToolbarState.iconAnimation) && Intrinsics.LJFF(this.iconLottieAnimation, editToolbarState.iconLottieAnimation) && Intrinsics.LJFF(this.autoEnhanceStatus, editToolbarState.autoEnhanceStatus) && Intrinsics.LJFF(this.marginValue, editToolbarState.marginValue) && Intrinsics.LJFF(this.chooseMusicIconRes, editToolbarState.chooseMusicIconRes) && Intrinsics.LJFF(this.aiLiveState, editToolbarState.aiLiveState) && Intrinsics.LJFF(this.actionWithItemPositionEvent, editToolbarState.actionWithItemPositionEvent) && this.aiCaptionOn == editToolbarState.aiCaptionOn && this.soundSyncOn == editToolbarState.soundSyncOn && this.livePhotoPreviewMode == editToolbarState.livePhotoPreviewMode && Intrinsics.LJFF(this.makeItemVisibleOnCollapsed, editToolbarState.makeItemVisibleOnCollapsed) && Intrinsics.LJFF(this.showPromote, editToolbarState.showPromote) && Intrinsics.LJFF(this.hidePromote, editToolbarState.hidePromote) && Intrinsics.LJFF(this.iconRes, editToolbarState.iconRes) && Intrinsics.LJFF(this.iconColor, editToolbarState.iconColor);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        Boolean bool = this.backVisible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.backTipVisible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.backTipText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.hideMoreEvent;
        int iHashCode5 = (iHashCode4 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        String str2 = this.chooseMusicText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int iHashCode7 = (iHashCode6 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.topMargin;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomHeight;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C529150Kp7 c529150Kp72 = this.refresh;
        int iHashCode10 = (iHashCode9 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C1644450stX<Integer, Function1<View, Unit>> c1644450stX = this.iconAnimation;
        int iHashCode11 = (iHashCode10 + (c1644450stX == null ? 0 : c1644450stX.hashCode())) * 31;
        C1644450stX<Integer, String> c1644450stX2 = this.iconLottieAnimation;
        int iHashCode12 = (iHashCode11 + (c1644450stX2 == null ? 0 : c1644450stX2.hashCode())) * 31;
        C1453050nup c1453050nup = this.autoEnhanceStatus;
        int iHashCode13 = (iHashCode12 + (c1453050nup == null ? 0 : c1453050nup.hashCode())) * 31;
        Integer num3 = this.marginValue;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.chooseMusicIconRes;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        C1464760oDi c1464760oDi = this.aiLiveState;
        int iHashCode16 = (iHashCode15 + (c1464760oDi == null ? 0 : c1464760oDi.hashCode())) * 31;
        C1644450stX<Integer, Function2<Integer, Integer, Unit>> c1644450stX3 = this.actionWithItemPositionEvent;
        int iHashCode17 = (((((iHashCode16 + (c1644450stX3 == null ? 0 : c1644450stX3.hashCode())) * 31) + C786410Ut5.Z2(this.aiCaptionOn)) * 31) + C786410Ut5.Z2(this.soundSyncOn)) * 31;
        LivePhotoPreviewMode livePhotoPreviewMode = this.livePhotoPreviewMode;
        int iHashCode18 = (iHashCode17 + (livePhotoPreviewMode == null ? 0 : livePhotoPreviewMode.hashCode())) * 31;
        C1644450stX<Integer, LayoutTransition> c1644450stX4 = this.makeItemVisibleOnCollapsed;
        int iHashCode19 = (iHashCode18 + (c1644450stX4 == null ? 0 : c1644450stX4.hashCode())) * 31;
        C1644450stX<Integer, C1662100tM0> c1644450stX5 = this.showPromote;
        int iHashCode20 = (iHashCode19 + (c1644450stX5 == null ? 0 : c1644450stX5.hashCode())) * 31;
        C375830EoP<EnumC1651790t5N> c375830EoP = this.hidePromote;
        int iHashCode21 = (iHashCode20 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C1644450stX<Integer, Integer> c1644450stX6 = this.iconRes;
        int iHashCode22 = (iHashCode21 + (c1644450stX6 == null ? 0 : c1644450stX6.hashCode())) * 31;
        C1644450stX<Integer, Integer> c1644450stX7 = this.iconColor;
        return iHashCode22 + (c1644450stX7 != null ? c1644450stX7.hashCode() : 0);
    }

    public String toString() {
        return "EditToolbarState(ui=" + this.ui + ", backVisible=" + this.backVisible + ", backTipVisible=" + this.backTipVisible + ", backTipText=" + this.backTipText + ", hideMoreEvent=" + this.hideMoreEvent + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ", refresh=" + this.refresh + ", iconAnimation=" + this.iconAnimation + ", iconLottieAnimation=" + this.iconLottieAnimation + ", autoEnhanceStatus=" + this.autoEnhanceStatus + ", marginValue=" + this.marginValue + ", chooseMusicIconRes=" + this.chooseMusicIconRes + ", aiLiveState=" + this.aiLiveState + ", actionWithItemPositionEvent=" + this.actionWithItemPositionEvent + ", aiCaptionOn=" + this.aiCaptionOn + ", soundSyncOn=" + this.soundSyncOn + ", livePhotoPreviewMode=" + this.livePhotoPreviewMode + ", makeItemVisibleOnCollapsed=" + this.makeItemVisibleOnCollapsed + ", showPromote=" + this.showPromote + ", hidePromote=" + this.hidePromote + ", iconRes=" + this.iconRes + ", iconColor=" + this.iconColor + ')';
    }

    public final C1644450stX<Integer, Function2<Integer, Integer, Unit>> getActionWithItemPositionEvent() {
        return this.actionWithItemPositionEvent;
    }

    public final boolean getAiCaptionOn() {
        return this.aiCaptionOn;
    }

    public final C1464760oDi getAiLiveState() {
        return this.aiLiveState;
    }

    public final C1453050nup getAutoEnhanceStatus() {
        return this.autoEnhanceStatus;
    }

    public final String getBackTipText() {
        return this.backTipText;
    }

    public final Boolean getBackTipVisible() {
        return this.backTipVisible;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final Integer getChooseMusicIconRes() {
        return this.chooseMusicIconRes;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final C529150Kp7 getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final C375830EoP<EnumC1651790t5N> getHidePromote() {
        return this.hidePromote;
    }

    public final C1644450stX<Integer, Function1<View, Unit>> getIconAnimation() {
        return this.iconAnimation;
    }

    public final C1644450stX<Integer, Integer> getIconColor() {
        return this.iconColor;
    }

    public final C1644450stX<Integer, String> getIconLottieAnimation() {
        return this.iconLottieAnimation;
    }

    public final C1644450stX<Integer, Integer> getIconRes() {
        return this.iconRes;
    }

    public final LivePhotoPreviewMode getLivePhotoPreviewMode() {
        return this.livePhotoPreviewMode;
    }

    public final C1644450stX<Integer, LayoutTransition> getMakeItemVisibleOnCollapsed() {
        return this.makeItemVisibleOnCollapsed;
    }

    public final Integer getMarginValue() {
        return this.marginValue;
    }

    public final C529150Kp7 getRefresh() {
        return this.refresh;
    }

    public final C1644450stX<Integer, C1662100tM0> getShowPromote() {
        return this.showPromote;
    }

    public final boolean getSoundSyncOn() {
        return this.soundSyncOn;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public EditToolbarState(AbstractC194560119y abstractC194560119y, Boolean bool, Boolean bool2, String str, C529150Kp7 c529150Kp7, String str2, Drawable drawable, Integer num, Integer num2, C529150Kp7 c529150Kp72, C1644450stX<Integer, Function1<View, Unit>> c1644450stX, C1644450stX<Integer, String> c1644450stX2, C1453050nup c1453050nup, Integer num3, Integer num4, C1464760oDi c1464760oDi, C1644450stX<Integer, Function2<Integer, Integer, Unit>> c1644450stX3, boolean z, boolean z2, LivePhotoPreviewMode livePhotoPreviewMode, C1644450stX<Integer, LayoutTransition> c1644450stX4, C1644450stX<Integer, C1662100tM0> c1644450stX5, C375830EoP<EnumC1651790t5N> c375830EoP, C1644450stX<Integer, Integer> c1644450stX6, C1644450stX<Integer, Integer> c1644450stX7) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.backTipText = str;
        this.hideMoreEvent = c529150Kp7;
        this.chooseMusicText = str2;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.refresh = c529150Kp72;
        this.iconAnimation = c1644450stX;
        this.iconLottieAnimation = c1644450stX2;
        this.autoEnhanceStatus = c1453050nup;
        this.marginValue = num3;
        this.chooseMusicIconRes = num4;
        this.aiLiveState = c1464760oDi;
        this.actionWithItemPositionEvent = c1644450stX3;
        this.aiCaptionOn = z;
        this.soundSyncOn = z2;
        this.livePhotoPreviewMode = livePhotoPreviewMode;
        this.makeItemVisibleOnCollapsed = c1644450stX4;
        this.showPromote = c1644450stX5;
        this.hidePromote = c375830EoP;
        this.iconRes = c1644450stX6;
        this.iconColor = c1644450stX7;
    }
}
