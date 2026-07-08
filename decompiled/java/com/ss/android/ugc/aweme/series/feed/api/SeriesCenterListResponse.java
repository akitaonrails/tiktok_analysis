package com.ss.android.ugc.aweme.series.feed.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterBannerConfig;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterListResponse extends BaseResponse {

    @C09CT("banner_config")
    public final SeriesCenterBannerConfig bannerConfig;

    @C09CT("collections")
    public final List<ShortDramaOverview> collections;

    @C09CT("current_scene")
    public final SeriesCenterCenterScene currentScene;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("drama_rankings_update_tsp")
    public final Integer dramaRankingsUpdateTsp;

    @C09CT("drama_tab_block_reason")
    public final Integer dramaTabBlockReason;

    @C09CT("drama_tab_block_text")
    public final String dramaTabBlockText;

    @C09CT("feedback_link")
    public final String feedbackLink;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("reload")
    public final Boolean reload;

    @C09CT("safe_collections")
    public final List<ShortDramaOverview> safeCollections;

    @C09CT("scenes")
    public final List<SeriesCenterCenterScene> scenes;

    @C09CT("skylight_model")
    public final SkylightBlocks skylightBlocks;

    public SeriesCenterListResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesCenterListResponse)) {
            return false;
        }
        SeriesCenterListResponse seriesCenterListResponse = (SeriesCenterListResponse) obj;
        return Intrinsics.LJFF(this.cursor, seriesCenterListResponse.cursor) && Intrinsics.LJFF(this.hasMore, seriesCenterListResponse.hasMore) && Intrinsics.LJFF(this.scenes, seriesCenterListResponse.scenes) && Intrinsics.LJFF(this.currentScene, seriesCenterListResponse.currentScene) && Intrinsics.LJFF(this.collections, seriesCenterListResponse.collections) && Intrinsics.LJFF(this.reload, seriesCenterListResponse.reload) && Intrinsics.LJFF(this.bannerConfig, seriesCenterListResponse.bannerConfig) && Intrinsics.LJFF(this.skylightBlocks, seriesCenterListResponse.skylightBlocks) && Intrinsics.LJFF(this.dramaTabBlockReason, seriesCenterListResponse.dramaTabBlockReason) && Intrinsics.LJFF(this.dramaTabBlockText, seriesCenterListResponse.dramaTabBlockText) && Intrinsics.LJFF(this.feedbackLink, seriesCenterListResponse.feedbackLink) && Intrinsics.LJFF(this.safeCollections, seriesCenterListResponse.safeCollections) && Intrinsics.LJFF(this.dramaRankingsUpdateTsp, seriesCenterListResponse.dramaRankingsUpdateTsp);
    }

    public final int hashCode() {
        String str = this.cursor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SeriesCenterCenterScene> list = this.scenes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SeriesCenterCenterScene seriesCenterCenterScene = this.currentScene;
        int iHashCode4 = (iHashCode3 + (seriesCenterCenterScene == null ? 0 : seriesCenterCenterScene.hashCode())) * 31;
        List<ShortDramaOverview> list2 = this.collections;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.reload;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SeriesCenterBannerConfig seriesCenterBannerConfig = this.bannerConfig;
        int iHashCode7 = (iHashCode6 + (seriesCenterBannerConfig == null ? 0 : seriesCenterBannerConfig.hashCode())) * 31;
        SkylightBlocks skylightBlocks = this.skylightBlocks;
        int iHashCode8 = (iHashCode7 + (skylightBlocks == null ? 0 : skylightBlocks.hashCode())) * 31;
        Integer num = this.dramaTabBlockReason;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.dramaTabBlockText;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackLink;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ShortDramaOverview> list3 = this.safeCollections;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.dramaRankingsUpdateTsp;
        return iHashCode12 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SeriesCenterListResponse(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", scenes=" + this.scenes + ", currentScene=" + this.currentScene + ", collections=" + this.collections + ", reload=" + this.reload + ", bannerConfig=" + this.bannerConfig + ", skylightBlocks=" + this.skylightBlocks + ", dramaTabBlockReason=" + this.dramaTabBlockReason + ", dramaTabBlockText=" + this.dramaTabBlockText + ", feedbackLink=" + this.feedbackLink + ", safeCollections=" + this.safeCollections + ", dramaRankingsUpdateTsp=" + this.dramaRankingsUpdateTsp + ')';
    }

    public SeriesCenterListResponse(String str, Boolean bool, List<SeriesCenterCenterScene> list, SeriesCenterCenterScene seriesCenterCenterScene, List<ShortDramaOverview> list2, Boolean bool2, SeriesCenterBannerConfig seriesCenterBannerConfig, SkylightBlocks skylightBlocks, Integer num, String str2, String str3, List<ShortDramaOverview> list3, Integer num2) {
        this.cursor = str;
        this.hasMore = bool;
        this.scenes = list;
        this.currentScene = seriesCenterCenterScene;
        this.collections = list2;
        this.reload = bool2;
        this.bannerConfig = seriesCenterBannerConfig;
        this.skylightBlocks = skylightBlocks;
        this.dramaTabBlockReason = num;
        this.dramaTabBlockText = str2;
        this.feedbackLink = str3;
        this.safeCollections = list3;
        this.dramaRankingsUpdateTsp = num2;
    }

    public SeriesCenterListResponse(String str, Boolean bool, List list, SeriesCenterCenterScene seriesCenterCenterScene, List list2, Boolean bool2, SeriesCenterBannerConfig seriesCenterBannerConfig, SkylightBlocks skylightBlocks, Integer num, String str2, String str3, List list3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : seriesCenterCenterScene, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? Boolean.FALSE : bool2, (i & 64) != 0 ? null : seriesCenterBannerConfig, (i & 128) != 0 ? null : skylightBlocks, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list3, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? num2 : null);
    }
}
