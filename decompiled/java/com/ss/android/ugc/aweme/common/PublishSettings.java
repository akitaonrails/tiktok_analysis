package com.ss.android.ugc.aweme.common;

import X.C09CT;
import X.EnumC1416330mxb;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishSettings implements Serializable {

    @C09CT("allow_comment")
    public final boolean allowComment;

    @C09CT("allow_duet")
    public final boolean allowDuet;

    @C09CT("allow_stitch")
    public final boolean allowStitch;

    @C09CT("caption")
    public final String caption;

    @C09CT("cover_image_timestamp")
    public final Double coverImageTimeStamp;

    @C09CT("is_direct_post")
    public final boolean isDirectPost;

    @C09CT("privacy_setting")
    public final EnumC1416330mxb privacySetting;

    @C09CT("title")
    public final String title;

    public final boolean isDirectPost() {
        return this.isDirectPost;
    }

    public PublishSettings(EnumC1416330mxb enumC1416330mxb, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Double d) {
        this.privacySetting = enumC1416330mxb;
        this.isDirectPost = z;
        this.allowDuet = z2;
        this.allowStitch = z3;
        this.allowComment = z4;
        this.caption = str;
        this.title = str2;
        this.coverImageTimeStamp = d;
    }
}
