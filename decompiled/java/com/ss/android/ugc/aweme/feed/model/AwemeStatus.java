package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C0PVY;
import X.C2188811AlT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes29.dex */
public class AwemeStatus implements Serializable, Cloneable {

    @C09CT("aid")
    public String aid;

    @C09CT("allow_comment")
    public boolean allowComment;

    @C09CT("video_hide_search")
    public int allowRecommend;

    @C09CT("allow_share")
    public boolean allowShare;

    @C09CT("can_add_songs")
    public boolean canAddSongs;

    @C09CT("download_status")
    public int downloadStatus;

    @C09CT("dont_share_status")
    public int excludeStatus;

    @C09CT("in_reviewing")
    public boolean inReviewing;

    @C09CT("is_delete")
    public boolean isDelete;

    @C09CT("is_prohibited")
    public boolean isProhibited;

    @C09CT("tiktok_music_edit_status")
    public int musicEditStatus;

    @C09CT("mute_strip_status")
    public int muteStripStatus;

    @C09CT("private_status")
    public int privateStatus;

    @C09CT("review_result")
    public ReviewResult reviewResult;

    @C09CT("reviewed")
    public int reviewed;

    @C09CT("self_see")
    public boolean selfSee;

    @C09CT("show_good_delay_time")
    public int showGoodDelayTime = 2000;

    @C09CT("video_mute")
    public VideoMuteInfo videoMuteInfo;

    @C09CT("violation_display_status")
    public int violationDisplayStatus;

    public static class ReviewResult implements Serializable {

        @C09CT("cover_notice")
        public String coverNotice;

        @C09CT("detail_url")
        public String detailUrl;

        @C09CT("review_status")
        public int reviewStatus;

        @C09CT("should_tell")
        public boolean shouldTell;

        @C09CT("video_detail_notice")
        public String videoDetailNotice;

        @C09CT("video_detail_notice_bottom")
        public String videoDetailNoticeBottom;

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.reviewStatus), Boolean.valueOf(this.shouldTell), this.detailUrl});
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("review_result{review_status=");
            sbLIZ.append(this.reviewStatus);
            sbLIZ.append("should_tell=");
            sbLIZ.append(this.shouldTell);
            sbLIZ.append("detail_url=");
            sbLIZ.append(this.detailUrl);
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public String getCoverNotice() {
            return this.coverNotice;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

        public int getReviewStatus() {
            return this.reviewStatus;
        }

        public boolean getShouldTell() {
            return this.shouldTell;
        }

        public String getVideoDetailNotice() {
            return this.videoDetailNotice;
        }

        public String getVideoDetailNoticeBottom() {
            return this.videoDetailNoticeBottom;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewResult)) {
                return false;
            }
            ReviewResult reviewResult = (ReviewResult) obj;
            if (this.reviewStatus == reviewResult.reviewStatus && this.shouldTell == reviewResult.shouldTell && C0PVY.LIZ(this.detailUrl, reviewResult.detailUrl)) {
                return true;
            }
            return false;
        }

        public void setCoverNotice(String str) {
            this.coverNotice = str;
        }

        public void setDetailUrl(String str) {
            this.detailUrl = str;
        }

        public void setReviewStatus(int i) {
            this.reviewStatus = i;
        }

        public void setShouldTell(boolean z) {
            this.shouldTell = z;
        }

        public void setVideoDetailNotice(String str) {
            this.videoDetailNotice = str;
        }

        public void setVideoDetailNoticeBottom(String str) {
            this.videoDetailNoticeBottom = str;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static class VideoMuteInfo implements Serializable {

        @C09CT("audio_change_status")
        public int audioChangeStatus;

        @C09CT("is_copyright_violation")
        public boolean isCopyrightViolation;

        @C09CT("is_mute")
        public boolean isMute;

        @C09CT("mute_desc")
        public String muteDesc;

        @C09CT("mute_detail_notice_bottom")
        public String muteDetailNotice;

        @C09CT("mute_detail_url")
        public String muteDetailUrl;

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.isMute), this.muteDesc});
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoMuteInfo{isCopyrightViolation=");
            sbLIZ.append(this.isCopyrightViolation);
            sbLIZ.append("audioChangeStatus=");
            sbLIZ.append(this.audioChangeStatus);
            sbLIZ.append("isMute=");
            sbLIZ.append(this.isMute);
            sbLIZ.append(", muteDesc='");
            sbLIZ.append(this.muteDesc);
            sbLIZ.append('\'');
            sbLIZ.append(", muteDetailUrl=");
            sbLIZ.append(this.muteDetailUrl);
            sbLIZ.append(", muteDetailNotice");
            sbLIZ.append(this.muteDetailNotice);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public int getAudioChangeStatus() {
            return this.audioChangeStatus;
        }

        public boolean getIsCopyrightViolation() {
            return this.isCopyrightViolation;
        }

        public String getMuteDesc() {
            return this.muteDesc;
        }

        public String getMuteDetailNotice() {
            return this.muteDetailNotice;
        }

        public String getMuteDetailUrl() {
            return this.muteDetailUrl;
        }

        public boolean isMute() {
            return this.isMute;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMuteInfo)) {
                return false;
            }
            VideoMuteInfo videoMuteInfo = (VideoMuteInfo) obj;
            if (this.isMute == videoMuteInfo.isMute && C0PVY.LIZ(this.muteDesc, videoMuteInfo.muteDesc)) {
                return true;
            }
            return false;
        }

        public void setAudioChangeStatus(int i) {
            this.audioChangeStatus = i;
        }

        public void setCopyrightViolation(boolean z) {
            this.isCopyrightViolation = z;
        }

        public void setIsMute(Boolean bool) {
            this.isMute = bool.booleanValue();
        }

        public void setMuteDesc(String str) {
            this.muteDesc = str;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AwemeStatus m201clone() {
        AwemeStatus awemeStatus = new AwemeStatus();
        awemeStatus.aid = this.aid;
        awemeStatus.isDelete = this.isDelete;
        awemeStatus.allowShare = this.allowShare;
        awemeStatus.allowComment = this.allowComment;
        awemeStatus.privateStatus = this.privateStatus;
        awemeStatus.showGoodDelayTime = this.showGoodDelayTime;
        awemeStatus.inReviewing = this.inReviewing;
        awemeStatus.reviewed = this.reviewed;
        awemeStatus.selfSee = this.selfSee;
        awemeStatus.isProhibited = this.isProhibited;
        awemeStatus.downloadStatus = this.downloadStatus;
        awemeStatus.reviewResult = this.reviewResult;
        awemeStatus.excludeStatus = this.excludeStatus;
        awemeStatus.allowRecommend = this.allowRecommend;
        awemeStatus.videoMuteInfo = this.videoMuteInfo;
        awemeStatus.musicEditStatus = this.musicEditStatus;
        return awemeStatus;
    }

    public MappedMuteStripStatus getMappedMuteStripStatus() {
        int i = this.muteStripStatus;
        if (i != -114514) {
            if (i == 1) {
                return this.musicEditStatus == 2 ? MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN : MappedMuteStripStatus.MUTE_STRIP_STATUS_WAIT_FOR_TRIGGER;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            int i2 = this.musicEditStatus;
                            if (i2 == 0) {
                                return MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN;
                            }
                            if (i2 != 1) {
                                return MappedMuteStripStatus.MUTE_STRIP_STATUS_UPDATING;
                            }
                            VideoMuteInfo videoMuteInfo = this.videoMuteInfo;
                            return (videoMuteInfo == null || !videoMuteInfo.isMute()) ? MappedMuteStripStatus.MUTE_STRIP_STATUS_DIRECTLY_POSTED : MappedMuteStripStatus.MUTE_STRIP_STATUS_NO_SHOW;
                        }
                        switch (i) {
                            case 7:
                            case 8:
                            case BdTuring.TYPE_ECAF /* 9 */:
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                VideoMuteInfo videoMuteInfo2 = this.videoMuteInfo;
                                return (videoMuteInfo2 == null || !videoMuteInfo2.isMute()) ? MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN : MappedMuteStripStatus.MUTE_STRIP_STATUS_FAILED;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                return !this.canAddSongs ? MappedMuteStripStatus.MUTE_STRIP_STATUS_SONGS_ADDED : this.musicEditStatus == 2 ? MappedMuteStripStatus.MUTE_STRIP_STATUS_UPDATING : MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_ADD_SONGS;
                            default:
                                return MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE;
                        }
                    }
                }
            }
            return MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM;
        }
        return MappedMuteStripStatus.MUTE_STRIP_STATUS_REMOVING;
    }

    public String getReviewDetailUrl() {
        ReviewResult reviewResult = this.reviewResult;
        return (reviewResult == null || TextUtils.isEmpty(reviewResult.detailUrl)) ? "" : this.reviewResult.detailUrl;
    }

    public int getReviewStatus() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult != null) {
            return reviewResult.reviewStatus;
        }
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Boolean.valueOf(this.isDelete), Boolean.valueOf(this.allowShare), Boolean.valueOf(this.allowComment), Integer.valueOf(this.privateStatus), Integer.valueOf(this.showGoodDelayTime), Boolean.valueOf(this.inReviewing), Integer.valueOf(this.reviewed), Boolean.valueOf(this.selfSee), Boolean.valueOf(this.isProhibited), Integer.valueOf(this.downloadStatus), this.reviewResult, Integer.valueOf(this.allowRecommend), Integer.valueOf(this.excludeStatus), this.videoMuteInfo});
    }

    public boolean isPrivate() {
        return this.privateStatus == 1;
    }

    public boolean isProhibitedAndShouldTell() {
        ReviewResult reviewResult = this.reviewResult;
        return reviewResult != null && reviewResult.reviewStatus == 1 && reviewResult.shouldTell;
    }

    public boolean isReviewed() {
        return this.reviewed == 1;
    }

    public boolean isSelfSeeAndShouldTell() {
        ReviewResult reviewResult = this.reviewResult;
        return reviewResult != null && reviewResult.reviewStatus == 2 && reviewResult.shouldTell;
    }

    public boolean shouldShowReviewStatus() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult == null) {
            return false;
        }
        int i = reviewResult.reviewStatus;
        return i == 1 || i == 2;
    }

    public String toString() {
        ReviewResult reviewResult = this.reviewResult;
        String string = reviewResult != null ? reviewResult.toString() : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeStatus{aid='");
        sbLIZ.append(this.aid);
        sbLIZ.append('\'');
        sbLIZ.append(", isDelete=");
        sbLIZ.append(this.isDelete);
        sbLIZ.append(", allowShare=");
        sbLIZ.append(this.allowShare);
        sbLIZ.append(", allowComment=");
        sbLIZ.append(this.allowComment);
        sbLIZ.append(", privateStatus=");
        sbLIZ.append(this.privateStatus);
        sbLIZ.append(", showGoodDelayTime=");
        sbLIZ.append(this.showGoodDelayTime);
        sbLIZ.append(", inReviewing=");
        sbLIZ.append(this.inReviewing);
        sbLIZ.append(", reviewed=");
        sbLIZ.append(this.reviewed);
        sbLIZ.append(", selfSee=");
        sbLIZ.append(this.selfSee);
        sbLIZ.append(", isProhibited=");
        sbLIZ.append(this.isProhibited);
        sbLIZ.append(", downloadStatus=");
        sbLIZ.append(this.downloadStatus);
        sbLIZ.append(", reviewStatus=");
        sbLIZ.append(string);
        sbLIZ.append(", excludeStatus=");
        sbLIZ.append(this.excludeStatus);
        sbLIZ.append(", allowRecommend=");
        sbLIZ.append(this.allowRecommend);
        sbLIZ.append(", videoMuteInfo=");
        sbLIZ.append(this.videoMuteInfo);
        sbLIZ.append(", musicEditStatus=");
        sbLIZ.append(this.musicEditStatus);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAid() {
        return this.aid;
    }

    public int getAllowRecommend() {
        return this.allowRecommend;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public int getExcludeStatus() {
        return this.excludeStatus;
    }

    public int getMusicEditStatus() {
        return this.musicEditStatus;
    }

    public int getMuteStripStatus() {
        return this.muteStripStatus;
    }

    public int getPrivateStatus() {
        return this.privateStatus;
    }

    public ReviewResult getReviewResult() {
        return this.reviewResult;
    }

    public int getShowGoodDelayTime() {
        return this.showGoodDelayTime;
    }

    public VideoMuteInfo getVideoMuteInfo() {
        return this.videoMuteInfo;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isCanAddSongs() {
        return this.canAddSongs;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public boolean isInReviewing() {
        return this.inReviewing;
    }

    public boolean isProhibited() {
        return this.isProhibited;
    }

    public boolean isSelfSee() {
        return this.selfSee;
    }

    public enum MappedMuteStripStatus {
        MUTE_STRIP_STATUS_DISABLE,
        MUTE_STRIP_STATUS_UNKNOWN,
        MUTE_STRIP_STATUS_WAIT_FOR_TRIGGER,
        MUTE_STRIP_STATUS_REMOVING,
        MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM,
        MUTE_STRIP_STATUS_DIRECTLY_POSTED,
        MUTE_STRIP_STATUS_PENDING_ADD_SONGS,
        MUTE_STRIP_STATUS_SONGS_ADDED,
        MUTE_STRIP_STATUS_FAILED,
        MUTE_STRIP_STATUS_UPDATING,
        MUTE_STRIP_STATUS_NO_SHOW;

        public static MappedMuteStripStatus valueOf(String str) {
            return (MappedMuteStripStatus) C08FF.LIZ(MappedMuteStripStatus.class, str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatus)) {
            return false;
        }
        AwemeStatus awemeStatus = (AwemeStatus) obj;
        if (this.isDelete == awemeStatus.isDelete && this.allowShare == awemeStatus.allowShare && this.allowComment == awemeStatus.allowComment && this.privateStatus == awemeStatus.privateStatus && this.showGoodDelayTime == awemeStatus.showGoodDelayTime && this.inReviewing == awemeStatus.inReviewing && this.reviewed == awemeStatus.reviewed && this.selfSee == awemeStatus.selfSee && this.isProhibited == awemeStatus.isProhibited && this.downloadStatus == awemeStatus.downloadStatus && C0PVY.LIZ(this.aid, awemeStatus.aid) && C0PVY.LIZ(this.reviewResult, awemeStatus.reviewResult) && this.allowRecommend == awemeStatus.allowRecommend && this.excludeStatus == awemeStatus.excludeStatus && C0PVY.LIZ(this.videoMuteInfo, awemeStatus.videoMuteInfo) && this.musicEditStatus == awemeStatus.musicEditStatus) {
            return true;
        }
        return false;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowRecommend(int i) {
        this.allowRecommend = i;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setDelete(boolean z) {
        this.isDelete = z;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setExcludeStatus(int i) {
        this.excludeStatus = i;
    }

    public void setInReviewing(boolean z) {
        this.inReviewing = z;
    }

    public void setMusicEditStatus(int i) {
        this.musicEditStatus = i;
    }

    public void setMuteStripStatus(int i) {
        this.muteStripStatus = i;
    }

    public void setPrivate(boolean z) {
        if (z) {
            this.privateStatus = 1;
        } else {
            this.privateStatus = 0;
        }
    }

    public void setPrivateStatus(int i) {
        this.privateStatus = i;
    }

    public void setProhibited(boolean z) {
        this.isProhibited = z;
    }

    public void setReviewResult(ReviewResult reviewResult) {
        this.reviewResult = reviewResult;
    }

    public void setSelfSee(boolean z) {
        this.selfSee = z;
    }
}
