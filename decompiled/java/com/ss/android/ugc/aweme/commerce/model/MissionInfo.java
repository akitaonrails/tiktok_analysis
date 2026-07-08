package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class MissionInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<MissionInfo> CREATOR = new Parcelable.Creator<MissionInfo>() { // from class: X.10Bo
        @Override // android.os.Parcelable.Creator
        public final MissionInfo createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new MissionInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final MissionInfo[] newArray(int i) {
            return new MissionInfo[i];
        }
    };

    @C09CT("is_mission_ad")
    public final Integer isMissionAd;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    /* JADX INFO: renamed from: isMissionAd, reason: collision with other method in class */
    public final boolean m173isMissionAd() {
        Integer num = this.isMissionAd;
        return num != null && num.intValue() == 1;
    }

    public final Integer isMissionAd() {
        return this.isMissionAd;
    }
}
