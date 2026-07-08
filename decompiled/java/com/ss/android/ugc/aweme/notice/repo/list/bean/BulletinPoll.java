package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C618700OOm;
import X.InterfaceC618710OOn;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPoll implements InterfaceC618710OOn {

    @C09CT("valid_period_day")
    public final Integer duration;

    @C09CT("options")
    public final List<BulletinPollOption> options;

    @C09CT("poll_expired")
    public final Boolean pollExpired;

    @C09CT("poll_id")
    public final Long pollId;

    @C09CT("result_viewable")
    public final Boolean resultViewable;

    @C09CT("title")
    public final String title;

    @C09CT("total_voted_count")
    public final Long totalVoteCount;

    public BulletinPoll() {
        this("", 0, null, null, 0L, Boolean.FALSE, Boolean.FALSE);
    }

    public final BulletinPoll copy(String str, Integer num, List<BulletinPollOption> list, Long l, Long l2, Boolean bool, Boolean bool2) {
        return new BulletinPoll(str, num, list, l, l2, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinPoll)) {
            return false;
        }
        BulletinPoll bulletinPoll = (BulletinPoll) obj;
        return Intrinsics.LJFF(this.title, bulletinPoll.title) && Intrinsics.LJFF(this.duration, bulletinPoll.duration) && Intrinsics.LJFF(this.options, bulletinPoll.options) && Intrinsics.LJFF(this.pollId, bulletinPoll.pollId) && Intrinsics.LJFF(this.totalVoteCount, bulletinPoll.totalVoteCount) && Intrinsics.LJFF(this.resultViewable, bulletinPoll.resultViewable) && Intrinsics.LJFF(this.pollExpired, bulletinPoll.pollExpired);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.duration;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BulletinPollOption> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.pollId;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.totalVoteCount;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.resultViewable;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.pollExpired;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPoll(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", pollId=");
        sbLIZ.append(this.pollId);
        sbLIZ.append(", totalVoteCount=");
        sbLIZ.append(this.totalVoteCount);
        sbLIZ.append(", resultViewable=");
        sbLIZ.append(this.resultViewable);
        sbLIZ.append(", pollExpired=");
        sbLIZ.append(this.pollExpired);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getNonNullDuration() {
        Integer num = this.duration;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final List<BulletinPollOption> getNonNullOptions() {
        List<BulletinPollOption> list = this.options;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final long getNonNullPollId() {
        Long l = this.pollId;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String getNonNullTitle() {
        String str = this.title;
        return str == null ? "" : str;
    }

    public final long getNonNullTotalVoteCount() {
        Long l = this.totalVoteCount;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final List<BulletinPollOption> getOptions() {
        return this.options;
    }

    public final Boolean getPollExpired() {
        return this.pollExpired;
    }

    public final Long getPollId() {
        return this.pollId;
    }

    public final Boolean getResultViewable() {
        return this.resultViewable;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTotalVoteCount() {
        return this.totalVoteCount;
    }

    public final void generateEventTracking(Map<String, String> map) {
        map.put("vote_title_char_num", String.valueOf(getNonNullTitle().length()));
        map.put("vote_option_num", String.valueOf(getNonNullOptions().size()));
        List<BulletinPollOption> list = this.options;
        int length = 0;
        if (list != null) {
            Iterator<BulletinPollOption> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().content;
                if (str == null) {
                    str = "";
                }
                length += str.length();
            }
        }
        map.put("vote_option_char_num", String.valueOf(length));
        map.put("vote_valid_time", String.valueOf(this.duration));
    }

    @Override // X.InterfaceC618710OOn
    public boolean isSame(Object obj) {
        if (!(obj instanceof BulletinPoll)) {
            return false;
        }
        BulletinPoll bulletinPoll = (BulletinPoll) obj;
        if (!Intrinsics.LJFF(bulletinPoll.title, this.title) || !Intrinsics.LJFF(bulletinPoll.pollId, this.pollId) || !Intrinsics.LJFF(bulletinPoll.duration, this.duration) || !Intrinsics.LJFF(bulletinPoll.totalVoteCount, this.totalVoteCount) || !Intrinsics.LJFF(bulletinPoll.resultViewable, this.resultViewable) || !C618700OOm.LIZ(bulletinPoll.options, this.options)) {
            return false;
        }
        return true;
    }

    public BulletinPoll(String str, Integer num, List<BulletinPollOption> list, Long l, Long l2, Boolean bool, Boolean bool2) {
        this.title = str;
        this.duration = num;
        this.options = list;
        this.pollId = l;
        this.totalVoteCount = l2;
        this.resultViewable = bool;
        this.pollExpired = bool2;
    }
}
