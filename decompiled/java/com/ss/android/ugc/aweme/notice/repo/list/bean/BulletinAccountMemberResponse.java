package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinAccountMemberResponse {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("viewer_identity_type")
    public final int identity;

    @C09CT("member_list")
    public final List<BulletinMemberActionUser> memberList;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("total")
    public final long total;

    public BulletinAccountMemberResponse() {
        this(-1, "", null, 0L, "", false, 0);
    }

    public BulletinAccountMemberResponse(int i, String str, List<BulletinMemberActionUser> list, long j, String str2, boolean z, int i2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.memberList = list;
        this.total = j;
        this.nextCursor = str2;
        this.hasMore = z;
        this.identity = i2;
    }
}
