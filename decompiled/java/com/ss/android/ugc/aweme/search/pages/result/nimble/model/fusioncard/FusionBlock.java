package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

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
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.FavorAndFeedback;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.QuoteBlock;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FusionBlock implements Serializable, InterfaceC682670Qq9 {
    public final transient AnonymousClass0529 LL;
    public final transient EnumC488230JCr LLILLJJLI;
    public transient List<? extends Aweme> LLILLL;
    public Map<C1172204iG, Map<String, Object>> LLILZ;

    @C09CT("aigc_meta")
    public final AIGCMeta aigcMeta;

    @C09CT("biz_unique_key")
    public final String bizUniqueKey;

    @C09CT("block_id")
    public final Integer blockId;

    @C09CT("bottom_sources")
    public final BottomQuoteSources bottomSources;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("chunk_index")
    public final Integer chunkIndex;

    @C09CT("default_open")
    public final Boolean defaultOpen;

    @C09CT("display_lines")
    public final List<Double> displayLines;

    @C09CT("dynamic_patch")
    public final DynamicPatch dynamicPatch;

    @C09CT("favor_and_feedback")
    public final FavorAndFeedback favorAndFeedback;

    @C09CT("flatten_aweme_list_size")
    public Integer flattenAwemeListSize;

    @C09CT("fold_from_id")
    public final String foldFromId;

    @C09CT("fold_id")
    public final String foldId;

    @C09CT("fold_title")
    public final String foldTitle;

    @C09CT("is_complete")
    public final Boolean isComplete;

    @C09CT("layout_name")
    public final String layoutName;

    @C09CT("layout_type")
    public final Integer layoutType;

    @C09CT("nimble_extra_data")
    public final Map<String, Object> nimbleExtraData;

    @C09CT("out_display_video_ids")
    public final List<Object> outDisplayVideoIds;

    @C09CT("placeholder_type")
    public final Integer placeholderType;

    @C09CT("point_to_other_block_id_list")
    public final List<Double> pointToOtherBlockIdList;

    @C09CT("point_to_other_text_block_id_list")
    public final List<Double> pointToOtherTextBlockIdList;

    @C09CT("quote_block_map")
    public final LinkedHashMap<String, QuoteBlock> quoteBlockMap;

    @C09CT("ref_source_map")
    public final LinkedHashMap<String, RefSource> refSourceMap;

    @C09CT("related_word_list")
    public final List<RelatedWord> relatedWordList;

    @C09CT("short_answer_data")
    public final ShortAnswerData shortAnswerData;

    @C09CT("streaming_position")
    public final Integer streamingPosition;

    @C09CT("sub_images")
    public final List<ImageData> subImages;

    @C09CT("summaries")
    public final List<String> summaries;

    @C09CT("summary")
    public final String summary;

    @C09CT("summary_source")
    public final SourceFromEntities summarySource;

    @C09CT("surrounded_video")
    public Aweme surroundedVideo;

    @C09CT("surrounded_video_id")
    public final String surroundedVideoId;

    @C09CT("texts")
    public final List<String> texts;

    @C09CT("type")
    public final Integer type;

    public FusionBlock() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final FusionBlock copy(Integer num, List<String> list, String str, List<? extends Object> list2, SourceFromEntities sourceFromEntities, List<RelatedWord> list3, Integer num2, List<Double> list4, DynamicPatch dynamicPatch, List<ImageData> list5, List<String> list6, String str2, List<Double> list7, Integer num3, String str3, String str4, Boolean bool, List<Double> list8, String str5, FavorAndFeedback favorAndFeedback, String str6, LinkedHashMap<String, RefSource> linkedHashMap, LinkedHashMap<String, QuoteBlock> linkedHashMap2, BottomQuoteSources bottomQuoteSources, String str7, String str8, Integer num4, Boolean bool2, Integer num5, Integer num6, ShortAnswerData shortAnswerData, Map<String, ? extends Object> map, AIGCMeta aIGCMeta, AnonymousClass0529 anonymousClass0529, EnumC488230JCr enumC488230JCr) {
        return new FusionBlock(num, list, str, list2, sourceFromEntities, list3, num2, list4, dynamicPatch, list5, list6, str2, list7, num3, str3, str4, bool, list8, str5, favorAndFeedback, str6, linkedHashMap, linkedHashMap2, bottomQuoteSources, str7, str8, num4, bool2, num5, num6, shortAnswerData, map, aIGCMeta, anonymousClass0529, enumC488230JCr);
    }

    @Override // X.InterfaceC682670Qq9
    public InterfaceC682670Qq9 copyFromConcat(List<? extends Aweme> list, List<ImageData> list2, String str, Integer num, Aweme aweme) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FusionBlock)) {
            return false;
        }
        FusionBlock fusionBlock = (FusionBlock) obj;
        return Intrinsics.LJFF(this.type, fusionBlock.type) && Intrinsics.LJFF(this.summaries, fusionBlock.summaries) && Intrinsics.LJFF(this.summary, fusionBlock.summary) && Intrinsics.LJFF(this.outDisplayVideoIds, fusionBlock.outDisplayVideoIds) && Intrinsics.LJFF(this.summarySource, fusionBlock.summarySource) && Intrinsics.LJFF(this.relatedWordList, fusionBlock.relatedWordList) && Intrinsics.LJFF(this.layoutType, fusionBlock.layoutType) && Intrinsics.LJFF(this.displayLines, fusionBlock.displayLines) && Intrinsics.LJFF(this.dynamicPatch, fusionBlock.dynamicPatch) && Intrinsics.LJFF(this.subImages, fusionBlock.subImages) && Intrinsics.LJFF(this.texts, fusionBlock.texts) && Intrinsics.LJFF(this.bizUniqueKey, fusionBlock.bizUniqueKey) && Intrinsics.LJFF(this.pointToOtherBlockIdList, fusionBlock.pointToOtherBlockIdList) && Intrinsics.LJFF(this.blockId, fusionBlock.blockId) && Intrinsics.LJFF(this.foldTitle, fusionBlock.foldTitle) && Intrinsics.LJFF(this.foldId, fusionBlock.foldId) && Intrinsics.LJFF(this.defaultOpen, fusionBlock.defaultOpen) && Intrinsics.LJFF(this.pointToOtherTextBlockIdList, fusionBlock.pointToOtherTextBlockIdList) && Intrinsics.LJFF(this.foldFromId, fusionBlock.foldFromId) && Intrinsics.LJFF(this.favorAndFeedback, fusionBlock.favorAndFeedback) && Intrinsics.LJFF(this.surroundedVideoId, fusionBlock.surroundedVideoId) && Intrinsics.LJFF(this.refSourceMap, fusionBlock.refSourceMap) && Intrinsics.LJFF(this.quoteBlockMap, fusionBlock.quoteBlockMap) && Intrinsics.LJFF(this.bottomSources, fusionBlock.bottomSources) && Intrinsics.LJFF(this.buttonText, fusionBlock.buttonText) && Intrinsics.LJFF(this.layoutName, fusionBlock.layoutName) && Intrinsics.LJFF(this.streamingPosition, fusionBlock.streamingPosition) && Intrinsics.LJFF(this.isComplete, fusionBlock.isComplete) && Intrinsics.LJFF(this.chunkIndex, fusionBlock.chunkIndex) && Intrinsics.LJFF(this.placeholderType, fusionBlock.placeholderType) && Intrinsics.LJFF(this.shortAnswerData, fusionBlock.shortAnswerData) && Intrinsics.LJFF(this.nimbleExtraData, fusionBlock.nimbleExtraData) && Intrinsics.LJFF(this.aigcMeta, fusionBlock.aigcMeta) && Intrinsics.LJFF(this.LL, fusionBlock.LL) && this.LLILLJJLI == fusionBlock.LLILLJJLI;
    }

    @Override // X.InterfaceC682670Qq9
    public String getSnippet() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getSnippets() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public String getSubTitle() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getSurroundedVideoIndex() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getTagList() {
        return null;
    }

    public List<String> getTakoLongSugList() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getTakoSugList() {
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public String getTakoSummary() {
        return null;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.summaries;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.summary;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Object> list2 = this.outDisplayVideoIds;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SourceFromEntities sourceFromEntities = this.summarySource;
        int iHashCode5 = (iHashCode4 + (sourceFromEntities == null ? 0 : sourceFromEntities.hashCode())) * 31;
        List<RelatedWord> list3 = this.relatedWordList;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.layoutType;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Double> list4 = this.displayLines;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        DynamicPatch dynamicPatch = this.dynamicPatch;
        int iHashCode9 = (iHashCode8 + (dynamicPatch == null ? 0 : dynamicPatch.hashCode())) * 31;
        List<ImageData> list5 = this.subImages;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.texts;
        int iHashCode11 = (iHashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str2 = this.bizUniqueKey;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Double> list7 = this.pointToOtherBlockIdList;
        int iHashCode13 = (iHashCode12 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num3 = this.blockId;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.foldTitle;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.foldId;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.defaultOpen;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Double> list8 = this.pointToOtherTextBlockIdList;
        int iHashCode18 = (iHashCode17 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str5 = this.foldFromId;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FavorAndFeedback favorAndFeedback = this.favorAndFeedback;
        int iHashCode20 = (iHashCode19 + (favorAndFeedback == null ? 0 : favorAndFeedback.hashCode())) * 31;
        String str6 = this.surroundedVideoId;
        int iHashCode21 = (iHashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LinkedHashMap<String, RefSource> linkedHashMap = this.refSourceMap;
        int iHashCode22 = (iHashCode21 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        LinkedHashMap<String, QuoteBlock> linkedHashMap2 = this.quoteBlockMap;
        int iHashCode23 = (iHashCode22 + (linkedHashMap2 == null ? 0 : linkedHashMap2.hashCode())) * 31;
        BottomQuoteSources bottomQuoteSources = this.bottomSources;
        int iHashCode24 = (iHashCode23 + (bottomQuoteSources == null ? 0 : bottomQuoteSources.hashCode())) * 31;
        String str7 = this.buttonText;
        int iHashCode25 = (iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.layoutName;
        int iHashCode26 = (iHashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.streamingPosition;
        int iHashCode27 = (iHashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.isComplete;
        int iHashCode28 = (iHashCode27 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.chunkIndex;
        int iHashCode29 = (iHashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.placeholderType;
        int iHashCode30 = (iHashCode29 + (num6 == null ? 0 : num6.hashCode())) * 31;
        ShortAnswerData shortAnswerData = this.shortAnswerData;
        int iHashCode31 = (iHashCode30 + (shortAnswerData == null ? 0 : shortAnswerData.hashCode())) * 31;
        Map<String, Object> map = this.nimbleExtraData;
        int iHashCode32 = (iHashCode31 + (map == null ? 0 : map.hashCode())) * 31;
        AIGCMeta aIGCMeta = this.aigcMeta;
        int iHashCode33 = (iHashCode32 + (aIGCMeta == null ? 0 : aIGCMeta.hashCode())) * 31;
        AnonymousClass0529 anonymousClass0529 = this.LL;
        int iHashCode34 = (iHashCode33 + (anonymousClass0529 == null ? 0 : anonymousClass0529.hashCode())) * 31;
        EnumC488230JCr enumC488230JCr = this.LLILLJJLI;
        return iHashCode34 + (enumC488230JCr != null ? enumC488230JCr.hashCode() : 0);
    }

    public Boolean isTako() {
        return null;
    }

    public String toString() {
        return "FusionBlock(type=" + this.type + ", summaries=" + this.summaries + ", summary=" + this.summary + ", outDisplayVideoIds=" + this.outDisplayVideoIds + ", summarySource=" + this.summarySource + ", relatedWordList=" + this.relatedWordList + ", layoutType=" + this.layoutType + ", displayLines=" + this.displayLines + ", dynamicPatch=" + this.dynamicPatch + ", subImages=" + this.subImages + ", texts=" + this.texts + ", bizUniqueKey=" + this.bizUniqueKey + ", pointToOtherBlockIdList=" + this.pointToOtherBlockIdList + ", blockId=" + this.blockId + ", foldTitle=" + this.foldTitle + ", foldId=" + this.foldId + ", defaultOpen=" + this.defaultOpen + ", pointToOtherTextBlockIdList=" + this.pointToOtherTextBlockIdList + ", foldFromId=" + this.foldFromId + ", favorAndFeedback=" + this.favorAndFeedback + ", surroundedVideoId=" + this.surroundedVideoId + ", refSourceMap=" + this.refSourceMap + ", quoteBlockMap=" + this.quoteBlockMap + ", bottomSources=" + this.bottomSources + ", buttonText=" + this.buttonText + ", layoutName=" + this.layoutName + ", streamingPosition=" + this.streamingPosition + ", isComplete=" + this.isComplete + ", chunkIndex=" + this.chunkIndex + ", placeholderType=" + this.placeholderType + ", shortAnswerData=" + this.shortAnswerData + ", nimbleExtraData=" + this.nimbleExtraData + ", aigcMeta=" + this.aigcMeta + ", animInfo=" + this.LL + ", requestStatus=" + this.LLILLJJLI + ')';
    }

    @Override // X.InterfaceC682670Qq9
    public ShortAnswerFormat getLandingPageShortAnswerFormat() {
        ShortAnswerData shortAnswerData = this.shortAnswerData;
        if (shortAnswerData != null) {
            return shortAnswerData.shortAnswerFormat;
        }
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public String getProcessedSummary() {
        String str = this.summary;
        if ((str != null && str.length() != 0) || ((!true) && str != null)) {
            return str;
        }
        List<String> summaries = getSummaries();
        if (summaries != null) {
            return (String) C13LP.LJJJLL(summaries);
        }
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public ShortAnswerFormat getShortAnswerFormat() {
        ShortAnswerData shortAnswerData = this.shortAnswerData;
        if (shortAnswerData != null) {
            return shortAnswerData.shortAnswerFormat;
        }
        return null;
    }

    @Override // X.InterfaceC682670Qq9
    public String getDetailLayoutName() {
        return getLayoutName();
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getDisplayLine() {
        Double d;
        List<Double> displayLines = getDisplayLines();
        if (displayLines == null || (d = (Double) C13LP.LJJJLZIJ(0, displayLines)) == null) {
            return null;
        }
        return Integer.valueOf((int) d.doubleValue());
    }

    @Override // X.InterfaceC682670Qq9
    public String getMixedText() {
        return getProcessedSummary();
    }

    @Override // X.InterfaceC682670Qq9
    public Boolean getNeedPlaceHolder() {
        Integer placeholderType;
        Integer placeholderType2 = getPlaceholderType();
        boolean z = true;
        if ((placeholderType2 == null || placeholderType2.intValue() != 2) && ((placeholderType = getPlaceholderType()) == null || placeholderType.intValue() != 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final AIGCMeta getAigcMeta() {
        return this.aigcMeta;
    }

    @Override // X.InterfaceC682670Qq9
    public AnonymousClass0529 getAnimInfo() {
        return this.LL;
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
    public BottomQuoteSources getBottomSources() {
        return this.bottomSources;
    }

    @Override // X.InterfaceC682670Qq9
    public String getButtonText() {
        return this.buttonText;
    }

    public Integer getChunkIndex() {
        return this.chunkIndex;
    }

    @Override // X.InterfaceC682670Qq9
    public Boolean getDefaultOpen() {
        return this.defaultOpen;
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
    public Integer getFlattenAwemeListSize() {
        return this.flattenAwemeListSize;
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
        return this.LLILZ;
    }

    @Override // X.InterfaceC682670Qq9
    public String getLayoutName() {
        return this.layoutName;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getLayoutType() {
        return this.layoutType;
    }

    public Map<String, Object> getNimbleExtraData() {
        return this.nimbleExtraData;
    }

    public final List<Object> getOutDisplayVideoIds() {
        return this.outDisplayVideoIds;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getPlaceholderType() {
        return this.placeholderType;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Double> getPointToOtherBlockIdList() {
        return this.pointToOtherBlockIdList;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Double> getPointToOtherTextBlockIdList() {
        return this.pointToOtherTextBlockIdList;
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
    public EnumC488230JCr getRequestStatus() {
        return this.LLILLJJLI;
    }

    public final ShortAnswerData getShortAnswerData() {
        return this.shortAnswerData;
    }

    public Integer getStreamingPosition() {
        return this.streamingPosition;
    }

    @Override // X.InterfaceC682670Qq9
    public List<ImageData> getSubImages() {
        return this.subImages;
    }

    @Override // X.InterfaceC682670Qq9
    public List<Aweme> getSubVideos() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getSummaries() {
        return this.summaries;
    }

    public final String getSummary() {
        return this.summary;
    }

    @Override // X.InterfaceC682670Qq9
    public SourceFromEntities getSummarySource() {
        return this.summarySource;
    }

    @Override // X.InterfaceC682670Qq9
    public Aweme getSurroundedVideo() {
        return this.surroundedVideo;
    }

    public final String getSurroundedVideoId() {
        return this.surroundedVideoId;
    }

    @Override // X.InterfaceC682670Qq9
    public List<String> getTexts() {
        return this.texts;
    }

    @Override // X.InterfaceC682670Qq9
    public Integer getType() {
        return this.type;
    }

    public Boolean isComplete() {
        return this.isComplete;
    }

    @Override // X.InterfaceC682670Qq9
    public LinkedHashMap<String, QuoteBlock> getQuoteBlockMap() {
        return this.quoteBlockMap;
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

    public void setFlattenAwemeListSize(Integer num) {
        this.flattenAwemeListSize = num;
    }

    @Override // X.InterfaceC682670Qq9
    public void setFusionBlockMap(Map<C1172204iG, Map<String, Object>> map) {
        this.LLILZ = map;
    }

    public void setSubVideos(List<? extends Aweme> list) {
        this.LLILLL = list;
    }

    public void setSurroundedVideo(Aweme aweme) {
        this.surroundedVideo = aweme;
    }

    public FusionBlock(Integer num, List<String> list, String str, List<? extends Object> list2, SourceFromEntities sourceFromEntities, List<RelatedWord> list3, Integer num2, List<Double> list4, DynamicPatch dynamicPatch, List<ImageData> list5, List<String> list6, String str2, List<Double> list7, Integer num3, String str3, String str4, Boolean bool, List<Double> list8, String str5, FavorAndFeedback favorAndFeedback, String str6, LinkedHashMap<String, RefSource> linkedHashMap, LinkedHashMap<String, QuoteBlock> linkedHashMap2, BottomQuoteSources bottomQuoteSources, String str7, String str8, Integer num4, Boolean bool2, Integer num5, Integer num6, ShortAnswerData shortAnswerData, Map<String, ? extends Object> map, AIGCMeta aIGCMeta, AnonymousClass0529 anonymousClass0529, EnumC488230JCr enumC488230JCr) {
        this.type = num;
        this.summaries = list;
        this.summary = str;
        this.outDisplayVideoIds = list2;
        this.summarySource = sourceFromEntities;
        this.relatedWordList = list3;
        this.layoutType = num2;
        this.displayLines = list4;
        this.dynamicPatch = dynamicPatch;
        this.subImages = list5;
        this.texts = list6;
        this.bizUniqueKey = str2;
        this.pointToOtherBlockIdList = list7;
        this.blockId = num3;
        this.foldTitle = str3;
        this.foldId = str4;
        this.defaultOpen = bool;
        this.pointToOtherTextBlockIdList = list8;
        this.foldFromId = str5;
        this.favorAndFeedback = favorAndFeedback;
        this.surroundedVideoId = str6;
        this.refSourceMap = linkedHashMap;
        this.quoteBlockMap = linkedHashMap2;
        this.bottomSources = bottomQuoteSources;
        this.buttonText = str7;
        this.layoutName = str8;
        this.streamingPosition = num4;
        this.isComplete = bool2;
        this.chunkIndex = num5;
        this.placeholderType = num6;
        this.shortAnswerData = shortAnswerData;
        this.nimbleExtraData = map;
        this.aigcMeta = aIGCMeta;
        this.LL = anonymousClass0529;
        this.LLILLJJLI = enumC488230JCr;
    }
}
