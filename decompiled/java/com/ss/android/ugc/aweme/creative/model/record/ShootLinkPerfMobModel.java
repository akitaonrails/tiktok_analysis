package com.ss.android.ugc.aweme.creative.model.record;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.ShootLinkPerfMobModel;

/* JADX INFO: loaded from: classes23.dex */
public final class ShootLinkPerfMobModel implements Parcelable {
    public static final Parcelable.Creator<ShootLinkPerfMobModel> CREATOR = new Parcelable.Creator<ShootLinkPerfMobModel>() { // from class: X.0nWh
        @Override // android.os.Parcelable.Creator
        public final ShootLinkPerfMobModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new ShootLinkPerfMobModel(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), string, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShootLinkPerfMobModel[] newArray(int i) {
            return new ShootLinkPerfMobModel[i];
        }
    };

    @C040H
    public long albumFirstScreenTs;

    @C040H
    public String inspirationEnterFrom;

    @C040H
    public String inspirationEnterMethod;

    @C040H
    public long interceptorCost;

    @C040H
    public long openTime;

    @C040H
    public String searchExtra;

    @C040H
    public long serviceLoadCost;

    @C040H
    public long shootNativeRecvTs;

    @C040H
    public String shootPerfSessionId;

    public ShootLinkPerfMobModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootPerfSessionId);
        parcel.writeLong(this.openTime);
        parcel.writeLong(this.shootNativeRecvTs);
        parcel.writeString(this.inspirationEnterFrom);
        parcel.writeString(this.inspirationEnterMethod);
        parcel.writeString(this.searchExtra);
        parcel.writeLong(this.interceptorCost);
        parcel.writeLong(this.serviceLoadCost);
        parcel.writeLong(this.albumFirstScreenTs);
    }

    public /* synthetic */ ShootLinkPerfMobModel(int i) {
        this(0L, 0L, -1L, -1L, 0L, "", "", "", "");
    }

    public ShootLinkPerfMobModel(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4) {
        this.shootPerfSessionId = str;
        this.openTime = j;
        this.shootNativeRecvTs = j2;
        this.inspirationEnterFrom = str2;
        this.inspirationEnterMethod = str3;
        this.searchExtra = str4;
        this.interceptorCost = j3;
        this.serviceLoadCost = j4;
        this.albumFirstScreenTs = j5;
    }
}
