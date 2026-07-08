package com.ss.android.ugc.aweme.geofencing.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class TranslatedRegion implements Serializable {

    @C09CT("string_code")
    public final String code;
    public boolean selected;

    @C09CT("translation")
    public final String translation;

    public final TranslatedRegion copy(String str, String str2, boolean z) {
        return new TranslatedRegion(str, str2, z);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public TranslatedRegion(String str, String str2, boolean z) {
        this.code = str;
        this.translation = str2;
        this.selected = z;
    }
}
