package com.ss.android.ugc.aweme.portrait.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class RefImageType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RefImageType[] $VALUES;
    public static final Parcelable.Creator<RefImageType> CREATOR;
    public static final RefImageType NONE;
    public static final RefImageType PRESET;
    public static final RefImageType USER_UPLOAD;
    public final int value;

    public static InterfaceC2044707zh<RefImageType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    static {
        RefImageType refImageType = new RefImageType("NONE", 0, 0);
        NONE = refImageType;
        RefImageType refImageType2 = new RefImageType("USER_UPLOAD", 1, 1);
        USER_UPLOAD = refImageType2;
        RefImageType refImageType3 = new RefImageType("PRESET", 2, 2);
        PRESET = refImageType3;
        RefImageType[] refImageTypeArr = {refImageType, refImageType2, refImageType3};
        $VALUES = refImageTypeArr;
        $ENTRIES = new C2254308sP(refImageTypeArr);
        CREATOR = new Parcelable.Creator<RefImageType>() { // from class: X.0LiQ
            @Override // android.os.Parcelable.Creator
            public final RefImageType createFromParcel(Parcel parcel) {
                return RefImageType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RefImageType[] newArray(int i) {
                return new RefImageType[i];
            }
        };
    }

    public static RefImageType[] values() {
        return (RefImageType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static RefImageType valueOf(String str) {
        return (RefImageType) C08FF.LIZ(RefImageType.class, str);
    }

    public RefImageType(String str, int i, int i2) {
        this.value = i2;
    }
}
