package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadImageParam implements Parcelable {
    public static final Parcelable.Creator<UploadImageParam> CREATOR = new Parcelable.Creator<UploadImageParam>() { // from class: X.08zg
        @Override // android.os.Parcelable.Creator
        public final UploadImageParam createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new UploadImageParam(string, i, i2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadImageParam[] newArray(int i) {
            return new UploadImageParam[i];
        }
    };

    @C09CT("height")
    public final int height;

    @C09CT("path")
    public final String path;

    @C09CT("show_mask")
    public final boolean showMask;

    @C09CT("width")
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadImageParam)) {
            return false;
        }
        UploadImageParam uploadImageParam = (UploadImageParam) obj;
        return Intrinsics.LJFF(this.path, uploadImageParam.path) && this.width == uploadImageParam.width && this.height == uploadImageParam.height && this.showMask == uploadImageParam.showMask;
    }

    public final int hashCode() {
        return (((((this.path.hashCode() * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Z2(this.showMask);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadImageParam(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", showMask=");
        sbLIZ.append(this.showMask);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.showMask ? 1 : 0);
    }

    public UploadImageParam() {
        this("", -1, -1, false);
    }

    public UploadImageParam(String str, int i, int i2, boolean z) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.showMask = z;
    }
}
