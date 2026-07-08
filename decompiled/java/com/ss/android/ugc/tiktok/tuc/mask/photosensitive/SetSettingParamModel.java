package com.ss.android.ugc.tiktok.tuc.mask.photosensitive;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class SetSettingParamModel implements Serializable {

    @C09CT("field")
    public final String field;

    @C09CT("value")
    public final Integer value;

    public SetSettingParamModel() {
        this(null, null);
    }

    public SetSettingParamModel(String str, Integer num) {
        this.field = str;
        this.value = num;
    }
}
