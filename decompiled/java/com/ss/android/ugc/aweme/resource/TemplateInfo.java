package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateInfo {

    @C09CT("app_id")
    public final int appId;

    @C09CT("cover")
    public final TemplateCover cover;

    @C09CT("desc")
    public final String desc;

    @C09CT("extra")
    public final String extra;

    @C09CT("height")
    public final int height;

    @C09CT("md5")
    public final String md5;

    @C09CT("media_id")
    public final long mediaId;

    @C09CT("provider")
    public final long provider;

    @C09CT("region_key")
    public final String regionKey;

    @C09CT("tags")
    public final List<String> tags;

    @C09CT("template_id")
    public final long templateId;

    @C09CT("TemplateUri")
    public final String templateUri;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final int type;

    @C09CT("video_template_ext")
    public final VideoTemplateInfoExt videoTemplateExt;

    @C09CT("width")
    public final int width;

    public TemplateInfo() {
        this(0L, 0, "", 0, 0L, "", "", 0, 0, "", "", null, null, "", null, 0L);
    }

    public TemplateInfo(long j, int i, String str, int i2, long j2, String str2, String str3, int i3, int i4, String str4, String str5, TemplateCover templateCover, List<String> list, String str6, VideoTemplateInfoExt videoTemplateInfoExt, long j3) {
        this.templateId = j;
        this.appId = i;
        this.regionKey = str;
        this.type = i2;
        this.mediaId = j2;
        this.title = str2;
        this.desc = str3;
        this.width = i3;
        this.height = i4;
        this.md5 = str4;
        this.templateUri = str5;
        this.cover = templateCover;
        this.tags = list;
        this.extra = str6;
        this.videoTemplateExt = videoTemplateInfoExt;
        this.provider = j3;
    }
}
