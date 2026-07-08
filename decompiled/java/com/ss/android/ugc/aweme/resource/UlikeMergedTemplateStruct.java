package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class UlikeMergedTemplateStruct {

    @C09CT("jtk_template_info")
    public final TemplateResponseItem cutsameInfo;

    @C09CT("description")
    public final String description;

    @C09CT("is_commercial_music")
    public final boolean isCommerceMusic;

    @C09CT("media_id")
    public final String media_id;

    @C09CT("mv_template_info")
    public final MvEffect mvData;

    @C09CT("region")
    public final String region;

    @C09CT("template_type")
    public final int templateType;

    @C09CT("title")
    public final String title;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;

    @C09CT("aspect_ratio")
    public final String videoRatio;

    public UlikeMergedTemplateStruct(String str, String str2, String str3, int i, TemplateResponseItem templateResponseItem, List<String> list, boolean z, String str4, String str5, MvEffect mvEffect) {
        this.media_id = str;
        this.title = str2;
        this.description = str3;
        this.templateType = i;
        this.cutsameInfo = templateResponseItem;
        this.urlPrefix = list;
        this.isCommerceMusic = z;
        this.region = str4;
        this.videoRatio = str5;
        this.mvData = mvEffect;
    }
}
