package com.bytedance.codecx.video;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum CodecXVideoCodecStandard {
    H264(0),
    ByteVC1(1),
    Unknown(2),
    VP8(8),
    VP9(9),
    AV1(10);

    public final int value;

    public String mimeType() {
        int i = this.value;
        return i != 1 ? i != 8 ? i != 10 ? "video/avc" : "video/av01" : "video/x-vnd.on2.vp8" : "video/hevc";
    }

    public int toInt() {
        return this.value;
    }

    public static CodecXVideoCodecStandard fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 8) {
                    if (i != 10) {
                        return H264;
                    }
                    return AV1;
                }
                return VP8;
            }
            return ByteVC1;
        }
        return H264;
    }

    public static CodecXVideoCodecStandard valueOf(String str) {
        return (CodecXVideoCodecStandard) C08FF.LIZ(CodecXVideoCodecStandard.class, str);
    }

    CodecXVideoCodecStandard(int i) {
        this.value = i;
    }
}
