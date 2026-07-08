package com.ss.android.ugc.aweme.im.strategy.commonresource;

import X.C09CT;
import X.C0ZMF;
import X.C2188811AlT;
import X.C909850Zmh;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GreetingCardResource extends C0ZMF {
    public static final C909850Zmh Companion = new Object() { // from class: X.0Zmh
    };

    @C09CT("msg_list_closed_card_image_url")
    public final String closedCardMessageListImageUrl;

    @C09CT("event_tracking_name")
    public final String eventTrackingName;

    @C09CT("gecko_channel_name")
    public final String geckoChannelName;

    @C09CT("has_pregenerated_texts")
    public final Boolean hasPregeneratedText;

    @C09CT("card_use_dark_text")
    public final Boolean isUseDarkModeText;

    @C09CT("msg_list_opened_card_image_url")
    public final String openedCardMessageListImageUrl;

    @C09CT("send_button_color")
    public final String sendButtonColor;

    @C09CT("send_button_text_color")
    public final String sendButtonTextColor;

    public GreetingCardResource() {
        this(null, null, null, null, null, null, null, null);
    }

    public final GreetingCardResource copy(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6) {
        return new GreetingCardResource(str, str2, bool, bool2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreetingCardResource)) {
            return false;
        }
        GreetingCardResource greetingCardResource = (GreetingCardResource) obj;
        return Intrinsics.LJFF(this.geckoChannelName, greetingCardResource.geckoChannelName) && Intrinsics.LJFF(this.eventTrackingName, greetingCardResource.eventTrackingName) && Intrinsics.LJFF(this.hasPregeneratedText, greetingCardResource.hasPregeneratedText) && Intrinsics.LJFF(this.isUseDarkModeText, greetingCardResource.isUseDarkModeText) && Intrinsics.LJFF(this.sendButtonColor, greetingCardResource.sendButtonColor) && Intrinsics.LJFF(this.sendButtonTextColor, greetingCardResource.sendButtonTextColor) && Intrinsics.LJFF(this.closedCardMessageListImageUrl, greetingCardResource.closedCardMessageListImageUrl) && Intrinsics.LJFF(this.openedCardMessageListImageUrl, greetingCardResource.openedCardMessageListImageUrl);
    }

    public int hashCode() {
        String str = this.geckoChannelName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventTrackingName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasPregeneratedText;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUseDarkModeText;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.sendButtonColor;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sendButtonTextColor;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.closedCardMessageListImageUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.openedCardMessageListImageUrl;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GreetingCardResource(geckoChannelName=");
        sbLIZ.append(this.geckoChannelName);
        sbLIZ.append(", eventTrackingName=");
        sbLIZ.append(this.eventTrackingName);
        sbLIZ.append(", hasPregeneratedText=");
        sbLIZ.append(this.hasPregeneratedText);
        sbLIZ.append(", isUseDarkModeText=");
        sbLIZ.append(this.isUseDarkModeText);
        sbLIZ.append(", sendButtonColor=");
        sbLIZ.append(this.sendButtonColor);
        sbLIZ.append(", sendButtonTextColor=");
        sbLIZ.append(this.sendButtonTextColor);
        sbLIZ.append(", closedCardMessageListImageUrl=");
        sbLIZ.append(this.closedCardMessageListImageUrl);
        sbLIZ.append(", openedCardMessageListImageUrl=");
        sbLIZ.append(this.openedCardMessageListImageUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getSendButtonColorInt() {
        String str = this.sendButtonColor;
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Integer sendButtonTextColorInt() {
        String str = this.sendButtonTextColor;
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String getClosedCardMessageListImageUrl() {
        return this.closedCardMessageListImageUrl;
    }

    public final String getEventTrackingName() {
        return this.eventTrackingName;
    }

    public final String getGeckoChannelName() {
        return this.geckoChannelName;
    }

    public final Boolean getHasPregeneratedText() {
        return this.hasPregeneratedText;
    }

    public final String getOpenedCardMessageListImageUrl() {
        return this.openedCardMessageListImageUrl;
    }

    public final Boolean isUseDarkModeText() {
        return this.isUseDarkModeText;
    }

    public GreetingCardResource(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6) {
        this.geckoChannelName = str;
        this.eventTrackingName = str2;
        this.hasPregeneratedText = bool;
        this.isUseDarkModeText = bool2;
        this.sendButtonColor = str3;
        this.sendButtonTextColor = str4;
        this.closedCardMessageListImageUrl = str5;
        this.openedCardMessageListImageUrl = str6;
    }
}
