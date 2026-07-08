package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CompositionMediaItem {

    @C09CT("height")
    public final int height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("isVideo")
    public final boolean isVideo;

    @C09CT("uri")
    public final String uri;

    @C09CT("width")
    public final int width;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositionMediaItem)) {
            return false;
        }
        CompositionMediaItem compositionMediaItem = (CompositionMediaItem) obj;
        return Intrinsics.LJFF(this.id, compositionMediaItem.id) && Intrinsics.LJFF(this.uri, compositionMediaItem.uri) && this.isVideo == compositionMediaItem.isVideo && this.width == compositionMediaItem.width && this.height == compositionMediaItem.height;
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.uri.hashCode()) * 31) + C786410Ut5.Z2(this.isVideo)) * 31) + this.width) * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositionMediaItem(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.isVideo);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CompositionMediaItem() {
        this("", "", false, 0, 0);
    }

    public CompositionMediaItem(String str, String str2, boolean z, int i, int i2) {
        this.id = str;
        this.uri = str2;
        this.isVideo = z;
        this.width = i;
        this.height = i2;
    }
}
