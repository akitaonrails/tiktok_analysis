package com.ss.android.ugc.aweme.component.phone.ttmobile;

import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.ss.android.ugc.aweme.component.phone.ttmobile.TTPhoneRouteArg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPhoneRouteArg implements IRouteArg {
    public static final Parcelable.Creator<TTPhoneRouteArg> CREATOR = new Parcelable.Creator<TTPhoneRouteArg>() { // from class: X.0mfw
        @Override // android.os.Parcelable.Creator
        public final TTPhoneRouteArg createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(TTPhoneRouteArg.class.getClassLoader()));
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i3 = parcel.readInt();
            HashMap map = new HashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                map.put(parcel.readString(), parcel.readString());
            }
            return new TTPhoneRouteArg(string, string2, z, arrayList, string3, string4, string5, string6, string7, string8, string9, z2, string10, string11, z3, string12, string13, string14, string15, z4, map, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTPhoneRouteArg[] newArray(int i) {
            return new TTPhoneRouteArg[i];
        }
    };
    public final String agreement;
    public final String anotherButtonText;
    public final boolean autoCloseSelfOtp;
    public final String continueButtonText;
    public final String customerServiceUrl;
    public final String desc;
    public final String eventParam;
    public final HashMap<String, String> experimentsMap;
    public final String mobileDesc;
    public final String mobileMask;
    public final String mode;
    public final boolean noAnimation;
    public final String phonePageContinue;
    public final String phonePageDesc;
    public final String phonePageFooter;
    public final String phonePageTitle;
    public final String previousPageId;
    public final ArrayList<RegionMobileCodeItem> regionCountryCode;
    public final String scene;
    public final boolean selfVerify;
    public final String sourceBtmToken;
    public final boolean supportAnotherPhone;
    public final String title;
    public final String ttMobileAgreement;

    public final TTPhoneRouteArg copy(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, boolean z4, HashMap<String, String> map, String str16, String str17, String str18) {
        return new TTPhoneRouteArg(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, str15, z4, map, str16, str17, str18);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTPhoneRouteArg)) {
            return false;
        }
        TTPhoneRouteArg tTPhoneRouteArg = (TTPhoneRouteArg) obj;
        return Intrinsics.LJFF(this.scene, tTPhoneRouteArg.scene) && Intrinsics.LJFF(this.title, tTPhoneRouteArg.title) && this.noAnimation == tTPhoneRouteArg.noAnimation && Intrinsics.LJFF(this.regionCountryCode, tTPhoneRouteArg.regionCountryCode) && Intrinsics.LJFF(this.agreement, tTPhoneRouteArg.agreement) && Intrinsics.LJFF(this.previousPageId, tTPhoneRouteArg.previousPageId) && Intrinsics.LJFF(this.eventParam, tTPhoneRouteArg.eventParam) && Intrinsics.LJFF(this.desc, tTPhoneRouteArg.desc) && Intrinsics.LJFF(this.mobileDesc, tTPhoneRouteArg.mobileDesc) && Intrinsics.LJFF(this.mobileMask, tTPhoneRouteArg.mobileMask) && Intrinsics.LJFF(this.ttMobileAgreement, tTPhoneRouteArg.ttMobileAgreement) && this.supportAnotherPhone == tTPhoneRouteArg.supportAnotherPhone && Intrinsics.LJFF(this.continueButtonText, tTPhoneRouteArg.continueButtonText) && Intrinsics.LJFF(this.anotherButtonText, tTPhoneRouteArg.anotherButtonText) && this.selfVerify == tTPhoneRouteArg.selfVerify && Intrinsics.LJFF(this.phonePageTitle, tTPhoneRouteArg.phonePageTitle) && Intrinsics.LJFF(this.phonePageDesc, tTPhoneRouteArg.phonePageDesc) && Intrinsics.LJFF(this.phonePageContinue, tTPhoneRouteArg.phonePageContinue) && Intrinsics.LJFF(this.phonePageFooter, tTPhoneRouteArg.phonePageFooter) && this.autoCloseSelfOtp == tTPhoneRouteArg.autoCloseSelfOtp && Intrinsics.LJFF(this.experimentsMap, tTPhoneRouteArg.experimentsMap) && Intrinsics.LJFF(this.mode, tTPhoneRouteArg.mode) && Intrinsics.LJFF(this.customerServiceUrl, tTPhoneRouteArg.customerServiceUrl) && Intrinsics.LJFF(this.sourceBtmToken, tTPhoneRouteArg.sourceBtmToken);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.scene.hashCode() * 31) + this.title.hashCode()) * 31) + C786410Ut5.Z2(this.noAnimation)) * 31) + this.regionCountryCode.hashCode()) * 31) + this.agreement.hashCode()) * 31) + this.previousPageId.hashCode()) * 31) + this.eventParam.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.mobileDesc.hashCode()) * 31) + this.mobileMask.hashCode()) * 31) + this.ttMobileAgreement.hashCode()) * 31) + C786410Ut5.Z2(this.supportAnotherPhone)) * 31) + this.continueButtonText.hashCode()) * 31) + this.anotherButtonText.hashCode()) * 31) + C786410Ut5.Z2(this.selfVerify)) * 31) + this.phonePageTitle.hashCode()) * 31) + this.phonePageDesc.hashCode()) * 31) + this.phonePageContinue.hashCode()) * 31) + this.phonePageFooter.hashCode()) * 31) + C786410Ut5.Z2(this.autoCloseSelfOtp)) * 31) + this.experimentsMap.hashCode()) * 31) + this.mode.hashCode()) * 31) + this.customerServiceUrl.hashCode()) * 31) + this.sourceBtmToken.hashCode();
    }

    public String toString() {
        return "TTPhoneRouteArg(scene=" + this.scene + ", title=" + this.title + ", noAnimation=" + this.noAnimation + ", regionCountryCode=" + this.regionCountryCode + ", agreement=" + this.agreement + ", previousPageId=" + this.previousPageId + ", eventParam=" + this.eventParam + ", desc=" + this.desc + ", mobileDesc=" + this.mobileDesc + ", mobileMask=" + this.mobileMask + ", ttMobileAgreement=" + this.ttMobileAgreement + ", supportAnotherPhone=" + this.supportAnotherPhone + ", continueButtonText=" + this.continueButtonText + ", anotherButtonText=" + this.anotherButtonText + ", selfVerify=" + this.selfVerify + ", phonePageTitle=" + this.phonePageTitle + ", phonePageDesc=" + this.phonePageDesc + ", phonePageContinue=" + this.phonePageContinue + ", phonePageFooter=" + this.phonePageFooter + ", autoCloseSelfOtp=" + this.autoCloseSelfOtp + ", experimentsMap=" + this.experimentsMap + ", mode=" + this.mode + ", customerServiceUrl=" + this.customerServiceUrl + ", sourceBtmToken=" + this.sourceBtmToken + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scene);
        parcel.writeString(this.title);
        parcel.writeInt(this.noAnimation ? 1 : 0);
        ArrayList<RegionMobileCodeItem> arrayList = this.regionCountryCode;
        parcel.writeInt(arrayList.size());
        Iterator<RegionMobileCodeItem> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeString(this.agreement);
        parcel.writeString(this.previousPageId);
        parcel.writeString(this.eventParam);
        parcel.writeString(this.desc);
        parcel.writeString(this.mobileDesc);
        parcel.writeString(this.mobileMask);
        parcel.writeString(this.ttMobileAgreement);
        parcel.writeInt(this.supportAnotherPhone ? 1 : 0);
        parcel.writeString(this.continueButtonText);
        parcel.writeString(this.anotherButtonText);
        parcel.writeInt(this.selfVerify ? 1 : 0);
        parcel.writeString(this.phonePageTitle);
        parcel.writeString(this.phonePageDesc);
        parcel.writeString(this.phonePageContinue);
        parcel.writeString(this.phonePageFooter);
        parcel.writeInt(this.autoCloseSelfOtp ? 1 : 0);
        HashMap<String, String> map = this.experimentsMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.mode);
        parcel.writeString(this.customerServiceUrl);
        parcel.writeString(this.sourceBtmToken);
    }

    public TTPhoneRouteArg() {
        this("", "", false, new ArrayList(), "", "", "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public final String getAgreement() {
        return this.agreement;
    }

    public final String getAnotherButtonText() {
        return this.anotherButtonText;
    }

    public final boolean getAutoCloseSelfOtp() {
        return this.autoCloseSelfOtp;
    }

    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    public final String getCustomerServiceUrl() {
        return this.customerServiceUrl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getEventParam() {
        return this.eventParam;
    }

    public final HashMap<String, String> getExperimentsMap() {
        return this.experimentsMap;
    }

    public final String getMobileDesc() {
        return this.mobileDesc;
    }

    public final String getMobileMask() {
        return this.mobileMask;
    }

    public final String getMode() {
        return this.mode;
    }

    public final boolean getNoAnimation() {
        return this.noAnimation;
    }

    public final String getPhonePageContinue() {
        return this.phonePageContinue;
    }

    public final String getPhonePageDesc() {
        return this.phonePageDesc;
    }

    public final String getPhonePageFooter() {
        return this.phonePageFooter;
    }

    public final String getPhonePageTitle() {
        return this.phonePageTitle;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final ArrayList<RegionMobileCodeItem> getRegionCountryCode() {
        return this.regionCountryCode;
    }

    public final String getScene() {
        return this.scene;
    }

    public final boolean getSelfVerify() {
        return this.selfVerify;
    }

    public final String getSourceBtmToken() {
        return this.sourceBtmToken;
    }

    public final boolean getSupportAnotherPhone() {
        return this.supportAnotherPhone;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTtMobileAgreement() {
        return this.ttMobileAgreement;
    }

    public TTPhoneRouteArg(String str) {
        this(str, "", false, new ArrayList(), "", "", "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public static TTPhoneRouteArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Boolean bool;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool2;
        String str9;
        String str10;
        Boolean bool3;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool4;
        HashMap map;
        String str15;
        String str16;
        String str17;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        String str18 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey(Scene.SCENE_SERVICE)) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get(Scene.SCENE_SERVICE), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("title")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("title"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("no_animation")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("no_animation"), Boolean.class);
            if (bool == null) {
                i += 4;
            }
        } else {
            i += 4;
            bool = null;
        }
        if (bundle.containsKey("phone_region_country_code")) {
            arrayList = (ArrayList) RouteParser.INSTANCE.parse(bundle.get("phone_region_country_code"), ArrayList.class);
        } else {
            i += 8;
            arrayList = null;
        }
        if (bundle.containsKey("agreement")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("agreement"), String.class);
        } else {
            i += 16;
            str3 = null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
        } else {
            i += 32;
            str4 = null;
        }
        if (bundle.containsKey("event_param")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("event_param"), String.class);
        } else {
            i += 64;
            str5 = null;
        }
        if (bundle.containsKey("desc")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("desc"), String.class);
        } else {
            i += 128;
            str6 = null;
        }
        if (bundle.containsKey("mobile_desc")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("mobile_desc"), String.class);
        } else {
            i += 256;
            str7 = null;
        }
        if (bundle.containsKey("mobile_mask")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("mobile_mask"), String.class);
        } else {
            i += 512;
            str8 = null;
        }
        if (bundle.containsKey("tt_mobile_agreement")) {
            str18 = (String) RouteParser.INSTANCE.parse(bundle.get("tt_mobile_agreement"), String.class);
        } else {
            i += 1024;
        }
        if (bundle.containsKey("support_another_phone")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("support_another_phone"), Boolean.class);
            if (bool2 == null) {
                i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            bool2 = null;
        }
        if (bundle.containsKey("continue")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("continue"), String.class);
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            str9 = null;
        }
        if (bundle.containsKey("another")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("another"), String.class);
        } else {
            i += 8192;
            str10 = null;
        }
        if (bundle.containsKey("self_verify")) {
            bool3 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("self_verify"), Boolean.class);
            if (bool3 == null) {
                i += 16384;
            }
        } else {
            i += 16384;
            bool3 = null;
        }
        if (bundle.containsKey("phone_page_title")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("phone_page_title"), String.class);
        } else {
            i += 32768;
            str11 = null;
        }
        if (bundle.containsKey("phone_page_desc")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("phone_page_desc"), String.class);
        } else {
            i += 65536;
            str12 = null;
        }
        if (bundle.containsKey("phone_page_continue")) {
            str13 = (String) RouteParser.INSTANCE.parse(bundle.get("phone_page_continue"), String.class);
        } else {
            i += 131072;
            str13 = null;
        }
        if (bundle.containsKey("phone_page_footer")) {
            str14 = (String) RouteParser.INSTANCE.parse(bundle.get("phone_page_footer"), String.class);
        } else {
            i += 262144;
            str14 = null;
        }
        if (bundle.containsKey("auto_close_self_otp")) {
            bool4 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("auto_close_self_otp"), Boolean.class);
            if (bool4 == null) {
                i += 524288;
            }
        } else {
            i += 524288;
            bool4 = null;
        }
        if (bundle.containsKey("exp_map")) {
            map = (HashMap) RouteParser.INSTANCE.parse(bundle.get("exp_map"), HashMap.class);
        } else {
            i += 1048576;
            map = null;
        }
        if (bundle.containsKey("mobile_mode")) {
            str15 = (String) RouteParser.INSTANCE.parse(bundle.get("mobile_mode"), String.class);
        } else {
            i += 2097152;
            str15 = null;
        }
        if (bundle.containsKey("customer_service_url")) {
            str16 = (String) RouteParser.INSTANCE.parse(bundle.get("customer_service_url"), String.class);
        } else {
            i += 4194304;
            str16 = null;
        }
        if (bundle.containsKey("source_btm_token")) {
            str17 = (String) RouteParser.INSTANCE.parse(bundle.get("source_btm_token"), String.class);
        } else {
            i += 8388608;
            str17 = null;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        String str19 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            zBooleanValue = false;
        }
        if ((i & 8) != 0) {
            arrayList = new ArrayList();
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
            str18 = "";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            zBooleanValue2 = true;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = "";
        }
        if ((i & 8192) != 0) {
            str10 = "";
        }
        if ((i & 16384) != 0) {
            zBooleanValue3 = false;
        }
        if ((32768 & i) != 0) {
            str11 = "";
        }
        if ((65536 & i) != 0) {
            str12 = "";
        }
        if ((131072 & i) != 0) {
            str13 = "";
        }
        if ((262144 & i) != 0) {
            str14 = "";
        }
        if ((524288 & i) != 0) {
            zBooleanValue4 = true;
        }
        if ((1048576 & i) != 0) {
            map = new HashMap();
        }
        if ((2097152 & i) != 0) {
            str15 = "";
        }
        if ((4194304 & i) != 0) {
            str16 = "";
        }
        if ((i & 8388608) == 0) {
            str19 = str17;
        }
        return new TTPhoneRouteArg(str, str2, zBooleanValue, arrayList, str3, str4, str5, str6, str7, str8, str18, zBooleanValue2, str9, str10, zBooleanValue3, str11, str12, str13, str14, zBooleanValue4, map, str15, str16, str19);
    }

    public TTPhoneRouteArg(String str, String str2) {
        this(str, str2, false, new ArrayList(), "", "", "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z) {
        this(str, str2, z, new ArrayList(), "", "", "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList) {
        this(str, str2, z, arrayList, "", "", "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3) {
        this(str, str2, z, arrayList, str3, "", "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4) {
        this(str, str2, z, arrayList, str3, str4, "", "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5) {
        this(str, str2, z, arrayList, str3, str4, str5, "", "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, "", "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, "", "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, "", true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, true, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, "", "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, "", false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, false, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, "", "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, "", "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, "", "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, "", true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, str15, true, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, boolean z4) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, str15, z4, new HashMap(), "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, boolean z4, HashMap<String, String> map) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, str15, z4, map, "", "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, boolean z4, HashMap<String, String> map, String str16) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, str15, z4, map, str16, "", "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, boolean z4, HashMap<String, String> map, String str16, String str17) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, str10, str11, z3, str12, str13, str14, str15, z4, map, str16, str17, "");
    }

    public TTPhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, boolean z3, String str12, String str13, String str14, String str15, boolean z4, HashMap<String, String> map, String str16, String str17, String str18) {
        this.scene = str;
        this.title = str2;
        this.noAnimation = z;
        this.regionCountryCode = arrayList;
        this.agreement = str3;
        this.previousPageId = str4;
        this.eventParam = str5;
        this.desc = str6;
        this.mobileDesc = str7;
        this.mobileMask = str8;
        this.ttMobileAgreement = str9;
        this.supportAnotherPhone = z2;
        this.continueButtonText = str10;
        this.anotherButtonText = str11;
        this.selfVerify = z3;
        this.phonePageTitle = str12;
        this.phonePageDesc = str13;
        this.phonePageContinue = str14;
        this.phonePageFooter = str15;
        this.autoCloseSelfOtp = z4;
        this.experimentsMap = map;
        this.mode = str16;
        this.customerServiceUrl = str17;
        this.sourceBtmToken = str18;
    }
}
