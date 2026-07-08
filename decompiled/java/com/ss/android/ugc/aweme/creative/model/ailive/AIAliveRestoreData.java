package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.AIAliveRestoreData;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIAliveRestoreData implements Parcelable {
    public static final Parcelable.Creator<AIAliveRestoreData> CREATOR = new Parcelable.Creator<AIAliveRestoreData>() { // from class: X.0Lvt
        @Override // android.os.Parcelable.Creator
        public final AIAliveRestoreData createFromParcel(Parcel parcel) {
            LivePhotoModel livePhotoModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                livePhotoModelCreateFromParcel = null;
            } else {
                livePhotoModelCreateFromParcel = LivePhotoModel.CREATOR.createFromParcel(parcel);
            }
            return new AIAliveRestoreData(livePhotoModelCreateFromParcel, (MultiEditVideoStatusRecordData) parcel.readParcelable(AIAliveRestoreData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AIAliveRestoreData[] newArray(int i) {
            return new AIAliveRestoreData[i];
        }
    };

    @C09CT("live_photo_model")
    public LivePhotoModel livePhotoModel;

    @C09CT("record_data")
    public MultiEditVideoStatusRecordData recordData;

    public AIAliveRestoreData() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIAliveRestoreData)) {
            return false;
        }
        AIAliveRestoreData aIAliveRestoreData = (AIAliveRestoreData) obj;
        return Intrinsics.LJFF(this.livePhotoModel, aIAliveRestoreData.livePhotoModel) && Intrinsics.LJFF(this.recordData, aIAliveRestoreData.recordData);
    }

    public final int hashCode() {
        LivePhotoModel livePhotoModel = this.livePhotoModel;
        int iHashCode = (livePhotoModel == null ? 0 : livePhotoModel.hashCode()) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.recordData;
        return iHashCode + (multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIAliveRestoreData(livePhotoModel=");
        sbLIZ.append(this.livePhotoModel);
        sbLIZ.append(", recordData=");
        sbLIZ.append(this.recordData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LivePhotoModel livePhotoModel = this.livePhotoModel;
        if (livePhotoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livePhotoModel.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.recordData, i);
    }

    public AIAliveRestoreData(LivePhotoModel livePhotoModel, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        this.livePhotoModel = livePhotoModel;
        this.recordData = multiEditVideoStatusRecordData;
    }
}
