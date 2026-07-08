package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentReuseResponse extends BaseResponse {

    @C09CT("allow_reuse_of_content")
    public final Integer allowReuseOfContent;

    public ContentReuseResponse() {
        this(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContentReuseResponse) && Intrinsics.LJFF(this.allowReuseOfContent, ((ContentReuseResponse) obj).allowReuseOfContent);
    }

    public final int hashCode() {
        Integer num = this.allowReuseOfContent;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentReuseResponse(allowReuseOfContent=");
        sbLIZ.append(this.allowReuseOfContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentReuseResponse(Integer num) {
        this.allowReuseOfContent = num;
    }
}
