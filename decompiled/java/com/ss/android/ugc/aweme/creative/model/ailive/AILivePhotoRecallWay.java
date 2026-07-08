package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoRecallWay implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AILivePhotoRecallWay[] $VALUES;
    public static final Parcelable.Creator<AILivePhotoRecallWay> CREATOR;
    public static final AILivePhotoRecallWay DRAFT;
    public static final AILivePhotoRecallWay INBOX;
    public static final AILivePhotoRecallWay IN_APP_PUSH;
    public static final AILivePhotoRecallWay NONE;
    public static final AILivePhotoRecallWay OUT_APP_PUSH;

    @C040H
    public final String mobTag;

    public static InterfaceC2044707zh<AILivePhotoRecallWay> getEntries() {
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
        AILivePhotoRecallWay aILivePhotoRecallWay = new AILivePhotoRecallWay("NONE", 0, "");
        NONE = aILivePhotoRecallWay;
        AILivePhotoRecallWay aILivePhotoRecallWay2 = new AILivePhotoRecallWay("DRAFT", 1, "draft");
        DRAFT = aILivePhotoRecallWay2;
        AILivePhotoRecallWay aILivePhotoRecallWay3 = new AILivePhotoRecallWay("INBOX", 2, "inbox");
        INBOX = aILivePhotoRecallWay3;
        AILivePhotoRecallWay aILivePhotoRecallWay4 = new AILivePhotoRecallWay("IN_APP_PUSH", 3, "in_app_push");
        IN_APP_PUSH = aILivePhotoRecallWay4;
        AILivePhotoRecallWay aILivePhotoRecallWay5 = new AILivePhotoRecallWay("OUT_APP_PUSH", 4, "out_app_push");
        OUT_APP_PUSH = aILivePhotoRecallWay5;
        AILivePhotoRecallWay[] aILivePhotoRecallWayArr = {aILivePhotoRecallWay, aILivePhotoRecallWay2, aILivePhotoRecallWay3, aILivePhotoRecallWay4, aILivePhotoRecallWay5};
        $VALUES = aILivePhotoRecallWayArr;
        $ENTRIES = new C2254308sP(aILivePhotoRecallWayArr);
        CREATOR = new Parcelable.Creator<AILivePhotoRecallWay>() { // from class: X.0MBw
            @Override // android.os.Parcelable.Creator
            public final AILivePhotoRecallWay createFromParcel(Parcel parcel) {
                return AILivePhotoRecallWay.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AILivePhotoRecallWay[] newArray(int i) {
                return new AILivePhotoRecallWay[i];
            }
        };
    }

    public static AILivePhotoRecallWay[] values() {
        return (AILivePhotoRecallWay[]) $VALUES.clone();
    }

    public final String getMobTag() {
        return this.mobTag;
    }

    public static AILivePhotoRecallWay valueOf(String str) {
        return (AILivePhotoRecallWay) C08FF.LIZ(AILivePhotoRecallWay.class, str);
    }

    public AILivePhotoRecallWay(String str, int i, String str2) {
        this.mobTag = str2;
    }
}
