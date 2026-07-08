package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Text2ImageCommentResourcesDataListParams {

    @C09CT("data")
    public Text2ImageCommentResourcesDataParams data;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesDataListParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Text2ImageCommentResourcesDataListParams) && Intrinsics.LJFF(this.data, ((Text2ImageCommentResourcesDataListParams) obj).data);
    }

    public final int hashCode() {
        Text2ImageCommentResourcesDataParams text2ImageCommentResourcesDataParams = this.data;
        if (text2ImageCommentResourcesDataParams == null) {
            return 0;
        }
        return text2ImageCommentResourcesDataParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesDataListParams(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesDataListParams(Text2ImageCommentResourcesDataParams text2ImageCommentResourcesDataParams) {
        this.data = text2ImageCommentResourcesDataParams;
    }

    public /* synthetic */ Text2ImageCommentResourcesDataListParams(Text2ImageCommentResourcesDataParams text2ImageCommentResourcesDataParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : text2ImageCommentResourcesDataParams);
    }
}
