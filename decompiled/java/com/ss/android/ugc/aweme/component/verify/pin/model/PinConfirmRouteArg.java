package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.EnumC1717460unI;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinConfirmRouteArg;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PinConfirmRouteArg implements IRouteArg {
    public static final Parcelable.Creator<PinConfirmRouteArg> CREATOR = new Parcelable.Creator<PinConfirmRouteArg>() { // from class: X.0uq3
        @Override // android.os.Parcelable.Creator
        public final PinConfirmRouteArg createFromParcel(Parcel parcel) {
            EnumC1717460unI enumC1717460unIValueOf = EnumC1717460unI.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
            return new PinConfirmRouteArg(enumC1717460unIValueOf, string, string2, string3, string4, j, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, map, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PinConfirmRouteArg[] newArray(int i) {
            return new PinConfirmRouteArg[i];
        }
    };
    public final String btmPageId;
    public final String confirmPinDesc;
    public final String confirmPinTitle;
    public final String continueText;
    public final String customerServiceUrl;
    public final String enterFrom;
    public final long enterTime;
    public final String eventParam;
    public final String exitPopoutBtnMain;
    public final String exitPopoutBtnSub;
    public final String exitPopoutDesc;
    public final String exitPopoutImageDarkUrl;
    public final String exitPopoutImageUrl;
    public final String exitPopoutTitle;
    public final HashMap<String, String> experimentsMap;
    public final String firstInputPin;
    public final String footerText;
    public final String host;
    public final String merchantId;
    public final String merchantUserId;
    public final EnumC1717460unI pinSetMode;
    public final String previousPageId;
    public final String scene;
    public final String sessionId;
    public final String theme;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pinSetMode.name());
        parcel.writeString(this.firstInputPin);
        parcel.writeString(this.previousPageId);
        parcel.writeString(this.scene);
        parcel.writeString(this.eventParam);
        parcel.writeLong(this.enterTime);
        parcel.writeString(this.host);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.merchantId);
        parcel.writeString(this.merchantUserId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.theme);
        parcel.writeString(this.confirmPinTitle);
        parcel.writeString(this.confirmPinDesc);
        parcel.writeString(this.continueText);
        parcel.writeString(this.footerText);
        HashMap<String, String> map = this.experimentsMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.customerServiceUrl);
        parcel.writeString(this.exitPopoutTitle);
        parcel.writeString(this.exitPopoutDesc);
        parcel.writeString(this.exitPopoutBtnMain);
        parcel.writeString(this.exitPopoutBtnSub);
        parcel.writeString(this.exitPopoutImageUrl);
        parcel.writeString(this.exitPopoutImageDarkUrl);
        parcel.writeString(this.btmPageId);
    }

    public final String getBtmPageId() {
        return this.btmPageId;
    }

    public final String getConfirmPinDesc() {
        return this.confirmPinDesc;
    }

    public final String getConfirmPinTitle() {
        return this.confirmPinTitle;
    }

    public final String getContinueText() {
        return this.continueText;
    }

    public final String getCustomerServiceUrl() {
        return this.customerServiceUrl;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final long getEnterTime() {
        return this.enterTime;
    }

    public final String getEventParam() {
        return this.eventParam;
    }

    public final String getExitPopoutBtnMain() {
        return this.exitPopoutBtnMain;
    }

    public final String getExitPopoutBtnSub() {
        return this.exitPopoutBtnSub;
    }

    public final String getExitPopoutDesc() {
        return this.exitPopoutDesc;
    }

    public final String getExitPopoutImageDarkUrl() {
        return this.exitPopoutImageDarkUrl;
    }

    public final String getExitPopoutImageUrl() {
        return this.exitPopoutImageUrl;
    }

    public final String getExitPopoutTitle() {
        return this.exitPopoutTitle;
    }

    public final HashMap<String, String> getExperimentsMap() {
        return this.experimentsMap;
    }

    public final String getFirstInputPin() {
        return this.firstInputPin;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final EnumC1717460unI getPinSetMode() {
        return this.pinSetMode;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTheme() {
        return this.theme;
    }

    public PinConfirmRouteArg(EnumC1717460unI enumC1717460unI, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, HashMap<String, String> map, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.pinSetMode = enumC1717460unI;
        this.firstInputPin = str;
        this.previousPageId = str2;
        this.scene = str3;
        this.eventParam = str4;
        this.enterTime = j;
        this.host = str5;
        this.sessionId = str6;
        this.merchantId = str7;
        this.merchantUserId = str8;
        this.enterFrom = str9;
        this.theme = str10;
        this.confirmPinTitle = str11;
        this.confirmPinDesc = str12;
        this.continueText = str13;
        this.footerText = str14;
        this.experimentsMap = map;
        this.customerServiceUrl = str15;
        this.exitPopoutTitle = str16;
        this.exitPopoutDesc = str17;
        this.exitPopoutBtnMain = str18;
        this.exitPopoutBtnSub = str19;
        this.exitPopoutImageUrl = str20;
        this.exitPopoutImageDarkUrl = str21;
        this.btmPageId = str22;
    }
}
