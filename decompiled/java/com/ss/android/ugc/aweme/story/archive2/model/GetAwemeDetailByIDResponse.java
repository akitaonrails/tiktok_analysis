package com.ss.android.ugc.aweme.story.archive2.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetAwemeDetailByIDResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("failed_items")
    public final Map<String, String> failedItems;

    @C09CT("stories")
    public final List<Aweme> stories;

    public GetAwemeDetailByIDResponse() {
        this(null, null, 3, null);
    }

    public final GetAwemeDetailByIDResponse copy(List<? extends Aweme> list, Map<String, String> map) {
        return new GetAwemeDetailByIDResponse(list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAwemeDetailByIDResponse)) {
            return false;
        }
        GetAwemeDetailByIDResponse getAwemeDetailByIDResponse = (GetAwemeDetailByIDResponse) obj;
        return Intrinsics.LJFF(this.stories, getAwemeDetailByIDResponse.stories) && Intrinsics.LJFF(this.failedItems, getAwemeDetailByIDResponse.failedItems);
    }

    public int hashCode() {
        return (this.stories.hashCode() * 31) + this.failedItems.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAwemeDetailByIDResponse(stories=");
        sbLIZ.append(this.stories);
        sbLIZ.append(", failedItems=");
        sbLIZ.append(this.failedItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, String> getFailedItems() {
        return this.failedItems;
    }

    public final List<Aweme> getStories() {
        return this.stories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetAwemeDetailByIDResponse(List<? extends Aweme> list, Map<String, String> map) {
        this.stories = list;
        this.failedItems = map;
    }

    public GetAwemeDetailByIDResponse(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
