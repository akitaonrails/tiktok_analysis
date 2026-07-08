package com.ss.ttm.player;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public abstract class TTRVideoTrait extends TraitObject {

    public static class VideoFrameInfo {
        public ByteBuffer mBuffer;
        public int mHeight;
        public int mSize;
        public long mTimestamp;
        public int mWidth;
    }

    public abstract void videoClose();

    public abstract void videoFlush();

    public abstract int videoOpen(VideoMediaInfo videoMediaInfo);

    public abstract void videoPause();

    public abstract void videoResume();

    public abstract int videoWrite(VideoFrameInfo videoFrameInfo);

    public static class VideoMediaInfo {
        public final int LIZ;

        public VideoMediaInfo(int i, int i2, int i3, int i4) {
            this.LIZ = i;
        }
    }
}
