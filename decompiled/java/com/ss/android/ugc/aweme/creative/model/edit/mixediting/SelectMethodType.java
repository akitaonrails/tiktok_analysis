package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SelectMethodType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SelectMethodType[] $VALUES;
    public static final SelectMethodType AUTO;
    public static final Parcelable.Creator<SelectMethodType> CREATOR;
    public static final SelectMethodType MANUAL;
    public static final SelectMethodType MANUAL_CLICK_COVER;
    public static final SelectMethodType MANUAL_SWIPE_LIST;
    public static final SelectMethodType MANUAL_SWIPE_SCREEN;
    public static final SelectMethodType UNSELECT;
    public final String description;

    public static InterfaceC2044707zh<SelectMethodType> getEntries() {
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
        SelectMethodType selectMethodType = new SelectMethodType("UNSELECT", 0, "unselect");
        UNSELECT = selectMethodType;
        SelectMethodType selectMethodType2 = new SelectMethodType("AUTO", 1, "auto");
        AUTO = selectMethodType2;
        SelectMethodType selectMethodType3 = new SelectMethodType("MANUAL", 2, "manual");
        MANUAL = selectMethodType3;
        SelectMethodType selectMethodType4 = new SelectMethodType("MANUAL_CLICK_COVER", 3, "manual_click_cover");
        MANUAL_CLICK_COVER = selectMethodType4;
        SelectMethodType selectMethodType5 = new SelectMethodType("MANUAL_SWIPE_LIST", 4, "manual_swipe_list");
        MANUAL_SWIPE_LIST = selectMethodType5;
        SelectMethodType selectMethodType6 = new SelectMethodType("MANUAL_SWIPE_SCREEN", 5, "manual_swipe_screen");
        MANUAL_SWIPE_SCREEN = selectMethodType6;
        SelectMethodType[] selectMethodTypeArr = {selectMethodType, selectMethodType2, selectMethodType3, selectMethodType4, selectMethodType5, selectMethodType6};
        $VALUES = selectMethodTypeArr;
        $ENTRIES = new C2254308sP(selectMethodTypeArr);
        CREATOR = new Parcelable.Creator<SelectMethodType>() { // from class: X.0mry
            @Override // android.os.Parcelable.Creator
            public final SelectMethodType createFromParcel(Parcel parcel) {
                return SelectMethodType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SelectMethodType[] newArray(int i) {
                return new SelectMethodType[i];
            }
        };
    }

    public static SelectMethodType[] values() {
        return (SelectMethodType[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public static SelectMethodType valueOf(String str) {
        return (SelectMethodType) C08FF.LIZ(SelectMethodType.class, str);
    }

    public SelectMethodType(String str, int i, String str2) {
        this.description = str2;
    }
}
