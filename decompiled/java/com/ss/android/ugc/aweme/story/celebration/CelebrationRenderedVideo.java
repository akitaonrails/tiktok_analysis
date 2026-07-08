package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationRenderedVideo implements Serializable {
    public static final int $stable = 8;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("original_item_ids")
    public final List<Long> originalItemIds;

    @C09CT("meta")
    public final CelebrationRenderedVideoMeta renderedVideoMeta;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("video_url")
    public final String videoUrl;

    public CelebrationRenderedVideo() {
        this("", null, null, null, null, null);
    }

    public CelebrationRenderedVideo(String str, String str2, String str3, List<Long> list, String str4, CelebrationRenderedVideoMeta celebrationRenderedVideoMeta) {
        this.videoId = str;
        this.videoUrl = str2;
        this.coverUrl = str3;
        this.originalItemIds = list;
        this.templateId = str4;
        this.renderedVideoMeta = celebrationRenderedVideoMeta;
    }
}
