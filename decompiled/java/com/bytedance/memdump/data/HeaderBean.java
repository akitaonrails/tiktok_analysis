package com.bytedance.memdump.data;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public class HeaderBean {

    @C09CT("aid")
    public String aid;

    @C09CT("app_version")
    public String appVersion;

    @C09CT("channel")
    public String channel;

    @C09CT("config_time")
    public String configTime;

    @C09CT("current_update_version_code")
    public String currentUpdateVersionCode;

    @C09CT("device_brand")
    public String deviceBrand;

    @C09CT("device_id")
    public String deviceID;

    @C09CT("device_manufacturer")
    public String deviceManufacturer;

    @C09CT("device_model")
    public String deviceModel;

    @C09CT("device_platform")
    public String devicePlatform;

    @C09CT("filters")
    public Filters filters;

    @C09CT("os")
    public String os;

    @C09CT("os_api")
    public String osApi;

    @C09CT("os_version")
    public String osVersion;

    @C09CT("process_name")
    public String processName;

    @C09CT("region")
    public String region;

    @C09CT("release_build")
    public String releaseBuild;

    @C09CT("sid")
    public String sid;

    @C09CT("update_version_code")
    public String updateVersionCode;

    @C09CT("version_code")
    public String versionCode;

    @C09CT("version_name")
    public String versionName;

    public static class Filters {

        @C09CT("exception_type")
        public String exception_type;
    }

    public HeaderBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Filters filters) {
        this.aid = str;
        this.channel = str2;
        this.deviceID = str3;
        this.appVersion = str4;
        this.updateVersionCode = str5;
        this.currentUpdateVersionCode = str6;
        this.osVersion = str7;
        this.osApi = str8;
        this.deviceModel = str9;
        this.deviceBrand = str10;
        this.deviceManufacturer = str11;
        this.processName = str12;
        this.versionName = str13;
        this.versionCode = str14;
        this.region = str15;
        this.os = str16;
        this.devicePlatform = str17;
        this.sid = str18;
        this.configTime = str19;
        this.releaseBuild = str20;
        this.filters = filters;
    }
}
