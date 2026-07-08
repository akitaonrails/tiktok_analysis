package com.ss.android.ugc.aweme.kpro;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KproPopupSetting {

    @C09CT("background_image_url")
    public final String backGroundImageUrl;

    @C09CT("btn_label")
    public final String btn_label;

    @C09CT("complete_id")
    public final String complete_id;

    @C09CT("mask")
    public final String mask;

    @C09CT("primary_btn")
    public final KproPopupButtonSetting primaryBtn;

    @C09CT("rand_time")
    public final long rand_time;

    @C09CT("secondary_btn")
    public final KproPopupButtonSetting secondaryBtn;

    @C09CT("sub_title")
    public final String sub_title;

    @C09CT("time_range")
    public final KproPopupPeriod[] time_range;

    @C09CT("title")
    public final String title;

    @C09CT("title_image_url")
    public final String title_image_url;

    @C09CT("type")
    public final String type;

    @C09CT("url")
    public final String url;

    public KproPopupSetting(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, KproPopupPeriod[] kproPopupPeriodArr, KproPopupButtonSetting kproPopupButtonSetting, KproPopupButtonSetting kproPopupButtonSetting2) {
        this.type = str;
        this.backGroundImageUrl = str2;
        this.title_image_url = str3;
        this.title = str4;
        this.sub_title = str5;
        this.mask = str6;
        this.btn_label = str7;
        this.rand_time = j;
        this.complete_id = str8;
        this.url = str9;
        this.time_range = kproPopupPeriodArr;
        this.primaryBtn = kproPopupButtonSetting;
        this.secondaryBtn = kproPopupButtonSetting2;
    }
}
