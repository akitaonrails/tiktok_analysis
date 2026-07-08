package com.ss.android.ugc.effectmanager.effect.model;

import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public final class MixedAssetsRequestBodyInfo {
    public final String accountType;
    public final String allMediaInfo;
    public final Boolean allowPugc;
    public final String contentSource;
    public final String contentType;
    public final String creationId;
    public final String defaultCategoryKey;
    public final Integer effectiveConnectionType;
    public final Boolean enablePreloading;
    public final String entrancePage;
    public final String extra;
    public final List<Integer> filterAssetTypeList;
    public final List<FromAssetInfo> fromAssetList;
    public final String lokiVersion;
    public final List<Integer> mediaCount;
    public final Boolean needRecommend;
    public final Boolean newPath;
    public final String panelKey;
    public final Boolean preCompute;
    public final Function0<Object> recConfig;
    public final String recFeedFeatures;
    public final String recommendKey;
    public final String recommendReqId;
    public final String reuseMusicId;
    public final String scene;
    public final String shootWay;
    public final String shotLanding;
    public final Boolean showFilterReason;
    public final String subScene;
    public final Integer sumDuration;
    public final Function0<Pair<String, String>> uploadFramesResultProvider;
    public final Boolean withoutAssetList;
    public final File zipBinary;
    public final String zipUri;

    public MixedAssetsRequestBodyInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", "", "", null, null, null, null, Boolean.FALSE, null, "", null);
    }

    public MixedAssetsRequestBodyInfo(String str, List<Integer> list, String str2, Boolean bool, String str3, String str4, Integer num, List<FromAssetInfo> list2, Boolean bool2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool3, String str12, String str13, Boolean bool4, Function0<? extends Object> function0, List<Integer> list3, Boolean bool5, String str14, String str15, String str16, String str17, File file, Integer num2, Function0<Pair<String, String>> function02, Boolean bool6, Boolean bool7, String str18, String str19) {
        this.panelKey = str;
        this.mediaCount = list;
        this.lokiVersion = str2;
        this.needRecommend = bool;
        this.recommendKey = str3;
        this.defaultCategoryKey = str4;
        this.sumDuration = num;
        this.fromAssetList = list2;
        this.showFilterReason = bool2;
        this.recommendReqId = str5;
        this.creationId = str6;
        this.shootWay = str7;
        this.contentType = str8;
        this.contentSource = str9;
        this.zipUri = str10;
        this.accountType = str11;
        this.allowPugc = bool3;
        this.entrancePage = str12;
        this.reuseMusicId = str13;
        this.newPath = bool4;
        this.recConfig = function0;
        this.filterAssetTypeList = list3;
        this.withoutAssetList = bool5;
        this.extra = str14;
        this.recFeedFeatures = str15;
        this.scene = str16;
        this.subScene = str17;
        this.zipBinary = file;
        this.effectiveConnectionType = num2;
        this.uploadFramesResultProvider = function02;
        this.preCompute = bool6;
        this.enablePreloading = bool7;
        this.allMediaInfo = str18;
        this.shotLanding = str19;
    }
}
