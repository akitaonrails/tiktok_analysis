package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PromptType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PromptType[] $VALUES;
    public static final PromptType AI_WRITE;
    public static final Parcelable.Creator<PromptType> CREATOR;
    public static final PromptType DEFAULT;
    public static final PromptType INPUT;
    public static final PromptType NONE;
    public static final PromptType NO_PROMPT;
    public static final PromptType RECOMMEND_FROM_GPT;
    public static final PromptType RECOMMEND_FROM_LORA;
    public static final PromptType RECOMMEND_PRESET;

    @C09CT("prompt_type_mob")
    public final String mobTag;

    public static InterfaceC2044707zh<PromptType> getEntries() {
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
        PromptType promptType = new PromptType("NONE", 0, "");
        NONE = promptType;
        PromptType promptType2 = new PromptType(LivePreviewCTASmartDisplayManager.DEFAULT, 1, "default");
        DEFAULT = promptType2;
        PromptType promptType3 = new PromptType("RECOMMEND_FROM_GPT", 2, "recommend");
        RECOMMEND_FROM_GPT = promptType3;
        PromptType promptType4 = new PromptType("RECOMMEND_FROM_LORA", 3, "recommend");
        RECOMMEND_FROM_LORA = promptType4;
        PromptType promptType5 = new PromptType("RECOMMEND_PRESET", 4, "preset");
        RECOMMEND_PRESET = promptType5;
        PromptType promptType6 = new PromptType("INPUT", 5, "input");
        INPUT = promptType6;
        PromptType promptType7 = new PromptType("NO_PROMPT", 6, "no_prompt");
        NO_PROMPT = promptType7;
        PromptType promptType8 = new PromptType("AI_WRITE", 7, "ai_write");
        AI_WRITE = promptType8;
        PromptType[] promptTypeArr = {promptType, promptType2, promptType3, promptType4, promptType5, promptType6, promptType7, promptType8};
        $VALUES = promptTypeArr;
        $ENTRIES = new C2254308sP(promptTypeArr);
        CREATOR = new Parcelable.Creator<PromptType>() { // from class: X.0MDF
            @Override // android.os.Parcelable.Creator
            public final PromptType createFromParcel(Parcel parcel) {
                return PromptType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromptType[] newArray(int i) {
                return new PromptType[i];
            }
        };
    }

    public static PromptType[] values() {
        return (PromptType[]) $VALUES.clone();
    }

    public final String getMobTag() {
        return this.mobTag;
    }

    public static PromptType valueOf(String str) {
        return (PromptType) C08FF.LIZ(PromptType.class, str);
    }

    public PromptType(String str, int i, String str2) {
        this.mobTag = str2;
    }
}
