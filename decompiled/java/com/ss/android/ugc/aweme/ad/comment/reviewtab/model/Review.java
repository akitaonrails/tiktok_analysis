package com.ss.android.ugc.aweme.ad.comment.reviewtab.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes28.dex */
public final class Review implements Serializable {

    @C09CT("country")
    public final String country;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("digg_count")
    public final long diggCount;

    @C09CT("comment_group_id")
    public final long groupId;

    @C09CT("comment_id")
    public final long id;
    public final String identityID;
    public boolean isDeleted;

    @C09CT("masked_nickname")
    public final String nickname;

    @C09CT("score")
    public final float rating;

    @C09CT("text")
    public final String text;

    @C09CT("is_user_digg")
    public final boolean userDiggStatus;

    @C09CT("user_id")
    public final long userId;

    /* JADX WARN: Illegal instructions before constructor call */
    public Review() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(UUID.randomUUID());
        this(C2188811AlT.LIZIZ(sbLIZ), false, 0L, 0L, 0L, null, null, 0.0f, null, 0L, 0L, false);
    }

    public final Review copy(String str, boolean z, long j, long j2, long j3, String str2, String str3, float f, String str4, long j4, long j5, boolean z2) {
        return new Review(str, z, j, j2, j3, str2, str3, f, str4, j4, j5, z2);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public Review(String str, boolean z, long j, long j2, long j3, String str2, String str3, float f, String str4, long j4, long j5, boolean z2) {
        this.identityID = str;
        this.isDeleted = z;
        this.id = j;
        this.groupId = j2;
        this.userId = j3;
        this.nickname = str2;
        this.text = str3;
        this.rating = f;
        this.country = str4;
        this.createTime = j4;
        this.diggCount = j5;
        this.userDiggStatus = z2;
    }
}
