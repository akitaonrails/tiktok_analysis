package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.InterfaceC2270808v4;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class FrameItem implements Serializable {
    public static final Companion Companion = new Companion();
    public FrameItemCropInfo cropInfo;
    public final int index;
    public boolean isCropped;

    @C09CT("path")
    @InterfaceC2270808v4
    public final String path;
    public final Float rotate;

    @C09CT("timeStamp")
    public long timeStamp;
    public final int type;

    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameItem)) {
            return false;
        }
        FrameItem frameItem = (FrameItem) obj;
        return Intrinsics.LJFF(this.path, frameItem.path) && this.type == frameItem.type && this.index == frameItem.index && this.isCropped == frameItem.isCropped && Intrinsics.LJFF(this.cropInfo, frameItem.cropInfo) && Intrinsics.LJFF(this.rotate, frameItem.rotate);
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    public FrameItem(String str) {
        this(str, 1, -1, false, null, null);
    }

    public final void setCropInfo(FrameItemCropInfo frameItemCropInfo) {
        this.cropInfo = frameItemCropInfo;
    }

    public final void setCropped(boolean z) {
        this.isCropped = z;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public FrameItem(String str, int i) {
        this(str, i, -1, false, null, null);
    }

    public FrameItem(String str, int i, int i2) {
        this(str, i, i2, false, null, null);
    }

    public FrameItem(String str, int i, int i2, boolean z) {
        this(str, i, i2, z, null, null);
    }

    public FrameItem(String str, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo) {
        this(str, i, i2, z, frameItemCropInfo, null);
    }

    public FrameItem(String str, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo, Float f) {
        this.path = str;
        this.type = i;
        this.index = i2;
        this.isCropped = z;
        this.cropInfo = frameItemCropInfo;
        this.rotate = f;
        this.timeStamp = -1L;
    }
}
