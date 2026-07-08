package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Text2ImageCommentResourcesListParams {

    @C09CT("resources")
    public List<Text2ImageCommentResourcesParams> resources;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesListParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Text2ImageCommentResourcesListParams) && Intrinsics.LJFF(this.resources, ((Text2ImageCommentResourcesListParams) obj).resources);
    }

    public final int hashCode() {
        List<Text2ImageCommentResourcesParams> list = this.resources;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesListParams(resources=");
        sbLIZ.append(this.resources);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesListParams(List<Text2ImageCommentResourcesParams> list) {
        this.resources = list;
    }

    public /* synthetic */ Text2ImageCommentResourcesListParams(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
