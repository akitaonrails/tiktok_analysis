package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageCommentResourcesStyleParams {

    @C09CT("color")
    public String color;

    @C09CT("numberOfLines")
    public Integer numberOfLines;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesStyleParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageCommentResourcesStyleParams)) {
            return false;
        }
        Text2ImageCommentResourcesStyleParams text2ImageCommentResourcesStyleParams = (Text2ImageCommentResourcesStyleParams) obj;
        return Intrinsics.LJFF(this.numberOfLines, text2ImageCommentResourcesStyleParams.numberOfLines) && Intrinsics.LJFF(this.color, text2ImageCommentResourcesStyleParams.color);
    }

    public final int hashCode() {
        Integer num = this.numberOfLines;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesStyleParams(numberOfLines=");
        sbLIZ.append(this.numberOfLines);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesStyleParams(Integer num, String str) {
        this.numberOfLines = num;
        this.color = str;
    }

    public /* synthetic */ Text2ImageCommentResourcesStyleParams(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
