package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IMPersonalizedRecommendationParams implements Parcelable {
    public static final Parcelable.Creator<IMPersonalizedRecommendationParams> CREATOR = new Parcelable.Creator<IMPersonalizedRecommendationParams>() { // from class: X.0Hob
        @Override // android.os.Parcelable.Creator
        public final IMPersonalizedRecommendationParams createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new IMPersonalizedRecommendationParams(string, numValueOf, string2, string3, lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IMPersonalizedRecommendationParams[] newArray(int i) {
            return new IMPersonalizedRecommendationParams[i];
        }
    };
    public final Long activeDays;
    public final String chatType;
    public final String conversationId;
    public final String inputLanguage;
    public final Integer networkQualityType;
    public final String networkType;
    public final String toUserId;

    public final IMPersonalizedRecommendationParams copy(String str, Integer num, String str2, String str3, Long l, String str4, String str5) {
        return new IMPersonalizedRecommendationParams(str, num, str2, str3, l, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMPersonalizedRecommendationParams)) {
            return false;
        }
        IMPersonalizedRecommendationParams iMPersonalizedRecommendationParams = (IMPersonalizedRecommendationParams) obj;
        return Intrinsics.LJFF(this.toUserId, iMPersonalizedRecommendationParams.toUserId) && Intrinsics.LJFF(this.networkQualityType, iMPersonalizedRecommendationParams.networkQualityType) && Intrinsics.LJFF(this.networkType, iMPersonalizedRecommendationParams.networkType) && Intrinsics.LJFF(this.chatType, iMPersonalizedRecommendationParams.chatType) && Intrinsics.LJFF(this.activeDays, iMPersonalizedRecommendationParams.activeDays) && Intrinsics.LJFF(this.conversationId, iMPersonalizedRecommendationParams.conversationId) && Intrinsics.LJFF(this.inputLanguage, iMPersonalizedRecommendationParams.inputLanguage);
    }

    public int hashCode() {
        String str = this.toUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.networkQualityType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.networkType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chatType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.activeDays;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.conversationId;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.inputLanguage.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMPersonalizedRecommendationParams(toUserId=");
        sbLIZ.append(this.toUserId);
        sbLIZ.append(", networkQualityType=");
        sbLIZ.append(this.networkQualityType);
        sbLIZ.append(", networkType=");
        sbLIZ.append(this.networkType);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.chatType);
        sbLIZ.append(", activeDays=");
        sbLIZ.append(this.activeDays);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", inputLanguage=");
        sbLIZ.append(this.inputLanguage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.toUserId);
        Integer num = this.networkQualityType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.networkType);
        parcel.writeString(this.chatType);
        Long l = this.activeDays;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.conversationId);
        parcel.writeString(this.inputLanguage);
    }

    public final Long getActiveDays() {
        return this.activeDays;
    }

    public final String getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getInputLanguage() {
        return this.inputLanguage;
    }

    public final Integer getNetworkQualityType() {
        return this.networkQualityType;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getToUserId() {
        return this.toUserId;
    }

    public IMPersonalizedRecommendationParams(String str, Integer num, String str2, String str3, Long l, String str4, String str5) {
        this.toUserId = str;
        this.networkQualityType = num;
        this.networkType = str2;
        this.chatType = str3;
        this.activeDays = l;
        this.conversationId = str4;
        this.inputLanguage = str5;
    }
}
