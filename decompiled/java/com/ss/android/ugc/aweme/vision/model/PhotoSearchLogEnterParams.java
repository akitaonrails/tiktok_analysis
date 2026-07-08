package com.ss.android.ugc.aweme.vision.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchLogEnterParams implements Serializable {
    public String enterFromSecond;
    public Map<String, String> middlePageBannerParams;
    public String middlePageId;
    public String orderSubmitType;
    public String photoSearchModule;
    public String photoSearchTypeDetail;
    public String preClickId;
    public String searchEntrance;
    public String searchEntranceSecond;
    public String searchType;
    public String sourcePageName;
    public String sourcePreviousPage;
    public String templateId;

    public PhotoSearchLogEnterParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PhotoSearchLogEnterParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, String str10, String str11, String str12) {
        return new PhotoSearchLogEnterParams(str, str2, str3, str4, str5, str6, str7, str8, str9, map, str10, str11, str12);
    }

    public final void setEnterFromSecond(String str) {
        this.enterFromSecond = str;
    }

    public final void setMiddlePageBannerParams(Map<String, String> map) {
        this.middlePageBannerParams = map;
    }

    public final void setMiddlePageId(String str) {
        this.middlePageId = str;
    }

    public final void setOrderSubmitType(String str) {
        this.orderSubmitType = str;
    }

    public final void setPhotoSearchModule(String str) {
        this.photoSearchModule = str;
    }

    public final void setPhotoSearchTypeDetail(String str) {
        this.photoSearchTypeDetail = str;
    }

    public final void setPreClickId(String str) {
        this.preClickId = str;
    }

    public final void setSearchEntrance(String str) {
        this.searchEntrance = str;
    }

    public final void setSearchEntranceSecond(String str) {
        this.searchEntranceSecond = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }

    public final void setSourcePageName(String str) {
        this.sourcePageName = str;
    }

    public final void setSourcePreviousPage(String str) {
        this.sourcePreviousPage = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public PhotoSearchLogEnterParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, String str10, String str11, String str12) {
        this.searchEntrance = str;
        this.sourcePageName = str2;
        this.searchType = str3;
        this.photoSearchTypeDetail = str4;
        this.enterFromSecond = str5;
        this.searchEntranceSecond = str6;
        this.photoSearchModule = str7;
        this.sourcePreviousPage = str8;
        this.middlePageId = str9;
        this.middlePageBannerParams = map;
        this.templateId = str10;
        this.orderSubmitType = str11;
        this.preClickId = str12;
    }
}
