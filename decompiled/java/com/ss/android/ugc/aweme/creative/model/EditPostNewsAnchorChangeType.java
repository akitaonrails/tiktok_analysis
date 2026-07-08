package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPostNewsAnchorChangeType;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class EditPostNewsAnchorChangeType implements Parcelable, Serializable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EditPostNewsAnchorChangeType[] $VALUES;
    public static final EditPostNewsAnchorChangeType ADD;
    public static final Parcelable.Creator<EditPostNewsAnchorChangeType> CREATOR;
    public static final EditPostNewsAnchorChangeType DELETE;
    public static final EditPostNewsAnchorChangeType EDIT;
    public static final EditPostNewsAnchorChangeType UNKNOWN;

    @C040H
    public final int value;

    public static InterfaceC2044707zh<EditPostNewsAnchorChangeType> getEntries() {
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
        EditPostNewsAnchorChangeType editPostNewsAnchorChangeType = new EditPostNewsAnchorChangeType("UNKNOWN", 0, -1);
        UNKNOWN = editPostNewsAnchorChangeType;
        EditPostNewsAnchorChangeType editPostNewsAnchorChangeType2 = new EditPostNewsAnchorChangeType("ADD", 1, 0);
        ADD = editPostNewsAnchorChangeType2;
        EditPostNewsAnchorChangeType editPostNewsAnchorChangeType3 = new EditPostNewsAnchorChangeType("EDIT", 2, 1);
        EDIT = editPostNewsAnchorChangeType3;
        EditPostNewsAnchorChangeType editPostNewsAnchorChangeType4 = new EditPostNewsAnchorChangeType("DELETE", 3, 2);
        DELETE = editPostNewsAnchorChangeType4;
        EditPostNewsAnchorChangeType[] editPostNewsAnchorChangeTypeArr = {editPostNewsAnchorChangeType, editPostNewsAnchorChangeType2, editPostNewsAnchorChangeType3, editPostNewsAnchorChangeType4};
        $VALUES = editPostNewsAnchorChangeTypeArr;
        $ENTRIES = new C2254308sP(editPostNewsAnchorChangeTypeArr);
        CREATOR = new Parcelable.Creator<EditPostNewsAnchorChangeType>() { // from class: X.0nJn
            @Override // android.os.Parcelable.Creator
            public final EditPostNewsAnchorChangeType createFromParcel(Parcel parcel) {
                return EditPostNewsAnchorChangeType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditPostNewsAnchorChangeType[] newArray(int i) {
                return new EditPostNewsAnchorChangeType[i];
            }
        };
    }

    public static EditPostNewsAnchorChangeType[] values() {
        return (EditPostNewsAnchorChangeType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static EditPostNewsAnchorChangeType valueOf(String str) {
        return (EditPostNewsAnchorChangeType) C08FF.LIZ(EditPostNewsAnchorChangeType.class, str);
    }

    public EditPostNewsAnchorChangeType(String str, int i, int i2) {
        this.value = i2;
    }
}
