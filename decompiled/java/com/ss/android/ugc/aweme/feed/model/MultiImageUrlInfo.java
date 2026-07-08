package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiImageUrlInfo implements Serializable {

    @C09CT("bitrate_image")
    public UrlModel image;

    @C09CT("name")
    public String name;

    public MultiImageUrlInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiImageUrlInfo)) {
            return false;
        }
        MultiImageUrlInfo multiImageUrlInfo = (MultiImageUrlInfo) obj;
        return Intrinsics.LJFF(this.name, multiImageUrlInfo.name) && Intrinsics.LJFF(this.image, multiImageUrlInfo.image);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiImageUrlInfo(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiImageUrlInfo(String str, UrlModel urlModel) {
        this.name = str;
        this.image = urlModel;
    }
}
