package com.ss.android.ugc.aweme.story.utils;

import X.C09CT;
import X.C1609970rzv;
import X.C1C1T;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialInteractionBlobModel implements Serializable {

    @C09CT("social_blob")
    public C1C1T socialBlob;
    public static final C1609970rzv Companion = new Object() { // from class: X.0rzv
    };
    public static final int $stable = 8;

    public SocialInteractionBlobModel() {
        this(null);
    }

    public SocialInteractionBlobModel(C1C1T c1c1t) {
        this.socialBlob = c1c1t;
    }

    public final void setSocialBlob(C1C1T c1c1t) {
        this.socialBlob = c1c1t;
    }
}
