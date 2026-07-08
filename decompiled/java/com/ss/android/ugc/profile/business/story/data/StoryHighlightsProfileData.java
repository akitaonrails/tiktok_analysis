package com.ss.android.ugc.profile.business.story.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsProfileData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("story_highlight_info")
    public final List<StoryHighlightCollection> highlightCollections;

    public final StoryHighlightsProfileData copy(List<StoryHighlightCollection> list) {
        return new StoryHighlightsProfileData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryHighlightsProfileData) && Intrinsics.LJFF(this.highlightCollections, ((StoryHighlightsProfileData) obj).highlightCollections);
    }

    public int hashCode() {
        List<StoryHighlightCollection> list = this.highlightCollections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsProfileData(highlightCollections=");
        sbLIZ.append(this.highlightCollections);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<StoryHighlightCollection> getHighlightCollections() {
        return this.highlightCollections;
    }

    public StoryHighlightsProfileData(List<StoryHighlightCollection> list) {
        this.highlightCollections = list;
    }
}
