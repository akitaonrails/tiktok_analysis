package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class GetActivityInviteeDetailsResp {

    @C09CT("data")
    public GetActivityInviteeDetailsData data;

    public static final class GetActivityInviteeDetailsData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("invitee_details")
        public List<InviteeDetail> inviteeDetails = new ArrayList();

        @C09CT("next_score")
        public long nextScore;

        @C09CT("total_detail_number")
        public long totalDetailNumber;

        @C09CT("total_invitee_number")
        public long totalInviteeNumber;
    }
}
