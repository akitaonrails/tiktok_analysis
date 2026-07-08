package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SnsInfo> CREATOR = new Parcelable.Creator<SnsInfo>() { // from class: X.02oM
        @Override // android.os.Parcelable.Creator
        public final SnsInfo createFromParcel(Parcel parcel) {
            SnsPeriodInfo snsPeriodInfoCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            boolean z;
            Boolean boolValueOf;
            SnsPeriodInfo snsPeriodInfoCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                snsPeriodInfoCreateFromParcel = null;
            } else {
                snsPeriodInfoCreateFromParcel = SnsPeriodInfo.CREATOR.createFromParcel(parcel);
            }
            SnsPeriodInfo snsPeriodInfo = snsPeriodInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                snsPeriodInfoCreateFromParcel2 = SnsPeriodInfo.CREATOR.createFromParcel(parcel);
            }
            return new SnsInfo(snsPeriodInfo, string, numValueOf, string2, numValueOf2, numValueOf3, boolValueOf, snsPeriodInfoCreateFromParcel2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SnsInfo[] newArray(int i) {
            return new SnsInfo[i];
        }
    };

    @C09CT("agreement_id")
    public String agreementId;

    @C09CT("is_subscribed")
    public Boolean isSubscribed;

    @C09CT("phase")
    public Integer phase;

    @C09CT("retry_count")
    public Integer retryCount;

    @C09CT("period_info_cache")
    public SnsPeriodInfo selectPeriodInfoCache;

    @C09CT("sns_base_extra_info")
    public String snsBaseExtraInfo;

    @C09CT("sns_id")
    public String snsId;

    @C09CT("sns_period_info")
    public SnsPeriodInfo snsPeriodInfo;

    @C09CT("success_phase")
    public Integer successPhase;

    public SnsInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsInfo)) {
            return false;
        }
        SnsInfo snsInfo = (SnsInfo) obj;
        return Intrinsics.LJFF(this.snsPeriodInfo, snsInfo.snsPeriodInfo) && Intrinsics.LJFF(this.snsId, snsInfo.snsId) && Intrinsics.LJFF(this.successPhase, snsInfo.successPhase) && Intrinsics.LJFF(this.agreementId, snsInfo.agreementId) && Intrinsics.LJFF(this.phase, snsInfo.phase) && Intrinsics.LJFF(this.retryCount, snsInfo.retryCount) && Intrinsics.LJFF(this.isSubscribed, snsInfo.isSubscribed) && Intrinsics.LJFF(this.selectPeriodInfoCache, snsInfo.selectPeriodInfoCache) && Intrinsics.LJFF(this.snsBaseExtraInfo, snsInfo.snsBaseExtraInfo);
    }

    public final int hashCode() {
        SnsPeriodInfo snsPeriodInfo = this.snsPeriodInfo;
        int iHashCode = (snsPeriodInfo == null ? 0 : snsPeriodInfo.hashCode()) * 31;
        String str = this.snsId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.successPhase;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.agreementId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.phase;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.retryCount;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isSubscribed;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        SnsPeriodInfo snsPeriodInfo2 = this.selectPeriodInfoCache;
        int iHashCode8 = (iHashCode7 + (snsPeriodInfo2 == null ? 0 : snsPeriodInfo2.hashCode())) * 31;
        String str3 = this.snsBaseExtraInfo;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsInfo(snsPeriodInfo=");
        sbLIZ.append(this.snsPeriodInfo);
        sbLIZ.append(", snsId=");
        sbLIZ.append(this.snsId);
        sbLIZ.append(", successPhase=");
        sbLIZ.append(this.successPhase);
        sbLIZ.append(", agreementId=");
        sbLIZ.append(this.agreementId);
        sbLIZ.append(", phase=");
        sbLIZ.append(this.phase);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.retryCount);
        sbLIZ.append(", isSubscribed=");
        sbLIZ.append(this.isSubscribed);
        sbLIZ.append(", selectPeriodInfoCache=");
        sbLIZ.append(this.selectPeriodInfoCache);
        sbLIZ.append(", snsBaseExtraInfo=");
        sbLIZ.append(this.snsBaseExtraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SnsPeriodInfo snsPeriodInfo = this.snsPeriodInfo;
        if (snsPeriodInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snsPeriodInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.snsId);
        Integer num = this.successPhase;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.agreementId);
        Integer num2 = this.phase;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.retryCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SnsPeriodInfo snsPeriodInfo2 = this.selectPeriodInfoCache;
        if (snsPeriodInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snsPeriodInfo2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.snsBaseExtraInfo);
    }

    public static SnsInfo LIZ(SnsInfo snsInfo, SnsPeriodInfo snsPeriodInfo, Boolean bool, SnsPeriodInfo snsPeriodInfo2, int i) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        SnsPeriodInfo snsPeriodInfo3 = snsPeriodInfo2;
        Boolean bool2 = bool;
        SnsPeriodInfo snsPeriodInfo4 = snsPeriodInfo;
        if ((i & 1) != 0) {
            snsPeriodInfo4 = snsInfo.snsPeriodInfo;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            str = snsInfo.snsId;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            num = snsInfo.successPhase;
        } else {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = snsInfo.agreementId;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            num2 = snsInfo.phase;
        } else {
            num2 = null;
        }
        if ((i & 32) != 0) {
            num3 = snsInfo.retryCount;
        } else {
            num3 = null;
        }
        if ((i & 64) != 0) {
            bool2 = snsInfo.isSubscribed;
        }
        if ((i & 128) != 0) {
            snsPeriodInfo3 = snsInfo.selectPeriodInfoCache;
        }
        if ((i & 256) != 0) {
            str3 = snsInfo.snsBaseExtraInfo;
        }
        return new SnsInfo(snsPeriodInfo4, str, num, str2, num2, num3, bool2, snsPeriodInfo3, str3);
    }

    public SnsInfo(SnsPeriodInfo snsPeriodInfo, String str, Integer num, String str2, Integer num2, Integer num3, Boolean bool, SnsPeriodInfo snsPeriodInfo2, String str3) {
        this.snsPeriodInfo = snsPeriodInfo;
        this.snsId = str;
        this.successPhase = num;
        this.agreementId = str2;
        this.phase = num2;
        this.retryCount = num3;
        this.isSubscribed = bool;
        this.selectPeriodInfoCache = snsPeriodInfo2;
        this.snsBaseExtraInfo = str3;
    }
}
