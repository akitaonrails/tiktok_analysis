package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoSeiParamV2 {
    public boolean allowOverwrite;
    public boolean isKeyFrameOnly;
    public int repeatCount;
    public byte[] seiData;
    public boolean sendWithVideoFrame;

    public boolean AllowOverwrite() {
        return this.allowOverwrite;
    }

    public boolean IsKeyFrameOnly() {
        return this.isKeyFrameOnly;
    }

    public boolean SendWithVideoFrame() {
        return this.sendWithVideoFrame;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public byte[] getSeiData() {
        return this.seiData;
    }
}
