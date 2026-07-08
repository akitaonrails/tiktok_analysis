package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageCommentResourcesMetaDataListParams {

    @C09CT("metadata")
    public Text2ImageCommentResourcesMetaDataParams metaData;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesMetaDataListParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Text2ImageCommentResourcesMetaDataListParams) && Intrinsics.LJFF(this.metaData, ((Text2ImageCommentResourcesMetaDataListParams) obj).metaData);
    }

    public final int hashCode() {
        Text2ImageCommentResourcesMetaDataParams text2ImageCommentResourcesMetaDataParams = this.metaData;
        if (text2ImageCommentResourcesMetaDataParams == null) {
            return 0;
        }
        return text2ImageCommentResourcesMetaDataParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesMetaDataListParams(metaData=");
        sbLIZ.append(this.metaData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesMetaDataListParams(Text2ImageCommentResourcesMetaDataParams text2ImageCommentResourcesMetaDataParams) {
        this.metaData = text2ImageCommentResourcesMetaDataParams;
    }

    public /* synthetic */ Text2ImageCommentResourcesMetaDataListParams(Text2ImageCommentResourcesMetaDataParams text2ImageCommentResourcesMetaDataParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : text2ImageCommentResourcesMetaDataParams);
    }
}
