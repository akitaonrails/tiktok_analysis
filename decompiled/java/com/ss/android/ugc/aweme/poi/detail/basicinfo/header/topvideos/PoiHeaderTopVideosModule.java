package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos;

import X.C09CT;
import X.C1201190hMb;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosModule extends BaseComponentData implements Serializable {

    @C09CT("cursor")
    public final String cursor;

    @C09CT("data_version")
    public final String dataVersion;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("is_world_cup")
    public final Boolean isWorldCup;

    @C09CT("item_layout_style")
    public final Integer itemLayoutStyle;

    @C09CT("item_list")
    public final List<PoiListApi.PoiMergedListItem> mergedListItems;

    @C09CT("multi_medium_background_img")
    public final UrlModel multiMediumBackgroundImg;

    @C09CT("post_bottom_bar_style")
    public final Integer postBottomBarStyle;

    @C09CT("tab_list")
    public final List<PoiDetailApi.PoiMultiMediumTab> tabList;

    @C09CT("title")
    public final String title;

    @C09CT("top_height_style")
    public final String topHeightStyle;

    @C09CT("world_cup_logo")
    public final String worldCupLogo;

    public PoiHeaderTopVideosModule() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PoiHeaderTopVideosModule copy(List<PoiListApi.PoiMergedListItem> list, UrlModel urlModel, String str, Boolean bool, String str2, List<PoiDetailApi.PoiMultiMediumTab> list2, String str3, String str4, Integer num, Integer num2, Boolean bool2, String str5) {
        return new PoiHeaderTopVideosModule(list, urlModel, str, bool, str2, list2, str3, str4, num, num2, bool2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiHeaderTopVideosModule)) {
            return false;
        }
        PoiHeaderTopVideosModule poiHeaderTopVideosModule = (PoiHeaderTopVideosModule) obj;
        return Intrinsics.LJFF(this.mergedListItems, poiHeaderTopVideosModule.mergedListItems) && Intrinsics.LJFF(this.multiMediumBackgroundImg, poiHeaderTopVideosModule.multiMediumBackgroundImg) && Intrinsics.LJFF(this.cursor, poiHeaderTopVideosModule.cursor) && Intrinsics.LJFF(this.hasMore, poiHeaderTopVideosModule.hasMore) && Intrinsics.LJFF(this.dataVersion, poiHeaderTopVideosModule.dataVersion) && Intrinsics.LJFF(this.tabList, poiHeaderTopVideosModule.tabList) && Intrinsics.LJFF(this.title, poiHeaderTopVideosModule.title) && Intrinsics.LJFF(this.topHeightStyle, poiHeaderTopVideosModule.topHeightStyle) && Intrinsics.LJFF(this.postBottomBarStyle, poiHeaderTopVideosModule.postBottomBarStyle) && Intrinsics.LJFF(this.itemLayoutStyle, poiHeaderTopVideosModule.itemLayoutStyle) && Intrinsics.LJFF(this.isWorldCup, poiHeaderTopVideosModule.isWorldCup) && Intrinsics.LJFF(this.worldCupLogo, poiHeaderTopVideosModule.worldCupLogo);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        List<PoiListApi.PoiMergedListItem> list = this.mergedListItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UrlModel urlModel = this.multiMediumBackgroundImg;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.cursor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.dataVersion;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PoiDetailApi.PoiMultiMediumTab> list2 = this.tabList;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.topHeightStyle;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.postBottomBarStyle;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.itemLayoutStyle;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isWorldCup;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.worldCupLogo;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "PoiHeaderTopVideosModule(mergedListItems=" + this.mergedListItems + ", multiMediumBackgroundImg=" + this.multiMediumBackgroundImg + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", dataVersion=" + this.dataVersion + ", tabList=" + this.tabList + ", title=" + this.title + ", topHeightStyle=" + this.topHeightStyle + ", postBottomBarStyle=" + this.postBottomBarStyle + ", itemLayoutStyle=" + this.itemLayoutStyle + ", isWorldCup=" + this.isWorldCup + ", worldCupLogo=" + this.worldCupLogo + ')';
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getDataVersion() {
        return this.dataVersion;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getItemLayoutStyle() {
        return this.itemLayoutStyle;
    }

    public final List<PoiListApi.PoiMergedListItem> getMergedListItems() {
        return this.mergedListItems;
    }

    public final UrlModel getMultiMediumBackgroundImg() {
        return this.multiMediumBackgroundImg;
    }

    public final Integer getPostBottomBarStyle() {
        return this.postBottomBarStyle;
    }

    public final List<PoiDetailApi.PoiMultiMediumTab> getTabList() {
        return this.tabList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTopHeightStyle() {
        return this.topHeightStyle;
    }

    public final String getWorldCupLogo() {
        return this.worldCupLogo;
    }

    public final Boolean isWorldCup() {
        return this.isWorldCup;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[PHI: r1
      0x000f: PHI (r1v16 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v0 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v17 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:7:0x0009, B:9:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013 A[PHI: r1 r2
      0x0013: PHI (r1v1 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v16 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v17 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:11:0x0011, B:9:0x000d] A[DONT_GENERATE, DONT_INLINE]
      0x0013: PHI (r2v0 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v15 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v16 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:11:0x0011, B:9:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017 A[PHI: r1 r2
      0x0017: PHI (r1v15 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v1 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v16 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:13:0x0015, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r2v14 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v15 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:13:0x0015, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001b A[PHI: r1 r2 r3
      0x001b: PHI (r1v14 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v1 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v15 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:13:0x0015, B:15:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r2v13 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v14 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:13:0x0015, B:15:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r3v13 java.lang.String) = (r3v0 java.lang.String), (r3v14 java.lang.String) binds: [B:13:0x0015, B:15:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f A[PHI: r1 r2 r3
      0x001f: PHI (r1v2 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v14 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v15 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:17:0x001d, B:15:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r2v1 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v13 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v14 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:17:0x001d, B:15:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001f: PHI (r3v1 java.lang.String) = (r3v13 java.lang.String), (r3v14 java.lang.String) binds: [B:17:0x001d, B:15:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0023 A[PHI: r1 r2 r3 r4
      0x0023: PHI (r1v13 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v2 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v14 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:19:0x0021, B:17:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r2v12 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v1 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v13 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:19:0x0021, B:17:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r3v12 java.lang.String) = (r3v1 java.lang.String), (r3v13 java.lang.String) binds: [B:19:0x0021, B:17:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r4v11 java.lang.Boolean) = (r4v0 java.lang.Boolean), (r4v12 java.lang.Boolean) binds: [B:19:0x0021, B:17:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[PHI: r1 r2 r3 r4
      0x0027: PHI (r1v12 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v2 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v13 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:19:0x0021, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r2v11 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v1 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v12 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:19:0x0021, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r3v11 java.lang.String) = (r3v1 java.lang.String), (r3v12 java.lang.String) binds: [B:19:0x0021, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r4v10 java.lang.Boolean) = (r4v0 java.lang.Boolean), (r4v11 java.lang.Boolean) binds: [B:19:0x0021, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002b A[PHI: r1 r2 r3 r4 r5
      0x002b: PHI (r1v3 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v12 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v13 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:23:0x0029, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r2v2 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v11 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v12 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:23:0x0029, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r3v2 java.lang.String) = (r3v11 java.lang.String), (r3v12 java.lang.String) binds: [B:23:0x0029, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v1 java.lang.Boolean) = (r4v10 java.lang.Boolean), (r4v11 java.lang.Boolean) binds: [B:23:0x0029, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r5v0 java.lang.String) = (r5v9 java.lang.String), (r5v10 java.lang.String) binds: [B:23:0x0029, B:21:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f A[PHI: r1 r2 r3 r4 r5
      0x002f: PHI (r1v11 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v3 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v12 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:25:0x002d, B:23:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r2v10 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v2 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v11 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:25:0x002d, B:23:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r3v10 java.lang.String) = (r3v2 java.lang.String), (r3v11 java.lang.String) binds: [B:25:0x002d, B:23:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r4v9 java.lang.Boolean) = (r4v1 java.lang.Boolean), (r4v10 java.lang.Boolean) binds: [B:25:0x002d, B:23:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r5v8 java.lang.String) = (r5v0 java.lang.String), (r5v9 java.lang.String) binds: [B:25:0x002d, B:23:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033 A[PHI: r1 r2 r3 r4 r5 r6
      0x0033: PHI (r1v10 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v3 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v11 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:25:0x002d, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r2v9 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v2 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v10 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:25:0x002d, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r3v9 java.lang.String) = (r3v2 java.lang.String), (r3v10 java.lang.String) binds: [B:25:0x002d, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r4v8 java.lang.Boolean) = (r4v1 java.lang.Boolean), (r4v9 java.lang.Boolean) binds: [B:25:0x002d, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r5v7 java.lang.String) = (r5v0 java.lang.String), (r5v8 java.lang.String) binds: [B:25:0x002d, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r6v7 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>) = 
      (r6v0 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
      (r6v8 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
     binds: [B:25:0x002d, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037 A[PHI: r1 r2 r3 r4 r5 r6
      0x0037: PHI (r1v4 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v10 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v11 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:29:0x0035, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r2v3 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v9 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v10 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:29:0x0035, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r3v3 java.lang.String) = (r3v9 java.lang.String), (r3v10 java.lang.String) binds: [B:29:0x0035, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v2 java.lang.Boolean) = (r4v8 java.lang.Boolean), (r4v9 java.lang.Boolean) binds: [B:29:0x0035, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r5v1 java.lang.String) = (r5v7 java.lang.String), (r5v8 java.lang.String) binds: [B:29:0x0035, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r6v1 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>) = 
      (r6v7 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
      (r6v8 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
     binds: [B:29:0x0035, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b A[PHI: r1 r2 r3 r4 r5 r6 r7
      0x003b: PHI (r1v9 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v4 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v10 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r2v8 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v3 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v9 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r3v8 java.lang.String) = (r3v3 java.lang.String), (r3v9 java.lang.String) binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r4v7 java.lang.Boolean) = (r4v2 java.lang.Boolean), (r4v8 java.lang.Boolean) binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r5v6 java.lang.String) = (r5v1 java.lang.String), (r5v7 java.lang.String) binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r6v6 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>) = 
      (r6v1 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
      (r6v7 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
     binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r7v5 java.lang.String) = (r7v0 java.lang.String), (r7v6 java.lang.String) binds: [B:31:0x0039, B:29:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f A[PHI: r1 r2 r3 r4 r5 r6 r7
      0x003f: PHI (r1v8 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v4 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v9 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r2v7 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v3 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v8 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r3v7 java.lang.String) = (r3v3 java.lang.String), (r3v8 java.lang.String) binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r4v6 java.lang.Boolean) = (r4v2 java.lang.Boolean), (r4v7 java.lang.Boolean) binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String) binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r6v5 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>) = 
      (r6v1 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
      (r6v6 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
     binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r7v4 java.lang.String) = (r7v0 java.lang.String), (r7v5 java.lang.String) binds: [B:31:0x0039, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043 A[PHI: r1 r2 r3 r4 r5 r6 r7 r8
      0x0043: PHI (r1v5 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v8 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v9 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r2v4 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v7 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v8 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r3v4 java.lang.String) = (r3v7 java.lang.String), (r3v8 java.lang.String) binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r4v3 java.lang.Boolean) = (r4v6 java.lang.Boolean), (r4v7 java.lang.Boolean) binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r5v2 java.lang.String) = (r5v5 java.lang.String), (r5v6 java.lang.String) binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r6v2 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>) = 
      (r6v5 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
      (r6v6 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
     binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r7v1 java.lang.String) = (r7v4 java.lang.String), (r7v5 java.lang.String) binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r8v0 java.lang.String) = (r8v3 java.lang.String), (r8v4 java.lang.String) binds: [B:35:0x0041, B:33:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047 A[PHI: r1 r2 r3 r4 r5 r6 r7 r8
      0x0047: PHI (r1v7 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v5 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v8 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r2v6 com.ss.android.ugc.aweme.base.model.UrlModel) = (r2v4 com.ss.android.ugc.aweme.base.model.UrlModel), (r2v7 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r3v6 java.lang.String) = (r3v4 java.lang.String), (r3v7 java.lang.String) binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r4v5 java.lang.Boolean) = (r4v3 java.lang.Boolean), (r4v6 java.lang.Boolean) binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r6v4 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>) = 
      (r6v2 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
      (r6v5 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab>)
     binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:37:0x0045, B:35:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053 A[PHI: r11
      0x0053: PHI (r11v3 java.lang.Boolean) = (r11v0 java.lang.Boolean), (r11v4 java.lang.Boolean) binds: [B:43:0x0051, B:41:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[PHI: r11
      0x0057: PHI (r11v2 java.lang.Boolean) = (r11v0 java.lang.Boolean), (r11v3 java.lang.Boolean) binds: [B:43:0x0051, B:45:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[PHI: r1
      0x000b: PHI (r1v17 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>) = 
      (r1v0 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
      (r1v18 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem>)
     binds: [B:7:0x0009, B:5:0x0005] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule merge$poi_release(com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule r14) {
        /*
            r13 = this;
            r0 = r13
            if (r14 == 0) goto L7
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem> r1 = r14.mergedListItems
            if (r1 != 0) goto Lb
        L7:
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem> r1 = r0.mergedListItems
            if (r14 == 0) goto Lf
        Lb:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r14.multiMediumBackgroundImg
            if (r2 != 0) goto L13
        Lf:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.multiMediumBackgroundImg
            if (r14 == 0) goto L17
        L13:
            java.lang.String r3 = r14.cursor
            if (r3 != 0) goto L1b
        L17:
            java.lang.String r3 = r0.cursor
            if (r14 == 0) goto L1f
        L1b:
            java.lang.Boolean r4 = r14.hasMore
            if (r4 != 0) goto L23
        L1f:
            java.lang.Boolean r4 = r0.hasMore
            if (r14 == 0) goto L27
        L23:
            java.lang.String r5 = r14.dataVersion
            if (r5 != 0) goto L2b
        L27:
            java.lang.String r5 = r0.dataVersion
            if (r14 == 0) goto L2f
        L2b:
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab> r6 = r14.tabList
            if (r6 != 0) goto L33
        L2f:
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiMultiMediumTab> r6 = r0.tabList
            if (r14 == 0) goto L37
        L33:
            java.lang.String r7 = r14.title
            if (r7 != 0) goto L3b
        L37:
            java.lang.String r7 = r0.title
            if (r14 == 0) goto L3f
        L3b:
            java.lang.String r8 = r14.topHeightStyle
            if (r8 != 0) goto L43
        L3f:
            java.lang.String r8 = r0.topHeightStyle
            if (r14 == 0) goto L47
        L43:
            java.lang.Integer r9 = r14.postBottomBarStyle
            if (r9 != 0) goto L49
        L47:
            java.lang.Integer r9 = r0.postBottomBarStyle
        L49:
            if (r14 == 0) goto L4f
            java.lang.Boolean r11 = r14.isWorldCup
            if (r11 != 0) goto L53
        L4f:
            java.lang.Boolean r11 = r0.isWorldCup
            if (r14 == 0) goto L57
        L53:
            java.lang.String r12 = r14.worldCupLogo
            if (r12 != 0) goto L59
        L57:
            java.lang.String r12 = r0.worldCupLogo
        L59:
            java.lang.Integer r10 = r0.itemLayoutStyle
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule r0 = r0.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule.merge$poi_release(com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule):com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule");
    }

    public PoiHeaderTopVideosModule(List<PoiListApi.PoiMergedListItem> list, UrlModel urlModel, String str, Boolean bool, String str2, List<PoiDetailApi.PoiMultiMediumTab> list2, String str3, String str4, Integer num, Integer num2, Boolean bool2, String str5) {
        this.mergedListItems = list;
        this.multiMediumBackgroundImg = urlModel;
        this.cursor = str;
        this.hasMore = bool;
        this.dataVersion = str2;
        this.tabList = list2;
        this.title = str3;
        this.topHeightStyle = str4;
        this.postBottomBarStyle = num;
        this.itemLayoutStyle = num2;
        this.isWorldCup = bool2;
        this.worldCupLogo = str5;
    }
}
