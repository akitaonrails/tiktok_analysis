package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.EditSwitchStyle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class EditSwitchStyle implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EditSwitchStyle[] $VALUES;
    public static final Parcelable.Creator<EditSwitchStyle> CREATOR;
    public static final EditSwitchStyle IMAGE_TO_VIDE;
    public static final EditSwitchStyle NONE;
    public static final EditSwitchStyle VIDEO_TO_IMAGE;

    public static InterfaceC2044707zh<EditSwitchStyle> getEntries() {
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
        EditSwitchStyle editSwitchStyle = new EditSwitchStyle("NONE", 0);
        NONE = editSwitchStyle;
        EditSwitchStyle editSwitchStyle2 = new EditSwitchStyle("IMAGE_TO_VIDE", 1);
        IMAGE_TO_VIDE = editSwitchStyle2;
        EditSwitchStyle editSwitchStyle3 = new EditSwitchStyle("VIDEO_TO_IMAGE", 2);
        VIDEO_TO_IMAGE = editSwitchStyle3;
        EditSwitchStyle[] editSwitchStyleArr = {editSwitchStyle, editSwitchStyle2, editSwitchStyle3};
        $VALUES = editSwitchStyleArr;
        $ENTRIES = new C2254308sP(editSwitchStyleArr);
        CREATOR = new Parcelable.Creator<EditSwitchStyle>() { // from class: X.0MEr
            @Override // android.os.Parcelable.Creator
            public final EditSwitchStyle createFromParcel(Parcel parcel) {
                return EditSwitchStyle.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditSwitchStyle[] newArray(int i) {
                return new EditSwitchStyle[i];
            }
        };
    }

    public static EditSwitchStyle[] values() {
        return (EditSwitchStyle[]) $VALUES.clone();
    }

    public static EditSwitchStyle valueOf(String str) {
        return (EditSwitchStyle) C08FF.LIZ(EditSwitchStyle.class, str);
    }

    public EditSwitchStyle(String str, int i) {
    }
}
