package com.ss.android.ugc.tiktok.tns.userrelation.block.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UserBatchBlockResponse extends BaseResponse {

    @C09CT("block_fail_toUserIds")
    public final String blockFailToUserIds;

    @C09CT("count")
    public final int clearCount;

    @C09CT("max_batch_size")
    public final int maxBatchSize;

    public UserBatchBlockResponse() {
        this(null, 0, 0);
    }

    public final UserBatchBlockResponse copy(String str, int i, int i2) {
        return new UserBatchBlockResponse(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBatchBlockResponse)) {
            return false;
        }
        UserBatchBlockResponse userBatchBlockResponse = (UserBatchBlockResponse) obj;
        return Intrinsics.LJFF(this.blockFailToUserIds, userBatchBlockResponse.blockFailToUserIds) && this.maxBatchSize == userBatchBlockResponse.maxBatchSize && this.clearCount == userBatchBlockResponse.clearCount;
    }

    public int hashCode() {
        String str = this.blockFailToUserIds;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.maxBatchSize) * 31) + this.clearCount;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserBatchBlockResponse(blockFailToUserIds=");
        sbLIZ.append(this.blockFailToUserIds);
        sbLIZ.append(", maxBatchSize=");
        sbLIZ.append(this.maxBatchSize);
        sbLIZ.append(", clearCount=");
        sbLIZ.append(this.clearCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getBlockFailToUserIds() {
        return this.blockFailToUserIds;
    }

    public final int getClearCount() {
        return this.clearCount;
    }

    public final int getMaxBatchSize() {
        return this.maxBatchSize;
    }

    public UserBatchBlockResponse(String str, int i, int i2) {
        this.blockFailToUserIds = str;
        this.maxBatchSize = i;
        this.clearCount = i2;
    }
}
