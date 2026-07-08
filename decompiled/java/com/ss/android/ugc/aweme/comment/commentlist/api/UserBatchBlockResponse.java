package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UserBatchBlockResponse extends BaseResponse {

    @C09CT("block_fail_toUserIds")
    public final String blockFailToUserIds;

    @C09CT("max_batch_size")
    public final Integer maxBatchSize;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBatchBlockResponse)) {
            return false;
        }
        UserBatchBlockResponse userBatchBlockResponse = (UserBatchBlockResponse) obj;
        return Intrinsics.LJFF(this.blockFailToUserIds, userBatchBlockResponse.blockFailToUserIds) && Intrinsics.LJFF(this.maxBatchSize, userBatchBlockResponse.maxBatchSize);
    }

    public final int hashCode() {
        String str = this.blockFailToUserIds;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxBatchSize;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserBatchBlockResponse(blockFailToUserIds=");
        sbLIZ.append(this.blockFailToUserIds);
        sbLIZ.append(", maxBatchSize=");
        sbLIZ.append(this.maxBatchSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserBatchBlockResponse() {
        this("", 0);
    }

    public UserBatchBlockResponse(String str, Integer num) {
        this.blockFailToUserIds = str;
        this.maxBatchSize = num;
    }
}
