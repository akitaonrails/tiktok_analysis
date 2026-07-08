package com.ss.android.ugc.aweme.component.phone;

import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.ss.android.ugc.aweme.component.phone.PhoneRouteArg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PhoneRouteArg implements IRouteArg {
    public static final Parcelable.Creator<PhoneRouteArg> CREATOR = new Parcelable.Creator<PhoneRouteArg>() { // from class: X.0mg6
        @Override // android.os.Parcelable.Creator
        public final PhoneRouteArg createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(parcel.readParcelable(PhoneRouteArg.class.getClassLoader()));
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i4 = parcel.readInt();
            HashMap map = new HashMap(i4);
            while (true) {
                String string10 = parcel.readString();
                if (i != i4) {
                    map.put(string10, parcel.readString());
                    i++;
                } else {
                    return new PhoneRouteArg(string, string2, z, arrayList, string3, string4, string5, string6, string7, string8, string9, z2, z3, map, string10, parcel.readString(), parcel.readString());
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneRouteArg[] newArray(int i) {
            return new PhoneRouteArg[i];
        }
    };
    public final String agreement;
    public final boolean autoCloseSelfOtp;
    public final String continueText;
    public final String coolingOffNotice;
    public final String customerServiceUrl;
    public final String desc;
    public final String eventParam;
    public final HashMap<String, String> experimentsMap;
    public final String footer;
    public final String mode;
    public final boolean noAnimation;
    public final String previousPageId;
    public final ArrayList<RegionMobileCodeItem> regionCountryCode;
    public final String scene;
    public final boolean selfVerify;
    public final String sourceBtmToken;
    public final String title;

    public final PhoneRouteArg copy(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3, HashMap<String, String> map, String str10, String str11, String str12) {
        return new PhoneRouteArg(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, z3, map, str10, str11, str12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRouteArg)) {
            return false;
        }
        PhoneRouteArg phoneRouteArg = (PhoneRouteArg) obj;
        return Intrinsics.LJFF(this.scene, phoneRouteArg.scene) && Intrinsics.LJFF(this.title, phoneRouteArg.title) && this.noAnimation == phoneRouteArg.noAnimation && Intrinsics.LJFF(this.regionCountryCode, phoneRouteArg.regionCountryCode) && Intrinsics.LJFF(this.agreement, phoneRouteArg.agreement) && Intrinsics.LJFF(this.previousPageId, phoneRouteArg.previousPageId) && Intrinsics.LJFF(this.eventParam, phoneRouteArg.eventParam) && Intrinsics.LJFF(this.mode, phoneRouteArg.mode) && Intrinsics.LJFF(this.desc, phoneRouteArg.desc) && Intrinsics.LJFF(this.continueText, phoneRouteArg.continueText) && Intrinsics.LJFF(this.footer, phoneRouteArg.footer) && this.selfVerify == phoneRouteArg.selfVerify && this.autoCloseSelfOtp == phoneRouteArg.autoCloseSelfOtp && Intrinsics.LJFF(this.experimentsMap, phoneRouteArg.experimentsMap) && Intrinsics.LJFF(this.customerServiceUrl, phoneRouteArg.customerServiceUrl) && Intrinsics.LJFF(this.sourceBtmToken, phoneRouteArg.sourceBtmToken) && Intrinsics.LJFF(this.coolingOffNotice, phoneRouteArg.coolingOffNotice);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.scene.hashCode() * 31) + this.title.hashCode()) * 31) + C786410Ut5.Z2(this.noAnimation)) * 31) + this.regionCountryCode.hashCode()) * 31) + this.agreement.hashCode()) * 31) + this.previousPageId.hashCode()) * 31) + this.eventParam.hashCode()) * 31) + this.mode.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.continueText.hashCode()) * 31) + this.footer.hashCode()) * 31) + C786410Ut5.Z2(this.selfVerify)) * 31) + C786410Ut5.Z2(this.autoCloseSelfOtp)) * 31) + this.experimentsMap.hashCode()) * 31) + this.customerServiceUrl.hashCode()) * 31) + this.sourceBtmToken.hashCode()) * 31) + this.coolingOffNotice.hashCode();
    }

    public String toString() {
        return "PhoneRouteArg(scene=" + this.scene + ", title=" + this.title + ", noAnimation=" + this.noAnimation + ", regionCountryCode=" + this.regionCountryCode + ", agreement=" + this.agreement + ", previousPageId=" + this.previousPageId + ", eventParam=" + this.eventParam + ", mode=" + this.mode + ", desc=" + this.desc + ", continueText=" + this.continueText + ", footer=" + this.footer + ", selfVerify=" + this.selfVerify + ", autoCloseSelfOtp=" + this.autoCloseSelfOtp + ", experimentsMap=" + this.experimentsMap + ", customerServiceUrl=" + this.customerServiceUrl + ", sourceBtmToken=" + this.sourceBtmToken + ", coolingOffNotice=" + this.coolingOffNotice + ')';
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
        parcel.writeString(this.mode);
        parcel.writeString(this.desc);
        parcel.writeString(this.continueText);
        parcel.writeString(this.footer);
        parcel.writeInt(this.selfVerify ? 1 : 0);
        parcel.writeInt(this.autoCloseSelfOtp ? 1 : 0);
        HashMap<String, String> map = this.experimentsMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.customerServiceUrl);
        parcel.writeString(this.sourceBtmToken);
        parcel.writeString(this.coolingOffNotice);
    }

    public PhoneRouteArg() {
        this("", "", false, new ArrayList(), "", "", "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public final String getAgreement() {
        return this.agreement;
    }

    public final boolean getAutoCloseSelfOtp() {
        return this.autoCloseSelfOtp;
    }

    public final String getContinueText() {
        return this.continueText;
    }

    public final String getCoolingOffNotice() {
        return this.coolingOffNotice;
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

    public final String getFooter() {
        return this.footer;
    }

    public final String getMode() {
        return this.mode;
    }

    public final boolean getNoAnimation() {
        return this.noAnimation;
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

    public final String getTitle() {
        return this.title;
    }

    public PhoneRouteArg(String str) {
        this(str, "", false, new ArrayList(), "", "", "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public static PhoneRouteArg __fromBundle(Bundle bundle) {
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
        Boolean bool3;
        HashMap map;
        String str9;
        String str10;
        String str11;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        String str12 = null;
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
        if (bundle.containsKey("mobile_mode")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("mobile_mode"), String.class);
        } else {
            i += 128;
            str6 = null;
        }
        if (bundle.containsKey("description")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("description"), String.class);
        } else {
            i += 256;
            str7 = null;
        }
        if (bundle.containsKey("continue")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("continue"), String.class);
        } else {
            i += 512;
            str8 = null;
        }
        if (bundle.containsKey("footer")) {
            str12 = (String) RouteParser.INSTANCE.parse(bundle.get("footer"), String.class);
        } else {
            i += 1024;
        }
        if (bundle.containsKey("self_verify")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("self_verify"), Boolean.class);
            if (bool2 == null) {
                i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
        } else {
            i += SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            bool2 = null;
        }
        if (bundle.containsKey("auto_close_self_otp")) {
            bool3 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("auto_close_self_otp"), Boolean.class);
            if (bool3 == null) {
                i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            }
        } else {
            i += SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            bool3 = null;
        }
        if (bundle.containsKey("exp_map")) {
            map = (HashMap) RouteParser.INSTANCE.parse(bundle.get("exp_map"), HashMap.class);
        } else {
            i += 8192;
            map = null;
        }
        if (bundle.containsKey("customer_service_url")) {
            str9 = (String) RouteParser.INSTANCE.parse(bundle.get("customer_service_url"), String.class);
        } else {
            i += 16384;
            str9 = null;
        }
        if (bundle.containsKey("source_btm_token")) {
            str10 = (String) RouteParser.INSTANCE.parse(bundle.get("source_btm_token"), String.class);
        } else {
            i += 32768;
            str10 = null;
        }
        if (bundle.containsKey("cooling_off_notice")) {
            str11 = (String) RouteParser.INSTANCE.parse(bundle.get("cooling_off_notice"), String.class);
        } else {
            i += 65536;
            str11 = null;
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
        String str13 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        boolean z = false;
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
            str12 = "";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            z = zBooleanValue2;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            zBooleanValue3 = true;
        }
        if ((i & 8192) != 0) {
            map = new HashMap();
        }
        if ((i & 16384) != 0) {
            str9 = "";
        }
        if ((32768 & i) != 0) {
            str10 = "";
        }
        if ((i & 65536) == 0) {
            str13 = str11;
        }
        return new PhoneRouteArg(str, str2, zBooleanValue, arrayList, str3, str4, str5, str6, str7, str8, str12, z, zBooleanValue3, map, str9, str10, str13);
    }

    public PhoneRouteArg(String str, String str2) {
        this(str, str2, false, new ArrayList(), "", "", "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z) {
        this(str, str2, z, new ArrayList(), "", "", "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList) {
        this(str, str2, z, arrayList, "", "", "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3) {
        this(str, str2, z, arrayList, str3, "", "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4) {
        this(str, str2, z, arrayList, str3, str4, "", "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5) {
        this(str, str2, z, arrayList, str3, str4, str5, "", "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, "", "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, "", "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, "", false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, false, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, true, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, z3, new HashMap(), "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3, HashMap<String, String> map) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, z3, map, "", "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3, HashMap<String, String> map, String str10) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, z3, map, str10, "", "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3, HashMap<String, String> map, String str10, String str11) {
        this(str, str2, z, arrayList, str3, str4, str5, str6, str7, str8, str9, z2, z3, map, str10, str11, "");
    }

    public PhoneRouteArg(String str, String str2, boolean z, ArrayList<RegionMobileCodeItem> arrayList, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, boolean z3, HashMap<String, String> map, String str10, String str11, String str12) {
        this.scene = str;
        this.title = str2;
        this.noAnimation = z;
        this.regionCountryCode = arrayList;
        this.agreement = str3;
        this.previousPageId = str4;
        this.eventParam = str5;
        this.mode = str6;
        this.desc = str7;
        this.continueText = str8;
        this.footer = str9;
        this.selfVerify = z2;
        this.autoCloseSelfOtp = z3;
        this.experimentsMap = map;
        this.customerServiceUrl = str10;
        this.sourceBtmToken = str11;
        this.coolingOffNotice = str12;
    }
}
