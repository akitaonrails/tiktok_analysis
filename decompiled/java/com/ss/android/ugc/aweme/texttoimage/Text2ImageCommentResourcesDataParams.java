package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Text2ImageCommentResourcesDataParams {

    @C09CT("image")
    public List<Text2ImageCommentResourcesDataNodeParams> image;

    @C09CT("info")
    public List<Text2ImageCommentResourcesDataNodeParams> info;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesDataParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageCommentResourcesDataParams)) {
            return false;
        }
        Text2ImageCommentResourcesDataParams text2ImageCommentResourcesDataParams = (Text2ImageCommentResourcesDataParams) obj;
        return Intrinsics.LJFF(this.image, text2ImageCommentResourcesDataParams.image) && Intrinsics.LJFF(this.info, text2ImageCommentResourcesDataParams.info);
    }

    public final int hashCode() {
        List<Text2ImageCommentResourcesDataNodeParams> list = this.image;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Text2ImageCommentResourcesDataNodeParams> list2 = this.info;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesDataParams(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", info=");
        sbLIZ.append(this.info);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesDataParams(List<Text2ImageCommentResourcesDataNodeParams> list, List<Text2ImageCommentResourcesDataNodeParams> list2) {
        this.image = list;
        this.info = list2;
    }

    public /* synthetic */ Text2ImageCommentResourcesDataParams(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
