package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class StepAttr implements Serializable {

    @C09CT("agreement")
    public final String agreement;

    @C09CT("bold_tux_color")
    public final String boldTuxColor;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("cooling_off_notice")
    public final String coolingOffNotice;

    @C09CT("enable_btn")
    public final String enableBtn;

    @C09CT("exit_image_dark_url")
    public final String exitImageDarkUrl;

    @C09CT("exit_image_url")
    public final String exitImageUrl;

    @C09CT("finish_page_image_dark_url")
    public final String finishPageImageDarkUrl;

    @C09CT("finish_page_image_url")
    public final String finishPageImageUrl;

    @C09CT("hit_marketing")
    public final String hitMarketing;

    @C09CT("illustration_url_dark")
    public final String imageDark;

    @C09CT("illustration_url_light")
    public final String imageLight;

    @C09CT("instruction")
    public final String instruction;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("max_fail_skip_times")
    public final String maxFailSkipTimes;

    @C09CT("async_open_account")
    public final String needAsyncQueryResult;

    @C09CT("need_get_user_placement")
    public final String needGetUserPlacement;

    @C09CT("pipo_information_collection_success_toast")
    public final String pipoInformationCollectionSuccessToast;

    @C09CT("show_close")
    public final String showClose;

    @C09CT(alternate = {"skip_button"}, value = "skip_btn")
    public final String skipBtn;

    @C09CT("title")
    public final String title;

    public StepAttr() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public StepAttr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        this.needAsyncQueryResult = str;
        this.boldTuxColor = str2;
        this.hitMarketing = str3;
        this.finishPageImageUrl = str4;
        this.finishPageImageDarkUrl = str5;
        this.exitImageUrl = str6;
        this.exitImageDarkUrl = str7;
        this.needGetUserPlacement = str8;
        this.coolingOffNotice = str9;
        this.jumpSchema = str10;
        this.showClose = str11;
        this.title = str12;
        this.instruction = str13;
        this.enableBtn = str14;
        this.skipBtn = str15;
        this.agreement = str16;
        this.imageLight = str17;
        this.imageDark = str18;
        this.pipoInformationCollectionSuccessToast = str19;
        this.collectInfo = str20;
        this.maxFailSkipTimes = str21;
    }
}
