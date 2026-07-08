package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMCreativeCommonModel implements Parcelable {
    public static final Parcelable.Creator<IMCreativeCommonModel> CREATOR = new Parcelable.Creator<IMCreativeCommonModel>() { // from class: X.0nho
        @Override // android.os.Parcelable.Creator
        public final IMCreativeCommonModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new IMCreativeCommonModel(string, string2, i, string3, string4, z, parcel.readInt(), parcel.readString(), parcel.readString(), (QuoteMode) parcel.readParcelable(IMCreativeCommonModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IMCreativeCommonModel[] newArray(int i) {
            return new IMCreativeCommonModel[i];
        }
    };
    public final int chatType;
    public final String conversationId;
    public final String enterCreativeMethod;
    public final String enterDM;
    public final String enterDMMethod;
    public final String enterDMWay;
    public final String enterFrom;
    public final String enterMethod;
    public final String enterMethodType;
    public final String photoSwapPairedMsgId;
    public final String photoSwapScene;
    public final QuoteMode quoteMode;
    public final boolean shouldDisplayRestrictSharingNoticeShooting;
    public final int tnsNoticeRes;

    /* JADX WARN: Illegal instructions before constructor call */
    public IMCreativeCommonModel() {
        String str = null;
        this(str, str, 0, str, str, 16383);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMCreativeCommonModel)) {
            return false;
        }
        IMCreativeCommonModel iMCreativeCommonModel = (IMCreativeCommonModel) obj;
        return Intrinsics.LJFF(this.enterFrom, iMCreativeCommonModel.enterFrom) && Intrinsics.LJFF(this.enterDM, iMCreativeCommonModel.enterDM) && this.chatType == iMCreativeCommonModel.chatType && Intrinsics.LJFF(this.enterDMMethod, iMCreativeCommonModel.enterDMMethod) && Intrinsics.LJFF(this.enterDMWay, iMCreativeCommonModel.enterDMWay) && this.shouldDisplayRestrictSharingNoticeShooting == iMCreativeCommonModel.shouldDisplayRestrictSharingNoticeShooting && this.tnsNoticeRes == iMCreativeCommonModel.tnsNoticeRes && Intrinsics.LJFF(this.photoSwapScene, iMCreativeCommonModel.photoSwapScene) && Intrinsics.LJFF(this.photoSwapPairedMsgId, iMCreativeCommonModel.photoSwapPairedMsgId) && Intrinsics.LJFF(this.quoteMode, iMCreativeCommonModel.quoteMode) && Intrinsics.LJFF(this.conversationId, iMCreativeCommonModel.conversationId) && Intrinsics.LJFF(this.enterMethod, iMCreativeCommonModel.enterMethod) && Intrinsics.LJFF(this.enterMethodType, iMCreativeCommonModel.enterMethodType) && Intrinsics.LJFF(this.enterCreativeMethod, iMCreativeCommonModel.enterCreativeMethod);
    }

    public final int hashCode() {
        int iHashCode = this.enterFrom.hashCode() * 31;
        String str = this.enterDM;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.chatType) * 31;
        String str2 = this.enterDMMethod;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.enterDMWay.hashCode()) * 31) + C786410Ut5.Z2(this.shouldDisplayRestrictSharingNoticeShooting)) * 31) + this.tnsNoticeRes) * 31;
        String str3 = this.photoSwapScene;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoSwapPairedMsgId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        QuoteMode quoteMode = this.quoteMode;
        int iHashCode6 = (iHashCode5 + (quoteMode == null ? 0 : quoteMode.hashCode())) * 31;
        String str5 = this.conversationId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.enterMethod;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.enterMethodType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.enterCreativeMethod;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "IMCreativeCommonModel(enterFrom=" + this.enterFrom + ", enterDM=" + this.enterDM + ", chatType=" + this.chatType + ", enterDMMethod=" + this.enterDMMethod + ", enterDMWay=" + this.enterDMWay + ", shouldDisplayRestrictSharingNoticeShooting=" + this.shouldDisplayRestrictSharingNoticeShooting + ", tnsNoticeRes=" + this.tnsNoticeRes + ", photoSwapScene=" + this.photoSwapScene + ", photoSwapPairedMsgId=" + this.photoSwapPairedMsgId + ", quoteMode=" + this.quoteMode + ", conversationId=" + this.conversationId + ", enterMethod=" + this.enterMethod + ", enterMethodType=" + this.enterMethodType + ", enterCreativeMethod=" + this.enterCreativeMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterDM);
        parcel.writeInt(this.chatType);
        parcel.writeString(this.enterDMMethod);
        parcel.writeString(this.enterDMWay);
        parcel.writeInt(this.shouldDisplayRestrictSharingNoticeShooting ? 1 : 0);
        parcel.writeInt(this.tnsNoticeRes);
        parcel.writeString(this.photoSwapScene);
        parcel.writeString(this.photoSwapPairedMsgId);
        parcel.writeParcelable(this.quoteMode, i);
        parcel.writeString(this.conversationId);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterMethodType);
        parcel.writeString(this.enterCreativeMethod);
    }

    public /* synthetic */ IMCreativeCommonModel(String str, String str2, int i, String str3, String str4, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) == 0 ? str3 : null, (i2 & 16) == 0 ? str4 : "", false, 0, null, null, null, null, null, null, null);
    }

    public IMCreativeCommonModel(String str, String str2, int i, String str3, String str4, boolean z, int i2, String str5, String str6, QuoteMode quoteMode, String str7, String str8, String str9, String str10) {
        this.enterFrom = str;
        this.enterDM = str2;
        this.chatType = i;
        this.enterDMMethod = str3;
        this.enterDMWay = str4;
        this.shouldDisplayRestrictSharingNoticeShooting = z;
        this.tnsNoticeRes = i2;
        this.photoSwapScene = str5;
        this.photoSwapPairedMsgId = str6;
        this.quoteMode = quoteMode;
        this.conversationId = str7;
        this.enterMethod = str8;
        this.enterMethodType = str9;
        this.enterCreativeMethod = str10;
    }
}
