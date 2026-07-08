package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AIGCGenerationParamType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AIGCGenerationParamType[] $VALUES;
    public static final Parcelable.Creator<AIGCGenerationParamType> CREATOR;
    public static final AIGCGenerationParamType FL2V_TYPE;
    public static final AIGCGenerationParamType I2I_TYPE;
    public static final AIGCGenerationParamType I2V_TYPE;
    public static final AIGCGenerationParamType NONE;
    public static final AIGCGenerationParamType T2I_TYPE;
    public static final AIGCGenerationParamType T2V_TYPE;
    public static final AIGCGenerationParamType V2V_TYPE;

    @C09CT("type")
    public final int type;

    public static InterfaceC2044707zh<AIGCGenerationParamType> getEntries() {
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
        AIGCGenerationParamType aIGCGenerationParamType = new AIGCGenerationParamType("NONE", 0, -1);
        NONE = aIGCGenerationParamType;
        AIGCGenerationParamType aIGCGenerationParamType2 = new AIGCGenerationParamType("T2I_TYPE", 1, 0);
        T2I_TYPE = aIGCGenerationParamType2;
        AIGCGenerationParamType aIGCGenerationParamType3 = new AIGCGenerationParamType("T2V_TYPE", 2, 1);
        T2V_TYPE = aIGCGenerationParamType3;
        AIGCGenerationParamType aIGCGenerationParamType4 = new AIGCGenerationParamType("I2I_TYPE", 3, 2);
        I2I_TYPE = aIGCGenerationParamType4;
        AIGCGenerationParamType aIGCGenerationParamType5 = new AIGCGenerationParamType("I2V_TYPE", 4, 3);
        I2V_TYPE = aIGCGenerationParamType5;
        AIGCGenerationParamType aIGCGenerationParamType6 = new AIGCGenerationParamType("FL2V_TYPE", 5, 4);
        FL2V_TYPE = aIGCGenerationParamType6;
        AIGCGenerationParamType aIGCGenerationParamType7 = new AIGCGenerationParamType("V2V_TYPE", 6, 5);
        V2V_TYPE = aIGCGenerationParamType7;
        AIGCGenerationParamType[] aIGCGenerationParamTypeArr = {aIGCGenerationParamType, aIGCGenerationParamType2, aIGCGenerationParamType3, aIGCGenerationParamType4, aIGCGenerationParamType5, aIGCGenerationParamType6, aIGCGenerationParamType7};
        $VALUES = aIGCGenerationParamTypeArr;
        $ENTRIES = new C2254308sP(aIGCGenerationParamTypeArr);
        CREATOR = new Parcelable.Creator<AIGCGenerationParamType>() { // from class: X.0Eqd
            @Override // android.os.Parcelable.Creator
            public final AIGCGenerationParamType createFromParcel(Parcel parcel) {
                return AIGCGenerationParamType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AIGCGenerationParamType[] newArray(int i) {
                return new AIGCGenerationParamType[i];
            }
        };
    }

    public static AIGCGenerationParamType[] values() {
        return (AIGCGenerationParamType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static AIGCGenerationParamType valueOf(String str) {
        return (AIGCGenerationParamType) C08FF.LIZ(AIGCGenerationParamType.class, str);
    }

    public AIGCGenerationParamType(String str, int i, int i2) {
        this.type = i2;
    }
}
