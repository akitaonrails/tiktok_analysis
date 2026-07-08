package com.ss.android.ugc.aweme.creative.compileconfig;

import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CompileConfigResolution {
    public static final int $stable = 8;
    public int bitRate;
    public final int height;
    public final Float resizeX;
    public final Float resizeY;
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CompileConfigResolution() {
        int i = 0;
        this(i, i, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileConfigResolution)) {
            return false;
        }
        CompileConfigResolution compileConfigResolution = (CompileConfigResolution) obj;
        return this.width == compileConfigResolution.width && this.height == compileConfigResolution.height && Intrinsics.LJFF(this.resizeX, compileConfigResolution.resizeX) && Intrinsics.LJFF(this.resizeY, compileConfigResolution.resizeY);
    }

    public int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        Float f = this.resizeX;
        int iHashCode = (i + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.resizeY;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompileConfigResolution(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", resizeX=");
        sbLIZ.append(this.resizeX);
        sbLIZ.append(", resizeY=");
        sbLIZ.append(this.resizeY);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBitRate(int i) {
        this.bitRate = i;
    }

    public CompileConfigResolution(int i, int i2, Float f, Float f2) {
        this.width = i;
        this.height = i2;
        this.resizeX = f;
        this.resizeY = f2;
        this.bitRate = 19;
    }

    public /* synthetic */ CompileConfigResolution(int i, int i2, Float f, Float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 576 : i, (i3 & 2) != 0 ? 1024 : i2, (i3 & 4) != 0 ? null : f, (i3 & 8) != 0 ? null : f2);
    }
}
