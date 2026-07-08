package com.ss.lyrax.stream;

import X.C08FF;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxStreamIndex {
    kMain(0),
    k2nd(1),
    k3rd(2),
    k4th(3),
    k5th(4),
    k6th(5),
    k7th(6),
    kMax(LSPassThroughRecordSizeConfig.DEFAULT);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxStreamIndex fromId(int i) {
        for (LyraxStreamIndex lyraxStreamIndex : values()) {
            if (lyraxStreamIndex.value() == i) {
                return lyraxStreamIndex;
            }
        }
        return kMain;
    }

    public static LyraxStreamIndex valueOf(String str) {
        return (LyraxStreamIndex) C08FF.LIZ(LyraxStreamIndex.class, str);
    }

    LyraxStreamIndex(int i) {
        this.val = i;
    }
}
