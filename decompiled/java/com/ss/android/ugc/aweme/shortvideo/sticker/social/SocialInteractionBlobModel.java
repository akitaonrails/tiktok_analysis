package com.ss.android.ugc.aweme.shortvideo.sticker.social;

import X.C09CT;
import X.C1C1T;
import X.C2203221BKu;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class SocialInteractionBlobModel implements Serializable {
    public static final C2203221BKu Companion = new Object() { // from class: X.1BKu
    };

    @C09CT("social_blob")
    public C1C1T socialBlob;

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
