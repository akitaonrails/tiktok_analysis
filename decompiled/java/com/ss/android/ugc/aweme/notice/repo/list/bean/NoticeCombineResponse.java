package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NoticeCombineResponse extends BaseResponse {

    @C09CT("data")
    public final NoticeCombineDatas data;

    public NoticeCombineResponse() {
        this(null);
    }

    public final NoticeCombineResponse copy(NoticeCombineDatas noticeCombineDatas) {
        return new NoticeCombineResponse(noticeCombineDatas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NoticeCombineResponse) && Intrinsics.LJFF(this.data, ((NoticeCombineResponse) obj).data);
    }

    public int hashCode() {
        NoticeCombineDatas noticeCombineDatas = this.data;
        if (noticeCombineDatas == null) {
            return 0;
        }
        return noticeCombineDatas.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeCombineResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final NoticeCombineDatas getData() {
        return this.data;
    }

    public NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas) {
        this.data = noticeCombineDatas;
    }
}
