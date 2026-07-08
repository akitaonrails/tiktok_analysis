package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.InterfaceC2262121DgQ;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public class RoomStats implements InterfaceC2262121DgQ {

    @C09CT("comment_count")
    public long commentCount;

    @C09CT("enter_count")
    public int enterCount;

    @C09CT("follow_count")
    public int followCount;

    @C09CT("gift_uv_count")
    public int giftUVCount;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("replay_viewers")
    public int replayViewers;

    @C09CT("room_follow_count")
    public long roomFollowCount;

    @C09CT("share_count")
    public int shareCount;

    @C09CT("fan_ticket")
    public long ticket;

    @C09CT("total_user")
    public int totalUser;

    @C09CT("watch_user_count")
    public long watchUserCount;

    @C09CT("watermelon")
    public int watermelon;
    public final int INT_32 = 32;
    public final int INT_31 = 31;

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.ticket;
        int i2 = (((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        String str = this.idStr;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    @Override // X.InterfaceC2262121DgQ
    public int getFollowCount() {
        return this.followCount;
    }

    @Override // X.InterfaceC2262121DgQ
    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    @Override // X.InterfaceC2262121DgQ
    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    @Override // X.InterfaceC2262121DgQ
    public long getTicket() {
        return this.ticket;
    }

    @Override // X.InterfaceC2262121DgQ
    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public static RoomStats from(InterfaceC2262121DgQ interfaceC2262121DgQ) {
        if (interfaceC2262121DgQ == null) {
            return null;
        }
        if (interfaceC2262121DgQ instanceof RoomStats) {
            Gson gson = new Gson();
            return (RoomStats) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, interfaceC2262121DgQ), RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(interfaceC2262121DgQ);
        return roomStats;
    }

    private void initWith(InterfaceC2262121DgQ interfaceC2262121DgQ) {
        this.id = interfaceC2262121DgQ.getId();
        this.ticket = interfaceC2262121DgQ.getTicket();
        this.totalUser = interfaceC2262121DgQ.getTotalUser();
        this.followCount = interfaceC2262121DgQ.getFollowCount();
        this.giftUVCount = interfaceC2262121DgQ.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomStats roomStats = (RoomStats) obj;
        if (this.id != roomStats.id || this.ticket != roomStats.ticket || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
            return false;
        }
        String str = this.idStr;
        if (str != null) {
            if (!str.equals(roomStats.idStr)) {
                return false;
            }
        } else if (roomStats.idStr != null) {
            return false;
        }
        if (this.totalUser == roomStats.totalUser) {
            return true;
        }
        return false;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setWatermelon(int i) {
        this.watermelon = i;
    }
}
