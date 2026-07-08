package com.ss.android.ugc.aweme.plugin.journey;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FollowStatus {

    @C09CT("1")
    public static final FollowStatus FOLLOWING_STATUS;

    @C09CT("2")
    public static final FollowStatus FOLLOW_EACH_OTHER_STATUS;

    @C09CT("-1")
    public static final FollowStatus FOLLOW_RELATION_UNKNOWN;

    @C09CT("4")
    public static final FollowStatus FOLLOW_REQUESTED_STATUS;
    public static final /* synthetic */ FollowStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final FollowStatus NO_RELATION_STATUS;
    public final int LL;

    public static InterfaceC2044707zh<FollowStatus> getEntries() {
        return LLILLL;
    }

    static {
        FollowStatus followStatus = new FollowStatus("FOLLOW_RELATION_UNKNOWN", 0, -1);
        FOLLOW_RELATION_UNKNOWN = followStatus;
        FollowStatus followStatus2 = new FollowStatus("NO_RELATION_STATUS", 1, 0);
        NO_RELATION_STATUS = followStatus2;
        FollowStatus followStatus3 = new FollowStatus("FOLLOWING_STATUS", 2, 1);
        FOLLOWING_STATUS = followStatus3;
        FollowStatus followStatus4 = new FollowStatus("FOLLOW_EACH_OTHER_STATUS", 3, 2);
        FOLLOW_EACH_OTHER_STATUS = followStatus4;
        FollowStatus followStatus5 = new FollowStatus("FOLLOW_REQUESTED_STATUS", 4, 4);
        FOLLOW_REQUESTED_STATUS = followStatus5;
        FollowStatus[] followStatusArr = {followStatus, followStatus2, followStatus3, followStatus4, followStatus5};
        LLILLJJLI = followStatusArr;
        LLILLL = new C2254308sP(followStatusArr);
    }

    public static FollowStatus[] values() {
        return (FollowStatus[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static FollowStatus valueOf(String str) {
        return (FollowStatus) C08FF.LIZ(FollowStatus.class, str);
    }

    public FollowStatus(String str, int i, int i2) {
        this.LL = i2;
    }
}
