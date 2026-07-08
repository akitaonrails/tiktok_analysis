package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingMaterialType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MixEditingMaterialType[] $VALUES;
    public static final MixEditingMaterialType AIGT;
    public static final MixEditingMaterialType AI_ALIVE_TEMPLATE;
    public static final MixEditingMaterialType AI_TEMPLATE;
    public static final MixEditingMaterialType AUTO_PICK_TEMPLATE;
    public static final MixEditingMaterialType CANCEL_TYPE;
    public static final MixEditingMaterialType CC_TEMPLATE;
    public static final Parcelable.Creator<MixEditingMaterialType> CREATOR;
    public static final MixEditingMaterialType EFFECT_TYPE;
    public static final MixEditingMaterialType LYRICS_RULE_TEMPLATE;
    public static final MixEditingMaterialType PUGC_TEMPLATE;
    public static final MixEditingMaterialType SGT;
    public static final MixEditingMaterialType SOUND_SYNC;
    public static final MixEditingMaterialType UGC_TEMPLATE;
    public static final MixEditingMaterialType UNKNOWN_TYPE;

    @C09CT("description")
    public final String description;

    public static InterfaceC2044707zh<MixEditingMaterialType> getEntries() {
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
        MixEditingMaterialType mixEditingMaterialType = new MixEditingMaterialType("UNKNOWN_TYPE", 0, "unknown");
        UNKNOWN_TYPE = mixEditingMaterialType;
        MixEditingMaterialType mixEditingMaterialType2 = new MixEditingMaterialType("CANCEL_TYPE", 1, "cancel");
        CANCEL_TYPE = mixEditingMaterialType2;
        MixEditingMaterialType mixEditingMaterialType3 = new MixEditingMaterialType("EFFECT_TYPE", 2, "effect");
        EFFECT_TYPE = mixEditingMaterialType3;
        MixEditingMaterialType mixEditingMaterialType4 = new MixEditingMaterialType("SOUND_SYNC", 3, "sound_sync");
        SOUND_SYNC = mixEditingMaterialType4;
        MixEditingMaterialType mixEditingMaterialType5 = new MixEditingMaterialType("CC_TEMPLATE", 4, "cc_template");
        CC_TEMPLATE = mixEditingMaterialType5;
        MixEditingMaterialType mixEditingMaterialType6 = new MixEditingMaterialType("AI_TEMPLATE", 5, "ai_template");
        AI_TEMPLATE = mixEditingMaterialType6;
        MixEditingMaterialType mixEditingMaterialType7 = new MixEditingMaterialType("PUGC_TEMPLATE", 6, "pugc_template");
        PUGC_TEMPLATE = mixEditingMaterialType7;
        MixEditingMaterialType mixEditingMaterialType8 = new MixEditingMaterialType("AIGT", 7, "aigt");
        AIGT = mixEditingMaterialType8;
        MixEditingMaterialType mixEditingMaterialType9 = new MixEditingMaterialType("SGT", 8, "sgt");
        SGT = mixEditingMaterialType9;
        MixEditingMaterialType mixEditingMaterialType10 = new MixEditingMaterialType("AI_ALIVE_TEMPLATE", 9, "ai_alive");
        AI_ALIVE_TEMPLATE = mixEditingMaterialType10;
        MixEditingMaterialType mixEditingMaterialType11 = new MixEditingMaterialType("AUTO_PICK_TEMPLATE", 10, "auto_pick_template");
        AUTO_PICK_TEMPLATE = mixEditingMaterialType11;
        MixEditingMaterialType mixEditingMaterialType12 = new MixEditingMaterialType("UGC_TEMPLATE", 11, "ugc_template");
        UGC_TEMPLATE = mixEditingMaterialType12;
        MixEditingMaterialType mixEditingMaterialType13 = new MixEditingMaterialType("LYRICS_RULE_TEMPLATE", 12, "lyrics_rule_template");
        LYRICS_RULE_TEMPLATE = mixEditingMaterialType13;
        MixEditingMaterialType[] mixEditingMaterialTypeArr = {mixEditingMaterialType, mixEditingMaterialType2, mixEditingMaterialType3, mixEditingMaterialType4, mixEditingMaterialType5, mixEditingMaterialType6, mixEditingMaterialType7, mixEditingMaterialType8, mixEditingMaterialType9, mixEditingMaterialType10, mixEditingMaterialType11, mixEditingMaterialType12, mixEditingMaterialType13};
        $VALUES = mixEditingMaterialTypeArr;
        $ENTRIES = new C2254308sP(mixEditingMaterialTypeArr);
        CREATOR = new Parcelable.Creator<MixEditingMaterialType>() { // from class: X.0mrD
            @Override // android.os.Parcelable.Creator
            public final MixEditingMaterialType createFromParcel(Parcel parcel) {
                return MixEditingMaterialType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MixEditingMaterialType[] newArray(int i) {
                return new MixEditingMaterialType[i];
            }
        };
    }

    public static MixEditingMaterialType[] values() {
        return (MixEditingMaterialType[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public static MixEditingMaterialType valueOf(String str) {
        return (MixEditingMaterialType) C08FF.LIZ(MixEditingMaterialType.class, str);
    }

    public MixEditingMaterialType(String str, int i, String str2) {
        this.description = str2;
    }
}
