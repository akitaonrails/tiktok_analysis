package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class DescriptionDataWrapper implements Serializable {

    @C09CT("data")
    public DescriptionData data;

    public DescriptionDataWrapper() {
        this(null);
    }

    public DescriptionDataWrapper(DescriptionData descriptionData) {
        this.data = descriptionData;
    }

    public final void setData(DescriptionData descriptionData) {
        this.data = descriptionData;
    }
}
