package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageCommentResourcesParams {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("local_url")
    public String localUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageCommentResourcesParams)) {
            return false;
        }
        Text2ImageCommentResourcesParams text2ImageCommentResourcesParams = (Text2ImageCommentResourcesParams) obj;
        return Intrinsics.LJFF(this.id, text2ImageCommentResourcesParams.id) && Intrinsics.LJFF(this.localUrl, text2ImageCommentResourcesParams.localUrl);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.localUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesParams(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", localUrl=");
        sbLIZ.append(this.localUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesParams(String str, String str2) {
        this.id = str;
        this.localUrl = str2;
    }

    public /* synthetic */ Text2ImageCommentResourcesParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
