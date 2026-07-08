package com.ss.android.ugc.cut_ui;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.CutSourceType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CutSourceType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CutSourceType[] $VALUES;
    public static final Parcelable.Creator<CutSourceType> CREATOR;
    public static final CutSourceType JSON;
    public static final CutSourceType NEW;
    public static final CutSourceType URL;
    public static final CutSourceType WORKSPACE;
    public static final CutSourceType ZIP;
    public final String desc;

    public static InterfaceC2044707zh<CutSourceType> getEntries() {
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
        CutSourceType cutSourceType = new CutSourceType("URL", 0, "url");
        URL = cutSourceType;
        CutSourceType cutSourceType2 = new CutSourceType("ZIP", 1, "zip");
        ZIP = cutSourceType2;
        CutSourceType cutSourceType3 = new CutSourceType("JSON", 2, "json");
        JSON = cutSourceType3;
        CutSourceType cutSourceType4 = new CutSourceType("WORKSPACE", 3, "workspace");
        WORKSPACE = cutSourceType4;
        CutSourceType cutSourceType5 = new CutSourceType("NEW", 4, "new");
        NEW = cutSourceType5;
        CutSourceType[] cutSourceTypeArr = {cutSourceType, cutSourceType2, cutSourceType3, cutSourceType4, cutSourceType5};
        $VALUES = cutSourceTypeArr;
        $ENTRIES = new C2254308sP(cutSourceTypeArr);
        CREATOR = new Parcelable.Creator<CutSourceType>() { // from class: X.0nHz
            @Override // android.os.Parcelable.Creator
            public final CutSourceType createFromParcel(Parcel parcel) {
                return CutSourceType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CutSourceType[] newArray(int i) {
                return new CutSourceType[i];
            }
        };
    }

    public static CutSourceType[] values() {
        return (CutSourceType[]) $VALUES.clone();
    }

    public final String getDesc() {
        return this.desc;
    }

    public static CutSourceType valueOf(String str) {
        return (CutSourceType) C08FF.LIZ(CutSourceType.class, str);
    }

    public CutSourceType(String str, int i, String str2) {
        this.desc = str2;
    }
}
