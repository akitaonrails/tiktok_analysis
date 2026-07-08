package com.ss.android.ugc.aweme.videoadaption.adaptionparams;

import X.C0RAA;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1869707Tz;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoAdaptionResult implements C0RAA {
    public final int height;
    public final InterfaceC1869707Tz resultOperator;
    public final Float translateX;
    public final Float translateY;
    public final int width;

    public final VideoAdaptionResult copy(int i, int i2, Float f, Float f2, InterfaceC1869707Tz interfaceC1869707Tz) {
        return new VideoAdaptionResult(i, i2, f, f2, interfaceC1869707Tz);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdaptionResult)) {
            return false;
        }
        VideoAdaptionResult videoAdaptionResult = (VideoAdaptionResult) obj;
        return this.width == videoAdaptionResult.width && this.height == videoAdaptionResult.height && Intrinsics.LJFF(this.translateX, videoAdaptionResult.translateX) && Intrinsics.LJFF(this.translateY, videoAdaptionResult.translateY) && Intrinsics.LJFF(this.resultOperator, videoAdaptionResult.resultOperator);
    }

    public int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        Float f = this.translateX;
        int iHashCode = (i + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.translateY;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        InterfaceC1869707Tz interfaceC1869707Tz = this.resultOperator;
        return iHashCode2 + (interfaceC1869707Tz != null ? interfaceC1869707Tz.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoAdaptionResult(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", translateX=");
        sbLIZ.append(this.translateX);
        sbLIZ.append(", translateY=");
        sbLIZ.append(this.translateY);
        sbLIZ.append(", resultOperator=");
        sbLIZ.append(this.resultOperator);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isDimensionValid() {
        return this.width > 0 && this.height > 0;
    }

    public final int getHeight() {
        return this.height;
    }

    public final InterfaceC1869707Tz getResultOperator() {
        return this.resultOperator;
    }

    public final Float getTranslateX() {
        return this.translateX;
    }

    public final Float getTranslateY() {
        return this.translateY;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void saveResultInner(View view) {
        if (view == null) {
            return;
        }
        setDimensions(view, this.width, this.height);
        Float f = this.translateX;
        if (f != null) {
            C786410Ut5.Jc(view, f.floatValue());
        }
        Float f2 = this.translateY;
        if (f2 != null) {
            C786410Ut5.ed(view, f2.floatValue());
        }
    }

    public final void setDimensions(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public VideoAdaptionResult(int i, int i2, Float f, Float f2, InterfaceC1869707Tz interfaceC1869707Tz) {
        this.width = i;
        this.height = i2;
        this.translateX = f;
        this.translateY = f2;
        this.resultOperator = interfaceC1869707Tz;
    }
}
