package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoryLiteMetadata implements Serializable {

    @C09CT("aweme_type")
    public int awemeType;

    @C09CT("expire_at")
    public long expireAt;
    public String fakeAID;

    @C09CT("is_sub_only")
    public boolean isSubOnly;

    @C09CT("item_id")
    public long itemID;

    @C09CT("post_type")
    public int postType;

    @C09CT("progress_bar_num")
    public long progressBarNum;

    @C09CT("viewed")
    public boolean viewed;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryLiteMetadata)) {
            return false;
        }
        StoryLiteMetadata storyLiteMetadata = (StoryLiteMetadata) obj;
        return this.itemID == storyLiteMetadata.itemID && this.viewed == storyLiteMetadata.viewed && this.progressBarNum == storyLiteMetadata.progressBarNum && this.isSubOnly == storyLiteMetadata.isSubOnly && this.awemeType == storyLiteMetadata.awemeType && this.expireAt == storyLiteMetadata.expireAt && this.postType == storyLiteMetadata.postType && Intrinsics.LJFF(this.fakeAID, storyLiteMetadata.fakeAID);
    }

    public int hashCode() {
        return (((((((((((((C786410Ut5.Y2(this.itemID) * 31) + C786410Ut5.Z2(this.viewed)) * 31) + C786410Ut5.Y2(this.progressBarNum)) * 31) + C786410Ut5.Z2(this.isSubOnly)) * 31) + this.awemeType) * 31) + C786410Ut5.Y2(this.expireAt)) * 31) + this.postType) * 31) + this.fakeAID.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryLiteMetadata(itemID=");
        sbLIZ.append(this.itemID);
        sbLIZ.append(", viewed=");
        sbLIZ.append(this.viewed);
        sbLIZ.append(", progressBarNum=");
        sbLIZ.append(this.progressBarNum);
        sbLIZ.append(", isSubOnly=");
        sbLIZ.append(this.isSubOnly);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", expireAt=");
        sbLIZ.append(this.expireAt);
        sbLIZ.append(", postType=");
        sbLIZ.append(this.postType);
        sbLIZ.append(", fakeAID=");
        sbLIZ.append(this.fakeAID);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryLiteMetadata() {
        this(0L, false, 0L, false, 0, 0L, 1, "default");
    }

    public final boolean isSubOnly() {
        return this.isSubOnly;
    }

    public final boolean isAIDEquals(String str) {
        if (!Intrinsics.LJFF(String.valueOf(this.itemID), str)) {
            if (this.itemID == 0 && Intrinsics.LJFF(this.fakeAID, str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void setSubOnly(boolean z) {
        this.isSubOnly = z;
    }

    public final void setViewed(boolean z) {
        this.viewed = z;
    }

    public StoryLiteMetadata(long j, boolean z, long j2, boolean z2, int i, long j3, int i2, String str) {
        this.itemID = j;
        this.viewed = z;
        this.progressBarNum = j2;
        this.isSubOnly = z2;
        this.awemeType = i;
        this.expireAt = j3;
        this.postType = i2;
        this.fakeAID = str;
    }
}
