package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ThoughtInteractionPreview implements Serializable {

    @C09CT("interaction_count")
    public final Long interactionCount;

    @C09CT("preview_users")
    public final List<ThoughtInteractionInfo> previewUsers;

    public ThoughtInteractionPreview() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThoughtInteractionPreview)) {
            return false;
        }
        ThoughtInteractionPreview thoughtInteractionPreview = (ThoughtInteractionPreview) obj;
        return Intrinsics.LJFF(this.interactionCount, thoughtInteractionPreview.interactionCount) && Intrinsics.LJFF(this.previewUsers, thoughtInteractionPreview.previewUsers);
    }

    public int hashCode() {
        Long l = this.interactionCount;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<ThoughtInteractionInfo> list = this.previewUsers;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtInteractionPreview(interactionCount=");
        sbLIZ.append(this.interactionCount);
        sbLIZ.append(", previewUsers=");
        sbLIZ.append(this.previewUsers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThoughtInteractionPreview(Long l, List<ThoughtInteractionInfo> list) {
        this.interactionCount = l;
        this.previewUsers = list;
    }
}
