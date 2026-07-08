package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MvNetFileBean implements Serializable, Parcelable {
    public static final Parcelable.Creator<MvNetFileBean> CREATOR = new Parcelable.Creator<MvNetFileBean>() { // from class: X.09bi
        @Override // android.os.Parcelable.Creator
        public final MvNetFileBean createFromParcel(Parcel parcel) {
            return new MvNetFileBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MvNetFileBean[] newArray(int i) {
            return new MvNetFileBean[i];
        }
    };

    @C09CT("algorithm")
    public final String algorithm;

    @C09CT("filePath")
    @C0MY0
    public final String filePath;

    @C09CT("jsonParams")
    public final String jsonParams;

    @C09CT("photo_path")
    @C0MY0
    public final String photonPath;

    public final MvNetFileBean copy(String str, String str2, String str3, String str4) {
        return new MvNetFileBean(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MvNetFileBean)) {
            return false;
        }
        MvNetFileBean mvNetFileBean = (MvNetFileBean) obj;
        return Intrinsics.LJFF(this.photonPath, mvNetFileBean.photonPath) && Intrinsics.LJFF(this.algorithm, mvNetFileBean.algorithm) && Intrinsics.LJFF(this.filePath, mvNetFileBean.filePath) && Intrinsics.LJFF(this.jsonParams, mvNetFileBean.jsonParams);
    }

    public int hashCode() {
        return (((((this.photonPath.hashCode() * 31) + this.algorithm.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.jsonParams.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MvNetFileBean(photonPath=");
        sbLIZ.append(this.photonPath);
        sbLIZ.append(", algorithm=");
        sbLIZ.append(this.algorithm);
        sbLIZ.append(", filePath=");
        sbLIZ.append(this.filePath);
        sbLIZ.append(", jsonParams=");
        sbLIZ.append(this.jsonParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photonPath);
        parcel.writeString(this.algorithm);
        parcel.writeString(this.filePath);
        parcel.writeString(this.jsonParams);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getJsonParams() {
        return this.jsonParams;
    }

    public final String getPhotonPath() {
        return this.photonPath;
    }

    public MvNetFileBean(String str, String str2, String str3, String str4) {
        this.photonPath = str;
        this.algorithm = str2;
        this.filePath = str3;
        this.jsonParams = str4;
    }
}
