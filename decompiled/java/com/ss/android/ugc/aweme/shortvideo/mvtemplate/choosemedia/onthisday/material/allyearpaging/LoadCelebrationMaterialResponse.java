package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.allyearpaging;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LoadCelebrationMaterialResponse extends BaseResponse {

    @C09CT("awemes")
    public final List<Aweme> awemes;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("total_count")
    public final long totalCount;

    public LoadCelebrationMaterialResponse() {
        this(false, 0L, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadCelebrationMaterialResponse)) {
            return false;
        }
        LoadCelebrationMaterialResponse loadCelebrationMaterialResponse = (LoadCelebrationMaterialResponse) obj;
        return this.hasMore == loadCelebrationMaterialResponse.hasMore && this.cursor == loadCelebrationMaterialResponse.cursor && this.totalCount == loadCelebrationMaterialResponse.totalCount && Intrinsics.LJFF(this.awemes, loadCelebrationMaterialResponse.awemes);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.hasMore) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Y2(this.totalCount)) * 31;
        List<Aweme> list = this.awemes;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadCelebrationMaterialResponse(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadCelebrationMaterialResponse(boolean z, long j, long j2, List<? extends Aweme> list) {
        this.hasMore = z;
        this.cursor = j;
        this.totalCount = j2;
        this.awemes = list;
    }
}
