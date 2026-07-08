package com.ss.android.ugc.aweme.discover.mixfeed;

import X.C09CT;
import X.C0PVY;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.discover.model.Layout;
import com.ss.android.ugc.aweme.discover.model.NearByAuth;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicPatch implements Serializable {
    public int adapterPlayAbleIndex;
    public SearchAIHotSpotCanvas aiHotspotCanvas;

    @C09CT("ai_hotspot_canvas")
    public Map<?, ?> aiHotspotCanvasRaw;

    @C09CT("ala_src")
    public String alaSrc;

    @C09CT("autoplay")
    public boolean autoplay;

    @C09CT("aweme_list")
    public List<Map<?, ?>> awemeListRaw;
    public h awemeListRawJsonArray;
    public volatile transient Map<Map, Aweme> awemeMap;
    public List<SearchMultiTabListData> awemeMultiTabList;

    @C09CT("aweme_multi_tab_list")
    public List<Map<?, ?>> awemeMultiTabListRaw;

    @C09CT("bullet_schema")
    public String bulletSchema;

    @C09CT("creative_ids")
    public List<String> createIds;
    public String docId;

    @C09CT("encoded_sequence")
    public String encodedSequence;

    @C09CT("extra_info")
    public Map<?, ?> extraInfo;

    @C09CT("fallback_toast")
    public String fallbackToast;
    public transient Gson gson;

    @C09CT("height")
    public int height;
    public Boolean isBound;

    @C09CT("is_ecom")
    public Boolean isEcom;
    public Boolean isEcomExtraChunk;
    public Object key;

    @C09CT("layout")
    public Layout layout;
    public List<Aweme> mAwemeList;
    public Map<String, Object> mGlobalProps;
    public volatile transient Map<Map, SearchMultiTabListData> multiTableListDataMap;

    @C09CT("nearby_auth")
    public NearByAuth nearByAuth;

    @C09CT("need_dynamic_patch_videos")
    public Boolean needDynamicPatchVideos;

    @C09CT("need_general_search_videos")
    public Boolean needGeneralSearchVideos;

    @C09CT("origin_type")
    public int originType;

    @C09CT("popup_type")
    public String popupType;

    @C09CT("preload_images")
    public List<FullSongUrlStruct> preloadImages;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @C09CT("raw_data")
    public String rawData;

    @C09CT("related_word_list")
    public List<RelatedWord> relatedWordList;

    @C09CT("schema")
    public String schema;
    public List<SearchHorizontalTab> tabMap;

    @C09CT("tab_map")
    public List<Map<?, ?>> tabMapRaw;

    @C09CT("token_type")
    public String tokenType;

    @C09CT("width")
    public int width;

    public static class RelatedWord implements Serializable {

        @C09CT("related_word")
        public String relatedWord = "";
    }

    public static class SearchAIHotSpotCanvas implements Serializable {

        @C09CT("backtrace")
        public String backtrace = "";

        @C09CT("canvas")
        public SearchAIHotSpotCanvasContent canvas;

        @C09CT("canvas_source_list")
        public List<SearchAIHotSpotCanvasContentSource> canvasSourceList;
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static class SearchAIHotSpotCanvasContent implements Serializable {

        @C09CT("canvas_height")
        public long canvasHeight;

        @C09CT("canvas_width")
        public long canvasWidth;

        @C09CT("content")
        public String content = "";

        @C09CT("version")
        public int version;
    }

    public static class SearchAIHotSpotCanvasContentSource implements Serializable {

        @C09CT("item_source")
        public Aweme itemSource;

        @C09CT("offsite")
        public int offsite;

        @C09CT("web_source")
        public HashMap<String, String> webSource;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SearchHorizontalTab implements Serializable {

        @C09CT("tab_name")
        public String TabName = "";

        @C09CT("tab_key_name")
        public String tabKeyName = "";

        @C09CT("start")
        public long start = -1;

        @C09CT("end")
        public long end = -1;
    }

    public static class SearchMultiTabListData implements Serializable {

        @C09CT("tab_name")
        public String tabName = "";

        @C09CT("tab_key")
        public String tabKey = "";

        @C09CT("tab_aweme_list")
        public List<Aweme> tabAwemeList = new ArrayList();

        @C09CT("tab_extra_data")
        public SearchTabExtraList tabExtraData = null;

        @C09CT("backtrace")
        public String backtrace = "";

        @C09CT("has_more")
        public boolean hasMore = true;

        @C09CT("cursor")
        public long cursor = 0;
    }

    public static class SearchTabExtraList implements Serializable {

        @C09CT("token_type")
        public String tokenType = "";

        @C09CT("poi_id_mapping")
        public List<Object> poiIdMapping = new ArrayList();
    }

    public List<String> getRelateSearchList() {
        ArrayList arrayList = new ArrayList();
        List<RelatedWord> list = this.relatedWordList;
        if (list != null) {
            Iterator<RelatedWord> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().relatedWord);
            }
        }
        return arrayList;
    }

    public List<SearchHorizontalTab> getTabMap() {
        if (this.tabMap == null && this.tabMapRaw != null) {
            this.tabMap = new ArrayList();
            Iterator<Map<?, ?>> it2 = this.tabMapRaw.iterator();
            while (it2.hasNext()) {
                this.tabMap.add((SearchHorizontalTab) GsonProtectorUtils.fromJson(this.gson, GsonProtectorUtils.toJson(this.gson, it2.next()), new TypeToken<SearchHorizontalTab>() { // from class: X.0PUP
                }.getType()));
            }
        }
        return this.tabMap;
    }

    public int hashCode() {
        Layout layout = this.layout;
        int iHashCode = (layout != null ? layout.hashCode() : 0) * 31;
        String str = this.rawData;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schema;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bulletSchema;
        int iHashCode4 = (((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31;
        List<Map<?, ?>> list = this.awemeListRaw;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public boolean isQrecVirtualEnable() {
        return "1".equals(this.qrecVirtualEnable);
    }

    public int renderFingerprint() {
        Layout layout = this.layout;
        int iHashCode = (layout != null ? layout.hashCode() : 0) * 31;
        String str = this.rawData;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schema;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bulletSchema;
        int iHashCode4 = (((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31;
        List<Map<?, ?>> list = this.awemeListRaw;
        int iHashCode5 = (((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + this.originType) * 31;
        String str4 = this.tokenType;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.needGeneralSearchVideos;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Map<?, ?> map = this.aiHotspotCanvasRaw;
        int iHashCode8 = (iHashCode7 + (map != null ? map.hashCode() : 0)) * 31;
        List<RelatedWord> list2 = this.relatedWordList;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        NearByAuth nearByAuth = this.nearByAuth;
        int iHashCode10 = (iHashCode9 + (nearByAuth != null ? nearByAuth.hashCode() : 0)) * 31;
        String str5 = this.encodedSequence;
        int iHashCode11 = (iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.popupType;
        int iHashCode12 = (iHashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.fallbackToast;
        int iHashCode13 = (iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool2 = this.isEcom;
        int iHashCode14 = (iHashCode13 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        List<String> list3 = this.createIds;
        int iHashCode15 = (iHashCode14 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str8 = this.alaSrc;
        int iHashCode16 = (iHashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31;
        List<Map<?, ?>> list4 = this.tabMapRaw;
        int iHashCode17 = (iHashCode16 + (list4 != null ? list4.hashCode() : 0)) * 31;
        Map<?, ?> map2 = this.extraInfo;
        int iHashCode18 = (iHashCode17 + (map2 != null ? map2.hashCode() : 0)) * 31;
        List<Map<?, ?>> list5 = this.awemeMultiTabListRaw;
        return iHashCode18 + (list5 != null ? list5.hashCode() : 0);
    }

    public void switchBindStatus() {
        this.isBound = Boolean.valueOf(!this.isBound.booleanValue());
    }

    public DynamicPatch() {
        Boolean bool = Boolean.FALSE;
        this.isEcomExtraChunk = bool;
        this.key = new Object();
        this.isBound = bool;
        this.gson = new Gson();
        this.qrecVirtualEnable = null;
        this.docId = "";
        this.adapterPlayAbleIndex = -1;
        this.autoplay = false;
        this.mGlobalProps = new HashMap();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicPatch{key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", rawData='");
        sbLIZ.append(this.rawData);
        sbLIZ.append('\'');
        sbLIZ.append(", schema='");
        sbLIZ.append(this.schema);
        sbLIZ.append('\'');
        sbLIZ.append(", bulletSchema='");
        sbLIZ.append(this.bulletSchema);
        sbLIZ.append('\'');
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", originType=");
        sbLIZ.append(this.originType);
        sbLIZ.append(", =");
        sbLIZ.append(this.mAwemeList);
        sbLIZ.append(", rawAwemeList=");
        sbLIZ.append(this.awemeListRaw);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Boolean bindStatus() {
        return this.isBound;
    }

    public int getAdapterPlayAbleIndex() {
        return this.adapterPlayAbleIndex;
    }

    public SearchAIHotSpotCanvas getAiHotspotCanvas() {
        return this.aiHotspotCanvas;
    }

    public Map<?, ?> getAiHotspotCanvasRaw() {
        return this.aiHotspotCanvasRaw;
    }

    public String getAlaSrc() {
        return this.alaSrc;
    }

    public List<Aweme> getAwemeList() {
        return this.mAwemeList;
    }

    public List<Map<?, ?>> getAwemeListRaw() {
        return this.awemeListRaw;
    }

    public List<SearchMultiTabListData> getAwemeMultiTabList() {
        return this.awemeMultiTabList;
    }

    public List<Map<?, ?>> getAwemeMultiTabListRaw() {
        return this.awemeMultiTabListRaw;
    }

    public String getBulletSchema() {
        return this.bulletSchema;
    }

    public String getDocId() {
        return this.docId;
    }

    public String getEncodedSequence() {
        return this.encodedSequence;
    }

    public String getFallbackToast() {
        return this.fallbackToast;
    }

    public Map<String, Object> getGlobalProps() {
        return this.mGlobalProps;
    }

    public int getHeight() {
        return this.height;
    }

    public Boolean getIsEcom() {
        return this.isEcom;
    }

    public Object getKey() {
        return this.key;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public NearByAuth getNearByAuth() {
        return this.nearByAuth;
    }

    public Boolean getNeedDynamicPatchVideos() {
        return this.needDynamicPatchVideos;
    }

    public Boolean getNeedGeneralSearchVideos() {
        return this.needGeneralSearchVideos;
    }

    public int getOriginType() {
        return this.originType;
    }

    public String getPopupType() {
        return this.popupType;
    }

    public List<FullSongUrlStruct> getPreloadImages() {
        return this.preloadImages;
    }

    public String getRawData() {
        return this.rawData;
    }

    public String getSchema() {
        return this.schema;
    }

    public Map<?, ?> getSearchEComExtraInfo() {
        return this.extraInfo;
    }

    public List<Map<?, ?>> getTabMapRaw() {
        return this.tabMapRaw;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAutoplay() {
        return this.autoplay;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPatch)) {
            return false;
        }
        DynamicPatch dynamicPatch = (DynamicPatch) obj;
        if (this.height == dynamicPatch.height && this.width == dynamicPatch.width && C0PVY.LIZ(this.layout, dynamicPatch.layout) && C0PVY.LIZ(this.rawData, dynamicPatch.rawData) && C0PVY.LIZ(this.mAwemeList, dynamicPatch.mAwemeList) && C0PVY.LIZ(this.awemeListRaw, dynamicPatch.awemeListRaw) && C0PVY.LIZ(this.schema, dynamicPatch.schema) && C0PVY.LIZ(this.bulletSchema, dynamicPatch.bulletSchema)) {
            return true;
        }
        return false;
    }

    public List<Map<?, ?>> getAwemeListRawByPosition(int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ListProtector.get(this.awemeListRaw, i));
        return arrayList;
    }

    public void setAdapterPlayAbleIndex(int i) {
        this.adapterPlayAbleIndex = i;
    }

    public void setAiHotspotCanvas(SearchAIHotSpotCanvas searchAIHotSpotCanvas) {
        this.aiHotspotCanvas = searchAIHotSpotCanvas;
    }

    public void setAiHotspotCanvasRaw(Map<?, ?> map) {
        this.aiHotspotCanvasRaw = map;
    }

    public void setAlaSrc(String str) {
        this.alaSrc = str;
    }

    public void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    public void setAwemeList(List<Aweme> list) {
        this.mAwemeList = list;
    }

    public void setAwemeListRaw(List<Map<?, ?>> list) {
        this.awemeListRaw = list;
    }

    public void setAwemeMultiTabList(List<SearchMultiTabListData> list) {
        this.awemeMultiTabList = list;
    }

    public void setAwemeMultiTabListRaw(List<Map<?, ?>> list) {
        this.awemeMultiTabListRaw = list;
    }

    public void setBulletSchema(String str) {
        this.bulletSchema = str;
    }

    public void setDocId(String str) {
        this.docId = str;
    }

    public void setFallbackToast(String str) {
        this.fallbackToast = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIsEcom(Boolean bool) {
        this.isEcom = bool;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public void setNearByAuth(NearByAuth nearByAuth) {
        this.nearByAuth = nearByAuth;
    }

    public void setNeedDynamicPatchVideos(Boolean bool) {
        this.needDynamicPatchVideos = bool;
    }

    public void setNeedGeneralSearchVideos(Boolean bool) {
        this.needGeneralSearchVideos = bool;
    }

    public void setOriginType(int i) {
        this.originType = i;
    }

    public void setPopupType(String str) {
        this.popupType = str;
    }

    public void setQrecVirtualEnable(String str) {
        this.qrecVirtualEnable = str;
    }

    public void setRawData(String str) {
        this.rawData = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchEComExtraInfo(Map<?, ?> map) {
        this.extraInfo = map;
    }

    public void setTabMapRaw(List<Map<?, ?>> list) {
        this.tabMapRaw = list;
    }

    public void setTokenType(String str) {
        this.tokenType = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
