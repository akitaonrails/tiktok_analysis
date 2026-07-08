package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SignatureExtraInfo implements Serializable, Parcelable {
    public static final CREATOR CREATOR = new CREATOR();

    @C09CT("end")
    public Integer endIndex;

    @C09CT("sec_uid")
    public String secUserId;

    @C09CT("start")
    public Integer startIndex;

    @C09CT("type")
    public int type;

    @C09CT("user_id")
    public String userId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SignatureExtraInfo() {
    }

    public final Integer getEndIndex() {
        return this.endIndex;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final Integer getStartIndex() {
        return this.startIndex;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public static final class CREATOR implements Parcelable.Creator<SignatureExtraInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SignatureExtraInfo createFromParcel(Parcel parcel) {
            return new SignatureExtraInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SignatureExtraInfo[] newArray(int i) {
            return new SignatureExtraInfo[i];
        }
    }

    public SignatureExtraInfo(Parcel parcel) {
        Integer num;
        this();
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        if (value instanceof Integer) {
            num = (Integer) value;
        } else {
            num = null;
        }
        this.endIndex = num;
        this.type = ((Integer) parcel.readValue(cls.getClassLoader())).intValue();
        Object value2 = parcel.readValue(cls.getClassLoader());
        this.startIndex = value2 instanceof Integer ? (Integer) value2 : null;
        this.userId = parcel.readString();
        this.secUserId = parcel.readString();
    }

    public final void setEndIndex(Integer num) {
        this.endIndex = num;
    }

    public final void setSecUserId(String str) {
        this.secUserId = str;
    }

    public final void setStartIndex(Integer num) {
        this.startIndex = num;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.endIndex);
        parcel.writeValue(Integer.valueOf(this.type));
        parcel.writeValue(this.startIndex);
        parcel.writeString(this.userId);
        parcel.writeString(this.secUserId);
    }
}
