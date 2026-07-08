package com.ss.android.ugc.aweme.api;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class VideoRelatedInfo implements Serializable {

    @C09CT("author_id")
    public final long authorId;

    @C09CT("author_nickname")
    public final String authorNickName;

    @C09CT("sec_author_uid")
    public final String authorSecUid;

    @C09CT("video_id")
    public final long awemeId;

    @C09CT("is_author_private_account")
    public final int isPrivateAccount;

    @C09CT("author_unique_id")
    public final String uniqueId;

    @C09CT("video_status")
    public final int videoStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRelatedInfo)) {
            return false;
        }
        VideoRelatedInfo videoRelatedInfo = (VideoRelatedInfo) obj;
        return this.awemeId == videoRelatedInfo.awemeId && this.authorId == videoRelatedInfo.authorId && Intrinsics.LJFF(this.authorNickName, videoRelatedInfo.authorNickName) && Intrinsics.LJFF(this.authorSecUid, videoRelatedInfo.authorSecUid) && this.videoStatus == videoRelatedInfo.videoStatus && this.isPrivateAccount == videoRelatedInfo.isPrivateAccount && Intrinsics.LJFF(this.uniqueId, videoRelatedInfo.uniqueId);
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public VideoRelatedInfo(long j, long j2, String str, String str2, int i, int i2, String str3) {
        this.awemeId = j;
        this.authorId = j2;
        this.authorNickName = str;
        this.authorSecUid = str2;
        this.videoStatus = i;
        this.isPrivateAccount = i2;
        this.uniqueId = str3;
    }
}
