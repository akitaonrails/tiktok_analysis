package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollVoteDetailResponse extends BaseResponse {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("selected_option_id")
    public final Long optionId;

    @C09CT("options")
    public final List<BulletinPollOption> options;

    @C09CT("total")
    public final Long total;

    @C09CT("total_voted_count")
    public final long totalVoteCount;

    @C09CT("voted_user_list")
    public final List<User> userList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinPollVoteDetailResponse)) {
            return false;
        }
        BulletinPollVoteDetailResponse bulletinPollVoteDetailResponse = (BulletinPollVoteDetailResponse) obj;
        return Intrinsics.LJFF(this.options, bulletinPollVoteDetailResponse.options) && Intrinsics.LJFF(this.total, bulletinPollVoteDetailResponse.total) && Intrinsics.LJFF(this.nextCursor, bulletinPollVoteDetailResponse.nextCursor) && Intrinsics.LJFF(this.hasMore, bulletinPollVoteDetailResponse.hasMore) && Intrinsics.LJFF(this.optionId, bulletinPollVoteDetailResponse.optionId) && Intrinsics.LJFF(this.userList, bulletinPollVoteDetailResponse.userList) && this.totalVoteCount == bulletinPollVoteDetailResponse.totalVoteCount;
    }

    public final int hashCode() {
        List<BulletinPollOption> list = this.options;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.total;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.nextCursor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.optionId;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<User> list2 = this.userList;
        return ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.totalVoteCount);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollVoteDetailResponse(options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", optionId=");
        sbLIZ.append(this.optionId);
        sbLIZ.append(", userList=");
        sbLIZ.append(this.userList);
        sbLIZ.append(", totalVoteCount=");
        sbLIZ.append(this.totalVoteCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinPollVoteDetailResponse(List<BulletinPollOption> list, Long l, String str, Boolean bool, Long l2, List<? extends User> list2, long j) {
        this.options = list;
        this.total = l;
        this.nextCursor = str;
        this.hasMore = bool;
        this.optionId = l2;
        this.userList = list2;
        this.totalVoteCount = j;
    }
}
