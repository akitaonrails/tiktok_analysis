package com.ss.android.ugc.mediabox.bgplay.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayAbilityConfig;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayDataModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class BgPlayDataModel implements Parcelable {
    public static final Parcelable.Creator<BgPlayDataModel> CREATOR = new Parcelable.Creator<BgPlayDataModel>() { // from class: X.0pTY
        @Override // android.os.Parcelable.Creator
        public final BgPlayDataModel createFromParcel(Parcel parcel) {
            BgPlayAbilityConfig bgPlayAbilityConfigCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                bgPlayAbilityConfigCreateFromParcel = null;
            } else {
                bgPlayAbilityConfigCreateFromParcel = BgPlayAbilityConfig.CREATOR.createFromParcel(parcel);
            }
            return new BgPlayDataModel(string, string2, string3, string4, string5, string6, i, i2, bgPlayAbilityConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BgPlayDataModel[] newArray(int i) {
            return new BgPlayDataModel[i];
        }
    };
    public final String aid;
    public final String appName;
    public final BgPlayAbilityConfig bgPlayAbilityConfig;
    public final String coverImageUrl;
    public final String desc;
    public final int duration;
    public int notificationSmallIconRes;
    public String userAvatarUrl;
    public String userName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BgPlayDataModel)) {
            return false;
        }
        BgPlayDataModel bgPlayDataModel = (BgPlayDataModel) obj;
        return Intrinsics.LJFF(this.aid, bgPlayDataModel.aid) && Intrinsics.LJFF(this.desc, bgPlayDataModel.desc) && Intrinsics.LJFF(this.coverImageUrl, bgPlayDataModel.coverImageUrl) && Intrinsics.LJFF(this.userName, bgPlayDataModel.userName) && Intrinsics.LJFF(this.userAvatarUrl, bgPlayDataModel.userAvatarUrl) && Intrinsics.LJFF(this.appName, bgPlayDataModel.appName) && this.notificationSmallIconRes == bgPlayDataModel.notificationSmallIconRes && this.duration == bgPlayDataModel.duration && Intrinsics.LJFF(this.bgPlayAbilityConfig, bgPlayDataModel.bgPlayAbilityConfig);
    }

    public final int hashCode() {
        int iHashCode = ((this.aid.hashCode() * 31) + this.desc.hashCode()) * 31;
        String str = this.coverImageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.userName.hashCode()) * 31;
        String str2 = this.userAvatarUrl;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.appName.hashCode()) * 31) + this.notificationSmallIconRes) * 31) + this.duration) * 31;
        BgPlayAbilityConfig bgPlayAbilityConfig = this.bgPlayAbilityConfig;
        return iHashCode3 + (bgPlayAbilityConfig != null ? bgPlayAbilityConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BgPlayDataModel(aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", coverImageUrl=");
        sbLIZ.append(this.coverImageUrl);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", userAvatarUrl=");
        sbLIZ.append(this.userAvatarUrl);
        sbLIZ.append(", appName=");
        sbLIZ.append(this.appName);
        sbLIZ.append(", notificationSmallIconRes=");
        sbLIZ.append(this.notificationSmallIconRes);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", bgPlayAbilityConfig=");
        sbLIZ.append(this.bgPlayAbilityConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeString(this.desc);
        parcel.writeString(this.coverImageUrl);
        parcel.writeString(this.userName);
        parcel.writeString(this.userAvatarUrl);
        parcel.writeString(this.appName);
        parcel.writeInt(this.notificationSmallIconRes);
        parcel.writeInt(this.duration);
        BgPlayAbilityConfig bgPlayAbilityConfig = this.bgPlayAbilityConfig;
        if (bgPlayAbilityConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bgPlayAbilityConfig.writeToParcel(parcel, i);
        }
    }

    public BgPlayDataModel(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, BgPlayAbilityConfig bgPlayAbilityConfig) {
        this.aid = str;
        this.desc = str2;
        this.coverImageUrl = str3;
        this.userName = str4;
        this.userAvatarUrl = str5;
        this.appName = str6;
        this.notificationSmallIconRes = i;
        this.duration = i2;
        this.bgPlayAbilityConfig = bgPlayAbilityConfig;
    }
}
