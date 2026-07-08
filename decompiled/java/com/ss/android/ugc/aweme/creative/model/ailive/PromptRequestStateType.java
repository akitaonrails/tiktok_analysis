package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PromptRequestStateType implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PromptRequestStateType[] $VALUES;
    public static final Parcelable.Creator<PromptRequestStateType> CREATOR;
    public static final PromptRequestStateType FAIL;
    public static final PromptRequestStateType LOADING;
    public static final PromptRequestStateType NONE;
    public static final PromptRequestStateType SUCCESS;

    public static InterfaceC2044707zh<PromptRequestStateType> getEntries() {
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
        PromptRequestStateType promptRequestStateType = new PromptRequestStateType("NONE", 0);
        NONE = promptRequestStateType;
        PromptRequestStateType promptRequestStateType2 = new PromptRequestStateType("LOADING", 1);
        LOADING = promptRequestStateType2;
        PromptRequestStateType promptRequestStateType3 = new PromptRequestStateType("SUCCESS", 2);
        SUCCESS = promptRequestStateType3;
        PromptRequestStateType promptRequestStateType4 = new PromptRequestStateType("FAIL", 3);
        FAIL = promptRequestStateType4;
        PromptRequestStateType[] promptRequestStateTypeArr = {promptRequestStateType, promptRequestStateType2, promptRequestStateType3, promptRequestStateType4};
        $VALUES = promptRequestStateTypeArr;
        $ENTRIES = new C2254308sP(promptRequestStateTypeArr);
        CREATOR = new Parcelable.Creator<PromptRequestStateType>() { // from class: X.0MC5
            @Override // android.os.Parcelable.Creator
            public final PromptRequestStateType createFromParcel(Parcel parcel) {
                return PromptRequestStateType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromptRequestStateType[] newArray(int i) {
                return new PromptRequestStateType[i];
            }
        };
    }

    public static PromptRequestStateType[] values() {
        return (PromptRequestStateType[]) $VALUES.clone();
    }

    public static PromptRequestStateType valueOf(String str) {
        return (PromptRequestStateType) C08FF.LIZ(PromptRequestStateType.class, str);
    }

    public PromptRequestStateType(String str, int i) {
    }
}
