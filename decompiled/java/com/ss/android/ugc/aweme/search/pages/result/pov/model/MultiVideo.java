package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.AnonymousClass0529;
import X.C09CT;
import X.C0BQI;
import X.C1172204iG;
import X.C13LP;
import X.EnumC488230JCr;
import X.InterfaceC682670Qq9;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.BottomQuoteSources;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class MultiVideo implements Serializable, InterfaceC682670Qq9 {
    public Map<C1172204iG, Map<String, Object>> LL;
    public transient Map<C1172204iG, Map<String, Object>> LLILLJJLI = new LinkedHashMap();

    @C09CT("biz_unique_key")
    public final String bizUniqueKey;

    @C09CT("block_id")
    public final Integer blockId;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("default_open")
    public final Boolean defaultOpen;

    @C09CT("detail_layout_name")
    public final String detailLayoutName;

    @C09CT("display_line")
    public final Integer displayLine;

    @C09CT("display_lines")
    public final List<Double> displayLines;

    @C09CT("dynamic_patch")
    public final DynamicPatch dynamicPatch;

    @C09CT("favor_and_feedback")
    public final FavorAndFeedback favorAndFeedback;

    @C09CT("flatten_aweme_list_size")
    public final int flattenAwemeListSize;

    @C09CT("fold_from_id")
    public final String foldFromId;

    @C09CT("fold_id")
    public final String foldId;

    @C09CT("fold_title")
    public final String foldTitle;

    @C09CT("is_tako")
    public final Boolean isTako;

    @C09CT("landing_page_short_answer_format")
    public final ShortAnswerFormat landingPageShortAnswerFormat;

    @C09CT("layout_name")
    public final String layoutName;

    @C09CT("layout_type")
    public final Integer layoutType;

    @C09CT("mixed_text")
    public final String mixedText;

    @C09CT("multi_video_summaries")
    public final List<String> multiVideoSummaries;

    @C09CT("multi_video_summary")
    public final String multiVideoSummary;

    @C09CT("nimble_extra_data")
    public final Map<String, Object> nimbleExtraData;

    @C09CT("point_to_other_block_id_list")
    public final List<Double> pointToOtherBlockIdList;

    @C09CT("point_to_other_text_block_id_list")
    public final List<Double> pointToOtherTextBlockIdList;

    @C09CT("quote_block_map")
    public final LinkedHashMap<String, QuoteBlock> quoteBlockMap;

    @C09CT("ref_source_list")
    public final List<RefSource> refSourceList;

    @C09CT("ref_source_map")
    public final LinkedHashMap<String, RefSource> refSourceMap;

    @C09CT("related_word_list")
    public final List<RelatedWord> relatedWordList;

    @C09CT("short_answer_format")
    public final ShortAnswerFormat shortAnswerFormat;

    @C09CT("snippet")
    public final String snippet;

    @C09CT("snippets")
    public final List<String> snippets;

    @C09CT("source_from_entities")
    public final SourceFromEntities sourceFromEntities;

    @C09CT("sub_images")
    public final List<ImageData> subImages;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("sub_videos")
    public List<? extends Aweme> subVideos;

    @C09CT("surrounded_video")
    public final Aweme surroundedVideo;

    @C09CT("surrounded_video_id")
    public final String surroundedVideoId;

    @C09CT("surrounded_video_index")
    public final int surroundedVideoIndex;

    @C09CT("tag_list")
    public final List<String> tagList;

    @C09CT("tag_positions")
    public final List<TagPosition> tagPositions;

    @C09CT("tako_long_sug_list")
    public final List<String> takoLongSugList;

    @C09CT("tako_sug_list")
    public final List<String> takoSugList;

    @C09CT("tako_summaries")
    public final List<String> takoSummaries;

    @C09CT("texts")
    public final List<String> texts;

    @C09CT("type")
    public final Integer type;

    @C09CT("unique_id")
    public final String uniqueId;

    public final int component33() {
        return this.flattenAwemeListSize;
    }

    public final int component34() {
        return this.surroundedVideoIndex;
    }

    public final MultiVideo copy(List<? extends Aweme> list, String str, Integer num, Integer num2, List<RelatedWord> list2, Integer num3, List<String> list3, String str2, SourceFromEntities sourceFromEntities, List<TagPosition> list4, FavorAndFeedback favorAndFeedback, List<RefSource> list5, Boolean bool, List<String> list6, List<String> list7, String str3, String str4, List<String> list8, List<Double> list9, List<ImageData> list10, List<String> list11, List<String> list12, DynamicPatch dynamicPatch, Integer num4, List<Double> list13, String str5, String str6, String str7, Boolean bool2, List<Double> list14, String str8, String str9, int i, int i2, String str10, Aweme aweme, LinkedHashMap<String, RefSource> linkedHashMap, LinkedHashMap<String, QuoteBlock> linkedHashMap2, String str11, List<String> list15, ShortAnswerFormat shortAnswerFormat, ShortAnswerFormat shortAnswerFormat2, Map<String, ? extends Object> map) {
        return new MultiVideo(list, str, num, num2, list2, num3, list3, str2, sourceFromEntities, list4, favorAndFeedback, list5, bool, list6, list7, str3, str4, list8, list9, list10, list11, list12, dynamicPatch, num4, list13, str5, str6, str7, bool2, list14, str8, str9, i, i2, str10, aweme, linkedHashMap, linkedHashMap2, str11, list15, shortAnswerFormat, shortAnswerFormat2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiVideo)) {
            return false;
        }
        MultiVideo multiVideo = (MultiVideo) obj;
        return Intrinsics.LJFF(this.subVideos, multiVideo.subVideos) && Intrinsics.LJFF(this.subTitle, multiVideo.subTitle) && Intrinsics.LJFF(this.layoutType, multiVideo.layoutType) && Intrinsics.LJFF(this.displayLine, multiVideo.displayLine) && Intrinsics.LJFF(this.relatedWordList, multiVideo.relatedWordList) && Intrinsics.LJFF(this.type, multiVideo.type) && Intrinsics.LJFF(this.tagList, multiVideo.tagList) && Intrinsics.LJFF(this.uniqueId, multiVideo.uniqueId) && Intrinsics.LJFF(this.sourceFromEntities, multiVideo.sourceFromEntities) && Intrinsics.LJFF(this.tagPositions, multiVideo.tagPositions) && Intrinsics.LJFF(this.favorAndFeedback, multiVideo.favorAndFeedback) && Intrinsics.LJFF(this.refSourceList, multiVideo.refSourceList) && Intrinsics.LJFF(this.isTako, multiVideo.isTako) && Intrinsics.LJFF(this.takoSugList, multiVideo.takoSugList) && Intrinsics.LJFF(this.takoLongSugList, multiVideo.takoLongSugList) && Intrinsics.LJFF(this.layoutName, multiVideo.layoutName) && Intrinsics.LJFF(this.detailLayoutName, multiVideo.detailLayoutName) && Intrinsics.LJFF(this.multiVideoSummaries, multiVideo.multiVideoSummaries) && Intrinsics.LJFF(this.displayLines, multiVideo.displayLines) && Intrinsics.LJFF(this.subImages, multiVideo.subImages) && Intrinsics.LJFF(this.texts, multiVideo.texts) && Intrinsics.LJFF(this.snippets, multiVideo.snippets) && Intrinsics.LJFF(this.dynamicPatch, multiVideo.dynamicPatch) && Intrinsics.LJFF(this.blockId, multiVideo.blockId) && Intrinsics.LJFF(this.pointToOtherBlockIdList, multiVideo.pointToOtherBlockIdList) && Intrinsics.LJFF(this.foldId, multiVideo.foldId) && Intrinsics.LJFF(this.foldFromId, multiVideo.foldFromId) && Intrinsics.LJFF(this.foldTitle, multiVideo.foldTitle) && Intrinsics.LJFF(this.defaultOpen, multiVideo.defaultOpen) && Intrinsics.LJFF(this.pointToOtherTextBlockIdList, multiVideo.pointToOtherTextBlockIdList) && Intrinsics.LJFF(this.mixedText, multiVideo.mixedText) && Intrinsics.LJFF(this.bizUniqueKey, multiVideo.bizUniqueKey) && this.flattenAwemeListSize == multiVideo.flattenAwemeListSize && this.surroundedVideoIndex == multiVideo.surroundedVideoIndex && Intrinsics.LJFF(this.surroundedVideoId, multiVideo.surroundedVideoId) && Intrinsics.LJFF(this.surroundedVideo, multiVideo.surroundedVideo) && Intrinsics.LJFF(this.refSourceMap, multiVideo.refSourceMap) && Intrinsics.LJFF(this.quoteBlockMap, multiVideo.quoteBlockMap) && Intrinsics.LJFF(this.buttonText, multiVideo.buttonText) && Intrinsics.LJFF(this.takoSummaries, multiVideo.takoSummaries) && Intrinsics.LJFF(this.shortAnswerFormat, multiVideo.shortAnswerFormat) && Intrinsics.LJFF(this.landingPageShortAnswerFormat, multiVideo.landingPageShortAnswerFormat) && Intrinsics.LJFF(this.nimbleExtraData, multiVideo.nimbleExtraData);
    }

    @Override // X.InterfaceC682670Qq9
    public AnonymousClass0529 getAnimInfo() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public BottomQuoteSources getBottomSources() {
        return null;
    }

    public Integer getChunkIndex() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public Boolean getNeedPlaceHolder() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getPlaceholderType() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public EnumC488230JCr getRequestStatus() {
        return null;
    }

    public Integer getStreamingPosition() {
        return null;
    }

    public int hashCode() {
        List<? extends Aweme> list = this.subVideos;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.subTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.layoutType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.displayLine;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<RelatedWord> list2 = this.relatedWordList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.type;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list3 = this.tagList;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.uniqueId;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SourceFromEntities sourceFromEntities = this.sourceFromEntities;
        int iHashCode9 = (iHashCode8 + (sourceFromEntities == null ? 0 : sourceFromEntities.hashCode())) * 31;
        List<TagPosition> list4 = this.tagPositions;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        FavorAndFeedback favorAndFeedback = this.favorAndFeedback;
        int iHashCode11 = (iHashCode10 + (favorAndFeedback == null ? 0 : favorAndFeedback.hashCode())) * 31;
        List<RefSource> list5 = this.refSourceList;
        int iHashCode12 = (iHashCode11 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.isTako;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list6 = this.takoSugList;
        int iHashCode14 = (iHashCode13 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.takoLongSugList;
        int iHashCode15 = (iHashCode14 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str3 = this.layoutName;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.detailLayoutName;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list8 = this.multiVideoSummaries;
        int iHashCode18 = (iHashCode17 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<Double> list9 = this.displayLines;
        int iHashCode19 = (iHashCode18 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<ImageData> list10 = this.subImages;
        int iHashCode20 = (iHashCode19 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<String> list11 = this.texts;
        int iHashCode21 = (iHashCode20 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<String> list12 = this.snippets;
        int iHashCode22 = (iHashCode21 + (list12 == null ? 0 : list12.hashCode())) * 31;
        DynamicPatch dynamicPatch = this.dynamicPatch;
        int iHashCode23 = (iHashCode22 + (dynamicPatch == null ? 0 : dynamicPatch.hashCode())) * 31;
        Integer num4 = this.blockId;
        int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<Double> list13 = this.pointToOtherBlockIdList;
        int iHashCode25 = (iHashCode24 + (list13 == null ? 0 : list13.hashCode())) * 31;
        String str5 = this.foldId;
        int iHashCode26 = (iHashCode25 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.foldFromId;
        int iHashCode27 = (iHashCode26 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.foldTitle;
        int iHashCode28 = (iHashCode27 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.defaultOpen;
        int iHashCode29 = (iHashCode28 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Double> list14 = this.pointToOtherTextBlockIdList;
        int iHashCode30 = (iHashCode29 + (list14 == null ? 0 : list14.hashCode())) * 31;
        String str8 = this.mixedText;
        int iHashCode31 = (iHashCode30 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bizUniqueKey;
        int iHashCode32 = (((((iHashCode31 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.flattenAwemeListSize) * 31) + this.surroundedVideoIndex) * 31;
        String str10 = this.surroundedVideoId;
        int iHashCode33 = (iHashCode32 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Aweme aweme = this.surroundedVideo;
        int iHashCode34 = (iHashCode33 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        LinkedHashMap<String, RefSource> linkedHashMap = this.refSourceMap;
        int iHashCode35 = (iHashCode34 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        LinkedHashMap<String, QuoteBlock> linkedHashMap2 = this.quoteBlockMap;
        int iHashCode36 = (iHashCode35 + (linkedHashMap2 == null ? 0 : linkedHashMap2.hashCode())) * 31;
        String str11 = this.buttonText;
        int iHashCode37 = (iHashCode36 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list15 = this.takoSummaries;
        int iHashCode38 = (iHashCode37 + (list15 == null ? 0 : list15.hashCode())) * 31;
        ShortAnswerFormat shortAnswerFormat = this.shortAnswerFormat;
        int iHashCode39 = (iHashCode38 + (shortAnswerFormat == null ? 0 : shortAnswerFormat.hashCode())) * 31;
        ShortAnswerFormat shortAnswerFormat2 = this.landingPageShortAnswerFormat;
        int iHashCode40 = (iHashCode39 + (shortAnswerFormat2 == null ? 0 : shortAnswerFormat2.hashCode())) * 31;
        Map<String, Object> map = this.nimbleExtraData;
        return iHashCode40 + (map != null ? map.hashCode() : 0);
    }

    public Boolean isComplete() {
        return null;
    }

    public String toString() {
        return "MultiVideo(subVideos=" + this.subVideos + ", subTitle=" + this.subTitle + ", layoutType=" + this.layoutType + ", displayLine=" + this.displayLine + ", relatedWordList=" + this.relatedWordList + ", type=" + this.type + ", tagList=" + this.tagList + ", uniqueId=" + this.uniqueId + ", sourceFromEntities=" + this.sourceFromEntities + ", tagPositions=" + this.tagPositions + ", favorAndFeedback=" + this.favorAndFeedback + ", refSourceList=" + this.refSourceList + ", isTako=" + this.isTako + ", takoSugList=" + this.takoSugList + ", takoLongSugList=" + this.takoLongSugList + ", layoutName=" + this.layoutName + ", detailLayoutName=" + this.detailLayoutName + ", multiVideoSummaries=" + this.multiVideoSummaries + ", displayLines=" + this.displayLines + ", subImages=" + this.subImages + ", texts=" + this.texts + ", snippets=" + this.snippets + ", dynamicPatch=" + this.dynamicPatch + ", blockId=" + this.blockId + ", pointToOtherBlockIdList=" + this.pointToOtherBlockIdList + ", foldId=" + this.foldId + ", foldFromId=" + this.foldFromId + ", foldTitle=" + this.foldTitle + ", defaultOpen=" + this.defaultOpen + ", pointToOtherTextBlockIdList=" + this.pointToOtherTextBlockIdList + ", mixedText=" + this.mixedText + ", bizUniqueKey=" + this.bizUniqueKey + ", flattenAwemeListSize=" + this.flattenAwemeListSize + ", surroundedVideoIndex=" + this.surroundedVideoIndex + ", surroundedVideoId=" + this.surroundedVideoId + ", surroundedVideo=" + this.surroundedVideo + ", refSourceMap=" + this.refSourceMap + ", quoteBlockMap=" + this.quoteBlockMap + ", buttonText=" + this.buttonText + ", takoSummaries=" + this.takoSummaries + ", shortAnswerFormat=" + this.shortAnswerFormat + ", landingPageShortAnswerFormat=" + this.landingPageShortAnswerFormat + ", nimbleExtraData=" + this.nimbleExtraData + ')';
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getFlattenAwemeListSize() {
        return Integer.valueOf(this.flattenAwemeListSize);
    }

    public final String getMultiVideoSummary() {
        String str;
        List<String> list = this.multiVideoSummaries;
        return (list == null || (str = (String) C13LP.LJJJLL(list)) == null || str.length() <= 0) ? this.multiVideoSummary : str;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getSurroundedVideoIndex() {
        return Integer.valueOf(this.surroundedVideoIndex);
    }

    @Override // X.InterfaceC682670Qq9
    public String getTakoSummary() {
        String str;
        List<String> list = this.takoSummaries;
        return (list == null || (str = (String) C13LP.LJJJLL(list)) == null || str.length() <= 0) ? getMultiVideoSummary() : str;
    }

    @Override // X.InterfaceC682670Qq9
    public String getProcessedSummary() {
        return getMultiVideoSummary();
    }

    @Override // X.InterfaceC682670Qq9
    public String getSnippet() {
        String str;
        List<String> snippets = getSnippets();
        return (snippets == null || (str = (String) C13LP.LJJJLL(snippets)) == null || str.length() <= 0) ? this.snippet : str;
    }

    @Override // X.InterfaceC682670Qq9
    public String getBizUniqueKey() {
        return this.bizUniqueKey;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getBlockId() {
        return this.blockId;
    }

    @Override // X.InterfaceC682670Qq9
    public String getButtonText() {
        return this.buttonText;
    }

    @Override // X.InterfaceC682670Qq9
    public Boolean getDefaultOpen() {
        return this.defaultOpen;
    }

    @Override // X.InterfaceC682670Qq9
    public String getDetailLayoutName() {
        return this.detailLayoutName;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getDisplayLine() {
        return this.displayLine;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Double> getDisplayLines() {
        return this.displayLines;
    }

    @Override // X.InterfaceC682670Qq9
    public DynamicPatch getDynamicPatch() {
        return this.dynamicPatch;
    }

    @Override // X.InterfaceC682670Qq9
    public FavorAndFeedback getFavorAndFeedback() {
        return this.favorAndFeedback;
    }

    @Override // X.InterfaceC682670Qq9
    public String getFoldFromId() {
        return this.foldFromId;
    }

    @Override // X.InterfaceC682670Qq9
    public String getFoldId() {
        return this.foldId;
    }

    @Override // X.InterfaceC682670Qq9
    public String getFoldTitle() {
        return this.foldTitle;
    }

    @Override // X.InterfaceC682670Qq9
    public Map<C1172204iG, Map<String, Object>> getFusionBlockMap() {
        return this.LL;
    }

    @Override // X.InterfaceC682670Qq9
    public ShortAnswerFormat getLandingPageShortAnswerFormat() {
        return this.landingPageShortAnswerFormat;
    }

    @Override // X.InterfaceC682670Qq9
    public String getLayoutName() {
        return this.layoutName;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getLayoutType() {
        return this.layoutType;
    }

    @Override // X.InterfaceC682670Qq9
    public String getMixedText() {
        return this.mixedText;
    }

    public final Map<C1172204iG, Map<String, Object>> getMultiVideoMap() {
        return this.LLILLJJLI;
    }

    public final List<String> getMultiVideoSummaries() {
        return this.multiVideoSummaries;
    }

    public Map<String, Object> getNimbleExtraData() {
        return this.nimbleExtraData;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Double> getPointToOtherBlockIdList() {
        return this.pointToOtherBlockIdList;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Double> getPointToOtherTextBlockIdList() {
        return this.pointToOtherTextBlockIdList;
    }

    public final List<RefSource> getRefSourceList() {
        return this.refSourceList;
    }

    @Override // X.InterfaceC682670Qq9
    public LinkedHashMap<String, RefSource> getRefSourceMap() {
        return this.refSourceMap;
    }

    @Override // X.InterfaceC682670Qq9
    public List<RelatedWord> getRelatedWordList() {
        return this.relatedWordList;
    }

    @Override // X.InterfaceC682670Qq9
    public ShortAnswerFormat getShortAnswerFormat() {
        return this.shortAnswerFormat;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getSnippets() {
        return this.snippets;
    }

    public final SourceFromEntities getSourceFromEntities() {
        return this.sourceFromEntities;
    }

    @Override // X.InterfaceC682670Qq9
    public List<ImageData> getSubImages() {
        return this.subImages;
    }

    @Override // X.InterfaceC682670Qq9
    public String getSubTitle() {
        return this.subTitle;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Aweme> getSubVideos() {
        return this.subVideos;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getSummaries() {
        return this.multiVideoSummaries;
    }

    @Override // X.InterfaceC682670Qq9
    public SourceFromEntities getSummarySource() {
        return this.sourceFromEntities;
    }

    @Override // X.InterfaceC682670Qq9
    public Aweme getSurroundedVideo() {
        return this.surroundedVideo;
    }

    public final String getSurroundedVideoId() {
        return this.surroundedVideoId;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getTagList() {
        return this.tagList;
    }

    public final List<TagPosition> getTagPositions() {
        return this.tagPositions;
    }

    public List<String> getTakoLongSugList() {
        return this.takoLongSugList;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getTakoSugList() {
        return this.takoSugList;
    }

    public final List<String> getTakoSummaries() {
        return this.takoSummaries;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getTexts() {
        return this.texts;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getType() {
        return this.type;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public Boolean isTako() {
        return this.isTako;
    }

    @Override // X.InterfaceC682670Qq9
    public LinkedHashMap<String, QuoteBlock> getQuoteBlockMap() {
        return this.quoteBlockMap;
    }

    public final String defaultContent(boolean z) {
        if (z) {
            return getMultiVideoSummary();
        }
        String snippet = getSnippet();
        if (snippet != null && snippet.length() > 0) {
            return snippet;
        }
        return getMultiVideoSummary();
    }

    @Override // X.InterfaceC682670Qq9
    public ShortAnswerFormat getShortAnswerFormatByPage(boolean z) {
        if (!C0BQI.LIZ()) {
            return null;
        }
        if (z) {
            return getLandingPageShortAnswerFormat();
        }
        return getShortAnswerFormat();
    }

    @Override // X.InterfaceC682670Qq9
    public void setFusionBlockMap(Map<C1172204iG, Map<String, Object>> map) {
        this.LL = map;
    }

    public final void setMultiVideoMap(Map<C1172204iG, Map<String, Object>> map) {
        this.LLILLJJLI = map;
    }

    public void setSubVideos(List<? extends Aweme> list) {
        this.subVideos = list;
    }

    @Override // X.InterfaceC682670Qq9
    public MultiVideo copyFromConcat(List<? extends Aweme> list, List<ImageData> list2, String str, Integer num, Aweme aweme) {
        int iIntValue;
        Aweme surroundedVideo;
        String aid;
        Aweme surroundedVideo2 = aweme;
        String mixedText = str;
        List<ImageData> subImages = list2;
        List<? extends Aweme> subVideos = list;
        if (subVideos == null) {
            subVideos = getSubVideos();
        }
        if (subImages == null) {
            subImages = getSubImages();
        }
        if (mixedText == null) {
            mixedText = getMixedText();
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = getFlattenAwemeListSize().intValue();
        }
        if (surroundedVideo2 == null) {
            surroundedVideo2 = getSurroundedVideo();
            surroundedVideo = getSurroundedVideo();
            if (surroundedVideo == null) {
                aid = null;
            }
            return copy(subVideos, this.subTitle, this.layoutType, this.displayLine, this.relatedWordList, this.type, this.tagList, this.uniqueId, this.sourceFromEntities, this.tagPositions, this.favorAndFeedback, this.refSourceList, this.isTako, this.takoSugList, this.takoLongSugList, this.layoutName, this.detailLayoutName, this.multiVideoSummaries, this.displayLines, subImages, this.texts, this.snippets, this.dynamicPatch, this.blockId, this.pointToOtherBlockIdList, this.foldId, this.foldFromId, this.foldTitle, this.defaultOpen, this.pointToOtherTextBlockIdList, mixedText, this.bizUniqueKey, iIntValue, this.surroundedVideoIndex, aid, surroundedVideo2, this.refSourceMap, this.quoteBlockMap, this.buttonText, this.takoSummaries, this.shortAnswerFormat, this.landingPageShortAnswerFormat, this.nimbleExtraData);
        }
        surroundedVideo = surroundedVideo2;
        aid = surroundedVideo.getAid();
        return copy(subVideos, this.subTitle, this.layoutType, this.displayLine, this.relatedWordList, this.type, this.tagList, this.uniqueId, this.sourceFromEntities, this.tagPositions, this.favorAndFeedback, this.refSourceList, this.isTako, this.takoSugList, this.takoLongSugList, this.layoutName, this.detailLayoutName, this.multiVideoSummaries, this.displayLines, subImages, this.texts, this.snippets, this.dynamicPatch, this.blockId, this.pointToOtherBlockIdList, this.foldId, this.foldFromId, this.foldTitle, this.defaultOpen, this.pointToOtherTextBlockIdList, mixedText, this.bizUniqueKey, iIntValue, this.surroundedVideoIndex, aid, surroundedVideo2, this.refSourceMap, this.quoteBlockMap, this.buttonText, this.takoSummaries, this.shortAnswerFormat, this.landingPageShortAnswerFormat, this.nimbleExtraData);
    }

    @Override // X.InterfaceC682670Qq9
    public /* bridge */ /* synthetic */ InterfaceC682670Qq9 copyFromConcat(List list, List list2, String str, Integer num, Aweme aweme) {
        return copyFromConcat((List<? extends Aweme>) list, (List<ImageData>) list2, str, num, aweme);
    }

    public MultiVideo(List<? extends Aweme> list, String str, Integer num, Integer num2, List<RelatedWord> list2, Integer num3, List<String> list3, String str2, SourceFromEntities sourceFromEntities, List<TagPosition> list4, FavorAndFeedback favorAndFeedback, List<RefSource> list5, Boolean bool, List<String> list6, List<String> list7, String str3, String str4, List<String> list8, List<Double> list9, List<ImageData> list10, List<String> list11, List<String> list12, DynamicPatch dynamicPatch, Integer num4, List<Double> list13, String str5, String str6, String str7, Boolean bool2, List<Double> list14, String str8, String str9, int i, int i2, String str10, Aweme aweme, LinkedHashMap<String, RefSource> linkedHashMap, LinkedHashMap<String, QuoteBlock> linkedHashMap2, String str11, List<String> list15, ShortAnswerFormat shortAnswerFormat, ShortAnswerFormat shortAnswerFormat2, Map<String, ? extends Object> map) {
        this.subVideos = list;
        this.subTitle = str;
        this.layoutType = num;
        this.displayLine = num2;
        this.relatedWordList = list2;
        this.type = num3;
        this.tagList = list3;
        this.uniqueId = str2;
        this.sourceFromEntities = sourceFromEntities;
        this.tagPositions = list4;
        this.favorAndFeedback = favorAndFeedback;
        this.refSourceList = list5;
        this.isTako = bool;
        this.takoSugList = list6;
        this.takoLongSugList = list7;
        this.layoutName = str3;
        this.detailLayoutName = str4;
        this.multiVideoSummaries = list8;
        this.displayLines = list9;
        this.subImages = list10;
        this.texts = list11;
        this.snippets = list12;
        this.dynamicPatch = dynamicPatch;
        this.blockId = num4;
        this.pointToOtherBlockIdList = list13;
        this.foldId = str5;
        this.foldFromId = str6;
        this.foldTitle = str7;
        this.defaultOpen = bool2;
        this.pointToOtherTextBlockIdList = list14;
        this.mixedText = str8;
        this.bizUniqueKey = str9;
        this.flattenAwemeListSize = i;
        this.surroundedVideoIndex = i2;
        this.surroundedVideoId = str10;
        this.surroundedVideo = aweme;
        this.refSourceMap = linkedHashMap;
        this.quoteBlockMap = linkedHashMap2;
        this.buttonText = str11;
        this.takoSummaries = list15;
        this.shortAnswerFormat = shortAnswerFormat;
        this.landingPageShortAnswerFormat = shortAnswerFormat2;
        this.nimbleExtraData = map;
    }
}
