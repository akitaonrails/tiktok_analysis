package com.ss.android.ugc.aweme.feed.model.friends;

import X.C09CT;
import X.C0X12;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeed implements Serializable, C0X12 {
    public static final Companion Companion = new Companion();

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("feed_type")
    public final int feedType;
    public String requestId;

    @C09CT("cell_room")
    public final RoomFeedCellStruct roomStruct;

    @C09CT("source")
    public int source;

    public static final class Companion {
    }

    public FriendsFeed() {
        this(null, 0, "", 1, null);
    }

    public final FriendsFeed copy(Aweme aweme, int i, String str, int i2, RoomFeedCellStruct roomFeedCellStruct) {
        return new FriendsFeed(aweme, i, str, i2, roomFeedCellStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFeed)) {
            return false;
        }
        FriendsFeed friendsFeed = (FriendsFeed) obj;
        return Intrinsics.LJFF(this.aweme, friendsFeed.aweme) && this.source == friendsFeed.source && Intrinsics.LJFF(this.requestId, friendsFeed.requestId) && this.feedType == friendsFeed.feedType && Intrinsics.LJFF(this.roomStruct, friendsFeed.roomStruct);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        int iHashCode = (((aweme == null ? 0 : aweme.hashCode()) * 31) + this.source) * 31;
        String str = this.requestId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.feedType) * 31;
        RoomFeedCellStruct roomFeedCellStruct = this.roomStruct;
        return iHashCode2 + (roomFeedCellStruct != null ? roomFeedCellStruct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsFeed(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", feedType=");
        sbLIZ.append(this.feedType);
        sbLIZ.append(", roomStruct=");
        sbLIZ.append(this.roomStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int getFeedType() {
        return this.feedType;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public final RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public FriendsFeed(Aweme aweme, int i, String str, int i2, RoomFeedCellStruct roomFeedCellStruct) {
        this.aweme = aweme;
        this.source = i;
        this.requestId = str;
        this.feedType = i2;
        this.roomStruct = roomFeedCellStruct;
    }
}
