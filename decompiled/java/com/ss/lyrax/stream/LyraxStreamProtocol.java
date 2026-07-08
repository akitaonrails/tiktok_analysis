package com.ss.lyrax.stream;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxStreamProtocol {
    RTP(0),
    RTMP(1);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxStreamProtocol fromId(int i) {
        for (LyraxStreamProtocol lyraxStreamProtocol : values()) {
            if (lyraxStreamProtocol.value() == i) {
                return lyraxStreamProtocol;
            }
        }
        return RTP;
    }

    public static LyraxStreamProtocol valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                return RTP;
            }
            return RTMP;
        }
        return RTP;
    }

    public static LyraxStreamProtocol valueOf(String str) {
        return (LyraxStreamProtocol) C08FF.LIZ(LyraxStreamProtocol.class, str);
    }

    LyraxStreamProtocol(int i) {
        this.val = i;
    }
}
