package com.ss.android.ugc.aweme.creative.model.forward;

import X.C040H;
import X.C09CT;
import X.C0MKY;
import X.C0MM8;
import X.C0MM9;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ForwardMedia implements Serializable {
    public static final C0MKY Companion = new Object() { // from class: X.0MKY
    };

    @C09CT("author")
    public final C0MM9 author;

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("creation_path")
    public String creationPath;

    @C040H
    public transient Map<Class<?>, Object> dataMap;

    @C09CT("desc")
    public final String desc;

    @C09CT("disable_auto_select_music_in_editing")
    public Boolean disableAutoSelectMusicInEditing;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("event_type")
    public final String eventType;

    @C09CT("forward_music")
    public final ForwardMusic forwardMusic;

    @C09CT("is_im_share_mention_video_to_post")
    public Boolean isIMShareMentionVideoToPost;

    @C09CT("is_story")
    public final boolean isStory;

    @C09CT("is_streak_share_to_story")
    public boolean isStreakShareToStory;

    @C09CT("local_dir")
    public String localDir;

    @C09CT("local_file")
    public String localFile;

    @C040H
    public final transient MediaModel localMedia;

    @C09CT("local_path")
    public String localPath;

    @C040H
    public final transient C0MM8 miniGameSnapShot;

    @C09CT("origin_video_aigc_label_type")
    public final int originVideoAIGCLabelType;

    @C09CT("past_memory_key")
    public final String pastMemoryKey;

    @C09CT("photo_mode_image_info")
    public final PhotoModeImageInfo photoModeImageInfo;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("source_id")
    public final String sourceId;

    @C09CT("target_volume_loud")
    public final float targetVolumeLoud;

    @C09CT("video")
    public final ForwardVideo video;

    public ForwardMedia() {
        this(null, 0, null, null, null, null, 0.0f, null, null, null, 0L, 0, null, false, null, null, null, null, false, null, null, null, null, null, null, 33554431, null);
    }

    public final ForwardMedia copy(String str, int i, C0MM9 c0mm9, String str2, String str3, ForwardVideo forwardVideo, float f, ForwardMusic forwardMusic, PhotoModeImageInfo photoModeImageInfo, String str4, long j, int i2, String str5, boolean z, String str6, String str7, String str8, String str9, boolean z2, String str10, MediaModel mediaModel, Boolean bool, Boolean bool2, C0MM8 c0mm8, String str11) {
        return new ForwardMedia(str, i, c0mm9, str2, str3, forwardVideo, f, forwardMusic, photoModeImageInfo, str4, j, i2, str5, z, str6, str7, str8, str9, z2, str10, mediaModel, bool, bool2, c0mm8, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardMedia)) {
            return false;
        }
        ForwardMedia forwardMedia = (ForwardMedia) obj;
        return Intrinsics.LJFF(this.sourceId, forwardMedia.sourceId) && this.awemeType == forwardMedia.awemeType && Intrinsics.LJFF(this.author, forwardMedia.author) && Intrinsics.LJFF(this.eventType, forwardMedia.eventType) && Intrinsics.LJFF(this.shootWay, forwardMedia.shootWay) && Intrinsics.LJFF(this.video, forwardMedia.video) && Float.compare(this.targetVolumeLoud, forwardMedia.targetVolumeLoud) == 0 && Intrinsics.LJFF(this.forwardMusic, forwardMedia.forwardMusic) && Intrinsics.LJFF(this.photoModeImageInfo, forwardMedia.photoModeImageInfo) && Intrinsics.LJFF(this.pastMemoryKey, forwardMedia.pastMemoryKey) && this.createTime == forwardMedia.createTime && this.originVideoAIGCLabelType == forwardMedia.originVideoAIGCLabelType && Intrinsics.LJFF(this.enterMethod, forwardMedia.enterMethod) && this.isStory == forwardMedia.isStory && Intrinsics.LJFF(this.desc, forwardMedia.desc) && Intrinsics.LJFF(this.localDir, forwardMedia.localDir) && Intrinsics.LJFF(this.localFile, forwardMedia.localFile) && Intrinsics.LJFF(this.localPath, forwardMedia.localPath) && this.isStreakShareToStory == forwardMedia.isStreakShareToStory && Intrinsics.LJFF(this.creationPath, forwardMedia.creationPath) && Intrinsics.LJFF(this.localMedia, forwardMedia.localMedia) && Intrinsics.LJFF(this.disableAutoSelectMusicInEditing, forwardMedia.disableAutoSelectMusicInEditing) && Intrinsics.LJFF(this.isIMShareMentionVideoToPost, forwardMedia.isIMShareMentionVideoToPost) && Intrinsics.LJFF(this.miniGameSnapShot, forwardMedia.miniGameSnapShot) && Intrinsics.LJFF(this.creationId, forwardMedia.creationId);
    }

    public final Boolean isIMShareMentionVideoToPost() {
        return this.isIMShareMentionVideoToPost;
    }

    public final boolean isStory() {
        return this.isStory;
    }

    public final boolean isStreakShareToStory() {
        return this.isStreakShareToStory;
    }

    public final void setCreationPath(String str) {
        this.creationPath = str;
    }

    public final void setDisableAutoSelectMusicInEditing(Boolean bool) {
        this.disableAutoSelectMusicInEditing = bool;
    }

    public final void setIMShareMentionVideoToPost(Boolean bool) {
        this.isIMShareMentionVideoToPost = bool;
    }

    public final void setLocalDir(String str) {
        this.localDir = str;
    }

    public final void setLocalFile(String str) {
        this.localFile = str;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setStreakShareToStory(boolean z) {
        this.isStreakShareToStory = z;
    }

    public ForwardMedia(String str, int i, C0MM9 c0mm9, String str2, String str3, ForwardVideo forwardVideo, float f, ForwardMusic forwardMusic, PhotoModeImageInfo photoModeImageInfo, String str4, long j, int i2, String str5, boolean z, String str6, String str7, String str8, String str9, boolean z2, String str10, MediaModel mediaModel, Boolean bool, Boolean bool2, C0MM8 c0mm8, String str11) {
        this.sourceId = str;
        this.awemeType = i;
        this.author = c0mm9;
        this.eventType = str2;
        this.shootWay = str3;
        this.video = forwardVideo;
        this.targetVolumeLoud = f;
        this.forwardMusic = forwardMusic;
        this.photoModeImageInfo = photoModeImageInfo;
        this.pastMemoryKey = str4;
        this.createTime = j;
        this.originVideoAIGCLabelType = i2;
        this.enterMethod = str5;
        this.isStory = z;
        this.desc = str6;
        this.localDir = str7;
        this.localFile = str8;
        this.localPath = str9;
        this.isStreakShareToStory = z2;
        this.creationPath = str10;
        this.localMedia = mediaModel;
        this.disableAutoSelectMusicInEditing = bool;
        this.isIMShareMentionVideoToPost = bool2;
        this.miniGameSnapShot = c0mm8;
        this.creationId = str11;
    }

    public ForwardMedia(String str, int i, C0MM9 c0mm9, String str2, String str3, ForwardVideo forwardVideo, float f, ForwardMusic forwardMusic, PhotoModeImageInfo photoModeImageInfo, String str4, long j, int i2, String str5, boolean z, String str6, String str7, String str8, String str9, boolean z2, String str10, MediaModel mediaModel, Boolean bool, Boolean bool2, C0MM8 c0mm8, String str11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? new C0MM9(null, null, null, null, null) : c0mm9, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "share_to_story" : str3, (i3 & 32) != 0 ? new ForwardVideo(C13BV.INSTANCE, null, 0, 0, 0, null, null, null, false, null, null, null, 0, null, 16382, null) : forwardVideo, (i3 & 64) != 0 ? -12.0f : f, (i3 & 128) != 0 ? null : forwardMusic, (i3 & 256) != 0 ? null : photoModeImageInfo, (i3 & 512) != 0 ? "" : str4, (i3 & 1024) != 0 ? 0L : j, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i2, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str5, (i3 & 8192) != 0 ? false : z, (i3 & 16384) != 0 ? "" : str6, (32768 & i3) != 0 ? "" : str7, (65536 & i3) != 0 ? "" : str8, (131072 & i3) != 0 ? "" : str9, (262144 & i3) != 0 ? false : z2, (524288 & i3) == 0 ? str10 : "", (1048576 & i3) != 0 ? null : mediaModel, (2097152 & i3) != 0 ? Boolean.FALSE : bool, (4194304 & i3) != 0 ? Boolean.FALSE : bool2, (8388608 & i3) != 0 ? null : c0mm8, (i3 & 16777216) != 0 ? null : str11);
    }
}
