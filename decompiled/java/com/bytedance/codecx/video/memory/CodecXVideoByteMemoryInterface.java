package com.bytedance.codecx.video.memory;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public interface CodecXVideoByteMemoryInterface extends CodecXVideoMemoryInterface {
    int getNumberOfPlanes();

    ByteBuffer getPlaneData(int i);

    int getPlaneLineSize(int i);
}
