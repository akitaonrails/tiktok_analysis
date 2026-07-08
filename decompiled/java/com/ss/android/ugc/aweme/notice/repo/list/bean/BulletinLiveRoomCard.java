package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinLiveRoomCard {

    @C09CT("enable_report")
    public final Boolean enableReport;

    @C09CT("is_finished")
    public final boolean isFinished;

    @C09CT("room_data")
    public final String roomData;

    @C09CT("room_id")
    public final long roomId;

    @C09CT("room_struct")
    public final LiveRoomStruct roomStruct;

    @C09CT("user_id")
    public final String uid;

    public BulletinLiveRoomCard() {
        this(null, 0L, null, false, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinLiveRoomCard)) {
            return false;
        }
        BulletinLiveRoomCard bulletinLiveRoomCard = (BulletinLiveRoomCard) obj;
        return Intrinsics.LJFF(this.roomData, bulletinLiveRoomCard.roomData) && this.roomId == bulletinLiveRoomCard.roomId && Intrinsics.LJFF(this.uid, bulletinLiveRoomCard.uid) && this.isFinished == bulletinLiveRoomCard.isFinished && Intrinsics.LJFF(this.roomStruct, bulletinLiveRoomCard.roomStruct) && Intrinsics.LJFF(this.enableReport, bulletinLiveRoomCard.enableReport);
    }

    public int hashCode() {
        String str = this.roomData;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.roomId)) * 31;
        String str2 = this.uid;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.isFinished)) * 31;
        LiveRoomStruct liveRoomStruct = this.roomStruct;
        int iHashCode3 = (iHashCode2 + (liveRoomStruct == null ? 0 : liveRoomStruct.hashCode())) * 31;
        Boolean bool = this.enableReport;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public BulletinLiveRoomCard(String str, long j, String str2, boolean z, LiveRoomStruct liveRoomStruct, Boolean bool) {
        this.roomData = str;
        this.roomId = j;
        this.uid = str2;
        this.isFinished = z;
        this.roomStruct = liveRoomStruct;
        this.enableReport = bool;
    }
}
