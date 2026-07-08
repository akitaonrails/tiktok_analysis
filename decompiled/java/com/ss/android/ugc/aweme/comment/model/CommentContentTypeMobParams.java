package com.ss.android.ugc.aweme.comment.model;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentContentTypeMobParams {
    public final boolean isAudio;
    public final boolean isEmoji;
    public final boolean isMention;
    public final boolean isPhoto;
    public final boolean isSticker;
    public final boolean isText;

    public final boolean isAudio() {
        return this.isAudio;
    }

    public final boolean isEmoji() {
        return this.isEmoji;
    }

    public final boolean isMention() {
        return this.isMention;
    }

    public final boolean isPhoto() {
        return this.isPhoto;
    }

    public final boolean isSticker() {
        return this.isSticker;
    }

    public final boolean isText() {
        return this.isText;
    }

    public CommentContentTypeMobParams(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.isText = z;
        this.isMention = z2;
        this.isEmoji = z3;
        this.isPhoto = z4;
        this.isSticker = z5;
        this.isAudio = z6;
    }
}
