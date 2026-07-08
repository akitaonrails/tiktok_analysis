package com.ss.bytertc.engine.avclient;

import X.C2188811AlT;
import X.C786410Ut5;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxVideoFrame {
    public ByteBuffer buffer;
    public int height;
    public int rotation;
    public ByteBuffer seiData;
    public long timestamp_us;
    public int width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxVideoFrame)) {
            return false;
        }
        LyraxVideoFrame lyraxVideoFrame = (LyraxVideoFrame) obj;
        return Intrinsics.LJFF(this.buffer, lyraxVideoFrame.buffer) && this.width == lyraxVideoFrame.width && this.height == lyraxVideoFrame.height && this.rotation == lyraxVideoFrame.rotation && this.timestamp_us == lyraxVideoFrame.timestamp_us && Intrinsics.LJFF(this.seiData, lyraxVideoFrame.seiData);
    }

    public int hashCode() {
        return (((((((((this.buffer.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.rotation) * 31) + C786410Ut5.Y2(this.timestamp_us)) * 31) + this.seiData.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxVideoFrame(buffer=");
        sbLIZ.append(this.buffer);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", timestamp_us=");
        sbLIZ.append(this.timestamp_us);
        sbLIZ.append(", seiData=");
        sbLIZ.append(this.seiData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setRotation(int i) {
        this.rotation = i;
    }

    public final void setSeiData(ByteBuffer byteBuffer) {
        this.seiData = byteBuffer;
    }

    public final void setTimestamp_us(long j) {
        this.timestamp_us = j;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public LyraxVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
        this.buffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.timestamp_us = j;
        this.seiData = byteBuffer2;
    }
}
