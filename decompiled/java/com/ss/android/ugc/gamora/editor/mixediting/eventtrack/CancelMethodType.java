package com.ss.android.ugc.gamora.editor.mixediting.eventtrack;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.mixediting.eventtrack.CancelMethodType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CancelMethodType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CancelMethodType[] $VALUES;
    public static final CancelMethodType CANCEL;
    public static final Parcelable.Creator<CancelMethodType> CREATOR;
    public static final CancelMethodType EMPTY;
    public final String description;

    public static InterfaceC2044707zh<CancelMethodType> getEntries() {
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
        CancelMethodType cancelMethodType = new CancelMethodType("CANCEL", 0, "cancel");
        CANCEL = cancelMethodType;
        CancelMethodType cancelMethodType2 = new CancelMethodType("EMPTY", 1, "empty");
        EMPTY = cancelMethodType2;
        CancelMethodType[] cancelMethodTypeArr = {cancelMethodType, cancelMethodType2};
        $VALUES = cancelMethodTypeArr;
        $ENTRIES = new C2254308sP(cancelMethodTypeArr);
        CREATOR = new Parcelable.Creator<CancelMethodType>() { // from class: X.0mrq
            @Override // android.os.Parcelable.Creator
            public final CancelMethodType createFromParcel(Parcel parcel) {
                return CancelMethodType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CancelMethodType[] newArray(int i) {
                return new CancelMethodType[i];
            }
        };
    }

    public static CancelMethodType[] values() {
        return (CancelMethodType[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public static CancelMethodType valueOf(String str) {
        return (CancelMethodType) C08FF.LIZ(CancelMethodType.class, str);
    }

    public CancelMethodType(String str, int i, String str2) {
        this.description = str2;
    }
}
