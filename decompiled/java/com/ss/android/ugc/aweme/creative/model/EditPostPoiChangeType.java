package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class EditPostPoiChangeType implements Parcelable, Serializable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EditPostPoiChangeType[] $VALUES;
    public static final EditPostPoiChangeType ADD;
    public static final Parcelable.Creator<EditPostPoiChangeType> CREATOR;
    public static final EditPostPoiChangeType DELETE;
    public static final EditPostPoiChangeType MODIFY;
    public static final EditPostPoiChangeType UNKNOWN;

    @C040H
    public final int value;

    public static InterfaceC2044707zh<EditPostPoiChangeType> getEntries() {
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
        EditPostPoiChangeType editPostPoiChangeType = new EditPostPoiChangeType("UNKNOWN", 0, 0);
        UNKNOWN = editPostPoiChangeType;
        EditPostPoiChangeType editPostPoiChangeType2 = new EditPostPoiChangeType("ADD", 1, 1);
        ADD = editPostPoiChangeType2;
        EditPostPoiChangeType editPostPoiChangeType3 = new EditPostPoiChangeType("MODIFY", 2, 2);
        MODIFY = editPostPoiChangeType3;
        EditPostPoiChangeType editPostPoiChangeType4 = new EditPostPoiChangeType("DELETE", 3, 3);
        DELETE = editPostPoiChangeType4;
        EditPostPoiChangeType[] editPostPoiChangeTypeArr = {editPostPoiChangeType, editPostPoiChangeType2, editPostPoiChangeType3, editPostPoiChangeType4};
        $VALUES = editPostPoiChangeTypeArr;
        $ENTRIES = new C2254308sP(editPostPoiChangeTypeArr);
        CREATOR = new Parcelable.Creator<EditPostPoiChangeType>() { // from class: X.0nJo
            @Override // android.os.Parcelable.Creator
            public final EditPostPoiChangeType createFromParcel(Parcel parcel) {
                return EditPostPoiChangeType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditPostPoiChangeType[] newArray(int i) {
                return new EditPostPoiChangeType[i];
            }
        };
    }

    public static EditPostPoiChangeType[] values() {
        return (EditPostPoiChangeType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static EditPostPoiChangeType valueOf(String str) {
        return (EditPostPoiChangeType) C08FF.LIZ(EditPostPoiChangeType.class, str);
    }

    public EditPostPoiChangeType(String str, int i, int i2) {
        this.value = i2;
    }
}
