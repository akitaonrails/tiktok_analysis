package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class VideoTemplateInfoExt {

    @C09CT("aspect_ratio")
    public final String aspectRatio;

    @C09CT("author_info")
    public final TemplateAuthor authorInfo;

    @C09CT("challenge")
    public final List<Long> challenge;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("count")
    public final long count;

    @C09CT("duration")
    public final long duration;

    @C09CT("dynamic_cover_info")
    public final VideoTemplateDynamicCoverInfo dynamicCoverInfo;

    @C09CT("feature_bits")
    public final List<Long> featureBits;

    @C09CT("feature_codes")
    public final List<Long> featureCodes;

    @C09CT("fragment_count")
    public final int fragmentCount;

    @C09CT("has_commercial_music")
    public final boolean hasCommercialMusic;

    @C09CT("hint")
    public final String hint;

    @C09CT("is_business")
    public final boolean isBusiness;

    @C09CT("is_collect")
    public final boolean isCollect;

    @C09CT("lang")
    public final String lang;

    @C09CT("music")
    public final List<Long> music;

    @C09CT("mv_types")
    public final List<String> mvTypes;

    @C09CT("nle_summary")
    public final String nleSummary;

    @C09CT("provider")
    public final String provider;

    @C09CT("recommend_music")
    public final String recommendMusic;

    @C09CT("recommend_music2")
    public final List<Long> recommendMusic2;

    @C09CT("region")
    public final String region;

    @C09CT("related_words")
    public final List<String> relatedWords;

    @C09CT("requirements")
    public final List<String> requirements;

    @C09CT("sdk_extra")
    public final String sdkExtra;

    @C09CT("share_id")
    public final String shareId;

    @C09CT("source_from")
    public final String sourceFrom;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;

    @C09CT("video_info")
    public final VideoTemplateVideoInfo videoInfo;

    public VideoTemplateInfoExt() {
        this(0L, "", "", "", "", "", false, null, null, null, false, null, null, "", null, "", null, 0L, false, "", "", 0, null, null, null, null, null, null, null);
    }

    public VideoTemplateInfoExt(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, VideoTemplateVideoInfo videoTemplateVideoInfo, VideoTemplateDynamicCoverInfo videoTemplateDynamicCoverInfo, boolean z2, List<Long> list, List<Long> list2, String str7, List<String> list3, String str8, TemplateAuthor templateAuthor, long j2, boolean z3, String str9, String str10, int i, List<Long> list4, List<String> list5, List<Long> list6, List<Long> list7, List<String> list8, List<String> list9, String str11) {
        this.duration = j;
        this.provider = str;
        this.aspectRatio = str2;
        this.nleSummary = str3;
        this.lang = str4;
        this.region = str5;
        this.hasCommercialMusic = z;
        this.recommendMusic = str6;
        this.videoInfo = videoTemplateVideoInfo;
        this.dynamicCoverInfo = videoTemplateDynamicCoverInfo;
        this.isBusiness = z2;
        this.challenge = list;
        this.recommendMusic2 = list2;
        this.hint = str7;
        this.relatedWords = list3;
        this.sdkExtra = str8;
        this.authorInfo = templateAuthor;
        this.count = j2;
        this.isCollect = z3;
        this.shareId = str9;
        this.clientKey = str10;
        this.fragmentCount = i;
        this.music = list4;
        this.requirements = list5;
        this.featureBits = list6;
        this.featureCodes = list7;
        this.mvTypes = list8;
        this.urlPrefix = list9;
        this.sourceFrom = str11;
    }
}
