package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PcsCourseVideoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PcsCourseVideoModel implements Parcelable {
    public static final Parcelable.Creator<PcsCourseVideoModel> CREATOR = new Parcelable.Creator<PcsCourseVideoModel>() { // from class: X.0nWc
        @Override // android.os.Parcelable.Creator
        public final PcsCourseVideoModel createFromParcel(Parcel parcel) {
            return new PcsCourseVideoModel(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PcsCourseVideoModel[] newArray(int i) {
            return new PcsCourseVideoModel[i];
        }
    };

    @C040H
    public long anchorId;

    @C040H
    public long courseId;

    @C040H
    public String localFilePath;

    @C040H
    public String videoTitle;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcsCourseVideoModel)) {
            return false;
        }
        PcsCourseVideoModel pcsCourseVideoModel = (PcsCourseVideoModel) obj;
        return this.courseId == pcsCourseVideoModel.courseId && this.anchorId == pcsCourseVideoModel.anchorId && Intrinsics.LJFF(this.videoTitle, pcsCourseVideoModel.videoTitle) && Intrinsics.LJFF(this.localFilePath, pcsCourseVideoModel.localFilePath);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.courseId) * 31) + C786410Ut5.Y2(this.anchorId)) * 31) + this.videoTitle.hashCode()) * 31) + this.localFilePath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCourseVideoModel(courseId=");
        sbLIZ.append(this.courseId);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.anchorId);
        sbLIZ.append(", videoTitle=");
        sbLIZ.append(this.videoTitle);
        sbLIZ.append(", localFilePath=");
        sbLIZ.append(this.localFilePath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.courseId);
        parcel.writeLong(this.anchorId);
        parcel.writeString(this.videoTitle);
        parcel.writeString(this.localFilePath);
    }

    public /* synthetic */ PcsCourseVideoModel(long j, long j2) {
        this(j, j2, "", "");
    }

    public PcsCourseVideoModel(long j, long j2, String str, String str2) {
        this.courseId = j;
        this.anchorId = j2;
        this.videoTitle = str;
        this.localFilePath = str2;
    }
}
