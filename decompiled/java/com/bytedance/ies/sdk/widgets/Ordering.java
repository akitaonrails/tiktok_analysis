package com.bytedance.ies.sdk.widgets;

import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
public final class Ordering {
    public static final Companion Companion = new Companion();
    public final SparseIntArray orders = new SparseIntArray();

    public static final class Companion {
    }

    public final int requestOrder(int i) {
        int i2;
        int i3 = this.orders.get(i, -1);
        if (i3 == -1) {
            i2 = LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            i2 = i3 + 1;
        }
        this.orders.put(i, i2);
        return i2;
    }
}
