package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class PublishDraftInfo implements Serializable {

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("has_process")
    public final Boolean hasProcess;

    public PublishDraftInfo() {
        this(null, Boolean.FALSE);
    }

    public PublishDraftInfo(String str, Boolean bool) {
        this.creationId = str;
        this.hasProcess = bool;
    }
}
