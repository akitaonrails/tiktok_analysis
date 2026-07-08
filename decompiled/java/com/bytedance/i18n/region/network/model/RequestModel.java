package com.bytedance.i18n.region.network.model;

import X.C09CT;
import X.C818080W7i;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestModel {
    public static final C818080W7i LIZ = new Object() { // from class: X.0W7i
    };

    @C09CT("app_store_info")
    public final AppStoreInfo appStoreInfo;

    @C09CT("carrier_region")
    public final String carrierRegion;

    @C09CT("locale")
    public final String locale;

    @C09CT("location_sdk_client_config")
    public LocationSdkRequestModel locationSdkRequestModel;

    @C09CT("mcc_mnc")
    public final String mccMnc;

    @C09CT("network_sim_region")
    public final String networkSimRegion;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("sim_info")
    public final List<SimInfoModel> simInfo;

    @C09CT("system_language")
    public final String systemLanguage;

    @C09CT("system_region")
    public final String systemRegion;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("timezone")
    public final String timezone;

    @C09CT("timezone_type")
    public final Integer timezoneType;

    @C09CT("trigger_msg_id")
    public String triggerMsgId;

    @C09CT("vpn_proxy_info")
    public final VpnProxyInfo vpnProxyInfo;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (obj == null || !(obj instanceof RequestModel)) {
            return false;
        }
        RequestModel requestModel = (RequestModel) obj;
        if (!Intrinsics.LJFF(this.carrierRegion, requestModel.carrierRegion) || !Intrinsics.LJFF(this.systemLanguage, requestModel.systemLanguage) || !Intrinsics.LJFF(this.locale, requestModel.locale) || !Intrinsics.LJFF(this.mccMnc, requestModel.mccMnc) || !Intrinsics.LJFF(this.networkSimRegion, requestModel.networkSimRegion) || !Intrinsics.LJFF(this.systemRegion, requestModel.systemRegion) || !Intrinsics.LJFF(this.timezone, requestModel.timezone) || !Intrinsics.LJFF(this.timezoneType, requestModel.timezoneType)) {
            return false;
        }
        AppStoreInfo appStoreInfo = this.appStoreInfo;
        Boolean bool4 = null;
        if (appStoreInfo != null) {
            str = appStoreInfo.countryCode;
        } else {
            str = null;
        }
        AppStoreInfo appStoreInfo2 = requestModel.appStoreInfo;
        if (appStoreInfo2 != null) {
            str2 = appStoreInfo2.countryCode;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        VpnProxyInfo vpnProxyInfo = this.vpnProxyInfo;
        if (vpnProxyInfo != null) {
            bool = vpnProxyInfo.isVpn;
        } else {
            bool = null;
        }
        VpnProxyInfo vpnProxyInfo2 = requestModel.vpnProxyInfo;
        if (vpnProxyInfo2 != null) {
            bool2 = vpnProxyInfo2.isVpn;
        } else {
            bool2 = null;
        }
        if (!Intrinsics.LJFF(bool, bool2)) {
            return false;
        }
        VpnProxyInfo vpnProxyInfo3 = this.vpnProxyInfo;
        if (vpnProxyInfo3 != null) {
            bool3 = vpnProxyInfo3.isProxy;
        } else {
            bool3 = null;
        }
        VpnProxyInfo vpnProxyInfo4 = requestModel.vpnProxyInfo;
        if (vpnProxyInfo4 != null) {
            bool4 = vpnProxyInfo4.isProxy;
        }
        if (!Intrinsics.LJFF(bool3, bool4) || !Intrinsics.LJFF(this.simInfo, requestModel.simInfo)) {
            return false;
        }
        return true;
    }

    public RequestModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, AppStoreInfo appStoreInfo, VpnProxyInfo vpnProxyInfo, int i, String str8, long j, LocationSdkRequestModel locationSdkRequestModel, List<SimInfoModel> list) {
        this.carrierRegion = str;
        this.systemLanguage = str2;
        this.locale = str3;
        this.mccMnc = str4;
        this.networkSimRegion = str5;
        this.systemRegion = str6;
        this.timezone = str7;
        this.timezoneType = num;
        this.appStoreInfo = appStoreInfo;
        this.vpnProxyInfo = vpnProxyInfo;
        this.scene = i;
        this.triggerMsgId = str8;
        this.timestamp = j;
        this.locationSdkRequestModel = locationSdkRequestModel;
        this.simInfo = list;
    }
}
