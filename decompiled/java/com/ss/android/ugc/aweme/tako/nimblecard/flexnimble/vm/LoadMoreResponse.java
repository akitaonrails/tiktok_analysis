package com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LoadMoreResponse extends BaseResponse {

    @C09CT("data")
    public final SearchLoadMoreDataStruct data;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("offset")
    public final Integer offset;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public LoadMoreResponse() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreResponse)) {
            return false;
        }
        LoadMoreResponse loadMoreResponse = (LoadMoreResponse) obj;
        return Intrinsics.LJFF(this.scene, loadMoreResponse.scene) && Intrinsics.LJFF(this.offset, loadMoreResponse.offset) && Intrinsics.LJFF(this.hasMore, loadMoreResponse.hasMore) && Intrinsics.LJFF(this.data, loadMoreResponse.data);
    }

    public final int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.offset;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        SearchLoadMoreDataStruct searchLoadMoreDataStruct = this.data;
        return iHashCode3 + (searchLoadMoreDataStruct != null ? searchLoadMoreDataStruct.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMoreResponse(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LoadMoreResponse(String str, Integer num, Boolean bool, SearchLoadMoreDataStruct searchLoadMoreDataStruct) {
        this.scene = str;
        this.offset = num;
        this.hasMore = bool;
        this.data = searchLoadMoreDataStruct;
    }
}
