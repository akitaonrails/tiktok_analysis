package com.bytedance.android.livesdk.firstrecharge;

import X.C786410Ut5;
import X.EnumC1063410dmN;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargePanelInputParams implements Parcelable {
    public static final Parcelable.Creator<RechargePanelInputParams> CREATOR = new Parcelable.Creator<RechargePanelInputParams>() { // from class: X.0fsT
        @Override // android.os.Parcelable.Creator
        public final RechargePanelInputParams createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            RechargePanelExchangeParams rechargePanelExchangeParamsCreateFromParcel;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            HashMap map = null;
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
            if (parcel.readInt() == 0) {
                rechargePanelExchangeParamsCreateFromParcel = null;
            } else {
                rechargePanelExchangeParamsCreateFromParcel = RechargePanelExchangeParams.CREATOR.createFromParcel(parcel);
            }
            RechargePanelExchangeParams rechargePanelExchangeParams = rechargePanelExchangeParamsCreateFromParcel;
            String string8 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                map = new HashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            return new RechargePanelInputParams(string, string2, string3, string4, string5, string6, string7, boolValueOf, rechargePanelExchangeParams, string8, i, z2, (HashMap<String, String>) map, EnumC1063410dmN.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RechargePanelInputParams[] newArray(int i) {
            return new RechargePanelInputParams[i];
        }
    };
    public final String campaignInfo;
    public final String chargeReason;
    public final String enterFromMerge;
    public final String enterMethod;
    public HashMap<String, String> etTracking;
    public final RechargePanelExchangeParams exchangeParams;
    public final String giftEnterFrom;
    public final boolean isFromQuickGift;
    public final int needCoins;
    public final String notificationType;
    public final EnumC1063410dmN platformType;
    public final String profilePosition;
    public final Boolean recommendationPage;
    public final String requestPage;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RechargePanelInputParams() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        this((String) null, (String) objArr, (String) objArr2, (String) objArr3, (String) objArr4, (String) objArr5, (String) objArr6, (Boolean) objArr7, (RechargePanelExchangeParams) objArr8, (String) objArr9, 0, (boolean) (0 == true ? 1 : 0), (EnumC1063410dmN) objArr10, 16383);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargePanelInputParams)) {
            return false;
        }
        RechargePanelInputParams rechargePanelInputParams = (RechargePanelInputParams) obj;
        return Intrinsics.LJFF(this.enterFromMerge, rechargePanelInputParams.enterFromMerge) && Intrinsics.LJFF(this.enterMethod, rechargePanelInputParams.enterMethod) && Intrinsics.LJFF(this.chargeReason, rechargePanelInputParams.chargeReason) && Intrinsics.LJFF(this.giftEnterFrom, rechargePanelInputParams.giftEnterFrom) && Intrinsics.LJFF(this.notificationType, rechargePanelInputParams.notificationType) && Intrinsics.LJFF(this.requestPage, rechargePanelInputParams.requestPage) && Intrinsics.LJFF(this.profilePosition, rechargePanelInputParams.profilePosition) && Intrinsics.LJFF(this.recommendationPage, rechargePanelInputParams.recommendationPage) && Intrinsics.LJFF(this.exchangeParams, rechargePanelInputParams.exchangeParams) && Intrinsics.LJFF(this.campaignInfo, rechargePanelInputParams.campaignInfo) && this.needCoins == rechargePanelInputParams.needCoins && this.isFromQuickGift == rechargePanelInputParams.isFromQuickGift && Intrinsics.LJFF(this.etTracking, rechargePanelInputParams.etTracking) && this.platformType == rechargePanelInputParams.platformType;
    }

    public final int hashCode() {
        String str = this.enterFromMerge;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chargeReason;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.giftEnterFrom;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.notificationType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.requestPage;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.profilePosition;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.recommendationPage;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        RechargePanelExchangeParams rechargePanelExchangeParams = this.exchangeParams;
        int iHashCode9 = (iHashCode8 + (rechargePanelExchangeParams == null ? 0 : rechargePanelExchangeParams.hashCode())) * 31;
        String str8 = this.campaignInfo;
        int iHashCode10 = (((((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.needCoins) * 31) + C786410Ut5.Z2(this.isFromQuickGift)) * 31;
        HashMap<String, String> map = this.etTracking;
        return ((iHashCode10 + (map != null ? map.hashCode() : 0)) * 31) + this.platformType.hashCode();
    }

    public final String toString() {
        return "RechargePanelInputParams(enterFromMerge=" + this.enterFromMerge + ", enterMethod=" + this.enterMethod + ", chargeReason=" + this.chargeReason + ", giftEnterFrom=" + this.giftEnterFrom + ", notificationType=" + this.notificationType + ", requestPage=" + this.requestPage + ", profilePosition=" + this.profilePosition + ", recommendationPage=" + this.recommendationPage + ", exchangeParams=" + this.exchangeParams + ", campaignInfo=" + this.campaignInfo + ", needCoins=" + this.needCoins + ", isFromQuickGift=" + this.isFromQuickGift + ", etTracking=" + this.etTracking + ", platformType=" + this.platformType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFromMerge);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.chargeReason);
        parcel.writeString(this.giftEnterFrom);
        parcel.writeString(this.notificationType);
        parcel.writeString(this.requestPage);
        parcel.writeString(this.profilePosition);
        Boolean bool = this.recommendationPage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        RechargePanelExchangeParams rechargePanelExchangeParams = this.exchangeParams;
        if (rechargePanelExchangeParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rechargePanelExchangeParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.campaignInfo);
        parcel.writeInt(this.needCoins);
        parcel.writeInt(this.isFromQuickGift ? 1 : 0);
        HashMap<String, String> map = this.etTracking;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.platformType.name());
    }

    public /* synthetic */ RechargePanelInputParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, RechargePanelExchangeParams rechargePanelExchangeParams, String str8, int i, boolean z, EnumC1063410dmN enumC1063410dmN, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : rechargePanelExchangeParams, (i2 & 512) == 0 ? str8 : null, (i2 & 1024) != 0 ? 0 : i, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z, (HashMap<String, String>) null, (i2 & 8192) != 0 ? EnumC1063410dmN.NORMAL : enumC1063410dmN);
    }

    public RechargePanelInputParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, RechargePanelExchangeParams rechargePanelExchangeParams, String str8, int i, boolean z, HashMap<String, String> map, EnumC1063410dmN enumC1063410dmN) {
        this.enterFromMerge = str;
        this.enterMethod = str2;
        this.chargeReason = str3;
        this.giftEnterFrom = str4;
        this.notificationType = str5;
        this.requestPage = str6;
        this.profilePosition = str7;
        this.recommendationPage = bool;
        this.exchangeParams = rechargePanelExchangeParams;
        this.campaignInfo = str8;
        this.needCoins = i;
        this.isFromQuickGift = z;
        this.etTracking = map;
        this.platformType = enumC1063410dmN;
    }
}
