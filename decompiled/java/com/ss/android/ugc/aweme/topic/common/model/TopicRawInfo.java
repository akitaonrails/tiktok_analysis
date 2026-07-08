package com.ss.android.ugc.aweme.topic.common.model;

import X.C09CT;
import X.C814420VxA;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicRawInfo {

    @C09CT("author_name")
    public final String authorName;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT(alternate = {"imdb_rating"}, value = "external_rating")
    public final Double externalRating;

    @C09CT("genres")
    public final List<String> genres;

    @C09CT("has_detail_page")
    public final Boolean hasDetailPage;

    @C09CT("heat_score")
    public final Long heatScore;

    @C09CT(alternate = {FollowStatusChangeMethod.PARAM_UID}, value = "topic_id")
    public final String id;

    @C09CT("ip_detail_page_schema")
    public final String ipDetailPageSchema;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("movie_schema")
    public final String movieSchema;

    @C09CT("rank")
    public final Integer rank;

    @C09CT("title")
    public final String title;

    @C09CT("topic_rating")
    public final Float topicRating;

    @C09CT("topic_type")
    public final Integer type;

    @C09CT("year")
    public final Integer year;

    public TopicRawInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.authorName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.externalRating;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.year;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.topicRating;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.movieSchema;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.hasDetailPage;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.ipDetailPageSchema;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.rank;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.heatScore;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.genres;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }

    public final Double LIZIZ() {
        Float f = this.topicRating;
        if (f == null) {
            return null;
        }
        float fFloatValue = f.floatValue();
        if (Float.isNaN(fFloatValue) || fFloatValue == 0.0f) {
            return null;
        }
        return Double.valueOf(((double) C814420VxA.LIZIZ(f.floatValue() * 10)) / 10.0d);
    }

    public static TopicRawInfo LIZ(TopicRawInfo topicRawInfo, Integer num) {
        String str = topicRawInfo.id;
        String str2 = topicRawInfo.title;
        UrlModel urlModel = topicRawInfo.cover;
        String str3 = topicRawInfo.authorName;
        Double d = topicRawInfo.externalRating;
        Integer num2 = topicRawInfo.year;
        Float f = topicRawInfo.topicRating;
        Boolean bool = topicRawInfo.isCollected;
        String str4 = topicRawInfo.movieSchema;
        Boolean bool2 = topicRawInfo.hasDetailPage;
        String str5 = topicRawInfo.ipDetailPageSchema;
        Integer num3 = topicRawInfo.rank;
        Long l = topicRawInfo.heatScore;
        List<String> list = topicRawInfo.genres;
        topicRawInfo.getClass();
        return new TopicRawInfo(num, str, str2, urlModel, str3, d, num2, f, bool, str4, bool2, str5, num3, l, list);
    }

    public TopicRawInfo(Integer num, String str, String str2, UrlModel urlModel, String str3, Double d, Integer num2, Float f, Boolean bool, String str4, Boolean bool2, String str5, Integer num3, Long l, List<String> list) {
        this.type = num;
        this.id = str;
        this.title = str2;
        this.cover = urlModel;
        this.authorName = str3;
        this.externalRating = d;
        this.year = num2;
        this.topicRating = f;
        this.isCollected = bool;
        this.movieSchema = str4;
        this.hasDetailPage = bool2;
        this.ipDetailPageSchema = str5;
        this.rank = num3;
        this.heatScore = l;
        this.genres = list;
    }
}
