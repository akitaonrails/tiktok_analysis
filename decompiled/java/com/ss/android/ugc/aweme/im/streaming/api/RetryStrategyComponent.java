package com.ss.android.ugc.aweme.im.streaming.api;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.streaming.api.RetryStrategyComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RetryStrategyComponent implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RetryStrategyComponent[] $VALUES;
    public static final Parcelable.Creator<RetryStrategyComponent> CREATOR;
    public static final RetryStrategyComponent FIXED_DELAY;
    public static final RetryStrategyComponent IMMEDIATE;
    public static final RetryStrategyComponent NONE;
    public final int value;

    public static InterfaceC2044707zh<RetryStrategyComponent> getEntries() {
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
        RetryStrategyComponent retryStrategyComponent = new RetryStrategyComponent("NONE", 0, 0);
        NONE = retryStrategyComponent;
        RetryStrategyComponent retryStrategyComponent2 = new RetryStrategyComponent("IMMEDIATE", 1, 1);
        IMMEDIATE = retryStrategyComponent2;
        RetryStrategyComponent retryStrategyComponent3 = new RetryStrategyComponent("FIXED_DELAY", 2, 2);
        FIXED_DELAY = retryStrategyComponent3;
        RetryStrategyComponent[] retryStrategyComponentArr = {retryStrategyComponent, retryStrategyComponent2, retryStrategyComponent3};
        $VALUES = retryStrategyComponentArr;
        $ENTRIES = new C2254308sP(retryStrategyComponentArr);
        CREATOR = new Parcelable.Creator<RetryStrategyComponent>() { // from class: X.0Zgg
            @Override // android.os.Parcelable.Creator
            public final RetryStrategyComponent createFromParcel(Parcel parcel) {
                return RetryStrategyComponent.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RetryStrategyComponent[] newArray(int i) {
                return new RetryStrategyComponent[i];
            }
        };
    }

    public static RetryStrategyComponent[] values() {
        return (RetryStrategyComponent[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static RetryStrategyComponent valueOf(String str) {
        return (RetryStrategyComponent) C08FF.LIZ(RetryStrategyComponent.class, str);
    }

    public RetryStrategyComponent(String str, int i, int i2) {
        this.value = i2;
    }
}
