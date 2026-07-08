package com.ss.android.ugc.aweme.feed.model.story.socialblob;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SocialInteractionBlobProto implements Serializable {

    @C09CT("auxiliary_model_content")
    public String auxiliaryModelContent;

    public SocialInteractionBlobProto() {
        this("");
    }

    public SocialInteractionBlobProto(String str) {
        this.auxiliaryModelContent = str;
    }

    public final void setAuxiliaryModelContent(String str) {
        this.auxiliaryModelContent = str;
    }
}
