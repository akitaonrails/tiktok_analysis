package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeStatisticsBackup implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_id")
    public String aid = "";

    @C09CT("digg_count")
    public Long diggCount = 0L;

    @C09CT("collect_count")
    public Long collectCount = 0L;

    @C09CT("download_count")
    public Long downloadCount = 0L;

    @C09CT("play_count")
    public Long playCount = 0L;

    @C09CT("share_count")
    public Long shareCount = 0L;

    @C09CT("forward_count")
    public Long forwardCount = 0L;

    @C09CT("comment_count")
    public Long commentCount = 0L;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeStatistics{aid='");
        sbLIZ.append(this.aid);
        sbLIZ.append("', comemntCount=");
        sbLIZ.append(this.commentCount);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.diggCount);
        sbLIZ.append(", playCount=");
        sbLIZ.append(this.playCount);
        sbLIZ.append(", shareCount=");
        sbLIZ.append(this.shareCount);
        sbLIZ.append(", forwardCount=");
        sbLIZ.append(this.forwardCount);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAid() {
        return this.aid;
    }

    public final Long getCollectCount() {
        return this.collectCount;
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final Long getDiggCount() {
        return this.diggCount;
    }

    public final Long getDownloadCount() {
        return this.downloadCount;
    }

    public final Long getForwardCount() {
        return this.forwardCount;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Long getShareCount() {
        return this.shareCount;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setCollectCount(Long l) {
        this.collectCount = l;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setDiggCount(Long l) {
        this.diggCount = l;
    }

    public final void setDownloadCount$common_feed_release(Long l) {
        this.downloadCount = l;
    }

    public final void setForwardCount(Long l) {
        this.forwardCount = l;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setShareCount(Long l) {
        this.shareCount = l;
    }
}
