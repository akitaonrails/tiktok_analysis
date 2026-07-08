package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.EnumC1717460unI;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinSetRouteArg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PinSetRouteArg implements IRouteArg {
    public static final Parcelable.Creator<PinSetRouteArg> CREATOR = new Parcelable.Creator<PinSetRouteArg>() { // from class: X.0upa
        @Override // android.os.Parcelable.Creator
        public final PinSetRouteArg createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            EnumC1717460unI enumC1717460unIValueOf = EnumC1717460unI.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            int i3 = parcel.readInt();
            HashMap map = new HashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                map.put(parcel.readString(), parcel.readString());
            }
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new PinSetRouteArg(enumC1717460unIValueOf, arrayList, string, string2, string3, string4, string5, string6, string7, string8, z, string9, string10, string11, string12, string13, string14, string15, map, string16, string17, string18, string19, string20, string21, string22, z2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PinSetRouteArg[] newArray(int i) {
            return new PinSetRouteArg[i];
        }
    };
    public final String confirmPinDesc;
    public final String confirmPinTitle;
    public final String continueText;
    public final String coolingOffNotice;
    public final String createPinDesc;
    public final String createPinTitle;
    public final String customerServiceUrl;
    public final String enterFrom;
    public final String eventParam;
    public final String exitPopoutBtnMain;
    public final String exitPopoutBtnSub;
    public final String exitPopoutDesc;
    public final String exitPopoutImageDarkUrl;
    public final String exitPopoutImageUrl;
    public final String exitPopoutTitle;
    public final HashMap<String, String> experimentsMap;
    public final String footerText;
    public final boolean hitMarketing;
    public final String host;
    public final String merchantId;
    public final String merchantUserId;
    public final boolean noAnimation;
    public final List<PinRule> pinRuleList;
    public final EnumC1717460unI pinSetMode;
    public final String previousPageId;
    public final String scene;
    public final String sessionId;
    public final String sourceBtmToken;
    public final String theme;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pinSetMode.name());
        List<PinRule> list = this.pinRuleList;
        parcel.writeInt(list.size());
        Iterator<PinRule> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.previousPageId);
        parcel.writeString(this.scene);
        parcel.writeString(this.eventParam);
        parcel.writeString(this.host);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.merchantId);
        parcel.writeString(this.merchantUserId);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.noAnimation ? 1 : 0);
        parcel.writeString(this.theme);
        parcel.writeString(this.createPinTitle);
        parcel.writeString(this.createPinDesc);
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
        parcel.writeInt(this.hitMarketing ? 1 : 0);
        parcel.writeString(this.sourceBtmToken);
        parcel.writeString(this.coolingOffNotice);
    }

    public PinSetRouteArg() {
        this(EnumC1717460unI.REGISTER, new ArrayList(), "", "", "", "", "", "", "", "", false, "default", "", "", "", "", "", "", new HashMap(), "", "", "", "", "", "", "", false, null, "");
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

    public final String getCoolingOffNotice() {
        return this.coolingOffNotice;
    }

    public final String getCreatePinDesc() {
        return this.createPinDesc;
    }

    public final String getCreatePinTitle() {
        return this.createPinTitle;
    }

    public final String getCustomerServiceUrl() {
        return this.customerServiceUrl;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
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

    public final String getFooterText() {
        return this.footerText;
    }

    public final boolean getHitMarketing() {
        return this.hitMarketing;
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

    public final boolean getNoAnimation() {
        return this.noAnimation;
    }

    public final List<PinRule> getPinRuleList() {
        return this.pinRuleList;
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

    public final String getSourceBtmToken() {
        return this.sourceBtmToken;
    }

    public final String getTheme() {
        return this.theme;
    }

    public static PinSetRouteArg __fromBundle(Bundle bundle) {
        int i;
        EnumC1717460unI enumC1717460unI;
        List arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        HashMap map;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Boolean bool;
        String str23;
        String str24;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean bool2 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("KEY_SET_MODE")) {
            enumC1717460unI = (EnumC1717460unI) RouteParser.INSTANCE.parse(bundle.get("KEY_SET_MODE"), EnumC1717460unI.class);
            i = 0;
        } else {
            i = 1;
            enumC1717460unI = null;
        }
        if (bundle.containsKey("KEY_PIN_RULE_LIST")) {
            arrayList = (List) RouteParser.INSTANCE.parse(bundle.get("KEY_PIN_RULE_LIST"), List.class);
        } else {
            i += 2;
            arrayList = null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("KEY_SCENE")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("KEY_SCENE"), String.class);
        } else {
            i += 8;
            str2 = null;
        }
        if (bundle.containsKey("KEY_EVENT_PARAM")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("KEY_EVENT_PARAM"), String.class);
        } else {
            i += 16;
            str3 = null;
        }
        if (bundle.containsKey("host")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("host"), String.class);
        } else {
            i += 32;
            str4 = null;
        }
        if (bundle.containsKey("session_id")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("session_id"), String.class);
        } else {
            i += 64;
            str5 = null;
        }
        if (bundle.containsKey("merchant_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("merchant_id"), String.class);
        } else {
            i += 128;
            str6 = null;
        }
        if (bundle.containsKey("merchant_user_id")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("merchant_user_id"), String.class);
        } else {
            i += 256;
            str7 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 512;
            str8 = null;
        }
        if (!bundle.containsKey("no_animation") || (bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("no_animation"), Boolean.class)) == null) {
            i += 1024;
        }
        if (bundle.containsKey("theme")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("theme"), String.class);
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            str9 = null;
        }
        if (bundle.containsKey("create_pin_title")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("create_pin_title"), String.class);
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            str10 = null;
        }
        if (bundle.containsKey("create_pin_desc")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("create_pin_desc"), String.class);
        } else {
            i += 8192;
            str11 = null;
        }
        if (bundle.containsKey("confirm_pin_title")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("confirm_pin_title"), String.class);
        } else {
            i += 16384;
            str12 = null;
        }
        if (bundle.containsKey("confirm_pin_desc")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("confirm_pin_desc"), String.class);
        } else {
            i += 32768;
            str13 = null;
        }
        if (bundle.containsKey("continue_text")) {
            str14 = (String) RouteParser.INSTANCE.parse(bundle.get("continue_text"), String.class);
        } else {
            i += 65536;
            str14 = null;
        }
        if (bundle.containsKey("footer_text")) {
            str15 = (String) RouteParser.INSTANCE.parse(bundle.get("footer_text"), String.class);
        } else {
            i += 131072;
            str15 = null;
        }
        if (bundle.containsKey("exp_map")) {
            map = (HashMap) RouteParser.INSTANCE.parse(bundle.get("exp_map"), HashMap.class);
        } else {
            i += 262144;
            map = null;
        }
        if (bundle.containsKey("customer_service_url")) {
            str16 = (String) RouteParser.INSTANCE.parse(bundle.get("customer_service_url"), String.class);
        } else {
            i += 524288;
            str16 = null;
        }
        if (bundle.containsKey("exit_popout_title")) {
            str17 = (String) RouteParser.INSTANCE.parse(bundle.get("exit_popout_title"), String.class);
        } else {
            i += 1048576;
            str17 = null;
        }
        if (bundle.containsKey("exit_popout_desc")) {
            str18 = (String) RouteParser.INSTANCE.parse(bundle.get("exit_popout_desc"), String.class);
        } else {
            i += 2097152;
            str18 = null;
        }
        if (bundle.containsKey("exit_popout_btn_main")) {
            str19 = (String) RouteParser.INSTANCE.parse(bundle.get("exit_popout_btn_main"), String.class);
        } else {
            i += 4194304;
            str19 = null;
        }
        if (bundle.containsKey("exit_popout_btn_sub")) {
            str20 = (String) RouteParser.INSTANCE.parse(bundle.get("exit_popout_btn_sub"), String.class);
        } else {
            i += 8388608;
            str20 = null;
        }
        if (bundle.containsKey("exit_popout_image_url")) {
            str21 = (String) RouteParser.INSTANCE.parse(bundle.get("exit_popout_image_url"), String.class);
        } else {
            i += 16777216;
            str21 = null;
        }
        if (bundle.containsKey("exit_popout_image_dark_url")) {
            str22 = (String) RouteParser.INSTANCE.parse(bundle.get("exit_popout_image_dark_url"), String.class);
        } else {
            i += 33554432;
            str22 = null;
        }
        if (bundle.containsKey("hit_marketing")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("hit_marketing"), Boolean.class);
            if (bool == null) {
                i += 67108864;
            }
        } else {
            i += 67108864;
            bool = null;
        }
        if (bundle.containsKey("source_btm_token")) {
            str23 = (String) RouteParser.INSTANCE.parse(bundle.get("source_btm_token"), String.class);
        } else {
            i += 134217728;
            str23 = null;
        }
        if (bundle.containsKey("cooling_off_notice")) {
            str24 = (String) RouteParser.INSTANCE.parse(bundle.get("cooling_off_notice"), String.class);
        } else {
            i += 268435456;
            str24 = null;
        }
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool != null) {
            zBooleanValue2 = bool.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if ((i & 1) != 0) {
            enumC1717460unI = EnumC1717460unI.REGISTER;
        }
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        String str25 = "";
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            str5 = "";
        }
        if ((i & 128) != 0) {
            str6 = "";
        }
        if ((i & 256) != 0) {
            str7 = "";
        }
        if ((i & 512) != 0) {
            str8 = "";
        }
        if ((i & 1024) != 0) {
            zBooleanValue = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = "default";
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = "";
        }
        if ((i & 8192) != 0) {
            str11 = "";
        }
        if ((i & 16384) != 0) {
            str12 = "";
        }
        if ((32768 & i) != 0) {
            str13 = "";
        }
        if ((65536 & i) != 0) {
            str14 = "";
        }
        if ((131072 & i) != 0) {
            str15 = "";
        }
        if ((262144 & i) != 0) {
            map = new HashMap();
        }
        if ((524288 & i) != 0) {
            str16 = "";
        }
        if ((1048576 & i) != 0) {
            str17 = "";
        }
        if ((2097152 & i) != 0) {
            str18 = "";
        }
        if ((4194304 & i) != 0) {
            str19 = "";
        }
        if ((8388608 & i) != 0) {
            str20 = "";
        }
        if ((16777216 & i) != 0) {
            str21 = "";
        }
        if ((33554432 & i) != 0) {
            str22 = "";
        }
        if ((67108864 & i) != 0) {
            zBooleanValue2 = false;
        }
        if ((134217728 & i) != 0) {
            str23 = null;
        }
        if ((i & 268435456) == 0) {
            str25 = str24;
        }
        return new PinSetRouteArg(enumC1717460unI, arrayList, str, str2, str3, str4, str5, str6, str7, str8, zBooleanValue, str9, str10, str11, str12, str13, str14, str15, map, str16, str17, str18, str19, str20, str21, str22, zBooleanValue2, str23, str25);
    }

    public PinSetRouteArg(EnumC1717460unI enumC1717460unI, List<PinRule> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, HashMap<String, String> map, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, String str23, String str24) {
        this.pinSetMode = enumC1717460unI;
        this.pinRuleList = list;
        this.previousPageId = str;
        this.scene = str2;
        this.eventParam = str3;
        this.host = str4;
        this.sessionId = str5;
        this.merchantId = str6;
        this.merchantUserId = str7;
        this.enterFrom = str8;
        this.noAnimation = z;
        this.theme = str9;
        this.createPinTitle = str10;
        this.createPinDesc = str11;
        this.confirmPinTitle = str12;
        this.confirmPinDesc = str13;
        this.continueText = str14;
        this.footerText = str15;
        this.experimentsMap = map;
        this.customerServiceUrl = str16;
        this.exitPopoutTitle = str17;
        this.exitPopoutDesc = str18;
        this.exitPopoutBtnMain = str19;
        this.exitPopoutBtnSub = str20;
        this.exitPopoutImageUrl = str21;
        this.exitPopoutImageDarkUrl = str22;
        this.hitMarketing = z2;
        this.sourceBtmToken = str23;
        this.coolingOffNotice = str24;
    }
}
