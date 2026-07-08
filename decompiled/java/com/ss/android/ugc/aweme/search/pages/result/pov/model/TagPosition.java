package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class TagPosition implements Serializable {

    @C09CT("tag_id")
    public final Integer tagId;

    @C09CT("tag_position")
    public final Integer tagPosition;

    public TagPosition(Integer num, Integer num2) {
        this.tagId = num;
        this.tagPosition = num2;
    }
}
