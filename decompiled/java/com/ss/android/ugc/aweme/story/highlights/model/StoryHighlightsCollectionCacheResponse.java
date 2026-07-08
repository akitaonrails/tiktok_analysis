package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryHighlightsCollectionCacheResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    public StoryHighlightsCollectionCacheResponse() {
        this(null, 1, null);
    }

    public final StoryHighlightsCollectionCacheResponse copy(List<? extends Aweme> list) {
        return new StoryHighlightsCollectionCacheResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryHighlightsCollectionCacheResponse) && Intrinsics.LJFF(this.awemes, ((StoryHighlightsCollectionCacheResponse) obj).awemes);
    }

    public int hashCode() {
        return this.awemes.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsCollectionCacheResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryHighlightsCollectionCacheResponse(List<? extends Aweme> list) {
        this.awemes = list;
    }

    public StoryHighlightsCollectionCacheResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
