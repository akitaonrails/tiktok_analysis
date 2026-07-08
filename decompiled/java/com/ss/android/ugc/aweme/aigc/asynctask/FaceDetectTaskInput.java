package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceDetectTaskInput extends C09JG {

    @C09CT("image_url_list")
    public final List<String> imageUriList;

    @C09CT("source")
    public final Source source;

    public FaceDetectTaskInput() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceDetectTaskInput)) {
            return false;
        }
        FaceDetectTaskInput faceDetectTaskInput = (FaceDetectTaskInput) obj;
        return this.source == faceDetectTaskInput.source && Intrinsics.LJFF(this.imageUriList, faceDetectTaskInput.imageUriList);
    }

    public final int hashCode() {
        Source source = this.source;
        return ((source == null ? 0 : source.hashCode()) * 31) + this.imageUriList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceDetectTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", imageUriList=");
        sbLIZ.append(this.imageUriList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FaceDetectTaskInput(Source source, List<String> list) {
        this.source = source;
        this.imageUriList = list;
    }

    public FaceDetectTaskInput(Source source, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : source, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
