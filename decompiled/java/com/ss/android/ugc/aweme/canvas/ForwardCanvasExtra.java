package com.ss.android.ugc.aweme.canvas;

import X.C09CT;
import X.C1428710nHZ;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardComment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ForwardCanvasExtra implements Serializable {
    public static final C1428710nHZ Companion = new Object() { // from class: X.0nHZ
    };

    @C09CT("forwardStoryCanvasStyle")
    public int canvasStyle;

    @C09CT("forwardAwemeType")
    public final int forwardAwemeType;

    @C09CT("forwardComment")
    public final ForwardComment forwardComment;

    @C09CT("forwardMusic")
    public final ForwardMusic forwardMusic;

    @C09CT("forwardType")
    public final int forwardType;

    @C09CT("isClipped")
    public boolean isClipped;
    public transient boolean isEditorFullscreen;

    @C09CT("isOwnVideo")
    public final boolean isOwnVideo;

    @C09CT("meta")
    public final String mediaMeta;

    @C09CT("openStoryType")
    public final int openStoryType;

    @C09CT("shareToStoryMediaType")
    public int shareToStoryMediaType;

    @C09CT("targetVolumeLoud")
    public final float targetVolumeLoud;

    @C09CT("forwardVideo")
    public final ForwardVideo video;

    @C09CT("video_share_backwards_mention")
    public final MentionStruct videoShareBackwardsMention;

    @C09CT("video_share_info")
    public final VideoShareInfoStruct videoShareInfoStruct;

    public ForwardCanvasExtra() {
        this(-1, 0, null, -1, false, null, null, null, -12.0f, null, null, 8, false, 1);
    }

    public String toString() {
        return "ForwardCanvasExtra(forwardType=" + this.forwardType + ", openStoryType=" + this.openStoryType + ", mediaMeta=" + this.mediaMeta + ", forwardAwemeType=" + this.forwardAwemeType + ", isOwnVideo=" + this.isOwnVideo + ", videoShareInfoStruct=" + this.videoShareInfoStruct + ", videoShareBackwardsMention=" + this.videoShareBackwardsMention + ", forwardMusic=" + this.forwardMusic + ", targetVolumeLoud=" + this.targetVolumeLoud + ", video=" + this.video + ", forwardComment=" + this.forwardComment + ", canvasStyle=" + this.canvasStyle + ", isClipped=" + this.isClipped + ", shareToStoryMediaType=" + this.shareToStoryMediaType + ')';
    }

    public final boolean isClipped() {
        return this.isClipped;
    }

    public final boolean isEditorFullscreen() {
        return this.isEditorFullscreen;
    }

    public final boolean isOwnVideo() {
        return this.isOwnVideo;
    }

    public final void setCanvasStyle(int i) {
        this.canvasStyle = i;
    }

    public final void setClipped(boolean z) {
        this.isClipped = z;
    }

    public final void setEditorFullscreen(boolean z) {
        this.isEditorFullscreen = z;
    }

    public final void setShareToStoryMediaType(int i) {
        this.shareToStoryMediaType = i;
    }

    public ForwardCanvasExtra(int i, int i2, String str, int i3, boolean z, VideoShareInfoStruct videoShareInfoStruct, MentionStruct mentionStruct, ForwardMusic forwardMusic, float f, ForwardVideo forwardVideo, ForwardComment forwardComment, int i4, boolean z2, int i5) {
        this.forwardType = i;
        this.openStoryType = i2;
        this.mediaMeta = str;
        this.forwardAwemeType = i3;
        this.isOwnVideo = z;
        this.videoShareInfoStruct = videoShareInfoStruct;
        this.videoShareBackwardsMention = mentionStruct;
        this.forwardMusic = forwardMusic;
        this.targetVolumeLoud = f;
        this.video = forwardVideo;
        this.forwardComment = forwardComment;
        this.canvasStyle = i4;
        this.isClipped = z2;
        this.shareToStoryMediaType = i5;
    }
}
