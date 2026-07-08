package com.ss.android.ugc.aweme.portrait.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class GenerateStatus implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ GenerateStatus[] $VALUES;
    public static final GenerateStatus APPLIED;
    public static final Parcelable.Creator<GenerateStatus> CREATOR;
    public static final GenerateStatus FAILED;
    public static final GenerateStatus GENERATING;
    public static final GenerateStatus NOT_START;
    public static final GenerateStatus SUCCESS;
    public final int value;

    public static InterfaceC2044707zh<GenerateStatus> getEntries() {
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
        GenerateStatus generateStatus = new GenerateStatus("NOT_START", 0, -1);
        NOT_START = generateStatus;
        GenerateStatus generateStatus2 = new GenerateStatus("FAILED", 1, 0);
        FAILED = generateStatus2;
        GenerateStatus generateStatus3 = new GenerateStatus("SUCCESS", 2, 1);
        SUCCESS = generateStatus3;
        GenerateStatus generateStatus4 = new GenerateStatus("GENERATING", 3, 2);
        GENERATING = generateStatus4;
        GenerateStatus generateStatus5 = new GenerateStatus("APPLIED", 4, 3);
        APPLIED = generateStatus5;
        GenerateStatus[] generateStatusArr = {generateStatus, generateStatus2, generateStatus3, generateStatus4, generateStatus5};
        $VALUES = generateStatusArr;
        $ENTRIES = new C2254308sP(generateStatusArr);
        CREATOR = new Parcelable.Creator<GenerateStatus>() { // from class: X.0Lin
            @Override // android.os.Parcelable.Creator
            public final GenerateStatus createFromParcel(Parcel parcel) {
                return GenerateStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GenerateStatus[] newArray(int i) {
                return new GenerateStatus[i];
            }
        };
    }

    public static GenerateStatus[] values() {
        return (GenerateStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static GenerateStatus valueOf(String str) {
        return (GenerateStatus) C08FF.LIZ(GenerateStatus.class, str);
    }

    public GenerateStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
