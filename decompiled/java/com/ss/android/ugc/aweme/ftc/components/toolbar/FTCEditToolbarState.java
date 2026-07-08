package com.ss.android.ugc.aweme.ftc.components.toolbar;

import X.AbstractC194560119y;
import X.C1460620o72;
import X.C529150Kp7;
import android.graphics.drawable.Drawable;
import com.bytedance.ui_component.UiState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditToolbarState extends UiState {
    public static final int $stable = 8;
    public final String backTipText;
    public final Boolean backTipVisible;
    public final Boolean backVisible;
    public final List<C1460620o72> bottomBarItems;
    public final Integer bottomHeight;
    public final Drawable chooseMusicIcon;
    public final Integer chooseMusicRawIconRes;
    public final String chooseMusicText;
    public final C529150Kp7 hideMoreEvent;
    public final List<C1460620o72> titleBarItems;
    public final Integer topMargin;
    public final AbstractC194560119y ui;

    public final FTCEditToolbarState copy(AbstractC194560119y abstractC194560119y, Boolean bool, Boolean bool2, String str, List<C1460620o72> list, List<C1460620o72> list2, C529150Kp7 c529150Kp7, String str2, Drawable drawable, Integer num, Integer num2, Integer num3) {
        return new FTCEditToolbarState(abstractC194560119y, bool, bool2, str, list, list2, c529150Kp7, str2, drawable, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditToolbarState)) {
            return false;
        }
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return Intrinsics.LJFF(this.ui, fTCEditToolbarState.ui) && Intrinsics.LJFF(this.backVisible, fTCEditToolbarState.backVisible) && Intrinsics.LJFF(this.backTipVisible, fTCEditToolbarState.backTipVisible) && Intrinsics.LJFF(this.backTipText, fTCEditToolbarState.backTipText) && Intrinsics.LJFF(this.titleBarItems, fTCEditToolbarState.titleBarItems) && Intrinsics.LJFF(this.bottomBarItems, fTCEditToolbarState.bottomBarItems) && Intrinsics.LJFF(this.hideMoreEvent, fTCEditToolbarState.hideMoreEvent) && Intrinsics.LJFF(this.chooseMusicText, fTCEditToolbarState.chooseMusicText) && Intrinsics.LJFF(this.chooseMusicIcon, fTCEditToolbarState.chooseMusicIcon) && Intrinsics.LJFF(this.topMargin, fTCEditToolbarState.topMargin) && Intrinsics.LJFF(this.bottomHeight, fTCEditToolbarState.bottomHeight) && Intrinsics.LJFF(this.chooseMusicRawIconRes, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        Boolean bool = this.backVisible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.backTipVisible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.backTipText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<C1460620o72> list = this.titleBarItems;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<C1460620o72> list2 = this.bottomBarItems;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C529150Kp7 c529150Kp7 = this.hideMoreEvent;
        int iHashCode7 = (iHashCode6 + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31;
        String str2 = this.chooseMusicText;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int iHashCode9 = (iHashCode8 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.topMargin;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomHeight;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.chooseMusicRawIconRes;
        return iHashCode11 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "FTCEditToolbarState(ui=" + this.ui + ", backVisible=" + this.backVisible + ", backTipVisible=" + this.backTipVisible + ", backTipText=" + this.backTipText + ", titleBarItems=" + this.titleBarItems + ", bottomBarItems=" + this.bottomBarItems + ", hideMoreEvent=" + this.hideMoreEvent + ", chooseMusicText=" + this.chooseMusicText + ", chooseMusicIcon=" + this.chooseMusicIcon + ", topMargin=" + this.topMargin + ", bottomHeight=" + this.bottomHeight + ", chooseMusicRawIconRes=" + this.chooseMusicRawIconRes + ')';
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

    public final List<C1460620o72> getBottomBarItems() {
        return this.bottomBarItems;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final Integer getChooseMusicRawIconRes() {
        return this.chooseMusicRawIconRes;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final C529150Kp7 getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final List<C1460620o72> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public FTCEditToolbarState(AbstractC194560119y abstractC194560119y, Boolean bool, Boolean bool2, String str, List<C1460620o72> list, List<C1460620o72> list2, C529150Kp7 c529150Kp7, String str2, Drawable drawable, Integer num, Integer num2, Integer num3) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.backTipText = str;
        this.titleBarItems = list;
        this.bottomBarItems = list2;
        this.hideMoreEvent = c529150Kp7;
        this.chooseMusicText = str2;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.chooseMusicRawIconRes = num3;
    }
}
