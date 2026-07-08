package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes30.dex */
public final class StreaksMetaKt {
    public static final int toRank(int i) {
        int i2 = 3;
        if (i != 3) {
            if (i == 10) {
                return 1;
            }
            if (i == 30) {
                return 2;
            }
            if (i != 100) {
                i2 = 4;
                if (i == 200 || i > 200) {
                }
            }
            return i2;
        }
        return 0;
    }
}
