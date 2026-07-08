package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public final class BulletinChannelInfo {

    @C09CT("channel_name")
    public final String bbChannelName;

    @C09CT("channel_id")
    public final Long bbId;

    @C09CT("channel_owner_id")
    public final String channelOwnId;

    @C09CT("channel_born_time")
    public final Long createTime;

    @C09CT("channel_status")
    public final Integer status;

    public final int hashCode() {
        Long l = this.bbId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.channelOwnId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bbChannelName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.createTime;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.status;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinChannelInfo(bbId=");
        sbLIZ.append(this.bbId);
        sbLIZ.append(", channelOwnId=");
        sbLIZ.append(this.channelOwnId);
        sbLIZ.append(", bbChannelName=");
        sbLIZ.append(this.bbChannelName);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinChannelInfo(Long l, String str, String str2, Long l2, Integer num) {
        this.bbId = l;
        this.channelOwnId = str;
        this.bbChannelName = str2;
        this.createTime = l2;
        this.status = num;
    }
}
