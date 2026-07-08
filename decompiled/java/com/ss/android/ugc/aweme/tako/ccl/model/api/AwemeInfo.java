package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeInfo {

    @C09CT("aid")
    public final String aid;

    @C09CT("author")
    public final String author;

    @C09CT("collect_count")
    public final long collectCount;

    @C09CT("collected")
    public final boolean collected;

    @C09CT("comment_count")
    public final long commentCount;

    @C09CT("desc")
    public final String desc;

    @C09CT("dig_count")
    public final long digCount;

    @C09CT("digged")
    public final boolean digged;

    @C09CT("duration_ms")
    public final long durationMs;

    @C09CT("share_count")
    public final long shareCount;

    @C09CT("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeInfo)) {
            return false;
        }
        AwemeInfo awemeInfo = (AwemeInfo) obj;
        return Intrinsics.LJFF(this.aid, awemeInfo.aid) && Intrinsics.LJFF(this.title, awemeInfo.title) && Intrinsics.LJFF(this.desc, awemeInfo.desc) && Intrinsics.LJFF(this.author, awemeInfo.author) && this.digged == awemeInfo.digged && this.collected == awemeInfo.collected && this.digCount == awemeInfo.digCount && this.commentCount == awemeInfo.commentCount && this.collectCount == awemeInfo.collectCount && this.shareCount == awemeInfo.shareCount && this.durationMs == awemeInfo.durationMs;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.aid.hashCode() * 31) + this.title.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.author.hashCode()) * 31) + C786410Ut5.Z2(this.digged)) * 31) + C786410Ut5.Z2(this.collected)) * 31) + C786410Ut5.Y2(this.digCount)) * 31) + C786410Ut5.Y2(this.commentCount)) * 31) + C786410Ut5.Y2(this.collectCount)) * 31) + C786410Ut5.Y2(this.shareCount)) * 31) + C786410Ut5.Y2(this.durationMs);
    }

    public final String toString() {
        return "AwemeInfo(aid=" + this.aid + ", title=" + this.title + ", desc=" + this.desc + ", author=" + this.author + ", digged=" + this.digged + ", collected=" + this.collected + ", digCount=" + this.digCount + ", commentCount=" + this.commentCount + ", collectCount=" + this.collectCount + ", shareCount=" + this.shareCount + ", durationMs=" + this.durationMs + ')';
    }

    public AwemeInfo() {
        this("", "", "", "", false, false, 0L, 0L, 0L, 0L, 0L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AwemeInfo(Aweme aweme) {
        boolean z;
        long diggCount;
        long commentCount;
        long collectCount;
        long shareCount;
        long duration;
        String nickname;
        String aid = aweme.getAid();
        String str = "";
        aid = aid == null ? "" : aid;
        String title = aweme.getTitle();
        title = title == null ? "" : title;
        String desc = aweme.getDesc();
        desc = desc == null ? "" : desc;
        User author = aweme.getAuthor();
        if (author != null && (nickname = author.getNickname()) != null) {
            str = nickname;
        }
        if (aweme.getUserDigg() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsCollected = AwemeExtKt.isCollected(aweme);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        AwemeStatistics statistics2 = aweme.getStatistics();
        if (statistics2 != null) {
            commentCount = statistics2.getCommentCount();
        } else {
            commentCount = 0;
        }
        AwemeStatistics statistics3 = aweme.getStatistics();
        if (statistics3 != null) {
            collectCount = statistics3.getCollectCount();
        } else {
            collectCount = 0;
        }
        AwemeStatistics statistics4 = aweme.getStatistics();
        if (statistics4 != null) {
            shareCount = statistics4.getShareCount();
        } else {
            shareCount = 0;
        }
        Video video = aweme.getVideo();
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        this(aid, title, desc, str, z, zIsCollected, diggCount, commentCount, collectCount, shareCount, duration);
    }

    public AwemeInfo(String str, String str2, String str3, String str4, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5) {
        this.aid = str;
        this.title = str2;
        this.desc = str3;
        this.author = str4;
        this.digged = z;
        this.collected = z2;
        this.digCount = j;
        this.commentCount = j2;
        this.collectCount = j3;
        this.shareCount = j4;
        this.durationMs = j5;
    }
}
