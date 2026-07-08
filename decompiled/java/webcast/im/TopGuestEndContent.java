package webcast.im;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TopGuestEndContent {

    @C09CT("end_reason")
    public long endReason;

    @C09CT("end_time")
    public long endTime;

    @C09CT("top_guest_user_info")
    public List<TopGuestUserInfo> topGuestUserInfo = new ArrayList();
}
