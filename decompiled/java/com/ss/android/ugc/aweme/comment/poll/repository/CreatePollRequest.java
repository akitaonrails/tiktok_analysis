package com.ss.android.ugc.aweme.comment.poll.repository;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreatePollRequest {

    @C09CT("expire_time")
    public final Long expireTime;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("poll_option_list")
    public final List<PollOption> pollOptionList;

    @C09CT("title")
    public final String title;

    public CreatePollRequest() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePollRequest)) {
            return false;
        }
        CreatePollRequest createPollRequest = (CreatePollRequest) obj;
        return Intrinsics.LJFF(this.itemId, createPollRequest.itemId) && Intrinsics.LJFF(this.title, createPollRequest.title) && Intrinsics.LJFF(this.pollOptionList, createPollRequest.pollOptionList) && Intrinsics.LJFF(this.expireTime, createPollRequest.expireTime);
    }

    public final int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PollOption> list = this.pollOptionList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.expireTime;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatePollRequest(itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", pollOptionList=");
        sbLIZ.append(this.pollOptionList);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreatePollRequest(String str, String str2, List<PollOption> list, Long l) {
        this.itemId = str;
        this.title = str2;
        this.pollOptionList = list;
        this.expireTime = l;
    }
}
