package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PollInfo {

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("creator_id")
    public final Long creatorId;

    @C09CT("expire_time")
    public final Long expireTime;

    @C09CT("option_count_list")
    public final List<OptionCount> optionCountList;

    @C09CT("poll_id")
    public final long pollId;

    @C09CT("poll_status")
    public final int pollStatus;

    @C09CT("poll_style")
    public final PollStyle pollStyle;

    @C09CT("title")
    public final String title;

    @C09CT("total_votes")
    public int totalVotes;

    @C09CT("user_poll_option")
    public Integer userPollOption;

    public PollInfo() {
        this(0L, null, null, 0, 0, null, null, null, null, null);
    }

    public final PollInfo copy(long j, String str, List<OptionCount> list, int i, int i2, Long l, Integer num, PollStyle pollStyle, Long l2, Long l3) {
        return new PollInfo(j, str, list, i, i2, l, num, pollStyle, l2, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollInfo)) {
            return false;
        }
        PollInfo pollInfo = (PollInfo) obj;
        return this.pollId == pollInfo.pollId && Intrinsics.LJFF(this.title, pollInfo.title) && Intrinsics.LJFF(this.optionCountList, pollInfo.optionCountList) && this.pollStatus == pollInfo.pollStatus && this.totalVotes == pollInfo.totalVotes && Intrinsics.LJFF(this.expireTime, pollInfo.expireTime) && Intrinsics.LJFF(this.userPollOption, pollInfo.userPollOption) && Intrinsics.LJFF(this.pollStyle, pollInfo.pollStyle) && Intrinsics.LJFF(this.creatorId, pollInfo.creatorId) && Intrinsics.LJFF(this.createTime, pollInfo.createTime);
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.pollId) * 31;
        String str = this.title;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        List<OptionCount> list = this.optionCountList;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.pollStatus) * 31) + this.totalVotes) * 31;
        Long l = this.expireTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.userPollOption;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        PollStyle pollStyle = this.pollStyle;
        int iHashCode5 = (iHashCode4 + (pollStyle == null ? 0 : pollStyle.hashCode())) * 31;
        Long l2 = this.creatorId;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.createTime;
        return iHashCode6 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollInfo(pollId=");
        sbLIZ.append(this.pollId);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", optionCountList=");
        sbLIZ.append(this.optionCountList);
        sbLIZ.append(", pollStatus=");
        sbLIZ.append(this.pollStatus);
        sbLIZ.append(", totalVotes=");
        sbLIZ.append(this.totalVotes);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(", userPollOption=");
        sbLIZ.append(this.userPollOption);
        sbLIZ.append(", pollStyle=");
        sbLIZ.append(this.pollStyle);
        sbLIZ.append(", creatorId=");
        sbLIZ.append(this.creatorId);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setTotalVotes(int i) {
        this.totalVotes = i;
    }

    public final void setUserPollOption(Integer num) {
        this.userPollOption = num;
    }

    public PollInfo(long j, String str, List<OptionCount> list, int i, int i2, Long l, Integer num, PollStyle pollStyle, Long l2, Long l3) {
        this.pollId = j;
        this.title = str;
        this.optionCountList = list;
        this.pollStatus = i;
        this.totalVotes = i2;
        this.expireTime = l;
        this.userPollOption = num;
        this.pollStyle = pollStyle;
        this.creatorId = l2;
        this.createTime = l3;
    }
}
