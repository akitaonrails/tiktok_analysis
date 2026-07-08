package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C09CT;
import X.C1100240ejm;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class IncentiveBannerInfo implements Serializable {
    public static final C1100240ejm Companion = new Object() { // from class: X.0ejm
    };

    @C09CT("banner_page")
    public final int bannerPage;

    @C09CT("search_complete_img_url")
    public final String completeImgUrl;

    @C09CT("img_url")
    public final String imgUrl;

    @C09CT("no_agree_text")
    public final String noAgreeText;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("task_finished_all_icon_text")
    public final String taskFinishedAllIconText;

    @C09CT("task_finished_icon_text")
    public final String taskFinishedIconText;

    @C09CT("task_finished_one_day_away_icon_text")
    public final String taskFinishedOneDayAwayIconText;

    @C09CT("task_finished_text")
    public final String taskFinishedText;

    @C09CT("task_in_process_icon_text")
    public final String taskInProcessIconText;

    @C09CT("task_in_process_text")
    public final String taskInProcessText;

    @C09CT("task_no_agree_icon_under_text")
    public final String taskNoAgreeIconUnderText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveBannerInfo)) {
            return false;
        }
        IncentiveBannerInfo incentiveBannerInfo = (IncentiveBannerInfo) obj;
        return this.bannerPage == incentiveBannerInfo.bannerPage && Intrinsics.LJFF(this.imgUrl, incentiveBannerInfo.imgUrl) && Intrinsics.LJFF(this.schemaUrl, incentiveBannerInfo.schemaUrl) && Intrinsics.LJFF(this.taskInProcessText, incentiveBannerInfo.taskInProcessText) && Intrinsics.LJFF(this.taskFinishedText, incentiveBannerInfo.taskFinishedText) && Intrinsics.LJFF(this.noAgreeText, incentiveBannerInfo.noAgreeText) && Intrinsics.LJFF(this.taskNoAgreeIconUnderText, incentiveBannerInfo.taskNoAgreeIconUnderText) && Intrinsics.LJFF(this.completeImgUrl, incentiveBannerInfo.completeImgUrl) && Intrinsics.LJFF(this.taskInProcessIconText, incentiveBannerInfo.taskInProcessIconText) && Intrinsics.LJFF(this.taskFinishedIconText, incentiveBannerInfo.taskFinishedIconText) && Intrinsics.LJFF(this.taskFinishedAllIconText, incentiveBannerInfo.taskFinishedAllIconText) && Intrinsics.LJFF(this.taskFinishedOneDayAwayIconText, incentiveBannerInfo.taskFinishedOneDayAwayIconText);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.bannerPage * 31) + this.imgUrl.hashCode()) * 31) + this.schemaUrl.hashCode()) * 31) + this.taskInProcessText.hashCode()) * 31) + this.taskFinishedText.hashCode()) * 31) + this.noAgreeText.hashCode()) * 31) + this.taskNoAgreeIconUnderText.hashCode()) * 31) + this.completeImgUrl.hashCode()) * 31) + this.taskInProcessIconText.hashCode()) * 31) + this.taskFinishedIconText.hashCode()) * 31) + this.taskFinishedAllIconText.hashCode()) * 31) + this.taskFinishedOneDayAwayIconText.hashCode();
    }

    public String toString() {
        return "IncentiveBannerInfo(bannerPage=" + this.bannerPage + ", imgUrl=" + this.imgUrl + ", schemaUrl=" + this.schemaUrl + ", taskInProcessText=" + this.taskInProcessText + ", taskFinishedText=" + this.taskFinishedText + ", noAgreeText=" + this.noAgreeText + ", taskNoAgreeIconUnderText=" + this.taskNoAgreeIconUnderText + ", completeImgUrl=" + this.completeImgUrl + ", taskInProcessIconText=" + this.taskInProcessIconText + ", taskFinishedIconText=" + this.taskFinishedIconText + ", taskFinishedAllIconText=" + this.taskFinishedAllIconText + ", taskFinishedOneDayAwayIconText=" + this.taskFinishedOneDayAwayIconText + ')';
    }

    public IncentiveBannerInfo() {
        this(0, "", "", "", "", "", "", "", "", "", "", "");
    }

    public IncentiveBannerInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.bannerPage = i;
        this.imgUrl = str;
        this.schemaUrl = str2;
        this.taskInProcessText = str3;
        this.taskFinishedText = str4;
        this.noAgreeText = str5;
        this.taskNoAgreeIconUnderText = str6;
        this.completeImgUrl = str7;
        this.taskInProcessIconText = str8;
        this.taskFinishedIconText = str9;
        this.taskFinishedAllIconText = str10;
        this.taskFinishedOneDayAwayIconText = str11;
    }
}
