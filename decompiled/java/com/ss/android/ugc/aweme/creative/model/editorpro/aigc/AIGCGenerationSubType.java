package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AIGCGenerationSubType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AIGCGenerationSubType[] $VALUES;
    public static final AIGCGenerationSubType AI_TRANSITION;
    public static final Parcelable.Creator<AIGCGenerationSubType> CREATOR;

    public static InterfaceC2044707zh<AIGCGenerationSubType> getEntries() {
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
        AIGCGenerationSubType aIGCGenerationSubType = new AIGCGenerationSubType();
        AI_TRANSITION = aIGCGenerationSubType;
        AIGCGenerationSubType[] aIGCGenerationSubTypeArr = {aIGCGenerationSubType};
        $VALUES = aIGCGenerationSubTypeArr;
        $ENTRIES = new C2254308sP(aIGCGenerationSubTypeArr);
        CREATOR = new Parcelable.Creator<AIGCGenerationSubType>() { // from class: X.0EsJ
            @Override // android.os.Parcelable.Creator
            public final AIGCGenerationSubType createFromParcel(Parcel parcel) {
                return AIGCGenerationSubType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AIGCGenerationSubType[] newArray(int i) {
                return new AIGCGenerationSubType[i];
            }
        };
    }

    public static AIGCGenerationSubType[] values() {
        return (AIGCGenerationSubType[]) $VALUES.clone();
    }

    public static AIGCGenerationSubType valueOf(String str) {
        return (AIGCGenerationSubType) C08FF.LIZ(AIGCGenerationSubType.class, str);
    }
}
