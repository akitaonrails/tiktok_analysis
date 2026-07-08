package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentSurprise implements Serializable {

    @C09CT("keyword")
    public final String keyword;

    @C09CT("raw_data")
    public final String rawData;

    @C09CT("resource_type")
    public final String resourceType;

    @C09CT("schema")
    public final String schema;

    @C09CT("surprise_resource")
    public final SurpriseResource surpriseResource;

    @C09CT("surprise_type")
    public final Integer surpriseType;

    public CommentSurprise() {
        this(null, null, null, null, null, null);
    }

    public final CommentSurprise copy(Integer num, SurpriseResource surpriseResource, String str, String str2, String str3, String str4) {
        return new CommentSurprise(num, surpriseResource, str, str2, str3, str4);
    }

    public CommentSurprise(Integer num, SurpriseResource surpriseResource, String str, String str2, String str3, String str4) {
        this.surpriseType = num;
        this.surpriseResource = surpriseResource;
        this.rawData = str;
        this.resourceType = str2;
        this.schema = str3;
        this.keyword = str4;
    }
}
