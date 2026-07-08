package com.ss.android.ugc.aweme.minis.payment.data;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRechargeSheetParams implements Parcelable {
    public final long accessPassEndTime;
    public final String amount;
    public final long balance;
    public final long beanAmount;
    public final String buttonText;
    public final boolean isAccessPass;
    public final String mode;
    public final boolean needWebpay;
    public final long productBeanAmount;
    public final String skuId;
    public final String symbol;
    public final String tierId;
    public final String webPrice;
    public final String webPriceDiscountAmount;
    public final String webPriceDiscountRate;
    public static final Parcelable.Creator<MinisRechargeSheetParams> CREATOR = new Parcelable.Creator<MinisRechargeSheetParams>() { // from class: X.0y2C
        @Override // android.os.Parcelable.Creator
        public final MinisRechargeSheetParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new MinisRechargeSheetParams(string, string2, j, j2, string3, string4, string5, j3, z, string6, string7, string8, string9, z2, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisRechargeSheetParams[] newArray(int i) {
            return new MinisRechargeSheetParams[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public MinisRechargeSheetParams() {
        String str = null;
        long j = 0;
        boolean z = false;
        this(str, str, j, j, str, str, str, j, z, str, str, str, str, z, j, 32767);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisRechargeSheetParams)) {
            return false;
        }
        MinisRechargeSheetParams minisRechargeSheetParams = (MinisRechargeSheetParams) obj;
        return Intrinsics.LJFF(this.tierId, minisRechargeSheetParams.tierId) && Intrinsics.LJFF(this.skuId, minisRechargeSheetParams.skuId) && this.beanAmount == minisRechargeSheetParams.beanAmount && this.balance == minisRechargeSheetParams.balance && Intrinsics.LJFF(this.amount, minisRechargeSheetParams.amount) && Intrinsics.LJFF(this.buttonText, minisRechargeSheetParams.buttonText) && Intrinsics.LJFF(this.mode, minisRechargeSheetParams.mode) && this.productBeanAmount == minisRechargeSheetParams.productBeanAmount && this.needWebpay == minisRechargeSheetParams.needWebpay && Intrinsics.LJFF(this.webPrice, minisRechargeSheetParams.webPrice) && Intrinsics.LJFF(this.webPriceDiscountAmount, minisRechargeSheetParams.webPriceDiscountAmount) && Intrinsics.LJFF(this.webPriceDiscountRate, minisRechargeSheetParams.webPriceDiscountRate) && Intrinsics.LJFF(this.symbol, minisRechargeSheetParams.symbol) && this.isAccessPass == minisRechargeSheetParams.isAccessPass && this.accessPassEndTime == minisRechargeSheetParams.accessPassEndTime;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.tierId.hashCode() * 31) + this.skuId.hashCode()) * 31) + C786410Ut5.Y2(this.beanAmount)) * 31) + C786410Ut5.Y2(this.balance)) * 31) + this.amount.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.mode.hashCode()) * 31) + C786410Ut5.Y2(this.productBeanAmount)) * 31) + C786410Ut5.Z2(this.needWebpay)) * 31) + this.webPrice.hashCode()) * 31) + this.webPriceDiscountAmount.hashCode()) * 31) + this.webPriceDiscountRate.hashCode()) * 31) + this.symbol.hashCode()) * 31) + C786410Ut5.Z2(this.isAccessPass)) * 31) + C786410Ut5.Y2(this.accessPassEndTime);
    }

    public final String toString() {
        return "MinisRechargeSheetParams(tierId=" + this.tierId + ", skuId=" + this.skuId + ", beanAmount=" + this.beanAmount + ", balance=" + this.balance + ", amount=" + this.amount + ", buttonText=" + this.buttonText + ", mode=" + this.mode + ", productBeanAmount=" + this.productBeanAmount + ", needWebpay=" + this.needWebpay + ", webPrice=" + this.webPrice + ", webPriceDiscountAmount=" + this.webPriceDiscountAmount + ", webPriceDiscountRate=" + this.webPriceDiscountRate + ", symbol=" + this.symbol + ", isAccessPass=" + this.isAccessPass + ", accessPassEndTime=" + this.accessPassEndTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tierId);
        parcel.writeString(this.skuId);
        parcel.writeLong(this.beanAmount);
        parcel.writeLong(this.balance);
        parcel.writeString(this.amount);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.mode);
        parcel.writeLong(this.productBeanAmount);
        parcel.writeInt(this.needWebpay ? 1 : 0);
        parcel.writeString(this.webPrice);
        parcel.writeString(this.webPriceDiscountAmount);
        parcel.writeString(this.webPriceDiscountRate);
        parcel.writeString(this.symbol);
        parcel.writeInt(this.isAccessPass ? 1 : 0);
        parcel.writeLong(this.accessPassEndTime);
    }

    public MinisRechargeSheetParams(String str, String str2, long j, long j2, String str3, String str4, String str5, long j3, boolean z, String str6, String str7, String str8, String str9, boolean z2, long j4) {
        this.tierId = str;
        this.skuId = str2;
        this.beanAmount = j;
        this.balance = j2;
        this.amount = str3;
        this.buttonText = str4;
        this.mode = str5;
        this.productBeanAmount = j3;
        this.needWebpay = z;
        this.webPrice = str6;
        this.webPriceDiscountAmount = str7;
        this.webPriceDiscountRate = str8;
        this.symbol = str9;
        this.isAccessPass = z2;
        this.accessPassEndTime = j4;
    }

    public /* synthetic */ MinisRechargeSheetParams(String str, String str2, long j, long j2, String str3, String str4, String str5, long j3, boolean z, String str6, String str7, String str8, String str9, boolean z2, long j4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? 0L : j3, (i & 256) != 0 ? false : z, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str9 : "", (i & 8192) == 0 ? z2 : false, (i & 16384) != 0 ? 0L : j4);
    }
}
