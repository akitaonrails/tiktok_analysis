package com.ss.android.ugc.aweme.model.api.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviFeatureDataModel implements Serializable {

    @C09CT("category_key")
    public String category;

    @C09CT("info")
    public String info;

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public ProfileNaviFeatureDataModel(String str, String str2) {
        this.category = str;
        this.info = str2;
    }
}
