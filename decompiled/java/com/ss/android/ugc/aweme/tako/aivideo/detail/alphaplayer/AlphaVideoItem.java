package com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer;

import X.C09CT;
import X.C2188811AlT;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class AlphaVideoItem {

    @C09CT("h")
    public final int actualHeight;

    @C09CT("w")
    public final int actualWidth;

    @C09CT("align")
    public final int align;

    @C09CT("aFrame")
    public final int[] alphaFrame;

    @C09CT("path")
    public final String path;

    @C09CT("rgbFrame")
    public final int[] rgbFrame;

    @C09CT("f")
    public final int totalFrame;

    @C09CT("v")
    public final int version;

    @C09CT("videoH")
    public final int videoHeight;

    @C09CT("videoW")
    public final int videoWidth;

    public AlphaVideoItem() {
        this(null, 0, 0, 0, 0, 0, 0, 0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlphaVideoItem)) {
            return false;
        }
        AlphaVideoItem alphaVideoItem = (AlphaVideoItem) obj;
        return Intrinsics.LJFF(this.path, alphaVideoItem.path) && this.align == alphaVideoItem.align && this.version == alphaVideoItem.version && this.totalFrame == alphaVideoItem.totalFrame && this.actualWidth == alphaVideoItem.actualWidth && this.actualHeight == alphaVideoItem.actualHeight && this.videoWidth == alphaVideoItem.videoWidth && this.videoHeight == alphaVideoItem.videoHeight && Intrinsics.LJFF(this.alphaFrame, alphaVideoItem.alphaFrame) && Intrinsics.LJFF(this.rgbFrame, alphaVideoItem.rgbFrame);
    }

    public final int hashCode() {
        String str = this.path;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.align) * 31) + this.version) * 31) + this.totalFrame) * 31) + this.actualWidth) * 31) + this.actualHeight) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31;
        int[] iArr = this.alphaFrame;
        int iHashCode2 = (iHashCode + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.rgbFrame;
        return iHashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlphaVideoItem(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", align=");
        sbLIZ.append(this.align);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", totalFrame=");
        sbLIZ.append(this.totalFrame);
        sbLIZ.append(", actualWidth=");
        sbLIZ.append(this.actualWidth);
        sbLIZ.append(", actualHeight=");
        sbLIZ.append(this.actualHeight);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.videoWidth);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.videoHeight);
        sbLIZ.append(", alphaFrame=");
        sbLIZ.append(Arrays.toString(this.alphaFrame));
        sbLIZ.append(", rgbFrame=");
        sbLIZ.append(Arrays.toString(this.rgbFrame));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AlphaVideoItem(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2) {
        this.path = str;
        this.align = i;
        this.version = i2;
        this.totalFrame = i3;
        this.actualWidth = i4;
        this.actualHeight = i5;
        this.videoWidth = i6;
        this.videoHeight = i7;
        this.alphaFrame = iArr;
        this.rgbFrame = iArr2;
    }
}
