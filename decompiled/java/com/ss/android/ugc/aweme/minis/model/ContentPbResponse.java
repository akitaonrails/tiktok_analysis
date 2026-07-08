package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.minis.model.ContentPbResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentPbResponse implements Parcelable {

    @C09CT("business_id")
    public final String businessId;

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<ContentPbResponse> CREATOR = new Parcelable.Creator<ContentPbResponse>() { // from class: X.0iHt
        @Override // android.os.Parcelable.Creator
        public final ContentPbResponse createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ContentPbResponse(string, string2, string3, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContentPbResponse[] newArray(int i) {
            return new ContentPbResponse[i];
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
        if (!(obj instanceof ContentPbResponse)) {
            return false;
        }
        ContentPbResponse contentPbResponse = (ContentPbResponse) obj;
        return Intrinsics.LJFF(this.businessId, contentPbResponse.businessId) && Intrinsics.LJFF(this.contentPb, contentPbResponse.contentPb) && Intrinsics.LJFF(this.scene, contentPbResponse.scene) && Intrinsics.LJFF(this.statusCode, contentPbResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, contentPbResponse.statusMsg);
    }

    public final int hashCode() {
        String str = this.businessId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentPb;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scene;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.statusMsg;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentPbResponse(businessId=");
        sbLIZ.append(this.businessId);
        sbLIZ.append(", contentPb=");
        sbLIZ.append(this.contentPb);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.businessId);
        parcel.writeString(this.contentPb);
        parcel.writeString(this.scene);
        Integer num = this.statusCode;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.statusMsg);
    }

    public ContentPbResponse(String str, String str2, String str3, Integer num, String str4) {
        this.businessId = str;
        this.contentPb = str2;
        this.scene = str3;
        this.statusCode = num;
        this.statusMsg = str4;
    }
}
