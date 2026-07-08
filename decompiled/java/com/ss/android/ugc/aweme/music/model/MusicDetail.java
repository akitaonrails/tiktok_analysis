package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13LQ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetail extends BaseResponse {
    public static final Companion Companion = new Companion();

    @C09CT("ai_recommend_show_type")
    public final int aiRecommendShowType;

    @C09CT("ai_recommend_video")
    public final List<Aweme> aiRecommendVideoList;

    @C09CT("billboard_type")
    public int billboardType;

    @C09CT("easter_egg_resource")
    public final EasterEggResourceStruct easterEggResourceStruct;

    @C09CT("edition_uid")
    public int editionUid;

    @C09CT("highlight_music")
    public final Music highlightMusic;

    @C09CT("bind_commerce_challenge")
    public final boolean isBindCommerceChallenge;
    public boolean isFromCache;
    public boolean isPrevious;
    public boolean isUsedFullSong;
    public UrlModel localCoverUrl;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("matched_pgc_music_info")
    public final Music matchedPgcMusicInfo;

    @C09CT("music_info")
    public Music music;

    @C09CT("music_chart_rank")
    public MusicChartRankStruct musicChartRankStruct;

    @C09CT("music_resource_bit")
    public final MusicResourceBitStruct musicResourceBitStruct;

    @C09CT("music_scene")
    public final int[] musicScene;

    @C09CT("people_also_like_info")
    public final PeopleAlsoLikeInfoStruct peopleAlsoLikeInfoStruct;

    @C09CT("ai_recommend_music")
    public final List<Music> recommendMusicList;

    @C09CT("related_banners")
    public final List<MDPRelatedBanner> relatedBanners;

    @C09CT("rec_list")
    public List<? extends RelatedChallengeMusic> relatedChallengeMusicList;

    @C09CT("should_show_recommend_music")
    public final boolean showRecommendMusic;

    @C09CT("similar_music_ids")
    public final List<String> similarMusicIds;

    @C09CT("spotlight_music")
    public final Music spotlightMusic;

    @C09CT("suggestion_id")
    public Long suggestionId;

    @C09CT("top_bodydance_avatars")
    public List<? extends UrlModel> topBodydanceAvatars;

    public static final class Companion {
    }

    public final boolean allowOfflineMusicToDetailPage() {
        Music music = this.music;
        if (music != null) {
            return music.allowOfflineMusicToDetailPage();
        }
        return false;
    }

    public final Music getHighlightMusic() {
        Music music;
        Music music2 = this.music;
        if (music2 != null && (music = this.highlightMusic) != null) {
            music.setHighlightMusicOwnerInfo(music2.getMusicOwnerInfos());
        }
        return this.highlightMusic;
    }

    public final boolean hasMusicBulletin() {
        String desc;
        String schema;
        MusicResourceBitStruct musicResourceBitStruct = this.musicResourceBitStruct;
        return musicResourceBitStruct != null && Intrinsics.LJFF(musicResourceBitStruct.getScene(), MusicResourceBitStructScene.BULLETIN.getScene()) && (desc = this.musicResourceBitStruct.getDesc()) != null && desc.length() > 0 && (schema = this.musicResourceBitStruct.getSchema()) != null && schema.length() > 0;
    }

    public final boolean hasMusicCampaign() {
        String scene;
        String desc;
        String schema;
        MusicResourceBitStruct musicResourceBitStruct = this.musicResourceBitStruct;
        return musicResourceBitStruct != null && (scene = musicResourceBitStruct.getScene()) != null && scene.length() > 0 && Intrinsics.LJFF(this.musicResourceBitStruct.getScene(), MusicResourceBitStructScene.CAMPAIGN.getScene()) && (desc = this.musicResourceBitStruct.getDesc()) != null && desc.length() > 0 && (schema = this.musicResourceBitStruct.getSchema()) != null && schema.length() > 0;
    }

    public final boolean hasMusicIPPageBanner() {
        String scene;
        String desc;
        String schema;
        String icon;
        MusicResourceBitStruct musicResourceBitStruct = this.musicResourceBitStruct;
        return musicResourceBitStruct != null && (scene = musicResourceBitStruct.getScene()) != null && scene.length() > 0 && Intrinsics.LJFF(this.musicResourceBitStruct.getScene(), MusicResourceBitStructScene.TV_FILM_IP_PAGE.getScene()) && (desc = this.musicResourceBitStruct.getDesc()) != null && desc.length() > 0 && (schema = this.musicResourceBitStruct.getSchema()) != null && schema.length() > 0 && (icon = this.musicResourceBitStruct.getIcon()) != null && icon.length() > 0;
    }

    public final boolean musicAvailable() {
        Music music = this.music;
        if (music != null) {
            return music.available();
        }
        return false;
    }

    public final int getAiRecommendShowType() {
        return this.aiRecommendShowType;
    }

    public final List<Aweme> getAiRecommendVideoList() {
        return this.aiRecommendVideoList;
    }

    public final int getBillboardType() {
        return this.billboardType;
    }

    public final EasterEggResourceStruct getEasterEggResourceStruct() {
        return this.easterEggResourceStruct;
    }

    public final int getEditionUid() {
        return this.editionUid;
    }

    public final UrlModel getLocalCoverUrl() {
        return this.localCoverUrl;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Music getMatchedPgcMusicInfo() {
        return this.matchedPgcMusicInfo;
    }

    public final MusicChartRankStruct getMusicChartRankStruct() {
        return this.musicChartRankStruct;
    }

    public final MusicResourceBitStruct getMusicResourceBitStruct() {
        return this.musicResourceBitStruct;
    }

    public final int[] getMusicScene() {
        return this.musicScene;
    }

    public final PeopleAlsoLikeInfoStruct getPeopleAlsoLikeInfoStruct() {
        return this.peopleAlsoLikeInfoStruct;
    }

    public final List<Music> getRecommendMusicList() {
        return this.recommendMusicList;
    }

    public final List<MDPRelatedBanner> getRelatedBanners() {
        return this.relatedBanners;
    }

    public final List<RelatedChallengeMusic> getRelatedChallengeMusicList() {
        return this.relatedChallengeMusicList;
    }

    public final boolean getShowRecommendMusic() {
        return this.showRecommendMusic;
    }

    public final List<String> getSimilarMusicIds() {
        return this.similarMusicIds;
    }

    public final Music getSpotlightMusic() {
        return this.spotlightMusic;
    }

    public final Long getSuggestionId() {
        return this.suggestionId;
    }

    public final List<UrlModel> getTopBodydanceAvatars() {
        return this.topBodydanceAvatars;
    }

    public final boolean isBindCommerceChallenge() {
        return this.isBindCommerceChallenge;
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    public final boolean isPrevious() {
        return this.isPrevious;
    }

    public final boolean isUsedFullSong() {
        return this.isUsedFullSong;
    }

    public final boolean hitScene(Integer... numArr) {
        if (this.musicScene == null) {
            return false;
        }
        for (Integer num : numArr) {
            if (num != null) {
                if (C13LQ.LJIILJJIL(num.intValue(), this.musicScene)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void setBillboardType(int i) {
        this.billboardType = i;
    }

    public final void setEditionUid(int i) {
        this.editionUid = i;
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public final void setLocalCoverUrl(UrlModel urlModel) {
        this.localCoverUrl = urlModel;
    }

    public final void setMusicChartRankStruct(MusicChartRankStruct musicChartRankStruct) {
        this.musicChartRankStruct = musicChartRankStruct;
    }

    public final void setPrevious(boolean z) {
        this.isPrevious = z;
    }

    public final void setRelatedChallengeMusicList(List<? extends RelatedChallengeMusic> list) {
        this.relatedChallengeMusicList = list;
    }

    public final void setSuggestionId(Long l) {
        this.suggestionId = l;
    }

    public final void setTopBodydanceAvatars(List<? extends UrlModel> list) {
        this.topBodydanceAvatars = list;
    }

    public final void setUsedFullSong(boolean z) {
        this.isUsedFullSong = z;
    }
}
