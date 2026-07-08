package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class BackGroundGradient implements Serializable {

    @C09CT("center_color")
    public final String centerColor;

    @C09CT("end_color")
    public final String endColor;

    @C09CT("start_color")
    public final String startColor;

    public BackGroundGradient(String str, String str2, String str3) {
        this.startColor = str;
        this.centerColor = str2;
        this.endColor = str3;
    }
}
