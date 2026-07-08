package com.ss.android.ugc.aweme.vision.model;

import X.C01GW;
import X.C0QXR;
import X.C452501pT;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchBusinessEnterParams implements Serializable {
    public String attachProducts;
    public final C01GW ecSearchSessionId$delegate;
    public final C01GW endToEndSessionId$delegate;
    public String enterFrom;
    public String enterMethod;
    public String enterProductId;
    public Integer filterBy;
    public String fromMiddleBackFromResult;
    public String groupId;
    public Float initialHeightScale;
    public Integer isFilterSearch;
    public String isFromComment;
    public Integer isFromVideo;
    public String lastFromGroupId;
    public String latestSearchId;
    public String originIsMallTab;
    public String personalContextInfo;
    public String photoSearchPreviousPage;
    public String photoSearchPreviousSearchType;
    public String previousPage;
    public Integer recallShield;
    public int rootEnterFromType;
    public String searchChannel;
    public String searchContext;
    public final String searchSessionId;
    public Integer sortType;
    public String source;
    public String sourceBtmToken;
    public final String tosImageUrl;
    public String trafficSourceList;

    public PhotoSearchBusinessEnterParams() {
        this(null, null, null, null, "", 0, "", "", "", null, null, null, "", "", "", null, null, null, null, C0QXR.MALL.getValue(), null, null, null, null, null, null, null, String.valueOf(System.currentTimeMillis()));
    }

    public final PhotoSearchBusinessEnterParams copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num2, Integer num3, Integer num4, int i, Integer num5, String str16, String str17, Float f, String str18, String str19, String str20, String str21) {
        return new PhotoSearchBusinessEnterParams(str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num2, num3, num4, i, num5, str16, str17, f, str18, str19, str20, str21);
    }

    public final String getEcSearchSessionId() {
        return (String) this.ecSearchSessionId$delegate.getValue();
    }

    public final Long getEndToEndSessionId() {
        return (Long) this.endToEndSessionId$delegate.getValue();
    }

    public final Integer isFilterSearch() {
        return this.isFilterSearch;
    }

    public final String isFromComment() {
        return this.isFromComment;
    }

    public final Integer isFromVideo() {
        return this.isFromVideo;
    }

    public final void setAttachProducts(String str) {
        this.attachProducts = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterProductId(String str) {
        this.enterProductId = str;
    }

    public final void setFilterBy(Integer num) {
        this.filterBy = num;
    }

    public final void setFilterSearch(Integer num) {
        this.isFilterSearch = num;
    }

    public final void setFromComment(String str) {
        this.isFromComment = str;
    }

    public final void setFromMiddleBackFromResult(String str) {
        this.fromMiddleBackFromResult = str;
    }

    public final void setFromVideo(Integer num) {
        this.isFromVideo = num;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setInitialHeightScale(Float f) {
        this.initialHeightScale = f;
    }

    public final void setLastFromGroupId(String str) {
        this.lastFromGroupId = str;
    }

    public final void setLatestSearchId(String str) {
        this.latestSearchId = str;
    }

    public final void setOriginIsMallTab(String str) {
        this.originIsMallTab = str;
    }

    public final void setPersonalContextInfo(String str) {
        this.personalContextInfo = str;
    }

    public final void setPhotoSearchPreviousPage(String str) {
        this.photoSearchPreviousPage = str;
    }

    public final void setPhotoSearchPreviousSearchType(String str) {
        this.photoSearchPreviousSearchType = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setRecallShield(Integer num) {
        this.recallShield = num;
    }

    public final void setRootEnterFromType(int i) {
        this.rootEnterFromType = i;
    }

    public final void setSearchChannel(String str) {
        this.searchChannel = str;
    }

    public final void setSearchContext(String str) {
        this.searchContext = str;
    }

    public final void setSortType(Integer num) {
        this.sortType = num;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setSourceBtmToken(String str) {
        this.sourceBtmToken = str;
    }

    public final void setTrafficSourceList(String str) {
        this.trafficSourceList = str;
    }

    public PhotoSearchBusinessEnterParams(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num2, Integer num3, Integer num4, int i, Integer num5, String str16, String str17, Float f, String str18, String str19, String str20, String str21) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.trafficSourceList = str3;
        this.groupId = str4;
        this.fromMiddleBackFromResult = str5;
        this.isFromVideo = num;
        this.isFromComment = str6;
        this.lastFromGroupId = str7;
        this.attachProducts = str8;
        this.photoSearchPreviousPage = str9;
        this.photoSearchPreviousSearchType = str10;
        this.originIsMallTab = str11;
        this.latestSearchId = str12;
        this.searchContext = str13;
        this.personalContextInfo = str14;
        this.searchChannel = str15;
        this.isFilterSearch = num2;
        this.sortType = num3;
        this.filterBy = num4;
        this.rootEnterFromType = i;
        this.recallShield = num5;
        this.previousPage = str16;
        this.source = str17;
        this.initialHeightScale = f;
        this.sourceBtmToken = str18;
        this.enterProductId = str19;
        this.tosImageUrl = str20;
        this.searchSessionId = str21;
        this.ecSearchSessionId$delegate = C452501pT.LIZIZ(new AwS554S0100000_10(this, 902));
        this.endToEndSessionId$delegate = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(354));
    }
}
