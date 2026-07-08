package com.ss.android.ugc.aweme.vision.model;

import X.C09JS;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.search.EComModelSearchDependencyService;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class PhotoSearchEnterParams implements Serializable {
    public PhotoSearchBusinessEnterParams businessParams;
    public String ecPageFeatureParams;
    public HashMap<String, Object> ecSearchCommonParams;
    public HashMap<String, Object> extraLogParams;
    public String imageKey;
    public PhotoSearchLogEnterParams logParams;
    public PhotoSearchPdpEnterParams pdpParams;
    public HashMap<String, Object> photoSearchExtra;
    public HashMap<String, Object> productInfo;
    public final String screenshotImageKey;
    public PhotoSearchToolsEnterParams toolsParams;

    public PhotoSearchEnterParams() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final PhotoSearchEnterParams copy(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, PhotoSearchLogEnterParams photoSearchLogEnterParams, PhotoSearchToolsEnterParams photoSearchToolsEnterParams, PhotoSearchPdpEnterParams photoSearchPdpEnterParams, HashMap<String, Object> map, HashMap<String, Object> map2, HashMap<String, Object> map3, HashMap<String, Object> map4, String str) {
        return new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, photoSearchPdpEnterParams, map, map2, map3, map4, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchEnterParams)) {
            return false;
        }
        PhotoSearchEnterParams photoSearchEnterParams = (PhotoSearchEnterParams) obj;
        return Intrinsics.LJFF(this.businessParams, photoSearchEnterParams.businessParams) && Intrinsics.LJFF(this.logParams, photoSearchEnterParams.logParams) && Intrinsics.LJFF(this.toolsParams, photoSearchEnterParams.toolsParams) && Intrinsics.LJFF(this.pdpParams, photoSearchEnterParams.pdpParams) && Intrinsics.LJFF(this.photoSearchExtra, photoSearchEnterParams.photoSearchExtra) && Intrinsics.LJFF(this.productInfo, photoSearchEnterParams.productInfo) && Intrinsics.LJFF(this.extraLogParams, photoSearchEnterParams.extraLogParams) && Intrinsics.LJFF(this.ecSearchCommonParams, photoSearchEnterParams.ecSearchCommonParams) && Intrinsics.LJFF(this.ecPageFeatureParams, photoSearchEnterParams.ecPageFeatureParams);
    }

    public final PhotoSearchEnterParams copy() {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = this.businessParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParamsCopy = photoSearchBusinessEnterParams != null ? photoSearchBusinessEnterParams.copy(photoSearchBusinessEnterParams.enterFrom, photoSearchBusinessEnterParams.enterMethod, photoSearchBusinessEnterParams.trafficSourceList, photoSearchBusinessEnterParams.groupId, photoSearchBusinessEnterParams.fromMiddleBackFromResult, photoSearchBusinessEnterParams.isFromVideo, photoSearchBusinessEnterParams.isFromComment, photoSearchBusinessEnterParams.lastFromGroupId, photoSearchBusinessEnterParams.attachProducts, photoSearchBusinessEnterParams.photoSearchPreviousPage, photoSearchBusinessEnterParams.photoSearchPreviousSearchType, photoSearchBusinessEnterParams.originIsMallTab, photoSearchBusinessEnterParams.latestSearchId, photoSearchBusinessEnterParams.searchContext, photoSearchBusinessEnterParams.personalContextInfo, photoSearchBusinessEnterParams.searchChannel, photoSearchBusinessEnterParams.isFilterSearch, photoSearchBusinessEnterParams.sortType, photoSearchBusinessEnterParams.filterBy, photoSearchBusinessEnterParams.rootEnterFromType, photoSearchBusinessEnterParams.recallShield, photoSearchBusinessEnterParams.previousPage, photoSearchBusinessEnterParams.source, photoSearchBusinessEnterParams.initialHeightScale, photoSearchBusinessEnterParams.sourceBtmToken, photoSearchBusinessEnterParams.enterProductId, photoSearchBusinessEnterParams.tosImageUrl, photoSearchBusinessEnterParams.searchSessionId) : null;
        PhotoSearchLogEnterParams photoSearchLogEnterParams = this.logParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParamsCopy = photoSearchLogEnterParams != null ? photoSearchLogEnterParams.copy(photoSearchLogEnterParams.searchEntrance, photoSearchLogEnterParams.sourcePageName, photoSearchLogEnterParams.searchType, photoSearchLogEnterParams.photoSearchTypeDetail, photoSearchLogEnterParams.enterFromSecond, photoSearchLogEnterParams.searchEntranceSecond, photoSearchLogEnterParams.photoSearchModule, photoSearchLogEnterParams.sourcePreviousPage, photoSearchLogEnterParams.middlePageId, photoSearchLogEnterParams.middlePageBannerParams, photoSearchLogEnterParams.templateId, photoSearchLogEnterParams.orderSubmitType, photoSearchLogEnterParams.preClickId) : null;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = this.toolsParams;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParamsCopy = photoSearchToolsEnterParams != null ? photoSearchToolsEnterParams.copy(photoSearchToolsEnterParams.localFilePath, photoSearchToolsEnterParams.searchTime, photoSearchToolsEnterParams.searchSource, photoSearchToolsEnterParams.useBitmap, photoSearchToolsEnterParams.lowImageUrl, photoSearchToolsEnterParams.hasScreenShot, photoSearchToolsEnterParams.fypProductImages) : null;
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = this.pdpParams;
        PhotoSearchPdpEnterParams photoSearchPdpEnterParamsCopy = photoSearchPdpEnterParams != null ? photoSearchPdpEnterParams.copy(photoSearchPdpEnterParams.searchEntrance, photoSearchPdpEnterParams.pageName, photoSearchPdpEnterParams.rawPhotoSource, photoSearchPdpEnterParams.enterProductId, photoSearchPdpEnterParams.trackId, photoSearchPdpEnterParams.screenHeight, photoSearchPdpEnterParams.previousPage) : null;
        HashMap<String, Object> map = this.photoSearchExtra;
        HashMap map2 = map != null ? new HashMap(map) : null;
        HashMap<String, Object> map3 = this.productInfo;
        HashMap map4 = map3 != null ? new HashMap(map3) : null;
        HashMap<String, Object> map5 = this.extraLogParams;
        HashMap map6 = map5 != null ? new HashMap(map5) : null;
        HashMap<String, Object> map7 = this.ecSearchCommonParams;
        return new PhotoSearchEnterParams(photoSearchBusinessEnterParamsCopy, photoSearchLogEnterParamsCopy, photoSearchToolsEnterParamsCopy, photoSearchPdpEnterParamsCopy, map2, map4, map6, map7 != null ? new HashMap(map7) : null, this.ecPageFeatureParams);
    }

    public final Uri getLocalPathUri() {
        String str;
        C09JS c09js = C09JS.LIZ;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = this.toolsParams;
        if (photoSearchToolsEnterParams == null || (str = photoSearchToolsEnterParams.localFilePath) == null) {
            str = "";
        }
        c09js.getClass();
        return UriProtector.parse(C09JS.LIZ(str));
    }

    public final void setBusinessParams(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams) {
        this.businessParams = photoSearchBusinessEnterParams;
    }

    public final void setEcPageFeatureParams(String str) {
        this.ecPageFeatureParams = str;
    }

    public final void setEcSearchCommonParams(HashMap<String, Object> map) {
        this.ecSearchCommonParams = map;
    }

    public final void setExtraLogParams(HashMap<String, Object> map) {
        this.extraLogParams = map;
    }

    public final void setImageKey(String str) {
        this.imageKey = str;
    }

    public final void setLogParams(PhotoSearchLogEnterParams photoSearchLogEnterParams) {
        this.logParams = photoSearchLogEnterParams;
    }

    public final void setPdpParams(PhotoSearchPdpEnterParams photoSearchPdpEnterParams) {
        this.pdpParams = photoSearchPdpEnterParams;
    }

    public final void setPhotoSearchExtra(HashMap<String, Object> map) {
        this.photoSearchExtra = map;
    }

    public final void setProductInfo(HashMap<String, Object> map) {
        this.productInfo = map;
    }

    public final void setToolsParams(PhotoSearchToolsEnterParams photoSearchToolsEnterParams) {
        this.toolsParams = photoSearchToolsEnterParams;
    }

    public PhotoSearchEnterParams(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, PhotoSearchLogEnterParams photoSearchLogEnterParams, PhotoSearchToolsEnterParams photoSearchToolsEnterParams, PhotoSearchPdpEnterParams photoSearchPdpEnterParams, HashMap<String, Object> map, HashMap<String, Object> map2, HashMap<String, Object> map3, HashMap<String, Object> map4, String str) {
        this.businessParams = photoSearchBusinessEnterParams;
        this.logParams = photoSearchLogEnterParams;
        this.toolsParams = photoSearchToolsEnterParams;
        this.pdpParams = photoSearchPdpEnterParams;
        this.photoSearchExtra = map;
        this.productInfo = map2;
        this.extraLogParams = map3;
        this.ecSearchCommonParams = map4;
        this.ecPageFeatureParams = str;
        String str2 = (String) EComModelSearchDependencyService.LJ().LIZ(new AwS554S0100000_10(this, 903), AFwS196S0000000_10.get$arr$(355));
        this.imageKey = str2 == null ? String.valueOf(System.currentTimeMillis()) : str2;
        this.screenshotImageKey = "screenshot_find_similar_with_click";
    }
}
