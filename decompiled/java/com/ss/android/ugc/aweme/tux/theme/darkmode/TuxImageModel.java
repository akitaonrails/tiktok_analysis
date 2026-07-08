package com.ss.android.ugc.aweme.tux.theme.darkmode;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TuxImageModel implements Serializable {

    @C09CT("dark_image_url")
    public final ImageUrlModel imageUrlDark;

    @C09CT("image_url")
    public final ImageUrlModel imageUrlLight;

    @C09CT("local_image_url")
    public final ImageUrlModel imageUrlLocal;

    @C09CT("min_local_version")
    public final long minLocalVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TuxImageModel)) {
            return false;
        }
        TuxImageModel tuxImageModel = (TuxImageModel) obj;
        return this.minLocalVersion == tuxImageModel.minLocalVersion && Intrinsics.LJFF(this.imageUrlLocal, tuxImageModel.imageUrlLocal) && Intrinsics.LJFF(this.imageUrlLight, tuxImageModel.imageUrlLight) && Intrinsics.LJFF(this.imageUrlDark, tuxImageModel.imageUrlDark);
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.minLocalVersion) * 31;
        ImageUrlModel imageUrlModel = this.imageUrlLocal;
        int iHashCode = (iY2 + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31;
        ImageUrlModel imageUrlModel2 = this.imageUrlLight;
        int iHashCode2 = (iHashCode + (imageUrlModel2 == null ? 0 : imageUrlModel2.hashCode())) * 31;
        ImageUrlModel imageUrlModel3 = this.imageUrlDark;
        return iHashCode2 + (imageUrlModel3 != null ? imageUrlModel3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxImageModel(minLocalVersion=");
        sbLIZ.append(this.minLocalVersion);
        sbLIZ.append(", imageUrlLocal=");
        sbLIZ.append(this.imageUrlLocal);
        sbLIZ.append(", imageUrlLight=");
        sbLIZ.append(this.imageUrlLight);
        sbLIZ.append(", imageUrlDark=");
        sbLIZ.append(this.imageUrlDark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TuxImageModel(long j, ImageUrlModel imageUrlModel, ImageUrlModel imageUrlModel2, ImageUrlModel imageUrlModel3) {
        this.minLocalVersion = j;
        this.imageUrlLocal = imageUrlModel;
        this.imageUrlLight = imageUrlModel2;
        this.imageUrlDark = imageUrlModel3;
    }
}
