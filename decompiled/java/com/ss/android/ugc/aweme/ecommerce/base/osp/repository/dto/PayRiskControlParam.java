package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRiskControlParam implements Serializable {
    public static final int $stable = 8;

    @C09CT("browser_accept_header")
    public final String browserAcceptHeader;

    @C09CT("browser_color_depth")
    public final String browserColorDepth;

    @C09CT("browser_ip")
    public final String browserIP;

    @C09CT("browser_java_enabled")
    public final Boolean browserJavaEnabled;

    @C09CT("browser_javascript_enabled")
    public final Boolean browserJavascriptEnabled;

    @C09CT("browser_language")
    public final String browserLanguage;

    @C09CT("browser_name")
    public final String browserName;

    @C09CT("browser_online")
    public final String browserOnline;

    @C09CT("browser_platform")
    public final String browserPlatform;

    @C09CT("browser_screen_height")
    public final String browserScreenHeight;

    @C09CT("browser_screen_width")
    public final String browserScreenWidth;

    @C09CT("browser_tz")
    public final String browserTimezone;

    @C09CT("browser_version")
    public final String browserVersion;

    @C09CT("captcha_check_result")
    public final String captchaCheckResult;

    @C09CT("card_number_paste")
    public final String cardNumberPaste;

    @C09CT("check_sign_res")
    public final String checkSignRes;

    @C09CT("cookie_enabled")
    public final String cookieEnabled;

    @C09CT("custom_check_sign")
    public final String customCheckSign;

    @C09CT("device_fp_id")
    public final String deviceFpId;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("fp")
    public final String fp;

    @C09CT("gp_device_fp_id")
    public final String gpDeviceFpId;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("pm_device_data")
    public final String pmDeviceData;

    @C09CT("referer")
    public final String referer;

    @C09CT("screen_height")
    public final String screenHeight;

    @C09CT("screen_width")
    public final String screenWidth;

    @C09CT("target")
    public final String target;

    @C09CT("terminal_country")
    public final String terminalCountry;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("voice_id")
    public final String voiceId;

    public PayRiskControlParam() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        return "PayRiskControlParam(videoId=" + this.videoId + ", voiceId=" + this.voiceId + ", browserLanguage=" + this.browserLanguage + ", browserName=" + this.browserName + ", browserOnline=" + this.browserOnline + ", browserPlatform=" + this.browserPlatform + ", browserVersion=" + this.browserVersion + ", captchaCheckResult=" + this.captchaCheckResult + ", checkSignRes=" + this.checkSignRes + ", cookieEnabled=" + this.cookieEnabled + ", customCheckSign=" + this.customCheckSign + ", deviceFpId=" + this.deviceFpId + ", gpDeviceFpId=" + this.gpDeviceFpId + ", fp=" + this.fp + ", groupId=" + this.groupId + ", referer=" + this.referer + ", screenHeight=" + this.screenHeight + ", screenWidth=" + this.screenWidth + ", target=" + this.target + ", terminalCountry=" + this.terminalCountry + ", cardNumberPaste=" + this.cardNumberPaste + ", pmDeviceData=" + this.pmDeviceData + ", browserJavaEnabled=" + this.browserJavaEnabled + ", browserAcceptHeader=" + this.browserAcceptHeader + ", browserColorDepth=" + this.browserColorDepth + ", browserScreenHeight=" + this.browserScreenHeight + ", browserScreenWidth=" + this.browserScreenWidth + ", browserTimezone=" + this.browserTimezone + ", browserIP=" + this.browserIP + ", browserJavascriptEnabled=" + this.browserJavascriptEnabled + ", extra=" + this.extra + ')';
    }

    public PayRiskControlParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Boolean bool, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool2, Map<String, String> map) {
        this.videoId = str;
        this.voiceId = str2;
        this.browserLanguage = str3;
        this.browserName = str4;
        this.browserOnline = str5;
        this.browserPlatform = str6;
        this.browserVersion = str7;
        this.captchaCheckResult = str8;
        this.checkSignRes = str9;
        this.cookieEnabled = str10;
        this.customCheckSign = str11;
        this.deviceFpId = str12;
        this.gpDeviceFpId = str13;
        this.fp = str14;
        this.groupId = str15;
        this.referer = str16;
        this.screenHeight = str17;
        this.screenWidth = str18;
        this.target = str19;
        this.terminalCountry = str20;
        this.cardNumberPaste = str21;
        this.pmDeviceData = str22;
        this.browserJavaEnabled = bool;
        this.browserAcceptHeader = str23;
        this.browserColorDepth = str24;
        this.browserScreenHeight = str25;
        this.browserScreenWidth = str26;
        this.browserTimezone = str27;
        this.browserIP = str28;
        this.browserJavascriptEnabled = bool2;
        this.extra = map;
    }
}
