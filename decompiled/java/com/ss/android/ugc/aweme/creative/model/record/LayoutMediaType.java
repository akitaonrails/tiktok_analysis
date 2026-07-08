package com.ss.android.ugc.aweme.creative.model.record;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LayoutMediaType implements Serializable, Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LayoutMediaType[] $VALUES;
    public static final Parcelable.Creator<LayoutMediaType> CREATOR;
    public static final LayoutMediaType LIVE_PHOTO;
    public static final LayoutMediaType PHOTO;
    public static final LayoutMediaType VIDEO;

    @C09CT("media_type")
    public final int value;

    public static InterfaceC2044707zh<LayoutMediaType> getEntries() {
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
        LayoutMediaType layoutMediaType = new LayoutMediaType("PHOTO", 0, 0);
        PHOTO = layoutMediaType;
        LayoutMediaType layoutMediaType2 = new LayoutMediaType("VIDEO", 1, 1);
        VIDEO = layoutMediaType2;
        LayoutMediaType layoutMediaType3 = new LayoutMediaType("LIVE_PHOTO", 2, 2);
        LIVE_PHOTO = layoutMediaType3;
        LayoutMediaType[] layoutMediaTypeArr = {layoutMediaType, layoutMediaType2, layoutMediaType3};
        $VALUES = layoutMediaTypeArr;
        $ENTRIES = new C2254308sP(layoutMediaTypeArr);
        CREATOR = new Parcelable.Creator<LayoutMediaType>() { // from class: X.0L9W
            @Override // android.os.Parcelable.Creator
            public final LayoutMediaType createFromParcel(Parcel parcel) {
                return LayoutMediaType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutMediaType[] newArray(int i) {
                return new LayoutMediaType[i];
            }
        };
    }

    public static LayoutMediaType[] values() {
        return (LayoutMediaType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static LayoutMediaType valueOf(String str) {
        return (LayoutMediaType) C08FF.LIZ(LayoutMediaType.class, str);
    }

    public LayoutMediaType(String str, int i, int i2) {
        this.value = i2;
    }
}
