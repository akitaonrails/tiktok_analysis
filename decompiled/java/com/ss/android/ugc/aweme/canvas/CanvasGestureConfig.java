package com.ss.android.ugc.aweme.canvas;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CanvasGestureConfig implements Serializable {

    @C09CT("enableFakeFeedView")
    public final boolean enableFakeFeedView;

    @C09CT("enableFakeStoryFeedView")
    public final boolean enableFakeStoryFeedView;

    @C09CT("enableGesture")
    public final boolean enableGesture;

    @C09CT("enableMove")
    public final boolean enableMove;

    @C09CT("enableRotate")
    public final boolean enableRotate;

    @C09CT("enableScale")
    public final boolean enableScale;

    @C09CT("enableTap")
    public final boolean enableTap;

    @C09CT("fingerCountForMove")
    public final int fingerCountForMove;

    @C09CT("skipTouchInCanvasCheck")
    public final boolean skipTouchInCanvasCheck;

    public CanvasGestureConfig() {
        this(true, true, true, true, false, 2, false, false, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasGestureConfig(enableGesture=");
        sbLIZ.append(this.enableGesture);
        sbLIZ.append(", enableMove=");
        sbLIZ.append(this.enableMove);
        sbLIZ.append(", enableScale=");
        sbLIZ.append(this.enableScale);
        sbLIZ.append(", enableRotate=");
        sbLIZ.append(this.enableRotate);
        sbLIZ.append(", enableTap=");
        sbLIZ.append(this.enableTap);
        sbLIZ.append(", fingerCountForMove=");
        sbLIZ.append(this.fingerCountForMove);
        sbLIZ.append(", enableFakeFeedView=");
        sbLIZ.append(this.enableFakeFeedView);
        sbLIZ.append(", enableFakeStoryFeedView=");
        sbLIZ.append(this.enableFakeStoryFeedView);
        sbLIZ.append(", skipTouchInCanvasCheck=");
        sbLIZ.append(this.skipTouchInCanvasCheck);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CanvasGestureConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8) {
        this.enableGesture = z;
        this.enableMove = z2;
        this.enableScale = z3;
        this.enableRotate = z4;
        this.enableTap = z5;
        this.fingerCountForMove = i;
        this.enableFakeFeedView = z6;
        this.enableFakeStoryFeedView = z7;
        this.skipTouchInCanvasCheck = z8;
    }
}
