package com.bytedance.pipo.verify.base.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyDetail {

    @C09CT("ab_test_info")
    public final Map<String, String> abTestInfo;

    @C09CT("bio_fallback_title")
    public final String bioFallbackTitle;

    @C09CT("biometry_data_tag")
    public final String biometricDataTag;

    @C09CT("biz_line")
    public final String bizLine;

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("button")
    public final String button;

    @C09CT("cert_type")
    public final String certType;

    @C09CT("challenge")
    public final String challenge;

    @C09CT("code_type")
    public final String codeType;

    @C09CT("pub_key")
    public final String commonPublicKey;

    @C09CT("content")
    public final String content;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("experiment_group")
    public final String experimentGroup;

    @C09CT("failed_times")
    public final Integer failedTimes;

    @C09CT("footer")
    public final String footer;

    @C09CT("forget_pin_toast")
    public final String forgetPinToastTxt;

    @C09CT("fp_session_id")
    public final String fpSessionId;

    @C09CT("fp_token")
    public final String fpToken;

    @C09CT("guide_content")
    public final OCRVerifyGuideContent guideContent;

    @C09CT("icon_url")
    public final IconUrl iconUrl;

    @C09CT("idc")
    public final String idc;

    @C09CT("input_format")
    public String inputFormat;

    @C09CT("is_temp")
    public final Boolean isTemp;

    @C09CT("last_failed_time")
    public final String lastFailedTime;

    @C09CT("left_triable_times")
    public final Integer leftTriableTimes;

    @C09CT("merchant_id")
    public String merchantId;

    @C09CT("merchant_user_id")
    public String merchantUserId;

    @C09CT("mobile")
    public final String mobile;

    @C09CT("payment_method")
    public final String paymentMethod;

    @C09CT("pin_host")
    public final String pinHost;

    @C09CT("pin_pub_key")
    public final String pinPubKey;

    @C09CT("pin_status")
    public final String pinStatus;

    @C09CT("pipo_product_cat")
    public final String pipoProductCat;

    @C09CT("placeholder")
    public String placeholder;

    @C09CT("bio_pub_key")
    public final String publicKey;

    @C09CT("regex_check")
    public final List<RegexCheck> regexCheck;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("schema_list")
    public SchemaComposer schemaList;

    @C09CT("textfield_content")
    public final String textFieldContent;

    @C09CT("textfield_title")
    public final String textFieldTitle;

    @C09CT("title")
    public final String title;

    @C09CT("unfrozen_time")
    public final String unfrozenTime;

    @C09CT("verify_center_host")
    public final String verifyCenterHost;

    @C09CT("verify_code_type")
    public final String verifyCodeType;

    @C09CT("verify_method")
    public final String verifyMethod;

    @C09CT("verify_type")
    public final String verifyType;

    @C09CT("wallet_user_id_string")
    public final String walletUserId;

    public VerifyDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, IconUrl iconUrl, String str16, String str17, String str18, String str19, String str20, String str21, Integer num, Integer num2, String str22, String str23, String str24, Boolean bool, String str25, List<RegexCheck> list, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, SchemaComposer schemaComposer, String str36, String str37, OCRVerifyGuideContent oCRVerifyGuideContent, Map<String, String> map, String str38, String str39) {
        this.fpToken = str;
        this.pinHost = str2;
        this.scene = str3;
        this.verifyCenterHost = str4;
        this.verifyType = str5;
        this.bizType = str6;
        this.pipoProductCat = str7;
        this.title = str8;
        this.content = str9;
        this.merchantId = str10;
        this.merchantUserId = str11;
        this.verifyMethod = str12;
        this.bizLine = str13;
        this.inputFormat = str14;
        this.placeholder = str15;
        this.iconUrl = iconUrl;
        this.experimentGroup = str16;
        this.mobile = str17;
        this.codeType = str18;
        this.verifyCodeType = str19;
        this.button = str20;
        this.footer = str21;
        this.failedTimes = num;
        this.leftTriableTimes = num2;
        this.pinStatus = str22;
        this.lastFailedTime = str23;
        this.unfrozenTime = str24;
        this.isTemp = bool;
        this.forgetPinToastTxt = str25;
        this.regexCheck = list;
        this.certType = str26;
        this.textFieldTitle = str27;
        this.textFieldContent = str28;
        this.walletUserId = str29;
        this.bioFallbackTitle = str30;
        this.challenge = str31;
        this.biometricDataTag = str32;
        this.publicKey = str33;
        this.commonPublicKey = str34;
        this.idc = str35;
        this.schemaList = schemaComposer;
        this.paymentMethod = str36;
        this.enterFrom = str37;
        this.guideContent = oCRVerifyGuideContent;
        this.abTestInfo = map;
        this.fpSessionId = str38;
        this.pinPubKey = str39;
    }
}
