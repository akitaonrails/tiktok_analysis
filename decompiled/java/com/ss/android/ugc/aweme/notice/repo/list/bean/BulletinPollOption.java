package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.C618700OOm;
import X.InterfaceC618710OOn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollOption implements InterfaceC618710OOn {

    @C09CT("content")
    public final String content;

    @C09CT("is_voted")
    public final Boolean isVoted;

    @C09CT("option_id")
    public final Long optionId;

    @C09CT("voted_count")
    public final Long voteCount;

    @C09CT("voted_users")
    public final List<User> votedUserList;

    public BulletinPollOption() {
        this(0L, "", 0L, Boolean.FALSE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinPollOption)) {
            return false;
        }
        BulletinPollOption bulletinPollOption = (BulletinPollOption) obj;
        return Intrinsics.LJFF(this.optionId, bulletinPollOption.optionId) && Intrinsics.LJFF(this.content, bulletinPollOption.content) && Intrinsics.LJFF(this.voteCount, bulletinPollOption.voteCount) && Intrinsics.LJFF(this.isVoted, bulletinPollOption.isVoted) && Intrinsics.LJFF(this.votedUserList, bulletinPollOption.votedUserList);
    }

    public final int hashCode() {
        Long l = this.optionId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.voteCount;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.isVoted;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<User> list = this.votedUserList;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollOption(optionId=");
        sbLIZ.append(this.optionId);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", voteCount=");
        sbLIZ.append(this.voteCount);
        sbLIZ.append(", isVoted=");
        sbLIZ.append(this.isVoted);
        sbLIZ.append(", votedUserList=");
        sbLIZ.append(this.votedUserList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZIZ() {
        Long l = this.voteCount;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC618710OOn
    public final boolean isSame(Object obj) {
        if (!(obj instanceof BulletinPollOption)) {
            return false;
        }
        BulletinPollOption bulletinPollOption = (BulletinPollOption) obj;
        if (!Intrinsics.LJFF(this.optionId, bulletinPollOption.optionId) || !Intrinsics.LJFF(this.content, bulletinPollOption.content) || !Intrinsics.LJFF(this.voteCount, bulletinPollOption.voteCount) || !Intrinsics.LJFF(this.isVoted, bulletinPollOption.isVoted) || !C618700OOm.LIZ(this.votedUserList, bulletinPollOption.votedUserList)) {
            return false;
        }
        return true;
    }

    public static BulletinPollOption LIZ(BulletinPollOption bulletinPollOption, Long l, Boolean bool, List list) {
        return new BulletinPollOption(bulletinPollOption.optionId, bulletinPollOption.content, l, bool, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinPollOption(Long l, String str, Long l2, Boolean bool, List<? extends User> list) {
        this.optionId = l;
        this.content = str;
        this.voteCount = l2;
        this.isVoted = bool;
        this.votedUserList = list;
    }
}
