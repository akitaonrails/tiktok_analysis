package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AIGCBusinessType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AIGCBusinessType[] $VALUES;
    public static final AIGCBusinessType AI_CREATE;
    public static final AIGCBusinessType AI_EXTEND;
    public static final Parcelable.Creator<AIGCBusinessType> CREATOR;

    public static InterfaceC2044707zh<AIGCBusinessType> getEntries() {
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
        AIGCBusinessType aIGCBusinessType = new AIGCBusinessType("AI_EXTEND", 0);
        AI_EXTEND = aIGCBusinessType;
        AIGCBusinessType aIGCBusinessType2 = new AIGCBusinessType("AI_CREATE", 1);
        AI_CREATE = aIGCBusinessType2;
        AIGCBusinessType[] aIGCBusinessTypeArr = {aIGCBusinessType, aIGCBusinessType2};
        $VALUES = aIGCBusinessTypeArr;
        $ENTRIES = new C2254308sP(aIGCBusinessTypeArr);
        CREATOR = new Parcelable.Creator<AIGCBusinessType>() { // from class: X.0Eqa
            @Override // android.os.Parcelable.Creator
            public final AIGCBusinessType createFromParcel(Parcel parcel) {
                return AIGCBusinessType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AIGCBusinessType[] newArray(int i) {
                return new AIGCBusinessType[i];
            }
        };
    }

    public static AIGCBusinessType[] values() {
        return (AIGCBusinessType[]) $VALUES.clone();
    }

    public static AIGCBusinessType valueOf(String str) {
        return (AIGCBusinessType) C08FF.LIZ(AIGCBusinessType.class, str);
    }

    public AIGCBusinessType(String str, int i) {
    }
}
