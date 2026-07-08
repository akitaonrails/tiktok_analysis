package com.ss.android.ugc.aweme.preview.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EditorPreviewAppResult implements Serializable {
    public static final int $stable = 8;

    @C09CT("height")
    public final Long height;

    @C09CT("is_same_author")
    public final Boolean isSameAuthor;

    @C09CT("preview_urls")
    public final List<String> previewUrls;

    @C09CT("width")
    public final Long width;

    public final Boolean isSameAuthor() {
        return this.isSameAuthor;
    }

    public EditorPreviewAppResult(Boolean bool, List<String> list, Long l, Long l2) {
        this.isSameAuthor = bool;
        this.previewUrls = list;
        this.height = l;
        this.width = l2;
    }
}
