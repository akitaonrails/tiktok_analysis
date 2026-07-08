package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoItemSettings implements Serializable {

    @C09CT("allow_ai_remix")
    public Integer aiRemix;

    @C09CT("comment")
    public Integer comment;

    @C09CT("content_reuse_permission")
    public Integer contentReuse;

    @C09CT("duet")
    public Integer duet;

    @C09CT("share_to_story")
    public Integer shareToStory;

    @C09CT("create_sticker")
    public Integer sticker;

    @C09CT("stitch")
    public Integer stitch;

    @C09CT("visibility")
    public Integer visibility;

    public VideoItemSettings() {
        this(null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItemSettings)) {
            return false;
        }
        VideoItemSettings videoItemSettings = (VideoItemSettings) obj;
        return Intrinsics.LJFF(this.duet, videoItemSettings.duet) && Intrinsics.LJFF(this.stitch, videoItemSettings.stitch) && Intrinsics.LJFF(this.comment, videoItemSettings.comment) && Intrinsics.LJFF(this.sticker, videoItemSettings.sticker) && Intrinsics.LJFF(this.shareToStory, videoItemSettings.shareToStory) && Intrinsics.LJFF(this.contentReuse, videoItemSettings.contentReuse) && Intrinsics.LJFF(this.visibility, videoItemSettings.visibility) && Intrinsics.LJFF(this.aiRemix, videoItemSettings.aiRemix);
    }

    public final Map<String, Integer> getSettingMap() {
        return C2097608Jq.LJIIIIZZ(new Pair("duet", this.duet), new Pair("stitch", this.stitch), new Pair("comment", this.comment), new Pair("create_sticker", this.sticker), new Pair("share_to_story", this.shareToStory), new Pair("content_reuse_permission", this.contentReuse), new Pair("visibility", this.visibility), new Pair("allow_ai_remix", this.aiRemix));
    }

    public final void setAiRemix(Integer num) {
        this.aiRemix = num;
    }

    public final void setComment(Integer num) {
        this.comment = num;
    }

    public final void setContentReuse(Integer num) {
        this.contentReuse = num;
    }

    public final void setDuet(Integer num) {
        this.duet = num;
    }

    public final void setShareToStory(Integer num) {
        this.shareToStory = num;
    }

    public final void setSticker(Integer num) {
        this.sticker = num;
    }

    public final void setStitch(Integer num) {
        this.stitch = num;
    }

    public final void setVisibility(Integer num) {
        this.visibility = num;
    }

    public VideoItemSettings(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.duet = num;
        this.stitch = num2;
        this.comment = num3;
        this.sticker = num4;
        this.shareToStory = num5;
        this.contentReuse = num6;
        this.visibility = num7;
        this.aiRemix = num8;
    }
}
