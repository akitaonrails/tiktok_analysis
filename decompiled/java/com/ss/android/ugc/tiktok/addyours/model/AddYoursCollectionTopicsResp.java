package com.ss.android.ugc.tiktok.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AddYoursCollectionTopicsResp extends BaseResponse {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("topic_list")
    public final List<AddYoursTopic> topicList;

    public AddYoursCollectionTopicsResp() {
        this(false, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursCollectionTopicsResp)) {
            return false;
        }
        AddYoursCollectionTopicsResp addYoursCollectionTopicsResp = (AddYoursCollectionTopicsResp) obj;
        return this.hasMore == addYoursCollectionTopicsResp.hasMore && this.cursor == addYoursCollectionTopicsResp.cursor && Intrinsics.LJFF(this.topicList, addYoursCollectionTopicsResp.topicList);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.hasMore) * 31) + C786410Ut5.Y2(this.cursor)) * 31;
        List<AddYoursTopic> list = this.topicList;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursCollectionTopicsResp(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", topicList=");
        sbLIZ.append(this.topicList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddYoursCollectionTopicsResp(boolean z, long j, List<AddYoursTopic> list) {
        this.hasMore = z;
        this.cursor = j;
        this.topicList = list;
    }
}
