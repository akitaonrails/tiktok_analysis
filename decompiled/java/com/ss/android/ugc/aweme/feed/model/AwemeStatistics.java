package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C0PVY;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeStatistics implements Serializable, Cloneable {

    @C09CT("aid")
    public String aid;

    @C09CT("collect_count")
    public long collectCount = -1;

    @C09CT("comment_count")
    public long commentCount;

    @C09CT("digg_count")
    public long diggCount;

    @C09CT("download_count")
    public long downloadCount;

    @C09CT("forward_count")
    public long forwardCount;

    @C09CT("lose_comment_count")
    public int loseCommentCount;

    @C09CT("lose_count")
    public int loseCount;

    @C09CT("play_count")
    public long playCount;

    @C09CT("repost_count")
    public long repostCount;

    @C09CT("share_count")
    public long shareCount;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AwemeStatistics m200clone() {
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        awemeStatistics.aid = this.aid;
        awemeStatistics.commentCount = this.commentCount;
        awemeStatistics.diggCount = this.diggCount;
        awemeStatistics.playCount = this.playCount;
        awemeStatistics.shareCount = this.shareCount;
        awemeStatistics.forwardCount = this.forwardCount;
        awemeStatistics.downloadCount = this.downloadCount;
        awemeStatistics.collectCount = this.collectCount;
        awemeStatistics.repostCount = this.repostCount;
        return awemeStatistics;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Long.valueOf(this.commentCount), Long.valueOf(this.diggCount), Long.valueOf(this.playCount), Long.valueOf(this.shareCount), Long.valueOf(this.forwardCount), Long.valueOf(this.downloadCount), Long.valueOf(this.collectCount), Long.valueOf(this.repostCount)});
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeStatistics{aid='");
        sbLIZ.append(this.aid);
        sbLIZ.append('\'');
        sbLIZ.append(", commentCount=");
        sbLIZ.append(this.commentCount);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.diggCount);
        sbLIZ.append(", playCount=");
        sbLIZ.append(this.playCount);
        sbLIZ.append(", shareCount=");
        sbLIZ.append(this.shareCount);
        sbLIZ.append(", forwardCount=");
        sbLIZ.append(this.forwardCount);
        sbLIZ.append(", downloadCount=");
        sbLIZ.append(this.downloadCount);
        sbLIZ.append(", collectCount=");
        sbLIZ.append(this.collectCount);
        sbLIZ.append(", repostCount=");
        sbLIZ.append(this.repostCount);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAid() {
        return this.aid;
    }

    public long getCollectCount() {
        return this.collectCount;
    }

    public long getCommentCount() {
        return this.commentCount;
    }

    public long getDiggCount() {
        return this.diggCount;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getForwardCount() {
        return this.forwardCount;
    }

    public int getLoseCommentCount() {
        return this.loseCommentCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public long getRepostCount() {
        return this.repostCount;
    }

    public long getShareCount() {
        return this.shareCount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatistics)) {
            return false;
        }
        AwemeStatistics awemeStatistics = (AwemeStatistics) obj;
        if (this.commentCount == awemeStatistics.commentCount && this.diggCount == awemeStatistics.diggCount && this.playCount == awemeStatistics.playCount && this.shareCount == awemeStatistics.shareCount && this.forwardCount == awemeStatistics.forwardCount && this.downloadCount == awemeStatistics.downloadCount && this.collectCount == awemeStatistics.collectCount && this.repostCount == awemeStatistics.repostCount && C0PVY.LIZ(this.aid, awemeStatistics.aid)) {
            return true;
        }
        return false;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCollectCount(long j) {
        this.collectCount = j;
    }

    public void setCommentCount(long j) {
        this.commentCount = j;
    }

    public void setDiggCount(long j) {
        this.diggCount = j;
    }

    public void setDownloadCount(long j) {
        this.downloadCount = j;
    }

    public void setForwardCount(long j) {
        this.forwardCount = j;
    }

    public void setLoseCommentCount(int i) {
        this.loseCommentCount = i;
    }

    public void setLoseCount(int i) {
        this.loseCount = i;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setRepostCount(long j) {
        this.repostCount = j;
    }

    public void setShareCount(long j) {
        this.shareCount = j;
    }
}
