package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class StoryHighlightAwemePreview implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("cover_img_url")
    public final UrlModel coverImgUrl;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("is_first_story_of_day")
    public final boolean isFirstStoryOfDay;

    @C09CT("is_sub_only")
    public final boolean isSubOnly;

    public StoryHighlightAwemePreview() {
        this("", null, 0L, false, false);
    }

    public final boolean getHasValidCoverUrl() {
        List<String> urlList;
        UrlModel urlModel = this.coverImgUrl;
        return !(urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty());
    }

    public int hashCode() {
        return this.awemeId.hashCode();
    }

    public final boolean isFirstStoryOfDay() {
        return this.isFirstStoryOfDay;
    }

    public final boolean isSubOnly() {
        return this.isSubOnly;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(StoryHighlightAwemePreview.class, cls)) {
            return false;
        }
        return Intrinsics.LJFF(this.awemeId, ((StoryHighlightAwemePreview) obj).awemeId);
    }

    public StoryHighlightAwemePreview(String str, UrlModel urlModel, long j, boolean z, boolean z2) {
        this.awemeId = str;
        this.coverImgUrl = urlModel;
        this.createTime = j;
        this.isFirstStoryOfDay = z;
        this.isSubOnly = z2;
    }
}
