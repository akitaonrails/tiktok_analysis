package com.ss.android.ugc.aweme.screenadaption.adaptionparams;

import X.C0RAA;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ScreenAdaptionResult implements C0RAA {
    public final int appNavHeight;
    public final transient int appNavType;
    public final int bottomSpaceHeight;
    public final int containerHeight;
    public final int containerWidth;
    public final int screenHeight;
    public final transient int screenInsetByBottom;
    public final transient int screenInsetByTop;
    public final int screenWidth;
    public final transient boolean showBottomSpace;
    public final transient boolean showTopSpace;
    public final int statusBarHeight;
    public final transient int statusBarType;
    public final int topSpaceHeight;
    public final Integer virtualBarHeight;

    public final ScreenAdaptionResult copy(int i, int i2, int i3, int i4, int i5, int i6, Integer num) {
        return new ScreenAdaptionResult(i, i2, i3, i4, i5, i6, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenAdaptionResult)) {
            return false;
        }
        ScreenAdaptionResult screenAdaptionResult = (ScreenAdaptionResult) obj;
        return this.topSpaceHeight == screenAdaptionResult.topSpaceHeight && this.bottomSpaceHeight == screenAdaptionResult.bottomSpaceHeight && this.screenHeight == screenAdaptionResult.screenHeight && this.screenWidth == screenAdaptionResult.screenWidth && this.statusBarHeight == screenAdaptionResult.statusBarHeight && this.appNavHeight == screenAdaptionResult.appNavHeight && Intrinsics.LJFF(this.virtualBarHeight, screenAdaptionResult.virtualBarHeight);
    }

    public int hashCode() {
        int i = ((((((((((this.topSpaceHeight * 31) + this.bottomSpaceHeight) * 31) + this.screenHeight) * 31) + this.screenWidth) * 31) + this.statusBarHeight) * 31) + this.appNavHeight) * 31;
        Integer num = this.virtualBarHeight;
        return i + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenAdaptionResult(topSpaceHeight=");
        sbLIZ.append(this.topSpaceHeight);
        sbLIZ.append(", bottomSpaceHeight=");
        sbLIZ.append(this.bottomSpaceHeight);
        sbLIZ.append(", screenHeight=");
        sbLIZ.append(this.screenHeight);
        sbLIZ.append(", screenWidth=");
        sbLIZ.append(this.screenWidth);
        sbLIZ.append(", statusBarHeight=");
        sbLIZ.append(this.statusBarHeight);
        sbLIZ.append(", appNavHeight=");
        sbLIZ.append(this.appNavHeight);
        sbLIZ.append(", virtualBarHeight=");
        sbLIZ.append(this.virtualBarHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAppNavHeight() {
        return this.appNavHeight;
    }

    public final int getAppNavType() {
        return this.appNavType;
    }

    public final int getBottomSpaceHeight() {
        return this.bottomSpaceHeight;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
    }

    public final int getContainerWidth() {
        return this.containerWidth;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenInsetByBottom() {
        return this.screenInsetByBottom;
    }

    public final int getScreenInsetByTop() {
        return this.screenInsetByTop;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final boolean getShowBottomSpace() {
        return this.showBottomSpace;
    }

    public final boolean getShowTopSpace() {
        return this.showTopSpace;
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final int getStatusBarType() {
        return this.statusBarType;
    }

    public final int getTopSpaceHeight() {
        return this.topSpaceHeight;
    }

    public final Integer getVirtualBarHeight() {
        return this.virtualBarHeight;
    }

    public ScreenAdaptionResult(int i, int i2, int i3, int i4, int i5, int i6, Integer num) {
        int i7;
        int i8;
        boolean z;
        this.topSpaceHeight = i;
        this.bottomSpaceHeight = i2;
        this.screenHeight = i3;
        this.screenWidth = i4;
        this.statusBarHeight = i5;
        this.appNavHeight = i6;
        this.virtualBarHeight = num;
        this.containerHeight = (i3 - i) - i2;
        this.containerWidth = i4;
        if (i2 == 0) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.appNavType = i7;
        if (i == 0) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        this.statusBarType = i8;
        this.screenInsetByTop = i5 - i;
        this.screenInsetByBottom = i6 - i2;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.showTopSpace = z;
        this.showBottomSpace = i2 != 0;
    }
}
