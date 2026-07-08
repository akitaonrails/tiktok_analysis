package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageMediaModel implements Serializable {

    @C09CT("original_meta_info")
    public final MetaInfo originalMetaInfo;

    @C09CT("original_uri")
    public final String originalUri;

    public ImageMediaModel() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageMediaModel)) {
            return false;
        }
        ImageMediaModel imageMediaModel = (ImageMediaModel) obj;
        return Intrinsics.LJFF(this.originalUri, imageMediaModel.originalUri) && Intrinsics.LJFF(this.originalMetaInfo, imageMediaModel.originalMetaInfo);
    }

    public int hashCode() {
        String str = this.originalUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MetaInfo metaInfo = this.originalMetaInfo;
        return iHashCode + (metaInfo != null ? metaInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageMediaModel(originalUri=");
        sbLIZ.append(this.originalUri);
        sbLIZ.append(", originalMetaInfo=");
        sbLIZ.append(this.originalMetaInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageMediaModel(String str, MetaInfo metaInfo) {
        this.originalUri = str;
        this.originalMetaInfo = metaInfo;
    }
}
