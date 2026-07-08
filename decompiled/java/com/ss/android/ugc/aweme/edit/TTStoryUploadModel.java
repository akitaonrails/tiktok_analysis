package com.ss.android.ugc.aweme.edit;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TTStoryUploadModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TTStoryUploadModel> CREATOR = new Parcelable.Creator<TTStoryUploadModel>() { // from class: X.0nP0
        @Override // android.os.Parcelable.Creator
        public final TTStoryUploadModel createFromParcel(Parcel parcel) {
            RevealStoryCreationModel revealStoryCreationModelCreateFromParcel;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                revealStoryCreationModelCreateFromParcel = null;
            } else {
                revealStoryCreationModelCreateFromParcel = RevealStoryCreationModel.CREATOR.createFromParcel(parcel);
            }
            return new TTStoryUploadModel(i, i2, i3, j, revealStoryCreationModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TTStoryUploadModel[] newArray(int i) {
            return new TTStoryUploadModel[i];
        }
    };

    @C09CT(alternate = {"c"}, value = "contentType")
    public final int contentType;

    @C09CT(alternate = {"a"}, value = "index")
    public final int index;

    @C040H
    public transient RevealStoryCreationModel revealStoryModel;

    @C09CT(alternate = {"d"}, value = "startPublishTime")
    public long startPublishTime;

    @C09CT(alternate = {"b"}, value = "totalCount")
    public final int totalCount;

    public TTStoryUploadModel() {
        this(0, 0, 0, 0L, null);
    }

    public final TTStoryUploadModel copy(int i, int i2, int i3, long j, RevealStoryCreationModel revealStoryCreationModel) {
        return new TTStoryUploadModel(i, i2, i3, j, revealStoryCreationModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTStoryUploadModel)) {
            return false;
        }
        TTStoryUploadModel tTStoryUploadModel = (TTStoryUploadModel) obj;
        return this.index == tTStoryUploadModel.index && this.totalCount == tTStoryUploadModel.totalCount && this.contentType == tTStoryUploadModel.contentType && this.startPublishTime == tTStoryUploadModel.startPublishTime && Intrinsics.LJFF(this.revealStoryModel, tTStoryUploadModel.revealStoryModel);
    }

    public int hashCode() {
        int iY2 = ((((((this.index * 31) + this.totalCount) * 31) + this.contentType) * 31) + C786410Ut5.Y2(this.startPublishTime)) * 31;
        RevealStoryCreationModel revealStoryCreationModel = this.revealStoryModel;
        return iY2 + (revealStoryCreationModel == null ? 0 : revealStoryCreationModel.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTStoryUploadModel(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", startPublishTime=");
        sbLIZ.append(this.startPublishTime);
        sbLIZ.append(", revealStoryModel=");
        sbLIZ.append(this.revealStoryModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.contentType);
        parcel.writeLong(this.startPublishTime);
        RevealStoryCreationModel revealStoryCreationModel = this.revealStoryModel;
        if (revealStoryCreationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            revealStoryCreationModel.writeToParcel(parcel, i);
        }
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final RevealStoryCreationModel getRevealStoryModel() {
        return this.revealStoryModel;
    }

    public final long getStartPublishTime() {
        return this.startPublishTime;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void setRevealStoryModel(RevealStoryCreationModel revealStoryCreationModel) {
        this.revealStoryModel = revealStoryCreationModel;
    }

    public final void setStartPublishTime(long j) {
        this.startPublishTime = j;
    }

    public TTStoryUploadModel(int i, int i2, int i3, long j, RevealStoryCreationModel revealStoryCreationModel) {
        this.index = i;
        this.totalCount = i2;
        this.contentType = i3;
        this.startPublishTime = j;
        this.revealStoryModel = revealStoryCreationModel;
    }
}
