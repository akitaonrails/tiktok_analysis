package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ExtraVideoMap implements Serializable {

    @C09CT("easter_egg")
    public final AlphaVideoData easterEggVideo;

    public ExtraVideoMap() {
        this(null);
    }

    public ExtraVideoMap(AlphaVideoData alphaVideoData) {
        this.easterEggVideo = alphaVideoData;
    }
}
