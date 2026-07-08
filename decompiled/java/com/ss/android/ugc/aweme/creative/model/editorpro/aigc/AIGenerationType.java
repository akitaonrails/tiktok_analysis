package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class AIGenerationType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AIGenerationType[] $VALUES;
    public static final AIGenerationType AI_TRANSITION;
    public static final Parcelable.Creator<AIGenerationType> CREATOR;
    public static final AIGenerationType IMAGE_TO_VIDEO;
    public static final AIGenerationType NONE;
    public static final AIGenerationType TEXT_TO_VIDEO;

    @C09CT("displayName")
    public final String displayName;

    public static InterfaceC2044707zh<AIGenerationType> getEntries() {
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
        AIGenerationType aIGenerationType = new AIGenerationType("NONE", 0, "NONE");
        NONE = aIGenerationType;
        AIGenerationType aIGenerationType2 = new AIGenerationType("IMAGE_TO_VIDEO", 1, "Image to video");
        IMAGE_TO_VIDEO = aIGenerationType2;
        AIGenerationType aIGenerationType3 = new AIGenerationType("AI_TRANSITION", 2, "AI Transition");
        AI_TRANSITION = aIGenerationType3;
        AIGenerationType aIGenerationType4 = new AIGenerationType("TEXT_TO_VIDEO", 3, "Text to video");
        TEXT_TO_VIDEO = aIGenerationType4;
        AIGenerationType[] aIGenerationTypeArr = {aIGenerationType, aIGenerationType2, aIGenerationType3, aIGenerationType4};
        $VALUES = aIGenerationTypeArr;
        $ENTRIES = new C2254308sP(aIGenerationTypeArr);
        CREATOR = new Parcelable.Creator<AIGenerationType>() { // from class: X.0EvW
            @Override // android.os.Parcelable.Creator
            public final AIGenerationType createFromParcel(Parcel parcel) {
                return AIGenerationType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AIGenerationType[] newArray(int i) {
                return new AIGenerationType[i];
            }
        };
    }

    public static AIGenerationType[] values() {
        return (AIGenerationType[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public static AIGenerationType valueOf(String str) {
        return (AIGenerationType) C08FF.LIZ(AIGenerationType.class, str);
    }

    public AIGenerationType(String str, int i, String str2) {
        this.displayName = str2;
    }
}
