package com.ss.android.ugc.aweme.creative.model.record;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.LayoutPlayerType;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LayoutPlayerType implements Serializable, Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LayoutPlayerType[] $VALUES;
    public static final Parcelable.Creator<LayoutPlayerType> CREATOR;
    public static final LayoutPlayerType NLE;
    public static final LayoutPlayerType SYS;

    @C09CT("player_type")
    public final String value;

    public static InterfaceC2044707zh<LayoutPlayerType> getEntries() {
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
        LayoutPlayerType layoutPlayerType = new LayoutPlayerType("NLE", 0, "nle");
        NLE = layoutPlayerType;
        LayoutPlayerType layoutPlayerType2 = new LayoutPlayerType("SYS", 1, "sys");
        SYS = layoutPlayerType2;
        LayoutPlayerType[] layoutPlayerTypeArr = {layoutPlayerType, layoutPlayerType2};
        $VALUES = layoutPlayerTypeArr;
        $ENTRIES = new C2254308sP(layoutPlayerTypeArr);
        CREATOR = new Parcelable.Creator<LayoutPlayerType>() { // from class: X.0LDN
            @Override // android.os.Parcelable.Creator
            public final LayoutPlayerType createFromParcel(Parcel parcel) {
                return LayoutPlayerType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutPlayerType[] newArray(int i) {
                return new LayoutPlayerType[i];
            }
        };
    }

    public static LayoutPlayerType[] values() {
        return (LayoutPlayerType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static LayoutPlayerType valueOf(String str) {
        return (LayoutPlayerType) C08FF.LIZ(LayoutPlayerType.class, str);
    }

    public LayoutPlayerType(String str, int i, String str2) {
        this.value = str2;
    }
}
