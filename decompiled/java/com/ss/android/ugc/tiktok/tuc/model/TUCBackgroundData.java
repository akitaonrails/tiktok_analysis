package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class TUCBackgroundData implements Serializable {

    @C09CT("local_image_name")
    public final String localImageName;

    @C09CT("tintColor")
    public final String tintColorRes;

    @C09CT("type")
    public final Integer type;

    public TUCBackgroundData() {
        this(null, null, null);
    }

    public TUCBackgroundData(Integer num, String str, String str2) {
        this.type = num;
        this.localImageName = str;
        this.tintColorRes = str2;
    }
}
