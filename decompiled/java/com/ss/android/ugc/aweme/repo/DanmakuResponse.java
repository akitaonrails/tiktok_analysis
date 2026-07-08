package com.ss.android.ugc.aweme.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuResponse extends BaseResponse {

    @C09CT("danmaku")
    public final DanmakuStruct danmaku;

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status_code:");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DanmakuStruct getDanmaku() {
        return this.danmaku;
    }
}
