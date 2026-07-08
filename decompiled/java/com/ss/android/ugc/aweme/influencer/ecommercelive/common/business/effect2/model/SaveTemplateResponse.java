package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SaveTemplateResponse implements Parcelable {

    @C09CT("review_msg")
    public final String reviewMsg;

    @C09CT("review_status")
    public final int reviewStatus;

    @C09CT("template_id")
    public final String templateId;
    public static final Parcelable.Creator<SaveTemplateResponse> CREATOR = new Parcelable.Creator<SaveTemplateResponse>() { // from class: X.0v7g
        @Override // android.os.Parcelable.Creator
        public final SaveTemplateResponse createFromParcel(Parcel parcel) {
            return new SaveTemplateResponse(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SaveTemplateResponse[] newArray(int i) {
            return new SaveTemplateResponse[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveTemplateResponse)) {
            return false;
        }
        SaveTemplateResponse saveTemplateResponse = (SaveTemplateResponse) obj;
        return Intrinsics.LJFF(this.templateId, saveTemplateResponse.templateId) && this.reviewStatus == saveTemplateResponse.reviewStatus && Intrinsics.LJFF(this.reviewMsg, saveTemplateResponse.reviewMsg);
    }

    public final int hashCode() {
        String str = this.templateId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reviewStatus) * 31;
        String str2 = this.reviewMsg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveTemplateResponse(templateId=");
        sbLIZ.append(this.templateId);
        sbLIZ.append(", reviewStatus=");
        sbLIZ.append(this.reviewStatus);
        sbLIZ.append(", reviewMsg=");
        sbLIZ.append(this.reviewMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeInt(this.reviewStatus);
        parcel.writeString(this.reviewMsg);
    }

    public SaveTemplateResponse(String str, int i, String str2) {
        this.templateId = str;
        this.reviewStatus = i;
        this.reviewMsg = str2;
    }
}
