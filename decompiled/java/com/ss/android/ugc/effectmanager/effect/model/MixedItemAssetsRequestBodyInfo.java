package com.ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class MixedItemAssetsRequestBodyInfo {
    public final String aiGcConfigJason;
    public final List<AssetCondition> assetConditionList;
    public final String extra;
    public final Boolean forceNoFilter;
    public final List<Integer> mediaCount;
    public final Boolean needCollectLabel;
    public final String recConfig;
    public final String scene;
    public final Boolean showFilterReason;
    public final String subScene;
    public final String zipUri;

    public MixedItemAssetsRequestBodyInfo(List<AssetCondition> list, Boolean bool, List<Integer> list2, String str, String str2, String str3, Boolean bool2, String str4, Boolean bool3, String str5, String str6) {
        this.assetConditionList = list;
        this.showFilterReason = bool;
        this.mediaCount = list2;
        this.aiGcConfigJason = str;
        this.recConfig = str2;
        this.extra = str3;
        this.forceNoFilter = bool2;
        this.zipUri = str4;
        this.needCollectLabel = bool3;
        this.scene = str5;
        this.subScene = str6;
    }
}
