package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentImageModel extends UrlModel {
    public static final Companion Companion = new Companion();

    @C09CT("ai_image_model")
    public AIImageModel aiImageModel;

    @C09CT("ai_image_task_id")
    public String aiImageTaskId;
    public transient String compressedFilePath;
    public transient int compressedStatus;
    public transient String compressedVideoPath;
    public transient int compressedVideoStatus;
    public transient String editedImagePath;

    @C09CT("format")
    public String format = "";
    public transient boolean isCompressed;
    public transient boolean isVideoCompressed;
    public transient LivePhotoInfo livePhotoInfo;
    public transient String originLiveMode;

    @C09CT("source")
    public int source;

    @C09CT("vid")
    public String videoId;
    public transient String videoPath;

    public static final class Companion {
    }

    public final boolean isAIImage() {
        return this.source == 2;
    }

    public final AIImageModel getAiImageModel() {
        return this.aiImageModel;
    }

    public final String getAiImageTaskId() {
        return this.aiImageTaskId;
    }

    public final String getCompressedFilePath() {
        return this.compressedFilePath;
    }

    public final int getCompressedStatus() {
        return this.compressedStatus;
    }

    public final String getCompressedVideoPath() {
        return this.compressedVideoPath;
    }

    public final int getCompressedVideoStatus() {
        return this.compressedVideoStatus;
    }

    public final String getEditedImagePath() {
        return this.editedImagePath;
    }

    public final String getFormat() {
        return this.format;
    }

    public final LivePhotoInfo getLivePhotoInfo() {
        return this.livePhotoInfo;
    }

    public final String getOriginLiveMode() {
        return this.originLiveMode;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final boolean isCompressed() {
        return this.isCompressed;
    }

    public final boolean isVideoCompressed() {
        return this.isVideoCompressed;
    }

    public final void setAiImageModel(AIImageModel aIImageModel) {
        this.aiImageModel = aIImageModel;
    }

    public final void setAiImageTaskId(String str) {
        this.aiImageTaskId = str;
    }

    public final void setCompressed(boolean z) {
        this.isCompressed = z;
    }

    public final void setCompressedFilePath(String str) {
        this.compressedFilePath = str;
    }

    public final void setCompressedStatus(int i) {
        this.compressedStatus = i;
    }

    public final void setCompressedVideoPath(String str) {
        this.compressedVideoPath = str;
    }

    public final void setCompressedVideoStatus(int i) {
        this.compressedVideoStatus = i;
    }

    public final void setEditedImagePath(String str) {
        this.editedImagePath = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setLivePhotoInfo(LivePhotoInfo livePhotoInfo) {
        this.livePhotoInfo = livePhotoInfo;
    }

    public final void setOriginLiveMode(String str) {
        this.originLiveMode = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setVideoCompressed(boolean z) {
        this.isVideoCompressed = z;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }
}
