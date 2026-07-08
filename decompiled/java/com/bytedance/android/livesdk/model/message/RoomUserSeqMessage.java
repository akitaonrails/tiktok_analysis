package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomUserSeqMessage extends AbstractC1136060ffY {

    @C09CT("anonymous")
    public Long anonymous;

    @C09CT("ranks")
    public List<Contributor> mContributors;

    @C09CT("popularity")
    public long mPopularity;

    @C09CT("total")
    public long mTotal;

    @C09CT("pop_str")
    public String popStr;

    @C09CT("seats")
    public List<Contributor> seats;

    @C09CT("total_user")
    public Long totalUser;

    public RoomUserSeqMessage() {
        this.type = C001A.USER_SEQ;
    }
}
