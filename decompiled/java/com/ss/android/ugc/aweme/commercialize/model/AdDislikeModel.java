package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdDislikeModel implements Serializable {

    @C09CT("dislike_url")
    public String adxUrl;

    @C09CT("label_clickable")
    public boolean labelClickable;

    @C09CT("name")
    public String name;

    public final String getAdxUrl() {
        return this.adxUrl;
    }

    public final boolean getLabelClickable() {
        return this.labelClickable;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDislikeUrl(int i) {
        if (!TextUtils.isEmpty(this.adxUrl)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.adxUrl);
            sbLIZ.append("&is_long_press=");
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public final void setAdxUrl(String str) {
        this.adxUrl = str;
    }

    public final void setLabelClickable(boolean z) {
        this.labelClickable = z;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
