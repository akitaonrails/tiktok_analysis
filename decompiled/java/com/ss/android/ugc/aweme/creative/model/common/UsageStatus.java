package com.ss.android.ugc.aweme.creative.model.common;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class UsageStatus implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ UsageStatus[] $VALUES;
    public static final UsageStatus CANCEL;
    public static final Parcelable.Creator<UsageStatus> CREATOR;
    public static final UsageStatus FAIL;
    public static final UsageStatus LOADING;
    public static final UsageStatus NOT_APPLY;
    public static final UsageStatus SUCCESS_APPLY;
    public static final UsageStatus SUCCESS_CANCEL;

    public static InterfaceC2044707zh<UsageStatus> getEntries() {
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
        UsageStatus usageStatus = new UsageStatus("NOT_APPLY", 0);
        NOT_APPLY = usageStatus;
        UsageStatus usageStatus2 = new UsageStatus("LOADING", 1);
        LOADING = usageStatus2;
        UsageStatus usageStatus3 = new UsageStatus("SUCCESS_APPLY", 2);
        SUCCESS_APPLY = usageStatus3;
        UsageStatus usageStatus4 = new UsageStatus("FAIL", 3);
        FAIL = usageStatus4;
        UsageStatus usageStatus5 = new UsageStatus("SUCCESS_CANCEL", 4);
        SUCCESS_CANCEL = usageStatus5;
        UsageStatus usageStatus6 = new UsageStatus("CANCEL", 5);
        CANCEL = usageStatus6;
        UsageStatus[] usageStatusArr = {usageStatus, usageStatus2, usageStatus3, usageStatus4, usageStatus5, usageStatus6};
        $VALUES = usageStatusArr;
        $ENTRIES = new C2254308sP(usageStatusArr);
        CREATOR = new Parcelable.Creator<UsageStatus>() { // from class: X.0LtU
            @Override // android.os.Parcelable.Creator
            public final UsageStatus createFromParcel(Parcel parcel) {
                return UsageStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UsageStatus[] newArray(int i) {
                return new UsageStatus[i];
            }
        };
    }

    public static UsageStatus[] values() {
        return (UsageStatus[]) $VALUES.clone();
    }

    public static UsageStatus valueOf(String str) {
        return (UsageStatus) C08FF.LIZ(UsageStatus.class, str);
    }

    public UsageStatus(String str, int i) {
    }
}
