package com.ss.android.ugc.aweme.feed.model.story.highlights;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class HighlightSkylightUser implements Serializable {

    @C09CT("highlights")
    public final List<Aweme> highlights;

    @C09CT("user_highlights")
    public final List<SkylightHighlightAwemeInfo> userHighlights;

    @C09CT("user_id")
    public final Long userId;

    public HighlightSkylightUser() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightSkylightUser)) {
            return false;
        }
        HighlightSkylightUser highlightSkylightUser = (HighlightSkylightUser) obj;
        return Intrinsics.LJFF(this.userId, highlightSkylightUser.userId) && Intrinsics.LJFF(this.highlights, highlightSkylightUser.highlights) && Intrinsics.LJFF(this.userHighlights, highlightSkylightUser.userHighlights);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightSkylightUser(Long l, List<? extends Aweme> list, List<SkylightHighlightAwemeInfo> list2) {
        this.userId = l;
        this.highlights = list;
        this.userHighlights = list2;
    }
}
