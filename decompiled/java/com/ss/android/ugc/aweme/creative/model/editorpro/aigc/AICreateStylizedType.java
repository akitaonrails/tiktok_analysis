package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C378190EsD;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AICreateStylizedType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AICreateStylizedType[] $VALUES;
    public static final Parcelable.Creator<AICreateStylizedType> CREATOR;
    public static final C378190EsD Companion;
    public static final AICreateStylizedType NONE;
    public static final AICreateStylizedType STYLIZED_FL2V;
    public static final AICreateStylizedType STYLIZED_I2V;

    @C09CT("type")
    public final int type;

    public static InterfaceC2044707zh<AICreateStylizedType> getEntries() {
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
        AICreateStylizedType aICreateStylizedType = new AICreateStylizedType("NONE", 0, 0);
        NONE = aICreateStylizedType;
        AICreateStylizedType aICreateStylizedType2 = new AICreateStylizedType("STYLIZED_I2V", 1, 1);
        STYLIZED_I2V = aICreateStylizedType2;
        AICreateStylizedType aICreateStylizedType3 = new AICreateStylizedType("STYLIZED_FL2V", 2, 2);
        STYLIZED_FL2V = aICreateStylizedType3;
        AICreateStylizedType[] aICreateStylizedTypeArr = {aICreateStylizedType, aICreateStylizedType2, aICreateStylizedType3};
        $VALUES = aICreateStylizedTypeArr;
        $ENTRIES = new C2254308sP(aICreateStylizedTypeArr);
        Companion = new C378190EsD();
        CREATOR = new Parcelable.Creator<AICreateStylizedType>() { // from class: X.0EsI
            @Override // android.os.Parcelable.Creator
            public final AICreateStylizedType createFromParcel(Parcel parcel) {
                return AICreateStylizedType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AICreateStylizedType[] newArray(int i) {
                return new AICreateStylizedType[i];
            }
        };
    }

    public static AICreateStylizedType[] values() {
        return (AICreateStylizedType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static AICreateStylizedType valueOf(String str) {
        return (AICreateStylizedType) C08FF.LIZ(AICreateStylizedType.class, str);
    }

    public AICreateStylizedType(String str, int i, int i2) {
        this.type = i2;
    }
}
