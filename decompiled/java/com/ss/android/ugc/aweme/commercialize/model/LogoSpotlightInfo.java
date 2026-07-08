package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C09DE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LogoSpotlightInfo implements Serializable {

    @C09DE(deserialize = false, serialize = false)
    public boolean LL;

    @C09CT("video")
    public LogoSpotlightVideoModel spotlightVideoModel;

    @C09CT("update_reshow")
    public boolean updateReshow;

    public final boolean getDisplayedAsTopview() {
        return this.LL;
    }

    public final LogoSpotlightVideoModel getSpotlightVideoModel() {
        return this.spotlightVideoModel;
    }

    public final boolean getUpdateReshow() {
        return this.updateReshow;
    }

    public final void setDisplayedAsTopview(boolean z) {
        this.LL = z;
    }

    public final void setSpotlightVideoModel(LogoSpotlightVideoModel logoSpotlightVideoModel) {
        this.spotlightVideoModel = logoSpotlightVideoModel;
    }

    public final void setUpdateReshow(boolean z) {
        this.updateReshow = z;
    }
}
