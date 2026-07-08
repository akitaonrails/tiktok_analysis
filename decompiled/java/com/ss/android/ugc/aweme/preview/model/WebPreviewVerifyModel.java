package com.ss.android.ugc.aweme.preview.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WebPreviewVerifyModel extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final EditorPreviewResultData data;

    public final WebPreviewVerifyModel copy(EditorPreviewResultData editorPreviewResultData) {
        return new WebPreviewVerifyModel(editorPreviewResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebPreviewVerifyModel) && Intrinsics.LJFF(this.data, ((WebPreviewVerifyModel) obj).data);
    }

    public int hashCode() {
        EditorPreviewResultData editorPreviewResultData = this.data;
        if (editorPreviewResultData == null) {
            return 0;
        }
        return editorPreviewResultData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebPreviewVerifyModel(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EditorPreviewResultData getData() {
        return this.data;
    }

    public WebPreviewVerifyModel(EditorPreviewResultData editorPreviewResultData) {
        this.data = editorPreviewResultData;
    }
}
