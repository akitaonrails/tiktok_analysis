package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C040H;
import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class TabType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TabType[] $VALUES;
    public static final Parcelable.Creator<TabType> CREATOR;
    public static final TabType PHOTO;
    public static final TabType PHOTO_AND_VIDEO;
    public static final TabType VIDEO;

    @C040H
    public final int type;

    public static InterfaceC2044707zh<TabType> getEntries() {
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
        TabType tabType = new TabType("PHOTO", 0, 0);
        PHOTO = tabType;
        TabType tabType2 = new TabType("PHOTO_AND_VIDEO", 1, 1);
        PHOTO_AND_VIDEO = tabType2;
        TabType tabType3 = new TabType("VIDEO", 2, 2);
        VIDEO = tabType3;
        TabType[] tabTypeArr = {tabType, tabType2, tabType3};
        $VALUES = tabTypeArr;
        $ENTRIES = new C2254308sP(tabTypeArr);
        CREATOR = new Parcelable.Creator<TabType>() { // from class: X.0L9J
            @Override // android.os.Parcelable.Creator
            public final TabType createFromParcel(Parcel parcel) {
                return TabType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TabType[] newArray(int i) {
                return new TabType[i];
            }
        };
    }

    public static TabType[] values() {
        return (TabType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static TabType valueOf(String str) {
        return (TabType) C08FF.LIZ(TabType.class, str);
    }

    public TabType(String str, int i, int i2) {
        this.type = i2;
    }
}
