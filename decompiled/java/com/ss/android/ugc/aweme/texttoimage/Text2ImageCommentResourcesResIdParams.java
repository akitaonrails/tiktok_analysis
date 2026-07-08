package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Text2ImageCommentResourcesResIdParams {

    @C09CT("res_id")
    public String resId;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesResIdParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Text2ImageCommentResourcesResIdParams) && Intrinsics.LJFF(this.resId, ((Text2ImageCommentResourcesResIdParams) obj).resId);
    }

    public final int hashCode() {
        String str = this.resId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesResIdParams(resId=");
        sbLIZ.append(this.resId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesResIdParams(String str) {
        this.resId = str;
    }

    public /* synthetic */ Text2ImageCommentResourcesResIdParams(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
