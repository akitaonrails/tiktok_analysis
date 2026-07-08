package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.AlbumUpdateShareParam;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumUpdateShareParam implements Parcelable {
    public static final Parcelable.Creator<AlbumUpdateShareParam> CREATOR = new Parcelable.Creator<AlbumUpdateShareParam>() { // from class: X.0LpW
        @Override // android.os.Parcelable.Creator
        public final AlbumUpdateShareParam createFromParcel(Parcel parcel) {
            return new AlbumUpdateShareParam((MediaModel) parcel.readParcelable(AlbumUpdateShareParam.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumUpdateShareParam[] newArray(int i) {
            return new AlbumUpdateShareParam[i];
        }
    };
    public final MediaModel mediaModel;
    public final String sessionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumUpdateShareParam)) {
            return false;
        }
        AlbumUpdateShareParam albumUpdateShareParam = (AlbumUpdateShareParam) obj;
        return Intrinsics.LJFF(this.sessionId, albumUpdateShareParam.sessionId) && Intrinsics.LJFF(this.mediaModel, albumUpdateShareParam.mediaModel);
    }

    public final int hashCode() {
        return (this.sessionId.hashCode() * 31) + this.mediaModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumUpdateShareParam(sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(", mediaModel=");
        sbLIZ.append(this.mediaModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        parcel.writeParcelable(this.mediaModel, i);
    }

    public AlbumUpdateShareParam(MediaModel mediaModel, String str) {
        this.sessionId = str;
        this.mediaModel = mediaModel;
    }
}
