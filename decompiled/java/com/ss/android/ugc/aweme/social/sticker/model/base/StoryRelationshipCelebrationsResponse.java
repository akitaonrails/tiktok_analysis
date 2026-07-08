package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryRelationshipCelebrationsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("celebrations")
    public final List<RelationshipCelebrationInfo> celebrations;

    public StoryRelationshipCelebrationsResponse() {
        this(null);
    }

    public final StoryRelationshipCelebrationsResponse copy(List<RelationshipCelebrationInfo> list) {
        return new StoryRelationshipCelebrationsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryRelationshipCelebrationsResponse) && Intrinsics.LJFF(this.celebrations, ((StoryRelationshipCelebrationsResponse) obj).celebrations);
    }

    public int hashCode() {
        List<RelationshipCelebrationInfo> list = this.celebrations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryRelationshipCelebrationsResponse(celebrations=");
        sbLIZ.append(this.celebrations);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<RelationshipCelebrationInfo> getCelebrations() {
        return this.celebrations;
    }

    public StoryRelationshipCelebrationsResponse(List<RelationshipCelebrationInfo> list) {
        this.celebrations = list;
    }
}
