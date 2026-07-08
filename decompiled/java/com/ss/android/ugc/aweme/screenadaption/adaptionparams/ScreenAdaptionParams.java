package com.ss.android.ugc.aweme.screenadaption.adaptionparams;

import X.C2188811AlT;
import X.InterfaceC1604490rr5;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ScreenAdaptionParams implements InterfaceC1604490rr5 {
    public final Activity activity;
    public final int appNavHeight;
    public final Boolean forceOpenBottom;
    public final Boolean forceOpenTop;
    public final int screenHeight;
    public final int screenWidth;

    public final ScreenAdaptionParams copy(int i, Activity activity, int i2, int i3, Boolean bool, Boolean bool2) {
        return new ScreenAdaptionParams(i, activity, i2, i3, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenAdaptionParams)) {
            return false;
        }
        ScreenAdaptionParams screenAdaptionParams = (ScreenAdaptionParams) obj;
        return this.appNavHeight == screenAdaptionParams.appNavHeight && Intrinsics.LJFF(this.activity, screenAdaptionParams.activity) && this.screenHeight == screenAdaptionParams.screenHeight && this.screenWidth == screenAdaptionParams.screenWidth && Intrinsics.LJFF(this.forceOpenTop, screenAdaptionParams.forceOpenTop) && Intrinsics.LJFF(this.forceOpenBottom, screenAdaptionParams.forceOpenBottom);
    }

    public int hashCode() {
        int i = this.appNavHeight * 31;
        Activity activity = this.activity;
        int iHashCode = (((((i + (activity == null ? 0 : activity.hashCode())) * 31) + this.screenHeight) * 31) + this.screenWidth) * 31;
        Boolean bool = this.forceOpenTop;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.forceOpenBottom;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenAdaptionParams(appNavHeight=");
        sbLIZ.append(this.appNavHeight);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.activity);
        sbLIZ.append(", screenHeight=");
        sbLIZ.append(this.screenHeight);
        sbLIZ.append(", screenWidth=");
        sbLIZ.append(this.screenWidth);
        sbLIZ.append(", forceOpenTop=");
        sbLIZ.append(this.forceOpenTop);
        sbLIZ.append(", forceOpenBottom=");
        sbLIZ.append(this.forceOpenBottom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final int getAppNavHeight() {
        return this.appNavHeight;
    }

    public final Boolean getForceOpenBottom() {
        return this.forceOpenBottom;
    }

    public final Boolean getForceOpenTop() {
        return this.forceOpenTop;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public ScreenAdaptionParams(int i, Activity activity, int i2, int i3, Boolean bool, Boolean bool2) {
        this.appNavHeight = i;
        this.activity = activity;
        this.screenHeight = i2;
        this.screenWidth = i3;
        this.forceOpenTop = bool;
        this.forceOpenBottom = bool2;
    }
}
