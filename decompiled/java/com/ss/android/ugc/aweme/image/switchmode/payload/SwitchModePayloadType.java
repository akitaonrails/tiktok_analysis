package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayloadType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SwitchModePayloadType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SwitchModePayloadType[] $VALUES;
    public static final SwitchModePayloadType AUTO_CUT_IMAGE_LOAD_RESULT;
    public static final SwitchModePayloadType AUTO_CUT_RETURN;
    public static final SwitchModePayloadType AUTO_CUT_SELECTED;
    public static final Parcelable.Creator<SwitchModePayloadType> CREATOR;
    public static final SwitchModePayloadType MIX_MATERIAL_SELECTED;
    public static final SwitchModePayloadType SIDE_BAR_ACTION;
    public static final SwitchModePayloadType VOID_TYPE;
    public final String value;

    public static InterfaceC2044707zh<SwitchModePayloadType> getEntries() {
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
        SwitchModePayloadType switchModePayloadType = new SwitchModePayloadType("VOID_TYPE", 0, "void");
        VOID_TYPE = switchModePayloadType;
        SwitchModePayloadType switchModePayloadType2 = new SwitchModePayloadType("SIDE_BAR_ACTION", 1, "side_bar_action");
        SIDE_BAR_ACTION = switchModePayloadType2;
        SwitchModePayloadType switchModePayloadType3 = new SwitchModePayloadType("MIX_MATERIAL_SELECTED", 2, "mix_matrix_selected");
        MIX_MATERIAL_SELECTED = switchModePayloadType3;
        SwitchModePayloadType switchModePayloadType4 = new SwitchModePayloadType("AUTO_CUT_SELECTED", 3, "auto_cut_selected");
        AUTO_CUT_SELECTED = switchModePayloadType4;
        SwitchModePayloadType switchModePayloadType5 = new SwitchModePayloadType("AUTO_CUT_IMAGE_LOAD_RESULT", 4, "auto_cut_image_load_result");
        AUTO_CUT_IMAGE_LOAD_RESULT = switchModePayloadType5;
        SwitchModePayloadType switchModePayloadType6 = new SwitchModePayloadType("AUTO_CUT_RETURN", 5, "auto_cut_return");
        AUTO_CUT_RETURN = switchModePayloadType6;
        SwitchModePayloadType[] switchModePayloadTypeArr = {switchModePayloadType, switchModePayloadType2, switchModePayloadType3, switchModePayloadType4, switchModePayloadType5, switchModePayloadType6};
        $VALUES = switchModePayloadTypeArr;
        $ENTRIES = new C2254308sP(switchModePayloadTypeArr);
        CREATOR = new Parcelable.Creator<SwitchModePayloadType>() { // from class: X.0mhY
            @Override // android.os.Parcelable.Creator
            public final SwitchModePayloadType createFromParcel(Parcel parcel) {
                return SwitchModePayloadType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SwitchModePayloadType[] newArray(int i) {
                return new SwitchModePayloadType[i];
            }
        };
    }

    public static SwitchModePayloadType[] values() {
        return (SwitchModePayloadType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static SwitchModePayloadType valueOf(String str) {
        return (SwitchModePayloadType) C08FF.LIZ(SwitchModePayloadType.class, str);
    }

    public SwitchModePayloadType(String str, int i, String str2) {
        this.value = str2;
    }
}
