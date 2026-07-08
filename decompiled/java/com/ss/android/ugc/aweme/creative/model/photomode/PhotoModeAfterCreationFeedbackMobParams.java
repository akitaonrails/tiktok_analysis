package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModeAfterCreationFeedbackMobParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<PhotoModeAfterCreationFeedbackMobParams> CREATOR = new Parcelable.Creator<PhotoModeAfterCreationFeedbackMobParams>() { // from class: X.0Kqr
        @Override // android.os.Parcelable.Creator
        public final PhotoModeAfterCreationFeedbackMobParams createFromParcel(Parcel parcel) {
            return new PhotoModeAfterCreationFeedbackMobParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeAfterCreationFeedbackMobParams[] newArray(int i) {
            return new PhotoModeAfterCreationFeedbackMobParams[i];
        }
    };

    @C09CT("info_photo_boosted_feedback_h5_enter_method")
    public final String boostedH5EnterMethod;

    @C09CT("info_photo_boosted_feedback_h5_shoot_position")
    public final String boostedH5EnterPosition;

    public PhotoModeAfterCreationFeedbackMobParams() {
        this(null, null);
    }

    public final PhotoModeAfterCreationFeedbackMobParams copy(String str, String str2) {
        return new PhotoModeAfterCreationFeedbackMobParams(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeAfterCreationFeedbackMobParams)) {
            return false;
        }
        PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = (PhotoModeAfterCreationFeedbackMobParams) obj;
        return Intrinsics.LJFF(this.boostedH5EnterMethod, photoModeAfterCreationFeedbackMobParams.boostedH5EnterMethod) && Intrinsics.LJFF(this.boostedH5EnterPosition, photoModeAfterCreationFeedbackMobParams.boostedH5EnterPosition);
    }

    public int hashCode() {
        String str = this.boostedH5EnterMethod;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.boostedH5EnterPosition;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeAfterCreationFeedbackMobParams(boostedH5EnterMethod=");
        sbLIZ.append(this.boostedH5EnterMethod);
        sbLIZ.append(", boostedH5EnterPosition=");
        sbLIZ.append(this.boostedH5EnterPosition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.boostedH5EnterMethod);
        parcel.writeString(this.boostedH5EnterPosition);
    }

    public final String getBoostedH5EnterMethod() {
        return this.boostedH5EnterMethod;
    }

    public final String getBoostedH5EnterPosition() {
        return this.boostedH5EnterPosition;
    }

    public PhotoModeAfterCreationFeedbackMobParams(String str, String str2) {
        this.boostedH5EnterMethod = str;
        this.boostedH5EnterPosition = str2;
    }
}
