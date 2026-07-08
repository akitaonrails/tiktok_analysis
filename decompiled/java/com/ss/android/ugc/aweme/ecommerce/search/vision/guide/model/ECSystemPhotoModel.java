package com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model.ECSystemPhotoModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ECSystemPhotoModel implements Parcelable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("path")
    public final String path;

    @C09CT("tns_detect_result")
    public Boolean tnsDetectResult;

    @C09CT("tos_uri")
    public String tosUri;

    @C09CT("update_time")
    public final Long updateTime;
    public static final Parcelable.Creator<ECSystemPhotoModel> CREATOR = new Parcelable.Creator<ECSystemPhotoModel>() { // from class: X.0NZd
        @Override // android.os.Parcelable.Creator
        public final ECSystemPhotoModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ECSystemPhotoModel(lValueOf, lValueOf2, string, string2, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ECSystemPhotoModel[] newArray(int i) {
            return new ECSystemPhotoModel[i];
        }
    };
    public static final int $stable = 8;

    public ECSystemPhotoModel() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECSystemPhotoModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(this.updateTime);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", tnsDetectResult=");
        sbLIZ.append(this.tnsDetectResult);
        sbLIZ.append(", tosUri=");
        sbLIZ.append(this.tosUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.updateTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.path);
        parcel.writeString(this.imageUrl);
        Boolean bool = this.tnsDetectResult;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.tosUri);
    }

    public final int hashCode() {
        Long l = this.id;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.updateTime;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.path;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.tnsDetectResult;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.tosUri;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ECSystemPhotoModel)) {
            return false;
        }
        ECSystemPhotoModel eCSystemPhotoModel = (ECSystemPhotoModel) obj;
        if (!Intrinsics.LJFF(this.id, eCSystemPhotoModel.id) || !Intrinsics.LJFF(this.updateTime, eCSystemPhotoModel.updateTime) || !Intrinsics.LJFF(this.path, eCSystemPhotoModel.path)) {
            return false;
        }
        return true;
    }

    public ECSystemPhotoModel(Long l, Long l2, String str, String str2, Boolean bool, String str3) {
        this.id = l;
        this.updateTime = l2;
        this.path = str;
        this.imageUrl = str2;
        this.tnsDetectResult = bool;
        this.tosUri = str3;
    }
}
