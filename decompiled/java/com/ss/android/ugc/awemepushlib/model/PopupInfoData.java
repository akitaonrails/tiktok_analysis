package com.ss.android.ugc.awemepushlib.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class PopupInfoData implements Serializable {
    public static final int $stable = 0;

    @C09CT("version")
    public final int version;

    public PopupInfoData() {
        this(-1);
    }

    public PopupInfoData(int i) {
        this.version = i;
    }
}
