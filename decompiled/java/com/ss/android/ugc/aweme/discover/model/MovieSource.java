package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class MovieSource implements Serializable {

    @C09CT("album_group_id")
    public String agid;

    @C09CT("album_id")
    public String albumId;

    @C09CT("cid")
    public String cid;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("desc")
    public String desc;

    @C09CT("duration")
    public double duration;

    @C09CT("episode_list")
    public List<EpisodeData> episodesList;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("latest_seqs_count")
    public int latestSeqsCount;

    @C09CT("movie_module")
    public MovieModule movieModule;

    @C09CT("mp_icon")
    public String mpIcon;

    @C09CT("mp_id")
    public int mpId;

    @C09CT("mp_name")
    public String mpName;

    @C09CT("payment_status")
    public int paymentStatus;

    @C09CT("play_word")
    public String playWord;

    @C09CT("lvideo_tag")
    public LongVideoTag posterTag;

    @C09CT("lvideo_tag_light")
    public LongVideoTag posterTagLight;

    @C09CT("poster_tag_type")
    public int posterTagType;

    @C09CT("schema")
    public String schema;

    @C09CT("schema_type")
    public int schemaType;

    @C09CT("current_count")
    public int seqsCount;

    @C09CT("tags")
    public List<String> tags;

    @C09CT("title")
    public String title;

    @C09CT("seqs_count")
    public int totalSeqsCount;

    @C09CT("release_date")
    public long releaseDate = -1;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status = -1;

    public final EpisodeData getFirstEpisodeData() {
        List<EpisodeData> list = this.episodesList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (EpisodeData) ListProtector.get(this.episodesList, 0);
    }

    public String toString() {
        return "MovieSource(albumId=" + this.albumId + ", latestSeqsCount=" + this.latestSeqsCount + ", seqsCount=" + this.seqsCount + ", totalSeqsCount=" + this.totalSeqsCount + ", title=" + this.title + ", desc=" + this.desc + ", cover=" + this.cover + ", duration=" + this.duration + ", mpId=" + this.mpId + ", mpIcon=" + this.mpIcon + ", paymentStatus=" + this.paymentStatus + ", releaseDate=" + this.releaseDate + ", tags=" + this.tags + ", episodesList=" + this.episodesList + ", playWord=" + this.playWord + ", status=" + this.status + ", hasMore=" + this.hasMore + ", mpName=" + this.mpName + ", schema=" + this.schema + ", cid=" + this.cid + ", agid=" + this.agid + ", movieModule=" + this.movieModule + ", schemaType=" + this.schemaType + ", posterTag=$, posterTagType=" + this.posterTagType + ')';
    }

    public final String getAgid() {
        return this.agid;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final List<EpisodeData> getEpisodesList() {
        return this.episodesList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getLatestSeqsCount() {
        return this.latestSeqsCount;
    }

    public final MovieModule getMovieModule() {
        return this.movieModule;
    }

    public final String getMpIcon() {
        return this.mpIcon;
    }

    public final int getMpId() {
        return this.mpId;
    }

    public final String getMpName() {
        return this.mpName;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPlayWord() {
        return this.playWord;
    }

    public final LongVideoTag getPosterTag() {
        return this.posterTag;
    }

    public final LongVideoTag getPosterTagLight() {
        return this.posterTagLight;
    }

    public final int getPosterTagType() {
        return this.posterTagType;
    }

    public final long getReleaseDate() {
        return this.releaseDate;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final int getSeqsCount() {
        return this.seqsCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalSeqsCount() {
        return this.totalSeqsCount;
    }

    public final void setAgid(String str) {
        this.agid = str;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setEpisodesList(List<EpisodeData> list) {
        this.episodesList = list;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLatestSeqsCount(int i) {
        this.latestSeqsCount = i;
    }

    public final void setMovieModule(MovieModule movieModule) {
        this.movieModule = movieModule;
    }

    public final void setMpIcon(String str) {
        this.mpIcon = str;
    }

    public final void setMpId(int i) {
        this.mpId = i;
    }

    public final void setMpName(String str) {
        this.mpName = str;
    }

    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    public final void setPlayWord(String str) {
        this.playWord = str;
    }

    public final void setPosterTag(LongVideoTag longVideoTag) {
        this.posterTag = longVideoTag;
    }

    public final void setPosterTagLight(LongVideoTag longVideoTag) {
        this.posterTagLight = longVideoTag;
    }

    public final void setPosterTagType(int i) {
        this.posterTagType = i;
    }

    public final void setReleaseDate(long j) {
        this.releaseDate = j;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSchemaType(int i) {
        this.schemaType = i;
    }

    public final void setSeqsCount(int i) {
        this.seqsCount = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTotalSeqsCount(int i) {
        this.totalSeqsCount = i;
    }
}
