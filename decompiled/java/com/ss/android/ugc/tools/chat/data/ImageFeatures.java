package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ImageFeatures {

    @C09CT("face:client")
    public final FaceClientFeature faceClient;

    public ImageFeatures() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageFeatures) && Intrinsics.LJFF(this.faceClient, ((ImageFeatures) obj).faceClient);
    }

    public final int hashCode() {
        FaceClientFeature faceClientFeature = this.faceClient;
        if (faceClientFeature == null) {
            return 0;
        }
        return faceClientFeature.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageFeatures(faceClient=");
        sbLIZ.append(this.faceClient);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageFeatures(FaceClientFeature faceClientFeature) {
        this.faceClient = faceClientFeature;
    }
}
