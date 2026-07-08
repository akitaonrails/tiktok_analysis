package com.ss.android.ugc.aweme.portrait.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.RefType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class RefType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RefType[] $VALUES;
    public static final Parcelable.Creator<RefType> CREATOR;
    public static final RefType REUSE_ALL;
    public static final RefType REUSE_IMAGE;
    public static final RefType REUSE_NONE;
    public static final RefType REUSE_PROMPT;
    public static final RefType UNDEFINED;
    public final int value;

    public static InterfaceC2044707zh<RefType> getEntries() {
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
        RefType refType = new RefType("UNDEFINED", 0, 0);
        UNDEFINED = refType;
        RefType refType2 = new RefType("REUSE_ALL", 1, 1);
        REUSE_ALL = refType2;
        RefType refType3 = new RefType("REUSE_PROMPT", 2, 2);
        REUSE_PROMPT = refType3;
        RefType refType4 = new RefType("REUSE_IMAGE", 3, 3);
        REUSE_IMAGE = refType4;
        RefType refType5 = new RefType("REUSE_NONE", 4, -1);
        REUSE_NONE = refType5;
        RefType[] refTypeArr = {refType, refType2, refType3, refType4, refType5};
        $VALUES = refTypeArr;
        $ENTRIES = new C2254308sP(refTypeArr);
        CREATOR = new Parcelable.Creator<RefType>() { // from class: X.0LiR
            @Override // android.os.Parcelable.Creator
            public final RefType createFromParcel(Parcel parcel) {
                return RefType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RefType[] newArray(int i) {
                return new RefType[i];
            }
        };
    }

    public static RefType[] values() {
        return (RefType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static RefType valueOf(String str) {
        return (RefType) C08FF.LIZ(RefType.class, str);
    }

    public RefType(String str, int i, int i2) {
        this.value = i2;
    }
}
